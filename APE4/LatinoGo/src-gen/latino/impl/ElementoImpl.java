/**
 */
package latino.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Iterator;

import latino.Elemento;
import latino.LatinoPackage;
import latino.LatinoTables;
import latino.Programa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.ocl.pivot.StandardLibrary;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.internal.library.executor.ExecutorSingleIterationManager;

import org.eclipse.ocl.pivot.library.AbstractBinaryOperation;

import org.eclipse.ocl.pivot.library.LibraryIteration.LibraryIterationExtension;

import org.eclipse.ocl.pivot.library.classifier.ClassifierOclContainerOperation;

import org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation;

import org.eclipse.ocl.pivot.library.string.StringMatchesOperation;
import org.eclipse.ocl.pivot.library.string.StringReplaceAllOperation;
import org.eclipse.ocl.pivot.library.string.StringTokenizeOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.SequenceValue;
import org.eclipse.ocl.pivot.values.SetValue;

import org.eclipse.ocl.pivot.values.SetValue.Accumulator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elemento</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class ElementoImpl extends MinimalEObjectImpl.Container implements Elemento {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LatinoPackage.Literals.ELEMENTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Programa programa() {
		/**
		 *
		 * self.oclAsType(OclElement)
		 * ->closure(e | e.oclContainer())
		 * ->select(e | e.oclIsKindOf(Programa))
		 * ->any(true)
		 * .oclAsType(Programa)
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_OclElement_0 = idResolver
				.getClass(LatinoTables.CLSSid_OclElement, null);
		final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_latino_c_c_Programa_1 = idResolver
				.getClass(LatinoTables.CLSSid_Programa, null);
		final /*@NonInvalid*/ StandardLibrary standardLibrary = idResolver.getStandardLibrary();
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
				final /*@Thrown*/ Object oclContainer = ClassifierOclContainerOperation.INSTANCE.evaluate(executor,
						e_0);
				return oclContainer;
			}
		};
		final ExecutorSingleIterationManager MGR_closure_0 = new ExecutorSingleIterationManager(executor,
				LatinoTables.SET_CLSSid_OclElement_0, BODY_closure_0, oclAsSet, ACC_closure_0);
		final /*@Thrown*/ SetValue closure = (SetValue) IMPL_closure_0.evaluateIteration(MGR_closure_0);
		/*@Thrown*/ Accumulator accumulator = ValueUtil.createSetAccumulatorValue(LatinoTables.SET_CLSSid_OclElement_0);
		Iterator<Object> ITERATOR_e_1 = closure.iterator();
		/*@Thrown*/ SetValue select;
		while (true) {
			if (!ITERATOR_e_1.hasNext()) {
				select = accumulator;
				break;
			}
			/*@NonInvalid*/ Object e_1 = (Object) ITERATOR_e_1.next();
			/**
			 * e.oclIsKindOf(Programa)
			 */
			final /*@Thrown*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE
					.evaluate(executor, e_1, TYP_latino_c_c_Programa_1).booleanValue();
			//
			if (oclIsKindOf == ValueUtil.TRUE_VALUE) {
				accumulator.add(e_1);
			}
		}
		Iterator<Object> ITERATOR__1 = select.iterator();
		/*@Thrown*/ Object any;
		while (true) {
			if (!ITERATOR__1.hasNext()) {
				throw new InvalidValueException("Nothing to return for ''any''");
			}
			/*@NonInvalid*/ Object _1 = (Object) ITERATOR__1.next();
			/**
			 * true
			 */
			//
			if (ValueUtil.TRUE_VALUE) { // Carry on till something found
				any = _1;
				break;
			}
		}
		final /*@Thrown*/ Programa oclAsType_0 = (Programa) OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor, any,
				TYP_latino_c_c_Programa_1);
		return oclAsType_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean usaSoloVariablesDefinidas(final String texto) {
		/**
		 * texto = null or
		 * texto.replaceAll('"[^"]*"|\'[^\']*\'', '')
		 * .tokenize(' ()[]<>=!&|+-* /%.,')
		 * ->select(t |
		 *   t.matches('[a-zA-Z_][a-zA-Z0-9_]*') and t <> 'verdadero' and t <> 'falso' and t <> 'cierto')
		 * ->forAll(t | self.programa().defineVariable(t))
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ boolean eq = texto == null;
		final /*@Thrown*/ Boolean or;
		if (eq) {
			or = ValueUtil.TRUE_VALUE;
		} else {
			/*@Caught*/ Object CAUGHT_forAll;
			try {
				if (texto == null) {
					throw new InvalidValueException("Null \'\'String\'\' rather than \'\'OclVoid\'\' value required");
				}
				final /*@Thrown*/ String replaceAll = StringReplaceAllOperation.INSTANCE.evaluate(executor,
						TypeId.STRING, texto, LatinoTables.STR__34_91_94_34_93_a_34_124_39_91_94_39_93_a_39,
						LatinoTables.STR_);
				final /*@Thrown*/ SequenceValue tokenize = StringTokenizeOperation.INSTANCE.evaluate(executor,
						LatinoTables.SEQ_PRIMid_String, replaceAll,
						LatinoTables.STR__32_o_e_91_93_l_g_q_33_38_124_p_m_a_s_37__44);
				/*@Thrown*/ org.eclipse.ocl.pivot.values.SequenceValue.Accumulator accumulator = ValueUtil
						.createSequenceAccumulatorValue(LatinoTables.SEQ_PRIMid_String);
				Iterator<Object> ITERATOR_t = tokenize.iterator();
				/*@Thrown*/ SequenceValue select;
				while (true) {
					if (!ITERATOR_t.hasNext()) {
						select = accumulator;
						break;
					}
					/*@NonInvalid*/ String t = (String) ITERATOR_t.next();
					/**
					 *
					 * t.matches('[a-zA-Z_][a-zA-Z0-9_]*') and t <> 'verdadero' and t <> 'falso' and t <> 'cierto'
					 */
					/*@Caught*/ Object CAUGHT_and_0;
					try {
						final /*@NonInvalid*/ boolean matches = StringMatchesOperation.INSTANCE.evaluate(executor,
								TypeId.BOOLEAN, t, LatinoTables.STR__91_a_m_zA_m_Z__93_91_a_m_zA_m_Z0_m_9__93_a)
								.booleanValue();
						final /*@NonInvalid*/ Boolean and;
						if (!matches) {
							and = ValueUtil.FALSE_VALUE;
						} else {
							final /*@NonInvalid*/ boolean ne = !t.equals(LatinoTables.STR_verdadero);
							if (!ne) {
								and = ValueUtil.FALSE_VALUE;
							} else {
								and = ValueUtil.TRUE_VALUE;
							}
						}
						final /*@Thrown*/ Boolean and_0;
						if (and == ValueUtil.FALSE_VALUE) {
							and_0 = ValueUtil.FALSE_VALUE;
						} else {
							final /*@NonInvalid*/ boolean ne_0 = !t.equals(LatinoTables.STR_falso);
							if (!ne_0) {
								and_0 = ValueUtil.FALSE_VALUE;
							} else {
								if (and == null) {
									and_0 = null;
								} else {
									and_0 = ValueUtil.TRUE_VALUE;
								}
							}
						}
						CAUGHT_and_0 = and_0;
					} catch (Exception e) {
						CAUGHT_and_0 = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean and_1;
					if (CAUGHT_and_0 == ValueUtil.FALSE_VALUE) {
						and_1 = ValueUtil.FALSE_VALUE;
					} else {
						final /*@NonInvalid*/ boolean ne_1 = !t.equals(LatinoTables.STR_cierto);
						if (!ne_1) {
							and_1 = ValueUtil.FALSE_VALUE;
						} else {
							if (CAUGHT_and_0 instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_and_0;
							}
							if (CAUGHT_and_0 == null) {
								and_1 = null;
							} else {
								and_1 = ValueUtil.TRUE_VALUE;
							}
						}
					}
					if (and_1 == null) {
						throw new InvalidValueException(
								"Null body for \'Sequence(T).select(Sequence.T[?] | Lambda T() : Boolean[1]) : Sequence(T)\'");
					}
					//
					if (and_1 == ValueUtil.TRUE_VALUE) {
						accumulator.add(t);
					}
				}
				/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
				Iterator<Object> ITERATOR_t_0 = select.iterator();
				/*@Thrown*/ Boolean forAll;
				while (true) {
					if (!ITERATOR_t_0.hasNext()) {
						if (accumulator_0 == ValueUtil.TRUE_VALUE) {
							forAll = ValueUtil.TRUE_VALUE;
						} else {
							throw (InvalidValueException) accumulator_0;
						}
						break;
					}
					/*@NonInvalid*/ String t_0 = (String) ITERATOR_t_0.next();
					/**
					 * self.programa().defineVariable(t)
					 */
					final /*@NonInvalid*/ Programa programa = this.programa();
					final /*@NonInvalid*/ boolean defineVariable = programa.defineVariable(t_0);
					//
					if (!defineVariable) { // Normal unsuccessful body evaluation result
						forAll = ValueUtil.FALSE_VALUE;
						break; // Stop immediately
					} else if (defineVariable) { // Normal successful body evaluation result
						; // Carry on
					} else { // Impossible badly typed result
						accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
					}
				}
				CAUGHT_forAll = forAll;
			} catch (Exception e) {
				CAUGHT_forAll = ValueUtil.createInvalidValue(e);
			}
			if (CAUGHT_forAll == ValueUtil.TRUE_VALUE) {
				or = ValueUtil.TRUE_VALUE;
			} else {
				if (CAUGHT_forAll instanceof InvalidValueException) {
					throw (InvalidValueException) CAUGHT_forAll;
				}
				if (CAUGHT_forAll == null) {
					or = null;
				} else {
					or = ValueUtil.FALSE_VALUE;
				}
			}
		}
		if (or == null) {
			throw new InvalidValueException(
					"Null body for \'latino::Elemento::usaSoloVariablesDefinidas(String[?]) : Boolean[1]\'");
		}
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String tipoTexto(final String texto) {
		/**
		 *
		 * if texto = null
		 * then 'desconocido'
		 * else
		 *   let
		 *     s : String[1] = texto.replaceAll('"[^"]*"|\'[^\']*\'', '')
		 *   in
		 *     if
		 *       s.matches('.*[a-zA-Z_][a-zA-Z0-9_]* *[(].*')
		 *     then 'desconocido'
		 *     else
		 *       if
		 *         s.matches('.*(==|!=|<|>|&&|[|][|]|!).*') or
		 *         s.matches('.*\\b(verdadero|falso|cierto)\\b.*')
		 *       then 'logico'
		 *       else
		 *         if texto.matches('.*(["\']|[.][.]).*')
		 *         then 'texto'
		 *         else
		 *           if
		 *             s.tokenize(' ()[]<>=!&|+-* /%.,')
		 *             ->forAll(t |
		 *               not t.matches('[a-zA-Z_][a-zA-Z0-9_]*'))
		 *           then 'numero'
		 *           else 'desconocido'
		 *           endif
		 *         endif
		 *       endif
		 *     endif
		 * endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ boolean eq = texto == null;
		/*@NonInvalid*/ String IF_eq;
		if (eq) {
			IF_eq = LatinoTables.STR_desconocido;
		} else {
			/*@Caught*/ Object CAUGHT_s;
			try {
				if (texto == null) {
					throw new InvalidValueException("Null \'\'String\'\' rather than \'\'OclVoid\'\' value required");
				}
				final /*@Thrown*/ String s = StringReplaceAllOperation.INSTANCE.evaluate(executor, TypeId.STRING, texto,
						LatinoTables.STR__34_91_94_34_93_a_34_124_39_91_94_39_93_a_39, LatinoTables.STR_);
				CAUGHT_s = s;
			} catch (Exception e) {
				CAUGHT_s = ValueUtil.createInvalidValue(e);
			}
			if (CAUGHT_s instanceof InvalidValueException) {
				throw (InvalidValueException) CAUGHT_s;
			}
			final /*@Thrown*/ boolean matches = StringMatchesOperation.INSTANCE
					.evaluate(executor, TypeId.BOOLEAN, CAUGHT_s,
							LatinoTables.STR__a_91_a_m_zA_m_Z__93_91_a_m_zA_m_Z0_m_9__93_a_32_a_91_o_93__a)
					.booleanValue();
			/*@NonInvalid*/ String IF_matches;
			if (matches) {
				IF_matches = LatinoTables.STR_desconocido;
			} else {
				/*@Caught*/ Object CAUGHT_matches_0;
				try {
					final /*@Thrown*/ boolean matches_0 = StringMatchesOperation.INSTANCE.evaluate(executor,
							TypeId.BOOLEAN, CAUGHT_s,
							LatinoTables.STR__a_o_q_q_124_33_q_124_l_124_g_124_38_38_124_91_124_93_91_124_93_124_33_e__a)
							.booleanValue();
					CAUGHT_matches_0 = matches_0;
				} catch (Exception e) {
					CAUGHT_matches_0 = ValueUtil.createInvalidValue(e);
				}
				final /*@Thrown*/ Boolean or;
				if (CAUGHT_matches_0 == ValueUtil.TRUE_VALUE) {
					or = ValueUtil.TRUE_VALUE;
				} else {
					/*@Caught*/ Object CAUGHT_matches_1;
					try {
						final /*@Thrown*/ boolean matches_1 = StringMatchesOperation.INSTANCE
								.evaluate(executor, TypeId.BOOLEAN, CAUGHT_s,
										LatinoTables.STR__a_92_b_o_verdadero_124_falso_124_cierto_e_92_b_a)
								.booleanValue();
						CAUGHT_matches_1 = matches_1;
					} catch (Exception e) {
						CAUGHT_matches_1 = ValueUtil.createInvalidValue(e);
					}
					if (CAUGHT_matches_1 == ValueUtil.TRUE_VALUE) {
						or = ValueUtil.TRUE_VALUE;
					} else {
						if (CAUGHT_matches_0 instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_matches_0;
						}
						if (CAUGHT_matches_1 instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_matches_1;
						}
						or = ValueUtil.FALSE_VALUE;
					}
				}
				if (or == null) {
					throw new InvalidValueException("Null if condition");
				}
				/*@NonInvalid*/ String IF_or;
				if (or) {
					IF_or = LatinoTables.STR_logico;
				} else {
					if (texto == null) {
						throw new InvalidValueException(
								"Null \'\'String\'\' rather than \'\'OclVoid\'\' value required");
					}
					final /*@Thrown*/ boolean matches_2 = StringMatchesOperation.INSTANCE.evaluate(executor,
							TypeId.BOOLEAN, texto, LatinoTables.STR__a_o_91_34_39_93_124_91__93_91__93_e__a)
							.booleanValue();
					/*@NonInvalid*/ String IF_matches_2;
					if (matches_2) {
						IF_matches_2 = LatinoTables.STR_texto;
					} else {
						final /*@Thrown*/ SequenceValue tokenize = StringTokenizeOperation.INSTANCE.evaluate(executor,
								LatinoTables.SEQ_PRIMid_String, CAUGHT_s,
								LatinoTables.STR__32_o_e_91_93_l_g_q_33_38_124_p_m_a_s_37__44);
						/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
						Iterator<Object> ITERATOR_t = tokenize.iterator();
						/*@Thrown*/ Boolean forAll;
						while (true) {
							if (!ITERATOR_t.hasNext()) {
								if (accumulator == null) {
									forAll = null;
								} else if (accumulator == ValueUtil.TRUE_VALUE) {
									forAll = ValueUtil.TRUE_VALUE;
								} else {
									throw (InvalidValueException) accumulator;
								}
								break;
							}
							/*@NonInvalid*/ String t = (String) ITERATOR_t.next();
							/**
							 * not t.matches('[a-zA-Z_][a-zA-Z0-9_]*')
							 */
							final /*@NonInvalid*/ boolean matches_3 = StringMatchesOperation.INSTANCE
									.evaluate(executor, TypeId.BOOLEAN, t,
											LatinoTables.STR__91_a_m_zA_m_Z__93_91_a_m_zA_m_Z0_m_9__93_a)
									.booleanValue();
							final /*@NonInvalid*/ Boolean not;
							if (!matches_3) {
								not = ValueUtil.TRUE_VALUE;
							} else {
								if (matches_3) {
									not = ValueUtil.FALSE_VALUE;
								} else {
									not = null;
								}
							}
							//
							if (not == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
								forAll = ValueUtil.FALSE_VALUE;
								break; // Stop immediately
							} else if (not == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
								; // Carry on
							} else if (not == null) { // Abnormal null body evaluation result
								if (accumulator == ValueUtil.TRUE_VALUE) {
									accumulator = null; // Cache a null failure
								}
							} else { // Impossible badly typed result
								accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
							}
						}
						if (forAll == null) {
							throw new InvalidValueException("Null if condition");
						}
						/*@NonInvalid*/ String IF_forAll;
						if (forAll) {
							IF_forAll = LatinoTables.STR_numero;
						} else {
							IF_forAll = LatinoTables.STR_desconocido;
						}
						IF_matches_2 = IF_forAll;
					}
					IF_or = IF_matches_2;
				}
				IF_matches = IF_or;
			}
			IF_eq = IF_matches;
		}
		return IF_eq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean operandosNumericos(final String texto) {
		/**
		 * texto = null or
		 * texto.replaceAll('"[^"]*"|\'[^\']*\'', '')
		 * .matches('.*[a-zA-Z_][a-zA-Z0-9_]* *[(].*') or
		 * not texto.replaceAll('"[^"]*"|\'[^\']*\'', '@')
		 * .replaceAll('[()]', '')
		 * .replaceAll('\\b(verdadero|falso|cierto)\\b', '@')
		 * .replaceAll(' ', '')
		 * .matches('.*(@[-+* /%]|[-+* /%]@).*')
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		/*@Caught*/ Object CAUGHT_or;
		try {
			final /*@NonInvalid*/ boolean eq = texto == null;
			final /*@Thrown*/ Boolean or;
			if (eq) {
				or = ValueUtil.TRUE_VALUE;
			} else {
				/*@Caught*/ Object CAUGHT_matches;
				try {
					if (texto == null) {
						throw new InvalidValueException(
								"Null \'\'String\'\' rather than \'\'OclVoid\'\' value required");
					}
					final /*@Thrown*/ String replaceAll = StringReplaceAllOperation.INSTANCE.evaluate(executor,
							TypeId.STRING, texto, LatinoTables.STR__34_91_94_34_93_a_34_124_39_91_94_39_93_a_39,
							LatinoTables.STR_);
					final /*@Thrown*/ boolean matches = StringMatchesOperation.INSTANCE
							.evaluate(executor, TypeId.BOOLEAN, replaceAll,
									LatinoTables.STR__a_91_a_m_zA_m_Z__93_91_a_m_zA_m_Z0_m_9__93_a_32_a_91_o_93__a)
							.booleanValue();
					CAUGHT_matches = matches;
				} catch (Exception e) {
					CAUGHT_matches = ValueUtil.createInvalidValue(e);
				}
				if (CAUGHT_matches == ValueUtil.TRUE_VALUE) {
					or = ValueUtil.TRUE_VALUE;
				} else {
					if (CAUGHT_matches instanceof InvalidValueException) {
						throw (InvalidValueException) CAUGHT_matches;
					}
					or = ValueUtil.FALSE_VALUE;
				}
			}
			CAUGHT_or = or;
		} catch (Exception e) {
			CAUGHT_or = ValueUtil.createInvalidValue(e);
		}
		final /*@Thrown*/ Boolean or_0;
		if (CAUGHT_or == ValueUtil.TRUE_VALUE) {
			or_0 = ValueUtil.TRUE_VALUE;
		} else {
			/*@Caught*/ Object CAUGHT_not;
			try {
				/*@Caught*/ Object CAUGHT_matches_0;
				try {
					if (texto == null) {
						throw new InvalidValueException(
								"Null \'\'String\'\' rather than \'\'OclVoid\'\' value required");
					}
					final /*@Thrown*/ String replaceAll_0 = StringReplaceAllOperation.INSTANCE.evaluate(executor,
							TypeId.STRING, texto, LatinoTables.STR__34_91_94_34_93_a_34_124_39_91_94_39_93_a_39,
							LatinoTables.STR__64);
					final /*@Thrown*/ String replaceAll_1 = StringReplaceAllOperation.INSTANCE.evaluate(executor,
							TypeId.STRING, replaceAll_0, LatinoTables.STR__91_o_e_93, LatinoTables.STR_);
					final /*@Thrown*/ String replaceAll_2 = StringReplaceAllOperation.INSTANCE.evaluate(executor,
							TypeId.STRING, replaceAll_1, LatinoTables.STR__92_b_o_verdadero_124_falso_124_cierto_e_92_b,
							LatinoTables.STR__64);
					final /*@Thrown*/ String replaceAll_3 = StringReplaceAllOperation.INSTANCE.evaluate(executor,
							TypeId.STRING, replaceAll_2, LatinoTables.STR__32, LatinoTables.STR_);
					final /*@Thrown*/ boolean matches_0 = StringMatchesOperation.INSTANCE
							.evaluate(executor, TypeId.BOOLEAN, replaceAll_3,
									LatinoTables.STR__a_o_64_91_m_p_a_s_37_93_124_91_m_p_a_s_37_93_64_e__a)
							.booleanValue();
					CAUGHT_matches_0 = matches_0;
				} catch (Exception e) {
					CAUGHT_matches_0 = ValueUtil.createInvalidValue(e);
				}
				if (CAUGHT_matches_0 instanceof InvalidValueException) {
					throw (InvalidValueException) CAUGHT_matches_0;
				}
				final /*@Thrown*/ Boolean not;
				if (CAUGHT_matches_0 == ValueUtil.FALSE_VALUE) {
					not = ValueUtil.TRUE_VALUE;
				} else {
					if (CAUGHT_matches_0 == ValueUtil.TRUE_VALUE) {
						not = ValueUtil.FALSE_VALUE;
					} else {
						not = null;
					}
				}
				CAUGHT_not = not;
			} catch (Exception e) {
				CAUGHT_not = ValueUtil.createInvalidValue(e);
			}
			if (CAUGHT_not == ValueUtil.TRUE_VALUE) {
				or_0 = ValueUtil.TRUE_VALUE;
			} else {
				if (CAUGHT_or instanceof InvalidValueException) {
					throw (InvalidValueException) CAUGHT_or;
				}
				if (CAUGHT_not instanceof InvalidValueException) {
					throw (InvalidValueException) CAUGHT_not;
				}
				if ((CAUGHT_or == null) || (CAUGHT_not == null)) {
					or_0 = null;
				} else {
					or_0 = ValueUtil.FALSE_VALUE;
				}
			}
		}
		if (or_0 == null) {
			throw new InvalidValueException(
					"Null body for \'latino::Elemento::operandosNumericos(String[?]) : Boolean[1]\'");
		}
		return or_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean esReservadaGo(final String n) {
		/**
		 *
		 * Set{'break', 'case', 'chan', 'const', 'continue', 'default', 'defer', 'else', 'fallthrough', 'for', 'func', 'go', 'goto', 'if', 'import', 'interface', 'map', 'package', 'range', 'return', 'select', 'struct', 'switch', 'type', 'var', 'fmt', 'main', 'true', 'false', 'nil', 'int', 'float64', 'string', 'bool', 'any', 'init', '_', 'leerTexto', 'leerNumero', 'aTexto', 'lector', 'bufio', 'math', 'os', 'strconv', 'strings', 'primeraVuelta'
		 * }
		 * ->includes(n)
		 */
		final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(LatinoTables.Set, n)
				.booleanValue();
		return includes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean esReservadaLatino(final String n) {
		/**
		 *
		 * Set{'global', 'ir', 'nulo', 'clase', 'constructor', 'hereda', 'super', 'mi', 'estatico', 'nueva'
		 * }
		 * ->includes(n)
		 */
		final /*@Thrown*/ boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(LatinoTables.Set_0, n)
				.booleanValue();
		return includes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case LatinoPackage.ELEMENTO___PROGRAMA:
			return programa();
		case LatinoPackage.ELEMENTO___USA_SOLO_VARIABLES_DEFINIDAS__STRING:
			return usaSoloVariablesDefinidas((String) arguments.get(0));
		case LatinoPackage.ELEMENTO___TIPO_TEXTO__STRING:
			return tipoTexto((String) arguments.get(0));
		case LatinoPackage.ELEMENTO___OPERANDOS_NUMERICOS__STRING:
			return operandosNumericos((String) arguments.get(0));
		case LatinoPackage.ELEMENTO___ES_RESERVADA_GO__STRING:
			return esReservadaGo((String) arguments.get(0));
		case LatinoPackage.ELEMENTO___ES_RESERVADA_LATINO__STRING:
			return esReservadaLatino((String) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ElementoImpl
