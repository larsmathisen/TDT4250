/**
 */
package tdt4250.a1.slack.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import tdt4250.a1.slack.AbstractContent;
import tdt4250.a1.slack.AttachmentContent;
import tdt4250.a1.slack.Channel;
import tdt4250.a1.slack.DirectMessage;
import tdt4250.a1.slack.ImageContent;
import tdt4250.a1.slack.Post;
import tdt4250.a1.slack.SlackPackage;
import tdt4250.a1.slack.TextContent;
import tdt4250.a1.slack.User;
import tdt4250.a1.slack.UserGroup;
import tdt4250.a1.slack.Workspace;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see tdt4250.a1.slack.SlackPackage
 * @generated
 */
public class SlackValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SlackValidator INSTANCE = new SlackValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "tdt4250.a1.slack";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlackValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return SlackPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case SlackPackage.USER:
				return validateUser((User)value, diagnostics, context);
			case SlackPackage.POST:
				return validatePost((Post)value, diagnostics, context);
			case SlackPackage.CHANNEL:
				return validateChannel((Channel)value, diagnostics, context);
			case SlackPackage.DIRECT_MESSAGE:
				return validateDirectMessage((DirectMessage)value, diagnostics, context);
			case SlackPackage.THREAD:
				return validateThread((tdt4250.a1.slack.Thread)value, diagnostics, context);
			case SlackPackage.ABSTRACT_CONTENT:
				return validateAbstractContent((AbstractContent)value, diagnostics, context);
			case SlackPackage.TEXT_CONTENT:
				return validateTextContent((TextContent)value, diagnostics, context);
			case SlackPackage.IMAGE_CONTENT:
				return validateImageContent((ImageContent)value, diagnostics, context);
			case SlackPackage.ATTACHMENT_CONTENT:
				return validateAttachmentContent((AttachmentContent)value, diagnostics, context);
			case SlackPackage.WORKSPACE:
				return validateWorkspace((Workspace)value, diagnostics, context);
			case SlackPackage.USER_GROUP:
				return validateUserGroup((UserGroup)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUser(User user, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(user, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(user, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(user, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(user, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(user, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(user, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(user, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(user, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(user, diagnostics, context);
		if (result || diagnostics != null) result &= validateUser_nameCharacters(user, diagnostics, context);
		return result;
	}

	/**
	 * Validates the nameCharacters constraint of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateUser_nameCharacters(User user, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (! isAlphanumeric(user.getUsername())) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "nameCharacters", getObjectLabel(user, context) },
						 new Object[] { user },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validation method to check if name is alphanumeric
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private boolean isAlphanumeric(String username) {
		for (int i = 0; i < username.length(); i++) {
			char c = username.charAt(i);
			if (! (Character.isLetter(c) || Character.isDigit(c) || c == ' ' || c == '-')) {
			return false;
			}
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePost(Post post, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(post, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChannel(Channel channel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(channel, diagnostics, context);
	}

	/**
	 * Validates the nameCharacters constraint of '<em>Channel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateChannel_nameCharacters(Channel channel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (! isAlphanumericNoSpace(channel.getName())) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "nameCharacters", getObjectLabel(channel, context) },
						 new Object[] { channel },
						 context));
			}
			return false;
		}
		return true;
	}
	/**
	 * Validation method to check if name is alphanumeric without spaces
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private boolean isAlphanumericNoSpace(String name) {
		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);
			if (! (Character.isLetter(c) || Character.isDigit(c) || c == '-')) {
			return false;
			}
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirectMessage(DirectMessage directMessage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(directMessage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThread(tdt4250.a1.slack.Thread thread, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(thread, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractContent(AbstractContent abstractContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextContent(TextContent textContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImageContent(ImageContent imageContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imageContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttachmentContent(AttachmentContent attachmentContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attachmentContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkspace(Workspace workspace, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(workspace, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserGroup(UserGroup userGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(userGroup, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //SlackValidator
