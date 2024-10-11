/**
 */
package no.ntnu.tdt4250.besieged.game;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.Position#getName <em>Name</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.Position#getX <em>X</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.Position#getY <em>Y</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.besieged.game.GamePackage#getPosition()
 * @model
 * @generated
 */
public interface Position extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see no.ntnu.tdt4250.besieged.game.GamePackage#getPosition_Name()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(long)
	 * @see no.ntnu.tdt4250.besieged.game.GamePackage#getPosition_Y()
	 * @model required="true"
	 * @generated
	 */
	long getY();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.besieged.game.Position#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(long value);

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(long)
	 * @see no.ntnu.tdt4250.besieged.game.GamePackage#getPosition_X()
	 * @model required="true"
	 * @generated
	 */
	long getX();

	/**
	 * Sets the value of the '{@link no.ntnu.tdt4250.besieged.game.Position#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(long value);

} // Position
