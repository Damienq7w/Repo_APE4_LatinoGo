/**
 */
package latino;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Salto</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see latino.LatinoPackage#getSalto()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='DentroDeCiclo'"
 * @generated
 */
public interface Salto extends Sentencia {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple { message : String = \'romper y continuar solo van dentro de un ciclo\', severity : Integer = -1, status : Boolean = self.oclAsType(ocl::OclElement)-&gt;closure(e | e.oclContainer())-&gt;exists(e | e.oclIsKindOf(Ciclo)) }.status'"
	 * @generated
	 */
	boolean DentroDeCiclo(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Salto
