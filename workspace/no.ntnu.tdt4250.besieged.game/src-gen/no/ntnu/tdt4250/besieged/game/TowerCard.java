/**
 */
package no.ntnu.tdt4250.besieged.game;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tower Card</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.TowerCard#getPrice <em>Price</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.TowerCard#getBaseDamage <em>Base Damage</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.besieged.game.GamePackage#getTowerCard()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='priceShouldBeMoreThanZero baseDamageShouldBeMoreThanZero'"
 * @generated
 */
public interface TowerCard extends GameEntity {
	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(long)
	 * @see no.ntnu.tdt4250.besieged.game.GamePackage#getTowerCard_Price()
	 * @model required="true"
	 * @generated
	 */
	long getPrice();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.besieged.game.TowerCard#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(long value);

	/**
	 * Returns the value of the '<em><b>Base Damage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Damage</em>' attribute.
	 * @see #setBaseDamage(long)
	 * @see no.ntnu.tdt4250.besieged.game.GamePackage#getTowerCard_BaseDamage()
	 * @model required="true"
	 * @generated
	 */
	long getBaseDamage();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.besieged.game.TowerCard#getBaseDamage <em>Base Damage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Damage</em>' attribute.
	 * @see #getBaseDamage()
	 * @generated
	 */
	void setBaseDamage(long value);

} // TowerCard
