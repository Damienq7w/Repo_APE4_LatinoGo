/**
 */
package latino.impl;

import latino.Asignacion;
import latino.Desde;
import latino.LatinoPackage;
import latino.Sentencia;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Desde</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link latino.impl.DesdeImpl#getInicio <em>Inicio</em>}</li>
 *   <li>{@link latino.impl.DesdeImpl#getPaso <em>Paso</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DesdeImpl extends CicloCondicionImpl implements Desde {
	/**
	 * The cached value of the '{@link #getInicio() <em>Inicio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInicio()
	 * @generated
	 * @ordered
	 */
	protected Asignacion inicio;

	/**
	 * The cached value of the '{@link #getPaso() <em>Paso</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaso()
	 * @generated
	 * @ordered
	 */
	protected Sentencia paso;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DesdeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LatinoPackage.Literals.DESDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Asignacion getInicio() {
		return inicio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInicio(Asignacion newInicio, NotificationChain msgs) {
		Asignacion oldInicio = inicio;
		inicio = newInicio;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LatinoPackage.DESDE__INICIO,
					oldInicio, newInicio);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInicio(Asignacion newInicio) {
		if (newInicio != inicio) {
			NotificationChain msgs = null;
			if (inicio != null)
				msgs = ((InternalEObject) inicio).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - LatinoPackage.DESDE__INICIO, null, msgs);
			if (newInicio != null)
				msgs = ((InternalEObject) newInicio).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - LatinoPackage.DESDE__INICIO, null, msgs);
			msgs = basicSetInicio(newInicio, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LatinoPackage.DESDE__INICIO, newInicio, newInicio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sentencia getPaso() {
		return paso;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaso(Sentencia newPaso, NotificationChain msgs) {
		Sentencia oldPaso = paso;
		paso = newPaso;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LatinoPackage.DESDE__PASO,
					oldPaso, newPaso);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPaso(Sentencia newPaso) {
		if (newPaso != paso) {
			NotificationChain msgs = null;
			if (paso != null)
				msgs = ((InternalEObject) paso).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LatinoPackage.DESDE__PASO,
						null, msgs);
			if (newPaso != null)
				msgs = ((InternalEObject) newPaso).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LatinoPackage.DESDE__PASO,
						null, msgs);
			msgs = basicSetPaso(newPaso, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LatinoPackage.DESDE__PASO, newPaso, newPaso));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case LatinoPackage.DESDE__INICIO:
			return basicSetInicio(null, msgs);
		case LatinoPackage.DESDE__PASO:
			return basicSetPaso(null, msgs);
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
		case LatinoPackage.DESDE__INICIO:
			return getInicio();
		case LatinoPackage.DESDE__PASO:
			return getPaso();
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
		case LatinoPackage.DESDE__INICIO:
			setInicio((Asignacion) newValue);
			return;
		case LatinoPackage.DESDE__PASO:
			setPaso((Sentencia) newValue);
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
		case LatinoPackage.DESDE__INICIO:
			setInicio((Asignacion) null);
			return;
		case LatinoPackage.DESDE__PASO:
			setPaso((Sentencia) null);
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
		case LatinoPackage.DESDE__INICIO:
			return inicio != null;
		case LatinoPackage.DESDE__PASO:
			return paso != null;
		}
		return super.eIsSet(featureID);
	}

} //DesdeImpl
