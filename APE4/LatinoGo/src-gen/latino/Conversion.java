/**
 */
package latino;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Conversion</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see latino.LatinoPackage#getConversion()
 * @model
 * @generated
 */
public enum Conversion implements Enumerator {
	/**
	 * The '<em><b>NINGUNA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NINGUNA_VALUE
	 * @generated
	 * @ordered
	 */
	NINGUNA(0, "NINGUNA", "NINGUNA"),

	/**
	 * The '<em><b>NUMERO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMERO_VALUE
	 * @generated
	 * @ordered
	 */
	NUMERO(1, "NUMERO", "NUMERO"),

	/**
	 * The '<em><b>TEXTO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXTO_VALUE
	 * @generated
	 * @ordered
	 */
	TEXTO(2, "TEXTO", "TEXTO");

	/**
	 * The '<em><b>NINGUNA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NINGUNA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NINGUNA_VALUE = 0;

	/**
	 * The '<em><b>NUMERO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMERO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NUMERO_VALUE = 1;

	/**
	 * The '<em><b>TEXTO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEXTO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TEXTO_VALUE = 2;

	/**
	 * An array of all the '<em><b>Conversion</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Conversion[] VALUES_ARRAY = new Conversion[] { NINGUNA, NUMERO, TEXTO, };

	/**
	 * A public read-only list of all the '<em><b>Conversion</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Conversion> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Conversion</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Conversion get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Conversion result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Conversion</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Conversion getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Conversion result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Conversion</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Conversion get(int value) {
		switch (value) {
		case NINGUNA_VALUE:
			return NINGUNA;
		case NUMERO_VALUE:
			return NUMERO;
		case TEXTO_VALUE:
			return TEXTO;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Conversion(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //Conversion
