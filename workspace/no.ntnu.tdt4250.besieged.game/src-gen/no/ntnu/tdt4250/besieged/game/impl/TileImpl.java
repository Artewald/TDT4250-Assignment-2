/**
 */
package no.ntnu.tdt4250.besieged.game.impl;

import java.util.Collection;
import no.ntnu.tdt4250.besieged.game.GamePackage;
import no.ntnu.tdt4250.besieged.game.Position;
import no.ntnu.tdt4250.besieged.game.Tile;
import no.ntnu.tdt4250.besieged.game.TileType;
import no.ntnu.tdt4250.besieged.game.Tower;
import no.ntnu.tdt4250.besieged.game.TowerCard;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.impl.TileImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.impl.TileImpl#getNeighbours <em>Neighbours</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.impl.TileImpl#getTowercard <em>Towercard</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.impl.TileImpl#getTower <em>Tower</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.impl.TileImpl#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.impl.TileImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TileImpl extends MinimalEObjectImpl.Container implements Tile {
	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected Position position;

	/**
	 * The cached value of the '{@link #getNeighbours() <em>Neighbours</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeighbours()
	 * @generated
	 * @ordered
	 */
	protected EList<Tile> neighbours;

	/**
	 * The cached value of the '{@link #getTowercard() <em>Towercard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTowercard()
	 * @generated
	 * @ordered
	 */
	protected TowerCard towercard;

	/**
	 * The cached value of the '{@link #getTower() <em>Tower</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTower()
	 * @generated
	 * @ordered
	 */
	protected Tower tower;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TileType TYPE_EDEFAULT = TileType.GROUND;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TileType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamePackage.Literals.TILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TileType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(TileType newType) {
		TileType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.TILE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Position getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPosition(Position newPosition, NotificationChain msgs) {
		Position oldPosition = position;
		position = newPosition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GamePackage.TILE__POSITION,
					oldPosition, newPosition);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPosition(Position newPosition) {
		if (newPosition != position) {
			NotificationChain msgs = null;
			if (position != null)
				msgs = ((InternalEObject) position).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GamePackage.TILE__POSITION, null, msgs);
			if (newPosition != null)
				msgs = ((InternalEObject) newPosition).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GamePackage.TILE__POSITION, null, msgs);
			msgs = basicSetPosition(newPosition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.TILE__POSITION, newPosition,
					newPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Tile> getNeighbours() {
		if (neighbours == null) {
			neighbours = new EObjectResolvingEList<Tile>(Tile.class, this, GamePackage.TILE__NEIGHBOURS);
		}
		return neighbours;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TowerCard getTowercard() {
		return towercard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTowercard(TowerCard newTowercard, NotificationChain msgs) {
		TowerCard oldTowercard = towercard;
		towercard = newTowercard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GamePackage.TILE__TOWERCARD,
					oldTowercard, newTowercard);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTowercard(TowerCard newTowercard) {
		if (newTowercard != towercard) {
			NotificationChain msgs = null;
			if (towercard != null)
				msgs = ((InternalEObject) towercard).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GamePackage.TILE__TOWERCARD, null, msgs);
			if (newTowercard != null)
				msgs = ((InternalEObject) newTowercard).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GamePackage.TILE__TOWERCARD, null, msgs);
			msgs = basicSetTowercard(newTowercard, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.TILE__TOWERCARD, newTowercard,
					newTowercard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tower getTower() {
		return tower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTower(Tower newTower, NotificationChain msgs) {
		Tower oldTower = tower;
		tower = newTower;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GamePackage.TILE__TOWER,
					oldTower, newTower);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTower(Tower newTower) {
		if (newTower != tower) {
			NotificationChain msgs = null;
			if (tower != null)
				msgs = ((InternalEObject) tower).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GamePackage.TILE__TOWER,
						null, msgs);
			if (newTower != null)
				msgs = ((InternalEObject) newTower).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GamePackage.TILE__TOWER,
						null, msgs);
			msgs = basicSetTower(newTower, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.TILE__TOWER, newTower, newTower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getName() {
		String positionName = "No-Position";

		if (this.getPosition() != null) {
			positionName = this.getPosition().getName();
		}

		return String.valueOf(this.getType()) + "_" + positionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GamePackage.TILE__POSITION:
			return basicSetPosition(null, msgs);
		case GamePackage.TILE__TOWERCARD:
			return basicSetTowercard(null, msgs);
		case GamePackage.TILE__TOWER:
			return basicSetTower(null, msgs);
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
		case GamePackage.TILE__POSITION:
			return getPosition();
		case GamePackage.TILE__NEIGHBOURS:
			return getNeighbours();
		case GamePackage.TILE__TOWERCARD:
			return getTowercard();
		case GamePackage.TILE__TOWER:
			return getTower();
		case GamePackage.TILE__NAME:
			return getName();
		case GamePackage.TILE__TYPE:
			return getType();
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
		case GamePackage.TILE__POSITION:
			setPosition((Position) newValue);
			return;
		case GamePackage.TILE__NEIGHBOURS:
			getNeighbours().clear();
			getNeighbours().addAll((Collection<? extends Tile>) newValue);
			return;
		case GamePackage.TILE__TOWERCARD:
			setTowercard((TowerCard) newValue);
			return;
		case GamePackage.TILE__TOWER:
			setTower((Tower) newValue);
			return;
		case GamePackage.TILE__TYPE:
			setType((TileType) newValue);
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
		case GamePackage.TILE__POSITION:
			setPosition((Position) null);
			return;
		case GamePackage.TILE__NEIGHBOURS:
			getNeighbours().clear();
			return;
		case GamePackage.TILE__TOWERCARD:
			setTowercard((TowerCard) null);
			return;
		case GamePackage.TILE__TOWER:
			setTower((Tower) null);
			return;
		case GamePackage.TILE__TYPE:
			setType(TYPE_EDEFAULT);
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
		case GamePackage.TILE__POSITION:
			return position != null;
		case GamePackage.TILE__NEIGHBOURS:
			return neighbours != null && !neighbours.isEmpty();
		case GamePackage.TILE__TOWERCARD:
			return towercard != null;
		case GamePackage.TILE__TOWER:
			return tower != null;
		case GamePackage.TILE__NAME:
			return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
		case GamePackage.TILE__TYPE:
			return type != TYPE_EDEFAULT;
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //TileImpl
