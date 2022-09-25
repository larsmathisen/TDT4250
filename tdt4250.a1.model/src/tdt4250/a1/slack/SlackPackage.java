/**
 */
package tdt4250.a1.slack;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tdt4250.a1.slack.SlackFactory
 * @model kind="package"
 * @generated
 */
public interface SlackPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "slack";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "slack";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "slack";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SlackPackage eINSTANCE = tdt4250.a1.slack.impl.SlackPackageImpl.init();

	/**
	 * The meta object id for the '{@link tdt4250.a1.slack.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.a1.slack.impl.UserImpl
	 * @see tdt4250.a1.slack.impl.SlackPackageImpl#getUser()
	 * @generated
	 */
	int USER = 0;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USERNAME = 0;

	/**
	 * The feature id for the '<em><b>Posts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__POSTS = 1;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__GROUPS = 2;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.a1.slack.impl.PostImpl <em>Post</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.a1.slack.impl.PostImpl
	 * @see tdt4250.a1.slack.impl.SlackPackageImpl#getPost()
	 * @generated
	 */
	int POST = 1;

	/**
	 * The feature id for the '<em><b>Thread</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__THREAD = 0;

	/**
	 * The feature id for the '<em><b>Author</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__AUTHOR = 1;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__CONTENTS = 2;

	/**
	 * The feature id for the '<em><b>Reply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__REPLY = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST__ID = 4;

	/**
	 * The number of structural features of the '<em>Post</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Post</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.a1.slack.impl.ChannelImpl <em>Channel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.a1.slack.impl.ChannelImpl
	 * @see tdt4250.a1.slack.impl.SlackPackageImpl#getChannel()
	 * @generated
	 */
	int CHANNEL = 2;

	/**
	 * The feature id for the '<em><b>Threads</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__THREADS = 0;

	/**
	 * The feature id for the '<em><b>Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__MEMBERS = 1;

	/**
	 * The feature id for the '<em><b>Usergroup</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__USERGROUP = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__NAME = 3;

	/**
	 * The number of structural features of the '<em>Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.a1.slack.impl.DirectMessageImpl <em>Direct Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.a1.slack.impl.DirectMessageImpl
	 * @see tdt4250.a1.slack.impl.SlackPackageImpl#getDirectMessage()
	 * @generated
	 */
	int DIRECT_MESSAGE = 3;

	/**
	 * The feature id for the '<em><b>Threads</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MESSAGE__THREADS = CHANNEL__THREADS;

	/**
	 * The feature id for the '<em><b>Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MESSAGE__MEMBERS = CHANNEL__MEMBERS;

	/**
	 * The feature id for the '<em><b>Usergroup</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MESSAGE__USERGROUP = CHANNEL__USERGROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MESSAGE__NAME = CHANNEL__NAME;

	/**
	 * The number of structural features of the '<em>Direct Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MESSAGE_FEATURE_COUNT = CHANNEL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Direct Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECT_MESSAGE_OPERATION_COUNT = CHANNEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tdt4250.a1.slack.impl.ThreadImpl <em>Thread</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.a1.slack.impl.ThreadImpl
	 * @see tdt4250.a1.slack.impl.SlackPackageImpl#getThread()
	 * @generated
	 */
	int THREAD = 4;

	/**
	 * The feature id for the '<em><b>Posts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__POSTS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD__ID = 1;

	/**
	 * The number of structural features of the '<em>Thread</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Thread</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.a1.slack.impl.AbstractContentImpl <em>Abstract Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.a1.slack.impl.AbstractContentImpl
	 * @see tdt4250.a1.slack.impl.SlackPackageImpl#getAbstractContent()
	 * @generated
	 */
	int ABSTRACT_CONTENT = 5;

	/**
	 * The number of structural features of the '<em>Abstract Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.a1.slack.impl.TextContentImpl <em>Text Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.a1.slack.impl.TextContentImpl
	 * @see tdt4250.a1.slack.impl.SlackPackageImpl#getTextContent()
	 * @generated
	 */
	int TEXT_CONTENT = 6;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT__TEXT = ABSTRACT_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT_FEATURE_COUNT = ABSTRACT_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT_OPERATION_COUNT = ABSTRACT_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tdt4250.a1.slack.impl.ImageContentImpl <em>Image Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.a1.slack.impl.ImageContentImpl
	 * @see tdt4250.a1.slack.impl.SlackPackageImpl#getImageContent()
	 * @generated
	 */
	int IMAGE_CONTENT = 7;

	/**
	 * The feature id for the '<em><b>Img Link</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CONTENT__IMG_LINK = ABSTRACT_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Image Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CONTENT_FEATURE_COUNT = ABSTRACT_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Image Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_CONTENT_OPERATION_COUNT = ABSTRACT_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tdt4250.a1.slack.impl.AttachmentContentImpl <em>Attachment Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.a1.slack.impl.AttachmentContentImpl
	 * @see tdt4250.a1.slack.impl.SlackPackageImpl#getAttachmentContent()
	 * @generated
	 */
	int ATTACHMENT_CONTENT = 8;

	/**
	 * The feature id for the '<em><b>Attachment Link</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CONTENT__ATTACHMENT_LINK = ABSTRACT_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attachment Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CONTENT_FEATURE_COUNT = ABSTRACT_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Attachment Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_CONTENT_OPERATION_COUNT = ABSTRACT_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tdt4250.a1.slack.impl.WorkspaceImpl <em>Workspace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.a1.slack.impl.WorkspaceImpl
	 * @see tdt4250.a1.slack.impl.SlackPackageImpl#getWorkspace()
	 * @generated
	 */
	int WORKSPACE = 9;

	/**
	 * The feature id for the '<em><b>Channels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE__CHANNELS = 0;

	/**
	 * The feature id for the '<em><b>Users</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE__USERS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE__GROUPS = 3;

	/**
	 * The number of structural features of the '<em>Workspace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Workspace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tdt4250.a1.slack.impl.UserGroupImpl <em>User Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tdt4250.a1.slack.impl.UserGroupImpl
	 * @see tdt4250.a1.slack.impl.SlackPackageImpl#getUserGroup()
	 * @generated
	 */
	int USER_GROUP = 10;

	/**
	 * The feature id for the '<em><b>Users</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_GROUP__USERS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_GROUP__NAME = 1;

	/**
	 * The number of structural features of the '<em>User Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_GROUP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>User Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_GROUP_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link tdt4250.a1.slack.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see tdt4250.a1.slack.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.a1.slack.User#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see tdt4250.a1.slack.User#getUsername()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Username();

	/**
	 * Returns the meta object for the reference list '{@link tdt4250.a1.slack.User#getPosts <em>Posts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Posts</em>'.
	 * @see tdt4250.a1.slack.User#getPosts()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Posts();

	/**
	 * Returns the meta object for the reference list '{@link tdt4250.a1.slack.User#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Groups</em>'.
	 * @see tdt4250.a1.slack.User#getGroups()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Groups();

	/**
	 * Returns the meta object for class '{@link tdt4250.a1.slack.Post <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post</em>'.
	 * @see tdt4250.a1.slack.Post
	 * @generated
	 */
	EClass getPost();

	/**
	 * Returns the meta object for the container reference '{@link tdt4250.a1.slack.Post#getThread <em>Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Thread</em>'.
	 * @see tdt4250.a1.slack.Post#getThread()
	 * @see #getPost()
	 * @generated
	 */
	EReference getPost_Thread();

	/**
	 * Returns the meta object for the reference '{@link tdt4250.a1.slack.Post#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Author</em>'.
	 * @see tdt4250.a1.slack.Post#getAuthor()
	 * @see #getPost()
	 * @generated
	 */
	EReference getPost_Author();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.a1.slack.Post#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see tdt4250.a1.slack.Post#getContents()
	 * @see #getPost()
	 * @generated
	 */
	EReference getPost_Contents();

	/**
	 * Returns the meta object for the reference '{@link tdt4250.a1.slack.Post#getReply <em>Reply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reply</em>'.
	 * @see tdt4250.a1.slack.Post#getReply()
	 * @see #getPost()
	 * @generated
	 */
	EReference getPost_Reply();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.a1.slack.Post#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tdt4250.a1.slack.Post#getId()
	 * @see #getPost()
	 * @generated
	 */
	EAttribute getPost_Id();

	/**
	 * Returns the meta object for class '{@link tdt4250.a1.slack.Channel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channel</em>'.
	 * @see tdt4250.a1.slack.Channel
	 * @generated
	 */
	EClass getChannel();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.a1.slack.Channel#getThreads <em>Threads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Threads</em>'.
	 * @see tdt4250.a1.slack.Channel#getThreads()
	 * @see #getChannel()
	 * @generated
	 */
	EReference getChannel_Threads();

	/**
	 * Returns the meta object for the reference list '{@link tdt4250.a1.slack.Channel#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Members</em>'.
	 * @see tdt4250.a1.slack.Channel#getMembers()
	 * @see #getChannel()
	 * @generated
	 */
	EReference getChannel_Members();

	/**
	 * Returns the meta object for the reference list '{@link tdt4250.a1.slack.Channel#getUsergroup <em>Usergroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Usergroup</em>'.
	 * @see tdt4250.a1.slack.Channel#getUsergroup()
	 * @see #getChannel()
	 * @generated
	 */
	EReference getChannel_Usergroup();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.a1.slack.Channel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tdt4250.a1.slack.Channel#getName()
	 * @see #getChannel()
	 * @generated
	 */
	EAttribute getChannel_Name();

	/**
	 * Returns the meta object for class '{@link tdt4250.a1.slack.DirectMessage <em>Direct Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Direct Message</em>'.
	 * @see tdt4250.a1.slack.DirectMessage
	 * @generated
	 */
	EClass getDirectMessage();

	/**
	 * Returns the meta object for class '{@link tdt4250.a1.slack.Thread <em>Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thread</em>'.
	 * @see tdt4250.a1.slack.Thread
	 * @generated
	 */
	EClass getThread();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.a1.slack.Thread#getPosts <em>Posts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Posts</em>'.
	 * @see tdt4250.a1.slack.Thread#getPosts()
	 * @see #getThread()
	 * @generated
	 */
	EReference getThread_Posts();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.a1.slack.Thread#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see tdt4250.a1.slack.Thread#getId()
	 * @see #getThread()
	 * @generated
	 */
	EAttribute getThread_Id();

	/**
	 * Returns the meta object for class '{@link tdt4250.a1.slack.AbstractContent <em>Abstract Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Content</em>'.
	 * @see tdt4250.a1.slack.AbstractContent
	 * @generated
	 */
	EClass getAbstractContent();

	/**
	 * Returns the meta object for class '{@link tdt4250.a1.slack.TextContent <em>Text Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Content</em>'.
	 * @see tdt4250.a1.slack.TextContent
	 * @generated
	 */
	EClass getTextContent();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.a1.slack.TextContent#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see tdt4250.a1.slack.TextContent#getText()
	 * @see #getTextContent()
	 * @generated
	 */
	EAttribute getTextContent_Text();

	/**
	 * Returns the meta object for class '{@link tdt4250.a1.slack.ImageContent <em>Image Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Content</em>'.
	 * @see tdt4250.a1.slack.ImageContent
	 * @generated
	 */
	EClass getImageContent();

	/**
	 * Returns the meta object for the attribute list '{@link tdt4250.a1.slack.ImageContent#getImgLink <em>Img Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Img Link</em>'.
	 * @see tdt4250.a1.slack.ImageContent#getImgLink()
	 * @see #getImageContent()
	 * @generated
	 */
	EAttribute getImageContent_ImgLink();

	/**
	 * Returns the meta object for class '{@link tdt4250.a1.slack.AttachmentContent <em>Attachment Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment Content</em>'.
	 * @see tdt4250.a1.slack.AttachmentContent
	 * @generated
	 */
	EClass getAttachmentContent();

	/**
	 * Returns the meta object for the attribute list '{@link tdt4250.a1.slack.AttachmentContent#getAttachmentLink <em>Attachment Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Attachment Link</em>'.
	 * @see tdt4250.a1.slack.AttachmentContent#getAttachmentLink()
	 * @see #getAttachmentContent()
	 * @generated
	 */
	EAttribute getAttachmentContent_AttachmentLink();

	/**
	 * Returns the meta object for class '{@link tdt4250.a1.slack.Workspace <em>Workspace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workspace</em>'.
	 * @see tdt4250.a1.slack.Workspace
	 * @generated
	 */
	EClass getWorkspace();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.a1.slack.Workspace#getChannels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Channels</em>'.
	 * @see tdt4250.a1.slack.Workspace#getChannels()
	 * @see #getWorkspace()
	 * @generated
	 */
	EReference getWorkspace_Channels();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.a1.slack.Workspace#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Users</em>'.
	 * @see tdt4250.a1.slack.Workspace#getUsers()
	 * @see #getWorkspace()
	 * @generated
	 */
	EReference getWorkspace_Users();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.a1.slack.Workspace#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tdt4250.a1.slack.Workspace#getName()
	 * @see #getWorkspace()
	 * @generated
	 */
	EAttribute getWorkspace_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link tdt4250.a1.slack.Workspace#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see tdt4250.a1.slack.Workspace#getGroups()
	 * @see #getWorkspace()
	 * @generated
	 */
	EReference getWorkspace_Groups();

	/**
	 * Returns the meta object for class '{@link tdt4250.a1.slack.UserGroup <em>User Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Group</em>'.
	 * @see tdt4250.a1.slack.UserGroup
	 * @generated
	 */
	EClass getUserGroup();

	/**
	 * Returns the meta object for the reference list '{@link tdt4250.a1.slack.UserGroup#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Users</em>'.
	 * @see tdt4250.a1.slack.UserGroup#getUsers()
	 * @see #getUserGroup()
	 * @generated
	 */
	EReference getUserGroup_Users();

	/**
	 * Returns the meta object for the attribute '{@link tdt4250.a1.slack.UserGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see tdt4250.a1.slack.UserGroup#getName()
	 * @see #getUserGroup()
	 * @generated
	 */
	EAttribute getUserGroup_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SlackFactory getSlackFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tdt4250.a1.slack.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.a1.slack.impl.UserImpl
		 * @see tdt4250.a1.slack.impl.SlackPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__USERNAME = eINSTANCE.getUser_Username();

		/**
		 * The meta object literal for the '<em><b>Posts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__POSTS = eINSTANCE.getUser_Posts();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__GROUPS = eINSTANCE.getUser_Groups();

		/**
		 * The meta object literal for the '{@link tdt4250.a1.slack.impl.PostImpl <em>Post</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.a1.slack.impl.PostImpl
		 * @see tdt4250.a1.slack.impl.SlackPackageImpl#getPost()
		 * @generated
		 */
		EClass POST = eINSTANCE.getPost();

		/**
		 * The meta object literal for the '<em><b>Thread</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POST__THREAD = eINSTANCE.getPost_Thread();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POST__AUTHOR = eINSTANCE.getPost_Author();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POST__CONTENTS = eINSTANCE.getPost_Contents();

		/**
		 * The meta object literal for the '<em><b>Reply</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POST__REPLY = eINSTANCE.getPost_Reply();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POST__ID = eINSTANCE.getPost_Id();

		/**
		 * The meta object literal for the '{@link tdt4250.a1.slack.impl.ChannelImpl <em>Channel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.a1.slack.impl.ChannelImpl
		 * @see tdt4250.a1.slack.impl.SlackPackageImpl#getChannel()
		 * @generated
		 */
		EClass CHANNEL = eINSTANCE.getChannel();

		/**
		 * The meta object literal for the '<em><b>Threads</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL__THREADS = eINSTANCE.getChannel_Threads();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL__MEMBERS = eINSTANCE.getChannel_Members();

		/**
		 * The meta object literal for the '<em><b>Usergroup</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANNEL__USERGROUP = eINSTANCE.getChannel_Usergroup();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL__NAME = eINSTANCE.getChannel_Name();

		/**
		 * The meta object literal for the '{@link tdt4250.a1.slack.impl.DirectMessageImpl <em>Direct Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.a1.slack.impl.DirectMessageImpl
		 * @see tdt4250.a1.slack.impl.SlackPackageImpl#getDirectMessage()
		 * @generated
		 */
		EClass DIRECT_MESSAGE = eINSTANCE.getDirectMessage();

		/**
		 * The meta object literal for the '{@link tdt4250.a1.slack.impl.ThreadImpl <em>Thread</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.a1.slack.impl.ThreadImpl
		 * @see tdt4250.a1.slack.impl.SlackPackageImpl#getThread()
		 * @generated
		 */
		EClass THREAD = eINSTANCE.getThread();

		/**
		 * The meta object literal for the '<em><b>Posts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAD__POSTS = eINSTANCE.getThread_Posts();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAD__ID = eINSTANCE.getThread_Id();

		/**
		 * The meta object literal for the '{@link tdt4250.a1.slack.impl.AbstractContentImpl <em>Abstract Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.a1.slack.impl.AbstractContentImpl
		 * @see tdt4250.a1.slack.impl.SlackPackageImpl#getAbstractContent()
		 * @generated
		 */
		EClass ABSTRACT_CONTENT = eINSTANCE.getAbstractContent();

		/**
		 * The meta object literal for the '{@link tdt4250.a1.slack.impl.TextContentImpl <em>Text Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.a1.slack.impl.TextContentImpl
		 * @see tdt4250.a1.slack.impl.SlackPackageImpl#getTextContent()
		 * @generated
		 */
		EClass TEXT_CONTENT = eINSTANCE.getTextContent();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_CONTENT__TEXT = eINSTANCE.getTextContent_Text();

		/**
		 * The meta object literal for the '{@link tdt4250.a1.slack.impl.ImageContentImpl <em>Image Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.a1.slack.impl.ImageContentImpl
		 * @see tdt4250.a1.slack.impl.SlackPackageImpl#getImageContent()
		 * @generated
		 */
		EClass IMAGE_CONTENT = eINSTANCE.getImageContent();

		/**
		 * The meta object literal for the '<em><b>Img Link</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_CONTENT__IMG_LINK = eINSTANCE.getImageContent_ImgLink();

		/**
		 * The meta object literal for the '{@link tdt4250.a1.slack.impl.AttachmentContentImpl <em>Attachment Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.a1.slack.impl.AttachmentContentImpl
		 * @see tdt4250.a1.slack.impl.SlackPackageImpl#getAttachmentContent()
		 * @generated
		 */
		EClass ATTACHMENT_CONTENT = eINSTANCE.getAttachmentContent();

		/**
		 * The meta object literal for the '<em><b>Attachment Link</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACHMENT_CONTENT__ATTACHMENT_LINK = eINSTANCE.getAttachmentContent_AttachmentLink();

		/**
		 * The meta object literal for the '{@link tdt4250.a1.slack.impl.WorkspaceImpl <em>Workspace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.a1.slack.impl.WorkspaceImpl
		 * @see tdt4250.a1.slack.impl.SlackPackageImpl#getWorkspace()
		 * @generated
		 */
		EClass WORKSPACE = eINSTANCE.getWorkspace();

		/**
		 * The meta object literal for the '<em><b>Channels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKSPACE__CHANNELS = eINSTANCE.getWorkspace_Channels();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKSPACE__USERS = eINSTANCE.getWorkspace_Users();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKSPACE__NAME = eINSTANCE.getWorkspace_Name();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKSPACE__GROUPS = eINSTANCE.getWorkspace_Groups();

		/**
		 * The meta object literal for the '{@link tdt4250.a1.slack.impl.UserGroupImpl <em>User Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tdt4250.a1.slack.impl.UserGroupImpl
		 * @see tdt4250.a1.slack.impl.SlackPackageImpl#getUserGroup()
		 * @generated
		 */
		EClass USER_GROUP = eINSTANCE.getUserGroup();

		/**
		 * The meta object literal for the '<em><b>Users</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_GROUP__USERS = eINSTANCE.getUserGroup_Users();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_GROUP__NAME = eINSTANCE.getUserGroup_Name();

	}

} //SlackPackage
