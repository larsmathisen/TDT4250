/**
 */
package slack;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link slack.ImageContent#getImgLink <em>Img Link</em>}</li>
 * </ul>
 *
 * @see slack.SlackPackage#getImageContent()
 * @model
 * @generated
 */
public interface ImageContent extends AbstractContent {
	/**
	 * Returns the value of the '<em><b>Img Link</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Img Link</em>' attribute list.
	 * @see slack.SlackPackage#getImageContent_ImgLink()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getImgLink();

} // ImageContent
