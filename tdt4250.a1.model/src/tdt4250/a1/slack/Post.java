/**
 */
package tdt4250.a1.slack;

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
 *   <li>{@link tdt4250.a1.slack.Post#getThread <em>Thread</em>}</li>
 *   <li>{@link tdt4250.a1.slack.Post#getAuthor <em>Author</em>}</li>
 *   <li>{@link tdt4250.a1.slack.Post#getContents <em>Contents</em>}</li>
 *   <li>{@link tdt4250.a1.slack.Post#getReply <em>Reply</em>}</li>
 *   <li>{@link tdt4250.a1.slack.Post#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see tdt4250.a1.slack.SlackPackage#getPost()
 * @model
 * @generated
 */
public interface Post extends EObject {
	/**
	 * Returns the value of the '<em><b>Thread</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tdt4250.a1.slack.Thread#getPosts <em>Posts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thread</em>' container reference.
	 * @see #setThread(tdt4250.a1.slack.Thread)
	 * @see tdt4250.a1.slack.SlackPackage#getPost_Thread()
	 * @see tdt4250.a1.slack.Thread#getPosts
	 * @model opposite="posts" transient="false"
	 * @generated
	 */
	tdt4250.a1.slack.Thread getThread();

	/**
	 * Sets the value of the '{@link tdt4250.a1.slack.Post#getThread <em>Thread</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thread</em>' container reference.
	 * @see #getThread()
	 * @generated
	 */
	void setThread(tdt4250.a1.slack.Thread value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link tdt4250.a1.slack.User#getPosts <em>Posts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' reference.
	 * @see #setAuthor(User)
	 * @see tdt4250.a1.slack.SlackPackage#getPost_Author()
	 * @see tdt4250.a1.slack.User#getPosts
	 * @model opposite="posts" required="true"
	 * @generated
	 */
	User getAuthor();

	/**
	 * Sets the value of the '{@link tdt4250.a1.slack.Post#getAuthor <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(User value);

	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.a1.slack.AbstractContent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see tdt4250.a1.slack.SlackPackage#getPost_Contents()
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
	 * @see tdt4250.a1.slack.SlackPackage#getPost_Reply()
	 * @model
	 * @generated
	 */
	Post getReply();

	/**
	 * Sets the value of the '{@link tdt4250.a1.slack.Post#getReply <em>Reply</em>}' reference.
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
	 * @see tdt4250.a1.slack.SlackPackage#getPost_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link tdt4250.a1.slack.Post#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

} // Post
