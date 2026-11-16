/**
 */
package latino;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elemento</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see latino.LatinoPackage#getElemento()
 * @model abstract="true"
 * @generated
 */
public interface Elemento extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tself.oclAsType(ocl::OclElement)-&gt;closure(e | e.oclContainer())-&gt;select(e | e.oclIsKindOf(Programa))-&gt;any(true).oclAsType(Programa)'"
	 * @generated
	 */
	Programa programa();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\ttexto = null or\n\t\t\t\ttexto.replaceAll(\'\"[^\"]*\"|\\\'[^\\\']*\\\'\', \'\')\n\t\t\t\t.tokenize(\' ()[]&lt;&gt;=!&amp;|+-\052/%.,\')\n\t\t\t\t-&gt;select(t | t.matches(\'[a-zA-Z_][a-zA-Z0-9_]*\') and t &lt;&gt; \'verdadero\' and t &lt;&gt; \'falso\' and t &lt;&gt; \'cierto\')\n\t\t\t\t-&gt;forAll(t | self.programa().defineVariable(t))'"
	 * @generated
	 */
	boolean usaSoloVariablesDefinidas(String texto);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\tif texto = null then \'desconocido\' else\n\t\t\t\tlet s : String = texto.replaceAll(\'\"[^\"]*\"|\\\'[^\\\']*\\\'\', \'\') in\n\t\t\t\tif s.matches(\'.*[a-zA-Z_][a-zA-Z0-9_]* *[(].*\') then \'desconocido\'\n\t\t\t\telse if s.matches(\'.*(==|!=|&lt;|&gt;|&amp;&amp;|[|][|]|!).*\') or s.matches(\'.*\\\\b(verdadero|falso|cierto)\\\\b.*\') then \'logico\'\n\t\t\t\telse if texto.matches(\'.*([\"\\\']|[.][.]).*\') then \'texto\'\n\t\t\t\telse if s.tokenize(\' ()[]&lt;&gt;=!&amp;|+-\052/%.,\')-&gt;forAll(t | not t.matches(\'[a-zA-Z_][a-zA-Z0-9_]*\')) then \'numero\'\n\t\t\t\telse \'desconocido\'\n\t\t\t\tendif endif endif endif\n\t\t\tendif'"
	 * @generated
	 */
	String tipoTexto(String texto);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n\t\t\ttexto = null or texto.replaceAll(\'\"[^\"]*\"|\\\'[^\\\']*\\\'\', \'\').matches(\'.*[a-zA-Z_][a-zA-Z0-9_]* *[(].*\') or\n\t\t\t\tnot texto.replaceAll(\'\"[^\"]*\"|\\\'[^\\\']*\\\'\', \'@\')\n\t\t\t\t.replaceAll(\'[()]\', \'\')\n\t\t\t\t.replaceAll(\'\\\\b(verdadero|falso|cierto)\\\\b\', \'@\')\n\t\t\t\t.replaceAll(\' \', \'\')\n\t\t\t\t.matches(\'.*(@[-+\052/%]|[-+\052/%]@).*\')'"
	 * @generated
	 */
	boolean operandosNumericos(String texto);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Set{\'break\', \'case\', \'chan\', \'const\', \'continue\', \'default\', \'defer\', \'else\', \'fallthrough\', \'for\', \'func\', \'go\', \'goto\', \'if\', \'import\', \'interface\', \'map\', \'package\', \'range\', \'return\', \'select\', \'struct\', \'switch\', \'type\', \'var\', \'fmt\', \'main\', \'true\', \'false\', \'nil\', \'int\', \'float64\', \'string\', \'bool\', \'any\', \'init\', \'_\', \'leerTexto\', \'leerNumero\', \'aTexto\', \'lector\', \'bufio\', \'math\', \'os\', \'strconv\', \'strings\', \'ultimaVuelta\'}-&gt;includes(n)'"
	 * @generated
	 */
	boolean esReservadaGo(String n);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='Set{\'global\', \'ir\', \'nulo\', \'clase\', \'constructor\', \'hereda\', \'super\', \'mi\', \'estatico\', \'nueva\'}-&gt;includes(n)'"
	 * @generated
	 */
	boolean esReservadaLatino(String n);

} // Elemento
