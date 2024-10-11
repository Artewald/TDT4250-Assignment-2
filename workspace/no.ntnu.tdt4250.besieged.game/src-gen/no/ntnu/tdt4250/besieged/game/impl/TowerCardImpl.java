/**
 */
package no.ntnu.tdt4250.besieged.game.impl;

import no.ntnu.tdt4250.besieged.game.GamePackage;
import no.ntnu.tdt4250.besieged.game.TowerCard;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tower Card</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.impl.TowerCardImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.impl.TowerCardImpl#getBaseDamage <em>Base Damage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TowerCardImpl extends GameEntityImpl implements TowerCard {
	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final long PRICE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected long price = PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBaseDamage() <em>Base Damage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseDamage()
	 * @generated
	 * @ordered
	 */
	protected static final long BASE_DAMAGE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getBaseDamage() <em>Base Damage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseDamage()
	 * @generated
	 * @ordered
	 */
	protected long baseDamage = BASE_DAMAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TowerCardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamePackage.Literals.TOWER_CARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrice(long newPrice) {
		long oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.TOWER_CARD__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getBaseDamage() {
		return baseDamage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBaseDamage(long newBaseDamage) {
		long oldBaseDamage = baseDamage;
		baseDamage = newBaseDamage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.TOWER_CARD__BASE_DAMAGE, oldBaseDamage,
					baseDamage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GamePackage.TOWER_CARD__PRICE:
			return getPrice();
		case GamePackage.TOWER_CARD__BASE_DAMAGE:
			return getBaseDamage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case GamePackage.TOWER_CARD__PRICE:
			setPrice((Long) newValue);
			return;
		case GamePackage.TOWER_CARD__BASE_DAMAGE:
			setBaseDamage((Long) newValue);
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
		case GamePackage.TOWER_CARD__PRICE:
			setPrice(PRICE_EDEFAULT);
			return;
		case GamePackage.TOWER_CARD__BASE_DAMAGE:
			setBaseDamage(BASE_DAMAGE_EDEFAULT);
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
		case GamePackage.TOWER_CARD__PRICE:
			return price != PRICE_EDEFAULT;
		case GamePackage.TOWER_CARD__BASE_DAMAGE:
			return baseDamage != BASE_DAMAGE_EDEFAULT;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (price: ");
		result.append(price);
		result.append(", baseDamage: ");
		result.append(baseDamage);
		result.append(')');
		return result.toString();
	}

} //TowerCardImpl
