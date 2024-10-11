/**
 */
package no.ntnu.tdt4250.besieged.game;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.Tile#getPosition <em>Position</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.Tile#getNeighbours <em>Neighbours</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.Tile#getTowercard <em>Towercard</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.Tile#getTower <em>Tower</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.Tile#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.Tile#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.besieged.game.GamePackage#getTile()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='areNeighbouringPositionsValid tileShouldBeGroundIfTowerOrCardIsPlaced'"
 * @generated
 */
public interface Tile extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"GROUND"</code>.
	 * The literals are from the enumeration {@link no.ntnu.tdt4250.besieged.game.TileType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see no.ntnu.tdt4250.besieged.game.TileType
	 * @see #setType(TileType)
	 * @see no.ntnu.tdt4250.besieged.game.GamePackage#getTile_Type()
	 * @model default="GROUND" unique="false" required="true" ordered="false"
	 * @generated
	 */
	TileType getType();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.besieged.game.Tile#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see no.ntnu.tdt4250.besieged.game.TileType
	 * @see #getType()
	 * @generated
	 */
	void setType(TileType value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(Position)
	 * @see no.ntnu.tdt4250.besieged.game.GamePackage#getTile_Position()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Position getPosition();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.besieged.game.Tile#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Position value);

	/**
	 * Returns the value of the '<em><b>Neighbours</b></em>' reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.besieged.game.Tile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neighbours</em>' reference list.
	 * @see no.ntnu.tdt4250.besieged.game.GamePackage#getTile_Neighbours()
	 * @model required="true" upper="8"
	 * @generated
	 */
	EList<Tile> getNeighbours();

	/**
	 * Returns the value of the '<em><b>Towercard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Towercard</em>' containment reference.
	 * @see #setTowercard(TowerCard)
	 * @see no.ntnu.tdt4250.besieged.game.GamePackage#getTile_Towercard()
	 * @model containment="true"
	 * @generated
	 */
	TowerCard getTowercard();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.besieged.game.Tile#getTowercard <em>Towercard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Towercard</em>' containment reference.
	 * @see #getTowercard()
	 * @generated
	 */
	void setTowercard(TowerCard value);

	/**
	 * Returns the value of the '<em><b>Tower</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tower</em>' containment reference.
	 * @see #setTower(Tower)
	 * @see no.ntnu.tdt4250.besieged.game.GamePackage#getTile_Tower()
	 * @model containment="true"
	 * @generated
	 */
	Tower getTower();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.besieged.game.Tile#getTower <em>Tower</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tower</em>' containment reference.
	 * @see #getTower()
	 * @generated
	 */
	void setTower(Tower value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see no.ntnu.tdt4250.besieged.game.GamePackage#getTile_Name()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

} // Tile
