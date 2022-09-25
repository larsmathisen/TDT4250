/**
 */
package tdt4250.a1.slack;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.a1.slack.User#getUsername <em>Username</em>}</li>
 *   <li>{@link tdt4250.a1.slack.User#getPosts <em>Posts</em>}</li>
 *   <li>{@link tdt4250.a1.slack.User#getGroups <em>Groups</em>}</li>
 *   <li>{@link tdt4250.a1.slack.User#getChannels <em>Channels</em>}</li>
 * </ul>
 *
 * @see tdt4250.a1.slack.SlackPackage#getUser()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nameCharacters'"
 * @generated
 */
public interface User extends EObject {
	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see tdt4250.a1.slack.SlackPackage#getUser_Username()
	 * @model id="true"
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link tdt4250.a1.slack.User#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Posts</b></em>' reference list.
	 * The list contents are of type {@link tdt4250.a1.slack.Post}.
	 * It is bidirectional and its opposite is '{@link tdt4250.a1.slack.Post#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Posts</em>' reference list.
	 * @see tdt4250.a1.slack.SlackPackage#getUser_Posts()
	 * @see tdt4250.a1.slack.Post#getAuthor
	 * @model opposite="author"
	 * @generated
	 */
	EList<Post> getPosts();

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' reference list.
	 * The list contents are of type {@link tdt4250.a1.slack.UserGroup}.
	 * It is bidirectional and its opposite is '{@link tdt4250.a1.slack.UserGroup#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' reference list.
	 * @see tdt4250.a1.slack.SlackPackage#getUser_Groups()
	 * @see tdt4250.a1.slack.UserGroup#getUsers
	 * @model opposite="users"
	 * @generated
	 */
	EList<UserGroup> getGroups();

	/**
	 * Returns the value of the '<em><b>Channels</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tdt4250.a1.slack.Channel#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channels</em>' reference.
	 * @see #setChannels(Channel)
	 * @see tdt4250.a1.slack.SlackPackage#getUser_Channels()
	 * @see tdt4250.a1.slack.Channel#getMembers
	 * @model opposite="members"
	 * @generated
	 */
	Channel getChannels();

	/**
	 * Sets the value of the '{@link tdt4250.a1.slack.User#getChannels <em>Channels</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channels</em>' reference.
	 * @see #getChannels()
	 * @generated
	 */
	void setChannels(Channel value);

} // User
