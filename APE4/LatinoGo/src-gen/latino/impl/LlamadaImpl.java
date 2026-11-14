/**
 */
package latino.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import latino.Funcion;
import latino.LatinoPackage;
import latino.LatinoTables;
import latino.Llamada;
import latino.Programa;
import latino.Variable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.eclipse.ocl.pivot.StandardLibrary;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.internal.library.executor.ExecutorSingleIterationManager;

import org.eclipse.ocl.pivot.library.AbstractBinaryOperation;

import org.eclipse.ocl.pivot.library.LibraryIteration.LibraryIterationExtension;

import org.eclipse.ocl.pivot.library.classifier.ClassifierOclContentsOperation;

import org.eclipse.ocl.pivot.library.collection.CollectionSelectByKindOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;

import org.eclipse.ocl.pivot.library.numeric.NumericNegateOperation;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;
import org.eclipse.ocl.pivot.values.SetValue;

import org.eclipse.ocl.pivot.values.SetValue.Accumulator;

import org.eclipse.ocl.pivot.values.TupleValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Llamada</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link latino.impl.LlamadaImpl#getFuncion <em>Funcion</em>}</li>
 *   <li>{@link latino.impl.LlamadaImpl#getArgumentos <em>Argumentos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LlamadaImpl extends SentenciaImpl implements Llamada {
	/**
	 * The default value of the '{@link #getFuncion() <em>Funcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuncion()
	 * @generated
	 * @ordered
	 */
	protected static final String FUNCION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFuncion() <em>Funcion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuncion()
	 * @generated
	 * @ordered
	 */
	protected String funcion = FUNCION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArgumentos() <em>Argumentos</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgumentos()
	 * @generated
	 * @ordered
	 */
	protected EList<String> argumentos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LlamadaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LatinoPackage.Literals.LLAMADA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFuncion() {
		return funcion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFuncion(String newFuncion) {
		String oldFuncion = funcion;
		funcion = newFuncion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LatinoPackage.LLAMADA__FUNCION, oldFuncion, funcion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getArgumentos() {
		if (argumentos == null) {
			argumentos = new EDataTypeEList<String>(String.class, this, LatinoPackage.LLAMADA__ARGUMENTOS);
		}
		return argumentos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean VariablesDeclaradas(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Llamada::VariablesDeclaradas";
		try {
			/**
			 *
			 * inv VariablesDeclaradas:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = argumentos->forAll(a |
			 *             usaSoloVariablesDefinidas(a))
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'La llamada usa una variable que no existe', severity = -1, status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					LatinoPackage.Literals.LLAMADA___VARIABLES_DECLARADAS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, LatinoTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				final /*@NonInvalid*/ List<String> argumentos = this.getArgumentos();
				final /*@NonInvalid*/ SequenceValue BOXED_argumentos = idResolver
						.createSequenceOfAll(LatinoTables.SEQ_PRIMid_String, argumentos);
				/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
				Iterator<Object> ITERATOR_a = BOXED_argumentos.iterator();
				/*@NonInvalid*/ Boolean status;
				while (true) {
					if (!ITERATOR_a.hasNext()) {
						if (accumulator == ValueUtil.TRUE_VALUE) {
							status = ValueUtil.TRUE_VALUE;
						} else {
							throw (InvalidValueException) accumulator;
						}
						break;
					}
					/*@NonInvalid*/ String a = (String) ITERATOR_a.next();
					/**
					 * usaSoloVariablesDefinidas(a)
					 */
					final /*@NonInvalid*/ boolean usaSoloVariablesDefinidas = this.usaSoloVariablesDefinidas(a);
					//
					if (!usaSoloVariablesDefinidas) { // Normal unsuccessful body evaluation result
						status = ValueUtil.FALSE_VALUE;
						break; // Stop immediately
					} else if (usaSoloVariablesDefinidas) { // Normal successful body evaluation result
						; // Carry on
					} else { // Impossible badly typed result
						accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
					}
				}
				final /*@NonInvalid*/ boolean eq = status == Boolean.TRUE;
				/*@NonInvalid*/ Object IF_eq;
				if (eq) {
					IF_eq = ValueUtil.TRUE_VALUE;
				} else {
					final /*@NonInvalid*/ IntegerValue diff = (IntegerValue) NumericNegateOperation.INSTANCE
							.evaluate(LatinoTables.INT_1);
					final /*@NonInvalid*/ TupleValue TUP_ = ValueUtil.createTupleOfEach(LatinoTables.TUPLid_,
							LatinoTables.STR_La_32_llamada_32_usa_32_una_32_variable_32_que_32_no_32_existe, diff,
							status);
					IF_eq = TUP_;
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, IF_eq, LatinoTables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean OperandosNumericos(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Llamada::OperandosNumericos";
		try {
			/**
			 *
			 * inv OperandosNumericos:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = not argumentos->forAll(a |
			 *             usaSoloVariablesDefinidas(a)) or
			 *           argumentos->forAll(a | operandosNumericos(a))
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'No uses + - * / % con textos o logicos, para unir textos usa ..', severity = -1, status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					LatinoPackage.Literals.LLAMADA___OPERANDOS_NUMERICOS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, LatinoTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_IF_eq;
				try {
					final /*@NonInvalid*/ List<String> argumentos_0 = this.getArgumentos();
					final /*@NonInvalid*/ SequenceValue BOXED_argumentos_0 = idResolver
							.createSequenceOfAll(LatinoTables.SEQ_PRIMid_String, argumentos_0);
					/*@Caught*/ Object CAUGHT_not;
					try {
						/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
						Iterator<Object> ITERATOR_a = BOXED_argumentos_0.iterator();
						/*@NonInvalid*/ Boolean forAll;
						while (true) {
							if (!ITERATOR_a.hasNext()) {
								if (accumulator == ValueUtil.TRUE_VALUE) {
									forAll = ValueUtil.TRUE_VALUE;
								} else {
									throw (InvalidValueException) accumulator;
								}
								break;
							}
							/*@NonInvalid*/ String a = (String) ITERATOR_a.next();
							/**
							 * usaSoloVariablesDefinidas(a)
							 */
							final /*@NonInvalid*/ boolean usaSoloVariablesDefinidas = this.usaSoloVariablesDefinidas(a);
							//
							if (!usaSoloVariablesDefinidas) { // Normal unsuccessful body evaluation result
								forAll = ValueUtil.FALSE_VALUE;
								break; // Stop immediately
							} else if (usaSoloVariablesDefinidas) { // Normal successful body evaluation result
								; // Carry on
							} else { // Impossible badly typed result
								accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
							}
						}
						final /*@Thrown*/ Boolean not;
						if (forAll == ValueUtil.FALSE_VALUE) {
							not = ValueUtil.TRUE_VALUE;
						} else {
							if (forAll == ValueUtil.TRUE_VALUE) {
								not = ValueUtil.FALSE_VALUE;
							} else {
								not = null;
							}
						}
						CAUGHT_not = not;
					} catch (Exception e) {
						CAUGHT_not = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean status;
					if (CAUGHT_not == ValueUtil.TRUE_VALUE) {
						status = ValueUtil.TRUE_VALUE;
					} else {
						/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
						Iterator<Object> ITERATOR_a_0 = BOXED_argumentos_0.iterator();
						/*@NonInvalid*/ Boolean forAll_0;
						while (true) {
							if (!ITERATOR_a_0.hasNext()) {
								if (accumulator_0 == ValueUtil.TRUE_VALUE) {
									forAll_0 = ValueUtil.TRUE_VALUE;
								} else {
									throw (InvalidValueException) accumulator_0;
								}
								break;
							}
							/*@NonInvalid*/ String a_0 = (String) ITERATOR_a_0.next();
							/**
							 * operandosNumericos(a)
							 */
							final /*@NonInvalid*/ boolean operandosNumericos = this.operandosNumericos(a_0);
							//
							if (!operandosNumericos) { // Normal unsuccessful body evaluation result
								forAll_0 = ValueUtil.FALSE_VALUE;
								break; // Stop immediately
							} else if (operandosNumericos) { // Normal successful body evaluation result
								; // Carry on
							} else { // Impossible badly typed result
								accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
							}
						}
						if (forAll_0 == ValueUtil.TRUE_VALUE) {
							status = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_not instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_not;
							}
							if ((CAUGHT_not == null) || (forAll_0 == null)) {
								status = null;
							} else {
								status = ValueUtil.FALSE_VALUE;
							}
						}
					}
					final /*@Thrown*/ boolean eq = status == Boolean.TRUE;
					/*@Thrown*/ Object IF_eq;
					if (eq) {
						IF_eq = ValueUtil.TRUE_VALUE;
					} else {
						final /*@NonInvalid*/ IntegerValue diff = (IntegerValue) NumericNegateOperation.INSTANCE
								.evaluate(LatinoTables.INT_1);
						final /*@Thrown*/ TupleValue TUP_ = ValueUtil.createTupleOfEach(LatinoTables.TUPLid_,
								LatinoTables.STR_No_32_uses_32_p_32_m_32_a_32_s_32_37_32_con_32_textos_32_o_32_logicos_44_32_para_32_unir_32_textos_32_usa_32__,
								diff, status);
						IF_eq = TUP_;
					}
					CAUGHT_IF_eq = IF_eq;
				} catch (Exception e) {
					CAUGHT_IF_eq = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_IF_eq, LatinoTables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean FuncionDeclarada(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Llamada::FuncionDeclarada";
		try {
			/**
			 *
			 * inv FuncionDeclarada:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = programa()
			 *           .oclAsType(OclElement)
			 *           ->closure(e | e.oclContents())
			 *           ->selectByKind(Funcion)
			 *           ->exists(f | f.nombre = funcion)
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'Esa funcion no existe, definela antes con funcion', severity = -1, status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					LatinoPackage.Literals.LLAMADA___FUNCION_DECLARADA__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, LatinoTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_IF_eq_0;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_OclElement_0 = idResolver
							.getClass(LatinoTables.CLSSid_OclElement, null);
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_latino_c_c_Funcion_0 = idResolver
							.getClass(LatinoTables.CLSSid_Funcion, null);
					final /*@NonInvalid*/ Programa programa = this.programa();
					final /*@Thrown*/ Object oclAsType = OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, programa,
							TYP_OclElement_0);
					final /*@Thrown*/ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor,
							LatinoTables.SET_CLSSid_OclElement, oclAsType);
					final org.eclipse.ocl.pivot.Class TYPE_closure_0 = executor.getStaticTypeOfValue(null, oclAsSet);
					final LibraryIterationExtension IMPL_closure_0 = (LibraryIterationExtension) TYPE_closure_0
							.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._Set__closure);
					final /*@NonNull*/ Object ACC_closure_0 = IMPL_closure_0.createAccumulatorValue(executor,
							LatinoTables.SET_CLSSid_OclElement, LatinoTables.SET_CLSSid_OclElement);
					/**
					 * Implementation of the iterator body.
					 */
					final AbstractBinaryOperation BODY_closure_0 = new AbstractBinaryOperation() {
						/**
						 * e.oclContents()
						 */
						@Override
						public /*@Nullable*/ Object evaluate(final Executor executor, final TypeId typeId,
								final /*@Nullable*/ Object oclAsSet, final /*@NonInvalid*/ Object e_0) {
							if (e_0 == null) {
								throw new InvalidValueException(
										"Null \'\'OclElement\'\' rather than \'\'OclVoid\'\' value required");
							}
							final /*@Thrown*/ SetValue oclContents = ClassifierOclContentsOperation.INSTANCE
									.evaluate(executor, LatinoTables.SET_CLSSid_OclElement, e_0);
							return oclContents;
						}
					};
					final ExecutorSingleIterationManager MGR_closure_0 = new ExecutorSingleIterationManager(executor,
							LatinoTables.SET_CLSSid_OclElement, BODY_closure_0, oclAsSet, ACC_closure_0);
					final /*@Thrown*/ SetValue closure = (SetValue) IMPL_closure_0.evaluateIteration(MGR_closure_0);
					final /*@Thrown*/ SetValue selectByKind = (SetValue) CollectionSelectByKindOperation.INSTANCE
							.evaluate(executor, closure, TYP_latino_c_c_Funcion_0);
					/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
					Iterator<Object> ITERATOR_f = selectByKind.iterator();
					/*@Thrown*/ Boolean status;
					while (true) {
						if (!ITERATOR_f.hasNext()) {
							if (accumulator == ValueUtil.FALSE_VALUE) {
								status = ValueUtil.FALSE_VALUE;
							} else {
								throw (InvalidValueException) accumulator;
							}
							break;
						}
						/*@NonInvalid*/ Funcion f = (Funcion) ITERATOR_f.next();
						/**
						 * f.nombre = funcion
						 */
						final /*@NonInvalid*/ String nombre_0 = f.getNombre();
						final /*@NonInvalid*/ String funcion = this.getFuncion();
						final /*@NonInvalid*/ boolean eq = (nombre_0 != null) ? nombre_0.equals(funcion)
								: (funcion == null);
						//
						if (eq) { // Normal successful body evaluation result
							status = ValueUtil.TRUE_VALUE;
							break; // Stop immediately
						} else if (!eq) { // Normal unsuccessful body evaluation result
							; // Carry on
						} else { // Impossible badly typed result
							accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
						}
					}
					final /*@Thrown*/ boolean eq_0 = status == Boolean.TRUE;
					/*@Thrown*/ Object IF_eq_0;
					if (eq_0) {
						IF_eq_0 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@NonInvalid*/ IntegerValue diff = (IntegerValue) NumericNegateOperation.INSTANCE
								.evaluate(LatinoTables.INT_1);
						final /*@Thrown*/ TupleValue TUP_ = ValueUtil.createTupleOfEach(LatinoTables.TUPLid_,
								LatinoTables.STR_Esa_32_funcion_32_no_32_existe_44_32_definela_32_antes_32_con_32_funcion,
								diff, status);
						IF_eq_0 = TUP_;
					}
					CAUGHT_IF_eq_0 = IF_eq_0;
				} catch (Exception e) {
					CAUGHT_IF_eq_0 = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_IF_eq_0, LatinoTables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean ArgumentosCompletos(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Llamada::ArgumentosCompletos";
		try {
			/**
			 *
			 * inv ArgumentosCompletos:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = programa()
			 *           .oclAsType(OclElement)
			 *           ->closure(e | e.oclContents())
			 *           ->selectByKind(Funcion)
			 *           ->select(f | f.nombre = funcion)
			 *           ->forAll(f | f.parametros->size() = argumentos->size())
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'La llamada no lleva tantos valores como parametros tiene la funcion', severity = -1, status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					LatinoPackage.Literals.LLAMADA___ARGUMENTOS_COMPLETOS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, LatinoTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_IF_eq_1;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_OclElement_0 = idResolver
							.getClass(LatinoTables.CLSSid_OclElement, null);
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_latino_c_c_Funcion_0 = idResolver
							.getClass(LatinoTables.CLSSid_Funcion, null);
					final /*@NonInvalid*/ Programa programa = this.programa();
					final /*@Thrown*/ Object oclAsType = OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, programa,
							TYP_OclElement_0);
					final /*@Thrown*/ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor,
							LatinoTables.SET_CLSSid_OclElement, oclAsType);
					final org.eclipse.ocl.pivot.Class TYPE_closure_0 = executor.getStaticTypeOfValue(null, oclAsSet);
					final LibraryIterationExtension IMPL_closure_0 = (LibraryIterationExtension) TYPE_closure_0
							.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._Set__closure);
					final /*@NonNull*/ Object ACC_closure_0 = IMPL_closure_0.createAccumulatorValue(executor,
							LatinoTables.SET_CLSSid_OclElement, LatinoTables.SET_CLSSid_OclElement);
					/**
					 * Implementation of the iterator body.
					 */
					final AbstractBinaryOperation BODY_closure_0 = new AbstractBinaryOperation() {
						/**
						 * e.oclContents()
						 */
						@Override
						public /*@Nullable*/ Object evaluate(final Executor executor, final TypeId typeId,
								final /*@Nullable*/ Object oclAsSet, final /*@NonInvalid*/ Object e_0) {
							if (e_0 == null) {
								throw new InvalidValueException(
										"Null \'\'OclElement\'\' rather than \'\'OclVoid\'\' value required");
							}
							final /*@Thrown*/ SetValue oclContents = ClassifierOclContentsOperation.INSTANCE
									.evaluate(executor, LatinoTables.SET_CLSSid_OclElement, e_0);
							return oclContents;
						}
					};
					final ExecutorSingleIterationManager MGR_closure_0 = new ExecutorSingleIterationManager(executor,
							LatinoTables.SET_CLSSid_OclElement, BODY_closure_0, oclAsSet, ACC_closure_0);
					final /*@Thrown*/ SetValue closure = (SetValue) IMPL_closure_0.evaluateIteration(MGR_closure_0);
					final /*@Thrown*/ SetValue selectByKind = (SetValue) CollectionSelectByKindOperation.INSTANCE
							.evaluate(executor, closure, TYP_latino_c_c_Funcion_0);
					/*@Thrown*/ Accumulator accumulator = ValueUtil
							.createSetAccumulatorValue(LatinoTables.SET_CLSSid_Funcion);
					Iterator<Object> ITERATOR_f = selectByKind.iterator();
					/*@Thrown*/ SetValue select;
					while (true) {
						if (!ITERATOR_f.hasNext()) {
							select = accumulator;
							break;
						}
						/*@NonInvalid*/ Funcion f = (Funcion) ITERATOR_f.next();
						/**
						 * f.nombre = funcion
						 */
						final /*@NonInvalid*/ String nombre_0 = f.getNombre();
						final /*@NonInvalid*/ String funcion = this.getFuncion();
						final /*@NonInvalid*/ boolean eq = (nombre_0 != null) ? nombre_0.equals(funcion)
								: (funcion == null);
						//
						if (eq) {
							accumulator.add(f);
						}
					}
					/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_f_0 = select.iterator();
					/*@Thrown*/ Boolean status;
					while (true) {
						if (!ITERATOR_f_0.hasNext()) {
							if (accumulator_0 == ValueUtil.TRUE_VALUE) {
								status = ValueUtil.TRUE_VALUE;
							} else {
								throw (InvalidValueException) accumulator_0;
							}
							break;
						}
						/*@NonInvalid*/ Funcion f_0 = (Funcion) ITERATOR_f_0.next();
						/**
						 * f.parametros->size() = argumentos->size()
						 */
						final /*@NonInvalid*/ List<Variable> parametros = f_0.getParametros();
						final /*@NonInvalid*/ OrderedSetValue BOXED_parametros = idResolver
								.createOrderedSetOfAll(LatinoTables.ORD_CLSSid_Variable, parametros);
						final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE
								.evaluate(BOXED_parametros);
						final /*@NonInvalid*/ List<String> argumentos = this.getArgumentos();
						final /*@NonInvalid*/ SequenceValue BOXED_argumentos = idResolver
								.createSequenceOfAll(LatinoTables.SEQ_PRIMid_String, argumentos);
						final /*@NonInvalid*/ IntegerValue size_0 = CollectionSizeOperation.INSTANCE
								.evaluate(BOXED_argumentos);
						final /*@NonInvalid*/ boolean eq_0 = size.equals(size_0);
						//
						if (!eq_0) { // Normal unsuccessful body evaluation result
							status = ValueUtil.FALSE_VALUE;
							break; // Stop immediately
						} else if (eq_0) { // Normal successful body evaluation result
							; // Carry on
						} else { // Impossible badly typed result
							accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
						}
					}
					final /*@Thrown*/ boolean eq_1 = status == Boolean.TRUE;
					/*@Thrown*/ Object IF_eq_1;
					if (eq_1) {
						IF_eq_1 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@NonInvalid*/ IntegerValue diff = (IntegerValue) NumericNegateOperation.INSTANCE
								.evaluate(LatinoTables.INT_1);
						final /*@Thrown*/ TupleValue TUP_ = ValueUtil.createTupleOfEach(LatinoTables.TUPLid_,
								LatinoTables.STR_La_32_llamada_32_no_32_lleva_32_tantos_32_valores_32_como_32_parametros_32_tiene_32_la_32_func,
								diff, status);
						IF_eq_1 = TUP_;
					}
					CAUGHT_IF_eq_1 = IF_eq_1;
				} catch (Exception e) {
					CAUGHT_IF_eq_1 = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_IF_eq_1, LatinoTables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LatinoPackage.LLAMADA__FUNCION:
			return getFuncion();
		case LatinoPackage.LLAMADA__ARGUMENTOS:
			return getArgumentos();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case LatinoPackage.LLAMADA__FUNCION:
			setFuncion((String) newValue);
			return;
		case LatinoPackage.LLAMADA__ARGUMENTOS:
			getArgumentos().clear();
			getArgumentos().addAll((Collection<? extends String>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case LatinoPackage.LLAMADA__FUNCION:
			setFuncion(FUNCION_EDEFAULT);
			return;
		case LatinoPackage.LLAMADA__ARGUMENTOS:
			getArgumentos().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case LatinoPackage.LLAMADA__FUNCION:
			return FUNCION_EDEFAULT == null ? funcion != null : !FUNCION_EDEFAULT.equals(funcion);
		case LatinoPackage.LLAMADA__ARGUMENTOS:
			return argumentos != null && !argumentos.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case LatinoPackage.LLAMADA___VARIABLES_DECLARADAS__DIAGNOSTICCHAIN_MAP:
			return VariablesDeclaradas((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case LatinoPackage.LLAMADA___OPERANDOS_NUMERICOS__DIAGNOSTICCHAIN_MAP:
			return OperandosNumericos((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case LatinoPackage.LLAMADA___FUNCION_DECLARADA__DIAGNOSTICCHAIN_MAP:
			return FuncionDeclarada((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case LatinoPackage.LLAMADA___ARGUMENTOS_COMPLETOS__DIAGNOSTICCHAIN_MAP:
			return ArgumentosCompletos((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (funcion: ");
		result.append(funcion);
		result.append(", argumentos: ");
		result.append(argumentos);
		result.append(')');
		return result.toString();
	}

} //LlamadaImpl
