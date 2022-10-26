/**
 */
package slack.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import slack.AbstractContent;
import slack.AttachmentContent;
import slack.Channel;
import slack.ImageContent;
import slack.Post;
import slack.SlackPackage;
import slack.TextContent;
import slack.User;
import slack.Workspace;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see slack.SlackPackage
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
	public static final String DIAGNOSTIC_SOURCE = "slack";

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
			case SlackPackage.THREAD:
				return validateThread((slack.Thread)value, diagnostics, context);
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
	 * @generated
	 */
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
		if (!validate_NoCircularContainment(post, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(post, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(post, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(post, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(post, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(post, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(post, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(post, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(post, diagnostics, context);
		if (result || diagnostics != null) result &= validatePost_replyInThread(post, diagnostics, context);
		if (result || diagnostics != null) result &= validatePost_noSelfReply(post, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the replyInThread constraint of '<em>Post</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String POST__REPLY_IN_THREAD__EEXPRESSION = "self.reply.thread.id = self.thread.id";

	/**
	 * Validates the replyInThread constraint of '<em>Post</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePost_replyInThread(Post post, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SlackPackage.Literals.POST,
				 post,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "replyInThread",
				 POST__REPLY_IN_THREAD__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the noSelfReply constraint of '<em>Post</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String POST__NO_SELF_REPLY__EEXPRESSION = "self.reply.id <> self.id";

	/**
	 * Validates the noSelfReply constraint of '<em>Post</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePost_noSelfReply(Post post, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SlackPackage.Literals.POST,
				 post,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/acceleo/query/1.0",
				 "noSelfReply",
				 POST__NO_SELF_REPLY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChannel(Channel channel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(channel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(channel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(channel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(channel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(channel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(channel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(channel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(channel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(channel, diagnostics, context);
		if (result || diagnostics != null) result &= validateChannel_nameCharacters(channel, diagnostics, context);
		return result;
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
	public boolean validateThread(slack.Thread thread, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
