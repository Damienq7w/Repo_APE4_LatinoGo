/**
 */
package latino;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Para</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link latino.Para#getVariable <em>Variable</em>}</li>
 *   <li>{@link latino.Para#getLimites <em>Limites</em>}</li>
 * </ul>
 *
 * @see latino.LatinoPackage#getPara()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='VariablesDeclaradas'"
 * @generated
 */
public interface Para extends Ciclo {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #setVariable(Variable)
	 * @see latino.LatinoPackage#getPara_Variable()
	 * @model containment="true"
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link latino.Para#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Limites</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limites</em>' attribute list.
	 * @see latino.LatinoPackage#getPara_Limites()
	 * @model unique="false" required="true" upper="3"
	 * @generated
	 */
	EList<String> getLimites();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple { message : String = \'Los valores del rango deben ser numeros\', severity : Integer = -1, status : Boolean = not limites-&gt;forAll(l | usaSoloVariablesDefinidas(l)) or limites-&gt;forAll(l | let t : String = tipoTexto(l) in t &lt;&gt; \'texto\' and t &lt;&gt; \'logico\') }.status'"
	 * @generated
	 */
	boolean RangoNumerico(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple { message : String = \'El rango usa una variable que no existe\', severity : Integer = -1, status : Boolean = limites-&gt;forAll(l | usaSoloVariablesDefinidas(l)) }.status'"
	 * @generated
	 */
	boolean VariablesDeclaradas(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Para
