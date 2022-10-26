/**
 */
package slack.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import slack.Channel;
import slack.SlackPackage;
import slack.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link slack.impl.ChannelImpl#getThreads <em>Threads</em>}</li>
 *   <li>{@link slack.impl.ChannelImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link slack.impl.ChannelImpl#getName <em>Name</em>}</li>
 *   <li>{@link slack.impl.ChannelImpl#isDirectMessage <em>Direct Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChannelImpl extends MinimalEObjectImpl.Container implements Channel {
	/**
	 * The cached value of the '{@link #getThreads() <em>Threads</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreads()
	 * @generated
	 * @ordered
	 */
	protected EList<slack.Thread> threads;

	/**
	 * The cached value of the '{@link #getMembers() <em>Members</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<User> members;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isDirectMessage() <em>Direct Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDirectMessage()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DIRECT_MESSAGE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDirectMessage() <em>Direct Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDirectMessage()
	 * @generated
	 * @ordered
	 */
	protected boolean directMessage = DIRECT_MESSAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChannelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SlackPackage.Literals.CHANNEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<slack.Thread> getThreads() {
		if (threads == null) {
			threads = new EObjectContainmentWithInverseEList<slack.Thread>(slack.Thread.class, this, SlackPackage.CHANNEL__THREADS, SlackPackage.THREAD__CHANNEL);
		}
		return threads;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getMembers() {
		if (members == null) {
			members = new EObjectWithInverseResolvingEList.ManyInverse<User>(User.class, this, SlackPackage.CHANNEL__MEMBERS, SlackPackage.USER__CHANNELS);
		}
		return members;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SlackPackage.CHANNEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDirectMessage() {
		return directMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectMessage(boolean newDirectMessage) {
		boolean oldDirectMessage = directMessage;
		directMessage = newDirectMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SlackPackage.CHANNEL__DIRECT_MESSAGE, oldDirectMessage, directMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SlackPackage.CHANNEL__THREADS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getThreads()).basicAdd(otherEnd, msgs);
			case SlackPackage.CHANNEL__MEMBERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMembers()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SlackPackage.CHANNEL__THREADS:
				return ((InternalEList<?>)getThreads()).basicRemove(otherEnd, msgs);
			case SlackPackage.CHANNEL__MEMBERS:
				return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SlackPackage.CHANNEL__THREADS:
				return getThreads();
			case SlackPackage.CHANNEL__MEMBERS:
				return getMembers();
			case SlackPackage.CHANNEL__NAME:
				return getName();
			case SlackPackage.CHANNEL__DIRECT_MESSAGE:
				return isDirectMessage();
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
			case SlackPackage.CHANNEL__THREADS:
				getThreads().clear();
				getThreads().addAll((Collection<? extends slack.Thread>)newValue);
				return;
			case SlackPackage.CHANNEL__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends User>)newValue);
				return;
			case SlackPackage.CHANNEL__NAME:
				setName((String)newValue);
				return;
			case SlackPackage.CHANNEL__DIRECT_MESSAGE:
				setDirectMessage((Boolean)newValue);
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
			case SlackPackage.CHANNEL__THREADS:
				getThreads().clear();
				return;
			case SlackPackage.CHANNEL__MEMBERS:
				getMembers().clear();
				return;
			case SlackPackage.CHANNEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SlackPackage.CHANNEL__DIRECT_MESSAGE:
				setDirectMessage(DIRECT_MESSAGE_EDEFAULT);
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
			case SlackPackage.CHANNEL__THREADS:
				return threads != null && !threads.isEmpty();
			case SlackPackage.CHANNEL__MEMBERS:
				return members != null && !members.isEmpty();
			case SlackPackage.CHANNEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SlackPackage.CHANNEL__DIRECT_MESSAGE:
				return directMessage != DIRECT_MESSAGE_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", directMessage: ");
		result.append(directMessage);
		result.append(')');
		return result.toString();
	}

} //ChannelImpl
