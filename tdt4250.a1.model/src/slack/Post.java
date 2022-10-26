/**
 */
package slack;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Post</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link slack.Post#getThread <em>Thread</em>}</li>
 *   <li>{@link slack.Post#getAuthor <em>Author</em>}</li>
 *   <li>{@link slack.Post#getContents <em>Contents</em>}</li>
 *   <li>{@link slack.Post#getReply <em>Reply</em>}</li>
 *   <li>{@link slack.Post#getId <em>Id</em>}</li>
 *   <li>{@link slack.Post#getDate <em>Date</em>}</li>
 * </ul>
 *
 * @see slack.SlackPackage#getPost()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='replyInThread noSelfReply'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 replyInThread='self.reply.thread.id = self.thread.id' noSelfReply='self.reply.id &lt;&gt; self.id'"
 * @generated
 */
public interface Post extends EObject {
	/**
	 * Returns the value of the '<em><b>Thread</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link slack.Thread#getReplyPosts <em>Reply Posts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thread</em>' container reference.
	 * @see #setThread(slack.Thread)
	 * @see slack.SlackPackage#getPost_Thread()
	 * @see slack.Thread#getReplyPosts
	 * @model opposite="replyPosts" transient="false"
	 * @generated
	 */
	slack.Thread getThread();

	/**
	 * Sets the value of the '{@link slack.Post#getThread <em>Thread</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thread</em>' container reference.
	 * @see #getThread()
	 * @generated
	 */
	void setThread(slack.Thread value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link slack.User#getPosts <em>Posts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' reference.
	 * @see #setAuthor(User)
	 * @see slack.SlackPackage#getPost_Author()
	 * @see slack.User#getPosts
	 * @model opposite="posts" required="true"
	 * @generated
	 */
	User getAuthor();

	/**
	 * Sets the value of the '{@link slack.Post#getAuthor <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(User value);

	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link slack.AbstractContent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see slack.SlackPackage#getPost_Contents()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AbstractContent> getContents();

	/**
	 * Returns the value of the '<em><b>Reply</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reply</em>' reference.
	 * @see #setReply(Post)
	 * @see slack.SlackPackage#getPost_Reply()
	 * @model
	 * @generated
	 */
	Post getReply();

	/**
	 * Sets the value of the '{@link slack.Post#getReply <em>Reply</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reply</em>' reference.
	 * @see #getReply()
	 * @generated
	 */
	void setReply(Post value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see slack.SlackPackage#getPost_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link slack.Post#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see slack.SlackPackage#getPost_Date()
	 * @model required="true"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link slack.Post#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

} // Post
