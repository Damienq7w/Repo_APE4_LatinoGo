/**
 */
package latino;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Funcion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link latino.Funcion#getParametros <em>Parametros</em>}</li>
 *   <li>{@link latino.Funcion#getCuerpo <em>Cuerpo</em>}</li>
 * </ul>
 *
 * @see latino.LatinoPackage#getFuncion()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='BloqueNoVacio'"
 * @generated
 */
public interface Funcion extends Definicion {
	/**
	 * Returns the value of the '<em><b>Parametros</b></em>' containment reference list.
	 * The list contents are of type {@link latino.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parametros</em>' containment reference list.
	 * @see latino.LatinoPackage#getFuncion_Parametros()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getParametros();

	/**
	 * Returns the value of the '<em><b>Cuerpo</b></em>' containment reference list.
	 * The list contents are of type {@link latino.Sentencia}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cuerpo</em>' containment reference list.
	 * @see latino.LatinoPackage#getFuncion_Cuerpo()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sentencia> getCuerpo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple { message : String = \'Ese nombre ya lo usa otra funcion o una variable\', severity : Integer = -1, status : Boolean = programa().oclAsType(ocl::OclElement)-&gt;closure(e | e.oclContents())-&gt;selectByKind(Definicion)-&gt;forAll(d | d = self or d.nombre &lt;&gt; nombre) }.status'"
	 * @generated
	 */
	boolean FuncionUnica(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple { message : String = \'La funcion necesita al menos una sentencia dentro\', severity : Integer = -1, status : Boolean = cuerpo-&gt;notEmpty() }.status'"
	 * @generated
	 */
	boolean BloqueNoVacio(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Funcion
