/**
 */
package tdt4250.a1.slack;

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
 *   <li>{@link tdt4250.a1.slack.Channel#getThreads <em>Threads</em>}</li>
 *   <li>{@link tdt4250.a1.slack.Channel#getMembers <em>Members</em>}</li>
 *   <li>{@link tdt4250.a1.slack.Channel#getUsergroup <em>Usergroup</em>}</li>
 *   <li>{@link tdt4250.a1.slack.Channel#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see tdt4250.a1.slack.SlackPackage#getChannel()
 * @model
 * @generated
 */
public interface Channel extends EObject {
	/**
	 * Returns the value of the '<em><b>Threads</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.a1.slack.Thread}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threads</em>' containment reference list.
	 * @see tdt4250.a1.slack.SlackPackage#getChannel_Threads()
	 * @model containment="true"
	 * @generated
	 */
	EList<tdt4250.a1.slack.Thread> getThreads();

	/**
	 * Returns the value of the '<em><b>Members</b></em>' reference list.
	 * The list contents are of type {@link tdt4250.a1.slack.User}.
	 * It is bidirectional and its opposite is '{@link tdt4250.a1.slack.User#getChannels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' reference list.
	 * @see tdt4250.a1.slack.SlackPackage#getChannel_Members()
	 * @see tdt4250.a1.slack.User#getChannels
	 * @model opposite="channels" upper="1000"
	 * @generated
	 */
	EList<User> getMembers();

	/**
	 * Returns the value of the '<em><b>Usergroup</b></em>' reference list.
	 * The list contents are of type {@link tdt4250.a1.slack.UserGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usergroup</em>' reference list.
	 * @see tdt4250.a1.slack.SlackPackage#getChannel_Usergroup()
	 * @model
	 * @generated
	 */
	EList<UserGroup> getUsergroup();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tdt4250.a1.slack.SlackPackage#getChannel_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tdt4250.a1.slack.Channel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Channel
