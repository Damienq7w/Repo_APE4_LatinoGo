/**
 */
package latino;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Retorno</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link latino.Retorno#getValor <em>Valor</em>}</li>
 * </ul>
 *
 * @see latino.LatinoPackage#getRetorno()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OperandosNumericos'"
 * @generated
 */
public interface Retorno extends Sentencia {
	/**
	 * Returns the value of the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor</em>' attribute.
	 * @see #setValor(String)
	 * @see latino.LatinoPackage#getRetorno_Valor()
	 * @model
	 * @generated
	 */
	String getValor();

	/**
	 * Sets the value of the '{@link latino.Retorno#getValor <em>Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valor</em>' attribute.
	 * @see #getValor()
	 * @generated
	 */
	void setValor(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple { message : String = \'retorno solo puede ir dentro de una funcion\', severity : Integer = -1, status : Boolean = self.oclAsType(ocl::OclElement)-&gt;closure(e | e.oclContainer())-&gt;exists(e | e.oclIsKindOf(Funcion)) }.status'"
	 * @generated
	 */
	boolean DentroDeFuncion(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple { message : String = \'El valor del retorno usa una variable que no existe\', severity : Integer = -1, status : Boolean = usaSoloVariablesDefinidas(valor) }.status'"
	 * @generated
	 */
	boolean VariablesDeclaradas(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple { message : String = \'No uses + - * / % con textos o logicos, para unir textos usa ..\', severity : Integer = -1, status : Boolean = not usaSoloVariablesDefinidas(valor) or operandosNumericos(valor) }.status'"
	 * @generated
	 */
	boolean OperandosNumericos(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Retorno
