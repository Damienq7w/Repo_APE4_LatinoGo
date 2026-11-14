/**
 */
package latino;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lista</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link latino.Lista#getElementos <em>Elementos</em>}</li>
 * </ul>
 *
 * @see latino.LatinoPackage#getLista()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OperandosNumericos'"
 * @generated
 */
public interface Lista extends Definicion {
	/**
	 * Returns the value of the '<em><b>Elementos</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elementos</em>' attribute list.
	 * @see latino.LatinoPackage#getLista_Elementos()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getElementos();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple { message : String = \'La lista usa una variable que no existe\', severity : Integer = -1, status : Boolean = elementos-&gt;forAll(e | usaSoloVariablesDefinidas(e)) }.status'"
	 * @generated
	 */
	boolean VariablesDeclaradas(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple { message : String = \'Esta variable es una lista, no le des un valor suelto\', severity : Integer = -1, status : Boolean = programa().oclAsType(ocl::OclElement)-&gt;closure(e | e.oclContents())-&gt;select(e | e.oclIsKindOf(Asignacion) or e.oclIsKindOf(Leer))-&gt;forAll(e | e.oclAsType(Definicion).nombre &lt;&gt; nombre) }.status'"
	 * @generated
	 */
	boolean ListaSiempreLista(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple { message : String = \'La lista mezcla numeros, textos y logicos, usa un solo tipo\', severity : Integer = -1, status : Boolean = not elementos-&gt;forAll(e | usaSoloVariablesDefinidas(e) and operandosNumericos(e)) or programa().oclAsType(ocl::OclElement)-&gt;closure(e | e.oclContents())-&gt;selectByKind(Lista)-&gt;select(l | l.nombre = nombre)-&gt;collect(l | l.elementos-&gt;collect(e | l.tipoTexto(e)))-&gt;reject(t | t = \'desconocido\')-&gt;asSet()-&gt;size() &lt;= 1 }.status'"
	 * @generated
	 */
	boolean ElementosMismoTipo(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple { message : String = \'No uses + - * / % con textos o logicos, para unir textos usa ..\', severity : Integer = -1, status : Boolean = not elementos-&gt;forAll(e | usaSoloVariablesDefinidas(e)) or elementos-&gt;forAll(e | operandosNumericos(e)) }.status'"
	 * @generated
	 */
	boolean OperandosNumericos(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Lista
