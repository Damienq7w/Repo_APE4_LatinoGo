/**
 */
package latino;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Incremento</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link latino.Incremento#getNombre <em>Nombre</em>}</li>
 *   <li>{@link latino.Incremento#getOperador <em>Operador</em>}</li>
 * </ul>
 *
 * @see latino.LatinoPackage#getIncremento()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='VariableDeclarada'"
 * @generated
 */
public interface Incremento extends Sentencia {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see latino.LatinoPackage#getIncremento_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link latino.Incremento#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * Returns the value of the '<em><b>Operador</b></em>' attribute.
	 * The literals are from the enumeration {@link latino.OperadorPaso}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operador</em>' attribute.
	 * @see latino.OperadorPaso
	 * @see #setOperador(OperadorPaso)
	 * @see latino.LatinoPackage#getIncremento_Operador()
	 * @model
	 * @generated
	 */
	OperadorPaso getOperador();

	/**
	 * Sets the value of the '{@link latino.Incremento#getOperador <em>Operador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operador</em>' attribute.
	 * @see latino.OperadorPaso
	 * @see #getOperador()
	 * @generated
	 */
	void setOperador(OperadorPaso value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple { message : String = \'Esa variable no existe, dale un valor antes de usar ++ o --\', severity : Integer = -1, status : Boolean = programa().defineVariable(nombre) }.status'"
	 * @generated
	 */
	boolean VariableDeclarada(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Incremento
