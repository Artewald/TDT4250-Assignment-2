/**
 */
package no.ntnu.tdt4250.besieged.game.impl;

import java.util.Collection;
import no.ntnu.tdt4250.besieged.game.Game;
import no.ntnu.tdt4250.besieged.game.GameMode;
import no.ntnu.tdt4250.besieged.game.GamePackage;
import no.ntnu.tdt4250.besieged.game.Map;
import no.ntnu.tdt4250.besieged.game.Player;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.impl.GameImpl#getPlayers <em>Players</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.impl.GameImpl#getGameID <em>Game ID</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.impl.GameImpl#getMap <em>Map</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.impl.GameImpl#getGameMode <em>Game Mode</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.impl.GameImpl#getMoney <em>Money</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.impl.GameImpl#getVillageHealth <em>Village Health</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.impl.GameImpl#getNumPlayers <em>Num Players</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameImpl extends MinimalEObjectImpl.Container implements Game {
	/**
	 * The cached value of the '{@link #getPlayers() <em>Players</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayers()
	 * @generated
	 * @ordered
	 */
	protected EList<Player> players;

	/**
	 * The default value of the '{@link #getGameID() <em>Game ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameID()
	 * @generated
	 * @ordered
	 */
	protected static final String GAME_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGameID() <em>Game ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameID()
	 * @generated
	 * @ordered
	 */
	protected String gameID = GAME_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMap() <em>Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMap()
	 * @generated
	 * @ordered
	 */
	protected Map map;

	/**
	 * The default value of the '{@link #getGameMode() <em>Game Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameMode()
	 * @generated
	 * @ordered
	 */
	protected static final GameMode GAME_MODE_EDEFAULT = GameMode.MULTIPLAYER;

	/**
	 * The cached value of the '{@link #getGameMode() <em>Game Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGameMode()
	 * @generated
	 * @ordered
	 */
	protected GameMode gameMode = GAME_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMoney() <em>Money</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoney()
	 * @generated
	 * @ordered
	 */
	protected static final long MONEY_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMoney() <em>Money</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoney()
	 * @generated
	 * @ordered
	 */
	protected long money = MONEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getVillageHealth() <em>Village Health</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVillageHealth()
	 * @generated
	 * @ordered
	 */
	protected static final long VILLAGE_HEALTH_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getVillageHealth() <em>Village Health</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVillageHealth()
	 * @generated
	 * @ordered
	 */
	protected long villageHealth = VILLAGE_HEALTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumPlayers() <em>Num Players</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumPlayers()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_PLAYERS_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GamePackage.Literals.GAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getVillageHealth() {
		return villageHealth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVillageHealth(long newVillageHealth) {
		long oldVillageHealth = villageHealth;
		villageHealth = newVillageHealth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.GAME__VILLAGE_HEALTH, oldVillageHealth,
					villageHealth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getMoney() {
		return money;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMoney(long newMoney) {
		long oldMoney = money;
		money = newMoney;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.GAME__MONEY, oldMoney, money));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Player> getPlayers() {
		if (players == null) {
			players = new EObjectContainmentWithInverseEList<Player>(Player.class, this, GamePackage.GAME__PLAYERS,
					GamePackage.PLAYER__GAME);
		}
		return players;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public int getNumPlayers() {
		return this.players.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGameID() {
		return gameID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGameID(String newGameID) {
		String oldGameID = gameID;
		gameID = newGameID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.GAME__GAME_ID, oldGameID, gameID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Map getMap() {
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMap(Map newMap, NotificationChain msgs) {
		Map oldMap = map;
		map = newMap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GamePackage.GAME__MAP,
					oldMap, newMap);
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
	public void setMap(Map newMap) {
		if (newMap != map) {
			NotificationChain msgs = null;
			if (map != null)
				msgs = ((InternalEObject) map).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GamePackage.GAME__MAP,
						null, msgs);
			if (newMap != null)
				msgs = ((InternalEObject) newMap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GamePackage.GAME__MAP,
						null, msgs);
			msgs = basicSetMap(newMap, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.GAME__MAP, newMap, newMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GameMode getGameMode() {
		return gameMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGameMode(GameMode newGameMode) {
		GameMode oldGameMode = gameMode;
		gameMode = newGameMode == null ? GAME_MODE_EDEFAULT : newGameMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GamePackage.GAME__GAME_MODE, oldGameMode, gameMode));
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
		case GamePackage.GAME__PLAYERS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPlayers()).basicAdd(otherEnd, msgs);
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
		case GamePackage.GAME__PLAYERS:
			return ((InternalEList<?>) getPlayers()).basicRemove(otherEnd, msgs);
		case GamePackage.GAME__MAP:
			return basicSetMap(null, msgs);
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
		case GamePackage.GAME__PLAYERS:
			return getPlayers();
		case GamePackage.GAME__GAME_ID:
			return getGameID();
		case GamePackage.GAME__MAP:
			return getMap();
		case GamePackage.GAME__GAME_MODE:
			return getGameMode();
		case GamePackage.GAME__MONEY:
			return getMoney();
		case GamePackage.GAME__VILLAGE_HEALTH:
			return getVillageHealth();
		case GamePackage.GAME__NUM_PLAYERS:
			return getNumPlayers();
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
		case GamePackage.GAME__PLAYERS:
			getPlayers().clear();
			getPlayers().addAll((Collection<? extends Player>) newValue);
			return;
		case GamePackage.GAME__GAME_ID:
			setGameID((String) newValue);
			return;
		case GamePackage.GAME__MAP:
			setMap((Map) newValue);
			return;
		case GamePackage.GAME__GAME_MODE:
			setGameMode((GameMode) newValue);
			return;
		case GamePackage.GAME__MONEY:
			setMoney((Long) newValue);
			return;
		case GamePackage.GAME__VILLAGE_HEALTH:
			setVillageHealth((Long) newValue);
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
		case GamePackage.GAME__PLAYERS:
			getPlayers().clear();
			return;
		case GamePackage.GAME__GAME_ID:
			setGameID(GAME_ID_EDEFAULT);
			return;
		case GamePackage.GAME__MAP:
			setMap((Map) null);
			return;
		case GamePackage.GAME__GAME_MODE:
			setGameMode(GAME_MODE_EDEFAULT);
			return;
		case GamePackage.GAME__MONEY:
			setMoney(MONEY_EDEFAULT);
			return;
		case GamePackage.GAME__VILLAGE_HEALTH:
			setVillageHealth(VILLAGE_HEALTH_EDEFAULT);
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
		case GamePackage.GAME__PLAYERS:
			return players != null && !players.isEmpty();
		case GamePackage.GAME__GAME_ID:
			return GAME_ID_EDEFAULT == null ? gameID != null : !GAME_ID_EDEFAULT.equals(gameID);
		case GamePackage.GAME__MAP:
			return map != null;
		case GamePackage.GAME__GAME_MODE:
			return gameMode != GAME_MODE_EDEFAULT;
		case GamePackage.GAME__MONEY:
			return money != MONEY_EDEFAULT;
		case GamePackage.GAME__VILLAGE_HEALTH:
			return villageHealth != VILLAGE_HEALTH_EDEFAULT;
		case GamePackage.GAME__NUM_PLAYERS:
			return getNumPlayers() != NUM_PLAYERS_EDEFAULT;
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
		result.append(" (gameID: ");
		result.append(gameID);
		result.append(", gameMode: ");
		result.append(gameMode);
		result.append(", money: ");
		result.append(money);
		result.append(", villageHealth: ");
		result.append(villageHealth);
		result.append(')');
		return result.toString();
	}

} //GameImpl
