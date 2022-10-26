/**
 */
package slack;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link slack.TextContent#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see slack.SlackPackage#getTextContent()
 * @model
 * @generated
 */
public interface TextContent extends AbstractContent {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see slack.SlackPackage#getTextContent_Text()
	 * @model required="true"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link slack.TextContent#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // TextContent
