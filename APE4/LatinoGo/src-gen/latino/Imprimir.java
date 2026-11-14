/**
 */
package latino;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imprimir</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link latino.Imprimir#getMensaje <em>Mensaje</em>}</li>
 * </ul>
 *
 * @see latino.LatinoPackage#getImprimir()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='VariablesDeclaradas'"
 * @generated
 */
public interface Imprimir extends Sentencia {
	/**
	 * Returns the value of the '<em><b>Mensaje</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mensaje</em>' attribute.
	 * @see #setMensaje(String)
	 * @see latino.LatinoPackage#getImprimir_Mensaje()
	 * @model
	 * @generated
	 */
	String getMensaje();

	/**
	 * Sets the value of the '{@link latino.Imprimir#getMensaje <em>Mensaje</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mensaje</em>' attribute.
	 * @see #getMensaje()
	 * @generated
	 */
	void setMensaje(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tTuple {\n\t\t\t\tmessage : String = \'No uses + - * / % con textos o logicos, para unir textos usa ..\',\n\t\t\t\tseverity : Integer = -1,\n\t\t\t\tstatus : Boolean = not usaSoloVariablesDefinidas(mensaje) or operandosNumericos(mensaje)\n\t\t\t}.status'"
	 * @generated
	 */
	boolean OperandosNumericos(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tTuple {\n\t\t\t\tmessage : String = \'escribir usa una variable que no existe\',\n\t\t\t\tseverity : Integer = -1,\n\t\t\t\tstatus : Boolean = usaSoloVariablesDefinidas(mensaje)\n\t\t\t}.status'"
	 * @generated
	 */
	boolean VariablesDeclaradas(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Imprimir
