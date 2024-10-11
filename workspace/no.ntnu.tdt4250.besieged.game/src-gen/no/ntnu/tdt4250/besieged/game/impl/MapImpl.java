/**
 */
package no.ntnu.tdt4250.besieged.game.impl;

import java.util.Collection;
import no.ntnu.tdt4250.besieged.game.EnemyWave;
import no.ntnu.tdt4250.besieged.game.GamePackage;
import no.ntnu.tdt4250.besieged.game.Map;
import no.ntnu.tdt4250.besieged.game.Tile;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.impl.MapImpl#getTiles <em>Tiles</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.impl.MapImpl#getEnemywaves <em>Enemywaves</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.impl.MapImpl#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.impl.MapImpl#getCurrentWaveNumber <em>Current Wave Number</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.impl.MapImpl#isIsWaveCompleted <em>Is Wave Completed</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.impl.MapImpl#isAllWavesCompleted <em>All Waves Completed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MapImpl extends MinimalEObjectImpl.Container implements Map {
	/**
	 * The cached value of the '{@link #getTiles() <em>Tiles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiles()
	 * @generated
	 * @ordered
	 */
	protected EList<Tile> tiles;

	/**
	 * The cached value of the '{@link #getEnemywaves() <em>Enemywaves</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnemywaves()
	 * @generated
	 * @ordered
	 */
	protected EList<EnemyWave> enemywaves;

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
	 * The default value of the '{@link #getCurrentWaveNumber() <em>Current Wave Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentWaveNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int CURRENT_WAVE_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCurrentWaveNumber() <em>Current Wave Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentWaveNumber()
	 * @generated
	 * @ordered
	 */
	protected int currentWaveNumber = CURRENT_WAVE_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsWaveCompleted() <em>Is Wave Completed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsWaveCompleted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_WAVE_COMPLETED_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isAllWavesCompleted() <em>All Waves Completed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllWavesCompleted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALL_WAVES_COMPLETED_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamePackage.Literals.MAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Tile> getTiles() {
		if (tiles == null) {
			tiles = new EObjectContainmentEList<Tile>(Tile.class, this, GamePackage.MAP__TILES);
		}
		return tiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EnemyWave> getEnemywaves() {
		if (enemywaves == null) {
			enemywaves = new EObjectContainmentEList<EnemyWave>(EnemyWave.class, this, GamePackage.MAP__ENEMYWAVES);
		}
		return enemywaves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.MAP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCurrentWaveNumber() {
		return currentWaveNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrentWaveNumber(int newCurrentWaveNumber) {
		int oldCurrentWaveNumber = currentWaveNumber;
		currentWaveNumber = newCurrentWaveNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.MAP__CURRENT_WAVE_NUMBER,
					oldCurrentWaveNumber, currentWaveNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isIsWaveCompleted() {
		boolean completed = this.getEnemywaves().size() > 0
				&& this.getEnemywaves().get(this.getCurrentWaveNumber()).getNumRemainingEnemies() == 0;
		return completed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isAllWavesCompleted() {
		return this.getCurrentWaveNumber() == this.enemywaves.size() - 1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GamePackage.MAP__TILES:
			return ((InternalEList<?>) getTiles()).basicRemove(otherEnd, msgs);
		case GamePackage.MAP__ENEMYWAVES:
			return ((InternalEList<?>) getEnemywaves()).basicRemove(otherEnd, msgs);
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
		case GamePackage.MAP__TILES:
			return getTiles();
		case GamePackage.MAP__ENEMYWAVES:
			return getEnemywaves();
		case GamePackage.MAP__NAME:
			return getName();
		case GamePackage.MAP__CURRENT_WAVE_NUMBER:
			return getCurrentWaveNumber();
		case GamePackage.MAP__IS_WAVE_COMPLETED:
			return isIsWaveCompleted();
		case GamePackage.MAP__ALL_WAVES_COMPLETED:
			return isAllWavesCompleted();
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
		case GamePackage.MAP__TILES:
			getTiles().clear();
			getTiles().addAll((Collection<? extends Tile>) newValue);
			return;
		case GamePackage.MAP__ENEMYWAVES:
			getEnemywaves().clear();
			getEnemywaves().addAll((Collection<? extends EnemyWave>) newValue);
			return;
		case GamePackage.MAP__NAME:
			setName((String) newValue);
			return;
		case GamePackage.MAP__CURRENT_WAVE_NUMBER:
			setCurrentWaveNumber((Integer) newValue);
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
		case GamePackage.MAP__TILES:
			getTiles().clear();
			return;
		case GamePackage.MAP__ENEMYWAVES:
			getEnemywaves().clear();
			return;
		case GamePackage.MAP__NAME:
			setName(NAME_EDEFAULT);
			return;
		case GamePackage.MAP__CURRENT_WAVE_NUMBER:
			setCurrentWaveNumber(CURRENT_WAVE_NUMBER_EDEFAULT);
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
		case GamePackage.MAP__TILES:
			return tiles != null && !tiles.isEmpty();
		case GamePackage.MAP__ENEMYWAVES:
			return enemywaves != null && !enemywaves.isEmpty();
		case GamePackage.MAP__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case GamePackage.MAP__CURRENT_WAVE_NUMBER:
			return currentWaveNumber != CURRENT_WAVE_NUMBER_EDEFAULT;
		case GamePackage.MAP__IS_WAVE_COMPLETED:
			return isIsWaveCompleted() != IS_WAVE_COMPLETED_EDEFAULT;
		case GamePackage.MAP__ALL_WAVES_COMPLETED:
			return isAllWavesCompleted() != ALL_WAVES_COMPLETED_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", currentWaveNumber: ");
		result.append(currentWaveNumber);
		result.append(')');
		return result.toString();
	}

} //MapImpl
