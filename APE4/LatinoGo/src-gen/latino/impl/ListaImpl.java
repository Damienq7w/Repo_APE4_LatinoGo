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
import latino.Lista;
import latino.Programa;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.eclipse.ocl.pivot.StandardLibrary;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.internal.library.executor.ExecutorSingleIterationManager;

import org.eclipse.ocl.pivot.library.AbstractBinaryOperation;

import org.eclipse.ocl.pivot.library.LibraryIteration.LibraryIterationExtension;

import org.eclipse.ocl.pivot.library.classifier.ClassifierOclContentsOperation;

import org.eclipse.ocl.pivot.library.collection.CollectionAsSetOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionSelectByKindOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;

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

import org.eclipse.ocl.pivot.values.BagValue;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.SequenceValue;
import org.eclipse.ocl.pivot.values.SetValue;

import org.eclipse.ocl.pivot.values.SetValue.Accumulator;

import org.eclipse.ocl.pivot.values.TupleValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lista</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link latino.impl.ListaImpl#getElementos <em>Elementos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListaImpl extends DefinicionImpl implements Lista {
	/**
	 * The cached value of the '{@link #getElementos() <em>Elementos</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementos()
	 * @generated
	 * @ordered
	 */
	protected EList<String> elementos;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LatinoPackage.Literals.LISTA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getElementos() {
		if (elementos == null) {
			elementos = new EDataTypeEList<String>(String.class, this, LatinoPackage.LISTA__ELEMENTOS);
		}
		return elementos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean VariablesDeclaradas(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Lista::VariablesDeclaradas";
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
			 *           status : Boolean[?] = elementos->forAll(e |
			 *             usaSoloVariablesDefinidas(e))
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'La lista usa una variable que no existe', severity = -1, status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					LatinoPackage.Literals.LISTA___VARIABLES_DECLARADAS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, LatinoTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				final /*@NonInvalid*/ List<String> elementos = this.getElementos();
				final /*@NonInvalid*/ SequenceValue BOXED_elementos = idResolver
						.createSequenceOfAll(LatinoTables.SEQ_PRIMid_String, elementos);
				/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
				Iterator<Object> ITERATOR_e_0 = BOXED_elementos.iterator();
				/*@NonInvalid*/ Boolean status;
				while (true) {
					if (!ITERATOR_e_0.hasNext()) {
						if (accumulator == ValueUtil.TRUE_VALUE) {
							status = ValueUtil.TRUE_VALUE;
						} else {
							throw (InvalidValueException) accumulator;
						}
						break;
					}
					/*@NonInvalid*/ String e_0 = (String) ITERATOR_e_0.next();
					/**
					 * usaSoloVariablesDefinidas(e)
					 */
					final /*@NonInvalid*/ boolean usaSoloVariablesDefinidas = this.usaSoloVariablesDefinidas(e_0);
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
							LatinoTables.STR_La_32_lista_32_usa_32_una_32_variable_32_que_32_no_32_existe, diff,
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
	public boolean ListaSiempreLista(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Lista::ListaSiempreLista";
		try {
			/**
			 *
			 * inv ListaSiempreLista:
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
			 *           ->select(e |
			 *             e.oclIsKindOf(Asignacion) or
			 *             e.oclIsKindOf(Leer))
			 *           ->forAll(e | e.oclAsType(Definicion).nombre <> nombre)
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'Esta variable es una lista, no le des un valor suelto', severity = -1, status = status
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
					LatinoPackage.Literals.LISTA___LISTA_SIEMPRE_LISTA__DIAGNOSTICCHAIN_MAP);
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
					/*@Thrown*/ Accumulator accumulator = ValueUtil
							.createSetAccumulatorValue(LatinoTables.SET_CLSSid_OclElement);
					Iterator<Object> ITERATOR_e_1 = closure.iterator();
					/*@Thrown*/ SetValue select;
					while (true) {
						if (!ITERATOR_e_1.hasNext()) {
							select = accumulator;
							break;
						}
						/*@NonInvalid*/ Object e_1 = (Object) ITERATOR_e_1.next();
						/**
						 * e.oclIsKindOf(Asignacion) or e.oclIsKindOf(Leer)
						 */
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_latino_c_c_Asignacion_0 = idResolver
								.getClass(LatinoTables.CLSSid_Asignacion, null);
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_latino_c_c_Leer = idResolver
								.getClass(LatinoTables.CLSSid_Leer, null);
						final /*@NonInvalid*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE
								.evaluate(executor, e_1, TYP_latino_c_c_Asignacion_0).booleanValue();
						final /*@NonInvalid*/ Boolean or;
						if (oclIsKindOf) {
							or = ValueUtil.TRUE_VALUE;
						} else {
							final /*@NonInvalid*/ boolean oclIsKindOf_0 = OclAnyOclIsKindOfOperation.INSTANCE
									.evaluate(executor, e_1, TYP_latino_c_c_Leer).booleanValue();
							if (oclIsKindOf_0) {
								or = ValueUtil.TRUE_VALUE;
							} else {
								or = ValueUtil.FALSE_VALUE;
							}
						}
						if (or == null) {
							throw new InvalidValueException(
									"Null body for \'Set(T).select(Set.T[?] | Lambda T() : Boolean[1]) : Set(T)\'");
						}
						//
						if (or == ValueUtil.TRUE_VALUE) {
							accumulator.add(e_1);
						}
					}
					/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_e_2 = select.iterator();
					/*@Thrown*/ Boolean status;
					while (true) {
						if (!ITERATOR_e_2.hasNext()) {
							if (accumulator_0 == ValueUtil.TRUE_VALUE) {
								status = ValueUtil.TRUE_VALUE;
							} else {
								throw (InvalidValueException) accumulator_0;
							}
							break;
						}
						/*@NonInvalid*/ Object e_2 = (Object) ITERATOR_e_2.next();
						/**
						 * e.oclAsType(Definicion).nombre <> nombre
						 */
						/*@Caught*/ Object CAUGHT_ne;
						try {
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_latino_c_c_Definicion_0 = idResolver
									.getClass(LatinoTables.CLSSid_Definicion, null);
							final /*@Thrown*/ Definicion oclAsType_0 = (Definicion) OclAnyOclAsTypeOperation.INSTANCE
									.evaluate(executor, e_2, TYP_latino_c_c_Definicion_0);
							final /*@Thrown*/ String nombre_0 = oclAsType_0.getNombre();
							final /*@NonInvalid*/ String nombre_1 = this.getNombre();
							final /*@Thrown*/ boolean ne = (nombre_0 != null) ? !nombre_0.equals(nombre_1)
									: (nombre_1 != null);
							CAUGHT_ne = ne;
						} catch (Exception e) {
							CAUGHT_ne = ValueUtil.createInvalidValue(e);
						}
						//
						if (CAUGHT_ne == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
							status = ValueUtil.FALSE_VALUE;
							break; // Stop immediately
						} else if (CAUGHT_ne == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
							; // Carry on
						} else if (CAUGHT_ne instanceof InvalidValueException) { // Abnormal exception evaluation result
							accumulator_0 = CAUGHT_ne; // Cache an exception failure
						} else { // Impossible badly typed result
							accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
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
								LatinoTables.STR_Esta_32_variable_32_es_32_una_32_lista_44_32_no_32_le_32_des_32_un_32_valor_32_suelto,
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
	public boolean ElementosMismoTipo(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Lista::ElementosMismoTipo";
		try {
			/**
			 *
			 * inv ElementosMismoTipo:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = not elementos->forAll(e |
			 *             (usaSoloVariablesDefinidas(e) and operandosNumericos(e)
			 *             )) or
			 *           programa()
			 *           .oclAsType(OclElement)
			 *           ->closure(e | e.oclContents())
			 *           ->selectByKind(Lista)
			 *           ->select(l | (l.nombre = nombre))
			 *           ->collect(l | l.elementos->collect(e | l.tipoTexto(e)))
			 *           ->reject(t | (t = 'desconocido'))
			 *           ->asSet()
			 *           ->size() <= 1
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'La lista mezcla numeros, textos y logicos, usa un solo tipo', severity = -1, status = status
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
					LatinoPackage.Literals.LISTA___ELEMENTOS_MISMO_TIPO__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, LatinoTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_IF_eq_1;
				try {
					/*@Caught*/ Object CAUGHT_not;
					try {
						/*@Caught*/ Object CAUGHT_forAll;
						try {
							final /*@NonInvalid*/ List<String> elementos = this.getElementos();
							final /*@NonInvalid*/ SequenceValue BOXED_elementos = idResolver
									.createSequenceOfAll(LatinoTables.SEQ_PRIMid_String, elementos);
							/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
							Iterator<Object> ITERATOR_e_0 = BOXED_elementos.iterator();
							/*@Thrown*/ Boolean forAll;
							while (true) {
								if (!ITERATOR_e_0.hasNext()) {
									if (accumulator == null) {
										forAll = null;
									} else if (accumulator == ValueUtil.TRUE_VALUE) {
										forAll = ValueUtil.TRUE_VALUE;
									} else {
										throw (InvalidValueException) accumulator;
									}
									break;
								}
								/*@NonInvalid*/ String e_0 = (String) ITERATOR_e_0.next();
								/**
								 * usaSoloVariablesDefinidas(e) and operandosNumericos(e)
								 */
								final /*@NonInvalid*/ boolean usaSoloVariablesDefinidas = this
										.usaSoloVariablesDefinidas(e_0);
								final /*@NonInvalid*/ Boolean and;
								if (!usaSoloVariablesDefinidas) {
									and = ValueUtil.FALSE_VALUE;
								} else {
									final /*@NonInvalid*/ boolean operandosNumericos = this.operandosNumericos(e_0);
									if (!operandosNumericos) {
										and = ValueUtil.FALSE_VALUE;
									} else {
										and = ValueUtil.TRUE_VALUE;
									}
								}
								//
								if (and == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
									forAll = ValueUtil.FALSE_VALUE;
									break; // Stop immediately
								} else if (and == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
									; // Carry on
								} else if (and == null) { // Abnormal null body evaluation result
									if (accumulator == ValueUtil.TRUE_VALUE) {
										accumulator = null; // Cache a null failure
									}
								} else { // Impossible badly typed result
									accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
								}
							}
							CAUGHT_forAll = forAll;
						} catch (Exception e) {
							CAUGHT_forAll = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_forAll instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_forAll;
						}
						final /*@Thrown*/ Boolean not;
						if (CAUGHT_forAll == ValueUtil.FALSE_VALUE) {
							not = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_forAll == ValueUtil.TRUE_VALUE) {
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
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_latino_c_c_Lista = idResolver
									.getClass(LatinoTables.CLSSid_Lista, null);
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
										final /*@Nullable*/ Object oclAsSet, final /*@NonInvalid*/ Object e_1) {
									if (e_1 == null) {
										throw new InvalidValueException(
												"Null \'\'OclElement\'\' rather than \'\'OclVoid\'\' value required");
									}
									final /*@Thrown*/ SetValue oclContents = ClassifierOclContentsOperation.INSTANCE
											.evaluate(executor, LatinoTables.SET_CLSSid_OclElement, e_1);
									return oclContents;
								}
							};
							final ExecutorSingleIterationManager MGR_closure_0 = new ExecutorSingleIterationManager(
									executor, LatinoTables.SET_CLSSid_OclElement, BODY_closure_0, oclAsSet,
									ACC_closure_0);
							final /*@Thrown*/ SetValue closure = (SetValue) IMPL_closure_0
									.evaluateIteration(MGR_closure_0);
							final /*@Thrown*/ SetValue selectByKind = (SetValue) CollectionSelectByKindOperation.INSTANCE
									.evaluate(executor, closure, TYP_latino_c_c_Lista);
							/*@Thrown*/ Accumulator accumulator_0 = ValueUtil
									.createSetAccumulatorValue(LatinoTables.SET_CLSSid_Lista);
							Iterator<Object> ITERATOR_l = selectByKind.iterator();
							/*@Thrown*/ SetValue select;
							while (true) {
								if (!ITERATOR_l.hasNext()) {
									select = accumulator_0;
									break;
								}
								/*@NonInvalid*/ Lista l = (Lista) ITERATOR_l.next();
								/**
								 * l.nombre = nombre
								 */
								final /*@NonInvalid*/ String nombre_0 = l.getNombre();
								final /*@NonInvalid*/ String nombre_1 = this.getNombre();
								final /*@NonInvalid*/ boolean eq = (nombre_0 != null) ? nombre_0.equals(nombre_1)
										: (nombre_1 == null);
								//
								if (eq) {
									accumulator_0.add(l);
								}
							}
							/*@Thrown*/ org.eclipse.ocl.pivot.values.BagValue.Accumulator accumulator_1 = ValueUtil
									.createBagAccumulatorValue(LatinoTables.BAG_PRIMid_String);
							Iterator<Object> ITERATOR_l_0 = select.iterator();
							/*@Thrown*/ BagValue collect;
							while (true) {
								if (!ITERATOR_l_0.hasNext()) {
									collect = accumulator_1;
									break;
								}
								/*@NonInvalid*/ Lista l_0 = (Lista) ITERATOR_l_0.next();
								/**
								 * l.elementos->collect(e | l.tipoTexto(e))
								 */
								final /*@NonInvalid*/ List<String> elementos_0 = l_0.getElementos();
								final /*@NonInvalid*/ SequenceValue BOXED_elementos_0 = idResolver
										.createSequenceOfAll(LatinoTables.SEQ_PRIMid_String, elementos_0);
								/*@Thrown*/ org.eclipse.ocl.pivot.values.SequenceValue.Accumulator accumulator_2 = ValueUtil
										.createSequenceAccumulatorValue(LatinoTables.SEQ_PRIMid_String_0);
								Iterator<Object> ITERATOR_e_2 = BOXED_elementos_0.iterator();
								/*@NonInvalid*/ SequenceValue collect_0;
								while (true) {
									if (!ITERATOR_e_2.hasNext()) {
										collect_0 = accumulator_2;
										break;
									}
									/*@NonInvalid*/ String e_2 = (String) ITERATOR_e_2.next();
									/**
									 * l.tipoTexto(e)
									 */
									final /*@NonInvalid*/ String tipoTexto = l_0.tipoTexto(e_2);
									//
									accumulator_2.add(tipoTexto);
								}
								//
								for (Object value : collect_0.flatten().getElements()) {
									accumulator_1.add(value);
								}
							}
							/*@Thrown*/ org.eclipse.ocl.pivot.values.BagValue.Accumulator accumulator_3 = ValueUtil
									.createBagAccumulatorValue(LatinoTables.BAG_PRIMid_String);
							Iterator<Object> ITERATOR_t = collect.iterator();
							/*@Thrown*/ BagValue reject;
							while (true) {
								if (!ITERATOR_t.hasNext()) {
									reject = accumulator_3;
									break;
								}
								/*@NonInvalid*/ String t = (String) ITERATOR_t.next();
								/**
								 * t = 'desconocido'
								 */
								final /*@NonInvalid*/ boolean eq_0 = LatinoTables.STR_desconocido.equals(t);
								//
								if (!eq_0) {
									accumulator_3.add(t);
								}
							}
							final /*@Thrown*/ SetValue asSet = CollectionAsSetOperation.INSTANCE.evaluate(reject);
							final /*@Thrown*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(asSet);
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
					final /*@Thrown*/ boolean eq_1 = status == Boolean.TRUE;
					/*@Thrown*/ Object IF_eq_1;
					if (eq_1) {
						IF_eq_1 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@NonInvalid*/ IntegerValue diff = (IntegerValue) NumericNegateOperation.INSTANCE
								.evaluate(LatinoTables.INT_1);
						final /*@Thrown*/ TupleValue TUP_ = ValueUtil.createTupleOfEach(LatinoTables.TUPLid_,
								LatinoTables.STR_La_32_lista_32_mezcla_32_numeros_44_32_textos_32_y_32_logicos_44_32_usa_32_un_32_solo_32_tipo,
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
	public boolean OperandosNumericos(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Lista::OperandosNumericos";
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
			 *           status : Boolean[?] = not elementos->forAll(e |
			 *             usaSoloVariablesDefinidas(e)) or
			 *           elementos->forAll(e | operandosNumericos(e))
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
					LatinoPackage.Literals.LISTA___OPERANDOS_NUMERICOS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, LatinoTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_IF_eq;
				try {
					final /*@NonInvalid*/ List<String> elementos_0 = this.getElementos();
					final /*@NonInvalid*/ SequenceValue BOXED_elementos_0 = idResolver
							.createSequenceOfAll(LatinoTables.SEQ_PRIMid_String, elementos_0);
					/*@Caught*/ Object CAUGHT_not;
					try {
						/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
						Iterator<Object> ITERATOR_e_0 = BOXED_elementos_0.iterator();
						/*@NonInvalid*/ Boolean forAll;
						while (true) {
							if (!ITERATOR_e_0.hasNext()) {
								if (accumulator == ValueUtil.TRUE_VALUE) {
									forAll = ValueUtil.TRUE_VALUE;
								} else {
									throw (InvalidValueException) accumulator;
								}
								break;
							}
							/*@NonInvalid*/ String e_0 = (String) ITERATOR_e_0.next();
							/**
							 * usaSoloVariablesDefinidas(e)
							 */
							final /*@NonInvalid*/ boolean usaSoloVariablesDefinidas = this
									.usaSoloVariablesDefinidas(e_0);
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
						Iterator<Object> ITERATOR_e_1 = BOXED_elementos_0.iterator();
						/*@NonInvalid*/ Boolean forAll_0;
						while (true) {
							if (!ITERATOR_e_1.hasNext()) {
								if (accumulator_0 == ValueUtil.TRUE_VALUE) {
									forAll_0 = ValueUtil.TRUE_VALUE;
								} else {
									throw (InvalidValueException) accumulator_0;
								}
								break;
							}
							/*@NonInvalid*/ String e_1 = (String) ITERATOR_e_1.next();
							/**
							 * operandosNumericos(e)
							 */
							final /*@NonInvalid*/ boolean operandosNumericos = this.operandosNumericos(e_1);
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LatinoPackage.LISTA__ELEMENTOS:
			return getElementos();
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
		case LatinoPackage.LISTA__ELEMENTOS:
			getElementos().clear();
			getElementos().addAll((Collection<? extends String>) newValue);
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
		case LatinoPackage.LISTA__ELEMENTOS:
			getElementos().clear();
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
		case LatinoPackage.LISTA__ELEMENTOS:
			return elementos != null && !elementos.isEmpty();
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
		case LatinoPackage.LISTA___VARIABLES_DECLARADAS__DIAGNOSTICCHAIN_MAP:
			return VariablesDeclaradas((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case LatinoPackage.LISTA___LISTA_SIEMPRE_LISTA__DIAGNOSTICCHAIN_MAP:
			return ListaSiempreLista((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case LatinoPackage.LISTA___ELEMENTOS_MISMO_TIPO__DIAGNOSTICCHAIN_MAP:
			return ElementosMismoTipo((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case LatinoPackage.LISTA___OPERANDOS_NUMERICOS__DIAGNOSTICCHAIN_MAP:
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
		result.append(" (elementos: ");
		result.append(elementos);
		result.append(')');
		return result.toString();
	}

} //ListaImpl
