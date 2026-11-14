/**
 */
package latino.util;

import java.util.Map;

import latino.*;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see latino.LatinoPackage
 * @generated
 */
public class LatinoValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final LatinoValidator INSTANCE = new LatinoValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "latino";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Programa No Vacio' of 'Programa'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROGRAMA__PROGRAMA_NO_VACIO = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Nombre No Reservado' of 'Definicion'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DEFINICION__NOMBRE_NO_RESERVADO = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Nombre No Reservado Latino' of 'Definicion'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DEFINICION__NOMBRE_NO_RESERVADO_LATINO = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Variables Declaradas' of 'Asignacion'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASIGNACION__VARIABLES_DECLARADAS = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Tipo Consistente' of 'Asignacion'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASIGNACION__TIPO_CONSISTENTE = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Tipo Leido' of 'Leer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LEER__TIPO_LEIDO = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Variables Declaradas' of 'Lista'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LISTA__VARIABLES_DECLARADAS = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Lista Siempre Lista' of 'Lista'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LISTA__LISTA_SIEMPRE_LISTA = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Elementos Mismo Tipo' of 'Lista'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LISTA__ELEMENTOS_MISMO_TIPO = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Operandos Numericos' of 'Lista'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LISTA__OPERANDOS_NUMERICOS = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Variables Declaradas' of 'Asignacion Indice'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASIGNACION_INDICE__VARIABLES_DECLARADAS = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Tipo Elemento' of 'Asignacion Indice'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASIGNACION_INDICE__TIPO_ELEMENTO = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Lista Declarada' of 'Asignacion Indice'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASIGNACION_INDICE__LISTA_DECLARADA = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Indice Numerico' of 'Asignacion Indice'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASIGNACION_INDICE__INDICE_NUMERICO = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Operandos Numericos' of 'Asignacion'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASIGNACION__OPERANDOS_NUMERICOS = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Variables Declaradas' of 'Condicional'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDICIONAL__VARIABLES_DECLARADAS = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Condicion Logica' of 'Condicional'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDICIONAL__CONDICION_LOGICA = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Bloque No Vacio' of 'Condicional'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDICIONAL__BLOQUE_NO_VACIO = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Operandos Numericos' of 'Condicional'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDICIONAL__OPERANDOS_NUMERICOS = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Variables Declaradas' of 'Osi'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OSI__VARIABLES_DECLARADAS = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Condicion Logica' of 'Osi'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OSI__CONDICION_LOGICA = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Bloque No Vacio' of 'Osi'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OSI__BLOQUE_NO_VACIO = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Operandos Numericos' of 'Osi'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OSI__OPERANDOS_NUMERICOS = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Operandos Numericos' of 'Imprimir'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IMPRIMIR__OPERANDOS_NUMERICOS = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Variables Declaradas' of 'Imprimir'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IMPRIMIR__VARIABLES_DECLARADAS = 25;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Cuerpo No Vacio' of 'Ciclo'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CICLO__CUERPO_NO_VACIO = 26;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Variables Declaradas' of 'Ciclo Condicion'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CICLO_CONDICION__VARIABLES_DECLARADAS = 27;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Operandos Numericos' of 'Ciclo Condicion'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CICLO_CONDICION__OPERANDOS_NUMERICOS = 28;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Condicion Logica' of 'Ciclo Condicion'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CICLO_CONDICION__CONDICION_LOGICA = 29;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Rango Numerico' of 'Para'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PARA__RANGO_NUMERICO = 30;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Variables Declaradas' of 'Para'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PARA__VARIABLES_DECLARADAS = 31;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Variable Declarada' of 'Incremento'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INCREMENTO__VARIABLE_DECLARADA = 32;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Dentro De Ciclo' of 'Salto'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SALTO__DENTRO_DE_CICLO = 33;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Nombre No Reservado' of 'Variable'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VARIABLE__NOMBRE_NO_RESERVADO = 34;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Nombre No Reservado Latino' of 'Variable'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VARIABLE__NOMBRE_NO_RESERVADO_LATINO = 35;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Casos Mismo Tipo' of 'Elegir'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ELEGIR__CASOS_MISMO_TIPO = 36;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Variables Declaradas' of 'Elegir'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ELEGIR__VARIABLES_DECLARADAS = 37;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Caso Repetido' of 'Elegir'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ELEGIR__CASO_REPETIDO = 38;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Funcion Unica' of 'Funcion'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FUNCION__FUNCION_UNICA = 39;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Bloque No Vacio' of 'Funcion'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FUNCION__BLOQUE_NO_VACIO = 40;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Dentro De Funcion' of 'Retorno'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RETORNO__DENTRO_DE_FUNCION = 41;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Variables Declaradas' of 'Retorno'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RETORNO__VARIABLES_DECLARADAS = 42;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Operandos Numericos' of 'Retorno'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RETORNO__OPERANDOS_NUMERICOS = 43;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Variables Declaradas' of 'Llamada'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LLAMADA__VARIABLES_DECLARADAS = 44;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Operandos Numericos' of 'Llamada'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LLAMADA__OPERANDOS_NUMERICOS = 45;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Funcion Declarada' of 'Llamada'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LLAMADA__FUNCION_DECLARADA = 46;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Argumentos Completos' of 'Llamada'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LLAMADA__ARGUMENTOS_COMPLETOS = 47;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 47;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LatinoValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return LatinoPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case LatinoPackage.PROGRAMA:
			return validatePrograma((Programa) value, diagnostics, context);
		case LatinoPackage.ELEMENTO:
			return validateElemento((Elemento) value, diagnostics, context);
		case LatinoPackage.SENTENCIA:
			return validateSentencia((Sentencia) value, diagnostics, context);
		case LatinoPackage.DEFINICION:
			return validateDefinicion((Definicion) value, diagnostics, context);
		case LatinoPackage.ASIGNACION:
			return validateAsignacion((Asignacion) value, diagnostics, context);
		case LatinoPackage.LEER:
			return validateLeer((Leer) value, diagnostics, context);
		case LatinoPackage.LISTA:
			return validateLista((Lista) value, diagnostics, context);
		case LatinoPackage.ASIGNACION_INDICE:
			return validateAsignacionIndice((AsignacionIndice) value, diagnostics, context);
		case LatinoPackage.CONDICIONAL:
			return validateCondicional((Condicional) value, diagnostics, context);
		case LatinoPackage.OSI:
			return validateOsi((Osi) value, diagnostics, context);
		case LatinoPackage.IMPRIMIR:
			return validateImprimir((Imprimir) value, diagnostics, context);
		case LatinoPackage.CICLO:
			return validateCiclo((Ciclo) value, diagnostics, context);
		case LatinoPackage.CICLO_CONDICION:
			return validateCicloCondicion((CicloCondicion) value, diagnostics, context);
		case LatinoPackage.MIENTRAS:
			return validateMientras((Mientras) value, diagnostics, context);
		case LatinoPackage.REPETIR:
			return validateRepetir((Repetir) value, diagnostics, context);
		case LatinoPackage.DESDE:
			return validateDesde((Desde) value, diagnostics, context);
		case LatinoPackage.PARA:
			return validatePara((Para) value, diagnostics, context);
		case LatinoPackage.INCREMENTO:
			return validateIncremento((Incremento) value, diagnostics, context);
		case LatinoPackage.SALTO:
			return validateSalto((Salto) value, diagnostics, context);
		case LatinoPackage.ROMPER:
			return validateRomper((Romper) value, diagnostics, context);
		case LatinoPackage.CONTINUAR:
			return validateContinuar((Continuar) value, diagnostics, context);
		case LatinoPackage.VARIABLE:
			return validateVariable((Variable) value, diagnostics, context);
		case LatinoPackage.ELEGIR:
			return validateElegir((Elegir) value, diagnostics, context);
		case LatinoPackage.CASO:
			return validateCaso((Caso) value, diagnostics, context);
		case LatinoPackage.FUNCION:
			return validateFuncion((Funcion) value, diagnostics, context);
		case LatinoPackage.RETORNO:
			return validateRetorno((Retorno) value, diagnostics, context);
		case LatinoPackage.LLAMADA:
			return validateLlamada((Llamada) value, diagnostics, context);
		case LatinoPackage.CONVERSION:
			return validateConversion((Conversion) value, diagnostics, context);
		case LatinoPackage.OPERADOR_PASO:
			return validateOperadorPaso((OperadorPaso) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrograma(Programa programa, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(programa, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(programa, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(programa, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(programa, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(programa, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(programa, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(programa, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(programa, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(programa, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePrograma_ProgramaNoVacio(programa, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ProgramaNoVacio constraint of '<em>Programa</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrograma_ProgramaNoVacio(Programa programa, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return programa.ProgramaNoVacio(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElemento(Elemento elemento, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elemento, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSentencia(Sentencia sentencia, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sentencia, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefinicion(Definicion definicion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(definicion, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(definicion, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(definicion, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(definicion, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(definicion, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(definicion, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(definicion, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(definicion, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(definicion, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDefinicion_NombreNoReservadoLatino(definicion, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDefinicion_NombreNoReservado(definicion, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NombreNoReservadoLatino constraint of '<em>Definicion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefinicion_NombreNoReservadoLatino(Definicion definicion, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return definicion.NombreNoReservadoLatino(diagnostics, context);
	}

	/**
	 * Validates the NombreNoReservado constraint of '<em>Definicion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefinicion_NombreNoReservado(Definicion definicion, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return definicion.NombreNoReservado(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAsignacion(Asignacion asignacion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(asignacion, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(asignacion, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(asignacion, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(asignacion, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(asignacion, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(asignacion, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(asignacion, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(asignacion, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(asignacion, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDefinicion_NombreNoReservadoLatino(asignacion, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDefinicion_NombreNoReservado(asignacion, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAsignacion_TipoConsistente(asignacion, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAsignacion_VariablesDeclaradas(asignacion, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAsignacion_OperandosNumericos(asignacion, diagnostics, context);
		return result;
	}

	/**
	 * Validates the VariablesDeclaradas constraint of '<em>Asignacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAsignacion_VariablesDeclaradas(Asignacion asignacion, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return asignacion.VariablesDeclaradas(diagnostics, context);
	}

	/**
	 * Validates the TipoConsistente constraint of '<em>Asignacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAsignacion_TipoConsistente(Asignacion asignacion, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return asignacion.TipoConsistente(diagnostics, context);
	}

	/**
	 * Validates the OperandosNumericos constraint of '<em>Asignacion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAsignacion_OperandosNumericos(Asignacion asignacion, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return asignacion.OperandosNumericos(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLeer(Leer leer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(leer, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(leer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(leer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(leer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(leer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(leer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(leer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(leer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(leer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDefinicion_NombreNoReservadoLatino(leer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDefinicion_NombreNoReservado(leer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateLeer_TipoLeido(leer, diagnostics, context);
		return result;
	}

	/**
	 * Validates the TipoLeido constraint of '<em>Leer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLeer_TipoLeido(Leer leer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return leer.TipoLeido(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLista(Lista lista, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(lista, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(lista, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(lista, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(lista, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(lista, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(lista, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(lista, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(lista, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(lista, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDefinicion_NombreNoReservadoLatino(lista, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDefinicion_NombreNoReservado(lista, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateLista_OperandosNumericos(lista, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateLista_VariablesDeclaradas(lista, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateLista_ListaSiempreLista(lista, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateLista_ElementosMismoTipo(lista, diagnostics, context);
		return result;
	}

	/**
	 * Validates the OperandosNumericos constraint of '<em>Lista</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLista_OperandosNumericos(Lista lista, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return lista.OperandosNumericos(diagnostics, context);
	}

	/**
	 * Validates the VariablesDeclaradas constraint of '<em>Lista</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLista_VariablesDeclaradas(Lista lista, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return lista.VariablesDeclaradas(diagnostics, context);
	}

	/**
	 * Validates the ListaSiempreLista constraint of '<em>Lista</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLista_ListaSiempreLista(Lista lista, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return lista.ListaSiempreLista(diagnostics, context);
	}

	/**
	 * Validates the ElementosMismoTipo constraint of '<em>Lista</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLista_ElementosMismoTipo(Lista lista, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return lista.ElementosMismoTipo(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAsignacionIndice(AsignacionIndice asignacionIndice, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(asignacionIndice, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(asignacionIndice, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(asignacionIndice, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(asignacionIndice, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(asignacionIndice, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(asignacionIndice, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(asignacionIndice, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(asignacionIndice, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(asignacionIndice, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAsignacionIndice_IndiceNumerico(asignacionIndice, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAsignacionIndice_VariablesDeclaradas(asignacionIndice, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAsignacionIndice_TipoElemento(asignacionIndice, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateAsignacionIndice_ListaDeclarada(asignacionIndice, diagnostics, context);
		return result;
	}

	/**
	 * Validates the IndiceNumerico constraint of '<em>Asignacion Indice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAsignacionIndice_IndiceNumerico(AsignacionIndice asignacionIndice,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return asignacionIndice.IndiceNumerico(diagnostics, context);
	}

	/**
	 * Validates the VariablesDeclaradas constraint of '<em>Asignacion Indice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAsignacionIndice_VariablesDeclaradas(AsignacionIndice asignacionIndice,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return asignacionIndice.VariablesDeclaradas(diagnostics, context);
	}

	/**
	 * Validates the TipoElemento constraint of '<em>Asignacion Indice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAsignacionIndice_TipoElemento(AsignacionIndice asignacionIndice, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return asignacionIndice.TipoElemento(diagnostics, context);
	}

	/**
	 * Validates the ListaDeclarada constraint of '<em>Asignacion Indice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAsignacionIndice_ListaDeclarada(AsignacionIndice asignacionIndice,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return asignacionIndice.ListaDeclarada(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondicional(Condicional condicional, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(condicional, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(condicional, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(condicional, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(condicional, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(condicional, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(condicional, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(condicional, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(condicional, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(condicional, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCondicional_OperandosNumericos(condicional, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCondicional_VariablesDeclaradas(condicional, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCondicional_CondicionLogica(condicional, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCondicional_BloqueNoVacio(condicional, diagnostics, context);
		return result;
	}

	/**
	 * Validates the OperandosNumericos constraint of '<em>Condicional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondicional_OperandosNumericos(Condicional condicional, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return condicional.OperandosNumericos(diagnostics, context);
	}

	/**
	 * Validates the BloqueNoVacio constraint of '<em>Condicional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondicional_BloqueNoVacio(Condicional condicional, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return condicional.BloqueNoVacio(diagnostics, context);
	}

	/**
	 * Validates the VariablesDeclaradas constraint of '<em>Condicional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondicional_VariablesDeclaradas(Condicional condicional, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return condicional.VariablesDeclaradas(diagnostics, context);
	}

	/**
	 * Validates the CondicionLogica constraint of '<em>Condicional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondicional_CondicionLogica(Condicional condicional, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return condicional.CondicionLogica(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOsi(Osi osi, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(osi, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(osi, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(osi, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(osi, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(osi, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(osi, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(osi, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(osi, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(osi, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOsi_OperandosNumericos(osi, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOsi_VariablesDeclaradas(osi, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOsi_CondicionLogica(osi, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateOsi_BloqueNoVacio(osi, diagnostics, context);
		return result;
	}

	/**
	 * Validates the OperandosNumericos constraint of '<em>Osi</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOsi_OperandosNumericos(Osi osi, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return osi.OperandosNumericos(diagnostics, context);
	}

	/**
	 * Validates the BloqueNoVacio constraint of '<em>Osi</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOsi_BloqueNoVacio(Osi osi, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return osi.BloqueNoVacio(diagnostics, context);
	}

	/**
	 * Validates the VariablesDeclaradas constraint of '<em>Osi</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOsi_VariablesDeclaradas(Osi osi, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return osi.VariablesDeclaradas(diagnostics, context);
	}

	/**
	 * Validates the CondicionLogica constraint of '<em>Osi</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOsi_CondicionLogica(Osi osi, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return osi.CondicionLogica(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImprimir(Imprimir imprimir, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(imprimir, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(imprimir, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(imprimir, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(imprimir, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(imprimir, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(imprimir, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(imprimir, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(imprimir, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(imprimir, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateImprimir_VariablesDeclaradas(imprimir, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateImprimir_OperandosNumericos(imprimir, diagnostics, context);
		return result;
	}

	/**
	 * Validates the VariablesDeclaradas constraint of '<em>Imprimir</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImprimir_VariablesDeclaradas(Imprimir imprimir, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return imprimir.VariablesDeclaradas(diagnostics, context);
	}

	/**
	 * Validates the OperandosNumericos constraint of '<em>Imprimir</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImprimir_OperandosNumericos(Imprimir imprimir, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return imprimir.OperandosNumericos(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCiclo(Ciclo ciclo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ciclo, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(ciclo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(ciclo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(ciclo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(ciclo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(ciclo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(ciclo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(ciclo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(ciclo, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCiclo_CuerpoNoVacio(ciclo, diagnostics, context);
		return result;
	}

	/**
	 * Validates the CuerpoNoVacio constraint of '<em>Ciclo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCiclo_CuerpoNoVacio(Ciclo ciclo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ciclo.CuerpoNoVacio(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCicloCondicion(CicloCondicion cicloCondicion, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cicloCondicion, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(cicloCondicion, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(cicloCondicion, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(cicloCondicion, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(cicloCondicion, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(cicloCondicion, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(cicloCondicion, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(cicloCondicion, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(cicloCondicion, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCiclo_CuerpoNoVacio(cicloCondicion, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCicloCondicion_CondicionLogica(cicloCondicion, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCicloCondicion_VariablesDeclaradas(cicloCondicion, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCicloCondicion_OperandosNumericos(cicloCondicion, diagnostics, context);
		return result;
	}

	/**
	 * Validates the CondicionLogica constraint of '<em>Ciclo Condicion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCicloCondicion_CondicionLogica(CicloCondicion cicloCondicion, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return cicloCondicion.CondicionLogica(diagnostics, context);
	}

	/**
	 * Validates the VariablesDeclaradas constraint of '<em>Ciclo Condicion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCicloCondicion_VariablesDeclaradas(CicloCondicion cicloCondicion,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return cicloCondicion.VariablesDeclaradas(diagnostics, context);
	}

	/**
	 * Validates the OperandosNumericos constraint of '<em>Ciclo Condicion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCicloCondicion_OperandosNumericos(CicloCondicion cicloCondicion, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return cicloCondicion.OperandosNumericos(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMientras(Mientras mientras, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mientras, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(mientras, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(mientras, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(mientras, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(mientras, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(mientras, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(mientras, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(mientras, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(mientras, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCiclo_CuerpoNoVacio(mientras, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCicloCondicion_CondicionLogica(mientras, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCicloCondicion_VariablesDeclaradas(mientras, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCicloCondicion_OperandosNumericos(mientras, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepetir(Repetir repetir, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(repetir, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(repetir, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(repetir, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(repetir, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(repetir, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(repetir, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(repetir, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(repetir, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(repetir, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCiclo_CuerpoNoVacio(repetir, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCicloCondicion_CondicionLogica(repetir, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCicloCondicion_VariablesDeclaradas(repetir, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCicloCondicion_OperandosNumericos(repetir, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDesde(Desde desde, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(desde, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(desde, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(desde, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(desde, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(desde, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(desde, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(desde, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(desde, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(desde, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCiclo_CuerpoNoVacio(desde, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCicloCondicion_CondicionLogica(desde, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCicloCondicion_VariablesDeclaradas(desde, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCicloCondicion_OperandosNumericos(desde, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePara(Para para, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(para, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(para, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(para, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(para, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(para, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(para, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(para, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(para, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(para, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateCiclo_CuerpoNoVacio(para, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePara_VariablesDeclaradas(para, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePara_RangoNumerico(para, diagnostics, context);
		return result;
	}

	/**
	 * Validates the VariablesDeclaradas constraint of '<em>Para</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePara_VariablesDeclaradas(Para para, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return para.VariablesDeclaradas(diagnostics, context);
	}

	/**
	 * Validates the RangoNumerico constraint of '<em>Para</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePara_RangoNumerico(Para para, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return para.RangoNumerico(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIncremento(Incremento incremento, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(incremento, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(incremento, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(incremento, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(incremento, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(incremento, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(incremento, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(incremento, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(incremento, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(incremento, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateIncremento_VariableDeclarada(incremento, diagnostics, context);
		return result;
	}

	/**
	 * Validates the VariableDeclarada constraint of '<em>Incremento</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIncremento_VariableDeclarada(Incremento incremento, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return incremento.VariableDeclarada(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSalto(Salto salto, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(salto, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(salto, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(salto, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(salto, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(salto, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(salto, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(salto, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(salto, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(salto, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSalto_DentroDeCiclo(salto, diagnostics, context);
		return result;
	}

	/**
	 * Validates the DentroDeCiclo constraint of '<em>Salto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSalto_DentroDeCiclo(Salto salto, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return salto.DentroDeCiclo(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRomper(Romper romper, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(romper, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(romper, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(romper, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(romper, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(romper, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(romper, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(romper, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(romper, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(romper, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSalto_DentroDeCiclo(romper, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuar(Continuar continuar, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(continuar, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(continuar, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(continuar, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(continuar, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(continuar, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(continuar, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(continuar, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(continuar, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(continuar, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateSalto_DentroDeCiclo(continuar, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariable(Variable variable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(variable, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(variable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(variable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(variable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(variable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(variable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(variable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(variable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(variable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateVariable_NombreNoReservadoLatino(variable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateVariable_NombreNoReservado(variable, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NombreNoReservadoLatino constraint of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariable_NombreNoReservadoLatino(Variable variable, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return variable.NombreNoReservadoLatino(diagnostics, context);
	}

	/**
	 * Validates the NombreNoReservado constraint of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariable_NombreNoReservado(Variable variable, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return variable.NombreNoReservado(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElegir(Elegir elegir, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(elegir, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(elegir, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(elegir, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(elegir, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(elegir, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(elegir, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(elegir, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(elegir, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(elegir, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateElegir_CasoRepetido(elegir, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateElegir_CasosMismoTipo(elegir, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateElegir_VariablesDeclaradas(elegir, diagnostics, context);
		return result;
	}

	/**
	 * Validates the CasoRepetido constraint of '<em>Elegir</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElegir_CasoRepetido(Elegir elegir, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return elegir.CasoRepetido(diagnostics, context);
	}

	/**
	 * Validates the CasosMismoTipo constraint of '<em>Elegir</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElegir_CasosMismoTipo(Elegir elegir, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return elegir.CasosMismoTipo(diagnostics, context);
	}

	/**
	 * Validates the VariablesDeclaradas constraint of '<em>Elegir</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElegir_VariablesDeclaradas(Elegir elegir, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return elegir.VariablesDeclaradas(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCaso(Caso caso, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(caso, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFuncion(Funcion funcion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(funcion, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(funcion, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(funcion, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(funcion, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(funcion, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(funcion, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(funcion, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(funcion, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(funcion, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDefinicion_NombreNoReservadoLatino(funcion, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDefinicion_NombreNoReservado(funcion, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateFuncion_BloqueNoVacio(funcion, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateFuncion_FuncionUnica(funcion, diagnostics, context);
		return result;
	}

	/**
	 * Validates the BloqueNoVacio constraint of '<em>Funcion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFuncion_BloqueNoVacio(Funcion funcion, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return funcion.BloqueNoVacio(diagnostics, context);
	}

	/**
	 * Validates the FuncionUnica constraint of '<em>Funcion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFuncion_FuncionUnica(Funcion funcion, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return funcion.FuncionUnica(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRetorno(Retorno retorno, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(retorno, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(retorno, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(retorno, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(retorno, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(retorno, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(retorno, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(retorno, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(retorno, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(retorno, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRetorno_OperandosNumericos(retorno, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRetorno_DentroDeFuncion(retorno, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateRetorno_VariablesDeclaradas(retorno, diagnostics, context);
		return result;
	}

	/**
	 * Validates the OperandosNumericos constraint of '<em>Retorno</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRetorno_OperandosNumericos(Retorno retorno, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return retorno.OperandosNumericos(diagnostics, context);
	}

	/**
	 * Validates the DentroDeFuncion constraint of '<em>Retorno</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRetorno_DentroDeFuncion(Retorno retorno, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return retorno.DentroDeFuncion(diagnostics, context);
	}

	/**
	 * Validates the VariablesDeclaradas constraint of '<em>Retorno</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRetorno_VariablesDeclaradas(Retorno retorno, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return retorno.VariablesDeclaradas(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLlamada(Llamada llamada, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(llamada, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(llamada, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(llamada, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(llamada, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(llamada, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(llamada, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(llamada, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(llamada, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(llamada, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateLlamada_ArgumentosCompletos(llamada, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateLlamada_VariablesDeclaradas(llamada, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateLlamada_OperandosNumericos(llamada, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateLlamada_FuncionDeclarada(llamada, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ArgumentosCompletos constraint of '<em>Llamada</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLlamada_ArgumentosCompletos(Llamada llamada, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return llamada.ArgumentosCompletos(diagnostics, context);
	}

	/**
	 * Validates the VariablesDeclaradas constraint of '<em>Llamada</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLlamada_VariablesDeclaradas(Llamada llamada, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return llamada.VariablesDeclaradas(diagnostics, context);
	}

	/**
	 * Validates the OperandosNumericos constraint of '<em>Llamada</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLlamada_OperandosNumericos(Llamada llamada, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return llamada.OperandosNumericos(diagnostics, context);
	}

	/**
	 * Validates the FuncionDeclarada constraint of '<em>Llamada</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLlamada_FuncionDeclarada(Llamada llamada, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return llamada.FuncionDeclarada(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConversion(Conversion conversion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperadorPaso(OperadorPaso operadorPaso, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //LatinoValidator
