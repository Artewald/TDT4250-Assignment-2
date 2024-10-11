/**
 */
package no.ntnu.tdt4250.besieged.game;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enemy Wave</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.EnemyWave#getEnemies <em>Enemies</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.EnemyWave#getTotalValue <em>Total Value</em>}</li>
 *   <li>{@link no.ntnu.tdt4250.besieged.game.EnemyWave#getNumRemainingEnemies <em>Num Remaining Enemies</em>}</li>
 * </ul>
 *
 * @see no.ntnu.tdt4250.besieged.game.GamePackage#getEnemyWave()
 * @model
 * @generated
 */
public interface EnemyWave extends EObject {
	/**
	 * Returns the value of the '<em><b>Enemies</b></em>' containment reference list.
	 * The list contents are of type {@link no.ntnu.tdt4250.besieged.game.Enemy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enemies</em>' containment reference list.
	 * @see no.ntnu.tdt4250.besieged.game.GamePackage#getEnemyWave_Enemies()
	 * @model containment="true" required="true" changeable="false"
	 * @generated
	 */
	EList<Enemy> getEnemies();

	/**
	 * Returns the value of the '<em><b>Total Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Value</em>' attribute.
	 * @see no.ntnu.tdt4250.besieged.game.GamePackage#getEnemyWave_TotalValue()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	long getTotalValue();

	/**
	 * Returns the value of the '<em><b>Num Remaining Enemies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Remaining Enemies</em>' attribute.
	 * @see no.ntnu.tdt4250.besieged.game.GamePackage#getEnemyWave_NumRemainingEnemies()
	 * @model unique="false" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getNumRemainingEnemies();

} // EnemyWave
