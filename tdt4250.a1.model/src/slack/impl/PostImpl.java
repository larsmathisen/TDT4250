/**
 */
package slack.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import slack.AbstractContent;
import slack.Post;
import slack.SlackPackage;
import slack.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Post</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link slack.impl.PostImpl#getThread <em>Thread</em>}</li>
 *   <li>{@link slack.impl.PostImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link slack.impl.PostImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link slack.impl.PostImpl#getReply <em>Reply</em>}</li>
 *   <li>{@link slack.impl.PostImpl#getId <em>Id</em>}</li>
 *   <li>{@link slack.impl.PostImpl#getDate <em>Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PostImpl extends MinimalEObjectImpl.Container implements Post {
	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected User author;

	/**
	 * The cached value of the '{@link #getContents() <em>Contents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractContent> contents;

	/**
	 * The cached value of the '{@link #getReply() <em>Reply</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReply()
	 * @generated
	 * @ordered
	 */
	protected Post reply;

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
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SlackPackage.Literals.POST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public slack.Thread getThread() {
		if (eContainerFeatureID() != SlackPackage.POST__THREAD) return null;
		return (slack.Thread)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThread(slack.Thread newThread, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newThread, SlackPackage.POST__THREAD, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThread(slack.Thread newThread) {
		if (newThread != eInternalContainer() || (eContainerFeatureID() != SlackPackage.POST__THREAD && newThread != null)) {
			if (EcoreUtil.isAncestor(this, newThread))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newThread != null)
				msgs = ((InternalEObject)newThread).eInverseAdd(this, SlackPackage.THREAD__REPLY_POSTS, slack.Thread.class, msgs);
			msgs = basicSetThread(newThread, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SlackPackage.POST__THREAD, newThread, newThread));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getAuthor() {
		if (author != null && author.eIsProxy()) {
			InternalEObject oldAuthor = (InternalEObject)author;
			author = (User)eResolveProxy(oldAuthor);
			if (author != oldAuthor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SlackPackage.POST__AUTHOR, oldAuthor, author));
			}
		}
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthor(User newAuthor, NotificationChain msgs) {
		User oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SlackPackage.POST__AUTHOR, oldAuthor, newAuthor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(User newAuthor) {
		if (newAuthor != author) {
			NotificationChain msgs = null;
			if (author != null)
				msgs = ((InternalEObject)author).eInverseRemove(this, SlackPackage.USER__POSTS, User.class, msgs);
			if (newAuthor != null)
				msgs = ((InternalEObject)newAuthor).eInverseAdd(this, SlackPackage.USER__POSTS, User.class, msgs);
			msgs = basicSetAuthor(newAuthor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SlackPackage.POST__AUTHOR, newAuthor, newAuthor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractContent> getContents() {
		if (contents == null) {
			contents = new EObjectContainmentEList<AbstractContent>(AbstractContent.class, this, SlackPackage.POST__CONTENTS);
		}
		return contents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Post getReply() {
		if (reply != null && reply.eIsProxy()) {
			InternalEObject oldReply = (InternalEObject)reply;
			reply = (Post)eResolveProxy(oldReply);
			if (reply != oldReply) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SlackPackage.POST__REPLY, oldReply, reply));
			}
		}
		return reply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Post basicGetReply() {
		return reply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReply(Post newReply) {
		Post oldReply = reply;
		reply = newReply;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SlackPackage.POST__REPLY, oldReply, reply));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SlackPackage.POST__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SlackPackage.POST__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SlackPackage.POST__THREAD:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetThread((slack.Thread)otherEnd, msgs);
			case SlackPackage.POST__AUTHOR:
				if (author != null)
					msgs = ((InternalEObject)author).eInverseRemove(this, SlackPackage.USER__POSTS, User.class, msgs);
				return basicSetAuthor((User)otherEnd, msgs);
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
			case SlackPackage.POST__THREAD:
				return basicSetThread(null, msgs);
			case SlackPackage.POST__AUTHOR:
				return basicSetAuthor(null, msgs);
			case SlackPackage.POST__CONTENTS:
				return ((InternalEList<?>)getContents()).basicRemove(otherEnd, msgs);
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
			case SlackPackage.POST__THREAD:
				return eInternalContainer().eInverseRemove(this, SlackPackage.THREAD__REPLY_POSTS, slack.Thread.class, msgs);
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
			case SlackPackage.POST__THREAD:
				return getThread();
			case SlackPackage.POST__AUTHOR:
				if (resolve) return getAuthor();
				return basicGetAuthor();
			case SlackPackage.POST__CONTENTS:
				return getContents();
			case SlackPackage.POST__REPLY:
				if (resolve) return getReply();
				return basicGetReply();
			case SlackPackage.POST__ID:
				return getId();
			case SlackPackage.POST__DATE:
				return getDate();
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
			case SlackPackage.POST__THREAD:
				setThread((slack.Thread)newValue);
				return;
			case SlackPackage.POST__AUTHOR:
				setAuthor((User)newValue);
				return;
			case SlackPackage.POST__CONTENTS:
				getContents().clear();
				getContents().addAll((Collection<? extends AbstractContent>)newValue);
				return;
			case SlackPackage.POST__REPLY:
				setReply((Post)newValue);
				return;
			case SlackPackage.POST__ID:
				setId((Integer)newValue);
				return;
			case SlackPackage.POST__DATE:
				setDate((Date)newValue);
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
			case SlackPackage.POST__THREAD:
				setThread((slack.Thread)null);
				return;
			case SlackPackage.POST__AUTHOR:
				setAuthor((User)null);
				return;
			case SlackPackage.POST__CONTENTS:
				getContents().clear();
				return;
			case SlackPackage.POST__REPLY:
				setReply((Post)null);
				return;
			case SlackPackage.POST__ID:
				setId(ID_EDEFAULT);
				return;
			case SlackPackage.POST__DATE:
				setDate(DATE_EDEFAULT);
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
			case SlackPackage.POST__THREAD:
				return getThread() != null;
			case SlackPackage.POST__AUTHOR:
				return author != null;
			case SlackPackage.POST__CONTENTS:
				return contents != null && !contents.isEmpty();
			case SlackPackage.POST__REPLY:
				return reply != null;
			case SlackPackage.POST__ID:
				return id != ID_EDEFAULT;
			case SlackPackage.POST__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
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
		result.append(", date: ");
		result.append(date);
		result.append(')');
		return result.toString();
	}

} //PostImpl
