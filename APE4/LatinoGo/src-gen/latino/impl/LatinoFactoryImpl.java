/**
 */
package latino.impl;

import latino.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LatinoFactoryImpl extends EFactoryImpl implements LatinoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LatinoFactory init() {
		try {
			LatinoFactory theLatinoFactory = (LatinoFactory) EPackage.Registry.INSTANCE
					.getEFactory(LatinoPackage.eNS_URI);
			if (theLatinoFactory != null) {
				return theLatinoFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LatinoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LatinoFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case LatinoPackage.PROGRAMA:
			return createPrograma();
		case LatinoPackage.ASIGNACION:
			return createAsignacion();
		case LatinoPackage.LEER:
			return createLeer();
		case LatinoPackage.LISTA:
			return createLista();
		case LatinoPackage.ASIGNACION_INDICE:
			return createAsignacionIndice();
		case LatinoPackage.CONDICIONAL:
			return createCondicional();
		case LatinoPackage.OSI:
			return createOsi();
		case LatinoPackage.IMPRIMIR:
			return createImprimir();
		case LatinoPackage.MIENTRAS:
			return createMientras();
		case LatinoPackage.REPETIR:
			return createRepetir();
		case LatinoPackage.DESDE:
			return createDesde();
		case LatinoPackage.PARA:
			return createPara();
		case LatinoPackage.INCREMENTO:
			return createIncremento();
		case LatinoPackage.ROMPER:
			return createRomper();
		case LatinoPackage.CONTINUAR:
			return createContinuar();
		case LatinoPackage.VARIABLE:
			return createVariable();
		case LatinoPackage.ELEGIR:
			return createElegir();
		case LatinoPackage.CASO:
			return createCaso();
		case LatinoPackage.FUNCION:
			return createFuncion();
		case LatinoPackage.RETORNO:
			return createRetorno();
		case LatinoPackage.LLAMADA:
			return createLlamada();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case LatinoPackage.CONVERSION:
			return createConversionFromString(eDataType, initialValue);
		case LatinoPackage.OPERADOR_PASO:
			return createOperadorPasoFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case LatinoPackage.CONVERSION:
			return convertConversionToString(eDataType, instanceValue);
		case LatinoPackage.OPERADOR_PASO:
			return convertOperadorPasoToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Programa createPrograma() {
		ProgramaImpl programa = new ProgramaImpl();
		return programa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Asignacion createAsignacion() {
		AsignacionImpl asignacion = new AsignacionImpl();
		return asignacion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Leer createLeer() {
		LeerImpl leer = new LeerImpl();
		return leer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lista createLista() {
		ListaImpl lista = new ListaImpl();
		return lista;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AsignacionIndice createAsignacionIndice() {
		AsignacionIndiceImpl asignacionIndice = new AsignacionIndiceImpl();
		return asignacionIndice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Condicional createCondicional() {
		CondicionalImpl condicional = new CondicionalImpl();
		return condicional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Osi createOsi() {
		OsiImpl osi = new OsiImpl();
		return osi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Imprimir createImprimir() {
		ImprimirImpl imprimir = new ImprimirImpl();
		return imprimir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mientras createMientras() {
		MientrasImpl mientras = new MientrasImpl();
		return mientras;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Repetir createRepetir() {
		RepetirImpl repetir = new RepetirImpl();
		return repetir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Desde createDesde() {
		DesdeImpl desde = new DesdeImpl();
		return desde;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Para createPara() {
		ParaImpl para = new ParaImpl();
		return para;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Incremento createIncremento() {
		IncrementoImpl incremento = new IncrementoImpl();
		return incremento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Romper createRomper() {
		RomperImpl romper = new RomperImpl();
		return romper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Continuar createContinuar() {
		ContinuarImpl continuar = new ContinuarImpl();
		return continuar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Elegir createElegir() {
		ElegirImpl elegir = new ElegirImpl();
		return elegir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Caso createCaso() {
		CasoImpl caso = new CasoImpl();
		return caso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Funcion createFuncion() {
		FuncionImpl funcion = new FuncionImpl();
		return funcion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Retorno createRetorno() {
		RetornoImpl retorno = new RetornoImpl();
		return retorno;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Llamada createLlamada() {
		LlamadaImpl llamada = new LlamadaImpl();
		return llamada;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conversion createConversionFromString(EDataType eDataType, String initialValue) {
		Conversion result = Conversion.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConversionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperadorPaso createOperadorPasoFromString(EDataType eDataType, String initialValue) {
		OperadorPaso result = OperadorPaso.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperadorPasoToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LatinoPackage getLatinoPackage() {
		return (LatinoPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LatinoPackage getPackage() {
		return LatinoPackage.eINSTANCE;
	}

} //LatinoFactoryImpl
