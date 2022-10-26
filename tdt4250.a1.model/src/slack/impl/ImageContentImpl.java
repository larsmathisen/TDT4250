/**
 */
package slack.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import slack.ImageContent;
import slack.SlackPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link slack.impl.ImageContentImpl#getImgLink <em>Img Link</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageContentImpl extends AbstractContentImpl implements ImageContent {
	/**
	 * The cached value of the '{@link #getImgLink() <em>Img Link</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImgLink()
	 * @generated
	 * @ordered
	 */
	protected EList<String> imgLink;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SlackPackage.Literals.IMAGE_CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getImgLink() {
		if (imgLink == null) {
			imgLink = new EDataTypeUniqueEList<String>(String.class, this, SlackPackage.IMAGE_CONTENT__IMG_LINK);
		}
		return imgLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SlackPackage.IMAGE_CONTENT__IMG_LINK:
				return getImgLink();
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
			case SlackPackage.IMAGE_CONTENT__IMG_LINK:
				getImgLink().clear();
				getImgLink().addAll((Collection<? extends String>)newValue);
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
			case SlackPackage.IMAGE_CONTENT__IMG_LINK:
				getImgLink().clear();
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
			case SlackPackage.IMAGE_CONTENT__IMG_LINK:
				return imgLink != null && !imgLink.isEmpty();
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
		result.append(" (imgLink: ");
		result.append(imgLink);
		result.append(')');
		return result.toString();
	}

} //ImageContentImpl
