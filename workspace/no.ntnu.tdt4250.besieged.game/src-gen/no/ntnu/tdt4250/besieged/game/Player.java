/**
 */
package no.ntnu.tdt4250.besieged.game;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.Player#getGame <em>Game</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.Player#getPlayerName <em>Player Name</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.besieged.game.GamePackage#getPlayer()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='playerNameHasToBetweenTenAndTwentyCharacters'"
 * @generated
 */
public interface Player extends EObject {
	/**
	 * Returns the value of the '<em><b>Game</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link no.ntnu.tdt4250.besieged.game.Game#getPlayers <em>Players</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game</em>' container reference.
	 * @see no.ntnu.tdt4250.besieged.game.GamePackage#getPlayer_Game()
	 * @see no.ntnu.tdt4250.besieged.game.Game#getPlayers
	 * @model opposite="players" required="true" transient="false" changeable="false"
	 * @generated
	 */
	Game getGame();

	/**
	 * Returns the value of the '<em><b>Player Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player Name</em>' attribute.
	 * @see #setPlayerName(String)
	 * @see no.ntnu.tdt4250.besieged.game.GamePackage#getPlayer_PlayerName()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getPlayerName();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.besieged.game.Player#getPlayerName <em>Player Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player Name</em>' attribute.
	 * @see #getPlayerName()
	 * @generated
	 */
	void setPlayerName(String value);

} // Player
