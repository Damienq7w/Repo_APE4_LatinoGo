/**
 */
package latino.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import latino.Asignacion;
import latino.Caso;
import latino.Elegir;
import latino.LatinoPackage;
import latino.LatinoTables;
import latino.Programa;
import latino.Sentencia;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.StandardLibrary;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.internal.library.executor.ExecutorSingleIterationManager;

import org.eclipse.ocl.pivot.library.AbstractBinaryOperation;

import org.eclipse.ocl.pivot.library.LibraryIteration.LibraryIterationExtension;

import org.eclipse.ocl.pivot.library.classifier.ClassifierOclContentsOperation;

import org.eclipse.ocl.pivot.library.collection.CollectionAsSetOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionExcludingOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionIncludingOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionSelectByKindOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionUnionOperation;

import org.eclipse.ocl.pivot.library.numeric.NumericNegateOperation;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.BagValue;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;

import org.eclipse.ocl.pivot.values.SequenceValue.Accumulator;

import org.eclipse.ocl.pivot.values.SetValue;
import org.eclipse.ocl.pivot.values.TupleValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elegir</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link latino.impl.ElegirImpl#getExpresion <em>Expresion</em>}</li>
 *   <li>{@link latino.impl.ElegirImpl#getCasos <em>Casos</em>}</li>
 *   <li>{@link latino.impl.ElegirImpl#getDefecto <em>Defecto</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElegirImpl extends SentenciaImpl implements Elegir {
	/**
	 * The default value of the '{@link #getExpresion() <em>Expresion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpresion()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpresion() <em>Expresion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpresion()
	 * @generated
	 * @ordered
	 */
	protected String expresion = EXPRESION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCasos() <em>Casos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCasos()
	 * @generated
	 * @ordered
	 */
	protected EList<Caso> casos;

	/**
	 * The cached value of the '{@link #getDefecto() <em>Defecto</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefecto()
	 * @generated
	 * @ordered
	 */
	protected EList<Sentencia> defecto;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElegirImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LatinoPackage.Literals.ELEGIR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExpresion() {
		return expresion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpresion(String newExpresion) {
		String oldExpresion = expresion;
		expresion = newExpresion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LatinoPackage.ELEGIR__EXPRESION, oldExpresion,
					expresion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Caso> getCasos() {
		if (casos == null) {
			casos = new EObjectContainmentEList<Caso>(Caso.class, this, LatinoPackage.ELEGIR__CASOS);
		}
		return casos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Sentencia> getDefecto() {
		if (defecto == null) {
			defecto = new EObjectContainmentEList<Sentencia>(Sentencia.class, this, LatinoPackage.ELEGIR__DEFECTO);
		}
		return defecto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean CasosMismoTipo(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Elegir::CasosMismoTipo";
		try {
			/**
			 *
			 * inv CasosMismoTipo:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = not usaSoloVariablesDefinidas(expresion) or
			 *           casos->collect(c | c.valores)
			 *           ->collect(v | tipoTexto(v))
			 *           ->asSet()
			 *           ->union(
			 *             programa()
			 *             .oclAsType(OclElement)
			 *             ->closure(e | e.oclContents())
			 *             ->selectByKind(Asignacion)
			 *             ->select(a | a.nombre = expresion)
			 *             ->collect(a | a.tipoTexto(a.valor))
			 *             ->asSet())
			 *           ->including(tipoTexto(expresion))
			 *           ->excluding('desconocido')
			 *           ->size() <= 1
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'Los casos deben ser del mismo tipo que lo que se elige, numeros o textos', severity = -1, status = status
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
					LatinoPackage.Literals.ELEGIR___CASOS_MISMO_TIPO__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, LatinoTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_IF_eq_0;
				try {
					/*@Caught*/ Object CAUGHT_not;
					try {
						/*@Caught*/ Object CAUGHT_usaSoloVariablesDefinidas;
						try {
							final /*@NonInvalid*/ String expresion = this.getExpresion();
							final /*@Thrown*/ boolean usaSoloVariablesDefinidas = this
									.usaSoloVariablesDefinidas(expresion);
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
						/*@Caught*/ Object CAUGHT_le_0;
						try {
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_OclElement_0 = idResolver
									.getClass(LatinoTables.CLSSid_OclElement, null);
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_latino_c_c_Asignacion_0 = idResolver
									.getClass(LatinoTables.CLSSid_Asignacion, null);
							final /*@NonInvalid*/ String expresion_1 = this.getExpresion();
							final /*@NonInvalid*/ List<Caso> casos = this.getCasos();
							final /*@NonInvalid*/ OrderedSetValue BOXED_casos = idResolver
									.createOrderedSetOfAll(LatinoTables.ORD_CLSSid_Caso, casos);
							/*@Thrown*/ Accumulator accumulator = ValueUtil
									.createSequenceAccumulatorValue(LatinoTables.SEQ_PRIMid_String);
							Iterator<Object> ITERATOR_c = BOXED_casos.iterator();
							/*@NonInvalid*/ SequenceValue collect_0;
							while (true) {
								if (!ITERATOR_c.hasNext()) {
									collect_0 = accumulator;
									break;
								}
								/*@NonInvalid*/ Caso c = (Caso) ITERATOR_c.next();
								/**
								 * c.valores
								 */
								final /*@NonInvalid*/ List<String> valores = c.getValores();
								final /*@NonInvalid*/ SequenceValue BOXED_valores = idResolver
										.createSequenceOfAll(LatinoTables.SEQ_PRIMid_String_2, valores);
								//
								for (Object value : BOXED_valores.flatten().getElements()) {
									accumulator.add(value);
								}
							}
							/*@Thrown*/ Accumulator accumulator_0 = ValueUtil
									.createSequenceAccumulatorValue(LatinoTables.SEQ_PRIMid_String_0);
							Iterator<Object> ITERATOR_v = collect_0.iterator();
							/*@NonInvalid*/ SequenceValue collect;
							while (true) {
								if (!ITERATOR_v.hasNext()) {
									collect = accumulator_0;
									break;
								}
								/*@NonInvalid*/ String v = (String) ITERATOR_v.next();
								/**
								 * tipoTexto(v)
								 */
								final /*@NonInvalid*/ String tipoTexto = this.tipoTexto(v);
								//
								accumulator_0.add(tipoTexto);
							}
							final /*@NonInvalid*/ SetValue asSet = CollectionAsSetOperation.INSTANCE.evaluate(collect);
							final /*@NonInvalid*/ Programa programa = this.programa();
							final /*@Thrown*/ Object oclAsType = OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor,
									programa, TYP_OclElement_0);
							final /*@Thrown*/ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor,
									LatinoTables.SET_CLSSid_OclElement, oclAsType);
							final org.eclipse.ocl.pivot.Class TYPE_closure_0 = executor.getStaticTypeOfValue(null,
									oclAsSet);
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
							final ExecutorSingleIterationManager MGR_closure_0 = new ExecutorSingleIterationManager(
									executor, LatinoTables.SET_CLSSid_OclElement, BODY_closure_0, oclAsSet,
									ACC_closure_0);
							final /*@Thrown*/ SetValue closure = (SetValue) IMPL_closure_0
									.evaluateIteration(MGR_closure_0);
							final /*@Thrown*/ SetValue selectByKind = (SetValue) CollectionSelectByKindOperation.INSTANCE
									.evaluate(executor, closure, TYP_latino_c_c_Asignacion_0);
							/*@Thrown*/ org.eclipse.ocl.pivot.values.SetValue.Accumulator accumulator_1 = ValueUtil
									.createSetAccumulatorValue(LatinoTables.SET_CLSSid_Asignacion);
							Iterator<Object> ITERATOR_a = selectByKind.iterator();
							/*@Thrown*/ SetValue select;
							while (true) {
								if (!ITERATOR_a.hasNext()) {
									select = accumulator_1;
									break;
								}
								/*@NonInvalid*/ Asignacion a = (Asignacion) ITERATOR_a.next();
								/**
								 * a.nombre = expresion
								 */
								final /*@NonInvalid*/ String nombre_0 = a.getNombre();
								final /*@NonInvalid*/ boolean eq = (nombre_0 != null) ? nombre_0.equals(expresion_1)
										: (expresion_1 == null);
								//
								if (eq) {
									accumulator_1.add(a);
								}
							}
							/*@Thrown*/ org.eclipse.ocl.pivot.values.BagValue.Accumulator accumulator_2 = ValueUtil
									.createBagAccumulatorValue(LatinoTables.BAG_PRIMid_String);
							Iterator<Object> ITERATOR_a_0 = select.iterator();
							/*@Thrown*/ BagValue collect_1;
							while (true) {
								if (!ITERATOR_a_0.hasNext()) {
									collect_1 = accumulator_2;
									break;
								}
								/*@NonInvalid*/ Asignacion a_0 = (Asignacion) ITERATOR_a_0.next();
								/**
								 * a.tipoTexto(a.valor)
								 */
								final /*@NonInvalid*/ String valor = a_0.getValor();
								final /*@Thrown*/ String tipoTexto_0 = a_0.tipoTexto(valor);
								//
								accumulator_2.add(tipoTexto_0);
							}
							final /*@Thrown*/ SetValue asSet_0 = CollectionAsSetOperation.INSTANCE.evaluate(collect_1);
							if (asSet_0 instanceof InvalidValueException) {
								throw (InvalidValueException) asSet_0;
							}
							final /*@Thrown*/ SetValue union = (SetValue) CollectionUnionOperation.INSTANCE
									.evaluate(asSet, asSet_0);
							final /*@Thrown*/ String tipoTexto_1 = this.tipoTexto(expresion_1);
							final /*@Thrown*/ SetValue including = (SetValue) CollectionIncludingOperation.INSTANCE
									.evaluate(union, tipoTexto_1);
							final /*@Thrown*/ SetValue excluding = (SetValue) CollectionExcludingOperation.INSTANCE
									.evaluate(including, LatinoTables.STR_desconocido);
							final /*@Thrown*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(excluding);
							final /*@Thrown*/ boolean le_0 = OclComparableLessThanEqualOperation.INSTANCE
									.evaluate(executor, size, LatinoTables.INT_1).booleanValue();
							CAUGHT_le_0 = le_0;
						} catch (Exception e) {
							CAUGHT_le_0 = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_le_0 == ValueUtil.TRUE_VALUE) {
							status = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_not instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_not;
							}
							if (CAUGHT_le_0 instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_le_0;
							}
							if (CAUGHT_not == null) {
								status = null;
							} else {
								status = ValueUtil.FALSE_VALUE;
							}
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
								LatinoTables.STR_Los_32_casos_32_deben_32_ser_32_del_32_mismo_32_tipo_32_que_32_lo_32_que_32_se_32_elige_44_32_numeros_32,
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
	public boolean VariablesDeclaradas(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Elegir::VariablesDeclaradas";
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
			 *           status : Boolean[1] = usaSoloVariablesDefinidas(expresion)
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'El elegir usa una variable que no existe', severity = -1, status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					LatinoPackage.Literals.ELEGIR___VARIABLES_DECLARADAS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, LatinoTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_IF_status;
				try {
					final /*@NonInvalid*/ String expresion = this.getExpresion();
					final /*@Thrown*/ boolean status = this.usaSoloVariablesDefinidas(expresion);
					/*@Thrown*/ Object IF_status;
					if (status) {
						IF_status = ValueUtil.TRUE_VALUE;
					} else {
						final /*@NonInvalid*/ IntegerValue diff = (IntegerValue) NumericNegateOperation.INSTANCE
								.evaluate(LatinoTables.INT_1);
						final /*@Thrown*/ TupleValue TUP_ = ValueUtil.createTupleOfEach(LatinoTables.TUPLid_,
								LatinoTables.STR_El_32_elegir_32_usa_32_una_32_variable_32_que_32_no_32_existe, diff,
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
	public boolean CasoRepetido(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Elegir::CasoRepetido";
		try {
			/**
			 *
			 * inv CasoRepetido:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[1] = casos->collect(c | c.valores)
			 *           ->size() =
			 *           casos->collect(c | c.valores)
			 *           ->asSet()
			 *           ->size()
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'Ese valor ya esta en otro caso del elegir', severity = -1, status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					LatinoPackage.Literals.ELEGIR___CASO_REPETIDO__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, LatinoTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				final /*@NonInvalid*/ List<Caso> casos = this.getCasos();
				final /*@NonInvalid*/ OrderedSetValue BOXED_casos = idResolver
						.createOrderedSetOfAll(LatinoTables.ORD_CLSSid_Caso, casos);
				/*@Thrown*/ Accumulator accumulator = ValueUtil
						.createSequenceAccumulatorValue(LatinoTables.SEQ_PRIMid_String);
				Iterator<Object> ITERATOR_c = BOXED_casos.iterator();
				/*@NonInvalid*/ SequenceValue collect;
				while (true) {
					if (!ITERATOR_c.hasNext()) {
						collect = accumulator;
						break;
					}
					/*@NonInvalid*/ Caso c = (Caso) ITERATOR_c.next();
					/**
					 * c.valores
					 */
					final /*@NonInvalid*/ List<String> valores = c.getValores();
					final /*@NonInvalid*/ SequenceValue BOXED_valores = idResolver
							.createSequenceOfAll(LatinoTables.SEQ_PRIMid_String_2, valores);
					//
					for (Object value : BOXED_valores.flatten().getElements()) {
						accumulator.add(value);
					}
				}
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(collect);
				final /*@NonInvalid*/ SetValue asSet = CollectionAsSetOperation.INSTANCE.evaluate(collect);
				final /*@NonInvalid*/ IntegerValue size_0 = CollectionSizeOperation.INSTANCE.evaluate(asSet);
				final /*@NonInvalid*/ boolean status = size.equals(size_0);
				/*@NonInvalid*/ Object IF_status;
				if (status) {
					IF_status = ValueUtil.TRUE_VALUE;
				} else {
					final /*@NonInvalid*/ IntegerValue diff = (IntegerValue) NumericNegateOperation.INSTANCE
							.evaluate(LatinoTables.INT_1);
					final /*@NonInvalid*/ TupleValue TUP_ = ValueUtil.createTupleOfEach(LatinoTables.TUPLid_,
							LatinoTables.STR_Ese_32_valor_32_ya_32_esta_32_en_32_otro_32_caso_32_del_32_elegir, diff,
							status);
					IF_status = TUP_;
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, IF_status, LatinoTables.INT_0)
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case LatinoPackage.ELEGIR__CASOS:
			return ((InternalEList<?>) getCasos()).basicRemove(otherEnd, msgs);
		case LatinoPackage.ELEGIR__DEFECTO:
			return ((InternalEList<?>) getDefecto()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LatinoPackage.ELEGIR__EXPRESION:
			return getExpresion();
		case LatinoPackage.ELEGIR__CASOS:
			return getCasos();
		case LatinoPackage.ELEGIR__DEFECTO:
			return getDefecto();
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
		case LatinoPackage.ELEGIR__EXPRESION:
			setExpresion((String) newValue);
			return;
		case LatinoPackage.ELEGIR__CASOS:
			getCasos().clear();
			getCasos().addAll((Collection<? extends Caso>) newValue);
			return;
		case LatinoPackage.ELEGIR__DEFECTO:
			getDefecto().clear();
			getDefecto().addAll((Collection<? extends Sentencia>) newValue);
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
		case LatinoPackage.ELEGIR__EXPRESION:
			setExpresion(EXPRESION_EDEFAULT);
			return;
		case LatinoPackage.ELEGIR__CASOS:
			getCasos().clear();
			return;
		case LatinoPackage.ELEGIR__DEFECTO:
			getDefecto().clear();
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
		case LatinoPackage.ELEGIR__EXPRESION:
			return EXPRESION_EDEFAULT == null ? expresion != null : !EXPRESION_EDEFAULT.equals(expresion);
		case LatinoPackage.ELEGIR__CASOS:
			return casos != null && !casos.isEmpty();
		case LatinoPackage.ELEGIR__DEFECTO:
			return defecto != null && !defecto.isEmpty();
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
		case LatinoPackage.ELEGIR___CASOS_MISMO_TIPO__DIAGNOSTICCHAIN_MAP:
			return CasosMismoTipo((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case LatinoPackage.ELEGIR___VARIABLES_DECLARADAS__DIAGNOSTICCHAIN_MAP:
			return VariablesDeclaradas((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case LatinoPackage.ELEGIR___CASO_REPETIDO__DIAGNOSTICCHAIN_MAP:
			return CasoRepetido((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
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
		result.append(" (expresion: ");
		result.append(expresion);
		result.append(')');
		return result.toString();
	}

} //ElegirImpl
