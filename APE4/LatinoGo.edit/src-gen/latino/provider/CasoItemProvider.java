/**
 */
package latino.provider;

import java.util.Collection;
import java.util.List;

import latino.Caso;
import latino.LatinoFactory;
import latino.LatinoPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link latino.Caso} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CasoItemProvider extends ElementoItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CasoItemProvider(AdapterFactory adapterFactory) {
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

			addValoresPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Valores feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValoresPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Caso_valores_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Caso_valores_feature", "_UI_Caso_type"),
						LatinoPackage.Literals.CASO__VALORES, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(LatinoPackage.Literals.CASO__SENTENCIAS);
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
	 * This returns Caso.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Caso"));
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
		return getString("_UI_Caso_type");
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

		switch (notification.getFeatureID(Caso.class)) {
		case LatinoPackage.CASO__VALORES:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case LatinoPackage.CASO__SENTENCIAS:
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

		newChildDescriptors.add(createChildParameter(LatinoPackage.Literals.CASO__SENTENCIAS,
				LatinoFactory.eINSTANCE.createAsignacion()));

		newChildDescriptors.add(
				createChildParameter(LatinoPackage.Literals.CASO__SENTENCIAS, LatinoFactory.eINSTANCE.createLeer()));

		newChildDescriptors.add(
				createChildParameter(LatinoPackage.Literals.CASO__SENTENCIAS, LatinoFactory.eINSTANCE.createLista()));

		newChildDescriptors.add(createChildParameter(LatinoPackage.Literals.CASO__SENTENCIAS,
				LatinoFactory.eINSTANCE.createAsignacionIndice()));

		newChildDescriptors.add(createChildParameter(LatinoPackage.Literals.CASO__SENTENCIAS,
				LatinoFactory.eINSTANCE.createCondicional()));

		newChildDescriptors.add(createChildParameter(LatinoPackage.Literals.CASO__SENTENCIAS,
				LatinoFactory.eINSTANCE.createImprimir()));

		newChildDescriptors.add(createChildParameter(LatinoPackage.Literals.CASO__SENTENCIAS,
				LatinoFactory.eINSTANCE.createMientras()));

		newChildDescriptors.add(
				createChildParameter(LatinoPackage.Literals.CASO__SENTENCIAS, LatinoFactory.eINSTANCE.createRepetir()));

		newChildDescriptors.add(
				createChildParameter(LatinoPackage.Literals.CASO__SENTENCIAS, LatinoFactory.eINSTANCE.createDesde()));

		newChildDescriptors.add(
				createChildParameter(LatinoPackage.Literals.CASO__SENTENCIAS, LatinoFactory.eINSTANCE.createPara()));

		newChildDescriptors.add(createChildParameter(LatinoPackage.Literals.CASO__SENTENCIAS,
				LatinoFactory.eINSTANCE.createIncremento()));

		newChildDescriptors.add(
				createChildParameter(LatinoPackage.Literals.CASO__SENTENCIAS, LatinoFactory.eINSTANCE.createRomper()));

		newChildDescriptors.add(createChildParameter(LatinoPackage.Literals.CASO__SENTENCIAS,
				LatinoFactory.eINSTANCE.createContinuar()));

		newChildDescriptors.add(
				createChildParameter(LatinoPackage.Literals.CASO__SENTENCIAS, LatinoFactory.eINSTANCE.createElegir()));

		newChildDescriptors.add(
				createChildParameter(LatinoPackage.Literals.CASO__SENTENCIAS, LatinoFactory.eINSTANCE.createFuncion()));

		newChildDescriptors.add(
				createChildParameter(LatinoPackage.Literals.CASO__SENTENCIAS, LatinoFactory.eINSTANCE.createRetorno()));

		newChildDescriptors.add(
				createChildParameter(LatinoPackage.Literals.CASO__SENTENCIAS, LatinoFactory.eINSTANCE.createLlamada()));
	}

}
