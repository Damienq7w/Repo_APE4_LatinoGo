/**
 */
package latino.util;

import latino.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see latino.LatinoPackage
 * @generated
 */
public class LatinoAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LatinoPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LatinoAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LatinoPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LatinoSwitch<Adapter> modelSwitch = new LatinoSwitch<Adapter>() {
		@Override
		public Adapter casePrograma(Programa object) {
			return createProgramaAdapter();
		}

		@Override
		public Adapter caseElemento(Elemento object) {
			return createElementoAdapter();
		}

		@Override
		public Adapter caseSentencia(Sentencia object) {
			return createSentenciaAdapter();
		}

		@Override
		public Adapter caseDefinicion(Definicion object) {
			return createDefinicionAdapter();
		}

		@Override
		public Adapter caseAsignacion(Asignacion object) {
			return createAsignacionAdapter();
		}

		@Override
		public Adapter caseLeer(Leer object) {
			return createLeerAdapter();
		}

		@Override
		public Adapter caseLista(Lista object) {
			return createListaAdapter();
		}

		@Override
		public Adapter caseAsignacionIndice(AsignacionIndice object) {
			return createAsignacionIndiceAdapter();
		}

		@Override
		public Adapter caseCondicional(Condicional object) {
			return createCondicionalAdapter();
		}

		@Override
		public Adapter caseOsi(Osi object) {
			return createOsiAdapter();
		}

		@Override
		public Adapter caseImprimir(Imprimir object) {
			return createImprimirAdapter();
		}

		@Override
		public Adapter caseCiclo(Ciclo object) {
			return createCicloAdapter();
		}

		@Override
		public Adapter caseCicloCondicion(CicloCondicion object) {
			return createCicloCondicionAdapter();
		}

		@Override
		public Adapter caseMientras(Mientras object) {
			return createMientrasAdapter();
		}

		@Override
		public Adapter caseRepetir(Repetir object) {
			return createRepetirAdapter();
		}

		@Override
		public Adapter caseDesde(Desde object) {
			return createDesdeAdapter();
		}

		@Override
		public Adapter casePara(Para object) {
			return createParaAdapter();
		}

		@Override
		public Adapter caseIncremento(Incremento object) {
			return createIncrementoAdapter();
		}

		@Override
		public Adapter caseSalto(Salto object) {
			return createSaltoAdapter();
		}

		@Override
		public Adapter caseRomper(Romper object) {
			return createRomperAdapter();
		}

		@Override
		public Adapter caseContinuar(Continuar object) {
			return createContinuarAdapter();
		}

		@Override
		public Adapter caseVariable(Variable object) {
			return createVariableAdapter();
		}

		@Override
		public Adapter caseElegir(Elegir object) {
			return createElegirAdapter();
		}

		@Override
		public Adapter caseCaso(Caso object) {
			return createCasoAdapter();
		}

		@Override
		public Adapter caseFuncion(Funcion object) {
			return createFuncionAdapter();
		}

		@Override
		public Adapter caseRetorno(Retorno object) {
			return createRetornoAdapter();
		}

		@Override
		public Adapter caseLlamada(Llamada object) {
			return createLlamadaAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link latino.Programa <em>Programa</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see latino.Programa
	 * @generated
	 */
	public Adapter createProgramaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link latino.Elemento <em>Elemento</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see latino.Elemento
	 * @generated
	 */
	public Adapter createElementoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link latino.Sentencia <em>Sentencia</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see latino.Sentencia
	 * @generated
	 */
	public Adapter createSentenciaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link latino.Definicion <em>Definicion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see latino.Definicion
	 * @generated
	 */
	public Adapter createDefinicionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link latino.Asignacion <em>Asignacion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see latino.Asignacion
	 * @generated
	 */
	public Adapter createAsignacionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link latino.Leer <em>Leer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see latino.Leer
	 * @generated
	 */
	public Adapter createLeerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link latino.Lista <em>Lista</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see latino.Lista
	 * @generated
	 */
	public Adapter createListaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link latino.AsignacionIndice <em>Asignacion Indice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see latino.AsignacionIndice
	 * @generated
	 */
	public Adapter createAsignacionIndiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link latino.Condicional <em>Condicional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see latino.Condicional
	 * @generated
	 */
	public Adapter createCondicionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link latino.Osi <em>Osi</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see latino.Osi
	 * @generated
	 */
	public Adapter createOsiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link latino.Imprimir <em>Imprimir</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see latino.Imprimir
	 * @generated
	 */
	public Adapter createImprimirAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link latino.Ciclo <em>Ciclo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see latino.Ciclo
	 * @generated
	 */
	public Adapter createCicloAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link latino.CicloCondicion <em>Ciclo Condicion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see latino.CicloCondicion
	 * @generated
	 */
	public Adapter createCicloCondicionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link latino.Mientras <em>Mientras</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see latino.Mientras
	 * @generated
	 */
	public Adapter createMientrasAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link latino.Repetir <em>Repetir</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see latino.Repetir
	 * @generated
	 */
	public Adapter createRepetirAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link latino.Desde <em>Desde</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see latino.Desde
	 * @generated
	 */
	public Adapter createDesdeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link latino.Para <em>Para</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see latino.Para
	 * @generated
	 */
	public Adapter createParaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link latino.Incremento <em>Incremento</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see latino.Incremento
	 * @generated
	 */
	public Adapter createIncrementoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link latino.Salto <em>Salto</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see latino.Salto
	 * @generated
	 */
	public Adapter createSaltoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link latino.Romper <em>Romper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see latino.Romper
	 * @generated
	 */
	public Adapter createRomperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link latino.Continuar <em>Continuar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see latino.Continuar
	 * @generated
	 */
	public Adapter createContinuarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link latino.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see latino.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link latino.Elegir <em>Elegir</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see latino.Elegir
	 * @generated
	 */
	public Adapter createElegirAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link latino.Caso <em>Caso</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see latino.Caso
	 * @generated
	 */
	public Adapter createCasoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link latino.Funcion <em>Funcion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see latino.Funcion
	 * @generated
	 */
	public Adapter createFuncionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link latino.Retorno <em>Retorno</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see latino.Retorno
	 * @generated
	 */
	public Adapter createRetornoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link latino.Llamada <em>Llamada</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see latino.Llamada
	 * @generated
	 */
	public Adapter createLlamadaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //LatinoAdapterFactory
