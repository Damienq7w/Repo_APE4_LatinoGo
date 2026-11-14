/**
 */
package latino;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ciclo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link latino.Ciclo#getCuerpo <em>Cuerpo</em>}</li>
 * </ul>
 *
 * @see latino.LatinoPackage#getCiclo()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='CuerpoNoVacio'"
 * @generated
 */
public interface Ciclo extends Sentencia {
	/**
	 * Returns the value of the '<em><b>Cuerpo</b></em>' containment reference list.
	 * The list contents are of type {@link latino.Sentencia}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cuerpo</em>' containment reference list.
	 * @see latino.LatinoPackage#getCiclo_Cuerpo()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sentencia> getCuerpo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple { message : String = \'El ciclo necesita al menos una sentencia dentro\', severity : Integer = -1, status : Boolean = cuerpo-&gt;notEmpty() }.status'"
	 * @generated
	 */
	boolean CuerpoNoVacio(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Ciclo
