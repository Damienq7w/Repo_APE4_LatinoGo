/**
 */
package latino;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asignacion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link latino.Asignacion#getValor <em>Valor</em>}</li>
 * </ul>
 *
 * @see latino.LatinoPackage#getAsignacion()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='TipoConsistente'"
 * @generated
 */
public interface Asignacion extends Definicion {
	/**
	 * Returns the value of the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor</em>' attribute.
	 * @see #setValor(String)
	 * @see latino.LatinoPackage#getAsignacion_Valor()
	 * @model
	 * @generated
	 */
	String getValor();

	/**
	 * Sets the value of the '{@link latino.Asignacion#getValor <em>Valor</em>}' attribute.
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
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tTuple {\n\t\t\t\tmessage : String = \'El valor usa una variable que no existe\',\n\t\t\t\tseverity : Integer = -1,\n\t\t\t\tstatus : Boolean = usaSoloVariablesDefinidas(valor)\n\t\t\t}.status'"
	 * @generated
	 */
	boolean VariablesDeclaradas(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tTuple {\n\t\t\t\tmessage : String = \'La variable cambia de tipo, no mezcles numeros, textos y logicos\',\n\t\t\t\tseverity : Integer = -1,\n\t\t\t\tstatus : Boolean = not usaSoloVariablesDefinidas(valor) or\n\t\t\t\t\t(let mio : String = tipoTexto(valor) in\n\t\t\t\t\tmio = \'desconocido\' or\n\t\t\t\t\tprograma().oclAsType(ocl::OclElement)-&gt;closure(e | e.oclContents())-&gt;selectByKind(Asignacion)\n\t\t\t\t\t\t-&gt;select(a | a.nombre = self.nombre and a.usaSoloVariablesDefinidas(a.valor))\n\t\t\t\t\t\t-&gt;forAll(a | let otro : String = a.tipoTexto(a.valor) in otro = \'desconocido\' or otro = mio))\n\t\t\t}.status'"
	 * @generated
	 */
	boolean TipoConsistente(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tTuple {\n\t\t\t\tmessage : String = \'No uses + - * / % con textos o logicos, para unir textos usa ..\',\n\t\t\t\tseverity : Integer = -1,\n\t\t\t\tstatus : Boolean = not usaSoloVariablesDefinidas(valor) or operandosNumericos(valor)\n\t\t\t}.status'"
	 * @generated
	 */
	boolean OperandosNumericos(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Asignacion
