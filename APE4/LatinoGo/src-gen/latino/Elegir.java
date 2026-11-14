/**
 */
package latino;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elegir</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link latino.Elegir#getExpresion <em>Expresion</em>}</li>
 *   <li>{@link latino.Elegir#getCasos <em>Casos</em>}</li>
 *   <li>{@link latino.Elegir#getDefecto <em>Defecto</em>}</li>
 * </ul>
 *
 * @see latino.LatinoPackage#getElegir()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='CasoRepetido'"
 * @generated
 */
public interface Elegir extends Sentencia {
	/**
	 * Returns the value of the '<em><b>Expresion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expresion</em>' attribute.
	 * @see #setExpresion(String)
	 * @see latino.LatinoPackage#getElegir_Expresion()
	 * @model
	 * @generated
	 */
	String getExpresion();

	/**
	 * Sets the value of the '{@link latino.Elegir#getExpresion <em>Expresion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expresion</em>' attribute.
	 * @see #getExpresion()
	 * @generated
	 */
	void setExpresion(String value);

	/**
	 * Returns the value of the '<em><b>Casos</b></em>' containment reference list.
	 * The list contents are of type {@link latino.Caso}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Casos</em>' containment reference list.
	 * @see latino.LatinoPackage#getElegir_Casos()
	 * @model containment="true"
	 * @generated
	 */
	EList<Caso> getCasos();

	/**
	 * Returns the value of the '<em><b>Defecto</b></em>' containment reference list.
	 * The list contents are of type {@link latino.Sentencia}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defecto</em>' containment reference list.
	 * @see latino.LatinoPackage#getElegir_Defecto()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sentencia> getDefecto();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple { message : String = \'Los casos deben ser del mismo tipo que lo que se elige, numeros o textos\', severity : Integer = -1, status : Boolean = not usaSoloVariablesDefinidas(expresion) or casos-&gt;collect(c | c.valores)-&gt;collect(v | tipoTexto(v))-&gt;asSet()-&gt;union(programa().oclAsType(ocl::OclElement)-&gt;closure(e | e.oclContents())-&gt;selectByKind(Asignacion)-&gt;select(a | a.nombre = expresion)-&gt;collect(a | a.tipoTexto(a.valor))-&gt;asSet())-&gt;including(tipoTexto(expresion))-&gt;excluding(\'desconocido\')-&gt;size() &lt;= 1 }.status'"
	 * @generated
	 */
	boolean CasosMismoTipo(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple { message : String = \'El elegir usa una variable que no existe\', severity : Integer = -1, status : Boolean = usaSoloVariablesDefinidas(expresion) }.status'"
	 * @generated
	 */
	boolean VariablesDeclaradas(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple { message : String = \'Ese valor ya esta en otro caso del elegir\', severity : Integer = -1, status : Boolean = casos-&gt;collect(c | c.valores)-&gt;size() = casos-&gt;collect(c | c.valores)-&gt;asSet()-&gt;size() }.status'"
	 * @generated
	 */
	boolean CasoRepetido(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Elegir
