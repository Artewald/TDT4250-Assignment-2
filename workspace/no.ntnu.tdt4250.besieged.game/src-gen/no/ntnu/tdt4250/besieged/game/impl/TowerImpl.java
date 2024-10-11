/**
 */
package no.ntnu.tdt4250.besieged.game.impl;

import java.util.Collection;
import no.ntnu.tdt4250.besieged.game.GamePackage;
import no.ntnu.tdt4250.besieged.game.Tower;
import no.ntnu.tdt4250.besieged.game.TowerCard;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tower</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.impl.TowerImpl#getTowercards <em>Towercards</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.impl.TowerImpl#getDamage <em>Damage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TowerImpl extends GameEntityImpl implements Tower {
	/**
	 * The cached value of the '{@link #getTowercards() <em>Towercards</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTowercards()
	 * @generated
	 * @ordered
	 */
	protected EList<TowerCard> towercards;

	/**
	 * The default value of the '{@link #getDamage() <em>Damage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDamage()
	 * @generated
	 * @ordered
	 */
	protected static final long DAMAGE_EDEFAULT = 0L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TowerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamePackage.Literals.TOWER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TowerCard> getTowercards() {
		if (towercards == null) {
			towercards = new EObjectContainmentEList<TowerCard>(TowerCard.class, this, GamePackage.TOWER__TOWERCARDS);
		}
		return towercards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public long getDamage() {
		long damage = 0;

		for (TowerCard t : this.getTowercards()) {
			damage += t.getBaseDamage();
		}

		return damage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GamePackage.TOWER__TOWERCARDS:
			return ((InternalEList<?>) getTowercards()).basicRemove(otherEnd, msgs);
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
		case GamePackage.TOWER__TOWERCARDS:
			return getTowercards();
		case GamePackage.TOWER__DAMAGE:
			return getDamage();
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
		case GamePackage.TOWER__TOWERCARDS:
			getTowercards().clear();
			getTowercards().addAll((Collection<? extends TowerCard>) newValue);
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
		case GamePackage.TOWER__TOWERCARDS:
			getTowercards().clear();
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
		case GamePackage.TOWER__TOWERCARDS:
			return towercards != null && !towercards.isEmpty();
		case GamePackage.TOWER__DAMAGE:
			return getDamage() != DAMAGE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //TowerImpl
