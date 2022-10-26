/**
 */
package slack;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see slack.SlackPackage
 * @generated
 */
public interface SlackFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SlackFactory eINSTANCE = slack.impl.SlackFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User</em>'.
	 * @generated
	 */
	User createUser();

	/**
	 * Returns a new object of class '<em>Post</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Post</em>'.
	 * @generated
	 */
	Post createPost();

	/**
	 * Returns a new object of class '<em>Channel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Channel</em>'.
	 * @generated
	 */
	Channel createChannel();

	/**
	 * Returns a new object of class '<em>Thread</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Thread</em>'.
	 * @generated
	 */
	Thread createThread();

	/**
	 * Returns a new object of class '<em>Text Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Content</em>'.
	 * @generated
	 */
	TextContent createTextContent();

	/**
	 * Returns a new object of class '<em>Image Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image Content</em>'.
	 * @generated
	 */
	ImageContent createImageContent();

	/**
	 * Returns a new object of class '<em>Attachment Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attachment Content</em>'.
	 * @generated
	 */
	AttachmentContent createAttachmentContent();

	/**
	 * Returns a new object of class '<em>Workspace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workspace</em>'.
	 * @generated
	 */
	Workspace createWorkspace();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SlackPackage getSlackPackage();

} //SlackFactory
