/**
 */
package tdt4250.a1.slack;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workspace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.a1.slack.Workspace#getChannels <em>Channels</em>}</li>
 *   <li>{@link tdt4250.a1.slack.Workspace#getUsers <em>Users</em>}</li>
 *   <li>{@link tdt4250.a1.slack.Workspace#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.a1.slack.Workspace#getGroups <em>Groups</em>}</li>
 * </ul>
 *
 * @see tdt4250.a1.slack.SlackPackage#getWorkspace()
 * @model
 * @generated
 */
public interface Workspace extends EObject {
	/**
	 * Returns the value of the '<em><b>Channels</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.a1.slack.Channel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channels</em>' containment reference list.
	 * @see tdt4250.a1.slack.SlackPackage#getWorkspace_Channels()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Channel> getChannels();

	/**
	 * Returns the value of the '<em><b>Users</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.a1.slack.User}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Users</em>' containment reference list.
	 * @see tdt4250.a1.slack.SlackPackage#getWorkspace_Users()
	 * @model containment="true" required="true" upper="100000"
	 * @generated
	 */
	EList<User> getUsers();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tdt4250.a1.slack.SlackPackage#getWorkspace_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tdt4250.a1.slack.Workspace#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.a1.slack.UserGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see tdt4250.a1.slack.SlackPackage#getWorkspace_Groups()
	 * @model containment="true"
	 * @generated
	 */
	EList<UserGroup> getGroups();

} // Workspace
