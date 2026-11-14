/**
 */
package latino;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see latino.LatinoFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface LatinoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "latino";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.uta.edu.ec/latino";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "latino";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LatinoPackage eINSTANCE = latino.impl.LatinoPackageImpl.init();

	/**
	 * The meta object id for the '{@link latino.impl.ProgramaImpl <em>Programa</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see latino.impl.ProgramaImpl
	 * @see latino.impl.LatinoPackageImpl#getPrograma()
	 * @generated
	 */
	int PROGRAMA = 0;

	/**
	 * The feature id for the '<em><b>Sentencias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMA__SENTENCIAS = 0;

	/**
	 * The number of structural features of the '<em>Programa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMA_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Define Variable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMA___DEFINE_VARIABLE__STRING = 0;

	/**
	 * The operation id for the '<em>Programa No Vacio</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMA___PROGRAMA_NO_VACIO__DIAGNOSTICCHAIN_MAP = 1;

	/**
	 * The number of operations of the '<em>Programa</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMA_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link latino.impl.ElementoImpl <em>Elemento</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see latino.impl.ElementoImpl
	 * @see latino.impl.LatinoPackageImpl#getElemento()
	 * @generated
	 */
	int ELEMENTO = 1;

	/**
	 * The number of structural features of the '<em>Elemento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Programa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO___PROGRAMA = 0;

	/**
	 * The operation id for the '<em>Usa Solo Variables Definidas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO___USA_SOLO_VARIABLES_DEFINIDAS__STRING = 1;

	/**
	 * The operation id for the '<em>Tipo Texto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO___TIPO_TEXTO__STRING = 2;

	/**
	 * The operation id for the '<em>Operandos Numericos</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO___OPERANDOS_NUMERICOS__STRING = 3;

	/**
	 * The operation id for the '<em>Es Reservada Go</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO___ES_RESERVADA_GO__STRING = 4;

	/**
	 * The operation id for the '<em>Es Reservada Latino</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO___ES_RESERVADA_LATINO__STRING = 5;

	/**
	 * The number of operations of the '<em>Elemento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link latino.impl.SentenciaImpl <em>Sentencia</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see latino.impl.SentenciaImpl
	 * @see latino.impl.LatinoPackageImpl#getSentencia()
	 * @generated
	 */
	int SENTENCIA = 2;

	/**
	 * The number of structural features of the '<em>Sentencia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCIA_FEATURE_COUNT = ELEMENTO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Programa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCIA___PROGRAMA = ELEMENTO___PROGRAMA;

	/**
	 * The operation id for the '<em>Usa Solo Variables Definidas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCIA___USA_SOLO_VARIABLES_DEFINIDAS__STRING = ELEMENTO___USA_SOLO_VARIABLES_DEFINIDAS__STRING;

	/**
	 * The operation id for the '<em>Tipo Texto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCIA___TIPO_TEXTO__STRING = ELEMENTO___TIPO_TEXTO__STRING;

	/**
	 * The operation id for the '<em>Operandos Numericos</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCIA___OPERANDOS_NUMERICOS__STRING = ELEMENTO___OPERANDOS_NUMERICOS__STRING;

	/**
	 * The operation id for the '<em>Es Reservada Go</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCIA___ES_RESERVADA_GO__STRING = ELEMENTO___ES_RESERVADA_GO__STRING;

	/**
	 * The operation id for the '<em>Es Reservada Latino</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCIA___ES_RESERVADA_LATINO__STRING = ELEMENTO___ES_RESERVADA_LATINO__STRING;

	/**
	 * The number of operations of the '<em>Sentencia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCIA_OPERATION_COUNT = ELEMENTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link latino.impl.DefinicionImpl <em>Definicion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see latino.impl.DefinicionImpl
	 * @see latino.impl.LatinoPackageImpl#getDefinicion()
	 * @generated
	 */
	int DEFINICION = 3;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINICION__NOMBRE = SENTENCIA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Definicion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINICION_FEATURE_COUNT = SENTENCIA_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Programa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINICION___PROGRAMA = SENTENCIA___PROGRAMA;

	/**
	 * The operation id for the '<em>Usa Solo Variables Definidas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINICION___USA_SOLO_VARIABLES_DEFINIDAS__STRING = SENTENCIA___USA_SOLO_VARIABLES_DEFINIDAS__STRING;

	/**
	 * The operation id for the '<em>Tipo Texto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINICION___TIPO_TEXTO__STRING = SENTENCIA___TIPO_TEXTO__STRING;

	/**
	 * The operation id for the '<em>Operandos Numericos</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINICION___OPERANDOS_NUMERICOS__STRING = SENTENCIA___OPERANDOS_NUMERICOS__STRING;

	/**
	 * The operation id for the '<em>Es Reservada Go</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINICION___ES_RESERVADA_GO__STRING = SENTENCIA___ES_RESERVADA_GO__STRING;

	/**
	 * The operation id for the '<em>Es Reservada Latino</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINICION___ES_RESERVADA_LATINO__STRING = SENTENCIA___ES_RESERVADA_LATINO__STRING;

	/**
	 * The operation id for the '<em>Nombre No Reservado</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINICION___NOMBRE_NO_RESERVADO__DIAGNOSTICCHAIN_MAP = SENTENCIA_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Nombre No Reservado Latino</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINICION___NOMBRE_NO_RESERVADO_LATINO__DIAGNOSTICCHAIN_MAP = SENTENCIA_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Definicion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINICION_OPERATION_COUNT = SENTENCIA_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link latino.impl.AsignacionImpl <em>Asignacion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see latino.impl.AsignacionImpl
	 * @see latino.impl.LatinoPackageImpl#getAsignacion()
	 * @generated
	 */
	int ASIGNACION = 4;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNACION__NOMBRE = DEFINICION__NOMBRE;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNACION__VALOR = DEFINICION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Asignacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNACION_FEATURE_COUNT = DEFINICION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Programa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNACION___PROGRAMA = DEFINICION___PROGRAMA;

	/**
	 * The operation id for the '<em>Usa Solo Variables Definidas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNACION___USA_SOLO_VARIABLES_DEFINIDAS__STRING = DEFINICION___USA_SOLO_VARIABLES_DEFINIDAS__STRING;

	/**
	 * The operation id for the '<em>Tipo Texto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNACION___TIPO_TEXTO__STRING = DEFINICION___TIPO_TEXTO__STRING;

	/**
	 * The operation id for the '<em>Operandos Numericos</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNACION___OPERANDOS_NUMERICOS__STRING = DEFINICION___OPERANDOS_NUMERICOS__STRING;

	/**
	 * The operation id for the '<em>Es Reservada Go</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNACION___ES_RESERVADA_GO__STRING = DEFINICION___ES_RESERVADA_GO__STRING;

	/**
	 * The operation id for the '<em>Es Reservada Latino</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNACION___ES_RESERVADA_LATINO__STRING = DEFINICION___ES_RESERVADA_LATINO__STRING;

	/**
	 * The operation id for the '<em>Nombre No Reservado</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNACION___NOMBRE_NO_RESERVADO__DIAGNOSTICCHAIN_MAP = DEFINICION___NOMBRE_NO_RESERVADO__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Nombre No Reservado Latino</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNACION___NOMBRE_NO_RESERVADO_LATINO__DIAGNOSTICCHAIN_MAP = DEFINICION___NOMBRE_NO_RESERVADO_LATINO__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Variables Declaradas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNACION___VARIABLES_DECLARADAS__DIAGNOSTICCHAIN_MAP = DEFINICION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Operandos Numericos</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNACION___OPERANDOS_NUMERICOS__DIAGNOSTICCHAIN_MAP = DEFINICION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Tipo Consistente</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNACION___TIPO_CONSISTENTE__DIAGNOSTICCHAIN_MAP = DEFINICION_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Asignacion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNACION_OPERATION_COUNT = DEFINICION_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link latino.impl.LeerImpl <em>Leer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see latino.impl.LeerImpl
	 * @see latino.impl.LatinoPackageImpl#getLeer()
	 * @generated
	 */
	int LEER = 5;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEER__NOMBRE = DEFINICION__NOMBRE;

	/**
	 * The feature id for the '<em><b>Conversion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEER__CONVERSION = DEFINICION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Leer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEER_FEATURE_COUNT = DEFINICION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Programa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEER___PROGRAMA = DEFINICION___PROGRAMA;

	/**
	 * The operation id for the '<em>Usa Solo Variables Definidas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEER___USA_SOLO_VARIABLES_DEFINIDAS__STRING = DEFINICION___USA_SOLO_VARIABLES_DEFINIDAS__STRING;

	/**
	 * The operation id for the '<em>Tipo Texto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEER___TIPO_TEXTO__STRING = DEFINICION___TIPO_TEXTO__STRING;

	/**
	 * The operation id for the '<em>Operandos Numericos</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEER___OPERANDOS_NUMERICOS__STRING = DEFINICION___OPERANDOS_NUMERICOS__STRING;

	/**
	 * The operation id for the '<em>Es Reservada Go</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEER___ES_RESERVADA_GO__STRING = DEFINICION___ES_RESERVADA_GO__STRING;

	/**
	 * The operation id for the '<em>Es Reservada Latino</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEER___ES_RESERVADA_LATINO__STRING = DEFINICION___ES_RESERVADA_LATINO__STRING;

	/**
	 * The operation id for the '<em>Nombre No Reservado</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEER___NOMBRE_NO_RESERVADO__DIAGNOSTICCHAIN_MAP = DEFINICION___NOMBRE_NO_RESERVADO__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Nombre No Reservado Latino</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEER___NOMBRE_NO_RESERVADO_LATINO__DIAGNOSTICCHAIN_MAP = DEFINICION___NOMBRE_NO_RESERVADO_LATINO__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Tipo Leido</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEER___TIPO_LEIDO__DIAGNOSTICCHAIN_MAP = DEFINICION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Leer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEER_OPERATION_COUNT = DEFINICION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link latino.impl.ListaImpl <em>Lista</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see latino.impl.ListaImpl
	 * @see latino.impl.LatinoPackageImpl#getLista()
	 * @generated
	 */
	int LISTA = 6;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA__NOMBRE = DEFINICION__NOMBRE;

	/**
	 * The feature id for the '<em><b>Elementos</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA__ELEMENTOS = DEFINICION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Lista</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA_FEATURE_COUNT = DEFINICION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Programa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA___PROGRAMA = DEFINICION___PROGRAMA;

	/**
	 * The operation id for the '<em>Usa Solo Variables Definidas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA___USA_SOLO_VARIABLES_DEFINIDAS__STRING = DEFINICION___USA_SOLO_VARIABLES_DEFINIDAS__STRING;

	/**
	 * The operation id for the '<em>Tipo Texto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA___TIPO_TEXTO__STRING = DEFINICION___TIPO_TEXTO__STRING;

	/**
	 * The operation id for the '<em>Operandos Numericos</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA___OPERANDOS_NUMERICOS__STRING = DEFINICION___OPERANDOS_NUMERICOS__STRING;

	/**
	 * The operation id for the '<em>Es Reservada Go</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA___ES_RESERVADA_GO__STRING = DEFINICION___ES_RESERVADA_GO__STRING;

	/**
	 * The operation id for the '<em>Es Reservada Latino</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA___ES_RESERVADA_LATINO__STRING = DEFINICION___ES_RESERVADA_LATINO__STRING;

	/**
	 * The operation id for the '<em>Nombre No Reservado</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA___NOMBRE_NO_RESERVADO__DIAGNOSTICCHAIN_MAP = DEFINICION___NOMBRE_NO_RESERVADO__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Nombre No Reservado Latino</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA___NOMBRE_NO_RESERVADO_LATINO__DIAGNOSTICCHAIN_MAP = DEFINICION___NOMBRE_NO_RESERVADO_LATINO__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Variables Declaradas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA___VARIABLES_DECLARADAS__DIAGNOSTICCHAIN_MAP = DEFINICION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Lista Siempre Lista</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA___LISTA_SIEMPRE_LISTA__DIAGNOSTICCHAIN_MAP = DEFINICION_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Elementos Mismo Tipo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA___ELEMENTOS_MISMO_TIPO__DIAGNOSTICCHAIN_MAP = DEFINICION_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Operandos Numericos</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA___OPERANDOS_NUMERICOS__DIAGNOSTICCHAIN_MAP = DEFINICION_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Lista</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTA_OPERATION_COUNT = DEFINICION_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link latino.impl.AsignacionIndiceImpl <em>Asignacion Indice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see latino.impl.AsignacionIndiceImpl
	 * @see latino.impl.LatinoPackageImpl#getAsignacionIndice()
	 * @generated
	 */
	int ASIGNACION_INDICE = 7;

	/**
	 * The feature id for the '<em><b>Lista</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNACION_INDICE__LISTA = SENTENCIA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Indice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNACION_INDICE__INDICE = SENTENCIA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNACION_INDICE__VALOR = SENTENCIA_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Asignacion Indice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNACION_INDICE_FEATURE_COUNT = SENTENCIA_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Programa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNACION_INDICE___PROGRAMA = SENTENCIA___PROGRAMA;

	/**
	 * The operation id for the '<em>Usa Solo Variables Definidas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNACION_INDICE___USA_SOLO_VARIABLES_DEFINIDAS__STRING = SENTENCIA___USA_SOLO_VARIABLES_DEFINIDAS__STRING;

	/**
	 * The operation id for the '<em>Tipo Texto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNACION_INDICE___TIPO_TEXTO__STRING = SENTENCIA___TIPO_TEXTO__STRING;

	/**
	 * The operation id for the '<em>Operandos Numericos</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNACION_INDICE___OPERANDOS_NUMERICOS__STRING = SENTENCIA___OPERANDOS_NUMERICOS__STRING;

	/**
	 * The operation id for the '<em>Es Reservada Go</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNACION_INDICE___ES_RESERVADA_GO__STRING = SENTENCIA___ES_RESERVADA_GO__STRING;

	/**
	 * The operation id for the '<em>Es Reservada Latino</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNACION_INDICE___ES_RESERVADA_LATINO__STRING = SENTENCIA___ES_RESERVADA_LATINO__STRING;

	/**
	 * The operation id for the '<em>Variables Declaradas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNACION_INDICE___VARIABLES_DECLARADAS__DIAGNOSTICCHAIN_MAP = SENTENCIA_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Tipo Elemento</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNACION_INDICE___TIPO_ELEMENTO__DIAGNOSTICCHAIN_MAP = SENTENCIA_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Lista Declarada</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNACION_INDICE___LISTA_DECLARADA__DIAGNOSTICCHAIN_MAP = SENTENCIA_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Indice Numerico</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNACION_INDICE___INDICE_NUMERICO__DIAGNOSTICCHAIN_MAP = SENTENCIA_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Asignacion Indice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASIGNACION_INDICE_OPERATION_COUNT = SENTENCIA_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link latino.impl.CondicionalImpl <em>Condicional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see latino.impl.CondicionalImpl
	 * @see latino.impl.LatinoPackageImpl#getCondicional()
	 * @generated
	 */
	int CONDICIONAL = 8;

	/**
	 * The feature id for the '<em><b>Condicion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDICIONAL__CONDICION = SENTENCIA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entonces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDICIONAL__ENTONCES = SENTENCIA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Osis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDICIONAL__OSIS = SENTENCIA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Sino</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDICIONAL__SINO = SENTENCIA_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Condicional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDICIONAL_FEATURE_COUNT = SENTENCIA_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Programa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDICIONAL___PROGRAMA = SENTENCIA___PROGRAMA;

	/**
	 * The operation id for the '<em>Usa Solo Variables Definidas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDICIONAL___USA_SOLO_VARIABLES_DEFINIDAS__STRING = SENTENCIA___USA_SOLO_VARIABLES_DEFINIDAS__STRING;

	/**
	 * The operation id for the '<em>Tipo Texto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDICIONAL___TIPO_TEXTO__STRING = SENTENCIA___TIPO_TEXTO__STRING;

	/**
	 * The operation id for the '<em>Operandos Numericos</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDICIONAL___OPERANDOS_NUMERICOS__STRING = SENTENCIA___OPERANDOS_NUMERICOS__STRING;

	/**
	 * The operation id for the '<em>Es Reservada Go</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDICIONAL___ES_RESERVADA_GO__STRING = SENTENCIA___ES_RESERVADA_GO__STRING;

	/**
	 * The operation id for the '<em>Es Reservada Latino</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDICIONAL___ES_RESERVADA_LATINO__STRING = SENTENCIA___ES_RESERVADA_LATINO__STRING;

	/**
	 * The operation id for the '<em>Variables Declaradas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDICIONAL___VARIABLES_DECLARADAS__DIAGNOSTICCHAIN_MAP = SENTENCIA_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Condicion Logica</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDICIONAL___CONDICION_LOGICA__DIAGNOSTICCHAIN_MAP = SENTENCIA_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Bloque No Vacio</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDICIONAL___BLOQUE_NO_VACIO__DIAGNOSTICCHAIN_MAP = SENTENCIA_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Operandos Numericos</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDICIONAL___OPERANDOS_NUMERICOS__DIAGNOSTICCHAIN_MAP = SENTENCIA_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Condicional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDICIONAL_OPERATION_COUNT = SENTENCIA_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link latino.impl.OsiImpl <em>Osi</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see latino.impl.OsiImpl
	 * @see latino.impl.LatinoPackageImpl#getOsi()
	 * @generated
	 */
	int OSI = 9;

	/**
	 * The feature id for the '<em><b>Condicion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSI__CONDICION = ELEMENTO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sentencias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSI__SENTENCIAS = ELEMENTO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Osi</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSI_FEATURE_COUNT = ELEMENTO_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Programa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSI___PROGRAMA = ELEMENTO___PROGRAMA;

	/**
	 * The operation id for the '<em>Usa Solo Variables Definidas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSI___USA_SOLO_VARIABLES_DEFINIDAS__STRING = ELEMENTO___USA_SOLO_VARIABLES_DEFINIDAS__STRING;

	/**
	 * The operation id for the '<em>Tipo Texto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSI___TIPO_TEXTO__STRING = ELEMENTO___TIPO_TEXTO__STRING;

	/**
	 * The operation id for the '<em>Operandos Numericos</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSI___OPERANDOS_NUMERICOS__STRING = ELEMENTO___OPERANDOS_NUMERICOS__STRING;

	/**
	 * The operation id for the '<em>Es Reservada Go</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSI___ES_RESERVADA_GO__STRING = ELEMENTO___ES_RESERVADA_GO__STRING;

	/**
	 * The operation id for the '<em>Es Reservada Latino</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSI___ES_RESERVADA_LATINO__STRING = ELEMENTO___ES_RESERVADA_LATINO__STRING;

	/**
	 * The operation id for the '<em>Variables Declaradas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSI___VARIABLES_DECLARADAS__DIAGNOSTICCHAIN_MAP = ELEMENTO_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Condicion Logica</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSI___CONDICION_LOGICA__DIAGNOSTICCHAIN_MAP = ELEMENTO_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Bloque No Vacio</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSI___BLOQUE_NO_VACIO__DIAGNOSTICCHAIN_MAP = ELEMENTO_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Operandos Numericos</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSI___OPERANDOS_NUMERICOS__DIAGNOSTICCHAIN_MAP = ELEMENTO_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Osi</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSI_OPERATION_COUNT = ELEMENTO_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link latino.impl.ImprimirImpl <em>Imprimir</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see latino.impl.ImprimirImpl
	 * @see latino.impl.LatinoPackageImpl#getImprimir()
	 * @generated
	 */
	int IMPRIMIR = 10;

	/**
	 * The feature id for the '<em><b>Mensaje</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPRIMIR__MENSAJE = SENTENCIA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Imprimir</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPRIMIR_FEATURE_COUNT = SENTENCIA_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Programa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPRIMIR___PROGRAMA = SENTENCIA___PROGRAMA;

	/**
	 * The operation id for the '<em>Usa Solo Variables Definidas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPRIMIR___USA_SOLO_VARIABLES_DEFINIDAS__STRING = SENTENCIA___USA_SOLO_VARIABLES_DEFINIDAS__STRING;

	/**
	 * The operation id for the '<em>Tipo Texto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPRIMIR___TIPO_TEXTO__STRING = SENTENCIA___TIPO_TEXTO__STRING;

	/**
	 * The operation id for the '<em>Operandos Numericos</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPRIMIR___OPERANDOS_NUMERICOS__STRING = SENTENCIA___OPERANDOS_NUMERICOS__STRING;

	/**
	 * The operation id for the '<em>Es Reservada Go</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPRIMIR___ES_RESERVADA_GO__STRING = SENTENCIA___ES_RESERVADA_GO__STRING;

	/**
	 * The operation id for the '<em>Es Reservada Latino</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPRIMIR___ES_RESERVADA_LATINO__STRING = SENTENCIA___ES_RESERVADA_LATINO__STRING;

	/**
	 * The operation id for the '<em>Operandos Numericos</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPRIMIR___OPERANDOS_NUMERICOS__DIAGNOSTICCHAIN_MAP = SENTENCIA_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Variables Declaradas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPRIMIR___VARIABLES_DECLARADAS__DIAGNOSTICCHAIN_MAP = SENTENCIA_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Imprimir</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPRIMIR_OPERATION_COUNT = SENTENCIA_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link latino.impl.CicloImpl <em>Ciclo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see latino.impl.CicloImpl
	 * @see latino.impl.LatinoPackageImpl#getCiclo()
	 * @generated
	 */
	int CICLO = 11;

	/**
	 * The feature id for the '<em><b>Cuerpo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CICLO__CUERPO = SENTENCIA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ciclo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CICLO_FEATURE_COUNT = SENTENCIA_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Programa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CICLO___PROGRAMA = SENTENCIA___PROGRAMA;

	/**
	 * The operation id for the '<em>Usa Solo Variables Definidas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CICLO___USA_SOLO_VARIABLES_DEFINIDAS__STRING = SENTENCIA___USA_SOLO_VARIABLES_DEFINIDAS__STRING;

	/**
	 * The operation id for the '<em>Tipo Texto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CICLO___TIPO_TEXTO__STRING = SENTENCIA___TIPO_TEXTO__STRING;

	/**
	 * The operation id for the '<em>Operandos Numericos</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CICLO___OPERANDOS_NUMERICOS__STRING = SENTENCIA___OPERANDOS_NUMERICOS__STRING;

	/**
	 * The operation id for the '<em>Es Reservada Go</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CICLO___ES_RESERVADA_GO__STRING = SENTENCIA___ES_RESERVADA_GO__STRING;

	/**
	 * The operation id for the '<em>Es Reservada Latino</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CICLO___ES_RESERVADA_LATINO__STRING = SENTENCIA___ES_RESERVADA_LATINO__STRING;

	/**
	 * The operation id for the '<em>Cuerpo No Vacio</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CICLO___CUERPO_NO_VACIO__DIAGNOSTICCHAIN_MAP = SENTENCIA_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ciclo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CICLO_OPERATION_COUNT = SENTENCIA_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link latino.impl.CicloCondicionImpl <em>Ciclo Condicion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see latino.impl.CicloCondicionImpl
	 * @see latino.impl.LatinoPackageImpl#getCicloCondicion()
	 * @generated
	 */
	int CICLO_CONDICION = 12;

	/**
	 * The feature id for the '<em><b>Cuerpo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CICLO_CONDICION__CUERPO = CICLO__CUERPO;

	/**
	 * The feature id for the '<em><b>Condicion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CICLO_CONDICION__CONDICION = CICLO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ciclo Condicion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CICLO_CONDICION_FEATURE_COUNT = CICLO_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Programa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CICLO_CONDICION___PROGRAMA = CICLO___PROGRAMA;

	/**
	 * The operation id for the '<em>Usa Solo Variables Definidas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CICLO_CONDICION___USA_SOLO_VARIABLES_DEFINIDAS__STRING = CICLO___USA_SOLO_VARIABLES_DEFINIDAS__STRING;

	/**
	 * The operation id for the '<em>Tipo Texto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CICLO_CONDICION___TIPO_TEXTO__STRING = CICLO___TIPO_TEXTO__STRING;

	/**
	 * The operation id for the '<em>Operandos Numericos</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CICLO_CONDICION___OPERANDOS_NUMERICOS__STRING = CICLO___OPERANDOS_NUMERICOS__STRING;

	/**
	 * The operation id for the '<em>Es Reservada Go</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CICLO_CONDICION___ES_RESERVADA_GO__STRING = CICLO___ES_RESERVADA_GO__STRING;

	/**
	 * The operation id for the '<em>Es Reservada Latino</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CICLO_CONDICION___ES_RESERVADA_LATINO__STRING = CICLO___ES_RESERVADA_LATINO__STRING;

	/**
	 * The operation id for the '<em>Cuerpo No Vacio</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CICLO_CONDICION___CUERPO_NO_VACIO__DIAGNOSTICCHAIN_MAP = CICLO___CUERPO_NO_VACIO__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Variables Declaradas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CICLO_CONDICION___VARIABLES_DECLARADAS__DIAGNOSTICCHAIN_MAP = CICLO_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Operandos Numericos</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CICLO_CONDICION___OPERANDOS_NUMERICOS__DIAGNOSTICCHAIN_MAP = CICLO_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Condicion Logica</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CICLO_CONDICION___CONDICION_LOGICA__DIAGNOSTICCHAIN_MAP = CICLO_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ciclo Condicion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CICLO_CONDICION_OPERATION_COUNT = CICLO_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link latino.impl.MientrasImpl <em>Mientras</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see latino.impl.MientrasImpl
	 * @see latino.impl.LatinoPackageImpl#getMientras()
	 * @generated
	 */
	int MIENTRAS = 13;

	/**
	 * The feature id for the '<em><b>Cuerpo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIENTRAS__CUERPO = CICLO_CONDICION__CUERPO;

	/**
	 * The feature id for the '<em><b>Condicion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIENTRAS__CONDICION = CICLO_CONDICION__CONDICION;

	/**
	 * The number of structural features of the '<em>Mientras</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIENTRAS_FEATURE_COUNT = CICLO_CONDICION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Programa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIENTRAS___PROGRAMA = CICLO_CONDICION___PROGRAMA;

	/**
	 * The operation id for the '<em>Usa Solo Variables Definidas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIENTRAS___USA_SOLO_VARIABLES_DEFINIDAS__STRING = CICLO_CONDICION___USA_SOLO_VARIABLES_DEFINIDAS__STRING;

	/**
	 * The operation id for the '<em>Tipo Texto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIENTRAS___TIPO_TEXTO__STRING = CICLO_CONDICION___TIPO_TEXTO__STRING;

	/**
	 * The operation id for the '<em>Operandos Numericos</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIENTRAS___OPERANDOS_NUMERICOS__STRING = CICLO_CONDICION___OPERANDOS_NUMERICOS__STRING;

	/**
	 * The operation id for the '<em>Es Reservada Go</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIENTRAS___ES_RESERVADA_GO__STRING = CICLO_CONDICION___ES_RESERVADA_GO__STRING;

	/**
	 * The operation id for the '<em>Es Reservada Latino</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIENTRAS___ES_RESERVADA_LATINO__STRING = CICLO_CONDICION___ES_RESERVADA_LATINO__STRING;

	/**
	 * The operation id for the '<em>Cuerpo No Vacio</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIENTRAS___CUERPO_NO_VACIO__DIAGNOSTICCHAIN_MAP = CICLO_CONDICION___CUERPO_NO_VACIO__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Variables Declaradas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIENTRAS___VARIABLES_DECLARADAS__DIAGNOSTICCHAIN_MAP = CICLO_CONDICION___VARIABLES_DECLARADAS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Operandos Numericos</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIENTRAS___OPERANDOS_NUMERICOS__DIAGNOSTICCHAIN_MAP = CICLO_CONDICION___OPERANDOS_NUMERICOS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Condicion Logica</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIENTRAS___CONDICION_LOGICA__DIAGNOSTICCHAIN_MAP = CICLO_CONDICION___CONDICION_LOGICA__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Mientras</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIENTRAS_OPERATION_COUNT = CICLO_CONDICION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link latino.impl.RepetirImpl <em>Repetir</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see latino.impl.RepetirImpl
	 * @see latino.impl.LatinoPackageImpl#getRepetir()
	 * @generated
	 */
	int REPETIR = 14;

	/**
	 * The feature id for the '<em><b>Cuerpo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPETIR__CUERPO = CICLO_CONDICION__CUERPO;

	/**
	 * The feature id for the '<em><b>Condicion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPETIR__CONDICION = CICLO_CONDICION__CONDICION;

	/**
	 * The number of structural features of the '<em>Repetir</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPETIR_FEATURE_COUNT = CICLO_CONDICION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Programa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPETIR___PROGRAMA = CICLO_CONDICION___PROGRAMA;

	/**
	 * The operation id for the '<em>Usa Solo Variables Definidas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPETIR___USA_SOLO_VARIABLES_DEFINIDAS__STRING = CICLO_CONDICION___USA_SOLO_VARIABLES_DEFINIDAS__STRING;

	/**
	 * The operation id for the '<em>Tipo Texto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPETIR___TIPO_TEXTO__STRING = CICLO_CONDICION___TIPO_TEXTO__STRING;

	/**
	 * The operation id for the '<em>Operandos Numericos</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPETIR___OPERANDOS_NUMERICOS__STRING = CICLO_CONDICION___OPERANDOS_NUMERICOS__STRING;

	/**
	 * The operation id for the '<em>Es Reservada Go</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPETIR___ES_RESERVADA_GO__STRING = CICLO_CONDICION___ES_RESERVADA_GO__STRING;

	/**
	 * The operation id for the '<em>Es Reservada Latino</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPETIR___ES_RESERVADA_LATINO__STRING = CICLO_CONDICION___ES_RESERVADA_LATINO__STRING;

	/**
	 * The operation id for the '<em>Cuerpo No Vacio</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPETIR___CUERPO_NO_VACIO__DIAGNOSTICCHAIN_MAP = CICLO_CONDICION___CUERPO_NO_VACIO__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Variables Declaradas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPETIR___VARIABLES_DECLARADAS__DIAGNOSTICCHAIN_MAP = CICLO_CONDICION___VARIABLES_DECLARADAS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Operandos Numericos</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPETIR___OPERANDOS_NUMERICOS__DIAGNOSTICCHAIN_MAP = CICLO_CONDICION___OPERANDOS_NUMERICOS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Condicion Logica</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPETIR___CONDICION_LOGICA__DIAGNOSTICCHAIN_MAP = CICLO_CONDICION___CONDICION_LOGICA__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Repetir</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPETIR_OPERATION_COUNT = CICLO_CONDICION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link latino.impl.DesdeImpl <em>Desde</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see latino.impl.DesdeImpl
	 * @see latino.impl.LatinoPackageImpl#getDesde()
	 * @generated
	 */
	int DESDE = 15;

	/**
	 * The feature id for the '<em><b>Cuerpo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESDE__CUERPO = CICLO_CONDICION__CUERPO;

	/**
	 * The feature id for the '<em><b>Condicion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESDE__CONDICION = CICLO_CONDICION__CONDICION;

	/**
	 * The feature id for the '<em><b>Inicio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESDE__INICIO = CICLO_CONDICION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Paso</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESDE__PASO = CICLO_CONDICION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Desde</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESDE_FEATURE_COUNT = CICLO_CONDICION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Programa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESDE___PROGRAMA = CICLO_CONDICION___PROGRAMA;

	/**
	 * The operation id for the '<em>Usa Solo Variables Definidas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESDE___USA_SOLO_VARIABLES_DEFINIDAS__STRING = CICLO_CONDICION___USA_SOLO_VARIABLES_DEFINIDAS__STRING;

	/**
	 * The operation id for the '<em>Tipo Texto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESDE___TIPO_TEXTO__STRING = CICLO_CONDICION___TIPO_TEXTO__STRING;

	/**
	 * The operation id for the '<em>Operandos Numericos</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESDE___OPERANDOS_NUMERICOS__STRING = CICLO_CONDICION___OPERANDOS_NUMERICOS__STRING;

	/**
	 * The operation id for the '<em>Es Reservada Go</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESDE___ES_RESERVADA_GO__STRING = CICLO_CONDICION___ES_RESERVADA_GO__STRING;

	/**
	 * The operation id for the '<em>Es Reservada Latino</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESDE___ES_RESERVADA_LATINO__STRING = CICLO_CONDICION___ES_RESERVADA_LATINO__STRING;

	/**
	 * The operation id for the '<em>Cuerpo No Vacio</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESDE___CUERPO_NO_VACIO__DIAGNOSTICCHAIN_MAP = CICLO_CONDICION___CUERPO_NO_VACIO__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Variables Declaradas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESDE___VARIABLES_DECLARADAS__DIAGNOSTICCHAIN_MAP = CICLO_CONDICION___VARIABLES_DECLARADAS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Operandos Numericos</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESDE___OPERANDOS_NUMERICOS__DIAGNOSTICCHAIN_MAP = CICLO_CONDICION___OPERANDOS_NUMERICOS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Condicion Logica</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESDE___CONDICION_LOGICA__DIAGNOSTICCHAIN_MAP = CICLO_CONDICION___CONDICION_LOGICA__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Desde</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESDE_OPERATION_COUNT = CICLO_CONDICION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link latino.impl.ParaImpl <em>Para</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see latino.impl.ParaImpl
	 * @see latino.impl.LatinoPackageImpl#getPara()
	 * @generated
	 */
	int PARA = 16;

	/**
	 * The feature id for the '<em><b>Cuerpo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARA__CUERPO = CICLO__CUERPO;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARA__VARIABLE = CICLO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Limites</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARA__LIMITES = CICLO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Para</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARA_FEATURE_COUNT = CICLO_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Programa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARA___PROGRAMA = CICLO___PROGRAMA;

	/**
	 * The operation id for the '<em>Usa Solo Variables Definidas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARA___USA_SOLO_VARIABLES_DEFINIDAS__STRING = CICLO___USA_SOLO_VARIABLES_DEFINIDAS__STRING;

	/**
	 * The operation id for the '<em>Tipo Texto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARA___TIPO_TEXTO__STRING = CICLO___TIPO_TEXTO__STRING;

	/**
	 * The operation id for the '<em>Operandos Numericos</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARA___OPERANDOS_NUMERICOS__STRING = CICLO___OPERANDOS_NUMERICOS__STRING;

	/**
	 * The operation id for the '<em>Es Reservada Go</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARA___ES_RESERVADA_GO__STRING = CICLO___ES_RESERVADA_GO__STRING;

	/**
	 * The operation id for the '<em>Es Reservada Latino</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARA___ES_RESERVADA_LATINO__STRING = CICLO___ES_RESERVADA_LATINO__STRING;

	/**
	 * The operation id for the '<em>Cuerpo No Vacio</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARA___CUERPO_NO_VACIO__DIAGNOSTICCHAIN_MAP = CICLO___CUERPO_NO_VACIO__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Rango Numerico</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARA___RANGO_NUMERICO__DIAGNOSTICCHAIN_MAP = CICLO_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Variables Declaradas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARA___VARIABLES_DECLARADAS__DIAGNOSTICCHAIN_MAP = CICLO_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Para</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARA_OPERATION_COUNT = CICLO_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link latino.impl.IncrementoImpl <em>Incremento</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see latino.impl.IncrementoImpl
	 * @see latino.impl.LatinoPackageImpl#getIncremento()
	 * @generated
	 */
	int INCREMENTO = 17;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENTO__NOMBRE = SENTENCIA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operador</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENTO__OPERADOR = SENTENCIA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Incremento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENTO_FEATURE_COUNT = SENTENCIA_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Programa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENTO___PROGRAMA = SENTENCIA___PROGRAMA;

	/**
	 * The operation id for the '<em>Usa Solo Variables Definidas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENTO___USA_SOLO_VARIABLES_DEFINIDAS__STRING = SENTENCIA___USA_SOLO_VARIABLES_DEFINIDAS__STRING;

	/**
	 * The operation id for the '<em>Tipo Texto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENTO___TIPO_TEXTO__STRING = SENTENCIA___TIPO_TEXTO__STRING;

	/**
	 * The operation id for the '<em>Operandos Numericos</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENTO___OPERANDOS_NUMERICOS__STRING = SENTENCIA___OPERANDOS_NUMERICOS__STRING;

	/**
	 * The operation id for the '<em>Es Reservada Go</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENTO___ES_RESERVADA_GO__STRING = SENTENCIA___ES_RESERVADA_GO__STRING;

	/**
	 * The operation id for the '<em>Es Reservada Latino</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENTO___ES_RESERVADA_LATINO__STRING = SENTENCIA___ES_RESERVADA_LATINO__STRING;

	/**
	 * The operation id for the '<em>Variable Declarada</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENTO___VARIABLE_DECLARADA__DIAGNOSTICCHAIN_MAP = SENTENCIA_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Incremento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCREMENTO_OPERATION_COUNT = SENTENCIA_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link latino.impl.SaltoImpl <em>Salto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see latino.impl.SaltoImpl
	 * @see latino.impl.LatinoPackageImpl#getSalto()
	 * @generated
	 */
	int SALTO = 18;

	/**
	 * The number of structural features of the '<em>Salto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALTO_FEATURE_COUNT = SENTENCIA_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Programa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALTO___PROGRAMA = SENTENCIA___PROGRAMA;

	/**
	 * The operation id for the '<em>Usa Solo Variables Definidas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALTO___USA_SOLO_VARIABLES_DEFINIDAS__STRING = SENTENCIA___USA_SOLO_VARIABLES_DEFINIDAS__STRING;

	/**
	 * The operation id for the '<em>Tipo Texto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALTO___TIPO_TEXTO__STRING = SENTENCIA___TIPO_TEXTO__STRING;

	/**
	 * The operation id for the '<em>Operandos Numericos</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALTO___OPERANDOS_NUMERICOS__STRING = SENTENCIA___OPERANDOS_NUMERICOS__STRING;

	/**
	 * The operation id for the '<em>Es Reservada Go</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALTO___ES_RESERVADA_GO__STRING = SENTENCIA___ES_RESERVADA_GO__STRING;

	/**
	 * The operation id for the '<em>Es Reservada Latino</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALTO___ES_RESERVADA_LATINO__STRING = SENTENCIA___ES_RESERVADA_LATINO__STRING;

	/**
	 * The operation id for the '<em>Dentro De Ciclo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALTO___DENTRO_DE_CICLO__DIAGNOSTICCHAIN_MAP = SENTENCIA_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Salto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALTO_OPERATION_COUNT = SENTENCIA_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link latino.impl.RomperImpl <em>Romper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see latino.impl.RomperImpl
	 * @see latino.impl.LatinoPackageImpl#getRomper()
	 * @generated
	 */
	int ROMPER = 19;

	/**
	 * The number of structural features of the '<em>Romper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROMPER_FEATURE_COUNT = SALTO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Programa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROMPER___PROGRAMA = SALTO___PROGRAMA;

	/**
	 * The operation id for the '<em>Usa Solo Variables Definidas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROMPER___USA_SOLO_VARIABLES_DEFINIDAS__STRING = SALTO___USA_SOLO_VARIABLES_DEFINIDAS__STRING;

	/**
	 * The operation id for the '<em>Tipo Texto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROMPER___TIPO_TEXTO__STRING = SALTO___TIPO_TEXTO__STRING;

	/**
	 * The operation id for the '<em>Operandos Numericos</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROMPER___OPERANDOS_NUMERICOS__STRING = SALTO___OPERANDOS_NUMERICOS__STRING;

	/**
	 * The operation id for the '<em>Es Reservada Go</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROMPER___ES_RESERVADA_GO__STRING = SALTO___ES_RESERVADA_GO__STRING;

	/**
	 * The operation id for the '<em>Es Reservada Latino</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROMPER___ES_RESERVADA_LATINO__STRING = SALTO___ES_RESERVADA_LATINO__STRING;

	/**
	 * The operation id for the '<em>Dentro De Ciclo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROMPER___DENTRO_DE_CICLO__DIAGNOSTICCHAIN_MAP = SALTO___DENTRO_DE_CICLO__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Romper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROMPER_OPERATION_COUNT = SALTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link latino.impl.ContinuarImpl <em>Continuar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see latino.impl.ContinuarImpl
	 * @see latino.impl.LatinoPackageImpl#getContinuar()
	 * @generated
	 */
	int CONTINUAR = 20;

	/**
	 * The number of structural features of the '<em>Continuar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUAR_FEATURE_COUNT = SALTO_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Programa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUAR___PROGRAMA = SALTO___PROGRAMA;

	/**
	 * The operation id for the '<em>Usa Solo Variables Definidas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUAR___USA_SOLO_VARIABLES_DEFINIDAS__STRING = SALTO___USA_SOLO_VARIABLES_DEFINIDAS__STRING;

	/**
	 * The operation id for the '<em>Tipo Texto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUAR___TIPO_TEXTO__STRING = SALTO___TIPO_TEXTO__STRING;

	/**
	 * The operation id for the '<em>Operandos Numericos</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUAR___OPERANDOS_NUMERICOS__STRING = SALTO___OPERANDOS_NUMERICOS__STRING;

	/**
	 * The operation id for the '<em>Es Reservada Go</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUAR___ES_RESERVADA_GO__STRING = SALTO___ES_RESERVADA_GO__STRING;

	/**
	 * The operation id for the '<em>Es Reservada Latino</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUAR___ES_RESERVADA_LATINO__STRING = SALTO___ES_RESERVADA_LATINO__STRING;

	/**
	 * The operation id for the '<em>Dentro De Ciclo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUAR___DENTRO_DE_CICLO__DIAGNOSTICCHAIN_MAP = SALTO___DENTRO_DE_CICLO__DIAGNOSTICCHAIN_MAP;

	/**
	 * The number of operations of the '<em>Continuar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUAR_OPERATION_COUNT = SALTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link latino.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see latino.impl.VariableImpl
	 * @see latino.impl.LatinoPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 21;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NOMBRE = ELEMENTO_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = ELEMENTO_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Programa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE___PROGRAMA = ELEMENTO___PROGRAMA;

	/**
	 * The operation id for the '<em>Usa Solo Variables Definidas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE___USA_SOLO_VARIABLES_DEFINIDAS__STRING = ELEMENTO___USA_SOLO_VARIABLES_DEFINIDAS__STRING;

	/**
	 * The operation id for the '<em>Tipo Texto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE___TIPO_TEXTO__STRING = ELEMENTO___TIPO_TEXTO__STRING;

	/**
	 * The operation id for the '<em>Operandos Numericos</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE___OPERANDOS_NUMERICOS__STRING = ELEMENTO___OPERANDOS_NUMERICOS__STRING;

	/**
	 * The operation id for the '<em>Es Reservada Go</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE___ES_RESERVADA_GO__STRING = ELEMENTO___ES_RESERVADA_GO__STRING;

	/**
	 * The operation id for the '<em>Es Reservada Latino</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE___ES_RESERVADA_LATINO__STRING = ELEMENTO___ES_RESERVADA_LATINO__STRING;

	/**
	 * The operation id for the '<em>Nombre No Reservado</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE___NOMBRE_NO_RESERVADO__DIAGNOSTICCHAIN_MAP = ELEMENTO_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Nombre No Reservado Latino</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE___NOMBRE_NO_RESERVADO_LATINO__DIAGNOSTICCHAIN_MAP = ELEMENTO_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = ELEMENTO_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link latino.impl.ElegirImpl <em>Elegir</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see latino.impl.ElegirImpl
	 * @see latino.impl.LatinoPackageImpl#getElegir()
	 * @generated
	 */
	int ELEGIR = 22;

	/**
	 * The feature id for the '<em><b>Expresion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEGIR__EXPRESION = SENTENCIA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Casos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEGIR__CASOS = SENTENCIA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Defecto</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEGIR__DEFECTO = SENTENCIA_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Elegir</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEGIR_FEATURE_COUNT = SENTENCIA_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Programa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEGIR___PROGRAMA = SENTENCIA___PROGRAMA;

	/**
	 * The operation id for the '<em>Usa Solo Variables Definidas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEGIR___USA_SOLO_VARIABLES_DEFINIDAS__STRING = SENTENCIA___USA_SOLO_VARIABLES_DEFINIDAS__STRING;

	/**
	 * The operation id for the '<em>Tipo Texto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEGIR___TIPO_TEXTO__STRING = SENTENCIA___TIPO_TEXTO__STRING;

	/**
	 * The operation id for the '<em>Operandos Numericos</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEGIR___OPERANDOS_NUMERICOS__STRING = SENTENCIA___OPERANDOS_NUMERICOS__STRING;

	/**
	 * The operation id for the '<em>Es Reservada Go</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEGIR___ES_RESERVADA_GO__STRING = SENTENCIA___ES_RESERVADA_GO__STRING;

	/**
	 * The operation id for the '<em>Es Reservada Latino</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEGIR___ES_RESERVADA_LATINO__STRING = SENTENCIA___ES_RESERVADA_LATINO__STRING;

	/**
	 * The operation id for the '<em>Casos Mismo Tipo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEGIR___CASOS_MISMO_TIPO__DIAGNOSTICCHAIN_MAP = SENTENCIA_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Variables Declaradas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEGIR___VARIABLES_DECLARADAS__DIAGNOSTICCHAIN_MAP = SENTENCIA_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Caso Repetido</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEGIR___CASO_REPETIDO__DIAGNOSTICCHAIN_MAP = SENTENCIA_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Elegir</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEGIR_OPERATION_COUNT = SENTENCIA_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link latino.impl.CasoImpl <em>Caso</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see latino.impl.CasoImpl
	 * @see latino.impl.LatinoPackageImpl#getCaso()
	 * @generated
	 */
	int CASO = 23;

	/**
	 * The feature id for the '<em><b>Valores</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASO__VALORES = ELEMENTO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sentencias</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASO__SENTENCIAS = ELEMENTO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Caso</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASO_FEATURE_COUNT = ELEMENTO_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Programa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASO___PROGRAMA = ELEMENTO___PROGRAMA;

	/**
	 * The operation id for the '<em>Usa Solo Variables Definidas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASO___USA_SOLO_VARIABLES_DEFINIDAS__STRING = ELEMENTO___USA_SOLO_VARIABLES_DEFINIDAS__STRING;

	/**
	 * The operation id for the '<em>Tipo Texto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASO___TIPO_TEXTO__STRING = ELEMENTO___TIPO_TEXTO__STRING;

	/**
	 * The operation id for the '<em>Operandos Numericos</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASO___OPERANDOS_NUMERICOS__STRING = ELEMENTO___OPERANDOS_NUMERICOS__STRING;

	/**
	 * The operation id for the '<em>Es Reservada Go</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASO___ES_RESERVADA_GO__STRING = ELEMENTO___ES_RESERVADA_GO__STRING;

	/**
	 * The operation id for the '<em>Es Reservada Latino</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASO___ES_RESERVADA_LATINO__STRING = ELEMENTO___ES_RESERVADA_LATINO__STRING;

	/**
	 * The number of operations of the '<em>Caso</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASO_OPERATION_COUNT = ELEMENTO_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link latino.impl.FuncionImpl <em>Funcion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see latino.impl.FuncionImpl
	 * @see latino.impl.LatinoPackageImpl#getFuncion()
	 * @generated
	 */
	int FUNCION = 24;

	/**
	 * The feature id for the '<em><b>Nombre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION__NOMBRE = DEFINICION__NOMBRE;

	/**
	 * The feature id for the '<em><b>Parametros</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION__PARAMETROS = DEFINICION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cuerpo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION__CUERPO = DEFINICION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Funcion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION_FEATURE_COUNT = DEFINICION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Programa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION___PROGRAMA = DEFINICION___PROGRAMA;

	/**
	 * The operation id for the '<em>Usa Solo Variables Definidas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION___USA_SOLO_VARIABLES_DEFINIDAS__STRING = DEFINICION___USA_SOLO_VARIABLES_DEFINIDAS__STRING;

	/**
	 * The operation id for the '<em>Tipo Texto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION___TIPO_TEXTO__STRING = DEFINICION___TIPO_TEXTO__STRING;

	/**
	 * The operation id for the '<em>Operandos Numericos</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION___OPERANDOS_NUMERICOS__STRING = DEFINICION___OPERANDOS_NUMERICOS__STRING;

	/**
	 * The operation id for the '<em>Es Reservada Go</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION___ES_RESERVADA_GO__STRING = DEFINICION___ES_RESERVADA_GO__STRING;

	/**
	 * The operation id for the '<em>Es Reservada Latino</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION___ES_RESERVADA_LATINO__STRING = DEFINICION___ES_RESERVADA_LATINO__STRING;

	/**
	 * The operation id for the '<em>Nombre No Reservado</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION___NOMBRE_NO_RESERVADO__DIAGNOSTICCHAIN_MAP = DEFINICION___NOMBRE_NO_RESERVADO__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Nombre No Reservado Latino</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION___NOMBRE_NO_RESERVADO_LATINO__DIAGNOSTICCHAIN_MAP = DEFINICION___NOMBRE_NO_RESERVADO_LATINO__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Funcion Unica</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION___FUNCION_UNICA__DIAGNOSTICCHAIN_MAP = DEFINICION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Bloque No Vacio</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION___BLOQUE_NO_VACIO__DIAGNOSTICCHAIN_MAP = DEFINICION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Funcion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCION_OPERATION_COUNT = DEFINICION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link latino.impl.RetornoImpl <em>Retorno</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see latino.impl.RetornoImpl
	 * @see latino.impl.LatinoPackageImpl#getRetorno()
	 * @generated
	 */
	int RETORNO = 25;

	/**
	 * The feature id for the '<em><b>Valor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETORNO__VALOR = SENTENCIA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Retorno</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETORNO_FEATURE_COUNT = SENTENCIA_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Programa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETORNO___PROGRAMA = SENTENCIA___PROGRAMA;

	/**
	 * The operation id for the '<em>Usa Solo Variables Definidas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETORNO___USA_SOLO_VARIABLES_DEFINIDAS__STRING = SENTENCIA___USA_SOLO_VARIABLES_DEFINIDAS__STRING;

	/**
	 * The operation id for the '<em>Tipo Texto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETORNO___TIPO_TEXTO__STRING = SENTENCIA___TIPO_TEXTO__STRING;

	/**
	 * The operation id for the '<em>Operandos Numericos</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETORNO___OPERANDOS_NUMERICOS__STRING = SENTENCIA___OPERANDOS_NUMERICOS__STRING;

	/**
	 * The operation id for the '<em>Es Reservada Go</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETORNO___ES_RESERVADA_GO__STRING = SENTENCIA___ES_RESERVADA_GO__STRING;

	/**
	 * The operation id for the '<em>Es Reservada Latino</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETORNO___ES_RESERVADA_LATINO__STRING = SENTENCIA___ES_RESERVADA_LATINO__STRING;

	/**
	 * The operation id for the '<em>Dentro De Funcion</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETORNO___DENTRO_DE_FUNCION__DIAGNOSTICCHAIN_MAP = SENTENCIA_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Variables Declaradas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETORNO___VARIABLES_DECLARADAS__DIAGNOSTICCHAIN_MAP = SENTENCIA_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Operandos Numericos</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETORNO___OPERANDOS_NUMERICOS__DIAGNOSTICCHAIN_MAP = SENTENCIA_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Retorno</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETORNO_OPERATION_COUNT = SENTENCIA_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link latino.impl.LlamadaImpl <em>Llamada</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see latino.impl.LlamadaImpl
	 * @see latino.impl.LatinoPackageImpl#getLlamada()
	 * @generated
	 */
	int LLAMADA = 26;

	/**
	 * The feature id for the '<em><b>Funcion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLAMADA__FUNCION = SENTENCIA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Argumentos</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLAMADA__ARGUMENTOS = SENTENCIA_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Llamada</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLAMADA_FEATURE_COUNT = SENTENCIA_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Programa</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLAMADA___PROGRAMA = SENTENCIA___PROGRAMA;

	/**
	 * The operation id for the '<em>Usa Solo Variables Definidas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLAMADA___USA_SOLO_VARIABLES_DEFINIDAS__STRING = SENTENCIA___USA_SOLO_VARIABLES_DEFINIDAS__STRING;

	/**
	 * The operation id for the '<em>Tipo Texto</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLAMADA___TIPO_TEXTO__STRING = SENTENCIA___TIPO_TEXTO__STRING;

	/**
	 * The operation id for the '<em>Operandos Numericos</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLAMADA___OPERANDOS_NUMERICOS__STRING = SENTENCIA___OPERANDOS_NUMERICOS__STRING;

	/**
	 * The operation id for the '<em>Es Reservada Go</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLAMADA___ES_RESERVADA_GO__STRING = SENTENCIA___ES_RESERVADA_GO__STRING;

	/**
	 * The operation id for the '<em>Es Reservada Latino</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLAMADA___ES_RESERVADA_LATINO__STRING = SENTENCIA___ES_RESERVADA_LATINO__STRING;

	/**
	 * The operation id for the '<em>Variables Declaradas</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLAMADA___VARIABLES_DECLARADAS__DIAGNOSTICCHAIN_MAP = SENTENCIA_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Operandos Numericos</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLAMADA___OPERANDOS_NUMERICOS__DIAGNOSTICCHAIN_MAP = SENTENCIA_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Funcion Declarada</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLAMADA___FUNCION_DECLARADA__DIAGNOSTICCHAIN_MAP = SENTENCIA_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Argumentos Completos</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLAMADA___ARGUMENTOS_COMPLETOS__DIAGNOSTICCHAIN_MAP = SENTENCIA_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Llamada</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLAMADA_OPERATION_COUNT = SENTENCIA_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link latino.Conversion <em>Conversion</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see latino.Conversion
	 * @see latino.impl.LatinoPackageImpl#getConversion()
	 * @generated
	 */
	int CONVERSION = 27;

	/**
	 * The meta object id for the '{@link latino.OperadorPaso <em>Operador Paso</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see latino.OperadorPaso
	 * @see latino.impl.LatinoPackageImpl#getOperadorPaso()
	 * @generated
	 */
	int OPERADOR_PASO = 28;

	/**
	 * Returns the meta object for class '{@link latino.Programa <em>Programa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Programa</em>'.
	 * @see latino.Programa
	 * @generated
	 */
	EClass getPrograma();

	/**
	 * Returns the meta object for the containment reference list '{@link latino.Programa#getSentencias <em>Sentencias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sentencias</em>'.
	 * @see latino.Programa#getSentencias()
	 * @see #getPrograma()
	 * @generated
	 */
	EReference getPrograma_Sentencias();

	/**
	 * Returns the meta object for the '{@link latino.Programa#defineVariable(java.lang.String) <em>Define Variable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Define Variable</em>' operation.
	 * @see latino.Programa#defineVariable(java.lang.String)
	 * @generated
	 */
	EOperation getPrograma__DefineVariable__String();

	/**
	 * Returns the meta object for the '{@link latino.Programa#ProgramaNoVacio(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Programa No Vacio</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Programa No Vacio</em>' operation.
	 * @see latino.Programa#ProgramaNoVacio(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPrograma__ProgramaNoVacio__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link latino.Elemento <em>Elemento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elemento</em>'.
	 * @see latino.Elemento
	 * @generated
	 */
	EClass getElemento();

	/**
	 * Returns the meta object for the '{@link latino.Elemento#programa() <em>Programa</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Programa</em>' operation.
	 * @see latino.Elemento#programa()
	 * @generated
	 */
	EOperation getElemento__Programa();

	/**
	 * Returns the meta object for the '{@link latino.Elemento#usaSoloVariablesDefinidas(java.lang.String) <em>Usa Solo Variables Definidas</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Usa Solo Variables Definidas</em>' operation.
	 * @see latino.Elemento#usaSoloVariablesDefinidas(java.lang.String)
	 * @generated
	 */
	EOperation getElemento__UsaSoloVariablesDefinidas__String();

	/**
	 * Returns the meta object for the '{@link latino.Elemento#tipoTexto(java.lang.String) <em>Tipo Texto</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tipo Texto</em>' operation.
	 * @see latino.Elemento#tipoTexto(java.lang.String)
	 * @generated
	 */
	EOperation getElemento__TipoTexto__String();

	/**
	 * Returns the meta object for the '{@link latino.Elemento#operandosNumericos(java.lang.String) <em>Operandos Numericos</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Operandos Numericos</em>' operation.
	 * @see latino.Elemento#operandosNumericos(java.lang.String)
	 * @generated
	 */
	EOperation getElemento__OperandosNumericos__String();

	/**
	 * Returns the meta object for the '{@link latino.Elemento#esReservadaGo(java.lang.String) <em>Es Reservada Go</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Es Reservada Go</em>' operation.
	 * @see latino.Elemento#esReservadaGo(java.lang.String)
	 * @generated
	 */
	EOperation getElemento__EsReservadaGo__String();

	/**
	 * Returns the meta object for the '{@link latino.Elemento#esReservadaLatino(java.lang.String) <em>Es Reservada Latino</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Es Reservada Latino</em>' operation.
	 * @see latino.Elemento#esReservadaLatino(java.lang.String)
	 * @generated
	 */
	EOperation getElemento__EsReservadaLatino__String();

	/**
	 * Returns the meta object for class '{@link latino.Sentencia <em>Sentencia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sentencia</em>'.
	 * @see latino.Sentencia
	 * @generated
	 */
	EClass getSentencia();

	/**
	 * Returns the meta object for class '{@link latino.Definicion <em>Definicion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definicion</em>'.
	 * @see latino.Definicion
	 * @generated
	 */
	EClass getDefinicion();

	/**
	 * Returns the meta object for the attribute '{@link latino.Definicion#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see latino.Definicion#getNombre()
	 * @see #getDefinicion()
	 * @generated
	 */
	EAttribute getDefinicion_Nombre();

	/**
	 * Returns the meta object for the '{@link latino.Definicion#NombreNoReservado(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Nombre No Reservado</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Nombre No Reservado</em>' operation.
	 * @see latino.Definicion#NombreNoReservado(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDefinicion__NombreNoReservado__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link latino.Definicion#NombreNoReservadoLatino(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Nombre No Reservado Latino</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Nombre No Reservado Latino</em>' operation.
	 * @see latino.Definicion#NombreNoReservadoLatino(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDefinicion__NombreNoReservadoLatino__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link latino.Asignacion <em>Asignacion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asignacion</em>'.
	 * @see latino.Asignacion
	 * @generated
	 */
	EClass getAsignacion();

	/**
	 * Returns the meta object for the attribute '{@link latino.Asignacion#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor</em>'.
	 * @see latino.Asignacion#getValor()
	 * @see #getAsignacion()
	 * @generated
	 */
	EAttribute getAsignacion_Valor();

	/**
	 * Returns the meta object for the '{@link latino.Asignacion#VariablesDeclaradas(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Variables Declaradas</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Variables Declaradas</em>' operation.
	 * @see latino.Asignacion#VariablesDeclaradas(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAsignacion__VariablesDeclaradas__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link latino.Asignacion#TipoConsistente(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Tipo Consistente</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tipo Consistente</em>' operation.
	 * @see latino.Asignacion#TipoConsistente(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAsignacion__TipoConsistente__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link latino.Leer <em>Leer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Leer</em>'.
	 * @see latino.Leer
	 * @generated
	 */
	EClass getLeer();

	/**
	 * Returns the meta object for the attribute '{@link latino.Leer#getConversion <em>Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conversion</em>'.
	 * @see latino.Leer#getConversion()
	 * @see #getLeer()
	 * @generated
	 */
	EAttribute getLeer_Conversion();

	/**
	 * Returns the meta object for the '{@link latino.Leer#TipoLeido(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Tipo Leido</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tipo Leido</em>' operation.
	 * @see latino.Leer#TipoLeido(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getLeer__TipoLeido__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link latino.Lista <em>Lista</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lista</em>'.
	 * @see latino.Lista
	 * @generated
	 */
	EClass getLista();

	/**
	 * Returns the meta object for the attribute list '{@link latino.Lista#getElementos <em>Elementos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Elementos</em>'.
	 * @see latino.Lista#getElementos()
	 * @see #getLista()
	 * @generated
	 */
	EAttribute getLista_Elementos();

	/**
	 * Returns the meta object for the '{@link latino.Lista#VariablesDeclaradas(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Variables Declaradas</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Variables Declaradas</em>' operation.
	 * @see latino.Lista#VariablesDeclaradas(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getLista__VariablesDeclaradas__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link latino.Lista#ListaSiempreLista(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Lista Siempre Lista</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Lista Siempre Lista</em>' operation.
	 * @see latino.Lista#ListaSiempreLista(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getLista__ListaSiempreLista__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link latino.Lista#ElementosMismoTipo(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Elementos Mismo Tipo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Elementos Mismo Tipo</em>' operation.
	 * @see latino.Lista#ElementosMismoTipo(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getLista__ElementosMismoTipo__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link latino.Lista#OperandosNumericos(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Operandos Numericos</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Operandos Numericos</em>' operation.
	 * @see latino.Lista#OperandosNumericos(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getLista__OperandosNumericos__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link latino.AsignacionIndice <em>Asignacion Indice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asignacion Indice</em>'.
	 * @see latino.AsignacionIndice
	 * @generated
	 */
	EClass getAsignacionIndice();

	/**
	 * Returns the meta object for the attribute '{@link latino.AsignacionIndice#getLista <em>Lista</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lista</em>'.
	 * @see latino.AsignacionIndice#getLista()
	 * @see #getAsignacionIndice()
	 * @generated
	 */
	EAttribute getAsignacionIndice_Lista();

	/**
	 * Returns the meta object for the attribute '{@link latino.AsignacionIndice#getIndice <em>Indice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indice</em>'.
	 * @see latino.AsignacionIndice#getIndice()
	 * @see #getAsignacionIndice()
	 * @generated
	 */
	EAttribute getAsignacionIndice_Indice();

	/**
	 * Returns the meta object for the attribute '{@link latino.AsignacionIndice#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor</em>'.
	 * @see latino.AsignacionIndice#getValor()
	 * @see #getAsignacionIndice()
	 * @generated
	 */
	EAttribute getAsignacionIndice_Valor();

	/**
	 * Returns the meta object for the '{@link latino.AsignacionIndice#VariablesDeclaradas(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Variables Declaradas</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Variables Declaradas</em>' operation.
	 * @see latino.AsignacionIndice#VariablesDeclaradas(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAsignacionIndice__VariablesDeclaradas__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link latino.AsignacionIndice#TipoElemento(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Tipo Elemento</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tipo Elemento</em>' operation.
	 * @see latino.AsignacionIndice#TipoElemento(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAsignacionIndice__TipoElemento__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link latino.AsignacionIndice#ListaDeclarada(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Lista Declarada</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Lista Declarada</em>' operation.
	 * @see latino.AsignacionIndice#ListaDeclarada(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAsignacionIndice__ListaDeclarada__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link latino.AsignacionIndice#IndiceNumerico(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Indice Numerico</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Indice Numerico</em>' operation.
	 * @see latino.AsignacionIndice#IndiceNumerico(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAsignacionIndice__IndiceNumerico__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link latino.Asignacion#OperandosNumericos(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Operandos Numericos</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Operandos Numericos</em>' operation.
	 * @see latino.Asignacion#OperandosNumericos(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getAsignacion__OperandosNumericos__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link latino.Condicional <em>Condicional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condicional</em>'.
	 * @see latino.Condicional
	 * @generated
	 */
	EClass getCondicional();

	/**
	 * Returns the meta object for the attribute '{@link latino.Condicional#getCondicion <em>Condicion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condicion</em>'.
	 * @see latino.Condicional#getCondicion()
	 * @see #getCondicional()
	 * @generated
	 */
	EAttribute getCondicional_Condicion();

	/**
	 * Returns the meta object for the containment reference list '{@link latino.Condicional#getEntonces <em>Entonces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entonces</em>'.
	 * @see latino.Condicional#getEntonces()
	 * @see #getCondicional()
	 * @generated
	 */
	EReference getCondicional_Entonces();

	/**
	 * Returns the meta object for the containment reference list '{@link latino.Condicional#getOsis <em>Osis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Osis</em>'.
	 * @see latino.Condicional#getOsis()
	 * @see #getCondicional()
	 * @generated
	 */
	EReference getCondicional_Osis();

	/**
	 * Returns the meta object for the containment reference list '{@link latino.Condicional#getSino <em>Sino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sino</em>'.
	 * @see latino.Condicional#getSino()
	 * @see #getCondicional()
	 * @generated
	 */
	EReference getCondicional_Sino();

	/**
	 * Returns the meta object for the '{@link latino.Condicional#VariablesDeclaradas(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Variables Declaradas</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Variables Declaradas</em>' operation.
	 * @see latino.Condicional#VariablesDeclaradas(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCondicional__VariablesDeclaradas__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link latino.Condicional#CondicionLogica(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Condicion Logica</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Condicion Logica</em>' operation.
	 * @see latino.Condicional#CondicionLogica(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCondicional__CondicionLogica__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link latino.Condicional#BloqueNoVacio(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Bloque No Vacio</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Bloque No Vacio</em>' operation.
	 * @see latino.Condicional#BloqueNoVacio(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCondicional__BloqueNoVacio__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link latino.Condicional#OperandosNumericos(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Operandos Numericos</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Operandos Numericos</em>' operation.
	 * @see latino.Condicional#OperandosNumericos(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCondicional__OperandosNumericos__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link latino.Osi <em>Osi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Osi</em>'.
	 * @see latino.Osi
	 * @generated
	 */
	EClass getOsi();

	/**
	 * Returns the meta object for the attribute '{@link latino.Osi#getCondicion <em>Condicion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condicion</em>'.
	 * @see latino.Osi#getCondicion()
	 * @see #getOsi()
	 * @generated
	 */
	EAttribute getOsi_Condicion();

	/**
	 * Returns the meta object for the containment reference list '{@link latino.Osi#getSentencias <em>Sentencias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sentencias</em>'.
	 * @see latino.Osi#getSentencias()
	 * @see #getOsi()
	 * @generated
	 */
	EReference getOsi_Sentencias();

	/**
	 * Returns the meta object for the '{@link latino.Osi#VariablesDeclaradas(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Variables Declaradas</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Variables Declaradas</em>' operation.
	 * @see latino.Osi#VariablesDeclaradas(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getOsi__VariablesDeclaradas__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link latino.Osi#CondicionLogica(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Condicion Logica</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Condicion Logica</em>' operation.
	 * @see latino.Osi#CondicionLogica(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getOsi__CondicionLogica__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link latino.Osi#BloqueNoVacio(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Bloque No Vacio</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Bloque No Vacio</em>' operation.
	 * @see latino.Osi#BloqueNoVacio(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getOsi__BloqueNoVacio__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link latino.Osi#OperandosNumericos(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Operandos Numericos</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Operandos Numericos</em>' operation.
	 * @see latino.Osi#OperandosNumericos(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getOsi__OperandosNumericos__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link latino.Imprimir <em>Imprimir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imprimir</em>'.
	 * @see latino.Imprimir
	 * @generated
	 */
	EClass getImprimir();

	/**
	 * Returns the meta object for the attribute '{@link latino.Imprimir#getMensaje <em>Mensaje</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mensaje</em>'.
	 * @see latino.Imprimir#getMensaje()
	 * @see #getImprimir()
	 * @generated
	 */
	EAttribute getImprimir_Mensaje();

	/**
	 * Returns the meta object for the '{@link latino.Imprimir#OperandosNumericos(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Operandos Numericos</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Operandos Numericos</em>' operation.
	 * @see latino.Imprimir#OperandosNumericos(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getImprimir__OperandosNumericos__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link latino.Imprimir#VariablesDeclaradas(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Variables Declaradas</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Variables Declaradas</em>' operation.
	 * @see latino.Imprimir#VariablesDeclaradas(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getImprimir__VariablesDeclaradas__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link latino.Ciclo <em>Ciclo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ciclo</em>'.
	 * @see latino.Ciclo
	 * @generated
	 */
	EClass getCiclo();

	/**
	 * Returns the meta object for the containment reference list '{@link latino.Ciclo#getCuerpo <em>Cuerpo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cuerpo</em>'.
	 * @see latino.Ciclo#getCuerpo()
	 * @see #getCiclo()
	 * @generated
	 */
	EReference getCiclo_Cuerpo();

	/**
	 * Returns the meta object for the '{@link latino.Ciclo#CuerpoNoVacio(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Cuerpo No Vacio</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cuerpo No Vacio</em>' operation.
	 * @see latino.Ciclo#CuerpoNoVacio(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCiclo__CuerpoNoVacio__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link latino.CicloCondicion <em>Ciclo Condicion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ciclo Condicion</em>'.
	 * @see latino.CicloCondicion
	 * @generated
	 */
	EClass getCicloCondicion();

	/**
	 * Returns the meta object for the attribute '{@link latino.CicloCondicion#getCondicion <em>Condicion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condicion</em>'.
	 * @see latino.CicloCondicion#getCondicion()
	 * @see #getCicloCondicion()
	 * @generated
	 */
	EAttribute getCicloCondicion_Condicion();

	/**
	 * Returns the meta object for the '{@link latino.CicloCondicion#VariablesDeclaradas(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Variables Declaradas</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Variables Declaradas</em>' operation.
	 * @see latino.CicloCondicion#VariablesDeclaradas(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCicloCondicion__VariablesDeclaradas__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link latino.CicloCondicion#OperandosNumericos(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Operandos Numericos</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Operandos Numericos</em>' operation.
	 * @see latino.CicloCondicion#OperandosNumericos(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCicloCondicion__OperandosNumericos__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link latino.CicloCondicion#CondicionLogica(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Condicion Logica</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Condicion Logica</em>' operation.
	 * @see latino.CicloCondicion#CondicionLogica(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getCicloCondicion__CondicionLogica__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link latino.Mientras <em>Mientras</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mientras</em>'.
	 * @see latino.Mientras
	 * @generated
	 */
	EClass getMientras();

	/**
	 * Returns the meta object for class '{@link latino.Repetir <em>Repetir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repetir</em>'.
	 * @see latino.Repetir
	 * @generated
	 */
	EClass getRepetir();

	/**
	 * Returns the meta object for class '{@link latino.Desde <em>Desde</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Desde</em>'.
	 * @see latino.Desde
	 * @generated
	 */
	EClass getDesde();

	/**
	 * Returns the meta object for the containment reference '{@link latino.Desde#getInicio <em>Inicio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inicio</em>'.
	 * @see latino.Desde#getInicio()
	 * @see #getDesde()
	 * @generated
	 */
	EReference getDesde_Inicio();

	/**
	 * Returns the meta object for the containment reference '{@link latino.Desde#getPaso <em>Paso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Paso</em>'.
	 * @see latino.Desde#getPaso()
	 * @see #getDesde()
	 * @generated
	 */
	EReference getDesde_Paso();

	/**
	 * Returns the meta object for class '{@link latino.Para <em>Para</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Para</em>'.
	 * @see latino.Para
	 * @generated
	 */
	EClass getPara();

	/**
	 * Returns the meta object for the containment reference '{@link latino.Para#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see latino.Para#getVariable()
	 * @see #getPara()
	 * @generated
	 */
	EReference getPara_Variable();

	/**
	 * Returns the meta object for the attribute list '{@link latino.Para#getLimites <em>Limites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Limites</em>'.
	 * @see latino.Para#getLimites()
	 * @see #getPara()
	 * @generated
	 */
	EAttribute getPara_Limites();

	/**
	 * Returns the meta object for the '{@link latino.Para#RangoNumerico(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Rango Numerico</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Rango Numerico</em>' operation.
	 * @see latino.Para#RangoNumerico(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPara__RangoNumerico__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link latino.Para#VariablesDeclaradas(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Variables Declaradas</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Variables Declaradas</em>' operation.
	 * @see latino.Para#VariablesDeclaradas(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getPara__VariablesDeclaradas__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link latino.Incremento <em>Incremento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Incremento</em>'.
	 * @see latino.Incremento
	 * @generated
	 */
	EClass getIncremento();

	/**
	 * Returns the meta object for the attribute '{@link latino.Incremento#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see latino.Incremento#getNombre()
	 * @see #getIncremento()
	 * @generated
	 */
	EAttribute getIncremento_Nombre();

	/**
	 * Returns the meta object for the attribute '{@link latino.Incremento#getOperador <em>Operador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operador</em>'.
	 * @see latino.Incremento#getOperador()
	 * @see #getIncremento()
	 * @generated
	 */
	EAttribute getIncremento_Operador();

	/**
	 * Returns the meta object for the '{@link latino.Incremento#VariableDeclarada(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Variable Declarada</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Variable Declarada</em>' operation.
	 * @see latino.Incremento#VariableDeclarada(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getIncremento__VariableDeclarada__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link latino.Salto <em>Salto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Salto</em>'.
	 * @see latino.Salto
	 * @generated
	 */
	EClass getSalto();

	/**
	 * Returns the meta object for the '{@link latino.Salto#DentroDeCiclo(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Dentro De Ciclo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dentro De Ciclo</em>' operation.
	 * @see latino.Salto#DentroDeCiclo(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getSalto__DentroDeCiclo__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link latino.Romper <em>Romper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Romper</em>'.
	 * @see latino.Romper
	 * @generated
	 */
	EClass getRomper();

	/**
	 * Returns the meta object for class '{@link latino.Continuar <em>Continuar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Continuar</em>'.
	 * @see latino.Continuar
	 * @generated
	 */
	EClass getContinuar();

	/**
	 * Returns the meta object for class '{@link latino.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see latino.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link latino.Variable#getNombre <em>Nombre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nombre</em>'.
	 * @see latino.Variable#getNombre()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Nombre();

	/**
	 * Returns the meta object for the '{@link latino.Variable#NombreNoReservado(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Nombre No Reservado</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Nombre No Reservado</em>' operation.
	 * @see latino.Variable#NombreNoReservado(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getVariable__NombreNoReservado__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link latino.Variable#NombreNoReservadoLatino(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Nombre No Reservado Latino</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Nombre No Reservado Latino</em>' operation.
	 * @see latino.Variable#NombreNoReservadoLatino(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getVariable__NombreNoReservadoLatino__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link latino.Elegir <em>Elegir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elegir</em>'.
	 * @see latino.Elegir
	 * @generated
	 */
	EClass getElegir();

	/**
	 * Returns the meta object for the attribute '{@link latino.Elegir#getExpresion <em>Expresion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expresion</em>'.
	 * @see latino.Elegir#getExpresion()
	 * @see #getElegir()
	 * @generated
	 */
	EAttribute getElegir_Expresion();

	/**
	 * Returns the meta object for the containment reference list '{@link latino.Elegir#getCasos <em>Casos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Casos</em>'.
	 * @see latino.Elegir#getCasos()
	 * @see #getElegir()
	 * @generated
	 */
	EReference getElegir_Casos();

	/**
	 * Returns the meta object for the containment reference list '{@link latino.Elegir#getDefecto <em>Defecto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Defecto</em>'.
	 * @see latino.Elegir#getDefecto()
	 * @see #getElegir()
	 * @generated
	 */
	EReference getElegir_Defecto();

	/**
	 * Returns the meta object for the '{@link latino.Elegir#CasosMismoTipo(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Casos Mismo Tipo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Casos Mismo Tipo</em>' operation.
	 * @see latino.Elegir#CasosMismoTipo(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getElegir__CasosMismoTipo__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link latino.Elegir#VariablesDeclaradas(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Variables Declaradas</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Variables Declaradas</em>' operation.
	 * @see latino.Elegir#VariablesDeclaradas(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getElegir__VariablesDeclaradas__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link latino.Elegir#CasoRepetido(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Caso Repetido</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Caso Repetido</em>' operation.
	 * @see latino.Elegir#CasoRepetido(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getElegir__CasoRepetido__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link latino.Caso <em>Caso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Caso</em>'.
	 * @see latino.Caso
	 * @generated
	 */
	EClass getCaso();

	/**
	 * Returns the meta object for the attribute list '{@link latino.Caso#getValores <em>Valores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Valores</em>'.
	 * @see latino.Caso#getValores()
	 * @see #getCaso()
	 * @generated
	 */
	EAttribute getCaso_Valores();

	/**
	 * Returns the meta object for the containment reference list '{@link latino.Caso#getSentencias <em>Sentencias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sentencias</em>'.
	 * @see latino.Caso#getSentencias()
	 * @see #getCaso()
	 * @generated
	 */
	EReference getCaso_Sentencias();

	/**
	 * Returns the meta object for class '{@link latino.Funcion <em>Funcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Funcion</em>'.
	 * @see latino.Funcion
	 * @generated
	 */
	EClass getFuncion();

	/**
	 * Returns the meta object for the containment reference list '{@link latino.Funcion#getParametros <em>Parametros</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parametros</em>'.
	 * @see latino.Funcion#getParametros()
	 * @see #getFuncion()
	 * @generated
	 */
	EReference getFuncion_Parametros();

	/**
	 * Returns the meta object for the containment reference list '{@link latino.Funcion#getCuerpo <em>Cuerpo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cuerpo</em>'.
	 * @see latino.Funcion#getCuerpo()
	 * @see #getFuncion()
	 * @generated
	 */
	EReference getFuncion_Cuerpo();

	/**
	 * Returns the meta object for the '{@link latino.Funcion#FuncionUnica(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Funcion Unica</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Funcion Unica</em>' operation.
	 * @see latino.Funcion#FuncionUnica(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getFuncion__FuncionUnica__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link latino.Funcion#BloqueNoVacio(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Bloque No Vacio</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Bloque No Vacio</em>' operation.
	 * @see latino.Funcion#BloqueNoVacio(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getFuncion__BloqueNoVacio__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link latino.Retorno <em>Retorno</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Retorno</em>'.
	 * @see latino.Retorno
	 * @generated
	 */
	EClass getRetorno();

	/**
	 * Returns the meta object for the attribute '{@link latino.Retorno#getValor <em>Valor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valor</em>'.
	 * @see latino.Retorno#getValor()
	 * @see #getRetorno()
	 * @generated
	 */
	EAttribute getRetorno_Valor();

	/**
	 * Returns the meta object for the '{@link latino.Retorno#DentroDeFuncion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Dentro De Funcion</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dentro De Funcion</em>' operation.
	 * @see latino.Retorno#DentroDeFuncion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRetorno__DentroDeFuncion__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link latino.Retorno#VariablesDeclaradas(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Variables Declaradas</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Variables Declaradas</em>' operation.
	 * @see latino.Retorno#VariablesDeclaradas(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRetorno__VariablesDeclaradas__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link latino.Retorno#OperandosNumericos(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Operandos Numericos</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Operandos Numericos</em>' operation.
	 * @see latino.Retorno#OperandosNumericos(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getRetorno__OperandosNumericos__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link latino.Llamada <em>Llamada</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Llamada</em>'.
	 * @see latino.Llamada
	 * @generated
	 */
	EClass getLlamada();

	/**
	 * Returns the meta object for the attribute '{@link latino.Llamada#getFuncion <em>Funcion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Funcion</em>'.
	 * @see latino.Llamada#getFuncion()
	 * @see #getLlamada()
	 * @generated
	 */
	EAttribute getLlamada_Funcion();

	/**
	 * Returns the meta object for the attribute list '{@link latino.Llamada#getArgumentos <em>Argumentos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Argumentos</em>'.
	 * @see latino.Llamada#getArgumentos()
	 * @see #getLlamada()
	 * @generated
	 */
	EAttribute getLlamada_Argumentos();

	/**
	 * Returns the meta object for the '{@link latino.Llamada#VariablesDeclaradas(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Variables Declaradas</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Variables Declaradas</em>' operation.
	 * @see latino.Llamada#VariablesDeclaradas(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getLlamada__VariablesDeclaradas__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link latino.Llamada#OperandosNumericos(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Operandos Numericos</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Operandos Numericos</em>' operation.
	 * @see latino.Llamada#OperandosNumericos(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getLlamada__OperandosNumericos__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link latino.Llamada#FuncionDeclarada(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Funcion Declarada</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Funcion Declarada</em>' operation.
	 * @see latino.Llamada#FuncionDeclarada(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getLlamada__FuncionDeclarada__DiagnosticChain_Map();

	/**
	 * Returns the meta object for the '{@link latino.Llamada#ArgumentosCompletos(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Argumentos Completos</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Argumentos Completos</em>' operation.
	 * @see latino.Llamada#ArgumentosCompletos(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getLlamada__ArgumentosCompletos__DiagnosticChain_Map();

	/**
	 * Returns the meta object for enum '{@link latino.Conversion <em>Conversion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Conversion</em>'.
	 * @see latino.Conversion
	 * @generated
	 */
	EEnum getConversion();

	/**
	 * Returns the meta object for enum '{@link latino.OperadorPaso <em>Operador Paso</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operador Paso</em>'.
	 * @see latino.OperadorPaso
	 * @generated
	 */
	EEnum getOperadorPaso();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LatinoFactory getLatinoFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link latino.impl.ProgramaImpl <em>Programa</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see latino.impl.ProgramaImpl
		 * @see latino.impl.LatinoPackageImpl#getPrograma()
		 * @generated
		 */
		EClass PROGRAMA = eINSTANCE.getPrograma();

		/**
		 * The meta object literal for the '<em><b>Sentencias</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMA__SENTENCIAS = eINSTANCE.getPrograma_Sentencias();

		/**
		 * The meta object literal for the '<em><b>Define Variable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROGRAMA___DEFINE_VARIABLE__STRING = eINSTANCE.getPrograma__DefineVariable__String();

		/**
		 * The meta object literal for the '<em><b>Programa No Vacio</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROGRAMA___PROGRAMA_NO_VACIO__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getPrograma__ProgramaNoVacio__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link latino.impl.ElementoImpl <em>Elemento</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see latino.impl.ElementoImpl
		 * @see latino.impl.LatinoPackageImpl#getElemento()
		 * @generated
		 */
		EClass ELEMENTO = eINSTANCE.getElemento();

		/**
		 * The meta object literal for the '<em><b>Programa</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENTO___PROGRAMA = eINSTANCE.getElemento__Programa();

		/**
		 * The meta object literal for the '<em><b>Usa Solo Variables Definidas</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENTO___USA_SOLO_VARIABLES_DEFINIDAS__STRING = eINSTANCE
				.getElemento__UsaSoloVariablesDefinidas__String();

		/**
		 * The meta object literal for the '<em><b>Tipo Texto</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENTO___TIPO_TEXTO__STRING = eINSTANCE.getElemento__TipoTexto__String();

		/**
		 * The meta object literal for the '<em><b>Operandos Numericos</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENTO___OPERANDOS_NUMERICOS__STRING = eINSTANCE.getElemento__OperandosNumericos__String();

		/**
		 * The meta object literal for the '<em><b>Es Reservada Go</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENTO___ES_RESERVADA_GO__STRING = eINSTANCE.getElemento__EsReservadaGo__String();

		/**
		 * The meta object literal for the '<em><b>Es Reservada Latino</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEMENTO___ES_RESERVADA_LATINO__STRING = eINSTANCE.getElemento__EsReservadaLatino__String();

		/**
		 * The meta object literal for the '{@link latino.impl.SentenciaImpl <em>Sentencia</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see latino.impl.SentenciaImpl
		 * @see latino.impl.LatinoPackageImpl#getSentencia()
		 * @generated
		 */
		EClass SENTENCIA = eINSTANCE.getSentencia();

		/**
		 * The meta object literal for the '{@link latino.impl.DefinicionImpl <em>Definicion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see latino.impl.DefinicionImpl
		 * @see latino.impl.LatinoPackageImpl#getDefinicion()
		 * @generated
		 */
		EClass DEFINICION = eINSTANCE.getDefinicion();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFINICION__NOMBRE = eINSTANCE.getDefinicion_Nombre();

		/**
		 * The meta object literal for the '<em><b>Nombre No Reservado</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEFINICION___NOMBRE_NO_RESERVADO__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getDefinicion__NombreNoReservado__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Nombre No Reservado Latino</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEFINICION___NOMBRE_NO_RESERVADO_LATINO__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getDefinicion__NombreNoReservadoLatino__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link latino.impl.AsignacionImpl <em>Asignacion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see latino.impl.AsignacionImpl
		 * @see latino.impl.LatinoPackageImpl#getAsignacion()
		 * @generated
		 */
		EClass ASIGNACION = eINSTANCE.getAsignacion();

		/**
		 * The meta object literal for the '<em><b>Valor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASIGNACION__VALOR = eINSTANCE.getAsignacion_Valor();

		/**
		 * The meta object literal for the '<em><b>Variables Declaradas</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASIGNACION___VARIABLES_DECLARADAS__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getAsignacion__VariablesDeclaradas__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Tipo Consistente</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASIGNACION___TIPO_CONSISTENTE__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getAsignacion__TipoConsistente__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link latino.impl.LeerImpl <em>Leer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see latino.impl.LeerImpl
		 * @see latino.impl.LatinoPackageImpl#getLeer()
		 * @generated
		 */
		EClass LEER = eINSTANCE.getLeer();

		/**
		 * The meta object literal for the '<em><b>Conversion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEER__CONVERSION = eINSTANCE.getLeer_Conversion();

		/**
		 * The meta object literal for the '<em><b>Tipo Leido</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LEER___TIPO_LEIDO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getLeer__TipoLeido__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link latino.impl.ListaImpl <em>Lista</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see latino.impl.ListaImpl
		 * @see latino.impl.LatinoPackageImpl#getLista()
		 * @generated
		 */
		EClass LISTA = eINSTANCE.getLista();

		/**
		 * The meta object literal for the '<em><b>Elementos</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LISTA__ELEMENTOS = eINSTANCE.getLista_Elementos();

		/**
		 * The meta object literal for the '<em><b>Variables Declaradas</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LISTA___VARIABLES_DECLARADAS__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getLista__VariablesDeclaradas__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Lista Siempre Lista</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LISTA___LISTA_SIEMPRE_LISTA__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getLista__ListaSiempreLista__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Elementos Mismo Tipo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LISTA___ELEMENTOS_MISMO_TIPO__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getLista__ElementosMismoTipo__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Operandos Numericos</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LISTA___OPERANDOS_NUMERICOS__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getLista__OperandosNumericos__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link latino.impl.AsignacionIndiceImpl <em>Asignacion Indice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see latino.impl.AsignacionIndiceImpl
		 * @see latino.impl.LatinoPackageImpl#getAsignacionIndice()
		 * @generated
		 */
		EClass ASIGNACION_INDICE = eINSTANCE.getAsignacionIndice();

		/**
		 * The meta object literal for the '<em><b>Lista</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASIGNACION_INDICE__LISTA = eINSTANCE.getAsignacionIndice_Lista();

		/**
		 * The meta object literal for the '<em><b>Indice</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASIGNACION_INDICE__INDICE = eINSTANCE.getAsignacionIndice_Indice();

		/**
		 * The meta object literal for the '<em><b>Valor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASIGNACION_INDICE__VALOR = eINSTANCE.getAsignacionIndice_Valor();

		/**
		 * The meta object literal for the '<em><b>Variables Declaradas</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASIGNACION_INDICE___VARIABLES_DECLARADAS__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getAsignacionIndice__VariablesDeclaradas__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Tipo Elemento</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASIGNACION_INDICE___TIPO_ELEMENTO__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getAsignacionIndice__TipoElemento__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Lista Declarada</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASIGNACION_INDICE___LISTA_DECLARADA__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getAsignacionIndice__ListaDeclarada__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Indice Numerico</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASIGNACION_INDICE___INDICE_NUMERICO__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getAsignacionIndice__IndiceNumerico__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Operandos Numericos</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASIGNACION___OPERANDOS_NUMERICOS__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getAsignacion__OperandosNumericos__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link latino.impl.CondicionalImpl <em>Condicional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see latino.impl.CondicionalImpl
		 * @see latino.impl.LatinoPackageImpl#getCondicional()
		 * @generated
		 */
		EClass CONDICIONAL = eINSTANCE.getCondicional();

		/**
		 * The meta object literal for the '<em><b>Condicion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDICIONAL__CONDICION = eINSTANCE.getCondicional_Condicion();

		/**
		 * The meta object literal for the '<em><b>Entonces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDICIONAL__ENTONCES = eINSTANCE.getCondicional_Entonces();

		/**
		 * The meta object literal for the '<em><b>Osis</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDICIONAL__OSIS = eINSTANCE.getCondicional_Osis();

		/**
		 * The meta object literal for the '<em><b>Sino</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDICIONAL__SINO = eINSTANCE.getCondicional_Sino();

		/**
		 * The meta object literal for the '<em><b>Variables Declaradas</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONDICIONAL___VARIABLES_DECLARADAS__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getCondicional__VariablesDeclaradas__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Condicion Logica</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONDICIONAL___CONDICION_LOGICA__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getCondicional__CondicionLogica__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Bloque No Vacio</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONDICIONAL___BLOQUE_NO_VACIO__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getCondicional__BloqueNoVacio__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Operandos Numericos</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CONDICIONAL___OPERANDOS_NUMERICOS__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getCondicional__OperandosNumericos__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link latino.impl.OsiImpl <em>Osi</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see latino.impl.OsiImpl
		 * @see latino.impl.LatinoPackageImpl#getOsi()
		 * @generated
		 */
		EClass OSI = eINSTANCE.getOsi();

		/**
		 * The meta object literal for the '<em><b>Condicion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OSI__CONDICION = eINSTANCE.getOsi_Condicion();

		/**
		 * The meta object literal for the '<em><b>Sentencias</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OSI__SENTENCIAS = eINSTANCE.getOsi_Sentencias();

		/**
		 * The meta object literal for the '<em><b>Variables Declaradas</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OSI___VARIABLES_DECLARADAS__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getOsi__VariablesDeclaradas__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Condicion Logica</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OSI___CONDICION_LOGICA__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getOsi__CondicionLogica__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Bloque No Vacio</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OSI___BLOQUE_NO_VACIO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getOsi__BloqueNoVacio__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Operandos Numericos</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OSI___OPERANDOS_NUMERICOS__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getOsi__OperandosNumericos__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link latino.impl.ImprimirImpl <em>Imprimir</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see latino.impl.ImprimirImpl
		 * @see latino.impl.LatinoPackageImpl#getImprimir()
		 * @generated
		 */
		EClass IMPRIMIR = eINSTANCE.getImprimir();

		/**
		 * The meta object literal for the '<em><b>Mensaje</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPRIMIR__MENSAJE = eINSTANCE.getImprimir_Mensaje();

		/**
		 * The meta object literal for the '<em><b>Operandos Numericos</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMPRIMIR___OPERANDOS_NUMERICOS__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getImprimir__OperandosNumericos__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Variables Declaradas</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMPRIMIR___VARIABLES_DECLARADAS__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getImprimir__VariablesDeclaradas__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link latino.impl.CicloImpl <em>Ciclo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see latino.impl.CicloImpl
		 * @see latino.impl.LatinoPackageImpl#getCiclo()
		 * @generated
		 */
		EClass CICLO = eINSTANCE.getCiclo();

		/**
		 * The meta object literal for the '<em><b>Cuerpo</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CICLO__CUERPO = eINSTANCE.getCiclo_Cuerpo();

		/**
		 * The meta object literal for the '<em><b>Cuerpo No Vacio</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CICLO___CUERPO_NO_VACIO__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getCiclo__CuerpoNoVacio__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link latino.impl.CicloCondicionImpl <em>Ciclo Condicion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see latino.impl.CicloCondicionImpl
		 * @see latino.impl.LatinoPackageImpl#getCicloCondicion()
		 * @generated
		 */
		EClass CICLO_CONDICION = eINSTANCE.getCicloCondicion();

		/**
		 * The meta object literal for the '<em><b>Condicion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CICLO_CONDICION__CONDICION = eINSTANCE.getCicloCondicion_Condicion();

		/**
		 * The meta object literal for the '<em><b>Variables Declaradas</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CICLO_CONDICION___VARIABLES_DECLARADAS__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getCicloCondicion__VariablesDeclaradas__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Operandos Numericos</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CICLO_CONDICION___OPERANDOS_NUMERICOS__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getCicloCondicion__OperandosNumericos__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Condicion Logica</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CICLO_CONDICION___CONDICION_LOGICA__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getCicloCondicion__CondicionLogica__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link latino.impl.MientrasImpl <em>Mientras</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see latino.impl.MientrasImpl
		 * @see latino.impl.LatinoPackageImpl#getMientras()
		 * @generated
		 */
		EClass MIENTRAS = eINSTANCE.getMientras();

		/**
		 * The meta object literal for the '{@link latino.impl.RepetirImpl <em>Repetir</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see latino.impl.RepetirImpl
		 * @see latino.impl.LatinoPackageImpl#getRepetir()
		 * @generated
		 */
		EClass REPETIR = eINSTANCE.getRepetir();

		/**
		 * The meta object literal for the '{@link latino.impl.DesdeImpl <em>Desde</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see latino.impl.DesdeImpl
		 * @see latino.impl.LatinoPackageImpl#getDesde()
		 * @generated
		 */
		EClass DESDE = eINSTANCE.getDesde();

		/**
		 * The meta object literal for the '<em><b>Inicio</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESDE__INICIO = eINSTANCE.getDesde_Inicio();

		/**
		 * The meta object literal for the '<em><b>Paso</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESDE__PASO = eINSTANCE.getDesde_Paso();

		/**
		 * The meta object literal for the '{@link latino.impl.ParaImpl <em>Para</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see latino.impl.ParaImpl
		 * @see latino.impl.LatinoPackageImpl#getPara()
		 * @generated
		 */
		EClass PARA = eINSTANCE.getPara();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARA__VARIABLE = eINSTANCE.getPara_Variable();

		/**
		 * The meta object literal for the '<em><b>Limites</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARA__LIMITES = eINSTANCE.getPara_Limites();

		/**
		 * The meta object literal for the '<em><b>Rango Numerico</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARA___RANGO_NUMERICO__DIAGNOSTICCHAIN_MAP = eINSTANCE.getPara__RangoNumerico__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Variables Declaradas</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARA___VARIABLES_DECLARADAS__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getPara__VariablesDeclaradas__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link latino.impl.IncrementoImpl <em>Incremento</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see latino.impl.IncrementoImpl
		 * @see latino.impl.LatinoPackageImpl#getIncremento()
		 * @generated
		 */
		EClass INCREMENTO = eINSTANCE.getIncremento();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCREMENTO__NOMBRE = eINSTANCE.getIncremento_Nombre();

		/**
		 * The meta object literal for the '<em><b>Operador</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCREMENTO__OPERADOR = eINSTANCE.getIncremento_Operador();

		/**
		 * The meta object literal for the '<em><b>Variable Declarada</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INCREMENTO___VARIABLE_DECLARADA__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getIncremento__VariableDeclarada__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link latino.impl.SaltoImpl <em>Salto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see latino.impl.SaltoImpl
		 * @see latino.impl.LatinoPackageImpl#getSalto()
		 * @generated
		 */
		EClass SALTO = eINSTANCE.getSalto();

		/**
		 * The meta object literal for the '<em><b>Dentro De Ciclo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SALTO___DENTRO_DE_CICLO__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getSalto__DentroDeCiclo__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link latino.impl.RomperImpl <em>Romper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see latino.impl.RomperImpl
		 * @see latino.impl.LatinoPackageImpl#getRomper()
		 * @generated
		 */
		EClass ROMPER = eINSTANCE.getRomper();

		/**
		 * The meta object literal for the '{@link latino.impl.ContinuarImpl <em>Continuar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see latino.impl.ContinuarImpl
		 * @see latino.impl.LatinoPackageImpl#getContinuar()
		 * @generated
		 */
		EClass CONTINUAR = eINSTANCE.getContinuar();

		/**
		 * The meta object literal for the '{@link latino.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see latino.impl.VariableImpl
		 * @see latino.impl.LatinoPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Nombre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NOMBRE = eINSTANCE.getVariable_Nombre();

		/**
		 * The meta object literal for the '<em><b>Nombre No Reservado</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE___NOMBRE_NO_RESERVADO__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getVariable__NombreNoReservado__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Nombre No Reservado Latino</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VARIABLE___NOMBRE_NO_RESERVADO_LATINO__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getVariable__NombreNoReservadoLatino__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link latino.impl.ElegirImpl <em>Elegir</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see latino.impl.ElegirImpl
		 * @see latino.impl.LatinoPackageImpl#getElegir()
		 * @generated
		 */
		EClass ELEGIR = eINSTANCE.getElegir();

		/**
		 * The meta object literal for the '<em><b>Expresion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEGIR__EXPRESION = eINSTANCE.getElegir_Expresion();

		/**
		 * The meta object literal for the '<em><b>Casos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEGIR__CASOS = eINSTANCE.getElegir_Casos();

		/**
		 * The meta object literal for the '<em><b>Defecto</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEGIR__DEFECTO = eINSTANCE.getElegir_Defecto();

		/**
		 * The meta object literal for the '<em><b>Casos Mismo Tipo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEGIR___CASOS_MISMO_TIPO__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getElegir__CasosMismoTipo__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Variables Declaradas</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEGIR___VARIABLES_DECLARADAS__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getElegir__VariablesDeclaradas__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Caso Repetido</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ELEGIR___CASO_REPETIDO__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getElegir__CasoRepetido__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link latino.impl.CasoImpl <em>Caso</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see latino.impl.CasoImpl
		 * @see latino.impl.LatinoPackageImpl#getCaso()
		 * @generated
		 */
		EClass CASO = eINSTANCE.getCaso();

		/**
		 * The meta object literal for the '<em><b>Valores</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASO__VALORES = eINSTANCE.getCaso_Valores();

		/**
		 * The meta object literal for the '<em><b>Sentencias</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASO__SENTENCIAS = eINSTANCE.getCaso_Sentencias();

		/**
		 * The meta object literal for the '{@link latino.impl.FuncionImpl <em>Funcion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see latino.impl.FuncionImpl
		 * @see latino.impl.LatinoPackageImpl#getFuncion()
		 * @generated
		 */
		EClass FUNCION = eINSTANCE.getFuncion();

		/**
		 * The meta object literal for the '<em><b>Parametros</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCION__PARAMETROS = eINSTANCE.getFuncion_Parametros();

		/**
		 * The meta object literal for the '<em><b>Cuerpo</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCION__CUERPO = eINSTANCE.getFuncion_Cuerpo();

		/**
		 * The meta object literal for the '<em><b>Funcion Unica</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FUNCION___FUNCION_UNICA__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getFuncion__FuncionUnica__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Bloque No Vacio</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FUNCION___BLOQUE_NO_VACIO__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getFuncion__BloqueNoVacio__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link latino.impl.RetornoImpl <em>Retorno</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see latino.impl.RetornoImpl
		 * @see latino.impl.LatinoPackageImpl#getRetorno()
		 * @generated
		 */
		EClass RETORNO = eINSTANCE.getRetorno();

		/**
		 * The meta object literal for the '<em><b>Valor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETORNO__VALOR = eINSTANCE.getRetorno_Valor();

		/**
		 * The meta object literal for the '<em><b>Dentro De Funcion</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RETORNO___DENTRO_DE_FUNCION__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getRetorno__DentroDeFuncion__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Variables Declaradas</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RETORNO___VARIABLES_DECLARADAS__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getRetorno__VariablesDeclaradas__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Operandos Numericos</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RETORNO___OPERANDOS_NUMERICOS__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getRetorno__OperandosNumericos__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link latino.impl.LlamadaImpl <em>Llamada</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see latino.impl.LlamadaImpl
		 * @see latino.impl.LatinoPackageImpl#getLlamada()
		 * @generated
		 */
		EClass LLAMADA = eINSTANCE.getLlamada();

		/**
		 * The meta object literal for the '<em><b>Funcion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LLAMADA__FUNCION = eINSTANCE.getLlamada_Funcion();

		/**
		 * The meta object literal for the '<em><b>Argumentos</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LLAMADA__ARGUMENTOS = eINSTANCE.getLlamada_Argumentos();

		/**
		 * The meta object literal for the '<em><b>Variables Declaradas</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LLAMADA___VARIABLES_DECLARADAS__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getLlamada__VariablesDeclaradas__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Operandos Numericos</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LLAMADA___OPERANDOS_NUMERICOS__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getLlamada__OperandosNumericos__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Funcion Declarada</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LLAMADA___FUNCION_DECLARADA__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getLlamada__FuncionDeclarada__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '<em><b>Argumentos Completos</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LLAMADA___ARGUMENTOS_COMPLETOS__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getLlamada__ArgumentosCompletos__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link latino.Conversion <em>Conversion</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see latino.Conversion
		 * @see latino.impl.LatinoPackageImpl#getConversion()
		 * @generated
		 */
		EEnum CONVERSION = eINSTANCE.getConversion();

		/**
		 * The meta object literal for the '{@link latino.OperadorPaso <em>Operador Paso</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see latino.OperadorPaso
		 * @see latino.impl.LatinoPackageImpl#getOperadorPaso()
		 * @generated
		 */
		EEnum OPERADOR_PASO = eINSTANCE.getOperadorPaso();

	}

} //LatinoPackage
