/**
 */
package no.ntnu.tdt4250.besieged.game.impl;

import no.ntnu.tdt4250.besieged.game.Enemy;
import no.ntnu.tdt4250.besieged.game.EnemyWave;
import no.ntnu.tdt4250.besieged.game.GamePackage;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enemy Wave</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.impl.EnemyWaveImpl#getEnemies <em>Enemies</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.impl.EnemyWaveImpl#getTotalValue <em>Total Value</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.impl.EnemyWaveImpl#getNumRemainingEnemies <em>Num Remaining Enemies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnemyWaveImpl extends MinimalEObjectImpl.Container implements EnemyWave {
	/**
	 * The cached value of the '{@link #getEnemies() <em>Enemies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnemies()
	 * @generated
	 * @ordered
	 */
	protected EList<Enemy> enemies;

	/**
	 * The default value of the '{@link #getTotalValue() <em>Total Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalValue()
	 * @generated
	 * @ordered
	 */
	protected static final long TOTAL_VALUE_EDEFAULT = 0L;

	/**
	 * The default value of the '{@link #getNumRemainingEnemies() <em>Num Remaining Enemies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumRemainingEnemies()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_REMAINING_ENEMIES_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnemyWaveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamePackage.Literals.ENEMY_WAVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Enemy> getEnemies() {
		if (enemies == null) {
			enemies = new EObjectContainmentEList<Enemy>(Enemy.class, this, GamePackage.ENEMY_WAVE__ENEMIES);
		}
		return enemies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public long getTotalValue() {
		long sum = 0L;

		for (Enemy enemy : this.getEnemies()) {
			sum += enemy.getValue();
		}

		return sum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public int getNumRemainingEnemies() {
		// I kept this function so that for example enemies could be created over a time period, so the enemies list would contain the remaining enemies.
		// However, I realize that the current implementation is not more different than just using getEnemies().size() elsewhere.
		// I kept it to mainly show that more complex logic could be given here.
		return this.getEnemies().size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GamePackage.ENEMY_WAVE__ENEMIES:
			return ((InternalEList<?>) getEnemies()).basicRemove(otherEnd, msgs);
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
		case GamePackage.ENEMY_WAVE__ENEMIES:
			return getEnemies();
		case GamePackage.ENEMY_WAVE__TOTAL_VALUE:
			return getTotalValue();
		case GamePackage.ENEMY_WAVE__NUM_REMAINING_ENEMIES:
			return getNumRemainingEnemies();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case GamePackage.ENEMY_WAVE__ENEMIES:
			return enemies != null && !enemies.isEmpty();
		case GamePackage.ENEMY_WAVE__TOTAL_VALUE:
			return getTotalValue() != TOTAL_VALUE_EDEFAULT;
		case GamePackage.ENEMY_WAVE__NUM_REMAINING_ENEMIES:
			return getNumRemainingEnemies() != NUM_REMAINING_ENEMIES_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //EnemyWaveImpl
