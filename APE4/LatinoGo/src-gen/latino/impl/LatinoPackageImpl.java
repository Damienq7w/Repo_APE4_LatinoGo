/**
 */
package latino.impl;

import latino.Asignacion;
import latino.AsignacionIndice;
import latino.Caso;
import latino.Ciclo;
import latino.CicloCondicion;
import latino.Condicional;
import latino.Continuar;
import latino.Conversion;
import latino.Definicion;
import latino.Desde;
import latino.Elegir;
import latino.Elemento;
import latino.Funcion;
import latino.Imprimir;
import latino.Incremento;
import latino.LatinoFactory;
import latino.LatinoPackage;
import latino.Leer;
import latino.Lista;
import latino.Llamada;
import latino.Mientras;
import latino.OperadorPaso;
import latino.Osi;
import latino.Para;
import latino.Programa;
import latino.Repetir;
import latino.Retorno;
import latino.Romper;
import latino.Salto;
import latino.Sentencia;
import latino.Variable;
import latino.util.LatinoValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LatinoPackageImpl extends EPackageImpl implements LatinoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sentenciaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definicionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asignacionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asignacionIndiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass condicionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imprimirEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cicloEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cicloCondicionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mientrasEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repetirEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass desdeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paraEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass incrementoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass saltoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass romperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continuarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elegirEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass casoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass funcionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass retornoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass llamadaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conversionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operadorPasoEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see latino.LatinoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LatinoPackageImpl() {
		super(eNS_URI, LatinoFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link LatinoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LatinoPackage init() {
		if (isInited)
			return (LatinoPackage) EPackage.Registry.INSTANCE.getEPackage(LatinoPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredLatinoPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		LatinoPackageImpl theLatinoPackage = registeredLatinoPackage instanceof LatinoPackageImpl
				? (LatinoPackageImpl) registeredLatinoPackage
				: new LatinoPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theLatinoPackage.createPackageContents();

		// Initialize created meta-data
		theLatinoPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theLatinoPackage, new EValidator.Descriptor() {
			@Override
			public EValidator getEValidator() {
				return LatinoValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theLatinoPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LatinoPackage.eNS_URI, theLatinoPackage);
		return theLatinoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrograma() {
		return programaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrograma_Sentencias() {
		return (EReference) programaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrograma__DefineVariable__String() {
		return programaEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrograma__ProgramaNoVacio__DiagnosticChain_Map() {
		return programaEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElemento() {
		return elementoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElemento__Programa() {
		return elementoEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElemento__UsaSoloVariablesDefinidas__String() {
		return elementoEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElemento__TipoTexto__String() {
		return elementoEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElemento__OperandosNumericos__String() {
		return elementoEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElemento__EsReservadaGo__String() {
		return elementoEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElemento__EsReservadaLatino__String() {
		return elementoEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSentencia() {
		return sentenciaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDefinicion() {
		return definicionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefinicion_Nombre() {
		return (EAttribute) definicionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefinicion__NombreNoReservado__DiagnosticChain_Map() {
		return definicionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefinicion__NombreNoReservadoLatino__DiagnosticChain_Map() {
		return definicionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAsignacion() {
		return asignacionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAsignacion_Valor() {
		return (EAttribute) asignacionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAsignacion__VariablesDeclaradas__DiagnosticChain_Map() {
		return asignacionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAsignacion__TipoConsistente__DiagnosticChain_Map() {
		return asignacionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLeer() {
		return leerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLeer_Conversion() {
		return (EAttribute) leerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLeer__TipoLeido__DiagnosticChain_Map() {
		return leerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLista() {
		return listaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLista_Elementos() {
		return (EAttribute) listaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLista__VariablesDeclaradas__DiagnosticChain_Map() {
		return listaEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLista__ListaSiempreLista__DiagnosticChain_Map() {
		return listaEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLista__ElementosMismoTipo__DiagnosticChain_Map() {
		return listaEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLista__OperandosNumericos__DiagnosticChain_Map() {
		return listaEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAsignacionIndice() {
		return asignacionIndiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAsignacionIndice_Lista() {
		return (EAttribute) asignacionIndiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAsignacionIndice_Indice() {
		return (EAttribute) asignacionIndiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAsignacionIndice_Valor() {
		return (EAttribute) asignacionIndiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAsignacionIndice__VariablesDeclaradas__DiagnosticChain_Map() {
		return asignacionIndiceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAsignacionIndice__TipoElemento__DiagnosticChain_Map() {
		return asignacionIndiceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAsignacionIndice__ListaDeclarada__DiagnosticChain_Map() {
		return asignacionIndiceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAsignacionIndice__IndiceNumerico__DiagnosticChain_Map() {
		return asignacionIndiceEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAsignacion__OperandosNumericos__DiagnosticChain_Map() {
		return asignacionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCondicional() {
		return condicionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCondicional_Condicion() {
		return (EAttribute) condicionalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCondicional_Entonces() {
		return (EReference) condicionalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCondicional_Osis() {
		return (EReference) condicionalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCondicional_Sino() {
		return (EReference) condicionalEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCondicional__VariablesDeclaradas__DiagnosticChain_Map() {
		return condicionalEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCondicional__CondicionLogica__DiagnosticChain_Map() {
		return condicionalEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCondicional__BloqueNoVacio__DiagnosticChain_Map() {
		return condicionalEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCondicional__OperandosNumericos__DiagnosticChain_Map() {
		return condicionalEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOsi() {
		return osiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOsi_Condicion() {
		return (EAttribute) osiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOsi_Sentencias() {
		return (EReference) osiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOsi__VariablesDeclaradas__DiagnosticChain_Map() {
		return osiEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOsi__CondicionLogica__DiagnosticChain_Map() {
		return osiEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOsi__BloqueNoVacio__DiagnosticChain_Map() {
		return osiEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOsi__OperandosNumericos__DiagnosticChain_Map() {
		return osiEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImprimir() {
		return imprimirEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImprimir_Mensaje() {
		return (EAttribute) imprimirEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImprimir__OperandosNumericos__DiagnosticChain_Map() {
		return imprimirEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getImprimir__VariablesDeclaradas__DiagnosticChain_Map() {
		return imprimirEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCiclo() {
		return cicloEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCiclo_Cuerpo() {
		return (EReference) cicloEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCiclo__CuerpoNoVacio__DiagnosticChain_Map() {
		return cicloEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCicloCondicion() {
		return cicloCondicionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCicloCondicion_Condicion() {
		return (EAttribute) cicloCondicionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCicloCondicion__VariablesDeclaradas__DiagnosticChain_Map() {
		return cicloCondicionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCicloCondicion__OperandosNumericos__DiagnosticChain_Map() {
		return cicloCondicionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCicloCondicion__CondicionLogica__DiagnosticChain_Map() {
		return cicloCondicionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMientras() {
		return mientrasEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRepetir() {
		return repetirEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDesde() {
		return desdeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDesde_Inicio() {
		return (EReference) desdeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDesde_Paso() {
		return (EReference) desdeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPara() {
		return paraEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPara_Variable() {
		return (EReference) paraEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPara_Limites() {
		return (EAttribute) paraEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPara__RangoNumerico__DiagnosticChain_Map() {
		return paraEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPara__VariablesDeclaradas__DiagnosticChain_Map() {
		return paraEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIncremento() {
		return incrementoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIncremento_Nombre() {
		return (EAttribute) incrementoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIncremento_Operador() {
		return (EAttribute) incrementoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIncremento__VariableDeclarada__DiagnosticChain_Map() {
		return incrementoEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSalto() {
		return saltoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSalto__DentroDeCiclo__DiagnosticChain_Map() {
		return saltoEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRomper() {
		return romperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContinuar() {
		return continuarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariable_Nombre() {
		return (EAttribute) variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariable__NombreNoReservado__DiagnosticChain_Map() {
		return variableEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVariable__NombreNoReservadoLatino__DiagnosticChain_Map() {
		return variableEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElegir() {
		return elegirEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElegir_Expresion() {
		return (EAttribute) elegirEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElegir_Casos() {
		return (EReference) elegirEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElegir_Defecto() {
		return (EReference) elegirEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElegir__CasosMismoTipo__DiagnosticChain_Map() {
		return elegirEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElegir__VariablesDeclaradas__DiagnosticChain_Map() {
		return elegirEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getElegir__CasoRepetido__DiagnosticChain_Map() {
		return elegirEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCaso() {
		return casoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCaso_Valores() {
		return (EAttribute) casoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCaso_Sentencias() {
		return (EReference) casoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFuncion() {
		return funcionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFuncion_Parametros() {
		return (EReference) funcionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFuncion_Cuerpo() {
		return (EReference) funcionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFuncion__FuncionUnica__DiagnosticChain_Map() {
		return funcionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getFuncion__BloqueNoVacio__DiagnosticChain_Map() {
		return funcionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRetorno() {
		return retornoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRetorno_Valor() {
		return (EAttribute) retornoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRetorno__DentroDeFuncion__DiagnosticChain_Map() {
		return retornoEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRetorno__VariablesDeclaradas__DiagnosticChain_Map() {
		return retornoEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRetorno__OperandosNumericos__DiagnosticChain_Map() {
		return retornoEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLlamada() {
		return llamadaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLlamada_Funcion() {
		return (EAttribute) llamadaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLlamada_Argumentos() {
		return (EAttribute) llamadaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLlamada__VariablesDeclaradas__DiagnosticChain_Map() {
		return llamadaEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLlamada__OperandosNumericos__DiagnosticChain_Map() {
		return llamadaEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLlamada__FuncionDeclarada__DiagnosticChain_Map() {
		return llamadaEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLlamada__ArgumentosCompletos__DiagnosticChain_Map() {
		return llamadaEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getConversion() {
		return conversionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOperadorPaso() {
		return operadorPasoEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LatinoFactory getLatinoFactory() {
		return (LatinoFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		programaEClass = createEClass(PROGRAMA);
		createEReference(programaEClass, PROGRAMA__SENTENCIAS);
		createEOperation(programaEClass, PROGRAMA___DEFINE_VARIABLE__STRING);
		createEOperation(programaEClass, PROGRAMA___PROGRAMA_NO_VACIO__DIAGNOSTICCHAIN_MAP);

		elementoEClass = createEClass(ELEMENTO);
		createEOperation(elementoEClass, ELEMENTO___PROGRAMA);
		createEOperation(elementoEClass, ELEMENTO___USA_SOLO_VARIABLES_DEFINIDAS__STRING);
		createEOperation(elementoEClass, ELEMENTO___TIPO_TEXTO__STRING);
		createEOperation(elementoEClass, ELEMENTO___OPERANDOS_NUMERICOS__STRING);
		createEOperation(elementoEClass, ELEMENTO___ES_RESERVADA_GO__STRING);
		createEOperation(elementoEClass, ELEMENTO___ES_RESERVADA_LATINO__STRING);

		sentenciaEClass = createEClass(SENTENCIA);

		definicionEClass = createEClass(DEFINICION);
		createEAttribute(definicionEClass, DEFINICION__NOMBRE);
		createEOperation(definicionEClass, DEFINICION___NOMBRE_NO_RESERVADO__DIAGNOSTICCHAIN_MAP);
		createEOperation(definicionEClass, DEFINICION___NOMBRE_NO_RESERVADO_LATINO__DIAGNOSTICCHAIN_MAP);

		asignacionEClass = createEClass(ASIGNACION);
		createEAttribute(asignacionEClass, ASIGNACION__VALOR);
		createEOperation(asignacionEClass, ASIGNACION___VARIABLES_DECLARADAS__DIAGNOSTICCHAIN_MAP);
		createEOperation(asignacionEClass, ASIGNACION___OPERANDOS_NUMERICOS__DIAGNOSTICCHAIN_MAP);
		createEOperation(asignacionEClass, ASIGNACION___TIPO_CONSISTENTE__DIAGNOSTICCHAIN_MAP);

		leerEClass = createEClass(LEER);
		createEAttribute(leerEClass, LEER__CONVERSION);
		createEOperation(leerEClass, LEER___TIPO_LEIDO__DIAGNOSTICCHAIN_MAP);

		listaEClass = createEClass(LISTA);
		createEAttribute(listaEClass, LISTA__ELEMENTOS);
		createEOperation(listaEClass, LISTA___VARIABLES_DECLARADAS__DIAGNOSTICCHAIN_MAP);
		createEOperation(listaEClass, LISTA___LISTA_SIEMPRE_LISTA__DIAGNOSTICCHAIN_MAP);
		createEOperation(listaEClass, LISTA___ELEMENTOS_MISMO_TIPO__DIAGNOSTICCHAIN_MAP);
		createEOperation(listaEClass, LISTA___OPERANDOS_NUMERICOS__DIAGNOSTICCHAIN_MAP);

		asignacionIndiceEClass = createEClass(ASIGNACION_INDICE);
		createEAttribute(asignacionIndiceEClass, ASIGNACION_INDICE__LISTA);
		createEAttribute(asignacionIndiceEClass, ASIGNACION_INDICE__INDICE);
		createEAttribute(asignacionIndiceEClass, ASIGNACION_INDICE__VALOR);
		createEOperation(asignacionIndiceEClass, ASIGNACION_INDICE___VARIABLES_DECLARADAS__DIAGNOSTICCHAIN_MAP);
		createEOperation(asignacionIndiceEClass, ASIGNACION_INDICE___TIPO_ELEMENTO__DIAGNOSTICCHAIN_MAP);
		createEOperation(asignacionIndiceEClass, ASIGNACION_INDICE___LISTA_DECLARADA__DIAGNOSTICCHAIN_MAP);
		createEOperation(asignacionIndiceEClass, ASIGNACION_INDICE___INDICE_NUMERICO__DIAGNOSTICCHAIN_MAP);

		condicionalEClass = createEClass(CONDICIONAL);
		createEAttribute(condicionalEClass, CONDICIONAL__CONDICION);
		createEReference(condicionalEClass, CONDICIONAL__ENTONCES);
		createEReference(condicionalEClass, CONDICIONAL__OSIS);
		createEReference(condicionalEClass, CONDICIONAL__SINO);
		createEOperation(condicionalEClass, CONDICIONAL___VARIABLES_DECLARADAS__DIAGNOSTICCHAIN_MAP);
		createEOperation(condicionalEClass, CONDICIONAL___CONDICION_LOGICA__DIAGNOSTICCHAIN_MAP);
		createEOperation(condicionalEClass, CONDICIONAL___BLOQUE_NO_VACIO__DIAGNOSTICCHAIN_MAP);
		createEOperation(condicionalEClass, CONDICIONAL___OPERANDOS_NUMERICOS__DIAGNOSTICCHAIN_MAP);

		osiEClass = createEClass(OSI);
		createEAttribute(osiEClass, OSI__CONDICION);
		createEReference(osiEClass, OSI__SENTENCIAS);
		createEOperation(osiEClass, OSI___VARIABLES_DECLARADAS__DIAGNOSTICCHAIN_MAP);
		createEOperation(osiEClass, OSI___CONDICION_LOGICA__DIAGNOSTICCHAIN_MAP);
		createEOperation(osiEClass, OSI___BLOQUE_NO_VACIO__DIAGNOSTICCHAIN_MAP);
		createEOperation(osiEClass, OSI___OPERANDOS_NUMERICOS__DIAGNOSTICCHAIN_MAP);

		imprimirEClass = createEClass(IMPRIMIR);
		createEAttribute(imprimirEClass, IMPRIMIR__MENSAJE);
		createEOperation(imprimirEClass, IMPRIMIR___OPERANDOS_NUMERICOS__DIAGNOSTICCHAIN_MAP);
		createEOperation(imprimirEClass, IMPRIMIR___VARIABLES_DECLARADAS__DIAGNOSTICCHAIN_MAP);

		cicloEClass = createEClass(CICLO);
		createEReference(cicloEClass, CICLO__CUERPO);
		createEOperation(cicloEClass, CICLO___CUERPO_NO_VACIO__DIAGNOSTICCHAIN_MAP);

		cicloCondicionEClass = createEClass(CICLO_CONDICION);
		createEAttribute(cicloCondicionEClass, CICLO_CONDICION__CONDICION);
		createEOperation(cicloCondicionEClass, CICLO_CONDICION___VARIABLES_DECLARADAS__DIAGNOSTICCHAIN_MAP);
		createEOperation(cicloCondicionEClass, CICLO_CONDICION___OPERANDOS_NUMERICOS__DIAGNOSTICCHAIN_MAP);
		createEOperation(cicloCondicionEClass, CICLO_CONDICION___CONDICION_LOGICA__DIAGNOSTICCHAIN_MAP);

		mientrasEClass = createEClass(MIENTRAS);

		repetirEClass = createEClass(REPETIR);

		desdeEClass = createEClass(DESDE);
		createEReference(desdeEClass, DESDE__INICIO);
		createEReference(desdeEClass, DESDE__PASO);

		paraEClass = createEClass(PARA);
		createEReference(paraEClass, PARA__VARIABLE);
		createEAttribute(paraEClass, PARA__LIMITES);
		createEOperation(paraEClass, PARA___RANGO_NUMERICO__DIAGNOSTICCHAIN_MAP);
		createEOperation(paraEClass, PARA___VARIABLES_DECLARADAS__DIAGNOSTICCHAIN_MAP);

		incrementoEClass = createEClass(INCREMENTO);
		createEAttribute(incrementoEClass, INCREMENTO__NOMBRE);
		createEAttribute(incrementoEClass, INCREMENTO__OPERADOR);
		createEOperation(incrementoEClass, INCREMENTO___VARIABLE_DECLARADA__DIAGNOSTICCHAIN_MAP);

		saltoEClass = createEClass(SALTO);
		createEOperation(saltoEClass, SALTO___DENTRO_DE_CICLO__DIAGNOSTICCHAIN_MAP);

		romperEClass = createEClass(ROMPER);

		continuarEClass = createEClass(CONTINUAR);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__NOMBRE);
		createEOperation(variableEClass, VARIABLE___NOMBRE_NO_RESERVADO__DIAGNOSTICCHAIN_MAP);
		createEOperation(variableEClass, VARIABLE___NOMBRE_NO_RESERVADO_LATINO__DIAGNOSTICCHAIN_MAP);

		elegirEClass = createEClass(ELEGIR);
		createEAttribute(elegirEClass, ELEGIR__EXPRESION);
		createEReference(elegirEClass, ELEGIR__CASOS);
		createEReference(elegirEClass, ELEGIR__DEFECTO);
		createEOperation(elegirEClass, ELEGIR___CASOS_MISMO_TIPO__DIAGNOSTICCHAIN_MAP);
		createEOperation(elegirEClass, ELEGIR___VARIABLES_DECLARADAS__DIAGNOSTICCHAIN_MAP);
		createEOperation(elegirEClass, ELEGIR___CASO_REPETIDO__DIAGNOSTICCHAIN_MAP);

		casoEClass = createEClass(CASO);
		createEAttribute(casoEClass, CASO__VALORES);
		createEReference(casoEClass, CASO__SENTENCIAS);

		funcionEClass = createEClass(FUNCION);
		createEReference(funcionEClass, FUNCION__PARAMETROS);
		createEReference(funcionEClass, FUNCION__CUERPO);
		createEOperation(funcionEClass, FUNCION___FUNCION_UNICA__DIAGNOSTICCHAIN_MAP);
		createEOperation(funcionEClass, FUNCION___BLOQUE_NO_VACIO__DIAGNOSTICCHAIN_MAP);

		retornoEClass = createEClass(RETORNO);
		createEAttribute(retornoEClass, RETORNO__VALOR);
		createEOperation(retornoEClass, RETORNO___DENTRO_DE_FUNCION__DIAGNOSTICCHAIN_MAP);
		createEOperation(retornoEClass, RETORNO___VARIABLES_DECLARADAS__DIAGNOSTICCHAIN_MAP);
		createEOperation(retornoEClass, RETORNO___OPERANDOS_NUMERICOS__DIAGNOSTICCHAIN_MAP);

		llamadaEClass = createEClass(LLAMADA);
		createEAttribute(llamadaEClass, LLAMADA__FUNCION);
		createEAttribute(llamadaEClass, LLAMADA__ARGUMENTOS);
		createEOperation(llamadaEClass, LLAMADA___VARIABLES_DECLARADAS__DIAGNOSTICCHAIN_MAP);
		createEOperation(llamadaEClass, LLAMADA___OPERANDOS_NUMERICOS__DIAGNOSTICCHAIN_MAP);
		createEOperation(llamadaEClass, LLAMADA___FUNCION_DECLARADA__DIAGNOSTICCHAIN_MAP);
		createEOperation(llamadaEClass, LLAMADA___ARGUMENTOS_COMPLETOS__DIAGNOSTICCHAIN_MAP);

		// Create enums
		conversionEEnum = createEEnum(CONVERSION);
		operadorPasoEEnum = createEEnum(OPERADOR_PASO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sentenciaEClass.getESuperTypes().add(this.getElemento());
		definicionEClass.getESuperTypes().add(this.getSentencia());
		asignacionEClass.getESuperTypes().add(this.getDefinicion());
		leerEClass.getESuperTypes().add(this.getDefinicion());
		listaEClass.getESuperTypes().add(this.getDefinicion());
		asignacionIndiceEClass.getESuperTypes().add(this.getSentencia());
		condicionalEClass.getESuperTypes().add(this.getSentencia());
		osiEClass.getESuperTypes().add(this.getElemento());
		imprimirEClass.getESuperTypes().add(this.getSentencia());
		cicloEClass.getESuperTypes().add(this.getSentencia());
		cicloCondicionEClass.getESuperTypes().add(this.getCiclo());
		mientrasEClass.getESuperTypes().add(this.getCicloCondicion());
		repetirEClass.getESuperTypes().add(this.getCicloCondicion());
		desdeEClass.getESuperTypes().add(this.getCicloCondicion());
		paraEClass.getESuperTypes().add(this.getCiclo());
		incrementoEClass.getESuperTypes().add(this.getSentencia());
		saltoEClass.getESuperTypes().add(this.getSentencia());
		romperEClass.getESuperTypes().add(this.getSalto());
		continuarEClass.getESuperTypes().add(this.getSalto());
		variableEClass.getESuperTypes().add(this.getElemento());
		elegirEClass.getESuperTypes().add(this.getSentencia());
		casoEClass.getESuperTypes().add(this.getElemento());
		funcionEClass.getESuperTypes().add(this.getDefinicion());
		retornoEClass.getESuperTypes().add(this.getSentencia());
		llamadaEClass.getESuperTypes().add(this.getSentencia());

		// Initialize classes, features, and operations; add parameters
		initEClass(programaEClass, Programa.class, "Programa", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrograma_Sentencias(), this.getSentencia(), null, "sentencias", null, 0, -1, Programa.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getPrograma__DefineVariable__String(), ecorePackage.getEBoolean(),
				"defineVariable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "nombre", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPrograma__ProgramaNoVacio__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"ProgramaNoVacio", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(elementoEClass, Elemento.class, "Elemento", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getElemento__Programa(), this.getPrograma(), "programa", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElemento__UsaSoloVariablesDefinidas__String(), ecorePackage.getEBoolean(),
				"usaSoloVariablesDefinidas", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "texto", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElemento__TipoTexto__String(), ecorePackage.getEString(), "tipoTexto", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "texto", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElemento__OperandosNumericos__String(), ecorePackage.getEBoolean(), "operandosNumericos",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "texto", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElemento__EsReservadaGo__String(), ecorePackage.getEBoolean(), "esReservadaGo", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElemento__EsReservadaLatino__String(), ecorePackage.getEBoolean(), "esReservadaLatino",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "n", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sentenciaEClass, Sentencia.class, "Sentencia", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(definicionEClass, Definicion.class, "Definicion", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDefinicion_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Definicion.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getDefinicion__NombreNoReservado__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"NombreNoReservado", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDefinicion__NombreNoReservadoLatino__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"NombreNoReservadoLatino", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(asignacionEClass, Asignacion.class, "Asignacion", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAsignacion_Valor(), ecorePackage.getEString(), "valor", null, 0, 1, Asignacion.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getAsignacion__VariablesDeclaradas__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"VariablesDeclaradas", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAsignacion__OperandosNumericos__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"OperandosNumericos", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAsignacion__TipoConsistente__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"TipoConsistente", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(leerEClass, Leer.class, "Leer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLeer_Conversion(), this.getConversion(), "conversion", null, 0, 1, Leer.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getLeer__TipoLeido__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "TipoLeido", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(listaEClass, Lista.class, "Lista", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLista_Elementos(), ecorePackage.getEString(), "elementos", null, 0, -1, Lista.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		op = initEOperation(getLista__VariablesDeclaradas__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"VariablesDeclaradas", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLista__ListaSiempreLista__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"ListaSiempreLista", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLista__ElementosMismoTipo__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"ElementosMismoTipo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLista__OperandosNumericos__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"OperandosNumericos", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(asignacionIndiceEClass, AsignacionIndice.class, "AsignacionIndice", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAsignacionIndice_Lista(), ecorePackage.getEString(), "lista", null, 0, 1,
				AsignacionIndice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAsignacionIndice_Indice(), ecorePackage.getEString(), "indice", null, 0, 1,
				AsignacionIndice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAsignacionIndice_Valor(), ecorePackage.getEString(), "valor", null, 0, 1,
				AsignacionIndice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		op = initEOperation(getAsignacionIndice__VariablesDeclaradas__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"VariablesDeclaradas", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAsignacionIndice__TipoElemento__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"TipoElemento", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAsignacionIndice__ListaDeclarada__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"ListaDeclarada", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAsignacionIndice__IndiceNumerico__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"IndiceNumerico", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(condicionalEClass, Condicional.class, "Condicional", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCondicional_Condicion(), ecorePackage.getEString(), "condicion", null, 0, 1,
				Condicional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getCondicional_Entonces(), this.getSentencia(), null, "entonces", null, 0, -1, Condicional.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCondicional_Osis(), this.getOsi(), null, "osis", null, 0, -1, Condicional.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCondicional_Sino(), this.getSentencia(), null, "sino", null, 0, -1, Condicional.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getCondicional__VariablesDeclaradas__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"VariablesDeclaradas", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCondicional__CondicionLogica__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"CondicionLogica", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCondicional__BloqueNoVacio__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"BloqueNoVacio", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCondicional__OperandosNumericos__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"OperandosNumericos", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(osiEClass, Osi.class, "Osi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOsi_Condicion(), ecorePackage.getEString(), "condicion", null, 0, 1, Osi.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOsi_Sentencias(), this.getSentencia(), null, "sentencias", null, 0, -1, Osi.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getOsi__VariablesDeclaradas__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"VariablesDeclaradas", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getOsi__CondicionLogica__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"CondicionLogica", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getOsi__BloqueNoVacio__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "BloqueNoVacio",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getOsi__OperandosNumericos__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"OperandosNumericos", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(imprimirEClass, Imprimir.class, "Imprimir", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImprimir_Mensaje(), ecorePackage.getEString(), "mensaje", null, 0, 1, Imprimir.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getImprimir__OperandosNumericos__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"OperandosNumericos", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getImprimir__VariablesDeclaradas__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"VariablesDeclaradas", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(cicloEClass, Ciclo.class, "Ciclo", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCiclo_Cuerpo(), this.getSentencia(), null, "cuerpo", null, 0, -1, Ciclo.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		op = initEOperation(getCiclo__CuerpoNoVacio__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "CuerpoNoVacio",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(cicloCondicionEClass, CicloCondicion.class, "CicloCondicion", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCicloCondicion_Condicion(), ecorePackage.getEString(), "condicion", null, 0, 1,
				CicloCondicion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		op = initEOperation(getCicloCondicion__VariablesDeclaradas__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"VariablesDeclaradas", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCicloCondicion__OperandosNumericos__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"OperandosNumericos", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCicloCondicion__CondicionLogica__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"CondicionLogica", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(mientrasEClass, Mientras.class, "Mientras", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(repetirEClass, Repetir.class, "Repetir", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(desdeEClass, Desde.class, "Desde", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDesde_Inicio(), this.getAsignacion(), null, "inicio", null, 0, 1, Desde.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getDesde_Paso(), this.getSentencia(), null, "paso", null, 0, 1, Desde.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(paraEClass, Para.class, "Para", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPara_Variable(), this.getVariable(), null, "variable", null, 0, 1, Para.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getPara_Limites(), ecorePackage.getEString(), "limites", null, 1, 3, Para.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPara__RangoNumerico__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "RangoNumerico",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPara__VariablesDeclaradas__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"VariablesDeclaradas", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(incrementoEClass, Incremento.class, "Incremento", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIncremento_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Incremento.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncremento_Operador(), this.getOperadorPaso(), "operador", null, 0, 1, Incremento.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getIncremento__VariableDeclarada__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"VariableDeclarada", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(saltoEClass, Salto.class, "Salto", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getSalto__DentroDeCiclo__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "DentroDeCiclo",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(romperEClass, Romper.class, "Romper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(continuarEClass, Continuar.class, "Continuar", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_Nombre(), ecorePackage.getEString(), "nombre", null, 0, 1, Variable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getVariable__NombreNoReservado__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"NombreNoReservado", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVariable__NombreNoReservadoLatino__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"NombreNoReservadoLatino", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(elegirEClass, Elegir.class, "Elegir", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElegir_Expresion(), ecorePackage.getEString(), "expresion", null, 0, 1, Elegir.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElegir_Casos(), this.getCaso(), null, "casos", null, 0, -1, Elegir.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getElegir_Defecto(), this.getSentencia(), null, "defecto", null, 0, -1, Elegir.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getElegir__CasosMismoTipo__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"CasosMismoTipo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElegir__VariablesDeclaradas__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"VariablesDeclaradas", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElegir__CasoRepetido__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "CasoRepetido",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(casoEClass, Caso.class, "Caso", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCaso_Valores(), ecorePackage.getEString(), "valores", null, 1, -1, Caso.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCaso_Sentencias(), this.getSentencia(), null, "sentencias", null, 1, -1, Caso.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(funcionEClass, Funcion.class, "Funcion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFuncion_Parametros(), this.getVariable(), null, "parametros", null, 0, -1, Funcion.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFuncion_Cuerpo(), this.getSentencia(), null, "cuerpo", null, 0, -1, Funcion.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getFuncion__FuncionUnica__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "FuncionUnica",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFuncion__BloqueNoVacio__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"BloqueNoVacio", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(retornoEClass, Retorno.class, "Retorno", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRetorno_Valor(), ecorePackage.getEString(), "valor", null, 0, 1, Retorno.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getRetorno__DentroDeFuncion__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"DentroDeFuncion", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRetorno__VariablesDeclaradas__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"VariablesDeclaradas", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRetorno__OperandosNumericos__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"OperandosNumericos", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(llamadaEClass, Llamada.class, "Llamada", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLlamada_Funcion(), ecorePackage.getEString(), "funcion", null, 0, 1, Llamada.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLlamada_Argumentos(), ecorePackage.getEString(), "argumentos", null, 0, -1, Llamada.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		op = initEOperation(getLlamada__VariablesDeclaradas__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"VariablesDeclaradas", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLlamada__OperandosNumericos__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"OperandosNumericos", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLlamada__FuncionDeclarada__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"FuncionDeclarada", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLlamada__ArgumentosCompletos__DiagnosticChain_Map(), ecorePackage.getEBoolean(),
				"ArgumentosCompletos", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(conversionEEnum, Conversion.class, "Conversion");
		addEEnumLiteral(conversionEEnum, Conversion.NINGUNA);
		addEEnumLiteral(conversionEEnum, Conversion.NUMERO);
		addEEnumLiteral(conversionEEnum, Conversion.TEXTO);

		initEEnum(operadorPasoEEnum, OperadorPaso.class, "OperadorPaso");
		addEEnumLiteral(operadorPasoEEnum, OperadorPaso.MAS);
		addEEnumLiteral(operadorPasoEEnum, OperadorPaso.MENOS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source, new String[] {});
		addAnnotation(programaEClass, source, new String[] { "constraints", "ProgramaNoVacio" });
		addAnnotation(definicionEClass, source, new String[] { "constraints", "NombreNoReservadoLatino" });
		addAnnotation(asignacionEClass, source, new String[] { "constraints", "TipoConsistente" });
		addAnnotation(leerEClass, source, new String[] { "constraints", "TipoLeido" });
		addAnnotation(listaEClass, source, new String[] { "constraints", "OperandosNumericos" });
		addAnnotation(asignacionIndiceEClass, source, new String[] { "constraints", "IndiceNumerico" });
		addAnnotation(condicionalEClass, source, new String[] { "constraints", "OperandosNumericos" });
		addAnnotation(osiEClass, source, new String[] { "constraints", "OperandosNumericos" });
		addAnnotation(imprimirEClass, source, new String[] { "constraints", "VariablesDeclaradas" });
		addAnnotation(cicloEClass, source, new String[] { "constraints", "CuerpoNoVacio" });
		addAnnotation(cicloCondicionEClass, source, new String[] { "constraints", "CondicionLogica" });
		addAnnotation(paraEClass, source, new String[] { "constraints", "VariablesDeclaradas" });
		addAnnotation(incrementoEClass, source, new String[] { "constraints", "VariableDeclarada" });
		addAnnotation(saltoEClass, source, new String[] { "constraints", "DentroDeCiclo" });
		addAnnotation(variableEClass, source, new String[] { "constraints", "NombreNoReservadoLatino" });
		addAnnotation(elegirEClass, source, new String[] { "constraints", "CasoRepetido" });
		addAnnotation(funcionEClass, source, new String[] { "constraints", "BloqueNoVacio" });
		addAnnotation(retornoEClass, source, new String[] { "constraints", "OperandosNumericos" });
		addAnnotation(llamadaEClass, source, new String[] { "constraints", "ArgumentosCompletos" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(getPrograma__DefineVariable__String(), source, new String[] { "body",
				"\n\t\t\tself.oclAsType(ocl::OclElement)->closure(e | e.oclContents())->exists(e | (e.oclIsKindOf(Definicion) and e.oclAsType(Definicion).nombre = nombre) or (e.oclIsKindOf(Variable) and e.oclAsType(Variable).nombre = nombre))" });
		addAnnotation(getPrograma__ProgramaNoVacio__DiagnosticChain_Map(), source, new String[] { "body",
				"\n\t\t\tTuple {\n\t\t\t\tmessage : String = \'El programa esta vacio, agrega al menos una sentencia\',\n\t\t\t\tseverity : Integer = -1,\n\t\t\t\tstatus : Boolean = sentencias->notEmpty()\n\t\t\t}.status" });
		addAnnotation(getElemento__Programa(), source, new String[] { "body",
				"\n\t\t\tself.oclAsType(ocl::OclElement)->closure(e | e.oclContainer())->select(e | e.oclIsKindOf(Programa))->any(true).oclAsType(Programa)" });
		addAnnotation(getElemento__UsaSoloVariablesDefinidas__String(), source, new String[] { "body",
				"\n\t\t\ttexto = null or\n\t\t\t\ttexto.replaceAll(\'\"[^\"]*\"|\\\'[^\\\']*\\\'\', \'\')\n\t\t\t\t.tokenize(\' ()[]<>=!&|+-*/%.,\')\n\t\t\t\t->select(t | t.matches(\'[a-zA-Z_][a-zA-Z0-9_]*\') and t <> \'verdadero\' and t <> \'falso\' and t <> \'cierto\')\n\t\t\t\t->forAll(t | self.programa().defineVariable(t))" });
		addAnnotation(getElemento__TipoTexto__String(), source, new String[] { "body",
				"\n\t\t\tif texto = null then \'desconocido\' else\n\t\t\t\tlet s : String = texto.replaceAll(\'\"[^\"]*\"|\\\'[^\\\']*\\\'\', \'\') in\n\t\t\t\tif s.matches(\'.*[a-zA-Z_][a-zA-Z0-9_]* *[(].*\') then \'desconocido\'\n\t\t\t\telse if s.matches(\'.*(==|!=|<|>|&&|[|][|]|!).*\') or s.matches(\'.*\\\\b(verdadero|falso|cierto)\\\\b.*\') then \'logico\'\n\t\t\t\telse if texto.matches(\'.*([\"\\\']|[.][.]).*\') then \'texto\'\n\t\t\t\telse if s.tokenize(\' ()[]<>=!&|+-*/%.,\')->forAll(t | not t.matches(\'[a-zA-Z_][a-zA-Z0-9_]*\')) then \'numero\'\n\t\t\t\telse \'desconocido\'\n\t\t\t\tendif endif endif endif\n\t\t\tendif" });
		addAnnotation(getElemento__OperandosNumericos__String(), source, new String[] { "body",
				"\n\t\t\ttexto = null or texto.replaceAll(\'\"[^\"]*\"|\\\'[^\\\']*\\\'\', \'\').matches(\'.*[a-zA-Z_][a-zA-Z0-9_]* *[(].*\') or\n\t\t\t\tnot texto.replaceAll(\'\"[^\"]*\"|\\\'[^\\\']*\\\'\', \'@\')\n\t\t\t\t.replaceAll(\'[()]\', \'\')\n\t\t\t\t.replaceAll(\'\\\\b(verdadero|falso|cierto)\\\\b\', \'@\')\n\t\t\t\t.replaceAll(\' \', \'\')\n\t\t\t\t.matches(\'.*(@[-+*/%]|[-+*/%]@).*\')" });
		addAnnotation(getElemento__EsReservadaGo__String(), source, new String[] { "body",
				"Set{\'break\', \'case\', \'chan\', \'const\', \'continue\', \'default\', \'defer\', \'else\', \'fallthrough\', \'for\', \'func\', \'go\', \'goto\', \'if\', \'import\', \'interface\', \'map\', \'package\', \'range\', \'return\', \'select\', \'struct\', \'switch\', \'type\', \'var\', \'fmt\', \'main\', \'true\', \'false\', \'nil\', \'int\', \'float64\', \'string\', \'bool\', \'any\', \'init\', \'_\', \'leerTexto\', \'leerNumero\', \'aTexto\', \'lector\', \'bufio\', \'math\', \'os\', \'strconv\', \'strings\', \'ultimaVuelta\'}->includes(n)" });
		addAnnotation(getElemento__EsReservadaLatino__String(), source, new String[] { "body",
				"Set{\'global\', \'ir\', \'nulo\', \'clase\', \'constructor\', \'hereda\', \'super\', \'mi\', \'estatico\', \'nueva\'}->includes(n)" });
		addAnnotation(getDefinicion__NombreNoReservado__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple { message : String = \'Ese nombre es una palabra reservada de Go, usa otro\', severity : Integer = -1, status : Boolean = not esReservadaGo(nombre) }.status" });
		addAnnotation(getDefinicion__NombreNoReservadoLatino__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple { message : String = \'Ese nombre es una palabra de Latino, usa otro\', severity : Integer = -1, status : Boolean = not esReservadaLatino(nombre) }.status" });
		addAnnotation(getAsignacion__VariablesDeclaradas__DiagnosticChain_Map(), source, new String[] { "body",
				"\n\t\t\tTuple {\n\t\t\t\tmessage : String = \'El valor usa una variable que no existe\',\n\t\t\t\tseverity : Integer = -1,\n\t\t\t\tstatus : Boolean = usaSoloVariablesDefinidas(valor)\n\t\t\t}.status" });
		addAnnotation(getAsignacion__OperandosNumericos__DiagnosticChain_Map(), source, new String[] { "body",
				"\n\t\t\tTuple {\n\t\t\t\tmessage : String = \'No uses + - * / % con textos o logicos, para unir textos usa ..\',\n\t\t\t\tseverity : Integer = -1,\n\t\t\t\tstatus : Boolean = not usaSoloVariablesDefinidas(valor) or operandosNumericos(valor)\n\t\t\t}.status" });
		addAnnotation(getAsignacion__TipoConsistente__DiagnosticChain_Map(), source, new String[] { "body",
				"\n\t\t\tTuple {\n\t\t\t\tmessage : String = \'La variable cambia de tipo, no mezcles numeros, textos y logicos\',\n\t\t\t\tseverity : Integer = -1,\n\t\t\t\tstatus : Boolean = not usaSoloVariablesDefinidas(valor) or\n\t\t\t\t\t(let mio : String = tipoTexto(valor) in\n\t\t\t\t\tmio = \'desconocido\' or\n\t\t\t\t\tprograma().oclAsType(ocl::OclElement)->closure(e | e.oclContents())->selectByKind(Asignacion)\n\t\t\t\t\t\t->select(a | a.nombre = self.nombre and a.usaSoloVariablesDefinidas(a.valor))\n\t\t\t\t\t\t->forAll(a | let otro : String = a.tipoTexto(a.valor) in otro = \'desconocido\' or otro = mio))\n\t\t\t}.status" });
		addAnnotation(getLeer__TipoLeido__DiagnosticChain_Map(), source, new String[] { "body",
				"\n\t\t\tTuple {\n\t\t\t\tmessage : String = if conversion = Conversion::NUMERO\n\t\t\t\t\tthen \'Esta variable se lee como numero pero luego le das otro tipo\'\n\t\t\t\t\telse \'Esta variable se lee como texto pero luego le das otro tipo\' endif,\n\t\t\t\tseverity : Integer = -1,\n\t\t\t\tstatus : Boolean = conversion = Conversion::NINGUNA or\n\t\t\t\t\t(let esperado : String = if conversion = Conversion::NUMERO then \'numero\' else \'texto\' endif in\n\t\t\t\t\tprograma().oclAsType(ocl::OclElement)->closure(e | e.oclContents())->selectByKind(Asignacion)\n\t\t\t\t\t\t->select(a | a.nombre = self.nombre and a.usaSoloVariablesDefinidas(a.valor))\n\t\t\t\t\t\t->forAll(a | let otro : String = a.tipoTexto(a.valor) in otro = \'desconocido\' or otro = esperado))\n\t\t\t}.status" });
		addAnnotation(getLista__VariablesDeclaradas__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple { message : String = \'La lista usa una variable que no existe\', severity : Integer = -1, status : Boolean = elementos->forAll(e | usaSoloVariablesDefinidas(e)) }.status" });
		addAnnotation(getLista__ListaSiempreLista__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple { message : String = \'Esta variable es una lista, no le des un valor suelto\', severity : Integer = -1, status : Boolean = programa().oclAsType(ocl::OclElement)->closure(e | e.oclContents())->select(e | e.oclIsKindOf(Asignacion) or e.oclIsKindOf(Leer))->forAll(e | e.oclAsType(Definicion).nombre <> nombre) }.status" });
		addAnnotation(getLista__ElementosMismoTipo__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple { message : String = \'La lista mezcla numeros, textos y logicos, usa un solo tipo\', severity : Integer = -1, status : Boolean = not elementos->forAll(e | usaSoloVariablesDefinidas(e) and operandosNumericos(e)) or programa().oclAsType(ocl::OclElement)->closure(e | e.oclContents())->selectByKind(Lista)->select(l | l.nombre = nombre)->collect(l | l.elementos->collect(e | l.tipoTexto(e)))->reject(t | t = \'desconocido\')->asSet()->size() <= 1 }.status" });
		addAnnotation(getLista__OperandosNumericos__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple { message : String = \'No uses + - * / % con textos o logicos, para unir textos usa ..\', severity : Integer = -1, status : Boolean = not elementos->forAll(e | usaSoloVariablesDefinidas(e)) or elementos->forAll(e | operandosNumericos(e)) }.status" });
		addAnnotation(getAsignacionIndice__VariablesDeclaradas__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple { message : String = \'El indice o el valor usan una variable que no existe\', severity : Integer = -1, status : Boolean = usaSoloVariablesDefinidas(indice) and usaSoloVariablesDefinidas(valor) }.status" });
		addAnnotation(getAsignacionIndice__TipoElemento__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple { message : String = \'El valor no es del mismo tipo que los elementos de la lista\', severity : Integer = -1, status : Boolean = not usaSoloVariablesDefinidas(valor) or (let t : String = tipoTexto(valor) in t = \'desconocido\' or programa().oclAsType(ocl::OclElement)->closure(e | e.oclContents())->selectByKind(Lista)->select(l | l.nombre = lista)->forAll(l | l.elementos->forAll(e | let o : String = l.tipoTexto(e) in o = \'desconocido\' or o = t))) }.status" });
		addAnnotation(getAsignacionIndice__ListaDeclarada__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple { message : String = \'Ese nombre no es una lista, creala antes con corchetes\', severity : Integer = -1, status : Boolean = programa().oclAsType(ocl::OclElement)->closure(e | e.oclContents())->selectByKind(Lista)->exists(l | l.nombre = lista) }.status" });
		addAnnotation(getAsignacionIndice__IndiceNumerico__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple { message : String = \'El indice debe ser un numero, por ejemplo v[0]\', severity : Integer = -1, status : Boolean = not usaSoloVariablesDefinidas(indice) or (let t : String = tipoTexto(indice) in t <> \'texto\' and t <> \'logico\') }.status" });
		addAnnotation(getCondicional__VariablesDeclaradas__DiagnosticChain_Map(), source, new String[] { "body",
				"\n\t\t\tTuple {\n\t\t\t\tmessage : String = \'La condicion usa una variable que no existe\',\n\t\t\t\tseverity : Integer = -1,\n\t\t\t\tstatus : Boolean = usaSoloVariablesDefinidas(condicion)\n\t\t\t}.status" });
		addAnnotation(getCondicional__CondicionLogica__DiagnosticChain_Map(), source, new String[] { "body",
				"\n\t\t\tTuple {\n\t\t\t\tmessage : String = \'La condicion debe ser verdadera o falsa, por ejemplo edad > 18\',\n\t\t\t\tseverity : Integer = -1,\n\t\t\t\tstatus : Boolean = not usaSoloVariablesDefinidas(condicion) or not operandosNumericos(condicion) or\n\t\t\t\t\t(let tipo : String = tipoTexto(condicion) in tipo <> \'numero\' and tipo <> \'texto\')\n\t\t\t}.status" });
		addAnnotation(getCondicional__BloqueNoVacio__DiagnosticChain_Map(), source, new String[] { "body",
				"\n\t\t\tTuple {\n\t\t\t\tmessage : String = \'El si necesita al menos una sentencia dentro\',\n\t\t\t\tseverity : Integer = -1,\n\t\t\t\tstatus : Boolean = entonces->notEmpty()\n\t\t\t}.status" });
		addAnnotation(getCondicional__OperandosNumericos__DiagnosticChain_Map(), source, new String[] { "body",
				"\n\t\t\tTuple {\n\t\t\t\tmessage : String = \'No uses + - * / % con textos o logicos, para unir textos usa ..\',\n\t\t\t\tseverity : Integer = -1,\n\t\t\t\tstatus : Boolean = not usaSoloVariablesDefinidas(condicion) or operandosNumericos(condicion)\n\t\t\t}.status" });
		addAnnotation(getOsi__VariablesDeclaradas__DiagnosticChain_Map(), source, new String[] { "body",
				"\n\t\t\tTuple {\n\t\t\t\tmessage : String = \'La condicion del osi usa una variable que no existe\',\n\t\t\t\tseverity : Integer = -1,\n\t\t\t\tstatus : Boolean = usaSoloVariablesDefinidas(condicion)\n\t\t\t}.status" });
		addAnnotation(getOsi__CondicionLogica__DiagnosticChain_Map(), source, new String[] { "body",
				"\n\t\t\tTuple {\n\t\t\t\tmessage : String = \'La condicion del osi debe ser verdadera o falsa, por ejemplo edad > 18\',\n\t\t\t\tseverity : Integer = -1,\n\t\t\t\tstatus : Boolean = not usaSoloVariablesDefinidas(condicion) or not operandosNumericos(condicion) or\n\t\t\t\t\t(let tipo : String = tipoTexto(condicion) in tipo <> \'numero\' and tipo <> \'texto\')\n\t\t\t}.status" });
		addAnnotation(getOsi__BloqueNoVacio__DiagnosticChain_Map(), source, new String[] { "body",
				"\n\t\t\tTuple {\n\t\t\t\tmessage : String = \'El osi necesita al menos una sentencia dentro\',\n\t\t\t\tseverity : Integer = -1,\n\t\t\t\tstatus : Boolean = sentencias->notEmpty()\n\t\t\t}.status" });
		addAnnotation(getOsi__OperandosNumericos__DiagnosticChain_Map(), source, new String[] { "body",
				"\n\t\t\tTuple {\n\t\t\t\tmessage : String = \'No uses + - * / % con textos o logicos, para unir textos usa ..\',\n\t\t\t\tseverity : Integer = -1,\n\t\t\t\tstatus : Boolean = not usaSoloVariablesDefinidas(condicion) or operandosNumericos(condicion)\n\t\t\t}.status" });
		addAnnotation(getImprimir__OperandosNumericos__DiagnosticChain_Map(), source, new String[] { "body",
				"\n\t\t\tTuple {\n\t\t\t\tmessage : String = \'No uses + - * / % con textos o logicos, para unir textos usa ..\',\n\t\t\t\tseverity : Integer = -1,\n\t\t\t\tstatus : Boolean = not usaSoloVariablesDefinidas(mensaje) or operandosNumericos(mensaje)\n\t\t\t}.status" });
		addAnnotation(getImprimir__VariablesDeclaradas__DiagnosticChain_Map(), source, new String[] { "body",
				"\n\t\t\tTuple {\n\t\t\t\tmessage : String = \'escribir usa una variable que no existe\',\n\t\t\t\tseverity : Integer = -1,\n\t\t\t\tstatus : Boolean = usaSoloVariablesDefinidas(mensaje)\n\t\t\t}.status" });
		addAnnotation(getCiclo__CuerpoNoVacio__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple { message : String = \'El ciclo necesita al menos una sentencia dentro\', severity : Integer = -1, status : Boolean = cuerpo->notEmpty() }.status" });
		addAnnotation(getCicloCondicion__VariablesDeclaradas__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple { message : String = \'La condicion del ciclo usa una variable que no existe\', severity : Integer = -1, status : Boolean = usaSoloVariablesDefinidas(condicion) }.status" });
		addAnnotation(getCicloCondicion__OperandosNumericos__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple { message : String = \'No uses + - * / % con textos o logicos, para unir textos usa ..\', severity : Integer = -1, status : Boolean = not usaSoloVariablesDefinidas(condicion) or operandosNumericos(condicion) }.status" });
		addAnnotation(getCicloCondicion__CondicionLogica__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple { message : String = \'La condicion del ciclo debe ser verdadera o falsa, por ejemplo i < 10\', severity : Integer = -1, status : Boolean = not usaSoloVariablesDefinidas(condicion) or not operandosNumericos(condicion) or (let tipo : String = tipoTexto(condicion) in tipo <> \'numero\' and tipo <> \'texto\') }.status" });
		addAnnotation(getPara__RangoNumerico__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple { message : String = \'Los valores del rango deben ser numeros\', severity : Integer = -1, status : Boolean = not limites->forAll(l | usaSoloVariablesDefinidas(l)) or limites->forAll(l | let t : String = tipoTexto(l) in t <> \'texto\' and t <> \'logico\') }.status" });
		addAnnotation(getPara__VariablesDeclaradas__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple { message : String = \'El rango usa una variable que no existe\', severity : Integer = -1, status : Boolean = limites->forAll(l | usaSoloVariablesDefinidas(l)) }.status" });
		addAnnotation(getIncremento__VariableDeclarada__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple { message : String = \'Esa variable no existe, dale un valor antes de usar ++ o --\', severity : Integer = -1, status : Boolean = programa().defineVariable(nombre) }.status" });
		addAnnotation(getSalto__DentroDeCiclo__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple { message : String = \'romper y continuar solo van dentro de un ciclo\', severity : Integer = -1, status : Boolean = self.oclAsType(ocl::OclElement)->closure(e | e.oclContainer())->exists(e | e.oclIsKindOf(Ciclo)) }.status" });
		addAnnotation(getVariable__NombreNoReservado__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple { message : String = \'Ese nombre es una palabra reservada de Go, usa otro\', severity : Integer = -1, status : Boolean = not esReservadaGo(nombre) }.status" });
		addAnnotation(getVariable__NombreNoReservadoLatino__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple { message : String = \'Ese nombre es una palabra de Latino, usa otro\', severity : Integer = -1, status : Boolean = not esReservadaLatino(nombre) }.status" });
		addAnnotation(getElegir__CasosMismoTipo__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple { message : String = \'Los casos deben ser del mismo tipo que lo que se elige, numeros o textos\', severity : Integer = -1, status : Boolean = not usaSoloVariablesDefinidas(expresion) or casos->collect(c | c.valores)->collect(v | tipoTexto(v))->asSet()->union(programa().oclAsType(ocl::OclElement)->closure(e | e.oclContents())->selectByKind(Asignacion)->select(a | a.nombre = expresion)->collect(a | a.tipoTexto(a.valor))->asSet())->including(tipoTexto(expresion))->excluding(\'desconocido\')->size() <= 1 }.status" });
		addAnnotation(getElegir__VariablesDeclaradas__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple { message : String = \'El elegir usa una variable que no existe\', severity : Integer = -1, status : Boolean = usaSoloVariablesDefinidas(expresion) }.status" });
		addAnnotation(getElegir__CasoRepetido__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple { message : String = \'Ese valor ya esta en otro caso del elegir\', severity : Integer = -1, status : Boolean = casos->collect(c | c.valores)->size() = casos->collect(c | c.valores)->asSet()->size() }.status" });
		addAnnotation(getFuncion__FuncionUnica__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple { message : String = \'Ese nombre ya lo usa otra funcion o una variable\', severity : Integer = -1, status : Boolean = programa().oclAsType(ocl::OclElement)->closure(e | e.oclContents())->selectByKind(Definicion)->forAll(d | d = self or d.nombre <> nombre) }.status" });
		addAnnotation(getFuncion__BloqueNoVacio__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple { message : String = \'La funcion necesita al menos una sentencia dentro\', severity : Integer = -1, status : Boolean = cuerpo->notEmpty() }.status" });
		addAnnotation(getRetorno__DentroDeFuncion__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple { message : String = \'retorno solo puede ir dentro de una funcion\', severity : Integer = -1, status : Boolean = self.oclAsType(ocl::OclElement)->closure(e | e.oclContainer())->exists(e | e.oclIsKindOf(Funcion)) }.status" });
		addAnnotation(getRetorno__VariablesDeclaradas__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple { message : String = \'El valor del retorno usa una variable que no existe\', severity : Integer = -1, status : Boolean = usaSoloVariablesDefinidas(valor) }.status" });
		addAnnotation(getRetorno__OperandosNumericos__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple { message : String = \'No uses + - * / % con textos o logicos, para unir textos usa ..\', severity : Integer = -1, status : Boolean = not usaSoloVariablesDefinidas(valor) or operandosNumericos(valor) }.status" });
		addAnnotation(getLlamada__VariablesDeclaradas__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple { message : String = \'La llamada usa una variable que no existe\', severity : Integer = -1, status : Boolean = argumentos->forAll(a | usaSoloVariablesDefinidas(a)) }.status" });
		addAnnotation(getLlamada__OperandosNumericos__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple { message : String = \'No uses + - * / % con textos o logicos, para unir textos usa ..\', severity : Integer = -1, status : Boolean = not argumentos->forAll(a | usaSoloVariablesDefinidas(a)) or argumentos->forAll(a | operandosNumericos(a)) }.status" });
		addAnnotation(getLlamada__FuncionDeclarada__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple { message : String = \'Esa funcion no existe, definela antes con funcion\', severity : Integer = -1, status : Boolean = programa().oclAsType(ocl::OclElement)->closure(e | e.oclContents())->selectByKind(Funcion)->exists(f | f.nombre = funcion) }.status" });
		addAnnotation(getLlamada__ArgumentosCompletos__DiagnosticChain_Map(), source, new String[] { "body",
				"Tuple { message : String = \'La llamada no lleva tantos valores como parametros tiene la funcion\', severity : Integer = -1, status : Boolean = programa().oclAsType(ocl::OclElement)->closure(e | e.oclContents())->selectByKind(Funcion)->select(f | f.nombre = funcion)->forAll(f | f.parametros->size() = argumentos->size()) }.status" });
	}

} //LatinoPackageImpl
