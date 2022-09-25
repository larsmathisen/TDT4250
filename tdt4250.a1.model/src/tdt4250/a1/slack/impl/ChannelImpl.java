/**
 */
package tdt4250.a1.slack.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tdt4250.a1.slack.Channel;
import tdt4250.a1.slack.SlackPackage;
import tdt4250.a1.slack.User;
import tdt4250.a1.slack.UserGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.a1.slack.impl.ChannelImpl#getThreads <em>Threads</em>}</li>
 *   <li>{@link tdt4250.a1.slack.impl.ChannelImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link tdt4250.a1.slack.impl.ChannelImpl#getUsergroup <em>Usergroup</em>}</li>
 *   <li>{@link tdt4250.a1.slack.impl.ChannelImpl#getName <em>Name</em>}</li>
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
	protected EList<tdt4250.a1.slack.Thread> threads;

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
	 * The cached value of the '{@link #getUsergroup() <em>Usergroup</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsergroup()
	 * @generated
	 * @ordered
	 */
	protected EList<UserGroup> usergroup;

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
	public EList<tdt4250.a1.slack.Thread> getThreads() {
		if (threads == null) {
			threads = new EObjectContainmentEList<tdt4250.a1.slack.Thread>(tdt4250.a1.slack.Thread.class, this, SlackPackage.CHANNEL__THREADS);
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
			members = new EObjectWithInverseResolvingEList<User>(User.class, this, SlackPackage.CHANNEL__MEMBERS, SlackPackage.USER__CHANNELS);
		}
		return members;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserGroup> getUsergroup() {
		if (usergroup == null) {
			usergroup = new EObjectResolvingEList<UserGroup>(UserGroup.class, this, SlackPackage.CHANNEL__USERGROUP);
		}
		return usergroup;
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
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
			case SlackPackage.CHANNEL__USERGROUP:
				return getUsergroup();
			case SlackPackage.CHANNEL__NAME:
				return getName();
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
				getThreads().addAll((Collection<? extends tdt4250.a1.slack.Thread>)newValue);
				return;
			case SlackPackage.CHANNEL__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends User>)newValue);
				return;
			case SlackPackage.CHANNEL__USERGROUP:
				getUsergroup().clear();
				getUsergroup().addAll((Collection<? extends UserGroup>)newValue);
				return;
			case SlackPackage.CHANNEL__NAME:
				setName((String)newValue);
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
			case SlackPackage.CHANNEL__USERGROUP:
				getUsergroup().clear();
				return;
			case SlackPackage.CHANNEL__NAME:
				setName(NAME_EDEFAULT);
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
			case SlackPackage.CHANNEL__USERGROUP:
				return usergroup != null && !usergroup.isEmpty();
			case SlackPackage.CHANNEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(')');
		return result.toString();
	}

} //ChannelImpl
