package controllers.admin.maintenance

import com.mohiva.play.silhouette.api.Silhouette
import controllers.{BaseAuthController, Security, HasPrettyPrintJSON}
import javax.inject.{Inject, Singleton}
import org.joda.time.DateTime
import org.webjars.play.WebJarsUtil
import play.api.Configuration
import play.api.mvc.ControllerComponents
import play.api.libs.json._
import play.api.libs.functional.syntax._
import scala.concurrent.ExecutionContext
import services.announcement.AnnouncementService
import services.document.DocumentService
import services.generated.tables.records.UploadRecord
import services.upload.UploadService
import services.user.UserService
import services.user.Roles._
import services.HasDate

@Singleton
class MaintenanceController @Inject()(
  val announcements: AnnouncementService,
  val components: ControllerComponents, 
  val config: Configuration,
  val documents: DocumentService,
  val silhouette: Silhouette[Security.Env],
  val uploads: UploadService,
  val users: UserService,
  implicit val ctx: ExecutionContext,
  implicit val webJarsUtil: WebJarsUtil
) extends BaseAuthController(components, config, documents, users) with HasPrettyPrintJSON with HasDate {

  implicit val uploadRecordWrites: Writes[UploadRecord] = (
    (JsPath \ "owner").write[String] and
    (JsPath \ "title").write[String] and
    (JsPath \ "created_at").write[DateTime]
  )(upload => (
    upload.getOwner,
    upload.getTitle,
    new DateTime(upload.getCreatedAt)
  ))
  
  def index = silhouette.SecuredAction(Security.WithRole(Admin)).async { implicit request =>
    uploads.listPendingUploads().map { uploads =>
      Ok(views.html.admin.maintenance.index(uploads))
    }
  }

  def listPendingUploads = silhouette.SecuredAction(Security.WithRole(Admin)).async { implicit request => 
    uploads.listPendingUploads().map { uploads =>
      jsonOk(Json.toJson(uploads))
    }
  }
  
  def deletePending(id: Int) = silhouette.SecuredAction(Security.WithRole(Admin)) { implicit request =>
    Ok
  }
  
  def deleteAllPending = silhouette.SecuredAction(Security.WithRole(Admin)).async { implicit request =>
    uploads.deleteAllPendingUploads().map(_ => Ok)
  }
  
  def insertBroadcast = silhouette.SecuredAction(Security.WithRole(Admin)).async { implicit request =>
    announcements.insertBroadcastAnnouncement(
    """# Welcome to your new workspace!

We are happy to announce the launch of Recogito's __new document workspace__.

This update brings more than just a fresh look. It adds a number of new features and enhancements, and makes room for further extensions we have planned for the new year. 

Learn more about all that's new [in the help section](/help/workspace).
    """).map(_ => Ok)
  }
  
  def deleteAllServiceAnnouncements = silhouette.SecuredAction(Security.WithRole(Admin)).async { implicit request =>
    announcements.clearAll().map { success =>
      if (success) Ok
      else InternalServerError
    }
  }
  
}