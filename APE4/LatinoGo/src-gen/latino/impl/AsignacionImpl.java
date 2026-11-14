/**
 */
package latino.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Map;
import latino.Asignacion;
import latino.LatinoPackage;
import latino.LatinoTables;
import latino.Programa;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.pivot.StandardLibrary;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorSingleIterationManager;
import org.eclipse.ocl.pivot.library.AbstractBinaryOperation;
import org.eclipse.ocl.pivot.library.LibraryIteration.LibraryIterationExtension;
import org.eclipse.ocl.pivot.library.classifier.ClassifierOclContentsOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionSelectByKindOperation;
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
import org.eclipse.ocl.pivot.values.SetValue;
import org.eclipse.ocl.pivot.values.SetValue.Accumulator;
import org.eclipse.ocl.pivot.values.TupleValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asignacion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link latino.impl.AsignacionImpl#getValor <em>Valor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AsignacionImpl extends DefinicionImpl implements Asignacion {
	/**
	 * The default value of the '{@link #getValor() <em>Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValor()
	 * @generated
	 * @ordered
	 */
	protected static final String VALOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValor() <em>Valor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValor()
	 * @generated
	 * @ordered
	 */
	protected String valor = VALOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AsignacionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LatinoPackage.Literals.ASIGNACION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValor() {
		return valor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValor(String newValor) {
		String oldValor = valor;
		valor = newValor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LatinoPackage.ASIGNACION__VALOR, oldValor, valor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean VariablesDeclaradas(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Asignacion::VariablesDeclaradas";
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
			 *           status : Boolean[1] = usaSoloVariablesDefinidas(valor)
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'El valor usa una variable que no existe', severity = -1, status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					LatinoPackage.Literals.ASIGNACION___VARIABLES_DECLARADAS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, LatinoTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_IF_status;
				try {
					final /*@NonInvalid*/ String valor = this.getValor();
					final /*@Thrown*/ boolean status = this.usaSoloVariablesDefinidas(valor);
					/*@Thrown*/ Object IF_status;
					if (status) {
						IF_status = ValueUtil.TRUE_VALUE;
					} else {
						final /*@NonInvalid*/ IntegerValue diff = (IntegerValue) NumericNegateOperation.INSTANCE
								.evaluate(LatinoTables.INT_1);
						final /*@Thrown*/ TupleValue TUP_ = ValueUtil.createTupleOfEach(LatinoTables.TUPLid_,
								LatinoTables.STR_El_32_valor_32_usa_32_una_32_variable_32_que_32_no_32_existe, diff,
								status);
						IF_status = TUP_;
					}
					CAUGHT_IF_status = IF_status;
				} catch (Exception e) {
					CAUGHT_IF_status = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_IF_status, LatinoTables.INT_0)
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
	public boolean TipoConsistente(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Asignacion::TipoConsistente";
		try {
			/**
			 *
			 * inv TipoConsistente:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = not usaSoloVariablesDefinidas(valor) or
			 *           let mio : String[?] = tipoTexto(valor)
			 *           in mio = 'desconocido' or
			 *             programa()
			 *             .oclAsType(OclElement)
			 *             ->closure(e | e.oclContents())
			 *             ->selectByKind(Asignacion)
			 *             ->select(a | a.nombre = self.nombre and
			 *               a.usaSoloVariablesDefinidas(a.valor))
			 *             ->forAll(a |
			 *               let otro : String[?] = a.tipoTexto(a.valor)
			 *               in otro = 'desconocido' or otro = mio)
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'La variable cambia de tipo, no mezcles numeros, textos y logicos', severity = -1, status = status
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
					LatinoPackage.Literals.ASIGNACION___TIPO_CONSISTENTE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, LatinoTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_IF_eq_3;
				try {
					/*@Caught*/ Object CAUGHT_not;
					try {
						/*@Caught*/ Object CAUGHT_usaSoloVariablesDefinidas;
						try {
							final /*@NonInvalid*/ String valor = this.getValor();
							final /*@Thrown*/ boolean usaSoloVariablesDefinidas = this.usaSoloVariablesDefinidas(valor);
							CAUGHT_usaSoloVariablesDefinidas = usaSoloVariablesDefinidas;
						} catch (Exception e) {
							CAUGHT_usaSoloVariablesDefinidas = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_usaSoloVariablesDefinidas instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_usaSoloVariablesDefinidas;
						}
						final /*@Thrown*/ Boolean not;
						if (CAUGHT_usaSoloVariablesDefinidas == ValueUtil.FALSE_VALUE) {
							not = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_usaSoloVariablesDefinidas == ValueUtil.TRUE_VALUE) {
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
						/*@Caught*/ Object CAUGHT_or_0;
						try {
							/*@Caught*/ Object CAUGHT_mio;
							try {
								final /*@NonInvalid*/ String valor_0 = this.getValor();
								final /*@Thrown*/ String mio = this.tipoTexto(valor_0);
								CAUGHT_mio = mio;
							} catch (Exception e) {
								CAUGHT_mio = ValueUtil.createInvalidValue(e);
							}
							/*@Caught*/ Object CAUGHT_eq;
							try {
								if (CAUGHT_mio instanceof InvalidValueException) {
									throw (InvalidValueException) CAUGHT_mio;
								}
								final /*@Thrown*/ boolean eq = CAUGHT_mio.equals(LatinoTables.STR_desconocido);
								CAUGHT_eq = eq;
							} catch (Exception e) {
								CAUGHT_eq = ValueUtil.createInvalidValue(e);
							}
							final /*@Thrown*/ Boolean or_0;
							if (CAUGHT_eq == ValueUtil.TRUE_VALUE) {
								or_0 = ValueUtil.TRUE_VALUE;
							} else {
								/*@Caught*/ Object CAUGHT_forAll;
								try {
									final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_OclElement_0 = idResolver
											.getClass(LatinoTables.CLSSid_OclElement, null);
									final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_latino_c_c_Asignacion = idResolver
											.getClass(LatinoTables.CLSSid_Asignacion, null);
									final /*@NonInvalid*/ Programa programa = this.programa();
									final /*@Thrown*/ Object oclAsType = OclAnyOclAsTypeOperation.INSTANCE
											.evaluate(executor, programa, TYP_OclElement_0);
									final /*@Thrown*/ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE
											.evaluate(executor, LatinoTables.SET_CLSSid_OclElement, oclAsType);
									final org.eclipse.ocl.pivot.Class TYPE_closure_0 = executor
											.getStaticTypeOfValue(null, oclAsSet);
									final LibraryIterationExtension IMPL_closure_0 = (LibraryIterationExtension) TYPE_closure_0
											.lookupImplementation(standardLibrary,
													OCLstdlibTables.Operations._Set__closure);
									final /*@NonNull*/ Object ACC_closure_0 = IMPL_closure_0.createAccumulatorValue(
											executor, LatinoTables.SET_CLSSid_OclElement,
											LatinoTables.SET_CLSSid_OclElement);
									/**
									 * Implementation of the iterator body.
									 */
									final AbstractBinaryOperation BODY_closure_0 = new AbstractBinaryOperation() {
										/**
										 * e.oclContents()
										 */
										@Override
										public /*@Nullable*/ Object evaluate(final Executor executor,
												final TypeId typeId, final /*@Nullable*/ Object oclAsSet,
												final /*@NonInvalid*/ Object e_0) {
											if (e_0 == null) {
												throw new InvalidValueException(
														"Null \'\'OclElement\'\' rather than \'\'OclVoid\'\' value required");
											}
											final /*@Thrown*/ SetValue oclContents = ClassifierOclContentsOperation.INSTANCE
													.evaluate(executor, LatinoTables.SET_CLSSid_OclElement, e_0);
											return oclContents;
										}
									};
									final ExecutorSingleIterationManager MGR_closure_0 = new ExecutorSingleIterationManager(
											executor, LatinoTables.SET_CLSSid_OclElement, BODY_closure_0, oclAsSet,
											ACC_closure_0);
									final /*@Thrown*/ SetValue closure = (SetValue) IMPL_closure_0
											.evaluateIteration(MGR_closure_0);
									final /*@Thrown*/ SetValue selectByKind = (SetValue) CollectionSelectByKindOperation.INSTANCE
											.evaluate(executor, closure, TYP_latino_c_c_Asignacion);
									/*@Thrown*/ Accumulator accumulator = ValueUtil
											.createSetAccumulatorValue(LatinoTables.SET_CLSSid_Asignacion);
									Iterator<Object> ITERATOR_a = selectByKind.iterator();
									/*@Thrown*/ SetValue select;
									while (true) {
										if (!ITERATOR_a.hasNext()) {
											select = accumulator;
											break;
										}
										/*@NonInvalid*/ Asignacion a = (Asignacion) ITERATOR_a.next();
										/**
										 * a.nombre = self.nombre and a.usaSoloVariablesDefinidas(a.valor)
										 */
										final /*@NonInvalid*/ String nombre_0 = a.getNombre();
										final /*@NonInvalid*/ String nombre_1 = this.getNombre();
										final /*@NonInvalid*/ boolean eq_0 = (nombre_0 != null)
												? nombre_0.equals(nombre_1)
												: (nombre_1 == null);
										final /*@Thrown*/ Boolean and;
										if (!eq_0) {
											and = ValueUtil.FALSE_VALUE;
										} else {
											/*@Caught*/ Object CAUGHT_usaSoloVariablesDefinidas_0;
											try {
												final /*@NonInvalid*/ String valor_1 = a.getValor();
												final /*@Thrown*/ boolean usaSoloVariablesDefinidas_0 = a
														.usaSoloVariablesDefinidas(valor_1);
												CAUGHT_usaSoloVariablesDefinidas_0 = usaSoloVariablesDefinidas_0;
											} catch (Exception e) {
												CAUGHT_usaSoloVariablesDefinidas_0 = ValueUtil.createInvalidValue(e);
											}
											if (CAUGHT_usaSoloVariablesDefinidas_0 == ValueUtil.FALSE_VALUE) {
												and = ValueUtil.FALSE_VALUE;
											} else {
												if (CAUGHT_usaSoloVariablesDefinidas_0 instanceof InvalidValueException) {
													throw (InvalidValueException) CAUGHT_usaSoloVariablesDefinidas_0;
												}
												and = ValueUtil.TRUE_VALUE;
											}
										}
										if (and == null) {
											throw new InvalidValueException(
													"Null body for \'Set(T).select(Set.T[?] | Lambda T() : Boolean[1]) : Set(T)\'");
										}
										//
										if (and == ValueUtil.TRUE_VALUE) {
											accumulator.add(a);
										}
									}
									/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
									Iterator<Object> ITERATOR_a_0 = select.iterator();
									/*@Thrown*/ Boolean forAll;
									while (true) {
										if (!ITERATOR_a_0.hasNext()) {
											if (accumulator_0 == null) {
												forAll = null;
											} else if (accumulator_0 == ValueUtil.TRUE_VALUE) {
												forAll = ValueUtil.TRUE_VALUE;
											} else {
												throw (InvalidValueException) accumulator_0;
											}
											break;
										}
										/*@NonInvalid*/ Asignacion a_0 = (Asignacion) ITERATOR_a_0.next();
										/**
										 *
										 * let otro : String[?] = a.tipoTexto(a.valor)
										 * in otro = 'desconocido' or otro = mio
										 */
										/*@Caught*/ Object CAUGHT_or;
										try {
											/*@Caught*/ Object CAUGHT_otro;
											try {
												final /*@NonInvalid*/ String valor_2 = a_0.getValor();
												final /*@Thrown*/ String otro = a_0.tipoTexto(valor_2);
												CAUGHT_otro = otro;
											} catch (Exception e) {
												CAUGHT_otro = ValueUtil.createInvalidValue(e);
											}
											/*@Caught*/ Object CAUGHT_eq_1;
											try {
												if (CAUGHT_otro instanceof InvalidValueException) {
													throw (InvalidValueException) CAUGHT_otro;
												}
												final /*@Thrown*/ boolean eq_1 = CAUGHT_otro
														.equals(LatinoTables.STR_desconocido);
												CAUGHT_eq_1 = eq_1;
											} catch (Exception e) {
												CAUGHT_eq_1 = ValueUtil.createInvalidValue(e);
											}
											final /*@Thrown*/ Boolean or;
											if (CAUGHT_eq_1 == ValueUtil.TRUE_VALUE) {
												or = ValueUtil.TRUE_VALUE;
											} else {
												/*@Caught*/ Object CAUGHT_eq_2;
												try {
													if (CAUGHT_otro instanceof InvalidValueException) {
														throw (InvalidValueException) CAUGHT_otro;
													}
													if (CAUGHT_mio instanceof InvalidValueException) {
														throw (InvalidValueException) CAUGHT_mio;
													}
													final /*@Thrown*/ boolean eq_2 = CAUGHT_otro.equals(CAUGHT_mio);
													CAUGHT_eq_2 = eq_2;
												} catch (Exception e) {
													CAUGHT_eq_2 = ValueUtil.createInvalidValue(e);
												}
												if (CAUGHT_eq_2 == ValueUtil.TRUE_VALUE) {
													or = ValueUtil.TRUE_VALUE;
												} else {
													if (CAUGHT_eq_1 instanceof InvalidValueException) {
														throw (InvalidValueException) CAUGHT_eq_1;
													}
													if (CAUGHT_eq_2 instanceof InvalidValueException) {
														throw (InvalidValueException) CAUGHT_eq_2;
													}
													or = ValueUtil.FALSE_VALUE;
												}
											}
											CAUGHT_or = or;
										} catch (Exception e) {
											CAUGHT_or = ValueUtil.createInvalidValue(e);
										}
										//
										if (CAUGHT_or == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
											forAll = ValueUtil.FALSE_VALUE;
											break; // Stop immediately
										} else if (CAUGHT_or == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
											; // Carry on
										} else if (CAUGHT_or == null) { // Abnormal null body evaluation result
											if (accumulator_0 == ValueUtil.TRUE_VALUE) {
												accumulator_0 = null; // Cache a null failure
											}
										} else if (CAUGHT_or instanceof InvalidValueException) { // Abnormal exception evaluation result
											accumulator_0 = CAUGHT_or; // Cache an exception failure
										} else { // Impossible badly typed result
											accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody,
													"forAll");
										}
									}
									CAUGHT_forAll = forAll;
								} catch (Exception e) {
									CAUGHT_forAll = ValueUtil.createInvalidValue(e);
								}
								if (CAUGHT_forAll == ValueUtil.TRUE_VALUE) {
									or_0 = ValueUtil.TRUE_VALUE;
								} else {
									if (CAUGHT_eq instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_eq;
									}
									if (CAUGHT_forAll instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_forAll;
									}
									if (CAUGHT_forAll == null) {
										or_0 = null;
									} else {
										or_0 = ValueUtil.FALSE_VALUE;
									}
								}
							}
							CAUGHT_or_0 = or_0;
						} catch (Exception e) {
							CAUGHT_or_0 = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_or_0 == ValueUtil.TRUE_VALUE) {
							status = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_not instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_not;
							}
							if (CAUGHT_or_0 instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_or_0;
							}
							if ((CAUGHT_not == null) || (CAUGHT_or_0 == null)) {
								status = null;
							} else {
								status = ValueUtil.FALSE_VALUE;
							}
						}
					}
					final /*@Thrown*/ boolean eq_3 = status == Boolean.TRUE;
					/*@Thrown*/ Object IF_eq_3;
					if (eq_3) {
						IF_eq_3 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@NonInvalid*/ IntegerValue diff = (IntegerValue) NumericNegateOperation.INSTANCE
								.evaluate(LatinoTables.INT_1);
						final /*@Thrown*/ TupleValue TUP_ = ValueUtil.createTupleOfEach(LatinoTables.TUPLid_,
								LatinoTables.STR_La_32_variable_32_cambia_32_de_32_tipo_44_32_no_32_mezcles_32_numeros_44_32_textos_32_y_32_logicos,
								diff, status);
						IF_eq_3 = TUP_;
					}
					CAUGHT_IF_eq_3 = IF_eq_3;
				} catch (Exception e) {
					CAUGHT_IF_eq_3 = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_IF_eq_3, LatinoTables.INT_0)
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
		final String constraintName = "Asignacion::OperandosNumericos";
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
			 *           status : Boolean[?] = not usaSoloVariablesDefinidas(valor) or
			 *           operandosNumericos(valor)
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
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					LatinoPackage.Literals.ASIGNACION___OPERANDOS_NUMERICOS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, LatinoTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_IF_eq;
				try {
					/*@Caught*/ Object CAUGHT_not;
					try {
						/*@Caught*/ Object CAUGHT_usaSoloVariablesDefinidas;
						try {
							final /*@NonInvalid*/ String valor = this.getValor();
							final /*@Thrown*/ boolean usaSoloVariablesDefinidas = this.usaSoloVariablesDefinidas(valor);
							CAUGHT_usaSoloVariablesDefinidas = usaSoloVariablesDefinidas;
						} catch (Exception e) {
							CAUGHT_usaSoloVariablesDefinidas = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_usaSoloVariablesDefinidas instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_usaSoloVariablesDefinidas;
						}
						final /*@Thrown*/ Boolean not;
						if (CAUGHT_usaSoloVariablesDefinidas == ValueUtil.FALSE_VALUE) {
							not = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_usaSoloVariablesDefinidas == ValueUtil.TRUE_VALUE) {
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
						/*@Caught*/ Object CAUGHT_operandosNumericos;
						try {
							final /*@NonInvalid*/ String valor_0 = this.getValor();
							final /*@Thrown*/ boolean operandosNumericos = this.operandosNumericos(valor_0);
							CAUGHT_operandosNumericos = operandosNumericos;
						} catch (Exception e) {
							CAUGHT_operandosNumericos = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_operandosNumericos == ValueUtil.TRUE_VALUE) {
							status = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_not instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_not;
							}
							if (CAUGHT_operandosNumericos instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_operandosNumericos;
							}
							if (CAUGHT_not == null) {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LatinoPackage.ASIGNACION__VALOR:
			return getValor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case LatinoPackage.ASIGNACION__VALOR:
			setValor((String) newValue);
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
		case LatinoPackage.ASIGNACION__VALOR:
			setValor(VALOR_EDEFAULT);
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
		case LatinoPackage.ASIGNACION__VALOR:
			return VALOR_EDEFAULT == null ? valor != null : !VALOR_EDEFAULT.equals(valor);
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
		case LatinoPackage.ASIGNACION___VARIABLES_DECLARADAS__DIAGNOSTICCHAIN_MAP:
			return VariablesDeclaradas((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case LatinoPackage.ASIGNACION___OPERANDOS_NUMERICOS__DIAGNOSTICCHAIN_MAP:
			return OperandosNumericos((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case LatinoPackage.ASIGNACION___TIPO_CONSISTENTE__DIAGNOSTICCHAIN_MAP:
			return TipoConsistente((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
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
		result.append(" (valor: ");
		result.append(valor);
		result.append(')');
		return result.toString();
	}

} //AsignacionImpl
