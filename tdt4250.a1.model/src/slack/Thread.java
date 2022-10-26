/**
 */
package slack;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thread</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link slack.Thread#getId <em>Id</em>}</li>
 *   <li>{@link slack.Thread#getOriginalPost <em>Original Post</em>}</li>
 *   <li>{@link slack.Thread#getReplyPosts <em>Reply Posts</em>}</li>
 *   <li>{@link slack.Thread#getChannel <em>Channel</em>}</li>
 * </ul>
 *
 * @see slack.SlackPackage#getThread()
 * @model
 * @generated
 */
public interface Thread extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see slack.SlackPackage#getThread_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link slack.Thread#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Original Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Post</em>' containment reference.
	 * @see #setOriginalPost(Post)
	 * @see slack.SlackPackage#getThread_OriginalPost()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Post getOriginalPost();

	/**
	 * Sets the value of the '{@link slack.Thread#getOriginalPost <em>Original Post</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Post</em>' containment reference.
	 * @see #getOriginalPost()
	 * @generated
	 */
	void setOriginalPost(Post value);

	/**
	 * Returns the value of the '<em><b>Reply Posts</b></em>' containment reference list.
	 * The list contents are of type {@link slack.Post}.
	 * It is bidirectional and its opposite is '{@link slack.Post#getThread <em>Thread</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reply Posts</em>' containment reference list.
	 * @see slack.SlackPackage#getThread_ReplyPosts()
	 * @see slack.Post#getThread
	 * @model opposite="thread" containment="true"
	 * @generated
	 */
	EList<Post> getReplyPosts();

	/**
	 * Returns the value of the '<em><b>Channel</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link slack.Channel#getThreads <em>Threads</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel</em>' container reference.
	 * @see #setChannel(Channel)
	 * @see slack.SlackPackage#getThread_Channel()
	 * @see slack.Channel#getThreads
	 * @model opposite="threads" transient="false"
	 * @generated
	 */
	Channel getChannel();

	/**
	 * Sets the value of the '{@link slack.Thread#getChannel <em>Channel</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel</em>' container reference.
	 * @see #getChannel()
	 * @generated
	 */
	void setChannel(Channel value);

} // Thread
