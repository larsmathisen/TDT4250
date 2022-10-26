/**
 */
package slack;

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
 *   <li>{@link slack.User#getUsername <em>Username</em>}</li>
 *   <li>{@link slack.User#getPosts <em>Posts</em>}</li>
 *   <li>{@link slack.User#getChannels <em>Channels</em>}</li>
 *   <li>{@link slack.User#getPhoneNumber <em>Phone Number</em>}</li>
 *   <li>{@link slack.User#getEmail <em>Email</em>}</li>
 * </ul>
 *
 * @see slack.SlackPackage#getUser()
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
	 * @see slack.SlackPackage#getUser_Username()
	 * @model
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link slack.User#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Posts</b></em>' reference list.
	 * The list contents are of type {@link slack.Post}.
	 * It is bidirectional and its opposite is '{@link slack.Post#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Posts</em>' reference list.
	 * @see slack.SlackPackage#getUser_Posts()
	 * @see slack.Post#getAuthor
	 * @model opposite="author"
	 * @generated
	 */
	EList<Post> getPosts();

	/**
	 * Returns the value of the '<em><b>Channels</b></em>' reference list.
	 * The list contents are of type {@link slack.Channel}.
	 * It is bidirectional and its opposite is '{@link slack.Channel#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channels</em>' reference list.
	 * @see slack.SlackPackage#getUser_Channels()
	 * @see slack.Channel#getMembers
	 * @model opposite="members"
	 * @generated
	 */
	EList<Channel> getChannels();

	/**
	 * Returns the value of the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phone Number</em>' attribute.
	 * @see #setPhoneNumber(String)
	 * @see slack.SlackPackage#getUser_PhoneNumber()
	 * @model
	 * @generated
	 */
	String getPhoneNumber();

	/**
	 * Sets the value of the '{@link slack.User#getPhoneNumber <em>Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phone Number</em>' attribute.
	 * @see #getPhoneNumber()
	 * @generated
	 */
	void setPhoneNumber(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see slack.SlackPackage#getUser_Email()
	 * @model
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link slack.User#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

} // User
