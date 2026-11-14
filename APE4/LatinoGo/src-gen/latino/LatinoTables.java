/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /LatinoGo/model/latino.ecore
 * using:
 *   /LatinoGo/model/latino.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package latino;

import java.lang.String;
// import latino.LatinoPackage;
// import latino.LatinoTables;
import org.eclipse.ocl.pivot.ParameterTypes;
import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TuplePartId;
import org.eclipse.ocl.pivot.ids.TupleTypeId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.TypeUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.SetValue;

/**
 * LatinoTables provides the dispatch tables for the latino for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class LatinoTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(LatinoPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_uta_edu_ec_s_latino = IdManager.getNsURIPackageId("http://www.uta.edu.ec/latino", null, LatinoPackage.eINSTANCE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_PRIMid_String = TypeId.BAG.getSpecializedId(TypeId.STRING, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Asignacion = LatinoTables.PACKid_http_c_s_s_www_uta_edu_ec_s_latino.getClassId("Asignacion", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_AsignacionIndice = LatinoTables.PACKid_http_c_s_s_www_uta_edu_ec_s_latino.getClassId("AsignacionIndice", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Caso = LatinoTables.PACKid_http_c_s_s_www_uta_edu_ec_s_latino.getClassId("Caso", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Ciclo = LatinoTables.PACKid_http_c_s_s_www_uta_edu_ec_s_latino.getClassId("Ciclo", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_CicloCondicion = LatinoTables.PACKid_http_c_s_s_www_uta_edu_ec_s_latino.getClassId("CicloCondicion", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = LatinoTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Condicional = LatinoTables.PACKid_http_c_s_s_www_uta_edu_ec_s_latino.getClassId("Condicional", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Definicion = LatinoTables.PACKid_http_c_s_s_www_uta_edu_ec_s_latino.getClassId("Definicion", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Desde = LatinoTables.PACKid_http_c_s_s_www_uta_edu_ec_s_latino.getClassId("Desde", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Elegir = LatinoTables.PACKid_http_c_s_s_www_uta_edu_ec_s_latino.getClassId("Elegir", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Elemento = LatinoTables.PACKid_http_c_s_s_www_uta_edu_ec_s_latino.getClassId("Elemento", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Funcion = LatinoTables.PACKid_http_c_s_s_www_uta_edu_ec_s_latino.getClassId("Funcion", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Imprimir = LatinoTables.PACKid_http_c_s_s_www_uta_edu_ec_s_latino.getClassId("Imprimir", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Incremento = LatinoTables.PACKid_http_c_s_s_www_uta_edu_ec_s_latino.getClassId("Incremento", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Leer = LatinoTables.PACKid_http_c_s_s_www_uta_edu_ec_s_latino.getClassId("Leer", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Lista = LatinoTables.PACKid_http_c_s_s_www_uta_edu_ec_s_latino.getClassId("Lista", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Llamada = LatinoTables.PACKid_http_c_s_s_www_uta_edu_ec_s_latino.getClassId("Llamada", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_OclElement = LatinoTables.PACKid_$metamodel$.getClassId("OclElement", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Osi = LatinoTables.PACKid_http_c_s_s_www_uta_edu_ec_s_latino.getClassId("Osi", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Para = LatinoTables.PACKid_http_c_s_s_www_uta_edu_ec_s_latino.getClassId("Para", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Programa = LatinoTables.PACKid_http_c_s_s_www_uta_edu_ec_s_latino.getClassId("Programa", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Retorno = LatinoTables.PACKid_http_c_s_s_www_uta_edu_ec_s_latino.getClassId("Retorno", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Salto = LatinoTables.PACKid_http_c_s_s_www_uta_edu_ec_s_latino.getClassId("Salto", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Sentencia = LatinoTables.PACKid_http_c_s_s_www_uta_edu_ec_s_latino.getClassId("Sentencia", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Variable = LatinoTables.PACKid_http_c_s_s_www_uta_edu_ec_s_latino.getClassId("Variable", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_Conversion = LatinoTables.PACKid_http_c_s_s_www_uta_edu_ec_s_latino.getEnumerationId("Conversion");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_OperadorPaso = LatinoTables.PACKid_http_c_s_s_www_uta_edu_ec_s_latino.getEnumerationId("OperadorPaso");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_1 = ValueUtil.integerValueOf("1");
	public static final /*@NonInvalid*/ TuplePartId PARTid_ = IdManager.getTuplePartId(0, "message", TypeId.STRING);
	public static final /*@NonInvalid*/ TuplePartId PARTid__0 = IdManager.getTuplePartId(1, "severity", TypeId.INTEGER);
	public static final /*@NonInvalid*/ TuplePartId PARTid__1 = IdManager.getTuplePartId(2, "status", TypeId.BOOLEAN);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_PRIMid_String = TypeId.SEQUENCE.getSpecializedId(TypeId.STRING, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_PRIMid_String_0 = TypeId.SEQUENCE.getSpecializedId(TypeId.STRING, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_PRIMid_String_1 = TypeId.SEQUENCE.getSpecializedId(TypeId.STRING, true, ValueUtil.ONE_VALUE, ValueUtil.integerValueOf(3));
	public static final /*@NonInvalid*/ CollectionTypeId SEQ_PRIMid_String_2 = TypeId.SEQUENCE.getSpecializedId(TypeId.STRING, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_PRIMid_String = TypeId.SET.getSpecializedId(TypeId.STRING, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_PRIMid_String_0 = TypeId.SET.getSpecializedId(TypeId.STRING, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ String STR_ = "";
	public static final /*@NonInvalid*/ String STR_El_32_ciclo_32_necesita_32_al_32_menos_32_una_32_sentencia_32_dentro = "El ciclo necesita al menos una sentencia dentro";
	public static final /*@NonInvalid*/ String STR_El_32_elegir_32_usa_32_una_32_variable_32_que_32_no_32_existe = "El elegir usa una variable que no existe";
	public static final /*@NonInvalid*/ String STR_El_32_indice_32_debe_32_ser_32_un_32_numero_44_32_por_32_ejemplo_32_v_91_0_93 = "El indice debe ser un numero, por ejemplo v[0]";
	public static final /*@NonInvalid*/ String STR_El_32_indice_32_o_32_el_32_valor_32_usan_32_una_32_variable_32_que_32_no_32_existe = "El indice o el valor usan una variable que no existe";
	public static final /*@NonInvalid*/ String STR_El_32_osi_32_necesita_32_al_32_menos_32_una_32_sentencia_32_dentro = "El osi necesita al menos una sentencia dentro";
	public static final /*@NonInvalid*/ String STR_El_32_programa_32_esta_32_vacio_44_32_agrega_32_al_32_menos_32_una_32_sentencia = "El programa esta vacio, agrega al menos una sentencia";
	public static final /*@NonInvalid*/ String STR_El_32_rango_32_usa_32_una_32_variable_32_que_32_no_32_existe = "El rango usa una variable que no existe";
	public static final /*@NonInvalid*/ String STR_El_32_si_32_necesita_32_al_32_menos_32_una_32_sentencia_32_dentro = "El si necesita al menos una sentencia dentro";
	public static final /*@NonInvalid*/ String STR_El_32_valor_32_del_32_retorno_32_usa_32_una_32_variable_32_que_32_no_32_existe = "El valor del retorno usa una variable que no existe";
	public static final /*@NonInvalid*/ String STR_El_32_valor_32_no_32_es_32_del_32_mismo_32_tipo_32_que_32_los_32_elementos_32_de_32_la_32_lista = "El valor no es del mismo tipo que los elementos de la lista";
	public static final /*@NonInvalid*/ String STR_El_32_valor_32_usa_32_una_32_variable_32_que_32_no_32_existe = "El valor usa una variable que no existe";
	public static final /*@NonInvalid*/ String STR_Esa_32_funcion_32_no_32_existe_44_32_definela_32_antes_32_con_32_funcion = "Esa funcion no existe, definela antes con funcion";
	public static final /*@NonInvalid*/ String STR_Esa_32_variable_32_no_32_existe_44_32_dale_32_un_32_valor_32_antes_32_de_32_usar_32_p_p_32_o_32_m_m = "Esa variable no existe, dale un valor antes de usar ++ o --";
	public static final /*@NonInvalid*/ String STR_Ese_32_nombre_32_es_32_una_32_palabra_32_de_32_Latino_44_32_usa_32_otro = "Ese nombre es una palabra de Latino, usa otro";
	public static final /*@NonInvalid*/ String STR_Ese_32_nombre_32_es_32_una_32_palabra_32_reservada_32_de_32_Go_44_32_usa_32_otro = "Ese nombre es una palabra reservada de Go, usa otro";
	public static final /*@NonInvalid*/ String STR_Ese_32_nombre_32_no_32_es_32_una_32_lista_44_32_creala_32_antes_32_con_32_corchetes = "Ese nombre no es una lista, creala antes con corchetes";
	public static final /*@NonInvalid*/ String STR_Ese_32_nombre_32_ya_32_lo_32_usa_32_otra_32_funcion_32_o_32_una_32_variable = "Ese nombre ya lo usa otra funcion o una variable";
	public static final /*@NonInvalid*/ String STR_Ese_32_valor_32_ya_32_esta_32_en_32_otro_32_caso_32_del_32_elegir = "Ese valor ya esta en otro caso del elegir";
	public static final /*@NonInvalid*/ String STR_Esta_32_variable_32_es_32_una_32_lista_44_32_no_32_le_32_des_32_un_32_valor_32_suelto = "Esta variable es una lista, no le des un valor suelto";
	public static final /*@NonInvalid*/ String STR_Esta_32_variable_32_se_32_lee_32_como_32_numero_32_pero_32_luego_32_le_32_das_32_otro_32_tipo = "Esta variable se lee como numero pero luego le das otro tipo";
	public static final /*@NonInvalid*/ String STR_Esta_32_variable_32_se_32_lee_32_como_32_texto_32_pero_32_luego_32_le_32_das_32_otro_32_tipo = "Esta variable se lee como texto pero luego le das otro tipo";
	public static final /*@NonInvalid*/ String STR_La_32_condicion_32_debe_32_ser_32_verdadera_32_o_32_falsa_44_32_por_32_ejemplo_32_edad_32_g_32_18 = "La condicion debe ser verdadera o falsa, por ejemplo edad > 18";
	public static final /*@NonInvalid*/ String STR_La_32_condicion_32_del_32_ciclo_32_debe_32_ser_32_verdadera_32_o_32_falsa_44_32_por_32_ejemplo_32_i = "La condicion del ciclo debe ser verdadera o falsa, por ejemplo i < 10";
	public static final /*@NonInvalid*/ String STR_La_32_condicion_32_del_32_ciclo_32_usa_32_una_32_variable_32_que_32_no_32_existe = "La condicion del ciclo usa una variable que no existe";
	public static final /*@NonInvalid*/ String STR_La_32_condicion_32_del_32_osi_32_debe_32_ser_32_verdadera_32_o_32_falsa_44_32_por_32_ejemplo_32_eda = "La condicion del osi debe ser verdadera o falsa, por ejemplo edad > 18";
	public static final /*@NonInvalid*/ String STR_La_32_condicion_32_del_32_osi_32_usa_32_una_32_variable_32_que_32_no_32_existe = "La condicion del osi usa una variable que no existe";
	public static final /*@NonInvalid*/ String STR_La_32_condicion_32_usa_32_una_32_variable_32_que_32_no_32_existe = "La condicion usa una variable que no existe";
	public static final /*@NonInvalid*/ String STR_La_32_funcion_32_necesita_32_al_32_menos_32_una_32_sentencia_32_dentro = "La funcion necesita al menos una sentencia dentro";
	public static final /*@NonInvalid*/ String STR_La_32_lista_32_mezcla_32_numeros_44_32_textos_32_y_32_logicos_44_32_usa_32_un_32_solo_32_tipo = "La lista mezcla numeros, textos y logicos, usa un solo tipo";
	public static final /*@NonInvalid*/ String STR_La_32_lista_32_usa_32_una_32_variable_32_que_32_no_32_existe = "La lista usa una variable que no existe";
	public static final /*@NonInvalid*/ String STR_La_32_llamada_32_no_32_lleva_32_tantos_32_valores_32_como_32_parametros_32_tiene_32_la_32_func = "La llamada no lleva tantos valores como parametros tiene la funcion";
	public static final /*@NonInvalid*/ String STR_La_32_llamada_32_usa_32_una_32_variable_32_que_32_no_32_existe = "La llamada usa una variable que no existe";
	public static final /*@NonInvalid*/ String STR_La_32_variable_32_cambia_32_de_32_tipo_44_32_no_32_mezcles_32_numeros_44_32_textos_32_y_32_logicos = "La variable cambia de tipo, no mezcles numeros, textos y logicos";
	public static final /*@NonInvalid*/ String STR_Los_32_casos_32_deben_32_ser_32_del_32_mismo_32_tipo_32_que_32_lo_32_que_32_se_32_elige_44_32_numeros_32 = "Los casos deben ser del mismo tipo que lo que se elige, numeros o textos";
	public static final /*@NonInvalid*/ String STR_Los_32_valores_32_del_32_rango_32_deben_32_ser_32_numeros = "Los valores del rango deben ser numeros";
	public static final /*@NonInvalid*/ String STR_No_32_uses_32_p_32_m_32_a_32_s_32_37_32_con_32_textos_32_o_32_logicos_44_32_para_32_unir_32_textos_32_usa_32__ = "No uses + - * / % con textos o logicos, para unir textos usa ..";
	public static final /*@NonInvalid*/ String STR__ = "_";
	public static final /*@NonInvalid*/ String STR__32 = " ";
	public static final /*@NonInvalid*/ String STR__32_o_e_91_93_l_g_q_33_38_124_p_m_a_s_37__44 = " ()[]<>=!&|+-*/%.,";
	public static final /*@NonInvalid*/ String STR__34_91_94_34_93_a_34_124_39_91_94_39_93_a_39 = "\"[^\"]*\"|\'[^\']*\'";
	public static final /*@NonInvalid*/ String STR__64 = "@";
	public static final /*@NonInvalid*/ String STR__91_a_m_zA_m_Z__93_91_a_m_zA_m_Z0_m_9__93_a = "[a-zA-Z_][a-zA-Z0-9_]*";
	public static final /*@NonInvalid*/ String STR__91_o_e_93 = "[()]";
	public static final /*@NonInvalid*/ String STR__92_b_o_verdadero_124_falso_124_cierto_e_92_b = "\\b(verdadero|falso|cierto)\\b";
	public static final /*@NonInvalid*/ String STR__a_91_a_m_zA_m_Z__93_91_a_m_zA_m_Z0_m_9__93_a_32_a_91_o_93__a = ".*[a-zA-Z_][a-zA-Z0-9_]* *[(].*";
	public static final /*@NonInvalid*/ String STR__a_92_b_o_verdadero_124_falso_124_cierto_e_92_b_a = ".*\\b(verdadero|falso|cierto)\\b.*";
	public static final /*@NonInvalid*/ String STR__a_o_64_91_m_p_a_s_37_93_124_91_m_p_a_s_37_93_64_e__a = ".*(@[-+*/%]|[-+*/%]@).*";
	public static final /*@NonInvalid*/ String STR__a_o_91_34_39_93_124_91__93_91__93_e__a = ".*([\"\']|[.][.]).*";
	public static final /*@NonInvalid*/ String STR__a_o_q_q_124_33_q_124_l_124_g_124_38_38_124_91_124_93_91_124_93_124_33_e__a = ".*(==|!=|<|>|&&|[|][|]|!).*";
	public static final /*@NonInvalid*/ String STR_aTexto = "aTexto";
	public static final /*@NonInvalid*/ String STR_any = "any";
	public static final /*@NonInvalid*/ String STR_bool = "bool";
	public static final /*@NonInvalid*/ String STR_break = "break";
	public static final /*@NonInvalid*/ String STR_bufio = "bufio";
	public static final /*@NonInvalid*/ String STR_case = "case";
	public static final /*@NonInvalid*/ String STR_chan = "chan";
	public static final /*@NonInvalid*/ String STR_cierto = "cierto";
	public static final /*@NonInvalid*/ String STR_clase = "clase";
	public static final /*@NonInvalid*/ String STR_const = "const";
	public static final /*@NonInvalid*/ String STR_constructor = "constructor";
	public static final /*@NonInvalid*/ String STR_continue = "continue";
	public static final /*@NonInvalid*/ String STR_default = "default";
	public static final /*@NonInvalid*/ String STR_defer = "defer";
	public static final /*@NonInvalid*/ String STR_desconocido = "desconocido";
	public static final /*@NonInvalid*/ String STR_else = "else";
	public static final /*@NonInvalid*/ String STR_escribir_32_usa_32_una_32_variable_32_que_32_no_32_existe = "escribir usa una variable que no existe";
	public static final /*@NonInvalid*/ String STR_estatico = "estatico";
	public static final /*@NonInvalid*/ String STR_fallthrough = "fallthrough";
	public static final /*@NonInvalid*/ String STR_false = "false";
	public static final /*@NonInvalid*/ String STR_falso = "falso";
	public static final /*@NonInvalid*/ String STR_float64 = "float64";
	public static final /*@NonInvalid*/ String STR_fmt = "fmt";
	public static final /*@NonInvalid*/ String STR_for = "for";
	public static final /*@NonInvalid*/ String STR_func = "func";
	public static final /*@NonInvalid*/ String STR_global = "global";
	public static final /*@NonInvalid*/ String STR_go = "go";
	public static final /*@NonInvalid*/ String STR_goto = "goto";
	public static final /*@NonInvalid*/ String STR_hereda = "hereda";
	public static final /*@NonInvalid*/ String STR_if = "if";
	public static final /*@NonInvalid*/ String STR_import = "import";
	public static final /*@NonInvalid*/ String STR_init = "init";
	public static final /*@NonInvalid*/ String STR_int = "int";
	public static final /*@NonInvalid*/ String STR_interface = "interface";
	public static final /*@NonInvalid*/ String STR_ir = "ir";
	public static final /*@NonInvalid*/ String STR_lector = "lector";
	public static final /*@NonInvalid*/ String STR_leerNumero = "leerNumero";
	public static final /*@NonInvalid*/ String STR_leerTexto = "leerTexto";
	public static final /*@NonInvalid*/ String STR_logico = "logico";
	public static final /*@NonInvalid*/ String STR_main = "main";
	public static final /*@NonInvalid*/ String STR_map = "map";
	public static final /*@NonInvalid*/ String STR_math = "math";
	public static final /*@NonInvalid*/ String STR_mi = "mi";
	public static final /*@NonInvalid*/ String STR_nil = "nil";
	public static final /*@NonInvalid*/ String STR_nueva = "nueva";
	public static final /*@NonInvalid*/ String STR_nulo = "nulo";
	public static final /*@NonInvalid*/ String STR_numero = "numero";
	public static final /*@NonInvalid*/ String STR_os = "os";
	public static final /*@NonInvalid*/ String STR_package = "package";
	public static final /*@NonInvalid*/ String STR_primeraVuelta = "primeraVuelta";
	public static final /*@NonInvalid*/ String STR_range = "range";
	public static final /*@NonInvalid*/ String STR_retorno_32_solo_32_puede_32_ir_32_dentro_32_de_32_una_32_funcion = "retorno solo puede ir dentro de una funcion";
	public static final /*@NonInvalid*/ String STR_return = "return";
	public static final /*@NonInvalid*/ String STR_romper_32_y_32_continuar_32_solo_32_van_32_dentro_32_de_32_un_32_ciclo = "romper y continuar solo van dentro de un ciclo";
	public static final /*@NonInvalid*/ String STR_select = "select";
	public static final /*@NonInvalid*/ String STR_strconv = "strconv";
	public static final /*@NonInvalid*/ String STR_string = "string";
	public static final /*@NonInvalid*/ String STR_strings = "strings";
	public static final /*@NonInvalid*/ String STR_struct = "struct";
	public static final /*@NonInvalid*/ String STR_super = "super";
	public static final /*@NonInvalid*/ String STR_switch = "switch";
	public static final /*@NonInvalid*/ String STR_texto = "texto";
	public static final /*@NonInvalid*/ String STR_true = "true";
	public static final /*@NonInvalid*/ String STR_type = "type";
	public static final /*@NonInvalid*/ String STR_var = "var";
	public static final /*@NonInvalid*/ String STR_verdadero = "verdadero";
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_NINGUNA = LatinoTables.ENUMid_Conversion.getEnumerationLiteralId("NINGUNA");
	public static final /*@NonInvalid*/ EnumerationLiteralId ELITid_NUMERO = LatinoTables.ENUMid_Conversion.getEnumerationLiteralId("NUMERO");
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Caso = TypeId.ORDERED_SET.getSpecializedId(LatinoTables.CLSSid_Caso, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Osi = TypeId.ORDERED_SET.getSpecializedId(LatinoTables.CLSSid_Osi, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Sentencia = TypeId.ORDERED_SET.getSpecializedId(LatinoTables.CLSSid_Sentencia, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Sentencia_0 = TypeId.ORDERED_SET.getSpecializedId(LatinoTables.CLSSid_Sentencia, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Variable = TypeId.ORDERED_SET.getSpecializedId(LatinoTables.CLSSid_Variable, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Asignacion = TypeId.SET.getSpecializedId(LatinoTables.CLSSid_Asignacion, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Definicion = TypeId.SET.getSpecializedId(LatinoTables.CLSSid_Definicion, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Funcion = TypeId.SET.getSpecializedId(LatinoTables.CLSSid_Funcion, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Lista = TypeId.SET.getSpecializedId(LatinoTables.CLSSid_Lista, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_OclElement = TypeId.SET.getSpecializedId(LatinoTables.CLSSid_OclElement, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_OclElement_0 = TypeId.SET.getSpecializedId(LatinoTables.CLSSid_OclElement, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ TupleTypeId TUPLid_ = IdManager.getTupleTypeId("Tuple", LatinoTables.PARTid_, LatinoTables.PARTid__0, LatinoTables.PARTid__1);
	public static final /*@NonInvalid*/ SetValue Set = ValueUtil.createSetOfEach(LatinoTables.SET_PRIMid_String, LatinoTables.STR_break, LatinoTables.STR_case, LatinoTables.STR_chan, LatinoTables.STR_const, LatinoTables.STR_continue, LatinoTables.STR_default, LatinoTables.STR_defer, LatinoTables.STR_else, LatinoTables.STR_fallthrough, LatinoTables.STR_for, LatinoTables.STR_func, LatinoTables.STR_go, LatinoTables.STR_goto, LatinoTables.STR_if, LatinoTables.STR_import, LatinoTables.STR_interface, LatinoTables.STR_map, LatinoTables.STR_package, LatinoTables.STR_range, LatinoTables.STR_return, LatinoTables.STR_select, LatinoTables.STR_struct, LatinoTables.STR_switch, LatinoTables.STR_type, LatinoTables.STR_var, LatinoTables.STR_fmt, LatinoTables.STR_main, LatinoTables.STR_true, LatinoTables.STR_false, LatinoTables.STR_nil, LatinoTables.STR_int, LatinoTables.STR_float64, LatinoTables.STR_string, LatinoTables.STR_bool, LatinoTables.STR_any, LatinoTables.STR_init, LatinoTables.STR__, LatinoTables.STR_leerTexto, LatinoTables.STR_leerNumero, LatinoTables.STR_aTexto, LatinoTables.STR_lector, LatinoTables.STR_bufio, LatinoTables.STR_math, LatinoTables.STR_os, LatinoTables.STR_strconv, LatinoTables.STR_strings, LatinoTables.STR_primeraVuelta);
	public static final /*@NonInvalid*/ SetValue Set_0 = ValueUtil.createSetOfEach(LatinoTables.SET_PRIMid_String, LatinoTables.STR_global, LatinoTables.STR_ir, LatinoTables.STR_nulo, LatinoTables.STR_clase, LatinoTables.STR_constructor, LatinoTables.STR_hereda, LatinoTables.STR_super, LatinoTables.STR_mi, LatinoTables.STR_estatico, LatinoTables.STR_nueva);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			LatinoTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of LatinoTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Asignacion = new EcoreExecutorType(LatinoPackage.Literals.ASIGNACION, PACKAGE, 0);
		public static final EcoreExecutorType _AsignacionIndice = new EcoreExecutorType(LatinoPackage.Literals.ASIGNACION_INDICE, PACKAGE, 0);
		public static final EcoreExecutorType _Caso = new EcoreExecutorType(LatinoPackage.Literals.CASO, PACKAGE, 0);
		public static final EcoreExecutorType _Ciclo = new EcoreExecutorType(LatinoPackage.Literals.CICLO, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _CicloCondicion = new EcoreExecutorType(LatinoPackage.Literals.CICLO_CONDICION, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Condicional = new EcoreExecutorType(LatinoPackage.Literals.CONDICIONAL, PACKAGE, 0);
		public static final EcoreExecutorType _Continuar = new EcoreExecutorType(LatinoPackage.Literals.CONTINUAR, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _Conversion = new EcoreExecutorEnumeration(LatinoPackage.Literals.CONVERSION, PACKAGE, 0);
		public static final EcoreExecutorType _Definicion = new EcoreExecutorType(LatinoPackage.Literals.DEFINICION, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Desde = new EcoreExecutorType(LatinoPackage.Literals.DESDE, PACKAGE, 0);
		public static final EcoreExecutorType _Elegir = new EcoreExecutorType(LatinoPackage.Literals.ELEGIR, PACKAGE, 0);
		public static final EcoreExecutorType _Elemento = new EcoreExecutorType(LatinoPackage.Literals.ELEMENTO, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Funcion = new EcoreExecutorType(LatinoPackage.Literals.FUNCION, PACKAGE, 0);
		public static final EcoreExecutorType _Imprimir = new EcoreExecutorType(LatinoPackage.Literals.IMPRIMIR, PACKAGE, 0);
		public static final EcoreExecutorType _Incremento = new EcoreExecutorType(LatinoPackage.Literals.INCREMENTO, PACKAGE, 0);
		public static final EcoreExecutorType _Leer = new EcoreExecutorType(LatinoPackage.Literals.LEER, PACKAGE, 0);
		public static final EcoreExecutorType _Lista = new EcoreExecutorType(LatinoPackage.Literals.LISTA, PACKAGE, 0);
		public static final EcoreExecutorType _Llamada = new EcoreExecutorType(LatinoPackage.Literals.LLAMADA, PACKAGE, 0);
		public static final EcoreExecutorType _Mientras = new EcoreExecutorType(LatinoPackage.Literals.MIENTRAS, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _OperadorPaso = new EcoreExecutorEnumeration(LatinoPackage.Literals.OPERADOR_PASO, PACKAGE, 0);
		public static final EcoreExecutorType _Osi = new EcoreExecutorType(LatinoPackage.Literals.OSI, PACKAGE, 0);
		public static final EcoreExecutorType _Para = new EcoreExecutorType(LatinoPackage.Literals.PARA, PACKAGE, 0);
		public static final EcoreExecutorType _Programa = new EcoreExecutorType(LatinoPackage.Literals.PROGRAMA, PACKAGE, 0);
		public static final EcoreExecutorType _Repetir = new EcoreExecutorType(LatinoPackage.Literals.REPETIR, PACKAGE, 0);
		public static final EcoreExecutorType _Retorno = new EcoreExecutorType(LatinoPackage.Literals.RETORNO, PACKAGE, 0);
		public static final EcoreExecutorType _Romper = new EcoreExecutorType(LatinoPackage.Literals.ROMPER, PACKAGE, 0);
		public static final EcoreExecutorType _Salto = new EcoreExecutorType(LatinoPackage.Literals.SALTO, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Sentencia = new EcoreExecutorType(LatinoPackage.Literals.SENTENCIA, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final EcoreExecutorType _Variable = new EcoreExecutorType(LatinoPackage.Literals.VARIABLE, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Asignacion,
			_AsignacionIndice,
			_Caso,
			_Ciclo,
			_CicloCondicion,
			_Condicional,
			_Continuar,
			_Conversion,
			_Definicion,
			_Desde,
			_Elegir,
			_Elemento,
			_Funcion,
			_Imprimir,
			_Incremento,
			_Leer,
			_Lista,
			_Llamada,
			_Mientras,
			_OperadorPaso,
			_Osi,
			_Para,
			_Programa,
			_Repetir,
			_Retorno,
			_Romper,
			_Salto,
			_Sentencia,
			_Variable
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of LatinoTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Asignacion__Asignacion = new ExecutorFragment(Types._Asignacion, LatinoTables.Types._Asignacion);
		private static final ExecutorFragment _Asignacion__Definicion = new ExecutorFragment(Types._Asignacion, LatinoTables.Types._Definicion);
		private static final ExecutorFragment _Asignacion__Elemento = new ExecutorFragment(Types._Asignacion, LatinoTables.Types._Elemento);
		private static final ExecutorFragment _Asignacion__OclAny = new ExecutorFragment(Types._Asignacion, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Asignacion__OclElement = new ExecutorFragment(Types._Asignacion, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Asignacion__Sentencia = new ExecutorFragment(Types._Asignacion, LatinoTables.Types._Sentencia);

		private static final ExecutorFragment _AsignacionIndice__AsignacionIndice = new ExecutorFragment(Types._AsignacionIndice, LatinoTables.Types._AsignacionIndice);
		private static final ExecutorFragment _AsignacionIndice__Elemento = new ExecutorFragment(Types._AsignacionIndice, LatinoTables.Types._Elemento);
		private static final ExecutorFragment _AsignacionIndice__OclAny = new ExecutorFragment(Types._AsignacionIndice, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _AsignacionIndice__OclElement = new ExecutorFragment(Types._AsignacionIndice, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _AsignacionIndice__Sentencia = new ExecutorFragment(Types._AsignacionIndice, LatinoTables.Types._Sentencia);

		private static final ExecutorFragment _Caso__Caso = new ExecutorFragment(Types._Caso, LatinoTables.Types._Caso);
		private static final ExecutorFragment _Caso__Elemento = new ExecutorFragment(Types._Caso, LatinoTables.Types._Elemento);
		private static final ExecutorFragment _Caso__OclAny = new ExecutorFragment(Types._Caso, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Caso__OclElement = new ExecutorFragment(Types._Caso, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Ciclo__Ciclo = new ExecutorFragment(Types._Ciclo, LatinoTables.Types._Ciclo);
		private static final ExecutorFragment _Ciclo__Elemento = new ExecutorFragment(Types._Ciclo, LatinoTables.Types._Elemento);
		private static final ExecutorFragment _Ciclo__OclAny = new ExecutorFragment(Types._Ciclo, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Ciclo__OclElement = new ExecutorFragment(Types._Ciclo, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Ciclo__Sentencia = new ExecutorFragment(Types._Ciclo, LatinoTables.Types._Sentencia);

		private static final ExecutorFragment _CicloCondicion__Ciclo = new ExecutorFragment(Types._CicloCondicion, LatinoTables.Types._Ciclo);
		private static final ExecutorFragment _CicloCondicion__CicloCondicion = new ExecutorFragment(Types._CicloCondicion, LatinoTables.Types._CicloCondicion);
		private static final ExecutorFragment _CicloCondicion__Elemento = new ExecutorFragment(Types._CicloCondicion, LatinoTables.Types._Elemento);
		private static final ExecutorFragment _CicloCondicion__OclAny = new ExecutorFragment(Types._CicloCondicion, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CicloCondicion__OclElement = new ExecutorFragment(Types._CicloCondicion, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _CicloCondicion__Sentencia = new ExecutorFragment(Types._CicloCondicion, LatinoTables.Types._Sentencia);

		private static final ExecutorFragment _Condicional__Condicional = new ExecutorFragment(Types._Condicional, LatinoTables.Types._Condicional);
		private static final ExecutorFragment _Condicional__Elemento = new ExecutorFragment(Types._Condicional, LatinoTables.Types._Elemento);
		private static final ExecutorFragment _Condicional__OclAny = new ExecutorFragment(Types._Condicional, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Condicional__OclElement = new ExecutorFragment(Types._Condicional, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Condicional__Sentencia = new ExecutorFragment(Types._Condicional, LatinoTables.Types._Sentencia);

		private static final ExecutorFragment _Continuar__Continuar = new ExecutorFragment(Types._Continuar, LatinoTables.Types._Continuar);
		private static final ExecutorFragment _Continuar__Elemento = new ExecutorFragment(Types._Continuar, LatinoTables.Types._Elemento);
		private static final ExecutorFragment _Continuar__OclAny = new ExecutorFragment(Types._Continuar, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Continuar__OclElement = new ExecutorFragment(Types._Continuar, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Continuar__Salto = new ExecutorFragment(Types._Continuar, LatinoTables.Types._Salto);
		private static final ExecutorFragment _Continuar__Sentencia = new ExecutorFragment(Types._Continuar, LatinoTables.Types._Sentencia);

		private static final ExecutorFragment _Conversion__Conversion = new ExecutorFragment(Types._Conversion, LatinoTables.Types._Conversion);
		private static final ExecutorFragment _Conversion__OclAny = new ExecutorFragment(Types._Conversion, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Conversion__OclElement = new ExecutorFragment(Types._Conversion, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Conversion__OclEnumeration = new ExecutorFragment(Types._Conversion, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _Conversion__OclType = new ExecutorFragment(Types._Conversion, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _Definicion__Definicion = new ExecutorFragment(Types._Definicion, LatinoTables.Types._Definicion);
		private static final ExecutorFragment _Definicion__Elemento = new ExecutorFragment(Types._Definicion, LatinoTables.Types._Elemento);
		private static final ExecutorFragment _Definicion__OclAny = new ExecutorFragment(Types._Definicion, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Definicion__OclElement = new ExecutorFragment(Types._Definicion, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Definicion__Sentencia = new ExecutorFragment(Types._Definicion, LatinoTables.Types._Sentencia);

		private static final ExecutorFragment _Desde__Ciclo = new ExecutorFragment(Types._Desde, LatinoTables.Types._Ciclo);
		private static final ExecutorFragment _Desde__CicloCondicion = new ExecutorFragment(Types._Desde, LatinoTables.Types._CicloCondicion);
		private static final ExecutorFragment _Desde__Desde = new ExecutorFragment(Types._Desde, LatinoTables.Types._Desde);
		private static final ExecutorFragment _Desde__Elemento = new ExecutorFragment(Types._Desde, LatinoTables.Types._Elemento);
		private static final ExecutorFragment _Desde__OclAny = new ExecutorFragment(Types._Desde, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Desde__OclElement = new ExecutorFragment(Types._Desde, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Desde__Sentencia = new ExecutorFragment(Types._Desde, LatinoTables.Types._Sentencia);

		private static final ExecutorFragment _Elegir__Elegir = new ExecutorFragment(Types._Elegir, LatinoTables.Types._Elegir);
		private static final ExecutorFragment _Elegir__Elemento = new ExecutorFragment(Types._Elegir, LatinoTables.Types._Elemento);
		private static final ExecutorFragment _Elegir__OclAny = new ExecutorFragment(Types._Elegir, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Elegir__OclElement = new ExecutorFragment(Types._Elegir, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Elegir__Sentencia = new ExecutorFragment(Types._Elegir, LatinoTables.Types._Sentencia);

		private static final ExecutorFragment _Elemento__Elemento = new ExecutorFragment(Types._Elemento, LatinoTables.Types._Elemento);
		private static final ExecutorFragment _Elemento__OclAny = new ExecutorFragment(Types._Elemento, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Elemento__OclElement = new ExecutorFragment(Types._Elemento, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Funcion__Definicion = new ExecutorFragment(Types._Funcion, LatinoTables.Types._Definicion);
		private static final ExecutorFragment _Funcion__Elemento = new ExecutorFragment(Types._Funcion, LatinoTables.Types._Elemento);
		private static final ExecutorFragment _Funcion__Funcion = new ExecutorFragment(Types._Funcion, LatinoTables.Types._Funcion);
		private static final ExecutorFragment _Funcion__OclAny = new ExecutorFragment(Types._Funcion, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Funcion__OclElement = new ExecutorFragment(Types._Funcion, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Funcion__Sentencia = new ExecutorFragment(Types._Funcion, LatinoTables.Types._Sentencia);

		private static final ExecutorFragment _Imprimir__Elemento = new ExecutorFragment(Types._Imprimir, LatinoTables.Types._Elemento);
		private static final ExecutorFragment _Imprimir__Imprimir = new ExecutorFragment(Types._Imprimir, LatinoTables.Types._Imprimir);
		private static final ExecutorFragment _Imprimir__OclAny = new ExecutorFragment(Types._Imprimir, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Imprimir__OclElement = new ExecutorFragment(Types._Imprimir, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Imprimir__Sentencia = new ExecutorFragment(Types._Imprimir, LatinoTables.Types._Sentencia);

		private static final ExecutorFragment _Incremento__Elemento = new ExecutorFragment(Types._Incremento, LatinoTables.Types._Elemento);
		private static final ExecutorFragment _Incremento__Incremento = new ExecutorFragment(Types._Incremento, LatinoTables.Types._Incremento);
		private static final ExecutorFragment _Incremento__OclAny = new ExecutorFragment(Types._Incremento, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Incremento__OclElement = new ExecutorFragment(Types._Incremento, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Incremento__Sentencia = new ExecutorFragment(Types._Incremento, LatinoTables.Types._Sentencia);

		private static final ExecutorFragment _Leer__Definicion = new ExecutorFragment(Types._Leer, LatinoTables.Types._Definicion);
		private static final ExecutorFragment _Leer__Elemento = new ExecutorFragment(Types._Leer, LatinoTables.Types._Elemento);
		private static final ExecutorFragment _Leer__Leer = new ExecutorFragment(Types._Leer, LatinoTables.Types._Leer);
		private static final ExecutorFragment _Leer__OclAny = new ExecutorFragment(Types._Leer, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Leer__OclElement = new ExecutorFragment(Types._Leer, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Leer__Sentencia = new ExecutorFragment(Types._Leer, LatinoTables.Types._Sentencia);

		private static final ExecutorFragment _Lista__Definicion = new ExecutorFragment(Types._Lista, LatinoTables.Types._Definicion);
		private static final ExecutorFragment _Lista__Elemento = new ExecutorFragment(Types._Lista, LatinoTables.Types._Elemento);
		private static final ExecutorFragment _Lista__Lista = new ExecutorFragment(Types._Lista, LatinoTables.Types._Lista);
		private static final ExecutorFragment _Lista__OclAny = new ExecutorFragment(Types._Lista, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Lista__OclElement = new ExecutorFragment(Types._Lista, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Lista__Sentencia = new ExecutorFragment(Types._Lista, LatinoTables.Types._Sentencia);

		private static final ExecutorFragment _Llamada__Elemento = new ExecutorFragment(Types._Llamada, LatinoTables.Types._Elemento);
		private static final ExecutorFragment _Llamada__Llamada = new ExecutorFragment(Types._Llamada, LatinoTables.Types._Llamada);
		private static final ExecutorFragment _Llamada__OclAny = new ExecutorFragment(Types._Llamada, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Llamada__OclElement = new ExecutorFragment(Types._Llamada, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Llamada__Sentencia = new ExecutorFragment(Types._Llamada, LatinoTables.Types._Sentencia);

		private static final ExecutorFragment _Mientras__Ciclo = new ExecutorFragment(Types._Mientras, LatinoTables.Types._Ciclo);
		private static final ExecutorFragment _Mientras__CicloCondicion = new ExecutorFragment(Types._Mientras, LatinoTables.Types._CicloCondicion);
		private static final ExecutorFragment _Mientras__Elemento = new ExecutorFragment(Types._Mientras, LatinoTables.Types._Elemento);
		private static final ExecutorFragment _Mientras__Mientras = new ExecutorFragment(Types._Mientras, LatinoTables.Types._Mientras);
		private static final ExecutorFragment _Mientras__OclAny = new ExecutorFragment(Types._Mientras, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Mientras__OclElement = new ExecutorFragment(Types._Mientras, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Mientras__Sentencia = new ExecutorFragment(Types._Mientras, LatinoTables.Types._Sentencia);

		private static final ExecutorFragment _OperadorPaso__OclAny = new ExecutorFragment(Types._OperadorPaso, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _OperadorPaso__OclElement = new ExecutorFragment(Types._OperadorPaso, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _OperadorPaso__OclEnumeration = new ExecutorFragment(Types._OperadorPaso, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _OperadorPaso__OclType = new ExecutorFragment(Types._OperadorPaso, OCLstdlibTables.Types._OclType);
		private static final ExecutorFragment _OperadorPaso__OperadorPaso = new ExecutorFragment(Types._OperadorPaso, LatinoTables.Types._OperadorPaso);

		private static final ExecutorFragment _Osi__Elemento = new ExecutorFragment(Types._Osi, LatinoTables.Types._Elemento);
		private static final ExecutorFragment _Osi__OclAny = new ExecutorFragment(Types._Osi, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Osi__OclElement = new ExecutorFragment(Types._Osi, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Osi__Osi = new ExecutorFragment(Types._Osi, LatinoTables.Types._Osi);

		private static final ExecutorFragment _Para__Ciclo = new ExecutorFragment(Types._Para, LatinoTables.Types._Ciclo);
		private static final ExecutorFragment _Para__Elemento = new ExecutorFragment(Types._Para, LatinoTables.Types._Elemento);
		private static final ExecutorFragment _Para__OclAny = new ExecutorFragment(Types._Para, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Para__OclElement = new ExecutorFragment(Types._Para, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Para__Para = new ExecutorFragment(Types._Para, LatinoTables.Types._Para);
		private static final ExecutorFragment _Para__Sentencia = new ExecutorFragment(Types._Para, LatinoTables.Types._Sentencia);

		private static final ExecutorFragment _Programa__OclAny = new ExecutorFragment(Types._Programa, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Programa__OclElement = new ExecutorFragment(Types._Programa, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Programa__Programa = new ExecutorFragment(Types._Programa, LatinoTables.Types._Programa);

		private static final ExecutorFragment _Repetir__Ciclo = new ExecutorFragment(Types._Repetir, LatinoTables.Types._Ciclo);
		private static final ExecutorFragment _Repetir__CicloCondicion = new ExecutorFragment(Types._Repetir, LatinoTables.Types._CicloCondicion);
		private static final ExecutorFragment _Repetir__Elemento = new ExecutorFragment(Types._Repetir, LatinoTables.Types._Elemento);
		private static final ExecutorFragment _Repetir__OclAny = new ExecutorFragment(Types._Repetir, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Repetir__OclElement = new ExecutorFragment(Types._Repetir, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Repetir__Repetir = new ExecutorFragment(Types._Repetir, LatinoTables.Types._Repetir);
		private static final ExecutorFragment _Repetir__Sentencia = new ExecutorFragment(Types._Repetir, LatinoTables.Types._Sentencia);

		private static final ExecutorFragment _Retorno__Elemento = new ExecutorFragment(Types._Retorno, LatinoTables.Types._Elemento);
		private static final ExecutorFragment _Retorno__OclAny = new ExecutorFragment(Types._Retorno, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Retorno__OclElement = new ExecutorFragment(Types._Retorno, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Retorno__Retorno = new ExecutorFragment(Types._Retorno, LatinoTables.Types._Retorno);
		private static final ExecutorFragment _Retorno__Sentencia = new ExecutorFragment(Types._Retorno, LatinoTables.Types._Sentencia);

		private static final ExecutorFragment _Romper__Elemento = new ExecutorFragment(Types._Romper, LatinoTables.Types._Elemento);
		private static final ExecutorFragment _Romper__OclAny = new ExecutorFragment(Types._Romper, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Romper__OclElement = new ExecutorFragment(Types._Romper, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Romper__Romper = new ExecutorFragment(Types._Romper, LatinoTables.Types._Romper);
		private static final ExecutorFragment _Romper__Salto = new ExecutorFragment(Types._Romper, LatinoTables.Types._Salto);
		private static final ExecutorFragment _Romper__Sentencia = new ExecutorFragment(Types._Romper, LatinoTables.Types._Sentencia);

		private static final ExecutorFragment _Salto__Elemento = new ExecutorFragment(Types._Salto, LatinoTables.Types._Elemento);
		private static final ExecutorFragment _Salto__OclAny = new ExecutorFragment(Types._Salto, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Salto__OclElement = new ExecutorFragment(Types._Salto, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Salto__Salto = new ExecutorFragment(Types._Salto, LatinoTables.Types._Salto);
		private static final ExecutorFragment _Salto__Sentencia = new ExecutorFragment(Types._Salto, LatinoTables.Types._Sentencia);

		private static final ExecutorFragment _Sentencia__Elemento = new ExecutorFragment(Types._Sentencia, LatinoTables.Types._Elemento);
		private static final ExecutorFragment _Sentencia__OclAny = new ExecutorFragment(Types._Sentencia, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Sentencia__OclElement = new ExecutorFragment(Types._Sentencia, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Sentencia__Sentencia = new ExecutorFragment(Types._Sentencia, LatinoTables.Types._Sentencia);

		private static final ExecutorFragment _Variable__Elemento = new ExecutorFragment(Types._Variable, LatinoTables.Types._Elemento);
		private static final ExecutorFragment _Variable__OclAny = new ExecutorFragment(Types._Variable, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Variable__OclElement = new ExecutorFragment(Types._Variable, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Variable__Variable = new ExecutorFragment(Types._Variable, LatinoTables.Types._Variable);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of LatinoTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		public static final ParameterTypes _String = TypeUtil.createParameterTypes(OCLstdlibTables.Types._String);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of LatinoTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		public static final ExecutorOperation _Elemento__esReservadaGo = new ExecutorOperation("esReservadaGo", Parameters._String, Types._Elemento,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _Elemento__esReservadaLatino = new ExecutorOperation("esReservadaLatino", Parameters._String, Types._Elemento,
			1, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _Elemento__operandosNumericos = new ExecutorOperation("operandosNumericos", Parameters._String, Types._Elemento,
			2, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _Elemento__programa = new ExecutorOperation("programa", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Elemento,
			3, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _Elemento__tipoTexto = new ExecutorOperation("tipoTexto", Parameters._String, Types._Elemento,
			4, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _Elemento__usaSoloVariablesDefinidas = new ExecutorOperation("usaSoloVariablesDefinidas", Parameters._String, Types._Elemento,
			5, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _Programa__defineVariable = new ExecutorOperation("defineVariable", Parameters._String, Types._Programa,
			0, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of LatinoTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Asignacion__valor = new EcoreExecutorProperty(LatinoPackage.Literals.ASIGNACION__VALOR, Types._Asignacion, 0);
		public static final ExecutorProperty _Asignacion__Desde__inicio = new ExecutorPropertyWithImplementation("Desde", Types._Asignacion, 1, new EcoreLibraryOppositeProperty(LatinoPackage.Literals.DESDE__INICIO));

		public static final ExecutorProperty _AsignacionIndice__indice = new EcoreExecutorProperty(LatinoPackage.Literals.ASIGNACION_INDICE__INDICE, Types._AsignacionIndice, 0);
		public static final ExecutorProperty _AsignacionIndice__lista = new EcoreExecutorProperty(LatinoPackage.Literals.ASIGNACION_INDICE__LISTA, Types._AsignacionIndice, 1);
		public static final ExecutorProperty _AsignacionIndice__valor = new EcoreExecutorProperty(LatinoPackage.Literals.ASIGNACION_INDICE__VALOR, Types._AsignacionIndice, 2);

		public static final ExecutorProperty _Caso__sentencias = new EcoreExecutorProperty(LatinoPackage.Literals.CASO__SENTENCIAS, Types._Caso, 0);
		public static final ExecutorProperty _Caso__valores = new EcoreExecutorProperty(LatinoPackage.Literals.CASO__VALORES, Types._Caso, 1);
		public static final ExecutorProperty _Caso__Elegir__casos = new ExecutorPropertyWithImplementation("Elegir", Types._Caso, 2, new EcoreLibraryOppositeProperty(LatinoPackage.Literals.ELEGIR__CASOS));

		public static final ExecutorProperty _Ciclo__cuerpo = new EcoreExecutorProperty(LatinoPackage.Literals.CICLO__CUERPO, Types._Ciclo, 0);

		public static final ExecutorProperty _CicloCondicion__condicion = new EcoreExecutorProperty(LatinoPackage.Literals.CICLO_CONDICION__CONDICION, Types._CicloCondicion, 0);

		public static final ExecutorProperty _Condicional__condicion = new EcoreExecutorProperty(LatinoPackage.Literals.CONDICIONAL__CONDICION, Types._Condicional, 0);
		public static final ExecutorProperty _Condicional__entonces = new EcoreExecutorProperty(LatinoPackage.Literals.CONDICIONAL__ENTONCES, Types._Condicional, 1);
		public static final ExecutorProperty _Condicional__osis = new EcoreExecutorProperty(LatinoPackage.Literals.CONDICIONAL__OSIS, Types._Condicional, 2);
		public static final ExecutorProperty _Condicional__sino = new EcoreExecutorProperty(LatinoPackage.Literals.CONDICIONAL__SINO, Types._Condicional, 3);

		public static final ExecutorProperty _Definicion__nombre = new EcoreExecutorProperty(LatinoPackage.Literals.DEFINICION__NOMBRE, Types._Definicion, 0);

		public static final ExecutorProperty _Desde__inicio = new EcoreExecutorProperty(LatinoPackage.Literals.DESDE__INICIO, Types._Desde, 0);
		public static final ExecutorProperty _Desde__paso = new EcoreExecutorProperty(LatinoPackage.Literals.DESDE__PASO, Types._Desde, 1);

		public static final ExecutorProperty _Elegir__casos = new EcoreExecutorProperty(LatinoPackage.Literals.ELEGIR__CASOS, Types._Elegir, 0);
		public static final ExecutorProperty _Elegir__defecto = new EcoreExecutorProperty(LatinoPackage.Literals.ELEGIR__DEFECTO, Types._Elegir, 1);
		public static final ExecutorProperty _Elegir__expresion = new EcoreExecutorProperty(LatinoPackage.Literals.ELEGIR__EXPRESION, Types._Elegir, 2);

		public static final ExecutorProperty _Funcion__cuerpo = new EcoreExecutorProperty(LatinoPackage.Literals.FUNCION__CUERPO, Types._Funcion, 0);
		public static final ExecutorProperty _Funcion__parametros = new EcoreExecutorProperty(LatinoPackage.Literals.FUNCION__PARAMETROS, Types._Funcion, 1);

		public static final ExecutorProperty _Imprimir__mensaje = new EcoreExecutorProperty(LatinoPackage.Literals.IMPRIMIR__MENSAJE, Types._Imprimir, 0);

		public static final ExecutorProperty _Incremento__nombre = new EcoreExecutorProperty(LatinoPackage.Literals.INCREMENTO__NOMBRE, Types._Incremento, 0);
		public static final ExecutorProperty _Incremento__operador = new EcoreExecutorProperty(LatinoPackage.Literals.INCREMENTO__OPERADOR, Types._Incremento, 1);

		public static final ExecutorProperty _Leer__conversion = new EcoreExecutorProperty(LatinoPackage.Literals.LEER__CONVERSION, Types._Leer, 0);

		public static final ExecutorProperty _Lista__elementos = new EcoreExecutorProperty(LatinoPackage.Literals.LISTA__ELEMENTOS, Types._Lista, 0);

		public static final ExecutorProperty _Llamada__argumentos = new EcoreExecutorProperty(LatinoPackage.Literals.LLAMADA__ARGUMENTOS, Types._Llamada, 0);
		public static final ExecutorProperty _Llamada__funcion = new EcoreExecutorProperty(LatinoPackage.Literals.LLAMADA__FUNCION, Types._Llamada, 1);

		public static final ExecutorProperty _Osi__condicion = new EcoreExecutorProperty(LatinoPackage.Literals.OSI__CONDICION, Types._Osi, 0);
		public static final ExecutorProperty _Osi__sentencias = new EcoreExecutorProperty(LatinoPackage.Literals.OSI__SENTENCIAS, Types._Osi, 1);
		public static final ExecutorProperty _Osi__Condicional__osis = new ExecutorPropertyWithImplementation("Condicional", Types._Osi, 2, new EcoreLibraryOppositeProperty(LatinoPackage.Literals.CONDICIONAL__OSIS));

		public static final ExecutorProperty _Para__limites = new EcoreExecutorProperty(LatinoPackage.Literals.PARA__LIMITES, Types._Para, 0);
		public static final ExecutorProperty _Para__variable = new EcoreExecutorProperty(LatinoPackage.Literals.PARA__VARIABLE, Types._Para, 1);

		public static final ExecutorProperty _Programa__sentencias = new EcoreExecutorProperty(LatinoPackage.Literals.PROGRAMA__SENTENCIAS, Types._Programa, 0);

		public static final ExecutorProperty _Retorno__valor = new EcoreExecutorProperty(LatinoPackage.Literals.RETORNO__VALOR, Types._Retorno, 0);

		public static final ExecutorProperty _Sentencia__Caso__sentencias = new ExecutorPropertyWithImplementation("Caso", Types._Sentencia, 0, new EcoreLibraryOppositeProperty(LatinoPackage.Literals.CASO__SENTENCIAS));
		public static final ExecutorProperty _Sentencia__Ciclo__cuerpo = new ExecutorPropertyWithImplementation("Ciclo", Types._Sentencia, 1, new EcoreLibraryOppositeProperty(LatinoPackage.Literals.CICLO__CUERPO));
		public static final ExecutorProperty _Sentencia__Condicional__entonces = new ExecutorPropertyWithImplementation("Condicional", Types._Sentencia, 2, new EcoreLibraryOppositeProperty(LatinoPackage.Literals.CONDICIONAL__ENTONCES));
		public static final ExecutorProperty _Sentencia__Condicional__sino = new ExecutorPropertyWithImplementation("Condicional", Types._Sentencia, 3, new EcoreLibraryOppositeProperty(LatinoPackage.Literals.CONDICIONAL__SINO));
		public static final ExecutorProperty _Sentencia__Desde__paso = new ExecutorPropertyWithImplementation("Desde", Types._Sentencia, 4, new EcoreLibraryOppositeProperty(LatinoPackage.Literals.DESDE__PASO));
		public static final ExecutorProperty _Sentencia__Elegir__defecto = new ExecutorPropertyWithImplementation("Elegir", Types._Sentencia, 5, new EcoreLibraryOppositeProperty(LatinoPackage.Literals.ELEGIR__DEFECTO));
		public static final ExecutorProperty _Sentencia__Funcion__cuerpo = new ExecutorPropertyWithImplementation("Funcion", Types._Sentencia, 6, new EcoreLibraryOppositeProperty(LatinoPackage.Literals.FUNCION__CUERPO));
		public static final ExecutorProperty _Sentencia__Osi__sentencias = new ExecutorPropertyWithImplementation("Osi", Types._Sentencia, 7, new EcoreLibraryOppositeProperty(LatinoPackage.Literals.OSI__SENTENCIAS));
		public static final ExecutorProperty _Sentencia__Programa__sentencias = new ExecutorPropertyWithImplementation("Programa", Types._Sentencia, 8, new EcoreLibraryOppositeProperty(LatinoPackage.Literals.PROGRAMA__SENTENCIAS));

		public static final ExecutorProperty _Variable__nombre = new EcoreExecutorProperty(LatinoPackage.Literals.VARIABLE__NOMBRE, Types._Variable, 0);
		public static final ExecutorProperty _Variable__Funcion__parametros = new ExecutorPropertyWithImplementation("Funcion", Types._Variable, 1, new EcoreLibraryOppositeProperty(LatinoPackage.Literals.FUNCION__PARAMETROS));
		public static final ExecutorProperty _Variable__Para__variable = new ExecutorPropertyWithImplementation("Para", Types._Variable, 2, new EcoreLibraryOppositeProperty(LatinoPackage.Literals.PARA__VARIABLE));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of LatinoTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Asignacion =
			{
				Fragments._Asignacion__OclAny /* 0 */,
				Fragments._Asignacion__OclElement /* 1 */,
				Fragments._Asignacion__Elemento /* 2 */,
				Fragments._Asignacion__Sentencia /* 3 */,
				Fragments._Asignacion__Definicion /* 4 */,
				Fragments._Asignacion__Asignacion /* 5 */
			};
		private static final int /*@NonNull*/ [] __Asignacion = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _AsignacionIndice =
			{
				Fragments._AsignacionIndice__OclAny /* 0 */,
				Fragments._AsignacionIndice__OclElement /* 1 */,
				Fragments._AsignacionIndice__Elemento /* 2 */,
				Fragments._AsignacionIndice__Sentencia /* 3 */,
				Fragments._AsignacionIndice__AsignacionIndice /* 4 */
			};
		private static final int /*@NonNull*/ [] __AsignacionIndice = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Caso =
			{
				Fragments._Caso__OclAny /* 0 */,
				Fragments._Caso__OclElement /* 1 */,
				Fragments._Caso__Elemento /* 2 */,
				Fragments._Caso__Caso /* 3 */
			};
		private static final int /*@NonNull*/ [] __Caso = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Ciclo =
			{
				Fragments._Ciclo__OclAny /* 0 */,
				Fragments._Ciclo__OclElement /* 1 */,
				Fragments._Ciclo__Elemento /* 2 */,
				Fragments._Ciclo__Sentencia /* 3 */,
				Fragments._Ciclo__Ciclo /* 4 */
			};
		private static final int /*@NonNull*/ [] __Ciclo = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CicloCondicion =
			{
				Fragments._CicloCondicion__OclAny /* 0 */,
				Fragments._CicloCondicion__OclElement /* 1 */,
				Fragments._CicloCondicion__Elemento /* 2 */,
				Fragments._CicloCondicion__Sentencia /* 3 */,
				Fragments._CicloCondicion__Ciclo /* 4 */,
				Fragments._CicloCondicion__CicloCondicion /* 5 */
			};
		private static final int /*@NonNull*/ [] __CicloCondicion = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Condicional =
			{
				Fragments._Condicional__OclAny /* 0 */,
				Fragments._Condicional__OclElement /* 1 */,
				Fragments._Condicional__Elemento /* 2 */,
				Fragments._Condicional__Sentencia /* 3 */,
				Fragments._Condicional__Condicional /* 4 */
			};
		private static final int /*@NonNull*/ [] __Condicional = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Continuar =
			{
				Fragments._Continuar__OclAny /* 0 */,
				Fragments._Continuar__OclElement /* 1 */,
				Fragments._Continuar__Elemento /* 2 */,
				Fragments._Continuar__Sentencia /* 3 */,
				Fragments._Continuar__Salto /* 4 */,
				Fragments._Continuar__Continuar /* 5 */
			};
		private static final int /*@NonNull*/ [] __Continuar = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Conversion =
			{
				Fragments._Conversion__OclAny /* 0 */,
				Fragments._Conversion__OclElement /* 1 */,
				Fragments._Conversion__OclType /* 2 */,
				Fragments._Conversion__OclEnumeration /* 3 */,
				Fragments._Conversion__Conversion /* 4 */
			};
		private static final int /*@NonNull*/ [] __Conversion = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Definicion =
			{
				Fragments._Definicion__OclAny /* 0 */,
				Fragments._Definicion__OclElement /* 1 */,
				Fragments._Definicion__Elemento /* 2 */,
				Fragments._Definicion__Sentencia /* 3 */,
				Fragments._Definicion__Definicion /* 4 */
			};
		private static final int /*@NonNull*/ [] __Definicion = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Desde =
			{
				Fragments._Desde__OclAny /* 0 */,
				Fragments._Desde__OclElement /* 1 */,
				Fragments._Desde__Elemento /* 2 */,
				Fragments._Desde__Sentencia /* 3 */,
				Fragments._Desde__Ciclo /* 4 */,
				Fragments._Desde__CicloCondicion /* 5 */,
				Fragments._Desde__Desde /* 6 */
			};
		private static final int /*@NonNull*/ [] __Desde = { 1,1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Elegir =
			{
				Fragments._Elegir__OclAny /* 0 */,
				Fragments._Elegir__OclElement /* 1 */,
				Fragments._Elegir__Elemento /* 2 */,
				Fragments._Elegir__Sentencia /* 3 */,
				Fragments._Elegir__Elegir /* 4 */
			};
		private static final int /*@NonNull*/ [] __Elegir = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Elemento =
			{
				Fragments._Elemento__OclAny /* 0 */,
				Fragments._Elemento__OclElement /* 1 */,
				Fragments._Elemento__Elemento /* 2 */
			};
		private static final int /*@NonNull*/ [] __Elemento = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Funcion =
			{
				Fragments._Funcion__OclAny /* 0 */,
				Fragments._Funcion__OclElement /* 1 */,
				Fragments._Funcion__Elemento /* 2 */,
				Fragments._Funcion__Sentencia /* 3 */,
				Fragments._Funcion__Definicion /* 4 */,
				Fragments._Funcion__Funcion /* 5 */
			};
		private static final int /*@NonNull*/ [] __Funcion = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Imprimir =
			{
				Fragments._Imprimir__OclAny /* 0 */,
				Fragments._Imprimir__OclElement /* 1 */,
				Fragments._Imprimir__Elemento /* 2 */,
				Fragments._Imprimir__Sentencia /* 3 */,
				Fragments._Imprimir__Imprimir /* 4 */
			};
		private static final int /*@NonNull*/ [] __Imprimir = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Incremento =
			{
				Fragments._Incremento__OclAny /* 0 */,
				Fragments._Incremento__OclElement /* 1 */,
				Fragments._Incremento__Elemento /* 2 */,
				Fragments._Incremento__Sentencia /* 3 */,
				Fragments._Incremento__Incremento /* 4 */
			};
		private static final int /*@NonNull*/ [] __Incremento = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Leer =
			{
				Fragments._Leer__OclAny /* 0 */,
				Fragments._Leer__OclElement /* 1 */,
				Fragments._Leer__Elemento /* 2 */,
				Fragments._Leer__Sentencia /* 3 */,
				Fragments._Leer__Definicion /* 4 */,
				Fragments._Leer__Leer /* 5 */
			};
		private static final int /*@NonNull*/ [] __Leer = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Lista =
			{
				Fragments._Lista__OclAny /* 0 */,
				Fragments._Lista__OclElement /* 1 */,
				Fragments._Lista__Elemento /* 2 */,
				Fragments._Lista__Sentencia /* 3 */,
				Fragments._Lista__Definicion /* 4 */,
				Fragments._Lista__Lista /* 5 */
			};
		private static final int /*@NonNull*/ [] __Lista = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Llamada =
			{
				Fragments._Llamada__OclAny /* 0 */,
				Fragments._Llamada__OclElement /* 1 */,
				Fragments._Llamada__Elemento /* 2 */,
				Fragments._Llamada__Sentencia /* 3 */,
				Fragments._Llamada__Llamada /* 4 */
			};
		private static final int /*@NonNull*/ [] __Llamada = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Mientras =
			{
				Fragments._Mientras__OclAny /* 0 */,
				Fragments._Mientras__OclElement /* 1 */,
				Fragments._Mientras__Elemento /* 2 */,
				Fragments._Mientras__Sentencia /* 3 */,
				Fragments._Mientras__Ciclo /* 4 */,
				Fragments._Mientras__CicloCondicion /* 5 */,
				Fragments._Mientras__Mientras /* 6 */
			};
		private static final int /*@NonNull*/ [] __Mientras = { 1,1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _OperadorPaso =
			{
				Fragments._OperadorPaso__OclAny /* 0 */,
				Fragments._OperadorPaso__OclElement /* 1 */,
				Fragments._OperadorPaso__OclType /* 2 */,
				Fragments._OperadorPaso__OclEnumeration /* 3 */,
				Fragments._OperadorPaso__OperadorPaso /* 4 */
			};
		private static final int /*@NonNull*/ [] __OperadorPaso = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Osi =
			{
				Fragments._Osi__OclAny /* 0 */,
				Fragments._Osi__OclElement /* 1 */,
				Fragments._Osi__Elemento /* 2 */,
				Fragments._Osi__Osi /* 3 */
			};
		private static final int /*@NonNull*/ [] __Osi = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Para =
			{
				Fragments._Para__OclAny /* 0 */,
				Fragments._Para__OclElement /* 1 */,
				Fragments._Para__Elemento /* 2 */,
				Fragments._Para__Sentencia /* 3 */,
				Fragments._Para__Ciclo /* 4 */,
				Fragments._Para__Para /* 5 */
			};
		private static final int /*@NonNull*/ [] __Para = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Programa =
			{
				Fragments._Programa__OclAny /* 0 */,
				Fragments._Programa__OclElement /* 1 */,
				Fragments._Programa__Programa /* 2 */
			};
		private static final int /*@NonNull*/ [] __Programa = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Repetir =
			{
				Fragments._Repetir__OclAny /* 0 */,
				Fragments._Repetir__OclElement /* 1 */,
				Fragments._Repetir__Elemento /* 2 */,
				Fragments._Repetir__Sentencia /* 3 */,
				Fragments._Repetir__Ciclo /* 4 */,
				Fragments._Repetir__CicloCondicion /* 5 */,
				Fragments._Repetir__Repetir /* 6 */
			};
		private static final int /*@NonNull*/ [] __Repetir = { 1,1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Retorno =
			{
				Fragments._Retorno__OclAny /* 0 */,
				Fragments._Retorno__OclElement /* 1 */,
				Fragments._Retorno__Elemento /* 2 */,
				Fragments._Retorno__Sentencia /* 3 */,
				Fragments._Retorno__Retorno /* 4 */
			};
		private static final int /*@NonNull*/ [] __Retorno = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Romper =
			{
				Fragments._Romper__OclAny /* 0 */,
				Fragments._Romper__OclElement /* 1 */,
				Fragments._Romper__Elemento /* 2 */,
				Fragments._Romper__Sentencia /* 3 */,
				Fragments._Romper__Salto /* 4 */,
				Fragments._Romper__Romper /* 5 */
			};
		private static final int /*@NonNull*/ [] __Romper = { 1,1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Salto =
			{
				Fragments._Salto__OclAny /* 0 */,
				Fragments._Salto__OclElement /* 1 */,
				Fragments._Salto__Elemento /* 2 */,
				Fragments._Salto__Sentencia /* 3 */,
				Fragments._Salto__Salto /* 4 */
			};
		private static final int /*@NonNull*/ [] __Salto = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Sentencia =
			{
				Fragments._Sentencia__OclAny /* 0 */,
				Fragments._Sentencia__OclElement /* 1 */,
				Fragments._Sentencia__Elemento /* 2 */,
				Fragments._Sentencia__Sentencia /* 3 */
			};
		private static final int /*@NonNull*/ [] __Sentencia = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Variable =
			{
				Fragments._Variable__OclAny /* 0 */,
				Fragments._Variable__OclElement /* 1 */,
				Fragments._Variable__Elemento /* 2 */,
				Fragments._Variable__Variable /* 3 */
			};
		private static final int /*@NonNull*/ [] __Variable = { 1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Asignacion.initFragments(_Asignacion, __Asignacion);
			Types._AsignacionIndice.initFragments(_AsignacionIndice, __AsignacionIndice);
			Types._Caso.initFragments(_Caso, __Caso);
			Types._Ciclo.initFragments(_Ciclo, __Ciclo);
			Types._CicloCondicion.initFragments(_CicloCondicion, __CicloCondicion);
			Types._Condicional.initFragments(_Condicional, __Condicional);
			Types._Continuar.initFragments(_Continuar, __Continuar);
			Types._Conversion.initFragments(_Conversion, __Conversion);
			Types._Definicion.initFragments(_Definicion, __Definicion);
			Types._Desde.initFragments(_Desde, __Desde);
			Types._Elegir.initFragments(_Elegir, __Elegir);
			Types._Elemento.initFragments(_Elemento, __Elemento);
			Types._Funcion.initFragments(_Funcion, __Funcion);
			Types._Imprimir.initFragments(_Imprimir, __Imprimir);
			Types._Incremento.initFragments(_Incremento, __Incremento);
			Types._Leer.initFragments(_Leer, __Leer);
			Types._Lista.initFragments(_Lista, __Lista);
			Types._Llamada.initFragments(_Llamada, __Llamada);
			Types._Mientras.initFragments(_Mientras, __Mientras);
			Types._OperadorPaso.initFragments(_OperadorPaso, __OperadorPaso);
			Types._Osi.initFragments(_Osi, __Osi);
			Types._Para.initFragments(_Para, __Para);
			Types._Programa.initFragments(_Programa, __Programa);
			Types._Repetir.initFragments(_Repetir, __Repetir);
			Types._Retorno.initFragments(_Retorno, __Retorno);
			Types._Romper.initFragments(_Romper, __Romper);
			Types._Salto.initFragments(_Salto, __Salto);
			Types._Sentencia.initFragments(_Sentencia, __Sentencia);
			Types._Variable.initFragments(_Variable, __Variable);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of LatinoTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Asignacion__Asignacion = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Asignacion__Definicion = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Asignacion__Elemento = {
			LatinoTables.Operations._Elemento__esReservadaGo /* esReservadaGo(String[?]) */,
			LatinoTables.Operations._Elemento__esReservadaLatino /* esReservadaLatino(String[?]) */,
			LatinoTables.Operations._Elemento__operandosNumericos /* operandosNumericos(String[?]) */,
			LatinoTables.Operations._Elemento__programa /* programa() */,
			LatinoTables.Operations._Elemento__tipoTexto /* tipoTexto(String[?]) */,
			LatinoTables.Operations._Elemento__usaSoloVariablesDefinidas /* usaSoloVariablesDefinidas(String[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Asignacion__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Asignacion__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Asignacion__Sentencia = {};

		private static final ExecutorOperation /*@NonNull*/ [] _AsignacionIndice__AsignacionIndice = {};
		private static final ExecutorOperation /*@NonNull*/ [] _AsignacionIndice__Elemento = {
			LatinoTables.Operations._Elemento__esReservadaGo /* esReservadaGo(String[?]) */,
			LatinoTables.Operations._Elemento__esReservadaLatino /* esReservadaLatino(String[?]) */,
			LatinoTables.Operations._Elemento__operandosNumericos /* operandosNumericos(String[?]) */,
			LatinoTables.Operations._Elemento__programa /* programa() */,
			LatinoTables.Operations._Elemento__tipoTexto /* tipoTexto(String[?]) */,
			LatinoTables.Operations._Elemento__usaSoloVariablesDefinidas /* usaSoloVariablesDefinidas(String[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AsignacionIndice__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AsignacionIndice__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _AsignacionIndice__Sentencia = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Caso__Caso = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Caso__Elemento = {
			LatinoTables.Operations._Elemento__esReservadaGo /* esReservadaGo(String[?]) */,
			LatinoTables.Operations._Elemento__esReservadaLatino /* esReservadaLatino(String[?]) */,
			LatinoTables.Operations._Elemento__operandosNumericos /* operandosNumericos(String[?]) */,
			LatinoTables.Operations._Elemento__programa /* programa() */,
			LatinoTables.Operations._Elemento__tipoTexto /* tipoTexto(String[?]) */,
			LatinoTables.Operations._Elemento__usaSoloVariablesDefinidas /* usaSoloVariablesDefinidas(String[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Caso__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Caso__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Ciclo__Ciclo = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Ciclo__Elemento = {
			LatinoTables.Operations._Elemento__esReservadaGo /* esReservadaGo(String[?]) */,
			LatinoTables.Operations._Elemento__esReservadaLatino /* esReservadaLatino(String[?]) */,
			LatinoTables.Operations._Elemento__operandosNumericos /* operandosNumericos(String[?]) */,
			LatinoTables.Operations._Elemento__programa /* programa() */,
			LatinoTables.Operations._Elemento__tipoTexto /* tipoTexto(String[?]) */,
			LatinoTables.Operations._Elemento__usaSoloVariablesDefinidas /* usaSoloVariablesDefinidas(String[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Ciclo__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Ciclo__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Ciclo__Sentencia = {};

		private static final ExecutorOperation /*@NonNull*/ [] _CicloCondicion__CicloCondicion = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CicloCondicion__Ciclo = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CicloCondicion__Elemento = {
			LatinoTables.Operations._Elemento__esReservadaGo /* esReservadaGo(String[?]) */,
			LatinoTables.Operations._Elemento__esReservadaLatino /* esReservadaLatino(String[?]) */,
			LatinoTables.Operations._Elemento__operandosNumericos /* operandosNumericos(String[?]) */,
			LatinoTables.Operations._Elemento__programa /* programa() */,
			LatinoTables.Operations._Elemento__tipoTexto /* tipoTexto(String[?]) */,
			LatinoTables.Operations._Elemento__usaSoloVariablesDefinidas /* usaSoloVariablesDefinidas(String[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CicloCondicion__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CicloCondicion__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CicloCondicion__Sentencia = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Condicional__Condicional = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Condicional__Elemento = {
			LatinoTables.Operations._Elemento__esReservadaGo /* esReservadaGo(String[?]) */,
			LatinoTables.Operations._Elemento__esReservadaLatino /* esReservadaLatino(String[?]) */,
			LatinoTables.Operations._Elemento__operandosNumericos /* operandosNumericos(String[?]) */,
			LatinoTables.Operations._Elemento__programa /* programa() */,
			LatinoTables.Operations._Elemento__tipoTexto /* tipoTexto(String[?]) */,
			LatinoTables.Operations._Elemento__usaSoloVariablesDefinidas /* usaSoloVariablesDefinidas(String[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Condicional__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Condicional__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Condicional__Sentencia = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Continuar__Continuar = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Continuar__Elemento = {
			LatinoTables.Operations._Elemento__esReservadaGo /* esReservadaGo(String[?]) */,
			LatinoTables.Operations._Elemento__esReservadaLatino /* esReservadaLatino(String[?]) */,
			LatinoTables.Operations._Elemento__operandosNumericos /* operandosNumericos(String[?]) */,
			LatinoTables.Operations._Elemento__programa /* programa() */,
			LatinoTables.Operations._Elemento__tipoTexto /* tipoTexto(String[?]) */,
			LatinoTables.Operations._Elemento__usaSoloVariablesDefinidas /* usaSoloVariablesDefinidas(String[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Continuar__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Continuar__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Continuar__Salto = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Continuar__Sentencia = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Conversion__Conversion = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Conversion__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Conversion__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Conversion__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Conversion__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Definicion__Definicion = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Definicion__Elemento = {
			LatinoTables.Operations._Elemento__esReservadaGo /* esReservadaGo(String[?]) */,
			LatinoTables.Operations._Elemento__esReservadaLatino /* esReservadaLatino(String[?]) */,
			LatinoTables.Operations._Elemento__operandosNumericos /* operandosNumericos(String[?]) */,
			LatinoTables.Operations._Elemento__programa /* programa() */,
			LatinoTables.Operations._Elemento__tipoTexto /* tipoTexto(String[?]) */,
			LatinoTables.Operations._Elemento__usaSoloVariablesDefinidas /* usaSoloVariablesDefinidas(String[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Definicion__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Definicion__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Definicion__Sentencia = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Desde__Desde = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Desde__Ciclo = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Desde__CicloCondicion = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Desde__Elemento = {
			LatinoTables.Operations._Elemento__esReservadaGo /* esReservadaGo(String[?]) */,
			LatinoTables.Operations._Elemento__esReservadaLatino /* esReservadaLatino(String[?]) */,
			LatinoTables.Operations._Elemento__operandosNumericos /* operandosNumericos(String[?]) */,
			LatinoTables.Operations._Elemento__programa /* programa() */,
			LatinoTables.Operations._Elemento__tipoTexto /* tipoTexto(String[?]) */,
			LatinoTables.Operations._Elemento__usaSoloVariablesDefinidas /* usaSoloVariablesDefinidas(String[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Desde__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Desde__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Desde__Sentencia = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Elegir__Elegir = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Elegir__Elemento = {
			LatinoTables.Operations._Elemento__esReservadaGo /* esReservadaGo(String[?]) */,
			LatinoTables.Operations._Elemento__esReservadaLatino /* esReservadaLatino(String[?]) */,
			LatinoTables.Operations._Elemento__operandosNumericos /* operandosNumericos(String[?]) */,
			LatinoTables.Operations._Elemento__programa /* programa() */,
			LatinoTables.Operations._Elemento__tipoTexto /* tipoTexto(String[?]) */,
			LatinoTables.Operations._Elemento__usaSoloVariablesDefinidas /* usaSoloVariablesDefinidas(String[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Elegir__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Elegir__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Elegir__Sentencia = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Elemento__Elemento = {
			LatinoTables.Operations._Elemento__esReservadaGo /* esReservadaGo(String[?]) */,
			LatinoTables.Operations._Elemento__esReservadaLatino /* esReservadaLatino(String[?]) */,
			LatinoTables.Operations._Elemento__operandosNumericos /* operandosNumericos(String[?]) */,
			LatinoTables.Operations._Elemento__programa /* programa() */,
			LatinoTables.Operations._Elemento__tipoTexto /* tipoTexto(String[?]) */,
			LatinoTables.Operations._Elemento__usaSoloVariablesDefinidas /* usaSoloVariablesDefinidas(String[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Elemento__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Elemento__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Funcion__Funcion = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Funcion__Definicion = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Funcion__Elemento = {
			LatinoTables.Operations._Elemento__esReservadaGo /* esReservadaGo(String[?]) */,
			LatinoTables.Operations._Elemento__esReservadaLatino /* esReservadaLatino(String[?]) */,
			LatinoTables.Operations._Elemento__operandosNumericos /* operandosNumericos(String[?]) */,
			LatinoTables.Operations._Elemento__programa /* programa() */,
			LatinoTables.Operations._Elemento__tipoTexto /* tipoTexto(String[?]) */,
			LatinoTables.Operations._Elemento__usaSoloVariablesDefinidas /* usaSoloVariablesDefinidas(String[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Funcion__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Funcion__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Funcion__Sentencia = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Imprimir__Imprimir = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Imprimir__Elemento = {
			LatinoTables.Operations._Elemento__esReservadaGo /* esReservadaGo(String[?]) */,
			LatinoTables.Operations._Elemento__esReservadaLatino /* esReservadaLatino(String[?]) */,
			LatinoTables.Operations._Elemento__operandosNumericos /* operandosNumericos(String[?]) */,
			LatinoTables.Operations._Elemento__programa /* programa() */,
			LatinoTables.Operations._Elemento__tipoTexto /* tipoTexto(String[?]) */,
			LatinoTables.Operations._Elemento__usaSoloVariablesDefinidas /* usaSoloVariablesDefinidas(String[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Imprimir__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Imprimir__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Imprimir__Sentencia = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Incremento__Incremento = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Incremento__Elemento = {
			LatinoTables.Operations._Elemento__esReservadaGo /* esReservadaGo(String[?]) */,
			LatinoTables.Operations._Elemento__esReservadaLatino /* esReservadaLatino(String[?]) */,
			LatinoTables.Operations._Elemento__operandosNumericos /* operandosNumericos(String[?]) */,
			LatinoTables.Operations._Elemento__programa /* programa() */,
			LatinoTables.Operations._Elemento__tipoTexto /* tipoTexto(String[?]) */,
			LatinoTables.Operations._Elemento__usaSoloVariablesDefinidas /* usaSoloVariablesDefinidas(String[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Incremento__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Incremento__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Incremento__Sentencia = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Leer__Leer = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Leer__Definicion = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Leer__Elemento = {
			LatinoTables.Operations._Elemento__esReservadaGo /* esReservadaGo(String[?]) */,
			LatinoTables.Operations._Elemento__esReservadaLatino /* esReservadaLatino(String[?]) */,
			LatinoTables.Operations._Elemento__operandosNumericos /* operandosNumericos(String[?]) */,
			LatinoTables.Operations._Elemento__programa /* programa() */,
			LatinoTables.Operations._Elemento__tipoTexto /* tipoTexto(String[?]) */,
			LatinoTables.Operations._Elemento__usaSoloVariablesDefinidas /* usaSoloVariablesDefinidas(String[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Leer__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Leer__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Leer__Sentencia = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Lista__Lista = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Lista__Definicion = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Lista__Elemento = {
			LatinoTables.Operations._Elemento__esReservadaGo /* esReservadaGo(String[?]) */,
			LatinoTables.Operations._Elemento__esReservadaLatino /* esReservadaLatino(String[?]) */,
			LatinoTables.Operations._Elemento__operandosNumericos /* operandosNumericos(String[?]) */,
			LatinoTables.Operations._Elemento__programa /* programa() */,
			LatinoTables.Operations._Elemento__tipoTexto /* tipoTexto(String[?]) */,
			LatinoTables.Operations._Elemento__usaSoloVariablesDefinidas /* usaSoloVariablesDefinidas(String[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Lista__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Lista__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Lista__Sentencia = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Llamada__Llamada = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Llamada__Elemento = {
			LatinoTables.Operations._Elemento__esReservadaGo /* esReservadaGo(String[?]) */,
			LatinoTables.Operations._Elemento__esReservadaLatino /* esReservadaLatino(String[?]) */,
			LatinoTables.Operations._Elemento__operandosNumericos /* operandosNumericos(String[?]) */,
			LatinoTables.Operations._Elemento__programa /* programa() */,
			LatinoTables.Operations._Elemento__tipoTexto /* tipoTexto(String[?]) */,
			LatinoTables.Operations._Elemento__usaSoloVariablesDefinidas /* usaSoloVariablesDefinidas(String[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Llamada__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Llamada__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Llamada__Sentencia = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Mientras__Mientras = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Mientras__Ciclo = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Mientras__CicloCondicion = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Mientras__Elemento = {
			LatinoTables.Operations._Elemento__esReservadaGo /* esReservadaGo(String[?]) */,
			LatinoTables.Operations._Elemento__esReservadaLatino /* esReservadaLatino(String[?]) */,
			LatinoTables.Operations._Elemento__operandosNumericos /* operandosNumericos(String[?]) */,
			LatinoTables.Operations._Elemento__programa /* programa() */,
			LatinoTables.Operations._Elemento__tipoTexto /* tipoTexto(String[?]) */,
			LatinoTables.Operations._Elemento__usaSoloVariablesDefinidas /* usaSoloVariablesDefinidas(String[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Mientras__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Mientras__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Mientras__Sentencia = {};

		private static final ExecutorOperation /*@NonNull*/ [] _OperadorPaso__OperadorPaso = {};
		private static final ExecutorOperation /*@NonNull*/ [] _OperadorPaso__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _OperadorPaso__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _OperadorPaso__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _OperadorPaso__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Osi__Osi = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Osi__Elemento = {
			LatinoTables.Operations._Elemento__esReservadaGo /* esReservadaGo(String[?]) */,
			LatinoTables.Operations._Elemento__esReservadaLatino /* esReservadaLatino(String[?]) */,
			LatinoTables.Operations._Elemento__operandosNumericos /* operandosNumericos(String[?]) */,
			LatinoTables.Operations._Elemento__programa /* programa() */,
			LatinoTables.Operations._Elemento__tipoTexto /* tipoTexto(String[?]) */,
			LatinoTables.Operations._Elemento__usaSoloVariablesDefinidas /* usaSoloVariablesDefinidas(String[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Osi__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Osi__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Para__Para = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Para__Ciclo = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Para__Elemento = {
			LatinoTables.Operations._Elemento__esReservadaGo /* esReservadaGo(String[?]) */,
			LatinoTables.Operations._Elemento__esReservadaLatino /* esReservadaLatino(String[?]) */,
			LatinoTables.Operations._Elemento__operandosNumericos /* operandosNumericos(String[?]) */,
			LatinoTables.Operations._Elemento__programa /* programa() */,
			LatinoTables.Operations._Elemento__tipoTexto /* tipoTexto(String[?]) */,
			LatinoTables.Operations._Elemento__usaSoloVariablesDefinidas /* usaSoloVariablesDefinidas(String[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Para__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Para__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Para__Sentencia = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Programa__Programa = {
			LatinoTables.Operations._Programa__defineVariable /* defineVariable(String[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Programa__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Programa__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Repetir__Repetir = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Repetir__Ciclo = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Repetir__CicloCondicion = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Repetir__Elemento = {
			LatinoTables.Operations._Elemento__esReservadaGo /* esReservadaGo(String[?]) */,
			LatinoTables.Operations._Elemento__esReservadaLatino /* esReservadaLatino(String[?]) */,
			LatinoTables.Operations._Elemento__operandosNumericos /* operandosNumericos(String[?]) */,
			LatinoTables.Operations._Elemento__programa /* programa() */,
			LatinoTables.Operations._Elemento__tipoTexto /* tipoTexto(String[?]) */,
			LatinoTables.Operations._Elemento__usaSoloVariablesDefinidas /* usaSoloVariablesDefinidas(String[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Repetir__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Repetir__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Repetir__Sentencia = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Retorno__Retorno = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Retorno__Elemento = {
			LatinoTables.Operations._Elemento__esReservadaGo /* esReservadaGo(String[?]) */,
			LatinoTables.Operations._Elemento__esReservadaLatino /* esReservadaLatino(String[?]) */,
			LatinoTables.Operations._Elemento__operandosNumericos /* operandosNumericos(String[?]) */,
			LatinoTables.Operations._Elemento__programa /* programa() */,
			LatinoTables.Operations._Elemento__tipoTexto /* tipoTexto(String[?]) */,
			LatinoTables.Operations._Elemento__usaSoloVariablesDefinidas /* usaSoloVariablesDefinidas(String[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Retorno__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Retorno__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Retorno__Sentencia = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Romper__Romper = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Romper__Elemento = {
			LatinoTables.Operations._Elemento__esReservadaGo /* esReservadaGo(String[?]) */,
			LatinoTables.Operations._Elemento__esReservadaLatino /* esReservadaLatino(String[?]) */,
			LatinoTables.Operations._Elemento__operandosNumericos /* operandosNumericos(String[?]) */,
			LatinoTables.Operations._Elemento__programa /* programa() */,
			LatinoTables.Operations._Elemento__tipoTexto /* tipoTexto(String[?]) */,
			LatinoTables.Operations._Elemento__usaSoloVariablesDefinidas /* usaSoloVariablesDefinidas(String[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Romper__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Romper__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Romper__Salto = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Romper__Sentencia = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Salto__Salto = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Salto__Elemento = {
			LatinoTables.Operations._Elemento__esReservadaGo /* esReservadaGo(String[?]) */,
			LatinoTables.Operations._Elemento__esReservadaLatino /* esReservadaLatino(String[?]) */,
			LatinoTables.Operations._Elemento__operandosNumericos /* operandosNumericos(String[?]) */,
			LatinoTables.Operations._Elemento__programa /* programa() */,
			LatinoTables.Operations._Elemento__tipoTexto /* tipoTexto(String[?]) */,
			LatinoTables.Operations._Elemento__usaSoloVariablesDefinidas /* usaSoloVariablesDefinidas(String[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Salto__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Salto__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Salto__Sentencia = {};

		private static final ExecutorOperation /*@NonNull*/ [] _Sentencia__Sentencia = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Sentencia__Elemento = {
			LatinoTables.Operations._Elemento__esReservadaGo /* esReservadaGo(String[?]) */,
			LatinoTables.Operations._Elemento__esReservadaLatino /* esReservadaLatino(String[?]) */,
			LatinoTables.Operations._Elemento__operandosNumericos /* operandosNumericos(String[?]) */,
			LatinoTables.Operations._Elemento__programa /* programa() */,
			LatinoTables.Operations._Elemento__tipoTexto /* tipoTexto(String[?]) */,
			LatinoTables.Operations._Elemento__usaSoloVariablesDefinidas /* usaSoloVariablesDefinidas(String[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Sentencia__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Sentencia__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Variable__Variable = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Variable__Elemento = {
			LatinoTables.Operations._Elemento__esReservadaGo /* esReservadaGo(String[?]) */,
			LatinoTables.Operations._Elemento__esReservadaLatino /* esReservadaLatino(String[?]) */,
			LatinoTables.Operations._Elemento__operandosNumericos /* operandosNumericos(String[?]) */,
			LatinoTables.Operations._Elemento__programa /* programa() */,
			LatinoTables.Operations._Elemento__tipoTexto /* tipoTexto(String[?]) */,
			LatinoTables.Operations._Elemento__usaSoloVariablesDefinidas /* usaSoloVariablesDefinidas(String[?]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Variable__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Variable__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Asignacion__Asignacion.initOperations(_Asignacion__Asignacion);
			Fragments._Asignacion__Definicion.initOperations(_Asignacion__Definicion);
			Fragments._Asignacion__Elemento.initOperations(_Asignacion__Elemento);
			Fragments._Asignacion__OclAny.initOperations(_Asignacion__OclAny);
			Fragments._Asignacion__OclElement.initOperations(_Asignacion__OclElement);
			Fragments._Asignacion__Sentencia.initOperations(_Asignacion__Sentencia);

			Fragments._AsignacionIndice__AsignacionIndice.initOperations(_AsignacionIndice__AsignacionIndice);
			Fragments._AsignacionIndice__Elemento.initOperations(_AsignacionIndice__Elemento);
			Fragments._AsignacionIndice__OclAny.initOperations(_AsignacionIndice__OclAny);
			Fragments._AsignacionIndice__OclElement.initOperations(_AsignacionIndice__OclElement);
			Fragments._AsignacionIndice__Sentencia.initOperations(_AsignacionIndice__Sentencia);

			Fragments._Caso__Caso.initOperations(_Caso__Caso);
			Fragments._Caso__Elemento.initOperations(_Caso__Elemento);
			Fragments._Caso__OclAny.initOperations(_Caso__OclAny);
			Fragments._Caso__OclElement.initOperations(_Caso__OclElement);

			Fragments._Ciclo__Ciclo.initOperations(_Ciclo__Ciclo);
			Fragments._Ciclo__Elemento.initOperations(_Ciclo__Elemento);
			Fragments._Ciclo__OclAny.initOperations(_Ciclo__OclAny);
			Fragments._Ciclo__OclElement.initOperations(_Ciclo__OclElement);
			Fragments._Ciclo__Sentencia.initOperations(_Ciclo__Sentencia);

			Fragments._CicloCondicion__Ciclo.initOperations(_CicloCondicion__Ciclo);
			Fragments._CicloCondicion__CicloCondicion.initOperations(_CicloCondicion__CicloCondicion);
			Fragments._CicloCondicion__Elemento.initOperations(_CicloCondicion__Elemento);
			Fragments._CicloCondicion__OclAny.initOperations(_CicloCondicion__OclAny);
			Fragments._CicloCondicion__OclElement.initOperations(_CicloCondicion__OclElement);
			Fragments._CicloCondicion__Sentencia.initOperations(_CicloCondicion__Sentencia);

			Fragments._Condicional__Condicional.initOperations(_Condicional__Condicional);
			Fragments._Condicional__Elemento.initOperations(_Condicional__Elemento);
			Fragments._Condicional__OclAny.initOperations(_Condicional__OclAny);
			Fragments._Condicional__OclElement.initOperations(_Condicional__OclElement);
			Fragments._Condicional__Sentencia.initOperations(_Condicional__Sentencia);

			Fragments._Continuar__Continuar.initOperations(_Continuar__Continuar);
			Fragments._Continuar__Elemento.initOperations(_Continuar__Elemento);
			Fragments._Continuar__OclAny.initOperations(_Continuar__OclAny);
			Fragments._Continuar__OclElement.initOperations(_Continuar__OclElement);
			Fragments._Continuar__Salto.initOperations(_Continuar__Salto);
			Fragments._Continuar__Sentencia.initOperations(_Continuar__Sentencia);

			Fragments._Conversion__Conversion.initOperations(_Conversion__Conversion);
			Fragments._Conversion__OclAny.initOperations(_Conversion__OclAny);
			Fragments._Conversion__OclElement.initOperations(_Conversion__OclElement);
			Fragments._Conversion__OclEnumeration.initOperations(_Conversion__OclEnumeration);
			Fragments._Conversion__OclType.initOperations(_Conversion__OclType);

			Fragments._Definicion__Definicion.initOperations(_Definicion__Definicion);
			Fragments._Definicion__Elemento.initOperations(_Definicion__Elemento);
			Fragments._Definicion__OclAny.initOperations(_Definicion__OclAny);
			Fragments._Definicion__OclElement.initOperations(_Definicion__OclElement);
			Fragments._Definicion__Sentencia.initOperations(_Definicion__Sentencia);

			Fragments._Desde__Ciclo.initOperations(_Desde__Ciclo);
			Fragments._Desde__CicloCondicion.initOperations(_Desde__CicloCondicion);
			Fragments._Desde__Desde.initOperations(_Desde__Desde);
			Fragments._Desde__Elemento.initOperations(_Desde__Elemento);
			Fragments._Desde__OclAny.initOperations(_Desde__OclAny);
			Fragments._Desde__OclElement.initOperations(_Desde__OclElement);
			Fragments._Desde__Sentencia.initOperations(_Desde__Sentencia);

			Fragments._Elegir__Elegir.initOperations(_Elegir__Elegir);
			Fragments._Elegir__Elemento.initOperations(_Elegir__Elemento);
			Fragments._Elegir__OclAny.initOperations(_Elegir__OclAny);
			Fragments._Elegir__OclElement.initOperations(_Elegir__OclElement);
			Fragments._Elegir__Sentencia.initOperations(_Elegir__Sentencia);

			Fragments._Elemento__Elemento.initOperations(_Elemento__Elemento);
			Fragments._Elemento__OclAny.initOperations(_Elemento__OclAny);
			Fragments._Elemento__OclElement.initOperations(_Elemento__OclElement);

			Fragments._Funcion__Definicion.initOperations(_Funcion__Definicion);
			Fragments._Funcion__Elemento.initOperations(_Funcion__Elemento);
			Fragments._Funcion__Funcion.initOperations(_Funcion__Funcion);
			Fragments._Funcion__OclAny.initOperations(_Funcion__OclAny);
			Fragments._Funcion__OclElement.initOperations(_Funcion__OclElement);
			Fragments._Funcion__Sentencia.initOperations(_Funcion__Sentencia);

			Fragments._Imprimir__Elemento.initOperations(_Imprimir__Elemento);
			Fragments._Imprimir__Imprimir.initOperations(_Imprimir__Imprimir);
			Fragments._Imprimir__OclAny.initOperations(_Imprimir__OclAny);
			Fragments._Imprimir__OclElement.initOperations(_Imprimir__OclElement);
			Fragments._Imprimir__Sentencia.initOperations(_Imprimir__Sentencia);

			Fragments._Incremento__Elemento.initOperations(_Incremento__Elemento);
			Fragments._Incremento__Incremento.initOperations(_Incremento__Incremento);
			Fragments._Incremento__OclAny.initOperations(_Incremento__OclAny);
			Fragments._Incremento__OclElement.initOperations(_Incremento__OclElement);
			Fragments._Incremento__Sentencia.initOperations(_Incremento__Sentencia);

			Fragments._Leer__Definicion.initOperations(_Leer__Definicion);
			Fragments._Leer__Elemento.initOperations(_Leer__Elemento);
			Fragments._Leer__Leer.initOperations(_Leer__Leer);
			Fragments._Leer__OclAny.initOperations(_Leer__OclAny);
			Fragments._Leer__OclElement.initOperations(_Leer__OclElement);
			Fragments._Leer__Sentencia.initOperations(_Leer__Sentencia);

			Fragments._Lista__Definicion.initOperations(_Lista__Definicion);
			Fragments._Lista__Elemento.initOperations(_Lista__Elemento);
			Fragments._Lista__Lista.initOperations(_Lista__Lista);
			Fragments._Lista__OclAny.initOperations(_Lista__OclAny);
			Fragments._Lista__OclElement.initOperations(_Lista__OclElement);
			Fragments._Lista__Sentencia.initOperations(_Lista__Sentencia);

			Fragments._Llamada__Elemento.initOperations(_Llamada__Elemento);
			Fragments._Llamada__Llamada.initOperations(_Llamada__Llamada);
			Fragments._Llamada__OclAny.initOperations(_Llamada__OclAny);
			Fragments._Llamada__OclElement.initOperations(_Llamada__OclElement);
			Fragments._Llamada__Sentencia.initOperations(_Llamada__Sentencia);

			Fragments._Mientras__Ciclo.initOperations(_Mientras__Ciclo);
			Fragments._Mientras__CicloCondicion.initOperations(_Mientras__CicloCondicion);
			Fragments._Mientras__Elemento.initOperations(_Mientras__Elemento);
			Fragments._Mientras__Mientras.initOperations(_Mientras__Mientras);
			Fragments._Mientras__OclAny.initOperations(_Mientras__OclAny);
			Fragments._Mientras__OclElement.initOperations(_Mientras__OclElement);
			Fragments._Mientras__Sentencia.initOperations(_Mientras__Sentencia);

			Fragments._OperadorPaso__OclAny.initOperations(_OperadorPaso__OclAny);
			Fragments._OperadorPaso__OclElement.initOperations(_OperadorPaso__OclElement);
			Fragments._OperadorPaso__OclEnumeration.initOperations(_OperadorPaso__OclEnumeration);
			Fragments._OperadorPaso__OclType.initOperations(_OperadorPaso__OclType);
			Fragments._OperadorPaso__OperadorPaso.initOperations(_OperadorPaso__OperadorPaso);

			Fragments._Osi__Elemento.initOperations(_Osi__Elemento);
			Fragments._Osi__OclAny.initOperations(_Osi__OclAny);
			Fragments._Osi__OclElement.initOperations(_Osi__OclElement);
			Fragments._Osi__Osi.initOperations(_Osi__Osi);

			Fragments._Para__Ciclo.initOperations(_Para__Ciclo);
			Fragments._Para__Elemento.initOperations(_Para__Elemento);
			Fragments._Para__OclAny.initOperations(_Para__OclAny);
			Fragments._Para__OclElement.initOperations(_Para__OclElement);
			Fragments._Para__Para.initOperations(_Para__Para);
			Fragments._Para__Sentencia.initOperations(_Para__Sentencia);

			Fragments._Programa__OclAny.initOperations(_Programa__OclAny);
			Fragments._Programa__OclElement.initOperations(_Programa__OclElement);
			Fragments._Programa__Programa.initOperations(_Programa__Programa);

			Fragments._Repetir__Ciclo.initOperations(_Repetir__Ciclo);
			Fragments._Repetir__CicloCondicion.initOperations(_Repetir__CicloCondicion);
			Fragments._Repetir__Elemento.initOperations(_Repetir__Elemento);
			Fragments._Repetir__OclAny.initOperations(_Repetir__OclAny);
			Fragments._Repetir__OclElement.initOperations(_Repetir__OclElement);
			Fragments._Repetir__Repetir.initOperations(_Repetir__Repetir);
			Fragments._Repetir__Sentencia.initOperations(_Repetir__Sentencia);

			Fragments._Retorno__Elemento.initOperations(_Retorno__Elemento);
			Fragments._Retorno__OclAny.initOperations(_Retorno__OclAny);
			Fragments._Retorno__OclElement.initOperations(_Retorno__OclElement);
			Fragments._Retorno__Retorno.initOperations(_Retorno__Retorno);
			Fragments._Retorno__Sentencia.initOperations(_Retorno__Sentencia);

			Fragments._Romper__Elemento.initOperations(_Romper__Elemento);
			Fragments._Romper__OclAny.initOperations(_Romper__OclAny);
			Fragments._Romper__OclElement.initOperations(_Romper__OclElement);
			Fragments._Romper__Romper.initOperations(_Romper__Romper);
			Fragments._Romper__Salto.initOperations(_Romper__Salto);
			Fragments._Romper__Sentencia.initOperations(_Romper__Sentencia);

			Fragments._Salto__Elemento.initOperations(_Salto__Elemento);
			Fragments._Salto__OclAny.initOperations(_Salto__OclAny);
			Fragments._Salto__OclElement.initOperations(_Salto__OclElement);
			Fragments._Salto__Salto.initOperations(_Salto__Salto);
			Fragments._Salto__Sentencia.initOperations(_Salto__Sentencia);

			Fragments._Sentencia__Elemento.initOperations(_Sentencia__Elemento);
			Fragments._Sentencia__OclAny.initOperations(_Sentencia__OclAny);
			Fragments._Sentencia__OclElement.initOperations(_Sentencia__OclElement);
			Fragments._Sentencia__Sentencia.initOperations(_Sentencia__Sentencia);

			Fragments._Variable__Elemento.initOperations(_Variable__Elemento);
			Fragments._Variable__OclAny.initOperations(_Variable__OclAny);
			Fragments._Variable__OclElement.initOperations(_Variable__OclElement);
			Fragments._Variable__Variable.initOperations(_Variable__Variable);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of LatinoTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Asignacion = {
			LatinoTables.Properties._Definicion__nombre,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			LatinoTables.Properties._Asignacion__valor
		};

		private static final ExecutorProperty /*@NonNull*/ [] _AsignacionIndice = {
			LatinoTables.Properties._AsignacionIndice__indice,
			LatinoTables.Properties._AsignacionIndice__lista,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			LatinoTables.Properties._AsignacionIndice__valor
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Caso = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			LatinoTables.Properties._Caso__sentencias,
			LatinoTables.Properties._Caso__valores
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Ciclo = {
			LatinoTables.Properties._Ciclo__cuerpo,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CicloCondicion = {
			LatinoTables.Properties._CicloCondicion__condicion,
			LatinoTables.Properties._Ciclo__cuerpo,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Condicional = {
			LatinoTables.Properties._Condicional__condicion,
			LatinoTables.Properties._Condicional__entonces,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			LatinoTables.Properties._Condicional__osis,
			LatinoTables.Properties._Condicional__sino
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Continuar = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Conversion = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Definicion = {
			LatinoTables.Properties._Definicion__nombre,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Desde = {
			LatinoTables.Properties._CicloCondicion__condicion,
			LatinoTables.Properties._Ciclo__cuerpo,
			LatinoTables.Properties._Desde__inicio,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			LatinoTables.Properties._Desde__paso
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Elegir = {
			LatinoTables.Properties._Elegir__casos,
			LatinoTables.Properties._Elegir__defecto,
			LatinoTables.Properties._Elegir__expresion,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Elemento = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Funcion = {
			LatinoTables.Properties._Funcion__cuerpo,
			LatinoTables.Properties._Definicion__nombre,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			LatinoTables.Properties._Funcion__parametros
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Imprimir = {
			LatinoTables.Properties._Imprimir__mensaje,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Incremento = {
			LatinoTables.Properties._Incremento__nombre,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			LatinoTables.Properties._Incremento__operador
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Leer = {
			LatinoTables.Properties._Leer__conversion,
			LatinoTables.Properties._Definicion__nombre,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Lista = {
			LatinoTables.Properties._Lista__elementos,
			LatinoTables.Properties._Definicion__nombre,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Llamada = {
			LatinoTables.Properties._Llamada__argumentos,
			LatinoTables.Properties._Llamada__funcion,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Mientras = {
			LatinoTables.Properties._CicloCondicion__condicion,
			LatinoTables.Properties._Ciclo__cuerpo,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _OperadorPaso = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Osi = {
			LatinoTables.Properties._Osi__condicion,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			LatinoTables.Properties._Osi__sentencias
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Para = {
			LatinoTables.Properties._Ciclo__cuerpo,
			LatinoTables.Properties._Para__limites,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			LatinoTables.Properties._Para__variable
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Programa = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			LatinoTables.Properties._Programa__sentencias
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Repetir = {
			LatinoTables.Properties._CicloCondicion__condicion,
			LatinoTables.Properties._Ciclo__cuerpo,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Retorno = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			LatinoTables.Properties._Retorno__valor
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Romper = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Salto = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Sentencia = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Variable = {
			LatinoTables.Properties._Variable__nombre,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Asignacion__Asignacion.initProperties(_Asignacion);
			Fragments._AsignacionIndice__AsignacionIndice.initProperties(_AsignacionIndice);
			Fragments._Caso__Caso.initProperties(_Caso);
			Fragments._Ciclo__Ciclo.initProperties(_Ciclo);
			Fragments._CicloCondicion__CicloCondicion.initProperties(_CicloCondicion);
			Fragments._Condicional__Condicional.initProperties(_Condicional);
			Fragments._Continuar__Continuar.initProperties(_Continuar);
			Fragments._Conversion__Conversion.initProperties(_Conversion);
			Fragments._Definicion__Definicion.initProperties(_Definicion);
			Fragments._Desde__Desde.initProperties(_Desde);
			Fragments._Elegir__Elegir.initProperties(_Elegir);
			Fragments._Elemento__Elemento.initProperties(_Elemento);
			Fragments._Funcion__Funcion.initProperties(_Funcion);
			Fragments._Imprimir__Imprimir.initProperties(_Imprimir);
			Fragments._Incremento__Incremento.initProperties(_Incremento);
			Fragments._Leer__Leer.initProperties(_Leer);
			Fragments._Lista__Lista.initProperties(_Lista);
			Fragments._Llamada__Llamada.initProperties(_Llamada);
			Fragments._Mientras__Mientras.initProperties(_Mientras);
			Fragments._OperadorPaso__OperadorPaso.initProperties(_OperadorPaso);
			Fragments._Osi__Osi.initProperties(_Osi);
			Fragments._Para__Para.initProperties(_Para);
			Fragments._Programa__Programa.initProperties(_Programa);
			Fragments._Repetir__Repetir.initProperties(_Repetir);
			Fragments._Retorno__Retorno.initProperties(_Retorno);
			Fragments._Romper__Romper.initProperties(_Romper);
			Fragments._Salto__Salto.initProperties(_Salto);
			Fragments._Sentencia__Sentencia.initProperties(_Sentencia);
			Fragments._Variable__Variable.initProperties(_Variable);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of LatinoTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _Conversion__NINGUNA = new EcoreExecutorEnumerationLiteral(LatinoPackage.Literals.CONVERSION.getEEnumLiteral("NINGUNA"), Types._Conversion, 0);
		public static final EcoreExecutorEnumerationLiteral _Conversion__NUMERO = new EcoreExecutorEnumerationLiteral(LatinoPackage.Literals.CONVERSION.getEEnumLiteral("NUMERO"), Types._Conversion, 1);
		public static final EcoreExecutorEnumerationLiteral _Conversion__TEXTO = new EcoreExecutorEnumerationLiteral(LatinoPackage.Literals.CONVERSION.getEEnumLiteral("TEXTO"), Types._Conversion, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _Conversion = {
			_Conversion__NINGUNA,
			_Conversion__NUMERO,
			_Conversion__TEXTO
		};

		public static final EcoreExecutorEnumerationLiteral _OperadorPaso__MAS = new EcoreExecutorEnumerationLiteral(LatinoPackage.Literals.OPERADOR_PASO.getEEnumLiteral("MAS"), Types._OperadorPaso, 0);
		public static final EcoreExecutorEnumerationLiteral _OperadorPaso__MENOS = new EcoreExecutorEnumerationLiteral(LatinoPackage.Literals.OPERADOR_PASO.getEEnumLiteral("MENOS"), Types._OperadorPaso, 1);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _OperadorPaso = {
			_OperadorPaso__MAS,
			_OperadorPaso__MENOS
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._Conversion.initLiterals(_Conversion);
			Types._OperadorPaso.initLiterals(_OperadorPaso);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of LatinoTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new LatinoTables();
	}

	private LatinoTables() {
		super(LatinoPackage.eNS_URI);
	}
}
