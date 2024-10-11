/**
 */
package no.ntnu.tdt4250.besieged.game;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see no.ntnu.tdt4250.besieged.game.GameFactory
 * @model kind="package"
 * @generated
 */
public interface GamePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "game";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ntnu.no/TDT4250/Besieged/game";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "game";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GamePackage eINSTANCE = no.ntnu.tdt4250.besieged.game.impl.GamePackageImpl.init();

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.besieged.game.impl.GameImpl <em>Game</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.besieged.game.impl.GameImpl
	 * @see no.ntnu.tdt4250.besieged.game.impl.GamePackageImpl#getGame()
	 * @generated
	 */
	int GAME = 0;

	/**
	 * The feature id for the '<em><b>Players</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__PLAYERS = 0;

	/**
	 * The feature id for the '<em><b>Game ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__GAME_ID = 1;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__MAP = 2;

	/**
	 * The feature id for the '<em><b>Game Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__GAME_MODE = 3;

	/**
	 * The feature id for the '<em><b>Money</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__MONEY = 4;

	/**
	 * The feature id for the '<em><b>Village Health</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__VILLAGE_HEALTH = 5;

	/**
	 * The feature id for the '<em><b>Num Players</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME__NUM_PLAYERS = 6;

	/**
	 * The number of structural features of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Game</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.besieged.game.impl.PlayerImpl <em>Player</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.besieged.game.impl.PlayerImpl
	 * @see no.ntnu.tdt4250.besieged.game.impl.GamePackageImpl#getPlayer()
	 * @generated
	 */
	int PLAYER = 1;

	/**
	 * The feature id for the '<em><b>Game</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__GAME = 0;

	/**
	 * The feature id for the '<em><b>Player Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__PLAYER_NAME = 1;

	/**
	 * The number of structural features of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.besieged.game.impl.MapImpl <em>Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.besieged.game.impl.MapImpl
	 * @see no.ntnu.tdt4250.besieged.game.impl.GamePackageImpl#getMap()
	 * @generated
	 */
	int MAP = 2;

	/**
	 * The feature id for the '<em><b>Tiles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__TILES = 0;

	/**
	 * The feature id for the '<em><b>Enemywaves</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__ENEMYWAVES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__NAME = 2;

	/**
	 * The feature id for the '<em><b>Current Wave Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__CURRENT_WAVE_NUMBER = 3;

	/**
	 * The feature id for the '<em><b>Is Wave Completed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__IS_WAVE_COMPLETED = 4;

	/**
	 * The feature id for the '<em><b>All Waves Completed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__ALL_WAVES_COMPLETED = 5;

	/**
	 * The number of structural features of the '<em>Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.besieged.game.impl.GameEntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.besieged.game.impl.GameEntityImpl
	 * @see no.ntnu.tdt4250.besieged.game.impl.GamePackageImpl#getGameEntity()
	 * @generated
	 */
	int GAME_ENTITY = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_ENTITY__NAME = 0;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_ENTITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.besieged.game.impl.EnemyImpl <em>Enemy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.besieged.game.impl.EnemyImpl
	 * @see no.ntnu.tdt4250.besieged.game.impl.GamePackageImpl#getEnemy()
	 * @generated
	 */
	int ENEMY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY__NAME = GAME_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY__VALUE = GAME_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY__POSITION = GAME_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Damage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY__DAMAGE = GAME_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Health</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY__HEALTH = GAME_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Enemy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY_FEATURE_COUNT = GAME_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Enemy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY_OPERATION_COUNT = GAME_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.besieged.game.impl.TowerCardImpl <em>Tower Card</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.besieged.game.impl.TowerCardImpl
	 * @see no.ntnu.tdt4250.besieged.game.impl.GamePackageImpl#getTowerCard()
	 * @generated
	 */
	int TOWER_CARD = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWER_CARD__NAME = GAME_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWER_CARD__PRICE = GAME_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Damage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWER_CARD__BASE_DAMAGE = GAME_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tower Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWER_CARD_FEATURE_COUNT = GAME_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Tower Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWER_CARD_OPERATION_COUNT = GAME_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.besieged.game.impl.TowerImpl <em>Tower</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.besieged.game.impl.TowerImpl
	 * @see no.ntnu.tdt4250.besieged.game.impl.GamePackageImpl#getTower()
	 * @generated
	 */
	int TOWER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWER__NAME = GAME_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Towercards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWER__TOWERCARDS = GAME_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Damage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWER__DAMAGE = GAME_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Tower</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWER_FEATURE_COUNT = GAME_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Tower</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOWER_OPERATION_COUNT = GAME_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.besieged.game.impl.TileImpl <em>Tile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.besieged.game.impl.TileImpl
	 * @see no.ntnu.tdt4250.besieged.game.impl.GamePackageImpl#getTile()
	 * @generated
	 */
	int TILE = 6;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__POSITION = 0;

	/**
	 * The feature id for the '<em><b>Neighbours</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__NEIGHBOURS = 1;

	/**
	 * The feature id for the '<em><b>Towercard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__TOWERCARD = 2;

	/**
	 * The feature id for the '<em><b>Tower</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__TOWER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__NAME = 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE__TYPE = 5;

	/**
	 * The number of structural features of the '<em>Tile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Tile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.besieged.game.impl.EnemyWaveImpl <em>Enemy Wave</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.besieged.game.impl.EnemyWaveImpl
	 * @see no.ntnu.tdt4250.besieged.game.impl.GamePackageImpl#getEnemyWave()
	 * @generated
	 */
	int ENEMY_WAVE = 7;

	/**
	 * The feature id for the '<em><b>Enemies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY_WAVE__ENEMIES = 0;

	/**
	 * The feature id for the '<em><b>Total Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY_WAVE__TOTAL_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Num Remaining Enemies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY_WAVE__NUM_REMAINING_ENEMIES = 2;

	/**
	 * The number of structural features of the '<em>Enemy Wave</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY_WAVE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Enemy Wave</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENEMY_WAVE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.besieged.game.impl.PositionImpl <em>Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.besieged.game.impl.PositionImpl
	 * @see no.ntnu.tdt4250.besieged.game.impl.GamePackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__X = 1;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__Y = 2;

	/**
	 * The number of structural features of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.besieged.game.impl.StartPathTileImpl <em>Start Path Tile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.besieged.game.impl.StartPathTileImpl
	 * @see no.ntnu.tdt4250.besieged.game.impl.GamePackageImpl#getStartPathTile()
	 * @generated
	 */
	int START_PATH_TILE = 10;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.besieged.game.impl.EndPathTileImpl <em>End Path Tile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.besieged.game.impl.EndPathTileImpl
	 * @see no.ntnu.tdt4250.besieged.game.impl.GamePackageImpl#getEndPathTile()
	 * @generated
	 */
	int END_PATH_TILE = 11;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.besieged.game.impl.ConnectingPathTileImpl <em>Connecting Path Tile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.besieged.game.impl.ConnectingPathTileImpl
	 * @see no.ntnu.tdt4250.besieged.game.impl.GamePackageImpl#getConnectingPathTile()
	 * @generated
	 */
	int CONNECTING_PATH_TILE = 13;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.besieged.game.impl.PathTileImpl <em>Path Tile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.besieged.game.impl.PathTileImpl
	 * @see no.ntnu.tdt4250.besieged.game.impl.GamePackageImpl#getPathTile()
	 * @generated
	 */
	int PATH_TILE = 12;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_TILE__POSITION = TILE__POSITION;

	/**
	 * The feature id for the '<em><b>Neighbours</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_TILE__NEIGHBOURS = TILE__NEIGHBOURS;

	/**
	 * The feature id for the '<em><b>Towercard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_TILE__TOWERCARD = TILE__TOWERCARD;

	/**
	 * The feature id for the '<em><b>Tower</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_TILE__TOWER = TILE__TOWER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_TILE__NAME = TILE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_TILE__TYPE = TILE__TYPE;

	/**
	 * The number of structural features of the '<em>Path Tile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_TILE_FEATURE_COUNT = TILE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Path Tile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_TILE_OPERATION_COUNT = TILE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_PATH_TILE__POSITION = PATH_TILE__POSITION;

	/**
	 * The feature id for the '<em><b>Neighbours</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_PATH_TILE__NEIGHBOURS = PATH_TILE__NEIGHBOURS;

	/**
	 * The feature id for the '<em><b>Towercard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_PATH_TILE__TOWERCARD = PATH_TILE__TOWERCARD;

	/**
	 * The feature id for the '<em><b>Tower</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_PATH_TILE__TOWER = PATH_TILE__TOWER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_PATH_TILE__NAME = PATH_TILE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_PATH_TILE__TYPE = PATH_TILE__TYPE;

	/**
	 * The number of structural features of the '<em>Start Path Tile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_PATH_TILE_FEATURE_COUNT = PATH_TILE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Start Path Tile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_PATH_TILE_OPERATION_COUNT = PATH_TILE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PATH_TILE__POSITION = PATH_TILE__POSITION;

	/**
	 * The feature id for the '<em><b>Neighbours</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PATH_TILE__NEIGHBOURS = PATH_TILE__NEIGHBOURS;

	/**
	 * The feature id for the '<em><b>Towercard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PATH_TILE__TOWERCARD = PATH_TILE__TOWERCARD;

	/**
	 * The feature id for the '<em><b>Tower</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PATH_TILE__TOWER = PATH_TILE__TOWER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PATH_TILE__NAME = PATH_TILE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PATH_TILE__TYPE = PATH_TILE__TYPE;

	/**
	 * The number of structural features of the '<em>End Path Tile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PATH_TILE_FEATURE_COUNT = PATH_TILE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>End Path Tile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_PATH_TILE_OPERATION_COUNT = PATH_TILE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTING_PATH_TILE__POSITION = PATH_TILE__POSITION;

	/**
	 * The feature id for the '<em><b>Neighbours</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTING_PATH_TILE__NEIGHBOURS = PATH_TILE__NEIGHBOURS;

	/**
	 * The feature id for the '<em><b>Towercard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTING_PATH_TILE__TOWERCARD = PATH_TILE__TOWERCARD;

	/**
	 * The feature id for the '<em><b>Tower</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTING_PATH_TILE__TOWER = PATH_TILE__TOWER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTING_PATH_TILE__NAME = PATH_TILE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTING_PATH_TILE__TYPE = PATH_TILE__TYPE;

	/**
	 * The number of structural features of the '<em>Connecting Path Tile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTING_PATH_TILE_FEATURE_COUNT = PATH_TILE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Connecting Path Tile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTING_PATH_TILE_OPERATION_COUNT = PATH_TILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.besieged.game.TileType <em>Tile Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.besieged.game.TileType
	 * @see no.ntnu.tdt4250.besieged.game.impl.GamePackageImpl#getTileType()
	 * @generated
	 */
	int TILE_TYPE = 14;

	/**
	 * The meta object id for the '{@link no.ntnu.tdt4250.besieged.game.GameMode <em>Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.ntnu.tdt4250.besieged.game.GameMode
	 * @see no.ntnu.tdt4250.besieged.game.impl.GamePackageImpl#getGameMode()
	 * @generated
	 */
	int GAME_MODE = 15;

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.besieged.game.Game <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game</em>'.
	 * @see no.ntnu.tdt4250.besieged.game.Game
	 * @generated
	 */
	EClass getGame();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.besieged.game.Game#getVillageHealth <em>Village Health</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Village Health</em>'.
	 * @see no.ntnu.tdt4250.besieged.game.Game#getVillageHealth()
	 * @see #getGame()
	 * @generated
	 */
	EAttribute getGame_VillageHealth();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.besieged.game.Game#getMoney <em>Money</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Money</em>'.
	 * @see no.ntnu.tdt4250.besieged.game.Game#getMoney()
	 * @see #getGame()
	 * @generated
	 */
	EAttribute getGame_Money();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.besieged.game.Game#getPlayers <em>Players</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Players</em>'.
	 * @see no.ntnu.tdt4250.besieged.game.Game#getPlayers()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Players();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.besieged.game.Game#getNumPlayers <em>Num Players</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Players</em>'.
	 * @see no.ntnu.tdt4250.besieged.game.Game#getNumPlayers()
	 * @see #getGame()
	 * @generated
	 */
	EAttribute getGame_NumPlayers();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.besieged.game.Game#getGameID <em>Game ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Game ID</em>'.
	 * @see no.ntnu.tdt4250.besieged.game.Game#getGameID()
	 * @see #getGame()
	 * @generated
	 */
	EAttribute getGame_GameID();

	/**
	 * Returns the meta object for the containment reference '{@link no.ntnu.tdt4250.besieged.game.Game#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Map</em>'.
	 * @see no.ntnu.tdt4250.besieged.game.Game#getMap()
	 * @see #getGame()
	 * @generated
	 */
	EReference getGame_Map();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.besieged.game.Game#getGameMode <em>Game Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Game Mode</em>'.
	 * @see no.ntnu.tdt4250.besieged.game.Game#getGameMode()
	 * @see #getGame()
	 * @generated
	 */
	EAttribute getGame_GameMode();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.besieged.game.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player</em>'.
	 * @see no.ntnu.tdt4250.besieged.game.Player
	 * @generated
	 */
	EClass getPlayer();

	/**
	 * Returns the meta object for the container reference '{@link no.ntnu.tdt4250.besieged.game.Player#getGame <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Game</em>'.
	 * @see no.ntnu.tdt4250.besieged.game.Player#getGame()
	 * @see #getPlayer()
	 * @generated
	 */
	EReference getPlayer_Game();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.besieged.game.Player#getPlayerName <em>Player Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Player Name</em>'.
	 * @see no.ntnu.tdt4250.besieged.game.Player#getPlayerName()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_PlayerName();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.besieged.game.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map</em>'.
	 * @see no.ntnu.tdt4250.besieged.game.Map
	 * @generated
	 */
	EClass getMap();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.besieged.game.Map#getTiles <em>Tiles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tiles</em>'.
	 * @see no.ntnu.tdt4250.besieged.game.Map#getTiles()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_Tiles();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.besieged.game.Map#getEnemywaves <em>Enemywaves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enemywaves</em>'.
	 * @see no.ntnu.tdt4250.besieged.game.Map#getEnemywaves()
	 * @see #getMap()
	 * @generated
	 */
	EReference getMap_Enemywaves();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.besieged.game.Map#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.tdt4250.besieged.game.Map#getName()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_Name();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.besieged.game.Map#getCurrentWaveNumber <em>Current Wave Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Wave Number</em>'.
	 * @see no.ntnu.tdt4250.besieged.game.Map#getCurrentWaveNumber()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_CurrentWaveNumber();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.besieged.game.Map#isIsWaveCompleted <em>Is Wave Completed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Wave Completed</em>'.
	 * @see no.ntnu.tdt4250.besieged.game.Map#isIsWaveCompleted()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_IsWaveCompleted();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.besieged.game.Map#isAllWavesCompleted <em>All Waves Completed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>All Waves Completed</em>'.
	 * @see no.ntnu.tdt4250.besieged.game.Map#isAllWavesCompleted()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_AllWavesCompleted();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.besieged.game.Enemy <em>Enemy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enemy</em>'.
	 * @see no.ntnu.tdt4250.besieged.game.Enemy
	 * @generated
	 */
	EClass getEnemy();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.besieged.game.Enemy#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see no.ntnu.tdt4250.besieged.game.Enemy#getValue()
	 * @see #getEnemy()
	 * @generated
	 */
	EAttribute getEnemy_Value();

	/**
	 * Returns the meta object for the containment reference '{@link no.ntnu.tdt4250.besieged.game.Enemy#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see no.ntnu.tdt4250.besieged.game.Enemy#getPosition()
	 * @see #getEnemy()
	 * @generated
	 */
	EReference getEnemy_Position();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.besieged.game.Enemy#getDamage <em>Damage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Damage</em>'.
	 * @see no.ntnu.tdt4250.besieged.game.Enemy#getDamage()
	 * @see #getEnemy()
	 * @generated
	 */
	EAttribute getEnemy_Damage();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.besieged.game.Enemy#getHealth <em>Health</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Health</em>'.
	 * @see no.ntnu.tdt4250.besieged.game.Enemy#getHealth()
	 * @see #getEnemy()
	 * @generated
	 */
	EAttribute getEnemy_Health();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.besieged.game.TowerCard <em>Tower Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tower Card</em>'.
	 * @see no.ntnu.tdt4250.besieged.game.TowerCard
	 * @generated
	 */
	EClass getTowerCard();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.besieged.game.TowerCard#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see no.ntnu.tdt4250.besieged.game.TowerCard#getPrice()
	 * @see #getTowerCard()
	 * @generated
	 */
	EAttribute getTowerCard_Price();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.besieged.game.TowerCard#getBaseDamage <em>Base Damage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Damage</em>'.
	 * @see no.ntnu.tdt4250.besieged.game.TowerCard#getBaseDamage()
	 * @see #getTowerCard()
	 * @generated
	 */
	EAttribute getTowerCard_BaseDamage();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.besieged.game.Tower <em>Tower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tower</em>'.
	 * @see no.ntnu.tdt4250.besieged.game.Tower
	 * @generated
	 */
	EClass getTower();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.besieged.game.Tower#getTowercards <em>Towercards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Towercards</em>'.
	 * @see no.ntnu.tdt4250.besieged.game.Tower#getTowercards()
	 * @see #getTower()
	 * @generated
	 */
	EReference getTower_Towercards();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.besieged.game.Tower#getDamage <em>Damage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Damage</em>'.
	 * @see no.ntnu.tdt4250.besieged.game.Tower#getDamage()
	 * @see #getTower()
	 * @generated
	 */
	EAttribute getTower_Damage();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.besieged.game.Tile <em>Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tile</em>'.
	 * @see no.ntnu.tdt4250.besieged.game.Tile
	 * @generated
	 */
	EClass getTile();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.besieged.game.Tile#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see no.ntnu.tdt4250.besieged.game.Tile#getType()
	 * @see #getTile()
	 * @generated
	 */
	EAttribute getTile_Type();

	/**
	 * Returns the meta object for the containment reference '{@link no.ntnu.tdt4250.besieged.game.Tile#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see no.ntnu.tdt4250.besieged.game.Tile#getPosition()
	 * @see #getTile()
	 * @generated
	 */
	EReference getTile_Position();

	/**
	 * Returns the meta object for the reference list '{@link no.ntnu.tdt4250.besieged.game.Tile#getNeighbours <em>Neighbours</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Neighbours</em>'.
	 * @see no.ntnu.tdt4250.besieged.game.Tile#getNeighbours()
	 * @see #getTile()
	 * @generated
	 */
	EReference getTile_Neighbours();

	/**
	 * Returns the meta object for the containment reference '{@link no.ntnu.tdt4250.besieged.game.Tile#getTowercard <em>Towercard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Towercard</em>'.
	 * @see no.ntnu.tdt4250.besieged.game.Tile#getTowercard()
	 * @see #getTile()
	 * @generated
	 */
	EReference getTile_Towercard();

	/**
	 * Returns the meta object for the containment reference '{@link no.ntnu.tdt4250.besieged.game.Tile#getTower <em>Tower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tower</em>'.
	 * @see no.ntnu.tdt4250.besieged.game.Tile#getTower()
	 * @see #getTile()
	 * @generated
	 */
	EReference getTile_Tower();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.besieged.game.Tile#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.tdt4250.besieged.game.Tile#getName()
	 * @see #getTile()
	 * @generated
	 */
	EAttribute getTile_Name();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.besieged.game.EnemyWave <em>Enemy Wave</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enemy Wave</em>'.
	 * @see no.ntnu.tdt4250.besieged.game.EnemyWave
	 * @generated
	 */
	EClass getEnemyWave();

	/**
	 * Returns the meta object for the containment reference list '{@link no.ntnu.tdt4250.besieged.game.EnemyWave#getEnemies <em>Enemies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enemies</em>'.
	 * @see no.ntnu.tdt4250.besieged.game.EnemyWave#getEnemies()
	 * @see #getEnemyWave()
	 * @generated
	 */
	EReference getEnemyWave_Enemies();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.besieged.game.EnemyWave#getTotalValue <em>Total Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Value</em>'.
	 * @see no.ntnu.tdt4250.besieged.game.EnemyWave#getTotalValue()
	 * @see #getEnemyWave()
	 * @generated
	 */
	EAttribute getEnemyWave_TotalValue();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.besieged.game.EnemyWave#getNumRemainingEnemies <em>Num Remaining Enemies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Remaining Enemies</em>'.
	 * @see no.ntnu.tdt4250.besieged.game.EnemyWave#getNumRemainingEnemies()
	 * @see #getEnemyWave()
	 * @generated
	 */
	EAttribute getEnemyWave_NumRemainingEnemies();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.besieged.game.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position</em>'.
	 * @see no.ntnu.tdt4250.besieged.game.Position
	 * @generated
	 */
	EClass getPosition();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.besieged.game.Position#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.tdt4250.besieged.game.Position#getName()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Name();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.besieged.game.Position#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see no.ntnu.tdt4250.besieged.game.Position#getY()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_Y();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.besieged.game.Position#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see no.ntnu.tdt4250.besieged.game.Position#getX()
	 * @see #getPosition()
	 * @generated
	 */
	EAttribute getPosition_X();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.besieged.game.GameEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see no.ntnu.tdt4250.besieged.game.GameEntity
	 * @generated
	 */
	EClass getGameEntity();

	/**
	 * Returns the meta object for the attribute '{@link no.ntnu.tdt4250.besieged.game.GameEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.ntnu.tdt4250.besieged.game.GameEntity#getName()
	 * @see #getGameEntity()
	 * @generated
	 */
	EAttribute getGameEntity_Name();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.besieged.game.StartPathTile <em>Start Path Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Path Tile</em>'.
	 * @see no.ntnu.tdt4250.besieged.game.StartPathTile
	 * @generated
	 */
	EClass getStartPathTile();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.besieged.game.EndPathTile <em>End Path Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Path Tile</em>'.
	 * @see no.ntnu.tdt4250.besieged.game.EndPathTile
	 * @generated
	 */
	EClass getEndPathTile();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.besieged.game.PathTile <em>Path Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Tile</em>'.
	 * @see no.ntnu.tdt4250.besieged.game.PathTile
	 * @generated
	 */
	EClass getPathTile();

	/**
	 * Returns the meta object for class '{@link no.ntnu.tdt4250.besieged.game.ConnectingPathTile <em>Connecting Path Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connecting Path Tile</em>'.
	 * @see no.ntnu.tdt4250.besieged.game.ConnectingPathTile
	 * @generated
	 */
	EClass getConnectingPathTile();

	/**
	 * Returns the meta object for enum '{@link no.ntnu.tdt4250.besieged.game.TileType <em>Tile Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tile Type</em>'.
	 * @see no.ntnu.tdt4250.besieged.game.TileType
	 * @generated
	 */
	EEnum getTileType();

	/**
	 * Returns the meta object for enum '{@link no.ntnu.tdt4250.besieged.game.GameMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mode</em>'.
	 * @see no.ntnu.tdt4250.besieged.game.GameMode
	 * @generated
	 */
	EEnum getGameMode();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GameFactory getGameFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.besieged.game.impl.GameImpl <em>Game</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.besieged.game.impl.GameImpl
		 * @see no.ntnu.tdt4250.besieged.game.impl.GamePackageImpl#getGame()
		 * @generated
		 */
		EClass GAME = eINSTANCE.getGame();

		/**
		 * The meta object literal for the '<em><b>Village Health</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME__VILLAGE_HEALTH = eINSTANCE.getGame_VillageHealth();

		/**
		 * The meta object literal for the '<em><b>Money</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME__MONEY = eINSTANCE.getGame_Money();

		/**
		 * The meta object literal for the '<em><b>Players</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__PLAYERS = eINSTANCE.getGame_Players();

		/**
		 * The meta object literal for the '<em><b>Num Players</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME__NUM_PLAYERS = eINSTANCE.getGame_NumPlayers();

		/**
		 * The meta object literal for the '<em><b>Game ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME__GAME_ID = eINSTANCE.getGame_GameID();

		/**
		 * The meta object literal for the '<em><b>Map</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME__MAP = eINSTANCE.getGame_Map();

		/**
		 * The meta object literal for the '<em><b>Game Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME__GAME_MODE = eINSTANCE.getGame_GameMode();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.besieged.game.impl.PlayerImpl <em>Player</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.besieged.game.impl.PlayerImpl
		 * @see no.ntnu.tdt4250.besieged.game.impl.GamePackageImpl#getPlayer()
		 * @generated
		 */
		EClass PLAYER = eINSTANCE.getPlayer();

		/**
		 * The meta object literal for the '<em><b>Game</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER__GAME = eINSTANCE.getPlayer_Game();

		/**
		 * The meta object literal for the '<em><b>Player Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__PLAYER_NAME = eINSTANCE.getPlayer_PlayerName();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.besieged.game.impl.MapImpl <em>Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.besieged.game.impl.MapImpl
		 * @see no.ntnu.tdt4250.besieged.game.impl.GamePackageImpl#getMap()
		 * @generated
		 */
		EClass MAP = eINSTANCE.getMap();

		/**
		 * The meta object literal for the '<em><b>Tiles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP__TILES = eINSTANCE.getMap_Tiles();

		/**
		 * The meta object literal for the '<em><b>Enemywaves</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP__ENEMYWAVES = eINSTANCE.getMap_Enemywaves();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP__NAME = eINSTANCE.getMap_Name();

		/**
		 * The meta object literal for the '<em><b>Current Wave Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP__CURRENT_WAVE_NUMBER = eINSTANCE.getMap_CurrentWaveNumber();

		/**
		 * The meta object literal for the '<em><b>Is Wave Completed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP__IS_WAVE_COMPLETED = eINSTANCE.getMap_IsWaveCompleted();

		/**
		 * The meta object literal for the '<em><b>All Waves Completed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP__ALL_WAVES_COMPLETED = eINSTANCE.getMap_AllWavesCompleted();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.besieged.game.impl.EnemyImpl <em>Enemy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.besieged.game.impl.EnemyImpl
		 * @see no.ntnu.tdt4250.besieged.game.impl.GamePackageImpl#getEnemy()
		 * @generated
		 */
		EClass ENEMY = eINSTANCE.getEnemy();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENEMY__VALUE = eINSTANCE.getEnemy_Value();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENEMY__POSITION = eINSTANCE.getEnemy_Position();

		/**
		 * The meta object literal for the '<em><b>Damage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENEMY__DAMAGE = eINSTANCE.getEnemy_Damage();

		/**
		 * The meta object literal for the '<em><b>Health</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENEMY__HEALTH = eINSTANCE.getEnemy_Health();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.besieged.game.impl.TowerCardImpl <em>Tower Card</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.besieged.game.impl.TowerCardImpl
		 * @see no.ntnu.tdt4250.besieged.game.impl.GamePackageImpl#getTowerCard()
		 * @generated
		 */
		EClass TOWER_CARD = eINSTANCE.getTowerCard();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOWER_CARD__PRICE = eINSTANCE.getTowerCard_Price();

		/**
		 * The meta object literal for the '<em><b>Base Damage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOWER_CARD__BASE_DAMAGE = eINSTANCE.getTowerCard_BaseDamage();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.besieged.game.impl.TowerImpl <em>Tower</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.besieged.game.impl.TowerImpl
		 * @see no.ntnu.tdt4250.besieged.game.impl.GamePackageImpl#getTower()
		 * @generated
		 */
		EClass TOWER = eINSTANCE.getTower();

		/**
		 * The meta object literal for the '<em><b>Towercards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOWER__TOWERCARDS = eINSTANCE.getTower_Towercards();

		/**
		 * The meta object literal for the '<em><b>Damage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOWER__DAMAGE = eINSTANCE.getTower_Damage();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.besieged.game.impl.TileImpl <em>Tile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.besieged.game.impl.TileImpl
		 * @see no.ntnu.tdt4250.besieged.game.impl.GamePackageImpl#getTile()
		 * @generated
		 */
		EClass TILE = eINSTANCE.getTile();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TILE__TYPE = eINSTANCE.getTile_Type();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TILE__POSITION = eINSTANCE.getTile_Position();

		/**
		 * The meta object literal for the '<em><b>Neighbours</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TILE__NEIGHBOURS = eINSTANCE.getTile_Neighbours();

		/**
		 * The meta object literal for the '<em><b>Towercard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TILE__TOWERCARD = eINSTANCE.getTile_Towercard();

		/**
		 * The meta object literal for the '<em><b>Tower</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TILE__TOWER = eINSTANCE.getTile_Tower();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TILE__NAME = eINSTANCE.getTile_Name();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.besieged.game.impl.EnemyWaveImpl <em>Enemy Wave</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.besieged.game.impl.EnemyWaveImpl
		 * @see no.ntnu.tdt4250.besieged.game.impl.GamePackageImpl#getEnemyWave()
		 * @generated
		 */
		EClass ENEMY_WAVE = eINSTANCE.getEnemyWave();

		/**
		 * The meta object literal for the '<em><b>Enemies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENEMY_WAVE__ENEMIES = eINSTANCE.getEnemyWave_Enemies();

		/**
		 * The meta object literal for the '<em><b>Total Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENEMY_WAVE__TOTAL_VALUE = eINSTANCE.getEnemyWave_TotalValue();

		/**
		 * The meta object literal for the '<em><b>Num Remaining Enemies</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENEMY_WAVE__NUM_REMAINING_ENEMIES = eINSTANCE.getEnemyWave_NumRemainingEnemies();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.besieged.game.impl.PositionImpl <em>Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.besieged.game.impl.PositionImpl
		 * @see no.ntnu.tdt4250.besieged.game.impl.GamePackageImpl#getPosition()
		 * @generated
		 */
		EClass POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__NAME = eINSTANCE.getPosition_Name();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__Y = eINSTANCE.getPosition_Y();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSITION__X = eINSTANCE.getPosition_X();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.besieged.game.impl.GameEntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.besieged.game.impl.GameEntityImpl
		 * @see no.ntnu.tdt4250.besieged.game.impl.GamePackageImpl#getGameEntity()
		 * @generated
		 */
		EClass GAME_ENTITY = eINSTANCE.getGameEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_ENTITY__NAME = eINSTANCE.getGameEntity_Name();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.besieged.game.impl.StartPathTileImpl <em>Start Path Tile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.besieged.game.impl.StartPathTileImpl
		 * @see no.ntnu.tdt4250.besieged.game.impl.GamePackageImpl#getStartPathTile()
		 * @generated
		 */
		EClass START_PATH_TILE = eINSTANCE.getStartPathTile();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.besieged.game.impl.EndPathTileImpl <em>End Path Tile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.besieged.game.impl.EndPathTileImpl
		 * @see no.ntnu.tdt4250.besieged.game.impl.GamePackageImpl#getEndPathTile()
		 * @generated
		 */
		EClass END_PATH_TILE = eINSTANCE.getEndPathTile();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.besieged.game.impl.PathTileImpl <em>Path Tile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.besieged.game.impl.PathTileImpl
		 * @see no.ntnu.tdt4250.besieged.game.impl.GamePackageImpl#getPathTile()
		 * @generated
		 */
		EClass PATH_TILE = eINSTANCE.getPathTile();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.besieged.game.impl.ConnectingPathTileImpl <em>Connecting Path Tile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.besieged.game.impl.ConnectingPathTileImpl
		 * @see no.ntnu.tdt4250.besieged.game.impl.GamePackageImpl#getConnectingPathTile()
		 * @generated
		 */
		EClass CONNECTING_PATH_TILE = eINSTANCE.getConnectingPathTile();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.besieged.game.TileType <em>Tile Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.besieged.game.TileType
		 * @see no.ntnu.tdt4250.besieged.game.impl.GamePackageImpl#getTileType()
		 * @generated
		 */
		EEnum TILE_TYPE = eINSTANCE.getTileType();

		/**
		 * The meta object literal for the '{@link no.ntnu.tdt4250.besieged.game.GameMode <em>Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.ntnu.tdt4250.besieged.game.GameMode
		 * @see no.ntnu.tdt4250.besieged.game.impl.GamePackageImpl#getGameMode()
		 * @generated
		 */
		EEnum GAME_MODE = eINSTANCE.getGameMode();

	}

} //GamePackage
