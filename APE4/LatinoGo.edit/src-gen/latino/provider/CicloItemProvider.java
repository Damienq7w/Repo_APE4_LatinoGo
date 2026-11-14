/**
 */
package latino.provider;

import java.util.Collection;
import java.util.List;

import latino.Ciclo;
import latino.LatinoFactory;
import latino.LatinoPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link latino.Ciclo} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CicloItemProvider extends SentenciaItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CicloItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(LatinoPackage.Literals.CICLO__CUERPO);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Ciclo_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Ciclo.class)) {
		case LatinoPackage.CICLO__CUERPO:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(
				createChildParameter(LatinoPackage.Literals.CICLO__CUERPO, LatinoFactory.eINSTANCE.createAsignacion()));

		newChildDescriptors
				.add(createChildParameter(LatinoPackage.Literals.CICLO__CUERPO, LatinoFactory.eINSTANCE.createLeer()));

		newChildDescriptors
				.add(createChildParameter(LatinoPackage.Literals.CICLO__CUERPO, LatinoFactory.eINSTANCE.createLista()));

		newChildDescriptors.add(createChildParameter(LatinoPackage.Literals.CICLO__CUERPO,
				LatinoFactory.eINSTANCE.createAsignacionIndice()));

		newChildDescriptors.add(createChildParameter(LatinoPackage.Literals.CICLO__CUERPO,
				LatinoFactory.eINSTANCE.createCondicional()));

		newChildDescriptors.add(
				createChildParameter(LatinoPackage.Literals.CICLO__CUERPO, LatinoFactory.eINSTANCE.createImprimir()));

		newChildDescriptors.add(
				createChildParameter(LatinoPackage.Literals.CICLO__CUERPO, LatinoFactory.eINSTANCE.createMientras()));

		newChildDescriptors.add(
				createChildParameter(LatinoPackage.Literals.CICLO__CUERPO, LatinoFactory.eINSTANCE.createRepetir()));

		newChildDescriptors
				.add(createChildParameter(LatinoPackage.Literals.CICLO__CUERPO, LatinoFactory.eINSTANCE.createDesde()));

		newChildDescriptors
				.add(createChildParameter(LatinoPackage.Literals.CICLO__CUERPO, LatinoFactory.eINSTANCE.createPara()));

		newChildDescriptors.add(
				createChildParameter(LatinoPackage.Literals.CICLO__CUERPO, LatinoFactory.eINSTANCE.createIncremento()));

		newChildDescriptors.add(
				createChildParameter(LatinoPackage.Literals.CICLO__CUERPO, LatinoFactory.eINSTANCE.createRomper()));

		newChildDescriptors.add(
				createChildParameter(LatinoPackage.Literals.CICLO__CUERPO, LatinoFactory.eINSTANCE.createContinuar()));

		newChildDescriptors.add(
				createChildParameter(LatinoPackage.Literals.CICLO__CUERPO, LatinoFactory.eINSTANCE.createElegir()));

		newChildDescriptors.add(
				createChildParameter(LatinoPackage.Literals.CICLO__CUERPO, LatinoFactory.eINSTANCE.createFuncion()));

		newChildDescriptors.add(
				createChildParameter(LatinoPackage.Literals.CICLO__CUERPO, LatinoFactory.eINSTANCE.createRetorno()));

		newChildDescriptors.add(
				createChildParameter(LatinoPackage.Literals.CICLO__CUERPO, LatinoFactory.eINSTANCE.createLlamada()));
	}

}
