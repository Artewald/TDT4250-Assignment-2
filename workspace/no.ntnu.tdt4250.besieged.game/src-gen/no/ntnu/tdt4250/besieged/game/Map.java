/**
 */
package no.ntnu.tdt4250.besieged.game;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.Map#getTiles <em>Tiles</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.Map#getEnemywaves <em>Enemywaves</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.Map#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.Map#getCurrentWaveNumber <em>Current Wave Number</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.Map#isIsWaveCompleted <em>Is Wave Completed</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.Map#isAllWavesCompleted <em>All Waves Completed</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.besieged.game.GamePackage#getMap()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='currentWaveNumberCannotBeHigherThanAmountOfEnemyWaves tilesNeedsToContainOneStartAndOneEndPathTiles mapNameShouldBeBetweenFiveAndTwentyCharacters'"
 * @generated
 */
public interface Map extends EObject {
	/**
	 * Returns the value of the '<em><b>Tiles</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.besieged.game.Tile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tiles</em>' containment reference list.
	 * @see no.ntnu.tdt4250.besieged.game.GamePackage#getMap_Tiles()
	 * @model containment="true" lower="4"
	 * @generated
	 */
	EList<Tile> getTiles();

	/**
	 * Returns the value of the '<em><b>Enemywaves</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.besieged.game.EnemyWave}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enemywaves</em>' containment reference list.
	 * @see no.ntnu.tdt4250.besieged.game.GamePackage#getMap_Enemywaves()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EnemyWave> getEnemywaves();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.ntnu.tdt4250.besieged.game.GamePackage#getMap_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.besieged.game.Map#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Current Wave Number</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Wave Number</em>' attribute.
	 * @see #setCurrentWaveNumber(int)
	 * @see no.ntnu.tdt4250.besieged.game.GamePackage#getMap_CurrentWaveNumber()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getCurrentWaveNumber();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.besieged.game.Map#getCurrentWaveNumber <em>Current Wave Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Wave Number</em>' attribute.
	 * @see #getCurrentWaveNumber()
	 * @generated
	 */
	void setCurrentWaveNumber(int value);

	/**
	 * Returns the value of the '<em><b>Is Wave Completed</b></em>' attribute.
	 * The default value is <code>"False"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Wave Completed</em>' attribute.
	 * @see no.ntnu.tdt4250.besieged.game.GamePackage#getMap_IsWaveCompleted()
	 * @model default="False" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isIsWaveCompleted();

	/**
	 * Returns the value of the '<em><b>All Waves Completed</b></em>' attribute.
	 * The default value is <code>"False"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Waves Completed</em>' attribute.
	 * @see no.ntnu.tdt4250.besieged.game.GamePackage#getMap_AllWavesCompleted()
	 * @model default="False" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isAllWavesCompleted();

} // Map
