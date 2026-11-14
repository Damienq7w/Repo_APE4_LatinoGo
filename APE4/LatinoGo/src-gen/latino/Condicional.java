/**
 */
package latino;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condicional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link latino.Condicional#getCondicion <em>Condicion</em>}</li>
 *   <li>{@link latino.Condicional#getEntonces <em>Entonces</em>}</li>
 *   <li>{@link latino.Condicional#getOsis <em>Osis</em>}</li>
 *   <li>{@link latino.Condicional#getSino <em>Sino</em>}</li>
 * </ul>
 *
 * @see latino.LatinoPackage#getCondicional()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OperandosNumericos'"
 * @generated
 */
public interface Condicional extends Sentencia {
	/**
	 * Returns the value of the '<em><b>Condicion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condicion</em>' attribute.
	 * @see #setCondicion(String)
	 * @see latino.LatinoPackage#getCondicional_Condicion()
	 * @model
	 * @generated
	 */
	String getCondicion();

	/**
	 * Sets the value of the '{@link latino.Condicional#getCondicion <em>Condicion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condicion</em>' attribute.
	 * @see #getCondicion()
	 * @generated
	 */
	void setCondicion(String value);

	/**
	 * Returns the value of the '<em><b>Entonces</b></em>' containment reference list.
	 * The list contents are of type {@link latino.Sentencia}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entonces</em>' containment reference list.
	 * @see latino.LatinoPackage#getCondicional_Entonces()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sentencia> getEntonces();

	/**
	 * Returns the value of the '<em><b>Osis</b></em>' containment reference list.
	 * The list contents are of type {@link latino.Osi}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Osis</em>' containment reference list.
	 * @see latino.LatinoPackage#getCondicional_Osis()
	 * @model containment="true"
	 * @generated
	 */
	EList<Osi> getOsis();

	/**
	 * Returns the value of the '<em><b>Sino</b></em>' containment reference list.
	 * The list contents are of type {@link latino.Sentencia}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sino</em>' containment reference list.
	 * @see latino.LatinoPackage#getCondicional_Sino()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sentencia> getSino();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tTuple {\n\t\t\t\tmessage : String = \'La condicion usa una variable que no existe\',\n\t\t\t\tseverity : Integer = -1,\n\t\t\t\tstatus : Boolean = usaSoloVariablesDefinidas(condicion)\n\t\t\t}.status'"
	 * @generated
	 */
	boolean VariablesDeclaradas(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tTuple {\n\t\t\t\tmessage : String = \'La condicion debe ser verdadera o falsa, por ejemplo edad &gt; 18\',\n\t\t\t\tseverity : Integer = -1,\n\t\t\t\tstatus : Boolean = not usaSoloVariablesDefinidas(condicion) or not operandosNumericos(condicion) or\n\t\t\t\t\t(let tipo : String = tipoTexto(condicion) in tipo &lt;&gt; \'numero\' and tipo &lt;&gt; \'texto\')\n\t\t\t}.status'"
	 * @generated
	 */
	boolean CondicionLogica(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tTuple {\n\t\t\t\tmessage : String = \'El si necesita al menos una sentencia dentro\',\n\t\t\t\tseverity : Integer = -1,\n\t\t\t\tstatus : Boolean = entonces-&gt;notEmpty()\n\t\t\t}.status'"
	 * @generated
	 */
	boolean BloqueNoVacio(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tTuple {\n\t\t\t\tmessage : String = \'No uses + - * / % con textos o logicos, para unir textos usa ..\',\n\t\t\t\tseverity : Integer = -1,\n\t\t\t\tstatus : Boolean = not usaSoloVariablesDefinidas(condicion) or operandosNumericos(condicion)\n\t\t\t}.status'"
	 * @generated
	 */
	boolean OperandosNumericos(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Condicional
