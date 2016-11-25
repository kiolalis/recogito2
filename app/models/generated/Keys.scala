/**
 * This class is generated by jOOQ
 */
package models.generated


import java.lang.Integer

import javax.annotation.Generated

import models.generated.tables.Document
import models.generated.tables.DocumentFilepart
import models.generated.tables.Folder
import models.generated.tables.FolderAssociation
import models.generated.tables.SharingPolicy
import models.generated.tables.Upload
import models.generated.tables.UploadFilepart
import models.generated.tables.User
import models.generated.tables.UserRole
import models.generated.tables.records.DocumentFilepartRecord
import models.generated.tables.records.DocumentRecord
import models.generated.tables.records.FolderAssociationRecord
import models.generated.tables.records.FolderRecord
import models.generated.tables.records.SharingPolicyRecord
import models.generated.tables.records.UploadFilepartRecord
import models.generated.tables.records.UploadRecord
import models.generated.tables.records.UserRecord
import models.generated.tables.records.UserRoleRecord

import org.jooq.ForeignKey
import org.jooq.Identity
import org.jooq.UniqueKey
import org.jooq.impl.AbstractKeys


/**
 * A class modelling foreign key relationships between tables of the <code>public</code> 
 * schema
 */
@Generated(
	value = Array(
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	),
	comments = "This class is generated by jOOQ"
)
object Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------

	val IDENTITY_FOLDER = Identities0.IDENTITY_FOLDER
	val IDENTITY_SHARING_POLICY = Identities0.IDENTITY_SHARING_POLICY
	val IDENTITY_UPLOAD = Identities0.IDENTITY_UPLOAD
	val IDENTITY_USER_ROLE = Identities0.IDENTITY_USER_ROLE

	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	val DOCUMENT_PKEY = UniqueKeys0.DOCUMENT_PKEY
	val DOCUMENT_FILEPART_PKEY = UniqueKeys0.DOCUMENT_FILEPART_PKEY
	val FOLDER_PKEY = UniqueKeys0.FOLDER_PKEY
	val SHARING_POLICY_PKEY = UniqueKeys0.SHARING_POLICY_PKEY
	val SHARING_POLICY_DOCUMENT_ID_SHARED_WITH_KEY = UniqueKeys0.SHARING_POLICY_DOCUMENT_ID_SHARED_WITH_KEY
	val UPLOAD_PKEY = UniqueKeys0.UPLOAD_PKEY
	val UPLOAD_OWNER_KEY = UniqueKeys0.UPLOAD_OWNER_KEY
	val UPLOAD_FILEPART_PKEY = UniqueKeys0.UPLOAD_FILEPART_PKEY
	val UPLOAD_FILEPART_OWNER_TITLE_KEY = UniqueKeys0.UPLOAD_FILEPART_OWNER_TITLE_KEY
	val USER_PKEY = UniqueKeys0.USER_PKEY
	val USER_EMAIL_KEY = UniqueKeys0.USER_EMAIL_KEY
	val USER_ROLE_PKEY = UniqueKeys0.USER_ROLE_PKEY

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------

	val DOCUMENT__DOCUMENT_OWNER_FKEY = ForeignKeys0.DOCUMENT__DOCUMENT_OWNER_FKEY
	val DOCUMENT_FILEPART__DOCUMENT_FILEPART_DOCUMENT_ID_FKEY = ForeignKeys0.DOCUMENT_FILEPART__DOCUMENT_FILEPART_DOCUMENT_ID_FKEY
	val FOLDER__FOLDER_OWNER_FKEY = ForeignKeys0.FOLDER__FOLDER_OWNER_FKEY
	val FOLDER__FOLDER_PARENT_FKEY = ForeignKeys0.FOLDER__FOLDER_PARENT_FKEY
	val FOLDER_ASSOCIATION__FOLDER_ASSOCIATION_FOLDER_ID_FKEY = ForeignKeys0.FOLDER_ASSOCIATION__FOLDER_ASSOCIATION_FOLDER_ID_FKEY
	val FOLDER_ASSOCIATION__FOLDER_ASSOCIATION_DOCUMENT_ID_FKEY = ForeignKeys0.FOLDER_ASSOCIATION__FOLDER_ASSOCIATION_DOCUMENT_ID_FKEY
	val SHARING_POLICY__SHARING_POLICY_FOLDER_ID_FKEY = ForeignKeys0.SHARING_POLICY__SHARING_POLICY_FOLDER_ID_FKEY
	val SHARING_POLICY__SHARING_POLICY_DOCUMENT_ID_FKEY = ForeignKeys0.SHARING_POLICY__SHARING_POLICY_DOCUMENT_ID_FKEY
	val SHARING_POLICY__SHARING_POLICY_SHARED_BY_FKEY = ForeignKeys0.SHARING_POLICY__SHARING_POLICY_SHARED_BY_FKEY
	val SHARING_POLICY__SHARING_POLICY_SHARED_WITH_FKEY = ForeignKeys0.SHARING_POLICY__SHARING_POLICY_SHARED_WITH_FKEY
	val UPLOAD__UPLOAD_OWNER_FKEY = ForeignKeys0.UPLOAD__UPLOAD_OWNER_FKEY
	val UPLOAD_FILEPART__UPLOAD_FILEPART_UPLOAD_ID_FKEY = ForeignKeys0.UPLOAD_FILEPART__UPLOAD_FILEPART_UPLOAD_ID_FKEY
	val UPLOAD_FILEPART__UPLOAD_FILEPART_OWNER_FKEY = ForeignKeys0.UPLOAD_FILEPART__UPLOAD_FILEPART_OWNER_FKEY
	val USER_ROLE__USER_ROLE_USERNAME_FKEY = ForeignKeys0.USER_ROLE__USER_ROLE_USERNAME_FKEY

	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private object Identities0 extends AbstractKeys {
		val IDENTITY_FOLDER : Identity[FolderRecord, Integer] = AbstractKeys.createIdentity(Folder.FOLDER, Folder.FOLDER.ID)
		val IDENTITY_SHARING_POLICY : Identity[SharingPolicyRecord, Integer] = AbstractKeys.createIdentity(SharingPolicy.SHARING_POLICY, SharingPolicy.SHARING_POLICY.ID)
		val IDENTITY_UPLOAD : Identity[UploadRecord, Integer] = AbstractKeys.createIdentity(Upload.UPLOAD, Upload.UPLOAD.ID)
		val IDENTITY_USER_ROLE : Identity[UserRoleRecord, Integer] = AbstractKeys.createIdentity(UserRole.USER_ROLE, UserRole.USER_ROLE.ID)
	}

	private object UniqueKeys0 extends AbstractKeys {
		val DOCUMENT_PKEY : UniqueKey[DocumentRecord] = AbstractKeys.createUniqueKey(Document.DOCUMENT, Document.DOCUMENT.ID)
		val DOCUMENT_FILEPART_PKEY : UniqueKey[DocumentFilepartRecord] = AbstractKeys.createUniqueKey(DocumentFilepart.DOCUMENT_FILEPART, DocumentFilepart.DOCUMENT_FILEPART.ID)
		val FOLDER_PKEY : UniqueKey[FolderRecord] = AbstractKeys.createUniqueKey(Folder.FOLDER, Folder.FOLDER.ID)
		val SHARING_POLICY_PKEY : UniqueKey[SharingPolicyRecord] = AbstractKeys.createUniqueKey(SharingPolicy.SHARING_POLICY, SharingPolicy.SHARING_POLICY.ID)
		val SHARING_POLICY_DOCUMENT_ID_SHARED_WITH_KEY : UniqueKey[SharingPolicyRecord] = AbstractKeys.createUniqueKey(SharingPolicy.SHARING_POLICY, SharingPolicy.SHARING_POLICY.DOCUMENT_ID, SharingPolicy.SHARING_POLICY.SHARED_WITH)
		val UPLOAD_PKEY : UniqueKey[UploadRecord] = AbstractKeys.createUniqueKey(Upload.UPLOAD, Upload.UPLOAD.ID)
		val UPLOAD_OWNER_KEY : UniqueKey[UploadRecord] = AbstractKeys.createUniqueKey(Upload.UPLOAD, Upload.UPLOAD.OWNER)
		val UPLOAD_FILEPART_PKEY : UniqueKey[UploadFilepartRecord] = AbstractKeys.createUniqueKey(UploadFilepart.UPLOAD_FILEPART, UploadFilepart.UPLOAD_FILEPART.ID)
		val UPLOAD_FILEPART_OWNER_TITLE_KEY : UniqueKey[UploadFilepartRecord] = AbstractKeys.createUniqueKey(UploadFilepart.UPLOAD_FILEPART, UploadFilepart.UPLOAD_FILEPART.OWNER, UploadFilepart.UPLOAD_FILEPART.TITLE)
		val USER_PKEY : UniqueKey[UserRecord] = AbstractKeys.createUniqueKey(User.USER, User.USER.USERNAME)
		val USER_EMAIL_KEY : UniqueKey[UserRecord] = AbstractKeys.createUniqueKey(User.USER, User.USER.EMAIL)
		val USER_ROLE_PKEY : UniqueKey[UserRoleRecord] = AbstractKeys.createUniqueKey(UserRole.USER_ROLE, UserRole.USER_ROLE.ID)
	}

	private object ForeignKeys0 extends AbstractKeys {
		val DOCUMENT__DOCUMENT_OWNER_FKEY : ForeignKey[DocumentRecord, UserRecord] = AbstractKeys.createForeignKey(models.generated.Keys.USER_PKEY, Document.DOCUMENT, Document.DOCUMENT.OWNER)
		val DOCUMENT_FILEPART__DOCUMENT_FILEPART_DOCUMENT_ID_FKEY : ForeignKey[DocumentFilepartRecord, DocumentRecord] = AbstractKeys.createForeignKey(models.generated.Keys.DOCUMENT_PKEY, DocumentFilepart.DOCUMENT_FILEPART, DocumentFilepart.DOCUMENT_FILEPART.DOCUMENT_ID)
		val FOLDER__FOLDER_OWNER_FKEY : ForeignKey[FolderRecord, UserRecord] = AbstractKeys.createForeignKey(models.generated.Keys.USER_PKEY, Folder.FOLDER, Folder.FOLDER.OWNER)
		val FOLDER__FOLDER_PARENT_FKEY : ForeignKey[FolderRecord, FolderRecord] = AbstractKeys.createForeignKey(models.generated.Keys.FOLDER_PKEY, Folder.FOLDER, Folder.FOLDER.PARENT)
		val FOLDER_ASSOCIATION__FOLDER_ASSOCIATION_FOLDER_ID_FKEY : ForeignKey[FolderAssociationRecord, FolderRecord] = AbstractKeys.createForeignKey(models.generated.Keys.FOLDER_PKEY, FolderAssociation.FOLDER_ASSOCIATION, FolderAssociation.FOLDER_ASSOCIATION.FOLDER_ID)
		val FOLDER_ASSOCIATION__FOLDER_ASSOCIATION_DOCUMENT_ID_FKEY : ForeignKey[FolderAssociationRecord, DocumentRecord] = AbstractKeys.createForeignKey(models.generated.Keys.DOCUMENT_PKEY, FolderAssociation.FOLDER_ASSOCIATION, FolderAssociation.FOLDER_ASSOCIATION.DOCUMENT_ID)
		val SHARING_POLICY__SHARING_POLICY_FOLDER_ID_FKEY : ForeignKey[SharingPolicyRecord, FolderRecord] = AbstractKeys.createForeignKey(models.generated.Keys.FOLDER_PKEY, SharingPolicy.SHARING_POLICY, SharingPolicy.SHARING_POLICY.FOLDER_ID)
		val SHARING_POLICY__SHARING_POLICY_DOCUMENT_ID_FKEY : ForeignKey[SharingPolicyRecord, DocumentRecord] = AbstractKeys.createForeignKey(models.generated.Keys.DOCUMENT_PKEY, SharingPolicy.SHARING_POLICY, SharingPolicy.SHARING_POLICY.DOCUMENT_ID)
		val SHARING_POLICY__SHARING_POLICY_SHARED_BY_FKEY : ForeignKey[SharingPolicyRecord, UserRecord] = AbstractKeys.createForeignKey(models.generated.Keys.USER_PKEY, SharingPolicy.SHARING_POLICY, SharingPolicy.SHARING_POLICY.SHARED_BY)
		val SHARING_POLICY__SHARING_POLICY_SHARED_WITH_FKEY : ForeignKey[SharingPolicyRecord, UserRecord] = AbstractKeys.createForeignKey(models.generated.Keys.USER_PKEY, SharingPolicy.SHARING_POLICY, SharingPolicy.SHARING_POLICY.SHARED_WITH)
		val UPLOAD__UPLOAD_OWNER_FKEY : ForeignKey[UploadRecord, UserRecord] = AbstractKeys.createForeignKey(models.generated.Keys.USER_PKEY, Upload.UPLOAD, Upload.UPLOAD.OWNER)
		val UPLOAD_FILEPART__UPLOAD_FILEPART_UPLOAD_ID_FKEY : ForeignKey[UploadFilepartRecord, UploadRecord] = AbstractKeys.createForeignKey(models.generated.Keys.UPLOAD_PKEY, UploadFilepart.UPLOAD_FILEPART, UploadFilepart.UPLOAD_FILEPART.UPLOAD_ID)
		val UPLOAD_FILEPART__UPLOAD_FILEPART_OWNER_FKEY : ForeignKey[UploadFilepartRecord, UserRecord] = AbstractKeys.createForeignKey(models.generated.Keys.USER_PKEY, UploadFilepart.UPLOAD_FILEPART, UploadFilepart.UPLOAD_FILEPART.OWNER)
		val USER_ROLE__USER_ROLE_USERNAME_FKEY : ForeignKey[UserRoleRecord, UserRecord] = AbstractKeys.createForeignKey(models.generated.Keys.USER_PKEY, UserRole.USER_ROLE, UserRole.USER_ROLE.USERNAME)
	}
}
