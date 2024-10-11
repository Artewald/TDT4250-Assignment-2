/**
 */
package no.ntnu.tdt4250.besieged.game;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.Game#getPlayers <em>Players</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.Game#getGameID <em>Game ID</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.Game#getMap <em>Map</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.Game#getGameMode <em>Game Mode</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.Game#getMoney <em>Money</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.Game#getVillageHealth <em>Village Health</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.Game#getNumPlayers <em>Num Players</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.besieged.game.GamePackage#getGame()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='villageHealthShouldNotBeLessThanZero moneyShouldNotBeLessThanZero gameIDHasToBeSixteenCharacters singleplayerShouldNotHaveMoreThanOnePlayer'"
 * @generated
 */
public interface Game extends EObject {
	/**
	 * Returns the value of the '<em><b>Village Health</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Village Health</em>' attribute.
	 * @see #setVillageHealth(long)
	 * @see no.ntnu.tdt4250.besieged.game.GamePackage#getGame_VillageHealth()
	 * @model required="true"
	 * @generated
	 */
	long getVillageHealth();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.besieged.game.Game#getVillageHealth <em>Village Health</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Village Health</em>' attribute.
	 * @see #getVillageHealth()
	 * @generated
	 */
	void setVillageHealth(long value);

	/**
	 * Returns the value of the '<em><b>Money</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Money</em>' attribute.
	 * @see #setMoney(long)
	 * @see no.ntnu.tdt4250.besieged.game.GamePackage#getGame_Money()
	 * @model required="true"
	 * @generated
	 */
	long getMoney();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.besieged.game.Game#getMoney <em>Money</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Money</em>' attribute.
	 * @see #getMoney()
	 * @generated
	 */
	void setMoney(long value);

	/**
	 * Returns the value of the '<em><b>Players</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.besieged.game.Player}.
	 * It is bidirectional and its opposite is '{@link no.ntnu.tdt4250.besieged.game.Player#getGame <em>Game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Players</em>' containment reference list.
	 * @see no.ntnu.tdt4250.besieged.game.GamePackage#getGame_Players()
	 * @see no.ntnu.tdt4250.besieged.game.Player#getGame
	 * @model opposite="game" containment="true" required="true"
	 * @generated
	 */
	EList<Player> getPlayers();

	/**
	 * Returns the value of the '<em><b>Num Players</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Players</em>' attribute.
	 * @see no.ntnu.tdt4250.besieged.game.GamePackage#getGame_NumPlayers()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getNumPlayers();

	/**
	 * Returns the value of the '<em><b>Game ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game ID</em>' attribute.
	 * @see #setGameID(String)
	 * @see no.ntnu.tdt4250.besieged.game.GamePackage#getGame_GameID()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getGameID();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.besieged.game.Game#getGameID <em>Game ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Game ID</em>' attribute.
	 * @see #getGameID()
	 * @generated
	 */
	void setGameID(String value);

	/**
	 * Returns the value of the '<em><b>Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map</em>' containment reference.
	 * @see #setMap(Map)
	 * @see no.ntnu.tdt4250.besieged.game.GamePackage#getGame_Map()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Map getMap();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.besieged.game.Game#getMap <em>Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map</em>' containment reference.
	 * @see #getMap()
	 * @generated
	 */
	void setMap(Map value);

	/**
	 * Returns the value of the '<em><b>Game Mode</b></em>' attribute.
	 * The default value is <code>"MULTIPLAYER"</code>.
	 * The literals are from the enumeration {@link no.ntnu.tdt4250.besieged.game.GameMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game Mode</em>' attribute.
	 * @see no.ntnu.tdt4250.besieged.game.GameMode
	 * @see #setGameMode(GameMode)
	 * @see no.ntnu.tdt4250.besieged.game.GamePackage#getGame_GameMode()
	 * @model default="MULTIPLAYER" required="true"
	 * @generated
	 */
	GameMode getGameMode();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.besieged.game.Game#getGameMode <em>Game Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Game Mode</em>' attribute.
	 * @see no.ntnu.tdt4250.besieged.game.GameMode
	 * @see #getGameMode()
	 * @generated
	 */
	void setGameMode(GameMode value);

} // Game
