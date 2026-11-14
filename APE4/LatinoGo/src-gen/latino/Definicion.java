/**
 */
package latino;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definicion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link latino.Definicion#getNombre <em>Nombre</em>}</li>
 * </ul>
 *
 * @see latino.LatinoPackage#getDefinicion()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NombreNoReservadoLatino'"
 * @generated
 */
public interface Definicion extends Sentencia {
	/**
	 * Returns the value of the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nombre</em>' attribute.
	 * @see #setNombre(String)
	 * @see latino.LatinoPackage#getDefinicion_Nombre()
	 * @model
	 * @generated
	 */
	String getNombre();

	/**
	 * Sets the value of the '{@link latino.Definicion#getNombre <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nombre</em>' attribute.
	 * @see #getNombre()
	 * @generated
	 */
	void setNombre(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple { message : String = \'Ese nombre es una palabra reservada de Go, usa otro\', severity : Integer = -1, status : Boolean = not esReservadaGo(nombre) }.status'"
	 * @generated
	 */
	boolean NombreNoReservado(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Tuple { message : String = \'Ese nombre es una palabra de Latino, usa otro\', severity : Integer = -1, status : Boolean = not esReservadaLatino(nombre) }.status'"
	 * @generated
	 */
	boolean NombreNoReservadoLatino(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Definicion
