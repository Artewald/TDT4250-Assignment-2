/**
 */
package no.ntnu.tdt4250.besieged.game.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import no.ntnu.tdt4250.besieged.game.*;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see no.ntnu.tdt4250.besieged.game.GamePackage
 * @generated
 */
public class GameValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final GameValidator INSTANCE = new GameValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "no.ntnu.tdt4250.besieged.game";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return GamePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case GamePackage.GAME:
			return validateGame((Game) value, diagnostics, context);
		case GamePackage.PLAYER:
			return validatePlayer((Player) value, diagnostics, context);
		case GamePackage.MAP:
			return validateMap((no.ntnu.tdt4250.besieged.game.Map) value, diagnostics, context);
		case GamePackage.ENEMY:
			return validateEnemy((Enemy) value, diagnostics, context);
		case GamePackage.TOWER_CARD:
			return validateTowerCard((TowerCard) value, diagnostics, context);
		case GamePackage.TOWER:
			return validateTower((Tower) value, diagnostics, context);
		case GamePackage.TILE:
			return validateTile((Tile) value, diagnostics, context);
		case GamePackage.ENEMY_WAVE:
			return validateEnemyWave((EnemyWave) value, diagnostics, context);
		case GamePackage.POSITION:
			return validatePosition((Position) value, diagnostics, context);
		case GamePackage.GAME_ENTITY:
			return validateGameEntity((GameEntity) value, diagnostics, context);
		case GamePackage.START_PATH_TILE:
			return validateStartPathTile((StartPathTile) value, diagnostics, context);
		case GamePackage.END_PATH_TILE:
			return validateEndPathTile((EndPathTile) value, diagnostics, context);
		case GamePackage.PATH_TILE:
			return validatePathTile((PathTile) value, diagnostics, context);
		case GamePackage.CONNECTING_PATH_TILE:
			return validateConnectingPathTile((ConnectingPathTile) value, diagnostics, context);
		case GamePackage.TILE_TYPE:
			return validateTileType((TileType) value, diagnostics, context);
		case GamePackage.GAME_MODE:
			return validateGameMode((GameMode) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGame(Game game, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(game, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(game, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(game, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(game, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(game, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(game, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(game, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(game, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(game, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateGame_villageHealthShouldNotBeLessThanZero(game, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateGame_moneyShouldNotBeLessThanZero(game, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateGame_gameIDHasToBeSixteenCharacters(game, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateGame_singleplayerShouldNotHaveMoreThanOnePlayer(game, diagnostics, context);
		return result;
	}

	/**
	 * Validates the villageHealthShouldNotBeLessThanZero constraint of '<em>Game</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateGame_villageHealthShouldNotBeLessThanZero(Game game, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean valid = game.getVillageHealth() >= 0;

		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "villageHealthShouldNotBeLessThanZero", getObjectLabel(game, context) },
								new Object[] { game }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the moneyShouldNotBeLessThanZero constraint of '<em>Game</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateGame_moneyShouldNotBeLessThanZero(Game game, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean valid = game.getMoney() >= 0;

		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "moneyShouldNotBeLessThanZero", getObjectLabel(game, context) },
								new Object[] { game }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the gameIDHasToBeSixteenCharacters constraint of '<em>Game</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateGame_gameIDHasToBeSixteenCharacters(Game game, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		boolean valid = game.getGameID() != null && game.getGameID().length() == 16;

		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "gameIDHasToBeSixteenCharacters", getObjectLabel(game, context) },
								new Object[] { game }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the singleplayerShouldNotHaveMoreThanOnePlayer constraint of '<em>Game</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateGame_singleplayerShouldNotHaveMoreThanOnePlayer(Game game, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean valid = true;

		if (game.getGameMode() == GameMode.SINGLEPLAYER && game.getNumPlayers() != 1)
			valid = false;

		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "singleplayerShouldNotHaveMoreThanOnePlayer", getObjectLabel(game, context) },
						new Object[] { game }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlayer(Player player, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(player, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(player, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(player, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(player, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(player, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(player, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(player, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(player, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(player, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePlayer_playerNameHasToBetweenTenAndTwentyCharacters(player, diagnostics, context);
		return result;
	}

	/**
	 * Validates the playerNameHasToBetweenTenAndTwentyCharacters constraint of '<em>Player</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validatePlayer_playerNameHasToBetweenTenAndTwentyCharacters(Player player,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		boolean valid = player.getPlayerName() != null && player.getPlayerName().length() >= 10
				&& player.getPlayerName().length() <= 20;

		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic", new Object[] {
								"playerNameHasToBetweenTenAndTwentyCharacters", getObjectLabel(player, context) },
						new Object[] { player }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMap(no.ntnu.tdt4250.besieged.game.Map map, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(map, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(map, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(map, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(map, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(map, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(map, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(map, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(map, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(map, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMap_currentWaveNumberCannotBeHigherThanAmountOfEnemyWaves(map, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMap_tilesNeedsToContainOneStartAndOneEndPathTiles(map, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateMap_mapNameShouldBeBetweenFiveAndTwentyCharacters(map, diagnostics, context);
		return result;
	}

	/**
	 * Validates the currentWaveNumberCannotBeHigherThanAmountOfEnemyWaves constraint of '<em>Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateMap_currentWaveNumberCannotBeHigherThanAmountOfEnemyWaves(
			no.ntnu.tdt4250.besieged.game.Map map, DiagnosticChain diagnostics, Map<Object, Object> context) {

		boolean valid = map.getEnemywaves() != null && map.getCurrentWaveNumber() <= map.getEnemywaves().size() - 1;

		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic", new Object[] {
								"currentWaveNumberCannotBeHigherThanAmountOfEnemyWaves", getObjectLabel(map, context) },
						new Object[] { map }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the tilesNeedsToContainOneStartAndOneEndPathTiles constraint of '<em>Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateMap_tilesNeedsToContainOneStartAndOneEndPathTiles(no.ntnu.tdt4250.besieged.game.Map map,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		long numStartTiles = 0;
		long numEndTiles = 0;

		for (Tile t : map.getTiles()) {
			if (t == null)
				continue;
			else if (t instanceof StartPathTile)
				numStartTiles += 1;
			else if (t instanceof EndPathTile)
				numEndTiles += 1;
		}

		boolean valid = numStartTiles == 1 && numEndTiles == 1;

		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "tilesNeedsToContainOneStartAndOneEndPathTiles", getObjectLabel(map, context) },
						new Object[] { map }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the mapNameShouldBeBetweenFiveAndTwentyCharacters constraint of '<em>Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateMap_mapNameShouldBeBetweenFiveAndTwentyCharacters(no.ntnu.tdt4250.besieged.game.Map map,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		boolean valid = map.getName() != null && map.getName().length() >= 5 && map.getName().length() <= 20;

		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "mapNameShouldBeBetweenFiveAndTwentyCharacters", getObjectLabel(map, context) },
						new Object[] { map }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnemy(Enemy enemy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(enemy, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(enemy, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(enemy, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(enemy, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(enemy, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(enemy, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(enemy, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(enemy, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(enemy, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateGameEntity_nameShouldBeBetweenTenAndFourtyCharacters(enemy, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEnemy_valueShouldBeMoreThanZero(enemy, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEnemy_damageShouldBeMoreThanZero(enemy, diagnostics, context);
		return result;
	}

	/**
	 * Validates the valueShouldBeMoreThanZero constraint of '<em>Enemy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateEnemy_valueShouldBeMoreThanZero(Enemy enemy, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		boolean valid = enemy.getValue() >= 0;

		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "valueShouldBeMoreThanZero", getObjectLabel(enemy, context) },
								new Object[] { enemy }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the damageShouldBeMoreThanZero constraint of '<em>Enemy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateEnemy_damageShouldBeMoreThanZero(Enemy enemy, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		boolean valid = enemy.getDamage() > 0;
		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "damageShouldBeMoreThanZero", getObjectLabel(enemy, context) },
								new Object[] { enemy }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTowerCard(TowerCard towerCard, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(towerCard, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(towerCard, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(towerCard, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(towerCard, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(towerCard, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(towerCard, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(towerCard, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(towerCard, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(towerCard, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateGameEntity_nameShouldBeBetweenTenAndFourtyCharacters(towerCard, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTowerCard_priceShouldBeMoreThanZero(towerCard, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTowerCard_baseDamageShouldBeMoreThanZero(towerCard, diagnostics, context);
		return result;
	}

	/**
	 * Validates the priceShouldBeMoreThanZero constraint of '<em>Tower Card</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTowerCard_priceShouldBeMoreThanZero(TowerCard towerCard, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		boolean valid = towerCard.getPrice() > 0;

		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "priceShouldBeMoreThanZero", getObjectLabel(towerCard, context) },
								new Object[] { towerCard }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the baseDamageShouldBeMoreThanZero constraint of '<em>Tower Card</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTowerCard_baseDamageShouldBeMoreThanZero(TowerCard towerCard, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		boolean valid = towerCard.getBaseDamage() > 0;

		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "baseDamageShouldBeMoreThanZero", getObjectLabel(towerCard, context) },
								new Object[] { towerCard }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTower(Tower tower, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tower, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(tower, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(tower, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(tower, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(tower, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(tower, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(tower, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(tower, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(tower, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateGameEntity_nameShouldBeBetweenTenAndFourtyCharacters(tower, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTower_damageShouldBeMoreThanZero(tower, diagnostics, context);
		return result;
	}

	/**
	 * Validates the damageShouldBeMoreThanZero constraint of '<em>Tower</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTower_damageShouldBeMoreThanZero(Tower tower, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		boolean valid = tower.getDamage() > 0;

		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "damageShouldBeMoreThanZero", getObjectLabel(tower, context) },
								new Object[] { tower }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTile(Tile tile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tile, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(tile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(tile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(tile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(tile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(tile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(tile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(tile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(tile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTile_areNeighbouringPositionsValid(tile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTile_tileShouldBeGroundIfTowerOrCardIsPlaced(tile, diagnostics, context);
		return result;
	}

	/**
	 * Validates the areNeighbouringPositionsValid constraint of '<em>Tile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTile_areNeighbouringPositionsValid(Tile tile, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		boolean valid = tile.getNeighbours() != null && tile.getNeighbours().size() <= 8 && tile.getPosition() != null;

		if (valid) {
			long thisX = tile.getPosition().getX();
			long thisY = tile.getPosition().getY();
			List<Position> checkedPositions = new ArrayList<Position>();

			for (Tile t : tile.getNeighbours()) {
				if (t == null || t.getPosition() == null) {
					valid = false;
					break;
				}

				long tX = t.getPosition().getX();
				long tY = t.getPosition().getY();

				if (Math.abs(thisX - tX) > 1 || Math.abs(thisY - tY) > 1 || (tX == thisX && tY == thisY)) {
					valid = false;
					break;
				}

				for (Position p : checkedPositions) {
					if (p.getX() == tX && p.getY() == tY) {
						valid = false;
						break;
					}
				}

				if (!valid)
					break;
			}

		}

		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "areNeighbouringPositionsValid", getObjectLabel(tile, context) },
								new Object[] { tile }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the tileShouldBeGroundIfTowerOrCardIsPlaced constraint of '<em>Tile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateTile_tileShouldBeGroundIfTowerOrCardIsPlaced(Tile tile, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean valid = true;

		if (tile.getTower() != null || tile.getTowercard() != null) {
			if (tile.getType() != TileType.GROUND)
				valid = false;
		}

		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "tileShouldBeGroundIfTowerOrCardIsPlaced", getObjectLabel(tile, context) },
						new Object[] { tile }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnemyWave(EnemyWave enemyWave, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enemyWave, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePosition(Position position, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(position, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGameEntity(GameEntity gameEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(gameEntity, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(gameEntity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(gameEntity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(gameEntity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(gameEntity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(gameEntity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(gameEntity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(gameEntity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(gameEntity, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateGameEntity_nameShouldBeBetweenTenAndFourtyCharacters(gameEntity, diagnostics, context);
		return result;
	}

	/**
	 * Validates the nameShouldBeBetweenTenAndFourtyCharacters constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateGameEntity_nameShouldBeBetweenTenAndFourtyCharacters(GameEntity gameEntity,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		boolean valid = gameEntity.getName() != null && gameEntity.getName().length() >= 10
				&& gameEntity.getName().length() <= 40;

		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(
						Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic", new Object[] {
								"nameShouldBeBetweenTenAndFourtyCharacters", getObjectLabel(gameEntity, context) },
						new Object[] { gameEntity }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartPathTile(StartPathTile startPathTile, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(startPathTile, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(startPathTile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(startPathTile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(startPathTile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(startPathTile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(startPathTile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(startPathTile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(startPathTile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(startPathTile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTile_areNeighbouringPositionsValid(startPathTile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTile_tileShouldBeGroundIfTowerOrCardIsPlaced(startPathTile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePathTile_isPathTileType(startPathTile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateStartPathTile_shouldBeConnectedToOnlyOnePathTile(startPathTile, diagnostics, context);
		return result;
	}

	/**
	 * Validates the shouldBeConnectedToOnlyOnePathTile constraint of '<em>Start Path Tile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateStartPathTile_shouldBeConnectedToOnlyOnePathTile(StartPathTile startPathTile,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		boolean valid = startPathTile.getNeighbours() != null;

		if (valid) {
			int numAdjacentPathTiles = 0;

			for (Tile p : startPathTile.getNeighbours()) {
				if (p != null && p instanceof PathTile)
					numAdjacentPathTiles += 1;
				if (numAdjacentPathTiles > 1)
					break;
			}

			valid = numAdjacentPathTiles == 1;
		}

		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "shouldBeConnectedToOnlyOnePathTile", getObjectLabel(startPathTile, context) },
						new Object[] { startPathTile }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndPathTile(EndPathTile endPathTile, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(endPathTile, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(endPathTile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(endPathTile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(endPathTile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(endPathTile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(endPathTile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(endPathTile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(endPathTile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(endPathTile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTile_areNeighbouringPositionsValid(endPathTile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTile_tileShouldBeGroundIfTowerOrCardIsPlaced(endPathTile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePathTile_isPathTileType(endPathTile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateEndPathTile_shouldBeConnectedToOnlyOnePathTile(endPathTile, diagnostics, context);
		return result;
	}

	/**
	 * Validates the shouldBeConnectedToOnlyOnePathTile constraint of '<em>End Path Tile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateEndPathTile_shouldBeConnectedToOnlyOnePathTile(EndPathTile endPathTile,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		boolean valid = endPathTile.getNeighbours() != null;

		if (valid) {
			int numAdjacentPathTiles = 0;

			for (Tile p : endPathTile.getNeighbours()) {
				if (p != null && p instanceof PathTile)
					numAdjacentPathTiles += 1;
				if (numAdjacentPathTiles > 1)
					break;
			}

			valid = numAdjacentPathTiles == 1;
		}

		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add(createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0,
						"_UI_GenericConstraint_diagnostic",
						new Object[] { "shouldBeConnectedToOnlyOnePathTile", getObjectLabel(endPathTile, context) },
						new Object[] { endPathTile }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePathTile(PathTile pathTile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pathTile, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(pathTile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(pathTile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(pathTile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(pathTile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(pathTile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(pathTile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(pathTile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(pathTile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTile_areNeighbouringPositionsValid(pathTile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTile_tileShouldBeGroundIfTowerOrCardIsPlaced(pathTile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePathTile_isPathTileType(pathTile, diagnostics, context);
		return result;
	}

	/**
	 * Validates the isPathTileType constraint of '<em>Path Tile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validatePathTile_isPathTileType(PathTile pathTile, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		boolean valid = pathTile.getType() == TileType.PATH;

		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "isPathTileType", getObjectLabel(pathTile, context) },
								new Object[] { pathTile }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectingPathTile(ConnectingPathTile connectingPathTile, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(connectingPathTile, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(connectingPathTile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(connectingPathTile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(connectingPathTile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(connectingPathTile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(connectingPathTile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(connectingPathTile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(connectingPathTile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(connectingPathTile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTile_areNeighbouringPositionsValid(connectingPathTile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateTile_tileShouldBeGroundIfTowerOrCardIsPlaced(connectingPathTile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePathTile_isPathTileType(connectingPathTile, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateConnectingPathTile_shouldOnlyBeConnectedToTwoPathTiles(connectingPathTile, diagnostics,
					context);
		return result;
	}

	/**
	 * Validates the shouldOnlyBeConnectedToTwoPathTiles constraint of '<em>Connecting Path Tile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateConnectingPathTile_shouldOnlyBeConnectedToTwoPathTiles(ConnectingPathTile connectingPathTile,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean valid = connectingPathTile.getNeighbours() != null;

		if (valid) {
			int numAdjacentPathTiles = 0;

			for (Tile p : connectingPathTile.getNeighbours()) {
				if (p != null && p instanceof PathTile)
					numAdjacentPathTiles += 1;
				if (numAdjacentPathTiles > 2)
					break;
			}

			valid = numAdjacentPathTiles == 2;
		}

		if (!valid) {
			if (diagnostics != null) {
				diagnostics.add(
						createDiagnostic(Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0, "_UI_GenericConstraint_diagnostic",
								new Object[] { "shouldOnlyBeConnectedToTwoPathTiles",
										getObjectLabel(connectingPathTile, context) },
								new Object[] { connectingPathTile }, context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTileType(TileType tileType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGameMode(GameMode gameMode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //GameValidator
