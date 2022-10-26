/**
 */
package slack;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link slack.Channel#getThreads <em>Threads</em>}</li>
 *   <li>{@link slack.Channel#getMembers <em>Members</em>}</li>
 *   <li>{@link slack.Channel#getName <em>Name</em>}</li>
 *   <li>{@link slack.Channel#isDirectMessage <em>Direct Message</em>}</li>
 * </ul>
 *
 * @see slack.SlackPackage#getChannel()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nameCharacters'"
 * @generated
 */
public interface Channel extends EObject {
	/**
	 * Returns the value of the '<em><b>Threads</b></em>' containment reference list.
	 * The list contents are of type {@link slack.Thread}.
	 * It is bidirectional and its opposite is '{@link slack.Thread#getChannel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threads</em>' containment reference list.
	 * @see slack.SlackPackage#getChannel_Threads()
	 * @see slack.Thread#getChannel
	 * @model opposite="channel" containment="true"
	 * @generated
	 */
	EList<slack.Thread> getThreads();

	/**
	 * Returns the value of the '<em><b>Members</b></em>' reference list.
	 * The list contents are of type {@link slack.User}.
	 * It is bidirectional and its opposite is '{@link slack.User#getChannels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' reference list.
	 * @see slack.SlackPackage#getChannel_Members()
	 * @see slack.User#getChannels
	 * @model opposite="channels" upper="1000"
	 * @generated
	 */
	EList<User> getMembers();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see slack.SlackPackage#getChannel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link slack.Channel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Direct Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direct Message</em>' attribute.
	 * @see #setDirectMessage(boolean)
	 * @see slack.SlackPackage#getChannel_DirectMessage()
	 * @model required="true"
	 * @generated
	 */
	boolean isDirectMessage();

	/**
	 * Sets the value of the '{@link slack.Channel#isDirectMessage <em>Direct Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direct Message</em>' attribute.
	 * @see #isDirectMessage()
	 * @generated
	 */
	void setDirectMessage(boolean value);

} // Channel
