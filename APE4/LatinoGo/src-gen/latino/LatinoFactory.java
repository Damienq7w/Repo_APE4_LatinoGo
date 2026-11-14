/**
 */
package latino;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see latino.LatinoPackage
 * @generated
 */
public interface LatinoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LatinoFactory eINSTANCE = latino.impl.LatinoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Programa</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Programa</em>'.
	 * @generated
	 */
	Programa createPrograma();

	/**
	 * Returns a new object of class '<em>Asignacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asignacion</em>'.
	 * @generated
	 */
	Asignacion createAsignacion();

	/**
	 * Returns a new object of class '<em>Leer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Leer</em>'.
	 * @generated
	 */
	Leer createLeer();

	/**
	 * Returns a new object of class '<em>Lista</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lista</em>'.
	 * @generated
	 */
	Lista createLista();

	/**
	 * Returns a new object of class '<em>Asignacion Indice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asignacion Indice</em>'.
	 * @generated
	 */
	AsignacionIndice createAsignacionIndice();

	/**
	 * Returns a new object of class '<em>Condicional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condicional</em>'.
	 * @generated
	 */
	Condicional createCondicional();

	/**
	 * Returns a new object of class '<em>Osi</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Osi</em>'.
	 * @generated
	 */
	Osi createOsi();

	/**
	 * Returns a new object of class '<em>Imprimir</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Imprimir</em>'.
	 * @generated
	 */
	Imprimir createImprimir();

	/**
	 * Returns a new object of class '<em>Mientras</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mientras</em>'.
	 * @generated
	 */
	Mientras createMientras();

	/**
	 * Returns a new object of class '<em>Repetir</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Repetir</em>'.
	 * @generated
	 */
	Repetir createRepetir();

	/**
	 * Returns a new object of class '<em>Desde</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Desde</em>'.
	 * @generated
	 */
	Desde createDesde();

	/**
	 * Returns a new object of class '<em>Para</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Para</em>'.
	 * @generated
	 */
	Para createPara();

	/**
	 * Returns a new object of class '<em>Incremento</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Incremento</em>'.
	 * @generated
	 */
	Incremento createIncremento();

	/**
	 * Returns a new object of class '<em>Romper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Romper</em>'.
	 * @generated
	 */
	Romper createRomper();

	/**
	 * Returns a new object of class '<em>Continuar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Continuar</em>'.
	 * @generated
	 */
	Continuar createContinuar();

	/**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
	Variable createVariable();

	/**
	 * Returns a new object of class '<em>Elegir</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Elegir</em>'.
	 * @generated
	 */
	Elegir createElegir();

	/**
	 * Returns a new object of class '<em>Caso</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Caso</em>'.
	 * @generated
	 */
	Caso createCaso();

	/**
	 * Returns a new object of class '<em>Funcion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Funcion</em>'.
	 * @generated
	 */
	Funcion createFuncion();

	/**
	 * Returns a new object of class '<em>Retorno</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Retorno</em>'.
	 * @generated
	 */
	Retorno createRetorno();

	/**
	 * Returns a new object of class '<em>Llamada</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Llamada</em>'.
	 * @generated
	 */
	Llamada createLlamada();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LatinoPackage getLatinoPackage();

} //LatinoFactory
