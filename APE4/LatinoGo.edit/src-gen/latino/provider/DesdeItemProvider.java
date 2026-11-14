/**
 */
package latino.provider;

import java.util.Collection;
import java.util.List;

import latino.Desde;
import latino.LatinoFactory;
import latino.LatinoPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link latino.Desde} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DesdeItemProvider extends CicloCondicionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesdeItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(LatinoPackage.Literals.DESDE__INICIO);
			childrenFeatures.add(LatinoPackage.Literals.DESDE__PASO);
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
	 * This returns Desde.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Desde"));
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
		String label = ((Desde) object).getCondicion();
		return label == null || label.length() == 0 ? getString("_UI_Desde_type")
				: getString("_UI_Desde_type") + " " + label;
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

		switch (notification.getFeatureID(Desde.class)) {
		case LatinoPackage.DESDE__INICIO:
		case LatinoPackage.DESDE__PASO:
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
				createChildParameter(LatinoPackage.Literals.DESDE__INICIO, LatinoFactory.eINSTANCE.createAsignacion()));

		newChildDescriptors.add(
				createChildParameter(LatinoPackage.Literals.DESDE__PASO, LatinoFactory.eINSTANCE.createAsignacion()));

		newChildDescriptors
				.add(createChildParameter(LatinoPackage.Literals.DESDE__PASO, LatinoFactory.eINSTANCE.createLeer()));

		newChildDescriptors
				.add(createChildParameter(LatinoPackage.Literals.DESDE__PASO, LatinoFactory.eINSTANCE.createLista()));

		newChildDescriptors.add(createChildParameter(LatinoPackage.Literals.DESDE__PASO,
				LatinoFactory.eINSTANCE.createAsignacionIndice()));

		newChildDescriptors.add(
				createChildParameter(LatinoPackage.Literals.DESDE__PASO, LatinoFactory.eINSTANCE.createCondicional()));

		newChildDescriptors.add(
				createChildParameter(LatinoPackage.Literals.DESDE__PASO, LatinoFactory.eINSTANCE.createImprimir()));

		newChildDescriptors.add(
				createChildParameter(LatinoPackage.Literals.DESDE__PASO, LatinoFactory.eINSTANCE.createMientras()));

		newChildDescriptors
				.add(createChildParameter(LatinoPackage.Literals.DESDE__PASO, LatinoFactory.eINSTANCE.createRepetir()));

		newChildDescriptors
				.add(createChildParameter(LatinoPackage.Literals.DESDE__PASO, LatinoFactory.eINSTANCE.createDesde()));

		newChildDescriptors
				.add(createChildParameter(LatinoPackage.Literals.DESDE__PASO, LatinoFactory.eINSTANCE.createPara()));

		newChildDescriptors.add(
				createChildParameter(LatinoPackage.Literals.DESDE__PASO, LatinoFactory.eINSTANCE.createIncremento()));

		newChildDescriptors
				.add(createChildParameter(LatinoPackage.Literals.DESDE__PASO, LatinoFactory.eINSTANCE.createRomper()));

		newChildDescriptors.add(
				createChildParameter(LatinoPackage.Literals.DESDE__PASO, LatinoFactory.eINSTANCE.createContinuar()));

		newChildDescriptors
				.add(createChildParameter(LatinoPackage.Literals.DESDE__PASO, LatinoFactory.eINSTANCE.createElegir()));

		newChildDescriptors
				.add(createChildParameter(LatinoPackage.Literals.DESDE__PASO, LatinoFactory.eINSTANCE.createFuncion()));

		newChildDescriptors
				.add(createChildParameter(LatinoPackage.Literals.DESDE__PASO, LatinoFactory.eINSTANCE.createRetorno()));

		newChildDescriptors
				.add(createChildParameter(LatinoPackage.Literals.DESDE__PASO, LatinoFactory.eINSTANCE.createLlamada()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == LatinoPackage.Literals.CICLO__CUERPO
				|| childFeature == LatinoPackage.Literals.DESDE__INICIO
				|| childFeature == LatinoPackage.Literals.DESDE__PASO;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
