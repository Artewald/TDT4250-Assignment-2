/**
 */
package no.ntnu.tdt4250.besieged.game.util;

import no.ntnu.tdt4250.besieged.game.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see no.ntnu.tdt4250.besieged.game.GamePackage
 * @generated
 */
public class GameSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GamePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameSwitch() {
		if (modelPackage == null) {
			modelPackage = GamePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case GamePackage.GAME: {
			Game game = (Game) theEObject;
			T result = caseGame(game);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GamePackage.PLAYER: {
			Player player = (Player) theEObject;
			T result = casePlayer(player);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GamePackage.MAP: {
			Map map = (Map) theEObject;
			T result = caseMap(map);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GamePackage.ENEMY: {
			Enemy enemy = (Enemy) theEObject;
			T result = caseEnemy(enemy);
			if (result == null)
				result = caseGameEntity(enemy);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GamePackage.TOWER_CARD: {
			TowerCard towerCard = (TowerCard) theEObject;
			T result = caseTowerCard(towerCard);
			if (result == null)
				result = caseGameEntity(towerCard);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GamePackage.TOWER: {
			Tower tower = (Tower) theEObject;
			T result = caseTower(tower);
			if (result == null)
				result = caseGameEntity(tower);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GamePackage.TILE: {
			Tile tile = (Tile) theEObject;
			T result = caseTile(tile);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GamePackage.ENEMY_WAVE: {
			EnemyWave enemyWave = (EnemyWave) theEObject;
			T result = caseEnemyWave(enemyWave);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GamePackage.POSITION: {
			Position position = (Position) theEObject;
			T result = casePosition(position);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GamePackage.GAME_ENTITY: {
			GameEntity gameEntity = (GameEntity) theEObject;
			T result = caseGameEntity(gameEntity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GamePackage.START_PATH_TILE: {
			StartPathTile startPathTile = (StartPathTile) theEObject;
			T result = caseStartPathTile(startPathTile);
			if (result == null)
				result = casePathTile(startPathTile);
			if (result == null)
				result = caseTile(startPathTile);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GamePackage.END_PATH_TILE: {
			EndPathTile endPathTile = (EndPathTile) theEObject;
			T result = caseEndPathTile(endPathTile);
			if (result == null)
				result = casePathTile(endPathTile);
			if (result == null)
				result = caseTile(endPathTile);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GamePackage.PATH_TILE: {
			PathTile pathTile = (PathTile) theEObject;
			T result = casePathTile(pathTile);
			if (result == null)
				result = caseTile(pathTile);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GamePackage.CONNECTING_PATH_TILE: {
			ConnectingPathTile connectingPathTile = (ConnectingPathTile) theEObject;
			T result = caseConnectingPathTile(connectingPathTile);
			if (result == null)
				result = casePathTile(connectingPathTile);
			if (result == null)
				result = caseTile(connectingPathTile);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Game</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Game</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGame(Game object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Player</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Player</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlayer(Player object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMap(Map object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enemy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enemy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnemy(Enemy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tower Card</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tower Card</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTowerCard(TowerCard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tower</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tower</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTower(Tower object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTile(Tile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enemy Wave</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enemy Wave</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnemyWave(EnemyWave object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePosition(Position object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGameEntity(GameEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Path Tile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Path Tile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartPathTile(StartPathTile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Path Tile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Path Tile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndPathTile(EndPathTile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Tile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Tile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathTile(PathTile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connecting Path Tile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connecting Path Tile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectingPathTile(ConnectingPathTile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GameSwitch
