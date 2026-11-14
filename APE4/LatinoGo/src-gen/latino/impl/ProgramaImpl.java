/**
 */
package latino.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import latino.Definicion;
import latino.LatinoPackage;
import latino.LatinoTables;
import latino.Programa;
import latino.Sentencia;
import latino.Variable;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

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
import org.eclipse.ocl.pivot.library.collection.CollectionNotEmptyOperation;
import org.eclipse.ocl.pivot.library.numeric.NumericNegateOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation;
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
import org.eclipse.ocl.pivot.values.SetValue;
import org.eclipse.ocl.pivot.values.TupleValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Programa</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link latino.impl.ProgramaImpl#getSentencias <em>Sentencias</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramaImpl extends MinimalEObjectImpl.Container implements Programa {
	/**
	 * The cached value of the '{@link #getSentencias() <em>Sentencias</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSentencias()
	 * @generated
	 * @ordered
	 */
	protected EList<Sentencia> sentencias;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LatinoPackage.Literals.PROGRAMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Sentencia> getSentencias() {
		if (sentencias == null) {
			sentencias = new EObjectContainmentEList<Sentencia>(Sentencia.class, this,
					LatinoPackage.PROGRAMA__SENTENCIAS);
		}
		return sentencias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean defineVariable(final String nombre) {
		/**
		 *
		 * self.oclAsType(OclElement)
		 * ->closure(e | e.oclContents())
		 * ->exists(e |
		 *   e.oclIsKindOf(Definicion) and
		 *   e.oclAsType(Definicion).nombre = nombre or
		 *   e.oclIsKindOf(Variable) and
		 *   e.oclAsType(Variable).nombre = nombre)
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_OclElement_0 = idResolver
				.getClass(LatinoTables.CLSSid_OclElement, null);
		final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
		final /*@Thrown*/ Object oclAsType = OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, this,
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
				final /*@Thrown*/ SetValue oclContents = ClassifierOclContentsOperation.INSTANCE.evaluate(executor,
						LatinoTables.SET_CLSSid_OclElement, e_0);
				return oclContents;
			}
		};
		final ExecutorSingleIterationManager MGR_closure_0 = new ExecutorSingleIterationManager(executor,
				LatinoTables.SET_CLSSid_OclElement, BODY_closure_0, oclAsSet, ACC_closure_0);
		final /*@Thrown*/ SetValue closure = (SetValue) IMPL_closure_0.evaluateIteration(MGR_closure_0);
		/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
		Iterator<Object> ITERATOR_e_1 = closure.iterator();
		/*@Thrown*/ Boolean exists;
		while (true) {
			if (!ITERATOR_e_1.hasNext()) {
				if (accumulator == null) {
					exists = null;
				} else if (accumulator == ValueUtil.FALSE_VALUE) {
					exists = ValueUtil.FALSE_VALUE;
				} else {
					throw (InvalidValueException) accumulator;
				}
				break;
			}
			/*@NonInvalid*/ Object e_1 = (Object) ITERATOR_e_1.next();
			/**
			 *
			 * e.oclIsKindOf(Definicion) and
			 * e.oclAsType(Definicion).nombre = nombre or
			 * e.oclIsKindOf(Variable) and
			 * e.oclAsType(Variable).nombre = nombre
			 */
			/*@Caught*/ Object CAUGHT_or;
			try {
				/*@Caught*/ Object CAUGHT_and;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_latino_c_c_Definicion_0 = idResolver
							.getClass(LatinoTables.CLSSid_Definicion, null);
					final /*@NonInvalid*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE
							.evaluate(executor, e_1, TYP_latino_c_c_Definicion_0).booleanValue();
					final /*@Thrown*/ Boolean and;
					if (!oclIsKindOf) {
						and = ValueUtil.FALSE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_eq;
						try {
							final /*@Thrown*/ Definicion oclAsType_0 = (Definicion) OclAnyOclAsTypeOperation.INSTANCE
									.evaluate(executor, e_1, TYP_latino_c_c_Definicion_0);
							final /*@Thrown*/ String nombre_0 = oclAsType_0.getNombre();
							final /*@Thrown*/ boolean eq = (nombre_0 != null) ? nombre_0.equals(nombre)
									: (nombre == null);
							CAUGHT_eq = eq;
						} catch (Exception e) {
							CAUGHT_eq = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_eq == ValueUtil.FALSE_VALUE) {
							and = ValueUtil.FALSE_VALUE;
						} else {
							if (CAUGHT_eq instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_eq;
							}
							and = ValueUtil.TRUE_VALUE;
						}
					}
					CAUGHT_and = and;
				} catch (Exception e) {
					CAUGHT_and = ValueUtil.createInvalidValue(e);
				}
				final /*@Thrown*/ Boolean or;
				if (CAUGHT_and == ValueUtil.TRUE_VALUE) {
					or = ValueUtil.TRUE_VALUE;
				} else {
					/*@Caught*/ Object CAUGHT_and_0;
					try {
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_latino_c_c_Variable_0 = idResolver
								.getClass(LatinoTables.CLSSid_Variable, null);
						final /*@NonInvalid*/ boolean oclIsKindOf_0 = OclAnyOclIsKindOfOperation.INSTANCE
								.evaluate(executor, e_1, TYP_latino_c_c_Variable_0).booleanValue();
						final /*@Thrown*/ Boolean and_0;
						if (!oclIsKindOf_0) {
							and_0 = ValueUtil.FALSE_VALUE;
						} else {
							/*@Caught*/ Object CAUGHT_eq_0;
							try {
								final /*@Thrown*/ Variable oclAsType_1 = (Variable) OclAnyOclAsTypeOperation.INSTANCE
										.evaluate(executor, e_1, TYP_latino_c_c_Variable_0);
								final /*@Thrown*/ String nombre_1 = oclAsType_1.getNombre();
								final /*@Thrown*/ boolean eq_0 = (nombre_1 != null) ? nombre_1.equals(nombre)
										: (nombre == null);
								CAUGHT_eq_0 = eq_0;
							} catch (Exception e) {
								CAUGHT_eq_0 = ValueUtil.createInvalidValue(e);
							}
							if (CAUGHT_eq_0 == ValueUtil.FALSE_VALUE) {
								and_0 = ValueUtil.FALSE_VALUE;
							} else {
								if (CAUGHT_eq_0 instanceof InvalidValueException) {
									throw (InvalidValueException) CAUGHT_eq_0;
								}
								and_0 = ValueUtil.TRUE_VALUE;
							}
						}
						CAUGHT_and_0 = and_0;
					} catch (Exception e) {
						CAUGHT_and_0 = ValueUtil.createInvalidValue(e);
					}
					if (CAUGHT_and_0 == ValueUtil.TRUE_VALUE) {
						or = ValueUtil.TRUE_VALUE;
					} else {
						if (CAUGHT_and instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_and;
						}
						if (CAUGHT_and_0 instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_and_0;
						}
						if ((CAUGHT_and == null) || (CAUGHT_and_0 == null)) {
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
			//
			if (CAUGHT_or == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
				exists = ValueUtil.TRUE_VALUE;
				break; // Stop immediately
			} else if (CAUGHT_or == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
				; // Carry on
			} else if (CAUGHT_or == null) { // Abnormal null body evaluation result
				if (accumulator == ValueUtil.FALSE_VALUE) {
					accumulator = null; // Cache a null failure
				}
			} else if (CAUGHT_or instanceof InvalidValueException) { // Abnormal exception evaluation result
				accumulator = CAUGHT_or; // Cache an exception failure
			} else { // Impossible badly typed result
				accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
			}
		}
		if (exists == null) {
			throw new InvalidValueException(
					"Null body for \'latino::Programa::defineVariable(String[?]) : Boolean[1]\'");
		}
		return exists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean ProgramaNoVacio(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Programa::ProgramaNoVacio";
		try {
			/**
			 *
			 * inv ProgramaNoVacio:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let status : Boolean[1] = sentencias->notEmpty()
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'El programa esta vacio, agrega al menos una sentencia', severity = -1, status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					LatinoPackage.Literals.PROGRAMA___PROGRAMA_NO_VACIO__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, LatinoTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				final /*@NonInvalid*/ List<Sentencia> sentencias = this.getSentencias();
				final /*@NonInvalid*/ OrderedSetValue BOXED_sentencias = idResolver
						.createOrderedSetOfAll(LatinoTables.ORD_CLSSid_Sentencia, sentencias);
				final /*@NonInvalid*/ boolean status = CollectionNotEmptyOperation.INSTANCE.evaluate(BOXED_sentencias)
						.booleanValue();
				/*@NonInvalid*/ Object IF_status;
				if (status) {
					IF_status = ValueUtil.TRUE_VALUE;
				} else {
					final /*@NonInvalid*/ IntegerValue diff = (IntegerValue) NumericNegateOperation.INSTANCE
							.evaluate(LatinoTables.INT_1);
					final /*@NonInvalid*/ TupleValue TUP_ = ValueUtil.createTupleOfEach(LatinoTables.TUPLid_,
							LatinoTables.STR_El_32_programa_32_esta_32_vacio_44_32_agrega_32_al_32_menos_32_una_32_sentencia,
							diff, status);
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
		case LatinoPackage.PROGRAMA__SENTENCIAS:
			return ((InternalEList<?>) getSentencias()).basicRemove(otherEnd, msgs);
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
		case LatinoPackage.PROGRAMA__SENTENCIAS:
			return getSentencias();
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
		case LatinoPackage.PROGRAMA__SENTENCIAS:
			getSentencias().clear();
			getSentencias().addAll((Collection<? extends Sentencia>) newValue);
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
		case LatinoPackage.PROGRAMA__SENTENCIAS:
			getSentencias().clear();
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
		case LatinoPackage.PROGRAMA__SENTENCIAS:
			return sentencias != null && !sentencias.isEmpty();
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
		case LatinoPackage.PROGRAMA___DEFINE_VARIABLE__STRING:
			return defineVariable((String) arguments.get(0));
		case LatinoPackage.PROGRAMA___PROGRAMA_NO_VACIO__DIAGNOSTICCHAIN_MAP:
			return ProgramaNoVacio((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ProgramaImpl
