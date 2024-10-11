/**
 */
package no.ntnu.tdt4250.besieged.game;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tower</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.Tower#getTowercards <em>Towercards</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.Tower#getDamage <em>Damage</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.besieged.game.GamePackage#getTower()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='damageShouldBeMoreThanZero'"
 * @generated
 */
public interface Tower extends GameEntity {
	/**
	 * Returns the value of the '<em><b>Towercards</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.besieged.game.TowerCard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Towercards</em>' containment reference list.
	 * @see no.ntnu.tdt4250.besieged.game.GamePackage#getTower_Towercards()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<TowerCard> getTowercards();

	/**
	 * Returns the value of the '<em><b>Damage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Damage</em>' attribute.
	 * @see no.ntnu.tdt4250.besieged.game.GamePackage#getTower_Damage()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	long getDamage();

} // Tower
