/**
 */
package latino;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Leer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link latino.Leer#getConversion <em>Conversion</em>}</li>
 * </ul>
 *
 * @see latino.LatinoPackage#getLeer()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='TipoLeido'"
 * @generated
 */
public interface Leer extends Definicion {
	/**
	 * Returns the value of the '<em><b>Conversion</b></em>' attribute.
	 * The literals are from the enumeration {@link latino.Conversion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conversion</em>' attribute.
	 * @see latino.Conversion
	 * @see #setConversion(Conversion)
	 * @see latino.LatinoPackage#getLeer_Conversion()
	 * @model
	 * @generated
	 */
	Conversion getConversion();

	/**
	 * Sets the value of the '{@link latino.Leer#getConversion <em>Conversion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conversion</em>' attribute.
	 * @see latino.Conversion
	 * @see #getConversion()
	 * @generated
	 */
	void setConversion(Conversion value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tTuple {\n\t\t\t\tmessage : String = if conversion = Conversion::NUMERO\n\t\t\t\t\tthen \'Esta variable se lee como numero pero luego le das otro tipo\'\n\t\t\t\t\telse \'Esta variable se lee como texto pero luego le das otro tipo\' endif,\n\t\t\t\tseverity : Integer = -1,\n\t\t\t\tstatus : Boolean = conversion = Conversion::NINGUNA or\n\t\t\t\t\t(let esperado : String = if conversion = Conversion::NUMERO then \'numero\' else \'texto\' endif in\n\t\t\t\t\tprograma().oclAsType(ocl::OclElement)-&gt;closure(e | e.oclContents())-&gt;selectByKind(Asignacion)\n\t\t\t\t\t\t-&gt;select(a | a.nombre = self.nombre and a.usaSoloVariablesDefinidas(a.valor))\n\t\t\t\t\t\t-&gt;forAll(a | let otro : String = a.tipoTexto(a.valor) in otro = \'desconocido\' or otro = esperado))\n\t\t\t}.status'"
	 * @generated
	 */
	boolean TipoLeido(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Leer
