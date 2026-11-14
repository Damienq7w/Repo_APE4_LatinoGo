/**
 */
package latino.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import latino.Imprimir;
import latino.LatinoPackage;
import latino.LatinoTables;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.numeric.NumericNegateOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.TupleValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Imprimir</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link latino.impl.ImprimirImpl#getMensaje <em>Mensaje</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImprimirImpl extends SentenciaImpl implements Imprimir {
	/**
	 * The default value of the '{@link #getMensaje() <em>Mensaje</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMensaje()
	 * @generated
	 * @ordered
	 */
	protected static final String MENSAJE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMensaje() <em>Mensaje</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMensaje()
	 * @generated
	 * @ordered
	 */
	protected String mensaje = MENSAJE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImprimirImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LatinoPackage.Literals.IMPRIMIR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMensaje() {
		return mensaje;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMensaje(String newMensaje) {
		String oldMensaje = mensaje;
		mensaje = newMensaje;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LatinoPackage.IMPRIMIR__MENSAJE, oldMensaje,
					mensaje));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean OperandosNumericos(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Imprimir::OperandosNumericos";
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
			 *           status : Boolean[?] = not usaSoloVariablesDefinidas(mensaje) or
			 *           operandosNumericos(mensaje)
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
					LatinoPackage.Literals.IMPRIMIR___OPERANDOS_NUMERICOS__DIAGNOSTICCHAIN_MAP);
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
							final /*@NonInvalid*/ String mensaje = this.getMensaje();
							final /*@Thrown*/ boolean usaSoloVariablesDefinidas = this
									.usaSoloVariablesDefinidas(mensaje);
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
							final /*@NonInvalid*/ String mensaje_0 = this.getMensaje();
							final /*@Thrown*/ boolean operandosNumericos = this.operandosNumericos(mensaje_0);
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
	public boolean VariablesDeclaradas(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Imprimir::VariablesDeclaradas";
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
			 *           status : Boolean[1] = usaSoloVariablesDefinidas(mensaje)
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'escribir usa una variable que no existe', severity = -1, status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					LatinoPackage.Literals.IMPRIMIR___VARIABLES_DECLARADAS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, LatinoTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_IF_status;
				try {
					final /*@NonInvalid*/ String mensaje = this.getMensaje();
					final /*@Thrown*/ boolean status = this.usaSoloVariablesDefinidas(mensaje);
					/*@Thrown*/ Object IF_status;
					if (status) {
						IF_status = ValueUtil.TRUE_VALUE;
					} else {
						final /*@NonInvalid*/ IntegerValue diff = (IntegerValue) NumericNegateOperation.INSTANCE
								.evaluate(LatinoTables.INT_1);
						final /*@Thrown*/ TupleValue TUP_ = ValueUtil.createTupleOfEach(LatinoTables.TUPLid_,
								LatinoTables.STR_escribir_32_usa_32_una_32_variable_32_que_32_no_32_existe, diff,
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LatinoPackage.IMPRIMIR__MENSAJE:
			return getMensaje();
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
		case LatinoPackage.IMPRIMIR__MENSAJE:
			setMensaje((String) newValue);
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
		case LatinoPackage.IMPRIMIR__MENSAJE:
			setMensaje(MENSAJE_EDEFAULT);
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
		case LatinoPackage.IMPRIMIR__MENSAJE:
			return MENSAJE_EDEFAULT == null ? mensaje != null : !MENSAJE_EDEFAULT.equals(mensaje);
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
		case LatinoPackage.IMPRIMIR___OPERANDOS_NUMERICOS__DIAGNOSTICCHAIN_MAP:
			return OperandosNumericos((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case LatinoPackage.IMPRIMIR___VARIABLES_DECLARADAS__DIAGNOSTICCHAIN_MAP:
			return VariablesDeclaradas((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
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
		result.append(" (mensaje: ");
		result.append(mensaje);
		result.append(')');
		return result.toString();
	}

} //ImprimirImpl
