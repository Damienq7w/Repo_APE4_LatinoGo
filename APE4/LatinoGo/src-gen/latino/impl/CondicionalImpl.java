/**
 */
package latino.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import latino.Condicional;
import latino.LatinoPackage;
import latino.LatinoTables;
import latino.Osi;
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
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.collection.CollectionNotEmptyOperation;
import org.eclipse.ocl.pivot.library.numeric.NumericNegateOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.TupleValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condicional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link latino.impl.CondicionalImpl#getCondicion <em>Condicion</em>}</li>
 *   <li>{@link latino.impl.CondicionalImpl#getEntonces <em>Entonces</em>}</li>
 *   <li>{@link latino.impl.CondicionalImpl#getOsis <em>Osis</em>}</li>
 *   <li>{@link latino.impl.CondicionalImpl#getSino <em>Sino</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CondicionalImpl extends SentenciaImpl implements Condicional {
	/**
	 * The default value of the '{@link #getCondicion() <em>Condicion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondicion()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDICION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCondicion() <em>Condicion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondicion()
	 * @generated
	 * @ordered
	 */
	protected String condicion = CONDICION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntonces() <em>Entonces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntonces()
	 * @generated
	 * @ordered
	 */
	protected EList<Sentencia> entonces;

	/**
	 * The cached value of the '{@link #getOsis() <em>Osis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsis()
	 * @generated
	 * @ordered
	 */
	protected EList<Osi> osis;

	/**
	 * The cached value of the '{@link #getSino() <em>Sino</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSino()
	 * @generated
	 * @ordered
	 */
	protected EList<Sentencia> sino;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CondicionalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LatinoPackage.Literals.CONDICIONAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCondicion() {
		return condicion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondicion(String newCondicion) {
		String oldCondicion = condicion;
		condicion = newCondicion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LatinoPackage.CONDICIONAL__CONDICION, oldCondicion,
					condicion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Sentencia> getEntonces() {
		if (entonces == null) {
			entonces = new EObjectContainmentEList<Sentencia>(Sentencia.class, this,
					LatinoPackage.CONDICIONAL__ENTONCES);
		}
		return entonces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Osi> getOsis() {
		if (osis == null) {
			osis = new EObjectContainmentEList<Osi>(Osi.class, this, LatinoPackage.CONDICIONAL__OSIS);
		}
		return osis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Sentencia> getSino() {
		if (sino == null) {
			sino = new EObjectContainmentEList<Sentencia>(Sentencia.class, this, LatinoPackage.CONDICIONAL__SINO);
		}
		return sino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean VariablesDeclaradas(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Condicional::VariablesDeclaradas";
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
			 *           status : Boolean[1] = usaSoloVariablesDefinidas(condicion)
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'La condicion usa una variable que no existe', severity = -1, status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					LatinoPackage.Literals.CONDICIONAL___VARIABLES_DECLARADAS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, LatinoTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_IF_status;
				try {
					final /*@NonInvalid*/ String condicion = this.getCondicion();
					final /*@Thrown*/ boolean status = this.usaSoloVariablesDefinidas(condicion);
					/*@Thrown*/ Object IF_status;
					if (status) {
						IF_status = ValueUtil.TRUE_VALUE;
					} else {
						final /*@NonInvalid*/ IntegerValue diff = (IntegerValue) NumericNegateOperation.INSTANCE
								.evaluate(LatinoTables.INT_1);
						final /*@Thrown*/ TupleValue TUP_ = ValueUtil.createTupleOfEach(LatinoTables.TUPLid_,
								LatinoTables.STR_La_32_condicion_32_usa_32_una_32_variable_32_que_32_no_32_existe, diff,
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
	public boolean CondicionLogica(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Condicional::CondicionLogica";
		try {
			/**
			 *
			 * inv CondicionLogica:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = not usaSoloVariablesDefinidas(condicion) or
			 *           not operandosNumericos(condicion) or
			 *           let tipo : String[?] = tipoTexto(condicion)
			 *           in tipo <> 'numero' and tipo <> 'texto'
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'La condicion debe ser verdadera o falsa, por ejemplo edad > 18', severity = -1, status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					LatinoPackage.Literals.CONDICIONAL___CONDICION_LOGICA__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, LatinoTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_IF_eq;
				try {
					/*@Caught*/ Object CAUGHT_or;
					try {
						/*@Caught*/ Object CAUGHT_not;
						try {
							/*@Caught*/ Object CAUGHT_usaSoloVariablesDefinidas;
							try {
								final /*@NonInvalid*/ String condicion = this.getCondicion();
								final /*@Thrown*/ boolean usaSoloVariablesDefinidas = this
										.usaSoloVariablesDefinidas(condicion);
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
						final /*@Thrown*/ Boolean or;
						if (CAUGHT_not == ValueUtil.TRUE_VALUE) {
							or = ValueUtil.TRUE_VALUE;
						} else {
							/*@Caught*/ Object CAUGHT_not_0;
							try {
								/*@Caught*/ Object CAUGHT_operandosNumericos;
								try {
									final /*@NonInvalid*/ String condicion_0 = this.getCondicion();
									final /*@Thrown*/ boolean operandosNumericos = this.operandosNumericos(condicion_0);
									CAUGHT_operandosNumericos = operandosNumericos;
								} catch (Exception e) {
									CAUGHT_operandosNumericos = ValueUtil.createInvalidValue(e);
								}
								if (CAUGHT_operandosNumericos instanceof InvalidValueException) {
									throw (InvalidValueException) CAUGHT_operandosNumericos;
								}
								final /*@Thrown*/ Boolean not_0;
								if (CAUGHT_operandosNumericos == ValueUtil.FALSE_VALUE) {
									not_0 = ValueUtil.TRUE_VALUE;
								} else {
									if (CAUGHT_operandosNumericos == ValueUtil.TRUE_VALUE) {
										not_0 = ValueUtil.FALSE_VALUE;
									} else {
										not_0 = null;
									}
								}
								CAUGHT_not_0 = not_0;
							} catch (Exception e) {
								CAUGHT_not_0 = ValueUtil.createInvalidValue(e);
							}
							if (CAUGHT_not_0 == ValueUtil.TRUE_VALUE) {
								or = ValueUtil.TRUE_VALUE;
							} else {
								if (CAUGHT_not instanceof InvalidValueException) {
									throw (InvalidValueException) CAUGHT_not;
								}
								if (CAUGHT_not_0 instanceof InvalidValueException) {
									throw (InvalidValueException) CAUGHT_not_0;
								}
								if ((CAUGHT_not == null) || (CAUGHT_not_0 == null)) {
									or = null;
								} else {
									or = ValueUtil.FALSE_VALUE;
								}
							}
						}
						CAUGHT_or = or;
					} catch (Exception e) {
						CAUGHT_or = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean status;
					if (CAUGHT_or == ValueUtil.TRUE_VALUE) {
						status = ValueUtil.TRUE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_and;
						try {
							/*@Caught*/ Object CAUGHT_tipo;
							try {
								final /*@NonInvalid*/ String condicion_1 = this.getCondicion();
								final /*@Thrown*/ String tipo = this.tipoTexto(condicion_1);
								CAUGHT_tipo = tipo;
							} catch (Exception e) {
								CAUGHT_tipo = ValueUtil.createInvalidValue(e);
							}
							/*@Caught*/ Object CAUGHT_ne;
							try {
								if (CAUGHT_tipo instanceof InvalidValueException) {
									throw (InvalidValueException) CAUGHT_tipo;
								}
								final /*@Thrown*/ boolean ne = !CAUGHT_tipo.equals(LatinoTables.STR_numero);
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
									if (CAUGHT_tipo instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_tipo;
									}
									final /*@Thrown*/ boolean ne_0 = !CAUGHT_tipo.equals(LatinoTables.STR_texto);
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
							if (CAUGHT_or instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_or;
							}
							if (CAUGHT_and instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_and;
							}
							if ((CAUGHT_or == null) || (CAUGHT_and == null)) {
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
								LatinoTables.STR_La_32_condicion_32_debe_32_ser_32_verdadera_32_o_32_falsa_44_32_por_32_ejemplo_32_edad_32_g_32_18,
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
	public boolean BloqueNoVacio(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Condicional::BloqueNoVacio";
		try {
			/**
			 *
			 * inv BloqueNoVacio:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let status : Boolean[1] = entonces->notEmpty()
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'El si necesita al menos una sentencia dentro', severity = -1, status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					LatinoPackage.Literals.CONDICIONAL___BLOQUE_NO_VACIO__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, LatinoTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				final /*@NonInvalid*/ List<Sentencia> entonces = this.getEntonces();
				final /*@NonInvalid*/ OrderedSetValue BOXED_entonces = idResolver
						.createOrderedSetOfAll(LatinoTables.ORD_CLSSid_Sentencia, entonces);
				final /*@NonInvalid*/ boolean status = CollectionNotEmptyOperation.INSTANCE.evaluate(BOXED_entonces)
						.booleanValue();
				/*@NonInvalid*/ Object IF_status;
				if (status) {
					IF_status = ValueUtil.TRUE_VALUE;
				} else {
					final /*@NonInvalid*/ IntegerValue diff = (IntegerValue) NumericNegateOperation.INSTANCE
							.evaluate(LatinoTables.INT_1);
					final /*@NonInvalid*/ TupleValue TUP_ = ValueUtil.createTupleOfEach(LatinoTables.TUPLid_,
							LatinoTables.STR_El_32_si_32_necesita_32_al_32_menos_32_una_32_sentencia_32_dentro, diff,
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
	public boolean OperandosNumericos(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Condicional::OperandosNumericos";
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
			 *           status : Boolean[?] = not usaSoloVariablesDefinidas(condicion) or
			 *           operandosNumericos(condicion)
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
					LatinoPackage.Literals.CONDICIONAL___OPERANDOS_NUMERICOS__DIAGNOSTICCHAIN_MAP);
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
							final /*@NonInvalid*/ String condicion = this.getCondicion();
							final /*@Thrown*/ boolean usaSoloVariablesDefinidas = this
									.usaSoloVariablesDefinidas(condicion);
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
							final /*@NonInvalid*/ String condicion_0 = this.getCondicion();
							final /*@Thrown*/ boolean operandosNumericos = this.operandosNumericos(condicion_0);
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case LatinoPackage.CONDICIONAL__ENTONCES:
			return ((InternalEList<?>) getEntonces()).basicRemove(otherEnd, msgs);
		case LatinoPackage.CONDICIONAL__OSIS:
			return ((InternalEList<?>) getOsis()).basicRemove(otherEnd, msgs);
		case LatinoPackage.CONDICIONAL__SINO:
			return ((InternalEList<?>) getSino()).basicRemove(otherEnd, msgs);
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
		case LatinoPackage.CONDICIONAL__CONDICION:
			return getCondicion();
		case LatinoPackage.CONDICIONAL__ENTONCES:
			return getEntonces();
		case LatinoPackage.CONDICIONAL__OSIS:
			return getOsis();
		case LatinoPackage.CONDICIONAL__SINO:
			return getSino();
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
		case LatinoPackage.CONDICIONAL__CONDICION:
			setCondicion((String) newValue);
			return;
		case LatinoPackage.CONDICIONAL__ENTONCES:
			getEntonces().clear();
			getEntonces().addAll((Collection<? extends Sentencia>) newValue);
			return;
		case LatinoPackage.CONDICIONAL__OSIS:
			getOsis().clear();
			getOsis().addAll((Collection<? extends Osi>) newValue);
			return;
		case LatinoPackage.CONDICIONAL__SINO:
			getSino().clear();
			getSino().addAll((Collection<? extends Sentencia>) newValue);
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
		case LatinoPackage.CONDICIONAL__CONDICION:
			setCondicion(CONDICION_EDEFAULT);
			return;
		case LatinoPackage.CONDICIONAL__ENTONCES:
			getEntonces().clear();
			return;
		case LatinoPackage.CONDICIONAL__OSIS:
			getOsis().clear();
			return;
		case LatinoPackage.CONDICIONAL__SINO:
			getSino().clear();
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
		case LatinoPackage.CONDICIONAL__CONDICION:
			return CONDICION_EDEFAULT == null ? condicion != null : !CONDICION_EDEFAULT.equals(condicion);
		case LatinoPackage.CONDICIONAL__ENTONCES:
			return entonces != null && !entonces.isEmpty();
		case LatinoPackage.CONDICIONAL__OSIS:
			return osis != null && !osis.isEmpty();
		case LatinoPackage.CONDICIONAL__SINO:
			return sino != null && !sino.isEmpty();
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
		case LatinoPackage.CONDICIONAL___VARIABLES_DECLARADAS__DIAGNOSTICCHAIN_MAP:
			return VariablesDeclaradas((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case LatinoPackage.CONDICIONAL___CONDICION_LOGICA__DIAGNOSTICCHAIN_MAP:
			return CondicionLogica((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case LatinoPackage.CONDICIONAL___BLOQUE_NO_VACIO__DIAGNOSTICCHAIN_MAP:
			return BloqueNoVacio((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case LatinoPackage.CONDICIONAL___OPERANDOS_NUMERICOS__DIAGNOSTICCHAIN_MAP:
			return OperandosNumericos((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
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
		result.append(" (condicion: ");
		result.append(condicion);
		result.append(')');
		return result.toString();
	}

} //CondicionalImpl
