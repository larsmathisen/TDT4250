/**
 */
package slack.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import slack.AttachmentContent;
import slack.SlackPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attachment Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link slack.impl.AttachmentContentImpl#getAttachmentLink <em>Attachment Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttachmentContentImpl extends AbstractContentImpl implements AttachmentContent {
	/**
	 * The cached value of the '{@link #getAttachmentLink() <em>Attachment Link</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachmentLink()
	 * @generated
	 * @ordered
	 */
	protected EList<String> attachmentLink;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttachmentContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SlackPackage.Literals.ATTACHMENT_CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAttachmentLink() {
		if (attachmentLink == null) {
			attachmentLink = new EDataTypeUniqueEList<String>(String.class, this, SlackPackage.ATTACHMENT_CONTENT__ATTACHMENT_LINK);
		}
		return attachmentLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SlackPackage.ATTACHMENT_CONTENT__ATTACHMENT_LINK:
				return getAttachmentLink();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SlackPackage.ATTACHMENT_CONTENT__ATTACHMENT_LINK:
				getAttachmentLink().clear();
				getAttachmentLink().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SlackPackage.ATTACHMENT_CONTENT__ATTACHMENT_LINK:
				getAttachmentLink().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SlackPackage.ATTACHMENT_CONTENT__ATTACHMENT_LINK:
				return attachmentLink != null && !attachmentLink.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (attachmentLink: ");
		result.append(attachmentLink);
		result.append(')');
		return result.toString();
	}

} //AttachmentContentImpl
