/**
 */
package latino;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ciclo Condicion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link latino.CicloCondicion#getCondicion <em>Condicion</em>}</li>
 * </ul>
 *
 * @see latino.LatinoPackage#getCicloCondicion()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='CondicionLogica'"
 * @generated
 */
public interface CicloCondicion extends Ciclo {
	/**
	 * Returns the value of the '<em><b>Condicion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condicion</em>' attribute.
	 * @see #setCondicion(String)
	 * @see latino.LatinoPackage#getCicloCondicion_Condicion()
	 * @model
	 * @generated
	 */
	String getCondicion();

	/**
	 * Sets the value of the '{@link latino.CicloCondicion#getCondicion <em>Condicion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condicion</em>' attribute.
	 * @see #getCondicion()
	 * @generated
	 */
	void setCondicion(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple { message : String = \'La condicion del ciclo usa una variable que no existe\', severity : Integer = -1, status : Boolean = usaSoloVariablesDefinidas(condicion) }.status'"
	 * @generated
	 */
	boolean VariablesDeclaradas(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple { message : String = \'No uses + - * / % con textos o logicos, para unir textos usa ..\', severity : Integer = -1, status : Boolean = not usaSoloVariablesDefinidas(condicion) or operandosNumericos(condicion) }.status'"
	 * @generated
	 */
	boolean OperandosNumericos(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple { message : String = \'La condicion del ciclo debe ser verdadera o falsa, por ejemplo i &lt; 10\', severity : Integer = -1, status : Boolean = not usaSoloVariablesDefinidas(condicion) or not operandosNumericos(condicion) or (let tipo : String = tipoTexto(condicion) in tipo &lt;&gt; \'numero\' and tipo &lt;&gt; \'texto\') }.status'"
	 * @generated
	 */
	boolean CondicionLogica(DiagnosticChain diagnostics, Map<Object, Object> context);

} // CicloCondicion
