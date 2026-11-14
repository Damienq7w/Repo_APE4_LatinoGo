/**
 */
package latino;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Caso</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link latino.Caso#getValores <em>Valores</em>}</li>
 *   <li>{@link latino.Caso#getSentencias <em>Sentencias</em>}</li>
 * </ul>
 *
 * @see latino.LatinoPackage#getCaso()
 * @model
 * @generated
 */
public interface Caso extends Elemento {
	/**
	 * Returns the value of the '<em><b>Valores</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valores</em>' attribute list.
	 * @see latino.LatinoPackage#getCaso_Valores()
	 * @model unique="false" required="true"
	 * @generated
	 */
	EList<String> getValores();

	/**
	 * Returns the value of the '<em><b>Sentencias</b></em>' containment reference list.
	 * The list contents are of type {@link latino.Sentencia}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sentencias</em>' containment reference list.
	 * @see latino.LatinoPackage#getCaso_Sentencias()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Sentencia> getSentencias();

} // Caso
