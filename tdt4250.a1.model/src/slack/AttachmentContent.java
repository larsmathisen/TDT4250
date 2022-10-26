/**
 */
package slack;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attachment Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link slack.AttachmentContent#getAttachmentLink <em>Attachment Link</em>}</li>
 * </ul>
 *
 * @see slack.SlackPackage#getAttachmentContent()
 * @model
 * @generated
 */
public interface AttachmentContent extends AbstractContent {
	/**
	 * Returns the value of the '<em><b>Attachment Link</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment Link</em>' attribute list.
	 * @see slack.SlackPackage#getAttachmentContent_AttachmentLink()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getAttachmentLink();

} // AttachmentContent
