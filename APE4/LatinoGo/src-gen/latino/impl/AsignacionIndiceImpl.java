/**
 */
package latino.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import latino.AsignacionIndice;
import latino.LatinoPackage;
import latino.LatinoTables;
import latino.Lista;
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
import org.eclipse.ocl.pivot.values.SequenceValue;
import org.eclipse.ocl.pivot.values.SetValue;

import org.eclipse.ocl.pivot.values.SetValue.Accumulator;

import org.eclipse.ocl.pivot.values.TupleValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asignacion Indice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link latino.impl.AsignacionIndiceImpl#getLista <em>Lista</em>}</li>
 *   <li>{@link latino.impl.AsignacionIndiceImpl#getIndice <em>Indice</em>}</li>
 *   <li>{@link latino.impl.AsignacionIndiceImpl#getValor <em>Valor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AsignacionIndiceImpl extends SentenciaImpl implements AsignacionIndice {
	/**
	 * The default value of the '{@link #getLista() <em>Lista</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLista()
	 * @generated
	 * @ordered
	 */
	protected static final String LISTA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLista() <em>Lista</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLista()
	 * @generated
	 * @ordered
	 */
	protected String lista = LISTA_EDEFAULT;

	/**
	 * The default value of the '{@link #getIndice() <em>Indice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndice()
	 * @generated
	 * @ordered
	 */
	protected static final String INDICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndice() <em>Indice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndice()
	 * @generated
	 * @ordered
	 */
	protected String indice = INDICE_EDEFAULT;

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
	protected AsignacionIndiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LatinoPackage.Literals.ASIGNACION_INDICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLista() {
		return lista;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLista(String newLista) {
		String oldLista = lista;
		lista = newLista;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LatinoPackage.ASIGNACION_INDICE__LISTA, oldLista,
					lista));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIndice() {
		return indice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndice(String newIndice) {
		String oldIndice = indice;
		indice = newIndice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LatinoPackage.ASIGNACION_INDICE__INDICE, oldIndice,
					indice));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LatinoPackage.ASIGNACION_INDICE__VALOR, oldValor,
					valor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean VariablesDeclaradas(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "AsignacionIndice::VariablesDeclaradas";
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
			 *           status : Boolean[?] = usaSoloVariablesDefinidas(indice) and
			 *           usaSoloVariablesDefinidas(valor)
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'El indice o el valor usan una variable que no existe', severity = -1, status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					LatinoPackage.Literals.ASIGNACION_INDICE___VARIABLES_DECLARADAS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, LatinoTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_IF_eq;
				try {
					/*@Caught*/ Object CAUGHT_usaSoloVariablesDefinidas;
					try {
						final /*@NonInvalid*/ String indice = this.getIndice();
						final /*@Thrown*/ boolean usaSoloVariablesDefinidas = this.usaSoloVariablesDefinidas(indice);
						CAUGHT_usaSoloVariablesDefinidas = usaSoloVariablesDefinidas;
					} catch (Exception e) {
						CAUGHT_usaSoloVariablesDefinidas = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean status;
					if (CAUGHT_usaSoloVariablesDefinidas == ValueUtil.FALSE_VALUE) {
						status = ValueUtil.FALSE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_usaSoloVariablesDefinidas_0;
						try {
							final /*@NonInvalid*/ String valor = this.getValor();
							final /*@Thrown*/ boolean usaSoloVariablesDefinidas_0 = this
									.usaSoloVariablesDefinidas(valor);
							CAUGHT_usaSoloVariablesDefinidas_0 = usaSoloVariablesDefinidas_0;
						} catch (Exception e) {
							CAUGHT_usaSoloVariablesDefinidas_0 = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_usaSoloVariablesDefinidas_0 == ValueUtil.FALSE_VALUE) {
							status = ValueUtil.FALSE_VALUE;
						} else {
							if (CAUGHT_usaSoloVariablesDefinidas instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_usaSoloVariablesDefinidas;
							}
							if (CAUGHT_usaSoloVariablesDefinidas_0 instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_usaSoloVariablesDefinidas_0;
							}
							status = ValueUtil.TRUE_VALUE;
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
								LatinoTables.STR_El_32_indice_32_o_32_el_32_valor_32_usan_32_una_32_variable_32_que_32_no_32_existe,
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
	public boolean TipoElemento(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "AsignacionIndice::TipoElemento";
		try {
			/**
			 *
			 * inv TipoElemento:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = not usaSoloVariablesDefinidas(valor) or
			 *           let t : String[?] = tipoTexto(valor)
			 *           in t = 'desconocido' or
			 *             programa()
			 *             .oclAsType(OclElement)
			 *             ->closure(e | e.oclContents())
			 *             ->selectByKind(Lista)
			 *             ->select(l | l.nombre = lista)
			 *             ->forAll(l |
			 *               l.elementos->forAll(e |
			 *                 let o : String[?] = l.tipoTexto(e)
			 *                 in o = 'desconocido' or o = t))
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'El valor no es del mismo tipo que los elementos de la lista', severity = -1, status = status
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
					LatinoPackage.Literals.ASIGNACION_INDICE___TIPO_ELEMENTO__DIAGNOSTICCHAIN_MAP);
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
							/*@Caught*/ Object CAUGHT_t;
							try {
								final /*@NonInvalid*/ String valor_0 = this.getValor();
								final /*@Thrown*/ String t = this.tipoTexto(valor_0);
								CAUGHT_t = t;
							} catch (Exception e) {
								CAUGHT_t = ValueUtil.createInvalidValue(e);
							}
							/*@Caught*/ Object CAUGHT_eq;
							try {
								if (CAUGHT_t instanceof InvalidValueException) {
									throw (InvalidValueException) CAUGHT_t;
								}
								final /*@Thrown*/ boolean eq = CAUGHT_t.equals(LatinoTables.STR_desconocido);
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
									final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_latino_c_c_Lista_0 = idResolver
											.getClass(LatinoTables.CLSSid_Lista, null);
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
											.evaluate(executor, closure, TYP_latino_c_c_Lista_0);
									/*@Thrown*/ Accumulator accumulator = ValueUtil
											.createSetAccumulatorValue(LatinoTables.SET_CLSSid_Lista);
									Iterator<Object> ITERATOR_l = selectByKind.iterator();
									/*@Thrown*/ SetValue select;
									while (true) {
										if (!ITERATOR_l.hasNext()) {
											select = accumulator;
											break;
										}
										/*@NonInvalid*/ Lista l = (Lista) ITERATOR_l.next();
										/**
										 * l.nombre = lista
										 */
										final /*@NonInvalid*/ String nombre_0 = l.getNombre();
										final /*@NonInvalid*/ String lista = this.getLista();
										final /*@NonInvalid*/ boolean eq_0 = (nombre_0 != null) ? nombre_0.equals(lista)
												: (lista == null);
										//
										if (eq_0) {
											accumulator.add(l);
										}
									}
									/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
									Iterator<Object> ITERATOR_l_0 = select.iterator();
									/*@Thrown*/ Boolean forAll;
									while (true) {
										if (!ITERATOR_l_0.hasNext()) {
											if (accumulator_0 == null) {
												forAll = null;
											} else if (accumulator_0 == ValueUtil.TRUE_VALUE) {
												forAll = ValueUtil.TRUE_VALUE;
											} else {
												throw (InvalidValueException) accumulator_0;
											}
											break;
										}
										/*@NonInvalid*/ Lista l_0 = (Lista) ITERATOR_l_0.next();
										/**
										 *
										 * l.elementos->forAll(e |
										 *   let o : String[?] = l.tipoTexto(e)
										 *   in o = 'desconocido' or o = t)
										 */
										/*@Caught*/ Object CAUGHT_forAll_0;
										try {
											final /*@NonInvalid*/ List<String> elementos = l_0.getElementos();
											final /*@NonInvalid*/ SequenceValue BOXED_elementos = idResolver
													.createSequenceOfAll(LatinoTables.SEQ_PRIMid_String, elementos);
											/*@Thrown*/ Object accumulator_1 = ValueUtil.TRUE_VALUE;
											Iterator<Object> ITERATOR_e_1 = BOXED_elementos.iterator();
											/*@Thrown*/ Boolean forAll_0;
											while (true) {
												if (!ITERATOR_e_1.hasNext()) {
													if (accumulator_1 == null) {
														forAll_0 = null;
													} else if (accumulator_1 == ValueUtil.TRUE_VALUE) {
														forAll_0 = ValueUtil.TRUE_VALUE;
													} else {
														throw (InvalidValueException) accumulator_1;
													}
													break;
												}
												/*@NonInvalid*/ String e_1 = (String) ITERATOR_e_1.next();
												/**
												 *
												 * let o : String[?] = l.tipoTexto(e)
												 * in o = 'desconocido' or o = t
												 */
												/*@Caught*/ Object CAUGHT_or;
												try {
													final /*@NonInvalid*/ String o = l_0.tipoTexto(e_1);
													final /*@NonInvalid*/ boolean eq_1 = o
															.equals(LatinoTables.STR_desconocido);
													final /*@Thrown*/ Boolean or;
													if (eq_1) {
														or = ValueUtil.TRUE_VALUE;
													} else {
														/*@Caught*/ Object CAUGHT_eq_2;
														try {
															if (CAUGHT_t instanceof InvalidValueException) {
																throw (InvalidValueException) CAUGHT_t;
															}
															final /*@Thrown*/ boolean eq_2 = o.equals(CAUGHT_t);
															CAUGHT_eq_2 = eq_2;
														} catch (Exception e) {
															CAUGHT_eq_2 = ValueUtil.createInvalidValue(e);
														}
														if (CAUGHT_eq_2 == ValueUtil.TRUE_VALUE) {
															or = ValueUtil.TRUE_VALUE;
														} else {
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
													forAll_0 = ValueUtil.FALSE_VALUE;
													break; // Stop immediately
												} else if (CAUGHT_or == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
													; // Carry on
												} else if (CAUGHT_or == null) { // Abnormal null body evaluation result
													if (accumulator_1 == ValueUtil.TRUE_VALUE) {
														accumulator_1 = null; // Cache a null failure
													}
												} else if (CAUGHT_or instanceof InvalidValueException) { // Abnormal exception evaluation result
													accumulator_1 = CAUGHT_or; // Cache an exception failure
												} else { // Impossible badly typed result
													accumulator_1 = new InvalidValueException(
															PivotMessages.NonBooleanBody, "forAll");
												}
											}
											CAUGHT_forAll_0 = forAll_0;
										} catch (Exception e) {
											CAUGHT_forAll_0 = ValueUtil.createInvalidValue(e);
										}
										//
										if (CAUGHT_forAll_0 == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
											forAll = ValueUtil.FALSE_VALUE;
											break; // Stop immediately
										} else if (CAUGHT_forAll_0 == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
											; // Carry on
										} else if (CAUGHT_forAll_0 == null) { // Abnormal null body evaluation result
											if (accumulator_0 == ValueUtil.TRUE_VALUE) {
												accumulator_0 = null; // Cache a null failure
											}
										} else if (CAUGHT_forAll_0 instanceof InvalidValueException) { // Abnormal exception evaluation result
											accumulator_0 = CAUGHT_forAll_0; // Cache an exception failure
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
								LatinoTables.STR_El_32_valor_32_no_32_es_32_del_32_mismo_32_tipo_32_que_32_los_32_elementos_32_de_32_la_32_lista,
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
	public boolean ListaDeclarada(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "AsignacionIndice::ListaDeclarada";
		try {
			/**
			 *
			 * inv ListaDeclarada:
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
			 *           ->selectByKind(Lista)
			 *           ->exists(l | l.nombre = lista)
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'Ese nombre no es una lista, creala antes con corchetes', severity = -1, status = status
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
					LatinoPackage.Literals.ASIGNACION_INDICE___LISTA_DECLARADA__DIAGNOSTICCHAIN_MAP);
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
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_latino_c_c_Lista_0 = idResolver
							.getClass(LatinoTables.CLSSid_Lista, null);
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
							.evaluate(executor, closure, TYP_latino_c_c_Lista_0);
					/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
					Iterator<Object> ITERATOR_l = selectByKind.iterator();
					/*@Thrown*/ Boolean status;
					while (true) {
						if (!ITERATOR_l.hasNext()) {
							if (accumulator == ValueUtil.FALSE_VALUE) {
								status = ValueUtil.FALSE_VALUE;
							} else {
								throw (InvalidValueException) accumulator;
							}
							break;
						}
						/*@NonInvalid*/ Lista l = (Lista) ITERATOR_l.next();
						/**
						 * l.nombre = lista
						 */
						final /*@NonInvalid*/ String nombre_0 = l.getNombre();
						final /*@NonInvalid*/ String lista = this.getLista();
						final /*@NonInvalid*/ boolean eq = (nombre_0 != null) ? nombre_0.equals(lista)
								: (lista == null);
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
								LatinoTables.STR_Ese_32_nombre_32_no_32_es_32_una_32_lista_44_32_creala_32_antes_32_con_32_corchetes,
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
	public boolean IndiceNumerico(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "AsignacionIndice::IndiceNumerico";
		try {
			/**
			 *
			 * inv IndiceNumerico:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = not usaSoloVariablesDefinidas(indice) or
			 *           let t : String[?] = tipoTexto(indice)
			 *           in t <> 'texto' and t <> 'logico'
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'El indice debe ser un numero, por ejemplo v[0]', severity = -1, status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					LatinoPackage.Literals.ASIGNACION_INDICE___INDICE_NUMERICO__DIAGNOSTICCHAIN_MAP);
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
							final /*@NonInvalid*/ String indice = this.getIndice();
							final /*@Thrown*/ boolean usaSoloVariablesDefinidas = this
									.usaSoloVariablesDefinidas(indice);
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
						/*@Caught*/ Object CAUGHT_and;
						try {
							/*@Caught*/ Object CAUGHT_t;
							try {
								final /*@NonInvalid*/ String indice_0 = this.getIndice();
								final /*@Thrown*/ String t = this.tipoTexto(indice_0);
								CAUGHT_t = t;
							} catch (Exception e) {
								CAUGHT_t = ValueUtil.createInvalidValue(e);
							}
							/*@Caught*/ Object CAUGHT_ne;
							try {
								if (CAUGHT_t instanceof InvalidValueException) {
									throw (InvalidValueException) CAUGHT_t;
								}
								final /*@Thrown*/ boolean ne = !CAUGHT_t.equals(LatinoTables.STR_texto);
								CAUGHT_ne = ne;
							} catch (Exception e) {
								CAUGHT_ne = ValueUtil.createInvalidValue(e);
							}
							final /*@Thrown*/ Boolean and;
							if (CAUGHT_ne == ValueUtil.FALSE_VALUE) {
								and = ValueUtil.FALSE_VALUE;
							} else {
								/*@Caught*/ Object CAUGHT_ne_0;
								try {
									if (CAUGHT_t instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_t;
									}
									final /*@Thrown*/ boolean ne_0 = !CAUGHT_t.equals(LatinoTables.STR_logico);
									CAUGHT_ne_0 = ne_0;
								} catch (Exception e) {
									CAUGHT_ne_0 = ValueUtil.createInvalidValue(e);
								}
								if (CAUGHT_ne_0 == ValueUtil.FALSE_VALUE) {
									and = ValueUtil.FALSE_VALUE;
								} else {
									if (CAUGHT_ne instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_ne;
									}
									if (CAUGHT_ne_0 instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_ne_0;
									}
									and = ValueUtil.TRUE_VALUE;
								}
							}
							CAUGHT_and = and;
						} catch (Exception e) {
							CAUGHT_and = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_and == ValueUtil.TRUE_VALUE) {
							status = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_not instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_not;
							}
							if (CAUGHT_and instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_and;
							}
							if ((CAUGHT_not == null) || (CAUGHT_and == null)) {
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
								LatinoTables.STR_El_32_indice_32_debe_32_ser_32_un_32_numero_44_32_por_32_ejemplo_32_v_91_0_93,
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
		case LatinoPackage.ASIGNACION_INDICE__LISTA:
			return getLista();
		case LatinoPackage.ASIGNACION_INDICE__INDICE:
			return getIndice();
		case LatinoPackage.ASIGNACION_INDICE__VALOR:
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
		case LatinoPackage.ASIGNACION_INDICE__LISTA:
			setLista((String) newValue);
			return;
		case LatinoPackage.ASIGNACION_INDICE__INDICE:
			setIndice((String) newValue);
			return;
		case LatinoPackage.ASIGNACION_INDICE__VALOR:
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
		case LatinoPackage.ASIGNACION_INDICE__LISTA:
			setLista(LISTA_EDEFAULT);
			return;
		case LatinoPackage.ASIGNACION_INDICE__INDICE:
			setIndice(INDICE_EDEFAULT);
			return;
		case LatinoPackage.ASIGNACION_INDICE__VALOR:
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
		case LatinoPackage.ASIGNACION_INDICE__LISTA:
			return LISTA_EDEFAULT == null ? lista != null : !LISTA_EDEFAULT.equals(lista);
		case LatinoPackage.ASIGNACION_INDICE__INDICE:
			return INDICE_EDEFAULT == null ? indice != null : !INDICE_EDEFAULT.equals(indice);
		case LatinoPackage.ASIGNACION_INDICE__VALOR:
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
		case LatinoPackage.ASIGNACION_INDICE___VARIABLES_DECLARADAS__DIAGNOSTICCHAIN_MAP:
			return VariablesDeclaradas((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case LatinoPackage.ASIGNACION_INDICE___TIPO_ELEMENTO__DIAGNOSTICCHAIN_MAP:
			return TipoElemento((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case LatinoPackage.ASIGNACION_INDICE___LISTA_DECLARADA__DIAGNOSTICCHAIN_MAP:
			return ListaDeclarada((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case LatinoPackage.ASIGNACION_INDICE___INDICE_NUMERICO__DIAGNOSTICCHAIN_MAP:
			return IndiceNumerico((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
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
		result.append(" (lista: ");
		result.append(lista);
		result.append(", indice: ");
		result.append(indice);
		result.append(", valor: ");
		result.append(valor);
		result.append(')');
		return result.toString();
	}

} //AsignacionIndiceImpl
