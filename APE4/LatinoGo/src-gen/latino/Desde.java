/**
 */
package latino;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Desde</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link latino.Desde#getInicio <em>Inicio</em>}</li>
 *   <li>{@link latino.Desde#getPaso <em>Paso</em>}</li>
 * </ul>
 *
 * @see latino.LatinoPackage#getDesde()
 * @model
 * @generated
 */
public interface Desde extends CicloCondicion {
	/**
	 * Returns the value of the '<em><b>Inicio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inicio</em>' containment reference.
	 * @see #setInicio(Asignacion)
	 * @see latino.LatinoPackage#getDesde_Inicio()
	 * @model containment="true"
	 * @generated
	 */
	Asignacion getInicio();

	/**
	 * Sets the value of the '{@link latino.Desde#getInicio <em>Inicio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inicio</em>' containment reference.
	 * @see #getInicio()
	 * @generated
	 */
	void setInicio(Asignacion value);

	/**
	 * Returns the value of the '<em><b>Paso</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paso</em>' containment reference.
	 * @see #setPaso(Sentencia)
	 * @see latino.LatinoPackage#getDesde_Paso()
	 * @model containment="true"
	 * @generated
	 */
	Sentencia getPaso();

	/**
	 * Sets the value of the '{@link latino.Desde#getPaso <em>Paso</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paso</em>' containment reference.
	 * @see #getPaso()
	 * @generated
	 */
	void setPaso(Sentencia value);

} // Desde
