/**
 */
package tdt4250.a1.slack.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tdt4250.a1.slack.AttachmentContent;
import tdt4250.a1.slack.Channel;
import tdt4250.a1.slack.DirectMessage;
import tdt4250.a1.slack.ImageContent;
import tdt4250.a1.slack.Post;
import tdt4250.a1.slack.SlackFactory;
import tdt4250.a1.slack.SlackPackage;
import tdt4250.a1.slack.TextContent;
import tdt4250.a1.slack.User;
import tdt4250.a1.slack.UserGroup;
import tdt4250.a1.slack.Workspace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SlackFactoryImpl extends EFactoryImpl implements SlackFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SlackFactory init() {
		try {
			SlackFactory theSlackFactory = (SlackFactory)EPackage.Registry.INSTANCE.getEFactory(SlackPackage.eNS_URI);
			if (theSlackFactory != null) {
				return theSlackFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SlackFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlackFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SlackPackage.USER: return createUser();
			case SlackPackage.POST: return createPost();
			case SlackPackage.CHANNEL: return createChannel();
			case SlackPackage.DIRECT_MESSAGE: return createDirectMessage();
			case SlackPackage.THREAD: return createThread();
			case SlackPackage.TEXT_CONTENT: return createTextContent();
			case SlackPackage.IMAGE_CONTENT: return createImageContent();
			case SlackPackage.ATTACHMENT_CONTENT: return createAttachmentContent();
			case SlackPackage.WORKSPACE: return createWorkspace();
			case SlackPackage.USER_GROUP: return createUserGroup();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Post createPost() {
		PostImpl post = new PostImpl();
		return post;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channel createChannel() {
		ChannelImpl channel = new ChannelImpl();
		return channel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirectMessage createDirectMessage() {
		DirectMessageImpl directMessage = new DirectMessageImpl();
		return directMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tdt4250.a1.slack.Thread createThread() {
		ThreadImpl thread = new ThreadImpl();
		return thread;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextContent createTextContent() {
		TextContentImpl textContent = new TextContentImpl();
		return textContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageContent createImageContent() {
		ImageContentImpl imageContent = new ImageContentImpl();
		return imageContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttachmentContent createAttachmentContent() {
		AttachmentContentImpl attachmentContent = new AttachmentContentImpl();
		return attachmentContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workspace createWorkspace() {
		WorkspaceImpl workspace = new WorkspaceImpl();
		return workspace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserGroup createUserGroup() {
		UserGroupImpl userGroup = new UserGroupImpl();
		return userGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlackPackage getSlackPackage() {
		return (SlackPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SlackPackage getPackage() {
		return SlackPackage.eINSTANCE;
	}

} //SlackFactoryImpl
