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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import slack.Channel;
import slack.Post;
import slack.SlackPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Thread</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link slack.impl.ThreadImpl#getId <em>Id</em>}</li>
 *   <li>{@link slack.impl.ThreadImpl#getOriginalPost <em>Original Post</em>}</li>
 *   <li>{@link slack.impl.ThreadImpl#getReplyPosts <em>Reply Posts</em>}</li>
 *   <li>{@link slack.impl.ThreadImpl#getChannel <em>Channel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThreadImpl extends MinimalEObjectImpl.Container implements slack.Thread {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOriginalPost() <em>Original Post</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalPost()
	 * @generated
	 * @ordered
	 */
	protected Post originalPost;

	/**
	 * The cached value of the '{@link #getReplyPosts() <em>Reply Posts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplyPosts()
	 * @generated
	 * @ordered
	 */
	protected EList<Post> replyPosts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThreadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SlackPackage.Literals.THREAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SlackPackage.THREAD__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Post getOriginalPost() {
		return originalPost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOriginalPost(Post newOriginalPost, NotificationChain msgs) {
		Post oldOriginalPost = originalPost;
		originalPost = newOriginalPost;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SlackPackage.THREAD__ORIGINAL_POST, oldOriginalPost, newOriginalPost);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalPost(Post newOriginalPost) {
		if (newOriginalPost != originalPost) {
			NotificationChain msgs = null;
			if (originalPost != null)
				msgs = ((InternalEObject)originalPost).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SlackPackage.THREAD__ORIGINAL_POST, null, msgs);
			if (newOriginalPost != null)
				msgs = ((InternalEObject)newOriginalPost).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SlackPackage.THREAD__ORIGINAL_POST, null, msgs);
			msgs = basicSetOriginalPost(newOriginalPost, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SlackPackage.THREAD__ORIGINAL_POST, newOriginalPost, newOriginalPost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Post> getReplyPosts() {
		if (replyPosts == null) {
			replyPosts = new EObjectContainmentWithInverseEList<Post>(Post.class, this, SlackPackage.THREAD__REPLY_POSTS, SlackPackage.POST__THREAD);
		}
		return replyPosts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Channel getChannel() {
		if (eContainerFeatureID() != SlackPackage.THREAD__CHANNEL) return null;
		return (Channel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChannel(Channel newChannel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newChannel, SlackPackage.THREAD__CHANNEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannel(Channel newChannel) {
		if (newChannel != eInternalContainer() || (eContainerFeatureID() != SlackPackage.THREAD__CHANNEL && newChannel != null)) {
			if (EcoreUtil.isAncestor(this, newChannel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newChannel != null)
				msgs = ((InternalEObject)newChannel).eInverseAdd(this, SlackPackage.CHANNEL__THREADS, Channel.class, msgs);
			msgs = basicSetChannel(newChannel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SlackPackage.THREAD__CHANNEL, newChannel, newChannel));
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
			case SlackPackage.THREAD__REPLY_POSTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReplyPosts()).basicAdd(otherEnd, msgs);
			case SlackPackage.THREAD__CHANNEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetChannel((Channel)otherEnd, msgs);
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
			case SlackPackage.THREAD__ORIGINAL_POST:
				return basicSetOriginalPost(null, msgs);
			case SlackPackage.THREAD__REPLY_POSTS:
				return ((InternalEList<?>)getReplyPosts()).basicRemove(otherEnd, msgs);
			case SlackPackage.THREAD__CHANNEL:
				return basicSetChannel(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SlackPackage.THREAD__CHANNEL:
				return eInternalContainer().eInverseRemove(this, SlackPackage.CHANNEL__THREADS, Channel.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SlackPackage.THREAD__ID:
				return getId();
			case SlackPackage.THREAD__ORIGINAL_POST:
				return getOriginalPost();
			case SlackPackage.THREAD__REPLY_POSTS:
				return getReplyPosts();
			case SlackPackage.THREAD__CHANNEL:
				return getChannel();
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
			case SlackPackage.THREAD__ID:
				setId((Integer)newValue);
				return;
			case SlackPackage.THREAD__ORIGINAL_POST:
				setOriginalPost((Post)newValue);
				return;
			case SlackPackage.THREAD__REPLY_POSTS:
				getReplyPosts().clear();
				getReplyPosts().addAll((Collection<? extends Post>)newValue);
				return;
			case SlackPackage.THREAD__CHANNEL:
				setChannel((Channel)newValue);
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
			case SlackPackage.THREAD__ID:
				setId(ID_EDEFAULT);
				return;
			case SlackPackage.THREAD__ORIGINAL_POST:
				setOriginalPost((Post)null);
				return;
			case SlackPackage.THREAD__REPLY_POSTS:
				getReplyPosts().clear();
				return;
			case SlackPackage.THREAD__CHANNEL:
				setChannel((Channel)null);
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
			case SlackPackage.THREAD__ID:
				return id != ID_EDEFAULT;
			case SlackPackage.THREAD__ORIGINAL_POST:
				return originalPost != null;
			case SlackPackage.THREAD__REPLY_POSTS:
				return replyPosts != null && !replyPosts.isEmpty();
			case SlackPackage.THREAD__CHANNEL:
				return getChannel() != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ThreadImpl
