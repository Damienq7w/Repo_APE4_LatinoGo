/**
 */
package latino;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Osi</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link latino.Osi#getCondicion <em>Condicion</em>}</li>
 *   <li>{@link latino.Osi#getSentencias <em>Sentencias</em>}</li>
 * </ul>
 *
 * @see latino.LatinoPackage#getOsi()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OperandosNumericos'"
 * @generated
 */
public interface Osi extends Elemento {
	/**
	 * Returns the value of the '<em><b>Condicion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condicion</em>' attribute.
	 * @see #setCondicion(String)
	 * @see latino.LatinoPackage#getOsi_Condicion()
	 * @model
	 * @generated
	 */
	String getCondicion();

	/**
	 * Sets the value of the '{@link latino.Osi#getCondicion <em>Condicion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condicion</em>' attribute.
	 * @see #getCondicion()
	 * @generated
	 */
	void setCondicion(String value);

	/**
	 * Returns the value of the '<em><b>Sentencias</b></em>' containment reference list.
	 * The list contents are of type {@link latino.Sentencia}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sentencias</em>' containment reference list.
	 * @see latino.LatinoPackage#getOsi_Sentencias()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sentencia> getSentencias();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tTuple {\n\t\t\t\tmessage : String = \'La condicion del osi usa una variable que no existe\',\n\t\t\t\tseverity : Integer = -1,\n\t\t\t\tstatus : Boolean = usaSoloVariablesDefinidas(condicion)\n\t\t\t}.status'"
	 * @generated
	 */
	boolean VariablesDeclaradas(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tTuple {\n\t\t\t\tmessage : String = \'La condicion del osi debe ser verdadera o falsa, por ejemplo edad &gt; 18\',\n\t\t\t\tseverity : Integer = -1,\n\t\t\t\tstatus : Boolean = not usaSoloVariablesDefinidas(condicion) or not operandosNumericos(condicion) or\n\t\t\t\t\t(let tipo : String = tipoTexto(condicion) in tipo &lt;&gt; \'numero\' and tipo &lt;&gt; \'texto\')\n\t\t\t}.status'"
	 * @generated
	 */
	boolean CondicionLogica(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tTuple {\n\t\t\t\tmessage : String = \'El osi necesita al menos una sentencia dentro\',\n\t\t\t\tseverity : Integer = -1,\n\t\t\t\tstatus : Boolean = sentencias-&gt;notEmpty()\n\t\t\t}.status'"
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

} // Osi
