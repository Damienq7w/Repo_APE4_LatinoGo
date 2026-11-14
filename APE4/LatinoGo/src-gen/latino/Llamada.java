/**
 */
package latino;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Llamada</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link latino.Llamada#getFuncion <em>Funcion</em>}</li>
 *   <li>{@link latino.Llamada#getArgumentos <em>Argumentos</em>}</li>
 * </ul>
 *
 * @see latino.LatinoPackage#getLlamada()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ArgumentosCompletos'"
 * @generated
 */
public interface Llamada extends Sentencia {
	/**
	 * Returns the value of the '<em><b>Funcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Funcion</em>' attribute.
	 * @see #setFuncion(String)
	 * @see latino.LatinoPackage#getLlamada_Funcion()
	 * @model
	 * @generated
	 */
	String getFuncion();

	/**
	 * Sets the value of the '{@link latino.Llamada#getFuncion <em>Funcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Funcion</em>' attribute.
	 * @see #getFuncion()
	 * @generated
	 */
	void setFuncion(String value);

	/**
	 * Returns the value of the '<em><b>Argumentos</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argumentos</em>' attribute list.
	 * @see latino.LatinoPackage#getLlamada_Argumentos()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getArgumentos();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple { message : String = \'La llamada usa una variable que no existe\', severity : Integer = -1, status : Boolean = argumentos-&gt;forAll(a | usaSoloVariablesDefinidas(a)) }.status'"
	 * @generated
	 */
	boolean VariablesDeclaradas(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple { message : String = \'No uses + - * / % con textos o logicos, para unir textos usa ..\', severity : Integer = -1, status : Boolean = not argumentos-&gt;forAll(a | usaSoloVariablesDefinidas(a)) or argumentos-&gt;forAll(a | operandosNumericos(a)) }.status'"
	 * @generated
	 */
	boolean OperandosNumericos(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple { message : String = \'Esa funcion no existe, definela antes con funcion\', severity : Integer = -1, status : Boolean = programa().oclAsType(ocl::OclElement)-&gt;closure(e | e.oclContents())-&gt;selectByKind(Funcion)-&gt;exists(f | f.nombre = funcion) }.status'"
	 * @generated
	 */
	boolean FuncionDeclarada(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple { message : String = \'La llamada no lleva tantos valores como parametros tiene la funcion\', severity : Integer = -1, status : Boolean = programa().oclAsType(ocl::OclElement)-&gt;closure(e | e.oclContents())-&gt;selectByKind(Funcion)-&gt;select(f | f.nombre = funcion)-&gt;forAll(f | f.parametros-&gt;size() = argumentos-&gt;size()) }.status'"
	 * @generated
	 */
	boolean ArgumentosCompletos(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Llamada
