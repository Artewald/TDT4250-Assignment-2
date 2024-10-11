/**
 */
package no.ntnu.tdt4250.besieged.game;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enemy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.Enemy#getValue <em>Value</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.Enemy#getPosition <em>Position</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.Enemy#getDamage <em>Damage</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.Enemy#getHealth <em>Health</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.besieged.game.GamePackage#getEnemy()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='valueShouldBeMoreThanZero damageShouldBeMoreThanZero'"
 * @generated
 */
public interface Enemy extends GameEntity {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see no.ntnu.tdt4250.besieged.game.GamePackage#getEnemy_Value()
	 * @model required="true"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.besieged.game.Enemy#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(Position)
	 * @see no.ntnu.tdt4250.besieged.game.GamePackage#getEnemy_Position()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Position getPosition();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.besieged.game.Enemy#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Position value);

	/**
	 * Returns the value of the '<em><b>Damage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Damage</em>' attribute.
	 * @see #setDamage(int)
	 * @see no.ntnu.tdt4250.besieged.game.GamePackage#getEnemy_Damage()
	 * @model required="true"
	 * @generated
	 */
	int getDamage();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.besieged.game.Enemy#getDamage <em>Damage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Damage</em>' attribute.
	 * @see #getDamage()
	 * @generated
	 */
	void setDamage(int value);

	/**
	 * Returns the value of the '<em><b>Health</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Health</em>' attribute.
	 * @see #setHealth(long)
	 * @see no.ntnu.tdt4250.besieged.game.GamePackage#getEnemy_Health()
	 * @model required="true"
	 * @generated
	 */
	long getHealth();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.besieged.game.Enemy#getHealth <em>Health</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Health</em>' attribute.
	 * @see #getHealth()
	 * @generated
	 */
	void setHealth(long value);

} // Enemy
