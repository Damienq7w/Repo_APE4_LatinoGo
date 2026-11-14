/**
 */
package latino;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programa</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link latino.Programa#getSentencias <em>Sentencias</em>}</li>
 * </ul>
 *
 * @see latino.LatinoPackage#getPrograma()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ProgramaNoVacio'"
 * @generated
 */
public interface Programa extends EObject {
	/**
	 * Returns the value of the '<em><b>Sentencias</b></em>' containment reference list.
	 * The list contents are of type {@link latino.Sentencia}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sentencias</em>' containment reference list.
	 * @see latino.LatinoPackage#getPrograma_Sentencias()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sentencia> getSentencias();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tself.oclAsType(ocl::OclElement)-&gt;closure(e | e.oclContents())-&gt;exists(e | (e.oclIsKindOf(Definicion) and e.oclAsType(Definicion).nombre = nombre) or (e.oclIsKindOf(Variable) and e.oclAsType(Variable).nombre = nombre))'"
	 * @generated
	 */
	boolean defineVariable(String nombre);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tTuple {\n\t\t\t\tmessage : String = \'El programa esta vacio, agrega al menos una sentencia\',\n\t\t\t\tseverity : Integer = -1,\n\t\t\t\tstatus : Boolean = sentencias-&gt;notEmpty()\n\t\t\t}.status'"
	 * @generated
	 */
	boolean ProgramaNoVacio(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Programa
