/**
 */
package latino.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Iterator;
import java.util.Map;

import latino.Asignacion;
import latino.Conversion;
import latino.LatinoPackage;
import latino.LatinoTables;
import latino.Leer;
import latino.Programa;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.pivot.StandardLibrary;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
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

import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.SetValue;

import org.eclipse.ocl.pivot.values.SetValue.Accumulator;

import org.eclipse.ocl.pivot.values.TupleValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Leer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link latino.impl.LeerImpl#getConversion <em>Conversion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LeerImpl extends DefinicionImpl implements Leer {
	/**
	 * The default value of the '{@link #getConversion() <em>Conversion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConversion()
	 * @generated
	 * @ordered
	 */
	protected static final Conversion CONVERSION_EDEFAULT = Conversion.NINGUNA;

	/**
	 * The cached value of the '{@link #getConversion() <em>Conversion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConversion()
	 * @generated
	 * @ordered
	 */
	protected Conversion conversion = CONVERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LeerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LatinoPackage.Literals.LEER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Conversion getConversion() {
		return conversion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConversion(Conversion newConversion) {
		Conversion oldConversion = conversion;
		conversion = newConversion == null ? CONVERSION_EDEFAULT : newConversion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LatinoPackage.LEER__CONVERSION, oldConversion,
					conversion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean TipoLeido(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Leer::TipoLeido";
		try {
			/**
			 *
			 * inv TipoLeido:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let status : Boolean[?] = conversion = Conversion::NINGUNA or
			 *           let
			 *             esperado : String[1] = if conversion = Conversion::NUMERO
			 *             then 'numero'
			 *             else 'texto'
			 *             endif
			 *           in
			 *             programa()
			 *             .oclAsType(OclElement)
			 *             ->closure(e | e.oclContents())
			 *             ->selectByKind(Asignacion)
			 *             ->select(a | a.nombre = self.nombre and
			 *               a.usaSoloVariablesDefinidas(a.valor))
			 *             ->forAll(a |
			 *               let otro : String[?] = a.tipoTexto(a.valor)
			 *               in otro = 'desconocido' or otro = esperado)
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{
			 *               message = if conversion = Conversion::NUMERO
			 *               then 'Esta variable se lee como numero pero luego le das otro tipo'
			 *               else 'Esta variable se lee como texto pero luego le das otro tipo'
			 *               endif, severity = -1, status = status
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
					LatinoPackage.Literals.LEER___TIPO_LEIDO__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, LatinoTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_IF_eq_4;
				try {
					final /*@NonInvalid*/ Conversion conversion = this.getConversion();
					final /*@NonInvalid*/ EnumerationLiteralId BOXED_conversion = conversion == null ? null
							: LatinoTables.ENUMid_Conversion
									.getEnumerationLiteralId(ClassUtil.nonNullState(conversion.getName()));
					final /*@NonInvalid*/ boolean eq = BOXED_conversion == LatinoTables.ELITid_NINGUNA;
					final /*@Thrown*/ Boolean status;
					if (eq) {
						status = ValueUtil.TRUE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_forAll;
						try {
							final /*@NonInvalid*/ boolean eq_0 = BOXED_conversion == LatinoTables.ELITid_NUMERO;
							/*@NonInvalid*/ String esperado;
							if (eq_0) {
								esperado = LatinoTables.STR_numero;
							} else {
								esperado = LatinoTables.STR_texto;
							}
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_OclElement_0 = idResolver
									.getClass(LatinoTables.CLSSid_OclElement, null);
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_latino_c_c_Asignacion_0 = idResolver
									.getClass(LatinoTables.CLSSid_Asignacion, null);
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
								final /*@NonInvalid*/ boolean eq_1 = (nombre_0 != null) ? nombre_0.equals(nombre_1)
										: (nombre_1 == null);
								final /*@Thrown*/ Boolean and;
								if (!eq_1) {
									and = ValueUtil.FALSE_VALUE;
								} else {
									/*@Caught*/ Object CAUGHT_usaSoloVariablesDefinidas;
									try {
										final /*@NonInvalid*/ String valor = a.getValor();
										final /*@Thrown*/ boolean usaSoloVariablesDefinidas = a
												.usaSoloVariablesDefinidas(valor);
										CAUGHT_usaSoloVariablesDefinidas = usaSoloVariablesDefinidas;
									} catch (Exception e) {
										CAUGHT_usaSoloVariablesDefinidas = ValueUtil.createInvalidValue(e);
									}
									if (CAUGHT_usaSoloVariablesDefinidas == ValueUtil.FALSE_VALUE) {
										and = ValueUtil.FALSE_VALUE;
									} else {
										if (CAUGHT_usaSoloVariablesDefinidas instanceof InvalidValueException) {
											throw (InvalidValueException) CAUGHT_usaSoloVariablesDefinidas;
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
								 * in otro = 'desconocido' or otro = esperado
								 */
								/*@Caught*/ Object CAUGHT_or;
								try {
									/*@Caught*/ Object CAUGHT_otro;
									try {
										final /*@NonInvalid*/ String valor_0 = a_0.getValor();
										final /*@Thrown*/ String otro = a_0.tipoTexto(valor_0);
										CAUGHT_otro = otro;
									} catch (Exception e) {
										CAUGHT_otro = ValueUtil.createInvalidValue(e);
									}
									/*@Caught*/ Object CAUGHT_eq_2;
									try {
										if (CAUGHT_otro instanceof InvalidValueException) {
											throw (InvalidValueException) CAUGHT_otro;
										}
										final /*@Thrown*/ boolean eq_2 = CAUGHT_otro
												.equals(LatinoTables.STR_desconocido);
										CAUGHT_eq_2 = eq_2;
									} catch (Exception e) {
										CAUGHT_eq_2 = ValueUtil.createInvalidValue(e);
									}
									final /*@Thrown*/ Boolean or;
									if (CAUGHT_eq_2 == ValueUtil.TRUE_VALUE) {
										or = ValueUtil.TRUE_VALUE;
									} else {
										/*@Caught*/ Object CAUGHT_eq_3;
										try {
											if (CAUGHT_otro instanceof InvalidValueException) {
												throw (InvalidValueException) CAUGHT_otro;
											}
											final /*@Thrown*/ boolean eq_3 = CAUGHT_otro.equals(esperado);
											CAUGHT_eq_3 = eq_3;
										} catch (Exception e) {
											CAUGHT_eq_3 = ValueUtil.createInvalidValue(e);
										}
										if (CAUGHT_eq_3 == ValueUtil.TRUE_VALUE) {
											or = ValueUtil.TRUE_VALUE;
										} else {
											if (CAUGHT_eq_2 instanceof InvalidValueException) {
												throw (InvalidValueException) CAUGHT_eq_2;
											}
											if (CAUGHT_eq_3 instanceof InvalidValueException) {
												throw (InvalidValueException) CAUGHT_eq_3;
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
									accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
								}
							}
							CAUGHT_forAll = forAll;
						} catch (Exception e) {
							CAUGHT_forAll = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_forAll == ValueUtil.TRUE_VALUE) {
							status = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_forAll instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_forAll;
							}
							if (CAUGHT_forAll == null) {
								status = null;
							} else {
								status = ValueUtil.FALSE_VALUE;
							}
						}
					}
					final /*@Thrown*/ boolean eq_4 = status == Boolean.TRUE;
					/*@Thrown*/ Object IF_eq_4;
					if (eq_4) {
						IF_eq_4 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@NonInvalid*/ boolean eq_5 = BOXED_conversion == LatinoTables.ELITid_NUMERO;
						/*@NonInvalid*/ String IF_eq_5;
						if (eq_5) {
							IF_eq_5 = LatinoTables.STR_Esta_32_variable_32_se_32_lee_32_como_32_numero_32_pero_32_luego_32_le_32_das_32_otro_32_tipo;
						} else {
							IF_eq_5 = LatinoTables.STR_Esta_32_variable_32_se_32_lee_32_como_32_texto_32_pero_32_luego_32_le_32_das_32_otro_32_tipo;
						}
						final /*@NonInvalid*/ IntegerValue diff = (IntegerValue) NumericNegateOperation.INSTANCE
								.evaluate(LatinoTables.INT_1);
						final /*@Thrown*/ TupleValue TUP_ = ValueUtil.createTupleOfEach(LatinoTables.TUPLid_, IF_eq_5,
								diff, status);
						IF_eq_4 = TUP_;
					}
					CAUGHT_IF_eq_4 = IF_eq_4;
				} catch (Exception e) {
					CAUGHT_IF_eq_4 = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_IF_eq_4, LatinoTables.INT_0)
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
		case LatinoPackage.LEER__CONVERSION:
			return getConversion();
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
		case LatinoPackage.LEER__CONVERSION:
			setConversion((Conversion) newValue);
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
		case LatinoPackage.LEER__CONVERSION:
			setConversion(CONVERSION_EDEFAULT);
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
		case LatinoPackage.LEER__CONVERSION:
			return conversion != CONVERSION_EDEFAULT;
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
		case LatinoPackage.LEER___TIPO_LEIDO__DIAGNOSTICCHAIN_MAP:
			return TipoLeido((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
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
		result.append(" (conversion: ");
		result.append(conversion);
		result.append(')');
		return result.toString();
	}

} //LeerImpl
