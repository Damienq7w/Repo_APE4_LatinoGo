/**
 */
package latino;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asignacion Indice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link latino.AsignacionIndice#getLista <em>Lista</em>}</li>
 *   <li>{@link latino.AsignacionIndice#getIndice <em>Indice</em>}</li>
 *   <li>{@link latino.AsignacionIndice#getValor <em>Valor</em>}</li>
 * </ul>
 *
 * @see latino.LatinoPackage#getAsignacionIndice()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='IndiceNumerico'"
 * @generated
 */
public interface AsignacionIndice extends Sentencia {
	/**
	 * Returns the value of the '<em><b>Lista</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lista</em>' attribute.
	 * @see #setLista(String)
	 * @see latino.LatinoPackage#getAsignacionIndice_Lista()
	 * @model
	 * @generated
	 */
	String getLista();

	/**
	 * Sets the value of the '{@link latino.AsignacionIndice#getLista <em>Lista</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lista</em>' attribute.
	 * @see #getLista()
	 * @generated
	 */
	void setLista(String value);

	/**
	 * Returns the value of the '<em><b>Indice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indice</em>' attribute.
	 * @see #setIndice(String)
	 * @see latino.LatinoPackage#getAsignacionIndice_Indice()
	 * @model
	 * @generated
	 */
	String getIndice();

	/**
	 * Sets the value of the '{@link latino.AsignacionIndice#getIndice <em>Indice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indice</em>' attribute.
	 * @see #getIndice()
	 * @generated
	 */
	void setIndice(String value);

	/**
	 * Returns the value of the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valor</em>' attribute.
	 * @see #setValor(String)
	 * @see latino.LatinoPackage#getAsignacionIndice_Valor()
	 * @model
	 * @generated
	 */
	String getValor();

	/**
	 * Sets the value of the '{@link latino.AsignacionIndice#getValor <em>Valor</em>}' attribute.
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
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple { message : String = \'El indice o el valor usan una variable que no existe\', severity : Integer = -1, status : Boolean = usaSoloVariablesDefinidas(indice) and usaSoloVariablesDefinidas(valor) }.status'"
	 * @generated
	 */
	boolean VariablesDeclaradas(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple { message : String = \'El valor no es del mismo tipo que los elementos de la lista\', severity : Integer = -1, status : Boolean = not usaSoloVariablesDefinidas(valor) or (let t : String = tipoTexto(valor) in t = \'desconocido\' or programa().oclAsType(ocl::OclElement)-&gt;closure(e | e.oclContents())-&gt;selectByKind(Lista)-&gt;select(l | l.nombre = lista)-&gt;forAll(l | l.elementos-&gt;forAll(e | let o : String = l.tipoTexto(e) in o = \'desconocido\' or o = t))) }.status'"
	 * @generated
	 */
	boolean TipoElemento(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple { message : String = \'Ese nombre no es una lista, creala antes con corchetes\', severity : Integer = -1, status : Boolean = programa().oclAsType(ocl::OclElement)-&gt;closure(e | e.oclContents())-&gt;selectByKind(Lista)-&gt;exists(l | l.nombre = lista) }.status'"
	 * @generated
	 */
	boolean ListaDeclarada(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple { message : String = \'El indice debe ser un numero, por ejemplo v[0]\', severity : Integer = -1, status : Boolean = not usaSoloVariablesDefinidas(indice) or (let t : String = tipoTexto(indice) in t &lt;&gt; \'texto\' and t &lt;&gt; \'logico\') }.status'"
	 * @generated
	 */
	boolean IndiceNumerico(DiagnosticChain diagnostics, Map<Object, Object> context);

} // AsignacionIndice
