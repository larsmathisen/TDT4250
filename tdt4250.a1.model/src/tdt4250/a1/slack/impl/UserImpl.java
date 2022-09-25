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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tdt4250.a1.slack.Channel;
import tdt4250.a1.slack.Post;
import tdt4250.a1.slack.SlackPackage;
import tdt4250.a1.slack.User;
import tdt4250.a1.slack.UserGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.a1.slack.impl.UserImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link tdt4250.a1.slack.impl.UserImpl#getPosts <em>Posts</em>}</li>
 *   <li>{@link tdt4250.a1.slack.impl.UserImpl#getGroups <em>Groups</em>}</li>
 *   <li>{@link tdt4250.a1.slack.impl.UserImpl#getChannels <em>Channels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserImpl extends MinimalEObjectImpl.Container implements User {
	/**
	 * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected String username = USERNAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPosts() <em>Posts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosts()
	 * @generated
	 * @ordered
	 */
	protected EList<Post> posts;

	/**
	 * The cached value of the '{@link #getGroups() <em>Groups</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<UserGroup> groups;

	/**
	 * The cached value of the '{@link #getChannels() <em>Channels</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannels()
	 * @generated
	 * @ordered
	 */
	protected Channel channels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SlackPackage.Literals.USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsername(String newUsername) {
		String oldUsername = username;
		username = newUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SlackPackage.USER__USERNAME, oldUsername, username));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Post> getPosts() {
		if (posts == null) {
			posts = new EObjectWithInverseResolvingEList<Post>(Post.class, this, SlackPackage.USER__POSTS, SlackPackage.POST__AUTHOR);
		}
		return posts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserGroup> getGroups() {
		if (groups == null) {
			groups = new EObjectWithInverseResolvingEList.ManyInverse<UserGroup>(UserGroup.class, this, SlackPackage.USER__GROUPS, SlackPackage.USER_GROUP__USERS);
		}
		return groups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channel getChannels() {
		if (channels != null && channels.eIsProxy()) {
			InternalEObject oldChannels = (InternalEObject)channels;
			channels = (Channel)eResolveProxy(oldChannels);
			if (channels != oldChannels) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SlackPackage.USER__CHANNELS, oldChannels, channels));
			}
		}
		return channels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channel basicGetChannels() {
		return channels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChannels(Channel newChannels, NotificationChain msgs) {
		Channel oldChannels = channels;
		channels = newChannels;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SlackPackage.USER__CHANNELS, oldChannels, newChannels);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannels(Channel newChannels) {
		if (newChannels != channels) {
			NotificationChain msgs = null;
			if (channels != null)
				msgs = ((InternalEObject)channels).eInverseRemove(this, SlackPackage.CHANNEL__MEMBERS, Channel.class, msgs);
			if (newChannels != null)
				msgs = ((InternalEObject)newChannels).eInverseAdd(this, SlackPackage.CHANNEL__MEMBERS, Channel.class, msgs);
			msgs = basicSetChannels(newChannels, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SlackPackage.USER__CHANNELS, newChannels, newChannels));
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
			case SlackPackage.USER__POSTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPosts()).basicAdd(otherEnd, msgs);
			case SlackPackage.USER__GROUPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGroups()).basicAdd(otherEnd, msgs);
			case SlackPackage.USER__CHANNELS:
				if (channels != null)
					msgs = ((InternalEObject)channels).eInverseRemove(this, SlackPackage.CHANNEL__MEMBERS, Channel.class, msgs);
				return basicSetChannels((Channel)otherEnd, msgs);
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
			case SlackPackage.USER__POSTS:
				return ((InternalEList<?>)getPosts()).basicRemove(otherEnd, msgs);
			case SlackPackage.USER__GROUPS:
				return ((InternalEList<?>)getGroups()).basicRemove(otherEnd, msgs);
			case SlackPackage.USER__CHANNELS:
				return basicSetChannels(null, msgs);
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
			case SlackPackage.USER__USERNAME:
				return getUsername();
			case SlackPackage.USER__POSTS:
				return getPosts();
			case SlackPackage.USER__GROUPS:
				return getGroups();
			case SlackPackage.USER__CHANNELS:
				if (resolve) return getChannels();
				return basicGetChannels();
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
			case SlackPackage.USER__USERNAME:
				setUsername((String)newValue);
				return;
			case SlackPackage.USER__POSTS:
				getPosts().clear();
				getPosts().addAll((Collection<? extends Post>)newValue);
				return;
			case SlackPackage.USER__GROUPS:
				getGroups().clear();
				getGroups().addAll((Collection<? extends UserGroup>)newValue);
				return;
			case SlackPackage.USER__CHANNELS:
				setChannels((Channel)newValue);
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
			case SlackPackage.USER__USERNAME:
				setUsername(USERNAME_EDEFAULT);
				return;
			case SlackPackage.USER__POSTS:
				getPosts().clear();
				return;
			case SlackPackage.USER__GROUPS:
				getGroups().clear();
				return;
			case SlackPackage.USER__CHANNELS:
				setChannels((Channel)null);
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
			case SlackPackage.USER__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
			case SlackPackage.USER__POSTS:
				return posts != null && !posts.isEmpty();
			case SlackPackage.USER__GROUPS:
				return groups != null && !groups.isEmpty();
			case SlackPackage.USER__CHANNELS:
				return channels != null;
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
		result.append(" (username: ");
		result.append(username);
		result.append(')');
		return result.toString();
	}

} //UserImpl
