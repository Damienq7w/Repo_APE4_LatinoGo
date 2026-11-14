/**
 */
package latino.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Iterator;
import java.util.Map;

import latino.LatinoPackage;
import latino.LatinoTables;
import latino.Salto;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.ocl.pivot.StandardLibrary;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.internal.library.executor.ExecutorSingleIterationManager;

import org.eclipse.ocl.pivot.library.AbstractBinaryOperation;

import org.eclipse.ocl.pivot.library.LibraryIteration.LibraryIterationExtension;

import org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation;

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
import org.eclipse.ocl.pivot.values.SetValue;
import org.eclipse.ocl.pivot.values.TupleValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Salto</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class SaltoImpl extends SentenciaImpl implements Salto {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SaltoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LatinoPackage.Literals.SALTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean DentroDeCiclo(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Salto::DentroDeCiclo";
		try {
			/**
			 *
			 * inv DentroDeCiclo:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = self.oclAsType(OclElement)
			 *           ->closure(e | e.oclContainer())
			 *           ->exists(e | e.oclIsKindOf(Ciclo))
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'romper y continuar solo van dentro de un ciclo', severity = -1, status = status
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
					LatinoPackage.Literals.SALTO___DENTRO_DE_CICLO__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, LatinoTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_IF_eq;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_OclElement_0 = idResolver
							.getClass(LatinoTables.CLSSid_OclElement, null);
					final /*@Thrown*/ Object oclAsType = OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, this,
							TYP_OclElement_0);
					final /*@Thrown*/ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor,
							LatinoTables.SET_CLSSid_OclElement, oclAsType);
					final org.eclipse.ocl.pivot.Class TYPE_closure_0 = executor.getStaticTypeOfValue(null, oclAsSet);
					final LibraryIterationExtension IMPL_closure_0 = (LibraryIterationExtension) TYPE_closure_0
							.lookupImplementation(standardLibrary, OCLstdlibTables.Operations._Set__closure);
					final /*@NonNull*/ Object ACC_closure_0 = IMPL_closure_0.createAccumulatorValue(executor,
							LatinoTables.SET_CLSSid_OclElement_0, LatinoTables.CLSSid_OclElement);
					/**
					 * Implementation of the iterator body.
					 */
					final AbstractBinaryOperation BODY_closure_0 = new AbstractBinaryOperation() {
						/**
						 * e.oclContainer()
						 */
						@Override
						public /*@Nullable*/ Object evaluate(final Executor executor, final TypeId typeId,
								final /*@Nullable*/ Object oclAsSet, final /*@NonInvalid*/ Object e_0) {
							if (e_0 == null) {
								throw new InvalidValueException(
										"Null \'\'OclElement\'\' rather than \'\'OclVoid\'\' value required");
							}
							final /*@Thrown*/ Object oclContainer = ClassifierOclContainerOperation.INSTANCE
									.evaluate(executor, e_0);
							return oclContainer;
						}
					};
					final ExecutorSingleIterationManager MGR_closure_0 = new ExecutorSingleIterationManager(executor,
							LatinoTables.SET_CLSSid_OclElement_0, BODY_closure_0, oclAsSet, ACC_closure_0);
					final /*@Thrown*/ SetValue closure = (SetValue) IMPL_closure_0.evaluateIteration(MGR_closure_0);
					/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
					Iterator<Object> ITERATOR_e_1 = closure.iterator();
					/*@Thrown*/ Boolean status;
					while (true) {
						if (!ITERATOR_e_1.hasNext()) {
							if (accumulator == ValueUtil.FALSE_VALUE) {
								status = ValueUtil.FALSE_VALUE;
							} else {
								throw (InvalidValueException) accumulator;
							}
							break;
						}
						/*@NonInvalid*/ Object e_1 = (Object) ITERATOR_e_1.next();
						/**
						 * e.oclIsKindOf(Ciclo)
						 */
						/*@Caught*/ Object CAUGHT_oclIsKindOf;
						try {
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_latino_c_c_Ciclo = idResolver
									.getClass(LatinoTables.CLSSid_Ciclo, null);
							final /*@Thrown*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE
									.evaluate(executor, e_1, TYP_latino_c_c_Ciclo).booleanValue();
							CAUGHT_oclIsKindOf = oclIsKindOf;
						} catch (Exception e) {
							CAUGHT_oclIsKindOf = ValueUtil.createInvalidValue(e);
						}
						//
						if (CAUGHT_oclIsKindOf == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
							status = ValueUtil.TRUE_VALUE;
							break; // Stop immediately
						} else if (CAUGHT_oclIsKindOf == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
							; // Carry on
						} else if (CAUGHT_oclIsKindOf instanceof InvalidValueException) { // Abnormal exception evaluation result
							accumulator = CAUGHT_oclIsKindOf; // Cache an exception failure
						} else { // Impossible badly typed result
							accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
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
								LatinoTables.STR_romper_32_y_32_continuar_32_solo_32_van_32_dentro_32_de_32_un_32_ciclo,
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case LatinoPackage.SALTO___DENTRO_DE_CICLO__DIAGNOSTICCHAIN_MAP:
			return DentroDeCiclo((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //SaltoImpl
