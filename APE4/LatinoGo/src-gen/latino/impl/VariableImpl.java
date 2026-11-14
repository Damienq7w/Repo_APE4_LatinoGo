/**
 */
package latino.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import latino.LatinoPackage;
import latino.LatinoTables;
import latino.Variable;

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
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link latino.impl.VariableImpl#getNombre <em>Nombre</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableImpl extends ElementoImpl implements Variable {
	/**
	 * The default value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected static final String NOMBRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNombre() <em>Nombre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNombre()
	 * @generated
	 * @ordered
	 */
	protected String nombre = NOMBRE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LatinoPackage.Literals.VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNombre() {
		return nombre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNombre(String newNombre) {
		String oldNombre = nombre;
		nombre = newNombre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LatinoPackage.VARIABLE__NOMBRE, oldNombre, nombre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean NombreNoReservado(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Variable::NombreNoReservado";
		try {
			/**
			 *
			 * inv NombreNoReservado:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = not esReservadaGo(nombre)
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'Ese nombre es una palabra reservada de Go, usa otro', severity = -1, status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					LatinoPackage.Literals.VARIABLE___NOMBRE_NO_RESERVADO__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, LatinoTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_IF_eq;
				try {
					/*@Caught*/ Object CAUGHT_esReservadaGo;
					try {
						final /*@NonInvalid*/ String nombre_0 = this.getNombre();
						final /*@Thrown*/ boolean esReservadaGo = this.esReservadaGo(nombre_0);
						CAUGHT_esReservadaGo = esReservadaGo;
					} catch (Exception e) {
						CAUGHT_esReservadaGo = ValueUtil.createInvalidValue(e);
					}
					if (CAUGHT_esReservadaGo instanceof InvalidValueException) {
						throw (InvalidValueException) CAUGHT_esReservadaGo;
					}
					final /*@Thrown*/ Boolean status;
					if (CAUGHT_esReservadaGo == ValueUtil.FALSE_VALUE) {
						status = ValueUtil.TRUE_VALUE;
					} else {
						if (CAUGHT_esReservadaGo == ValueUtil.TRUE_VALUE) {
							status = ValueUtil.FALSE_VALUE;
						} else {
							status = null;
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
								LatinoTables.STR_Ese_32_nombre_32_es_32_una_32_palabra_32_reservada_32_de_32_Go_44_32_usa_32_otro,
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
	public boolean NombreNoReservadoLatino(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Variable::NombreNoReservadoLatino";
		try {
			/**
			 *
			 * inv NombreNoReservadoLatino:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = not esReservadaLatino(nombre)
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'Ese nombre es una palabra de Latino, usa otro', severity = -1, status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					LatinoPackage.Literals.VARIABLE___NOMBRE_NO_RESERVADO_LATINO__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, LatinoTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_IF_eq;
				try {
					/*@Caught*/ Object CAUGHT_esReservadaLatino;
					try {
						final /*@NonInvalid*/ String nombre_0 = this.getNombre();
						final /*@Thrown*/ boolean esReservadaLatino = this.esReservadaLatino(nombre_0);
						CAUGHT_esReservadaLatino = esReservadaLatino;
					} catch (Exception e) {
						CAUGHT_esReservadaLatino = ValueUtil.createInvalidValue(e);
					}
					if (CAUGHT_esReservadaLatino instanceof InvalidValueException) {
						throw (InvalidValueException) CAUGHT_esReservadaLatino;
					}
					final /*@Thrown*/ Boolean status;
					if (CAUGHT_esReservadaLatino == ValueUtil.FALSE_VALUE) {
						status = ValueUtil.TRUE_VALUE;
					} else {
						if (CAUGHT_esReservadaLatino == ValueUtil.TRUE_VALUE) {
							status = ValueUtil.FALSE_VALUE;
						} else {
							status = null;
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
								LatinoTables.STR_Ese_32_nombre_32_es_32_una_32_palabra_32_de_32_Latino_44_32_usa_32_otro,
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
		case LatinoPackage.VARIABLE__NOMBRE:
			return getNombre();
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
		case LatinoPackage.VARIABLE__NOMBRE:
			setNombre((String) newValue);
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
		case LatinoPackage.VARIABLE__NOMBRE:
			setNombre(NOMBRE_EDEFAULT);
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
		case LatinoPackage.VARIABLE__NOMBRE:
			return NOMBRE_EDEFAULT == null ? nombre != null : !NOMBRE_EDEFAULT.equals(nombre);
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
		case LatinoPackage.VARIABLE___NOMBRE_NO_RESERVADO__DIAGNOSTICCHAIN_MAP:
			return NombreNoReservado((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case LatinoPackage.VARIABLE___NOMBRE_NO_RESERVADO_LATINO__DIAGNOSTICCHAIN_MAP:
			return NombreNoReservadoLatino((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
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
		result.append(" (nombre: ");
		result.append(nombre);
		result.append(')');
		return result.toString();
	}

} //VariableImpl
