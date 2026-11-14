/**
 */
package latino.util;

import latino.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see latino.LatinoPackage
 * @generated
 */
public class LatinoSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LatinoPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LatinoSwitch() {
		if (modelPackage == null) {
			modelPackage = LatinoPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case LatinoPackage.PROGRAMA: {
			Programa programa = (Programa) theEObject;
			T result = casePrograma(programa);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LatinoPackage.ELEMENTO: {
			Elemento elemento = (Elemento) theEObject;
			T result = caseElemento(elemento);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LatinoPackage.SENTENCIA: {
			Sentencia sentencia = (Sentencia) theEObject;
			T result = caseSentencia(sentencia);
			if (result == null)
				result = caseElemento(sentencia);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LatinoPackage.DEFINICION: {
			Definicion definicion = (Definicion) theEObject;
			T result = caseDefinicion(definicion);
			if (result == null)
				result = caseSentencia(definicion);
			if (result == null)
				result = caseElemento(definicion);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LatinoPackage.ASIGNACION: {
			Asignacion asignacion = (Asignacion) theEObject;
			T result = caseAsignacion(asignacion);
			if (result == null)
				result = caseDefinicion(asignacion);
			if (result == null)
				result = caseSentencia(asignacion);
			if (result == null)
				result = caseElemento(asignacion);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LatinoPackage.LEER: {
			Leer leer = (Leer) theEObject;
			T result = caseLeer(leer);
			if (result == null)
				result = caseDefinicion(leer);
			if (result == null)
				result = caseSentencia(leer);
			if (result == null)
				result = caseElemento(leer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LatinoPackage.LISTA: {
			Lista lista = (Lista) theEObject;
			T result = caseLista(lista);
			if (result == null)
				result = caseDefinicion(lista);
			if (result == null)
				result = caseSentencia(lista);
			if (result == null)
				result = caseElemento(lista);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LatinoPackage.ASIGNACION_INDICE: {
			AsignacionIndice asignacionIndice = (AsignacionIndice) theEObject;
			T result = caseAsignacionIndice(asignacionIndice);
			if (result == null)
				result = caseSentencia(asignacionIndice);
			if (result == null)
				result = caseElemento(asignacionIndice);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LatinoPackage.CONDICIONAL: {
			Condicional condicional = (Condicional) theEObject;
			T result = caseCondicional(condicional);
			if (result == null)
				result = caseSentencia(condicional);
			if (result == null)
				result = caseElemento(condicional);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LatinoPackage.OSI: {
			Osi osi = (Osi) theEObject;
			T result = caseOsi(osi);
			if (result == null)
				result = caseElemento(osi);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LatinoPackage.IMPRIMIR: {
			Imprimir imprimir = (Imprimir) theEObject;
			T result = caseImprimir(imprimir);
			if (result == null)
				result = caseSentencia(imprimir);
			if (result == null)
				result = caseElemento(imprimir);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LatinoPackage.CICLO: {
			Ciclo ciclo = (Ciclo) theEObject;
			T result = caseCiclo(ciclo);
			if (result == null)
				result = caseSentencia(ciclo);
			if (result == null)
				result = caseElemento(ciclo);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LatinoPackage.CICLO_CONDICION: {
			CicloCondicion cicloCondicion = (CicloCondicion) theEObject;
			T result = caseCicloCondicion(cicloCondicion);
			if (result == null)
				result = caseCiclo(cicloCondicion);
			if (result == null)
				result = caseSentencia(cicloCondicion);
			if (result == null)
				result = caseElemento(cicloCondicion);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LatinoPackage.MIENTRAS: {
			Mientras mientras = (Mientras) theEObject;
			T result = caseMientras(mientras);
			if (result == null)
				result = caseCicloCondicion(mientras);
			if (result == null)
				result = caseCiclo(mientras);
			if (result == null)
				result = caseSentencia(mientras);
			if (result == null)
				result = caseElemento(mientras);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LatinoPackage.REPETIR: {
			Repetir repetir = (Repetir) theEObject;
			T result = caseRepetir(repetir);
			if (result == null)
				result = caseCicloCondicion(repetir);
			if (result == null)
				result = caseCiclo(repetir);
			if (result == null)
				result = caseSentencia(repetir);
			if (result == null)
				result = caseElemento(repetir);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LatinoPackage.DESDE: {
			Desde desde = (Desde) theEObject;
			T result = caseDesde(desde);
			if (result == null)
				result = caseCicloCondicion(desde);
			if (result == null)
				result = caseCiclo(desde);
			if (result == null)
				result = caseSentencia(desde);
			if (result == null)
				result = caseElemento(desde);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LatinoPackage.PARA: {
			Para para = (Para) theEObject;
			T result = casePara(para);
			if (result == null)
				result = caseCiclo(para);
			if (result == null)
				result = caseSentencia(para);
			if (result == null)
				result = caseElemento(para);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LatinoPackage.INCREMENTO: {
			Incremento incremento = (Incremento) theEObject;
			T result = caseIncremento(incremento);
			if (result == null)
				result = caseSentencia(incremento);
			if (result == null)
				result = caseElemento(incremento);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LatinoPackage.SALTO: {
			Salto salto = (Salto) theEObject;
			T result = caseSalto(salto);
			if (result == null)
				result = caseSentencia(salto);
			if (result == null)
				result = caseElemento(salto);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LatinoPackage.ROMPER: {
			Romper romper = (Romper) theEObject;
			T result = caseRomper(romper);
			if (result == null)
				result = caseSalto(romper);
			if (result == null)
				result = caseSentencia(romper);
			if (result == null)
				result = caseElemento(romper);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LatinoPackage.CONTINUAR: {
			Continuar continuar = (Continuar) theEObject;
			T result = caseContinuar(continuar);
			if (result == null)
				result = caseSalto(continuar);
			if (result == null)
				result = caseSentencia(continuar);
			if (result == null)
				result = caseElemento(continuar);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LatinoPackage.VARIABLE: {
			Variable variable = (Variable) theEObject;
			T result = caseVariable(variable);
			if (result == null)
				result = caseElemento(variable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LatinoPackage.ELEGIR: {
			Elegir elegir = (Elegir) theEObject;
			T result = caseElegir(elegir);
			if (result == null)
				result = caseSentencia(elegir);
			if (result == null)
				result = caseElemento(elegir);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LatinoPackage.CASO: {
			Caso caso = (Caso) theEObject;
			T result = caseCaso(caso);
			if (result == null)
				result = caseElemento(caso);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LatinoPackage.FUNCION: {
			Funcion funcion = (Funcion) theEObject;
			T result = caseFuncion(funcion);
			if (result == null)
				result = caseDefinicion(funcion);
			if (result == null)
				result = caseSentencia(funcion);
			if (result == null)
				result = caseElemento(funcion);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LatinoPackage.RETORNO: {
			Retorno retorno = (Retorno) theEObject;
			T result = caseRetorno(retorno);
			if (result == null)
				result = caseSentencia(retorno);
			if (result == null)
				result = caseElemento(retorno);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LatinoPackage.LLAMADA: {
			Llamada llamada = (Llamada) theEObject;
			T result = caseLlamada(llamada);
			if (result == null)
				result = caseSentencia(llamada);
			if (result == null)
				result = caseElemento(llamada);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Programa</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Programa</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrograma(Programa object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elemento</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elemento</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElemento(Elemento object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sentencia</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sentencia</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSentencia(Sentencia object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definicion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definicion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefinicion(Definicion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asignacion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asignacion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsignacion(Asignacion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Leer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Leer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeer(Leer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lista</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lista</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLista(Lista object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asignacion Indice</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asignacion Indice</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsignacionIndice(AsignacionIndice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condicional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condicional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondicional(Condicional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Osi</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Osi</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOsi(Osi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imprimir</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imprimir</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImprimir(Imprimir object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ciclo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ciclo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCiclo(Ciclo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ciclo Condicion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ciclo Condicion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCicloCondicion(CicloCondicion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mientras</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mientras</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMientras(Mientras object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repetir</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repetir</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepetir(Repetir object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Desde</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Desde</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDesde(Desde object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Para</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Para</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePara(Para object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Incremento</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Incremento</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncremento(Incremento object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Salto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Salto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSalto(Salto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Romper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Romper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRomper(Romper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continuar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continuar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinuar(Continuar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elegir</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elegir</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElegir(Elegir object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Caso</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Caso</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCaso(Caso object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Funcion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Funcion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuncion(Funcion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Retorno</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Retorno</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRetorno(Retorno object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Llamada</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Llamada</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLlamada(Llamada object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //LatinoSwitch
