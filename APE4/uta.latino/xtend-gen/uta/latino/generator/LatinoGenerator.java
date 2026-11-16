/**
 * Generador que convierte un programa Latino .lat en un programa Go .go
 */
package uta.latino.generator;

import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import latino.Asignacion;
import latino.AsignacionIndice;
import latino.Caso;
import latino.Ciclo;
import latino.CicloCondicion;
import latino.Condicional;
import latino.Continuar;
import latino.Conversion;
import latino.Definicion;
import latino.Desde;
import latino.Elegir;
import latino.Funcion;
import latino.Imprimir;
import latino.Incremento;
import latino.Leer;
import latino.Lista;
import latino.Llamada;
import latino.Mientras;
import latino.OperadorPaso;
import latino.Osi;
import latino.Para;
import latino.Programa;
import latino.Repetir;
import latino.Retorno;
import latino.Romper;
import latino.Sentencia;
import latino.Variable;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.XbaseGenerated;

@SuppressWarnings("all")
public class LatinoGenerator extends AbstractGenerator {
  private Map<String, String> tipos;

  private boolean usaTexto;

  private boolean usaModulo;

  private Set<String> principales;

  private Map<EObject, String> etiquetas;

  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final Programa programa = IterableExtensions.<Programa>head(Iterables.<Programa>filter(resource.getContents(), Programa.class));
    if ((programa == null)) {
      return;
    }
    final String nombreArchivo = resource.getURI().trimFileExtension().lastSegment();
    fsa.generateFile((nombreArchivo + ".go"), this.compilar(programa));
  }

  public CharSequence compilar(final Programa p) {
    final List<Definicion> definiciones = IteratorExtensions.<Definicion>toList(Iterators.<Definicion>filter(p.eAllContents(), Definicion.class));
    final List<Funcion> funciones = IterableExtensions.<Funcion>toList(Iterables.<Funcion>filter(p.getSentencias(), Funcion.class));
    final Function1<Sentencia, Boolean> _function = (Sentencia it) -> {
      return Boolean.valueOf((!(it instanceof Funcion)));
    };
    final List<Sentencia> principal = IterableExtensions.<Sentencia>toList(IterableExtensions.<Sentencia>filter(p.getSentencias(), _function));
    this.tipos = CollectionLiterals.<String, String>newHashMap();
    this.usaTexto = false;
    this.usaModulo = false;
    this.etiquetas = CollectionLiterals.<EObject, String>newHashMap();
    List<Romper> _list = IteratorExtensions.<Romper>toList(Iterators.<Romper>filter(p.eAllContents(), Romper.class));
    for (final Romper r : _list) {
      boolean _pasaPorElegir = this.pasaPorElegir(r);
      if (_pasaPorElegir) {
        final EObject ciclo = this.cicloDe(r);
        if (((ciclo != null) && (!this.etiquetas.containsKey(ciclo)))) {
          int _size = this.etiquetas.size();
          int _plus = (_size + 1);
          String _plus_1 = ("ciclo" + Integer.valueOf(_plus));
          this.etiquetas.put(ciclo, _plus_1);
        }
      }
    }
    this.principales = this.nombresDe(principal);
    for (final String n : this.principales) {
      this.tipos.put(n, this.tipoGo(n, p, definiciones, CollectionLiterals.<String>newHashSet()));
    }
    for (final Funcion f : funciones) {
      {
        final Function1<Variable, String> _function_1 = (Variable it) -> {
          return it.getNombre();
        };
        List<String> _map = ListExtensions.<Variable, String>map(f.getParametros(), _function_1);
        List<String> _localesDe = this.localesDe(f);
        Iterable<String> _plus_2 = Iterables.<String>concat(_map, _localesDe);
        for (final String n_1 : _plus_2) {
          String _nombre = f.getNombre();
          String _plus_3 = (_nombre + "/");
          String _plus_4 = (_plus_3 + n_1);
          String _nombre_1 = f.getNombre();
          String _plus_5 = (_nombre_1 + "/");
          String _plus_6 = (_plus_5 + n_1);
          this.tipos.put(_plus_4, this.tipoGo(_plus_6, p, definiciones, CollectionLiterals.<String>newHashSet()));
        }
        this.tipos.put(f.getNombre(), this.tipoRetorno(f, p, definiciones, CollectionLiterals.<String>newHashSet()));
      }
    }
    final Function1<Definicion, Boolean> _function_1 = (Definicion it) -> {
      return Boolean.valueOf((it instanceof Leer));
    };
    final boolean usaLeer = IterableExtensions.<Definicion>exists(definiciones, _function_1);
    final Function1<EObject, Boolean> _function_2 = (EObject it) -> {
      return Boolean.valueOf((it instanceof Imprimir));
    };
    final boolean usaEscribir = IteratorExtensions.<EObject>exists(p.eAllContents(), _function_2);
    final ArrayList<CharSequence> textoFunciones = CollectionLiterals.<CharSequence>newArrayList();
    for (final Funcion f_1 : funciones) {
      textoFunciones.add(this.funcionGo(f_1));
    }
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final Sentencia s : principal) {
        CharSequence _sentencia = this.sentencia(s);
        _builder.append(_sentencia);
        _builder.newLineIfNotEmpty();
      }
    }
    final String cuerpo = _builder.toString();
    final ArrayList<String> paquetes = CollectionLiterals.<String>newArrayList();
    if (usaLeer) {
      paquetes.add("bufio");
    }
    if (((usaEscribir || this.usaTexto) || usaLeer)) {
      paquetes.add("fmt");
    }
    if (this.usaModulo) {
      paquetes.add("math");
    }
    if (usaLeer) {
      paquetes.add("os");
    }
    if ((this.usaTexto || usaLeer)) {
      paquetes.add("strconv");
    }
    if (usaLeer) {
      paquetes.add("strings");
    }
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("package main");
    _builder_1.newLine();
    {
      int _size_1 = paquetes.size();
      boolean _equals = (_size_1 == 1);
      if (_equals) {
        _builder_1.newLine();
        _builder_1.append("import \"");
        String _head = IterableExtensions.<String>head(paquetes);
        _builder_1.append(_head);
        _builder_1.append("\"");
        _builder_1.newLineIfNotEmpty();
      } else {
        int _size_2 = paquetes.size();
        boolean _greaterThan = (_size_2 > 1);
        if (_greaterThan) {
          _builder_1.newLine();
          _builder_1.append("import (");
          _builder_1.newLine();
          {
            for(final String q : paquetes) {
              _builder_1.append("\t");
              _builder_1.append("\"");
              _builder_1.append(q, "\t");
              _builder_1.append("\"");
              _builder_1.newLineIfNotEmpty();
            }
          }
          _builder_1.append(")");
          _builder_1.newLine();
        }
      }
    }
    {
      if (usaLeer) {
        _builder_1.newLine();
        _builder_1.append("var lector = bufio.NewReader(os.Stdin)");
        _builder_1.newLine();
      }
    }
    {
      boolean _isEmpty = this.principales.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder_1.newLine();
        {
          for(final String n_1 : this.principales) {
            _builder_1.append("var ");
            _builder_1.append(n_1);
            _builder_1.append(" ");
            String _get = this.tipos.get(n_1);
            _builder_1.append(_get);
            _builder_1.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      for(final CharSequence f_2 : textoFunciones) {
        _builder_1.newLine();
        _builder_1.append(f_2);
        _builder_1.newLineIfNotEmpty();
      }
    }
    _builder_1.newLine();
    _builder_1.append("func main() {");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append(cuerpo, "\t");
    _builder_1.newLineIfNotEmpty();
    _builder_1.append("}");
    _builder_1.newLine();
    {
      if (usaLeer) {
        _builder_1.newLine();
        _builder_1.append("func leerTexto() string {");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("linea, _ := lector.ReadString(\'\\n\')");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("return strings.TrimSpace(strings.TrimPrefix(linea, \"\\xef\\xbb\\xbf\"))");
        _builder_1.newLine();
        _builder_1.append("}");
        _builder_1.newLine();
        _builder_1.newLine();
        _builder_1.append("func leerNumero() float64 {");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("texto := leerTexto()");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("numero, err := strconv.ParseFloat(texto, 64)");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("if err != nil {");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("fmt.Println(\"Se esperaba un numero y se leyo \" + texto)");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("os.Exit(1)");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("}");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("return numero");
        _builder_1.newLine();
        _builder_1.append("}");
        _builder_1.newLine();
      }
    }
    {
      if (this.usaTexto) {
        _builder_1.newLine();
        _builder_1.append("func aTexto(v any) string {");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("switch x := v.(type) {");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("case float64:");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("return strconv.FormatFloat(x, \'g\', 16, 64)");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("case bool:");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("if x {");
        _builder_1.newLine();
        _builder_1.append("\t\t\t");
        _builder_1.append("return \"verdadero\"");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("}");
        _builder_1.newLine();
        _builder_1.append("\t\t");
        _builder_1.append("return \"falso\"");
        _builder_1.newLine();
        {
          boolean _containsValue = this.tipos.containsValue("[]float64");
          if (_containsValue) {
            _builder_1.append("\t");
            _builder_1.append("case []float64:");
            _builder_1.newLine();
            _builder_1.append("\t");
            _builder_1.append("\t");
            _builder_1.append("s := \"[\"");
            _builder_1.newLine();
            _builder_1.append("\t");
            _builder_1.append("\t");
            _builder_1.append("for i, e := range x {");
            _builder_1.newLine();
            _builder_1.append("\t");
            _builder_1.append("\t\t");
            _builder_1.append("if i > 0 {");
            _builder_1.newLine();
            _builder_1.append("\t");
            _builder_1.append("\t\t\t");
            _builder_1.append("s += \", \"");
            _builder_1.newLine();
            _builder_1.append("\t");
            _builder_1.append("\t\t");
            _builder_1.append("}");
            _builder_1.newLine();
            _builder_1.append("\t");
            _builder_1.append("\t\t");
            _builder_1.append("s += aTexto(e)");
            _builder_1.newLine();
            _builder_1.append("\t");
            _builder_1.append("\t");
            _builder_1.append("}");
            _builder_1.newLine();
            _builder_1.append("\t");
            _builder_1.append("\t");
            _builder_1.append("return s + \"]\"");
            _builder_1.newLine();
          }
        }
        {
          boolean _containsValue_1 = this.tipos.containsValue("[]bool");
          if (_containsValue_1) {
            _builder_1.append("\t");
            _builder_1.append("case []bool:");
            _builder_1.newLine();
            _builder_1.append("\t");
            _builder_1.append("\t");
            _builder_1.append("s := \"[\"");
            _builder_1.newLine();
            _builder_1.append("\t");
            _builder_1.append("\t");
            _builder_1.append("for i, e := range x {");
            _builder_1.newLine();
            _builder_1.append("\t");
            _builder_1.append("\t\t");
            _builder_1.append("if i > 0 {");
            _builder_1.newLine();
            _builder_1.append("\t");
            _builder_1.append("\t\t\t");
            _builder_1.append("s += \", \"");
            _builder_1.newLine();
            _builder_1.append("\t");
            _builder_1.append("\t\t");
            _builder_1.append("}");
            _builder_1.newLine();
            _builder_1.append("\t");
            _builder_1.append("\t\t");
            _builder_1.append("s += aTexto(e)");
            _builder_1.newLine();
            _builder_1.append("\t");
            _builder_1.append("\t");
            _builder_1.append("}");
            _builder_1.newLine();
            _builder_1.append("\t");
            _builder_1.append("\t");
            _builder_1.append("return s + \"]\"");
            _builder_1.newLine();
          }
        }
        {
          boolean _containsValue_2 = this.tipos.containsValue("[]string");
          if (_containsValue_2) {
            _builder_1.append("\t");
            _builder_1.append("case []string:");
            _builder_1.newLine();
            _builder_1.append("\t");
            _builder_1.append("\t");
            _builder_1.append("s := \"[\"");
            _builder_1.newLine();
            _builder_1.append("\t");
            _builder_1.append("\t");
            _builder_1.append("for i, e := range x {");
            _builder_1.newLine();
            _builder_1.append("\t");
            _builder_1.append("\t\t");
            _builder_1.append("if i > 0 {");
            _builder_1.newLine();
            _builder_1.append("\t");
            _builder_1.append("\t\t\t");
            _builder_1.append("s += \", \"");
            _builder_1.newLine();
            _builder_1.append("\t");
            _builder_1.append("\t\t");
            _builder_1.append("}");
            _builder_1.newLine();
            _builder_1.append("\t");
            _builder_1.append("\t\t");
            _builder_1.append("comilla := \"\\\"\"");
            _builder_1.newLine();
            _builder_1.append("\t");
            _builder_1.append("\t\t");
            _builder_1.append("for _, r := range e {");
            _builder_1.newLine();
            _builder_1.append("\t");
            _builder_1.append("\t\t\t");
            _builder_1.append("if r == \'\"\' {");
            _builder_1.newLine();
            _builder_1.append("\t");
            _builder_1.append("\t\t\t\t");
            _builder_1.append("comilla = \"\'\"");
            _builder_1.newLine();
            _builder_1.append("\t");
            _builder_1.append("\t\t\t");
            _builder_1.append("}");
            _builder_1.newLine();
            _builder_1.append("\t");
            _builder_1.append("\t\t");
            _builder_1.append("}");
            _builder_1.newLine();
            _builder_1.append("\t");
            _builder_1.append("\t\t");
            _builder_1.append("s += comilla + e + comilla");
            _builder_1.newLine();
            _builder_1.append("\t");
            _builder_1.append("\t");
            _builder_1.append("}");
            _builder_1.newLine();
            _builder_1.append("\t");
            _builder_1.append("\t");
            _builder_1.append("return s + \"]\"");
            _builder_1.newLine();
          }
        }
        _builder_1.append("\t");
        _builder_1.append("}");
        _builder_1.newLine();
        _builder_1.append("\t");
        _builder_1.append("return fmt.Sprint(v)");
        _builder_1.newLine();
        _builder_1.append("}");
        _builder_1.newLine();
      }
    }
    return _builder_1;
  }

  public CharSequence funcionGo(final Funcion f) {
    CharSequence _xblockexpression = null;
    {
      final String devuelve = this.tipos.get(f.getNombre());
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("func ");
      String _nombre = f.getNombre();
      _builder.append(_nombre);
      _builder.append("(");
      final Function1<Variable, String> _function = (Variable it) -> {
        String _nombre_1 = it.getNombre();
        String _plus = (_nombre_1 + " ");
        String _nombre_2 = f.getNombre();
        String _plus_1 = (_nombre_2 + "/");
        String _nombre_3 = it.getNombre();
        String _plus_2 = (_plus_1 + _nombre_3);
        String _get = this.tipos.get(_plus_2);
        return (_plus + _get);
      };
      String _join = IterableExtensions.join(ListExtensions.<Variable, String>map(f.getParametros(), _function), ", ");
      _builder.append(_join);
      _builder.append(")");
      {
        boolean _isEmpty = devuelve.isEmpty();
        boolean _not = (!_isEmpty);
        if (_not) {
          _builder.append(" ");
          _builder.append(devuelve);
        }
      }
      _builder.append(" {");
      _builder.newLineIfNotEmpty();
      {
        List<String> _localesDe = this.localesDe(f);
        for(final String n : _localesDe) {
          _builder.append("\t");
          _builder.append("var ");
          _builder.append(n, "\t");
          _builder.append(" ");
          String _nombre_1 = f.getNombre();
          String _plus = (_nombre_1 + "/");
          String _plus_1 = (_plus + n);
          String _get = this.tipos.get(_plus_1);
          _builder.append(_get, "\t");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("_ = ");
          _builder.append(n, "\t");
          _builder.newLineIfNotEmpty();
        }
      }
      {
        EList<Sentencia> _cuerpo = f.getCuerpo();
        for(final Sentencia s : _cuerpo) {
          _builder.append("\t");
          CharSequence _sentencia = this.sentencia(s);
          _builder.append(_sentencia, "\t");
          _builder.newLineIfNotEmpty();
        }
      }
      {
        if (((!devuelve.isEmpty()) && (!this.terminaConRetorno(f.getCuerpo())))) {
          _builder.append("\t");
          _builder.append("return ");
          String _ceroGo = this.ceroGo(devuelve);
          _builder.append(_ceroGo, "\t");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("}");
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }

  public List<String> localesDe(final Funcion f) {
    final Function1<String, Boolean> _function = (String it) -> {
      return Boolean.valueOf(((!this.principales.contains(it)) && (!IterableExtensions.<Variable>exists(f.getParametros(), ((Function1<Variable, Boolean>) (Variable p) -> {
        String _nombre = p.getNombre();
        return Boolean.valueOf(Objects.equals(_nombre, it));
      })))));
    };
    return IterableExtensions.<String>toList(IterableExtensions.<String>filter(this.nombresDe(f.getCuerpo()), _function));
  }

  public Set<String> nombresDe(final List<? extends Sentencia> sentencias) {
    final LinkedHashSet<String> nombres = CollectionLiterals.<String>newLinkedHashSet();
    for (final Sentencia s : sentencias) {
      List<EObject> _list = IteratorExtensions.<EObject>toList(s.eAllContents());
      Iterable<EObject> _plus = Iterables.<EObject>concat(Collections.<EObject>unmodifiableList(CollectionLiterals.<EObject>newArrayList(((EObject) s))), _list);
      for (final EObject o : _plus) {
        {
          if (((o instanceof Definicion) && (!(o instanceof Funcion)))) {
            nombres.add(((Definicion) o).getNombre());
          }
          if ((o instanceof Variable)) {
            nombres.add(((Variable)o).getNombre());
          }
        }
      }
    }
    nombres.remove(null);
    return nombres;
  }

  public boolean terminaConRetorno(final List<Sentencia> l) {
    boolean _xblockexpression = false;
    {
      boolean _isEmpty = l.isEmpty();
      if (_isEmpty) {
        return false;
      }
      final Sentencia u = l.getLast();
      boolean _switchResult = false;
      boolean _matched = false;
      if (u instanceof Retorno) {
        _matched=true;
        _switchResult = true;
      }
      if (!_matched) {
        if (u instanceof Condicional) {
          _matched=true;
          _switchResult = ((((!((Condicional)u).getSino().isEmpty()) && this.terminaConRetorno(((Condicional)u).getEntonces())) && IterableExtensions.<Osi>forall(((Condicional)u).getOsis(), ((Function1<Osi, Boolean>) (Osi it) -> {
            return Boolean.valueOf(this.terminaConRetorno(it.getSentencias()));
          }))) && this.terminaConRetorno(((Condicional)u).getSino()));
        }
      }
      if (!_matched) {
        if (u instanceof Elegir) {
          _matched=true;
          _switchResult = (((!((Elegir)u).getDefecto().isEmpty()) && IterableExtensions.<Caso>forall(((Elegir)u).getCasos(), ((Function1<Caso, Boolean>) (Caso it) -> {
            return Boolean.valueOf(this.terminaConRetorno(it.getSentencias()));
          }))) && this.terminaConRetorno(((Elegir)u).getDefecto()));
        }
      }
      if (!_matched) {
        _switchResult = false;
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }

  public String ceroGo(final String tipo) {
    String _switchResult = null;
    if (tipo != null) {
      switch (tipo) {
        case "string":
          _switchResult = "\"\"";
          break;
        case "bool":
          _switchResult = "false";
          break;
        case "float64":
          _switchResult = "0";
          break;
        default:
          _switchResult = "nil";
          break;
      }
    } else {
      _switchResult = "nil";
    }
    return _switchResult;
  }

  protected CharSequence _sentencia(final Asignacion a) {
    StringConcatenation _builder = new StringConcatenation();
    String _nombre = a.getNombre();
    _builder.append(_nombre);
    _builder.append(" = ");
    String _traducir = this.traducir(a.getValor());
    _builder.append(_traducir);
    return _builder;
  }

  protected CharSequence _sentencia(final Leer l) {
    CharSequence _xblockexpression = null;
    {
      final boolean numero = (Objects.equals(l.getConversion(), Conversion.NUMERO) || (Objects.equals(l.getConversion(), Conversion.NINGUNA) && Objects.equals(this.tipos.get(this.clave(l.getNombre(), this.funcionDe(l))), "float64")));
      StringConcatenation _builder = new StringConcatenation();
      String _nombre = l.getNombre();
      _builder.append(_nombre);
      _builder.append(" = ");
      {
        if (numero) {
          _builder.append("leerNumero()");
        } else {
          _builder.append("leerTexto()");
        }
      }
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }

  protected CharSequence _sentencia(final Lista l) {
    StringConcatenation _builder = new StringConcatenation();
    String _nombre = l.getNombre();
    _builder.append(_nombre);
    _builder.append(" = ");
    String _get = this.tipos.get(this.clave(l.getNombre(), this.funcionDe(l)));
    _builder.append(_get);
    _builder.append("{");
    final Function1<String, String> _function = (String it) -> {
      return this.traducir(it);
    };
    String _join = IterableExtensions.join(ListExtensions.<String, String>map(l.getElementos(), _function), ", ");
    _builder.append(_join);
    _builder.append("}");
    return _builder;
  }

  protected CharSequence _sentencia(final AsignacionIndice a) {
    StringConcatenation _builder = new StringConcatenation();
    String _lista = a.getLista();
    _builder.append(_lista);
    _builder.append("[");
    String _indiceGo = this.indiceGo(a.getIndice());
    _builder.append(_indiceGo);
    _builder.append("] = ");
    String _traducir = this.traducir(a.getValor());
    _builder.append(_traducir);
    return _builder;
  }

  protected CharSequence _sentencia(final Condicional c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if ");
    String _traducir = this.traducir(c.getCondicion());
    _builder.append(_traducir);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      EList<Sentencia> _entonces = c.getEntonces();
      for(final Sentencia s : _entonces) {
        _builder.append("\t");
        CharSequence _sentencia = this.sentencia(s);
        _builder.append(_sentencia, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    {
      EList<Osi> _osis = c.getOsis();
      for(final Osi o : _osis) {
        _builder.append(" else if ");
        String _traducir_1 = this.traducir(o.getCondicion());
        _builder.append(_traducir_1);
        _builder.append(" {");
        _builder.newLineIfNotEmpty();
        {
          EList<Sentencia> _sentencias = o.getSentencias();
          for(final Sentencia s_1 : _sentencias) {
            _builder.append("\t");
            CharSequence _sentencia_1 = this.sentencia(s_1);
            _builder.append(_sentencia_1, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("}");
      }
    }
    {
      boolean _isEmpty = c.getSino().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append(" else {");
        _builder.newLineIfNotEmpty();
        {
          EList<Sentencia> _sino = c.getSino();
          for(final Sentencia s_2 : _sino) {
            _builder.append("\t");
            CharSequence _sentencia_2 = this.sentencia(s_2);
            _builder.append(_sentencia_2, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("}");
      }
    }
    return _builder;
  }

  protected CharSequence _sentencia(final Mientras m) {
    StringConcatenation _builder = new StringConcatenation();
    String _etiqueta = this.etiqueta(m);
    _builder.append(_etiqueta);
    _builder.append("for ");
    String _traducir = this.traducir(m.getCondicion());
    _builder.append(_traducir);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      EList<Sentencia> _cuerpo = m.getCuerpo();
      for(final Sentencia s : _cuerpo) {
        _builder.append("\t");
        CharSequence _sentencia = this.sentencia(s);
        _builder.append(_sentencia, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    return _builder;
  }

  protected CharSequence _sentencia(final Repetir r) {
    StringConcatenation _builder = new StringConcatenation();
    String _etiqueta = this.etiqueta(r);
    _builder.append(_etiqueta);
    _builder.append("for ultimaVuelta := false; !ultimaVuelta; {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("ultimaVuelta = ");
    String _traducir = this.traducir(r.getCondicion());
    _builder.append(_traducir, "\t");
    _builder.newLineIfNotEmpty();
    {
      EList<Sentencia> _cuerpo = r.getCuerpo();
      for(final Sentencia s : _cuerpo) {
        _builder.append("\t");
        CharSequence _sentencia = this.sentencia(s);
        _builder.append(_sentencia, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    return _builder;
  }

  protected CharSequence _sentencia(final Desde d) {
    StringConcatenation _builder = new StringConcatenation();
    String _etiqueta = this.etiqueta(d);
    _builder.append(_etiqueta);
    _builder.append("for ");
    CharSequence _sentencia = this.sentencia(d.getInicio());
    _builder.append(_sentencia);
    _builder.append("; ");
    String _traducir = this.traducir(d.getCondicion());
    _builder.append(_traducir);
    _builder.append("; ");
    CharSequence _sentencia_1 = this.sentencia(d.getPaso());
    _builder.append(_sentencia_1);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      EList<Sentencia> _cuerpo = d.getCuerpo();
      for(final Sentencia s : _cuerpo) {
        _builder.append("\t");
        CharSequence _sentencia_2 = this.sentencia(s);
        _builder.append(_sentencia_2, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    return _builder;
  }

  protected CharSequence _sentencia(final Para c) {
    CharSequence _xblockexpression = null;
    {
      final EList<String> l = c.getLimites();
      final String v = c.getVariable().getNombre();
      String _xifexpression = null;
      int _size = l.size();
      boolean _greaterThan = (_size > 1);
      if (_greaterThan) {
        _xifexpression = this.traducir(l.get(0));
      } else {
        _xifexpression = "0.0";
      }
      final String inicio = _xifexpression;
      String _xifexpression_1 = null;
      int _size_1 = l.size();
      boolean _greaterThan_1 = (_size_1 > 1);
      if (_greaterThan_1) {
        _xifexpression_1 = this.traducir(l.get(1));
      } else {
        _xifexpression_1 = this.traducir(l.get(0));
      }
      final String fin = _xifexpression_1;
      String _xifexpression_2 = null;
      int _size_2 = l.size();
      boolean _greaterThan_2 = (_size_2 > 2);
      if (_greaterThan_2) {
        _xifexpression_2 = this.traducir(l.get(2));
      } else {
        _xifexpression_2 = "1.0";
      }
      final String paso = _xifexpression_2;
      String _xifexpression_3 = null;
      if (((l.size() > 2) && l.get(2).trim().startsWith("-"))) {
        _xifexpression_3 = ">";
      } else {
        _xifexpression_3 = "<";
      }
      final String compara = _xifexpression_3;
      StringConcatenation _builder = new StringConcatenation();
      String _etiqueta = this.etiqueta(c);
      _builder.append(_etiqueta);
      _builder.append("for ");
      _builder.append(v);
      _builder.append(" = ");
      _builder.append(inicio);
      _builder.append("; ");
      _builder.append(v);
      _builder.append(" ");
      _builder.append(compara);
      _builder.append(" ");
      _builder.append(fin);
      _builder.append("; ");
      _builder.append(v);
      _builder.append(" += ");
      _builder.append(paso);
      _builder.append(" {");
      _builder.newLineIfNotEmpty();
      {
        EList<Sentencia> _cuerpo = c.getCuerpo();
        for(final Sentencia s : _cuerpo) {
          _builder.append("\t");
          CharSequence _sentencia = this.sentencia(s);
          _builder.append(_sentencia, "\t");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.append("}");
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }

  protected CharSequence _sentencia(final Incremento i) {
    StringConcatenation _builder = new StringConcatenation();
    String _nombre = i.getNombre();
    _builder.append(_nombre);
    {
      OperadorPaso _operador = i.getOperador();
      boolean _equals = Objects.equals(_operador, OperadorPaso.MENOS);
      if (_equals) {
        _builder.append("--");
      } else {
        _builder.append("++");
      }
    }
    return _builder;
  }

  protected CharSequence _sentencia(final Romper r) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("break");
    {
      boolean _pasaPorElegir = this.pasaPorElegir(r);
      if (_pasaPorElegir) {
        _builder.append(" ");
        String _get = this.etiquetas.get(this.cicloDe(r));
        _builder.append(_get);
      }
    }
    return _builder;
  }

  protected CharSequence _sentencia(final Continuar c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("continue");
    return _builder;
  }

  protected CharSequence _sentencia(final Elegir e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("switch ");
    String _traducir = this.traducir(e.getExpresion());
    _builder.append(_traducir);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      EList<Caso> _casos = e.getCasos();
      for(final Caso c : _casos) {
        _builder.append("case ");
        final Function1<String, String> _function = (String it) -> {
          return this.traducir(it);
        };
        String _join = IterableExtensions.join(ListExtensions.<String, String>map(c.getValores(), _function), ", ");
        _builder.append(_join);
        _builder.append(":");
        _builder.newLineIfNotEmpty();
        {
          EList<Sentencia> _sentencias = c.getSentencias();
          for(final Sentencia s : _sentencias) {
            _builder.append("\t");
            CharSequence _sentencia = this.sentencia(s);
            _builder.append(_sentencia, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    {
      boolean _isEmpty = e.getDefecto().isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("default:");
        _builder.newLine();
        {
          EList<Sentencia> _defecto = e.getDefecto();
          for(final Sentencia s_1 : _defecto) {
            _builder.append("\t");
            CharSequence _sentencia_1 = this.sentencia(s_1);
            _builder.append(_sentencia_1, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("}");
    return _builder;
  }

  public EObject cicloDe(final EObject o) {
    EObject x = o.eContainer();
    while (((x != null) && (!(x instanceof Ciclo)))) {
      x = x.eContainer();
    }
    return x;
  }

  public boolean pasaPorElegir(final EObject o) {
    EObject x = o.eContainer();
    while (((x != null) && (!(x instanceof Ciclo)))) {
      {
        if ((x instanceof Elegir)) {
          return true;
        }
        x = x.eContainer();
      }
    }
    return false;
  }

  public String etiqueta(final EObject ciclo) {
    boolean _containsKey = this.etiquetas.containsKey(ciclo);
    if (_containsKey) {
      String _get = this.etiquetas.get(ciclo);
      return (_get + ": ");
    }
    return "";
  }

  protected CharSequence _sentencia(final Retorno r) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("return ");
    String _traducir = this.traducir(r.getValor());
    _builder.append(_traducir);
    return _builder;
  }

  protected CharSequence _sentencia(final Llamada l) {
    StringConcatenation _builder = new StringConcatenation();
    String _funcion = l.getFuncion();
    _builder.append(_funcion);
    _builder.append("(");
    final Function1<String, String> _function = (String it) -> {
      return this.traducir(it);
    };
    String _join = IterableExtensions.join(ListExtensions.<String, String>map(l.getArgumentos(), _function), ", ");
    _builder.append(_join);
    _builder.append(")");
    return _builder;
  }

  protected CharSequence _sentencia(final Imprimir i) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("fmt.Println(");
    String _textoGo = this.textoGo(i.getMensaje());
    _builder.append(_textoGo);
    _builder.append(")");
    return _builder;
  }

  public Funcion funcionDe(final EObject o) {
    EObject x = o;
    while (((x != null) && (!(x instanceof Funcion)))) {
      x = x.eContainer();
    }
    return ((Funcion) x);
  }

  public String clave(final String nombre, final Funcion f) {
    if ((f == null)) {
      return nombre;
    }
    final Function1<Variable, Boolean> _function = (Variable it) -> {
      String _nombre = it.getNombre();
      return Boolean.valueOf(Objects.equals(_nombre, nombre));
    };
    boolean _exists = IterableExtensions.<Variable>exists(f.getParametros(), _function);
    if (_exists) {
      String _nombre = f.getNombre();
      String _plus = (_nombre + "/");
      return (_plus + nombre);
    }
    boolean _contains = this.principales.contains(nombre);
    if (_contains) {
      return nombre;
    }
    boolean _contains_1 = this.nombresDe(f.getCuerpo()).contains(nombre);
    if (_contains_1) {
      String _nombre_1 = f.getNombre();
      String _plus_1 = (_nombre_1 + "/");
      return (_plus_1 + nombre);
    }
    return nombre;
  }

  public String nombreDe(final String clave) {
    int _indexOf = clave.indexOf("/");
    int _plus = (_indexOf + 1);
    return clave.substring(_plus);
  }

  public Funcion funcionDeClave(final String clave, final List<Definicion> defs) {
    Funcion _xblockexpression = null;
    {
      boolean _contains = clave.contains("/");
      boolean _not = (!_contains);
      if (_not) {
        return null;
      }
      final String f = clave.substring(0, clave.indexOf("/"));
      final Function1<Funcion, Boolean> _function = (Funcion it) -> {
        String _nombre = it.getNombre();
        return Boolean.valueOf(Objects.equals(_nombre, f));
      };
      _xblockexpression = IterableExtensions.<Funcion>findFirst(Iterables.<Funcion>filter(defs, Funcion.class), _function);
    }
    return _xblockexpression;
  }

  public String tipoGo(final String clave, final Programa p, final List<Definicion> defs, final Set<String> visitados) {
    visitados.add(clave);
    final String nombre = this.nombreDe(clave);
    final Funcion f = this.funcionDeClave(clave, defs);
    if ((f == null)) {
      final Function1<Funcion, Boolean> _function = (Funcion it) -> {
        String _nombre = it.getNombre();
        return Boolean.valueOf(Objects.equals(_nombre, nombre));
      };
      final Funcion funcion = IterableExtensions.<Funcion>findFirst(Iterables.<Funcion>filter(defs, Funcion.class), _function);
      if ((funcion != null)) {
        final String t = this.tipoRetorno(funcion, p, defs, visitados);
        String _xifexpression = null;
        boolean _isEmpty = t.isEmpty();
        if (_isEmpty) {
          _xifexpression = "float64";
        } else {
          _xifexpression = t;
        }
        return _xifexpression;
      }
    }
    final HashSet<String> encontrados = CollectionLiterals.<String>newHashSet();
    if ((f != null)) {
      final Function1<Variable, String> _function_1 = (Variable it) -> {
        return it.getNombre();
      };
      final int i = ListExtensions.<Variable, String>map(f.getParametros(), _function_1).indexOf(nombre);
      if ((i >= 0)) {
        boolean _seUsaComoNumero = this.seUsaComoNumero(clave, p, defs, visitados);
        if (_seUsaComoNumero) {
          encontrados.add("float64");
        } else {
          encontrados.add(this.tipoParametro(f, i, p, defs, visitados));
        }
      }
    }
    final Function1<Definicion, Boolean> _function_2 = (Definicion it) -> {
      return Boolean.valueOf((((!(it instanceof Funcion)) && Objects.equals(it.getNombre(), nombre)) && Objects.equals(this.clave(it.getNombre(), this.funcionDe(it)), clave)));
    };
    Iterable<Definicion> _filter = IterableExtensions.<Definicion>filter(defs, _function_2);
    for (final Definicion d : _filter) {
      if ((d instanceof Leer)) {
        encontrados.add(this.tipoLeer(((Leer)d), clave, p, defs, visitados));
      } else {
        if ((d instanceof Asignacion)) {
          String _valor = ((Asignacion)d).getValor();
          boolean _tripleNotEquals = (_valor != null);
          if (_tripleNotEquals) {
            encontrados.add(this.tipoValor(((Asignacion)d).getValor(), this.funcionDe(d), p, defs, visitados));
          }
        } else {
          if ((d instanceof Lista)) {
            String _tipoElementos = this.tipoElementos(clave, p, defs, visitados);
            String _plus = ("[]" + _tipoElementos);
            encontrados.add(_plus);
          }
        }
      }
    }
    final Function1<String, Boolean> _function_3 = (String it) -> {
      return Boolean.valueOf(it.startsWith("[]"));
    };
    final String lista = IterableExtensions.<String>findFirst(encontrados, _function_3);
    if ((lista != null)) {
      return lista;
    }
    boolean _contains = encontrados.contains("string");
    if (_contains) {
      return "string";
    }
    boolean _contains_1 = encontrados.contains("bool");
    if (_contains_1) {
      return "bool";
    }
    return "float64";
  }

  public String tipoElementos(final String clave, final Programa p, final List<Definicion> defs, final Set<String> visitados) {
    final HashSet<String> encontrados = CollectionLiterals.<String>newHashSet();
    final Function1<Lista, Boolean> _function = (Lista it) -> {
      return Boolean.valueOf((Objects.equals(it.getNombre(), this.nombreDe(clave)) && Objects.equals(this.clave(it.getNombre(), this.funcionDe(it)), clave)));
    };
    Iterable<Lista> _filter = IterableExtensions.<Lista>filter(Iterables.<Lista>filter(defs, Lista.class), _function);
    for (final Lista l : _filter) {
      EList<String> _elementos = l.getElementos();
      for (final String e : _elementos) {
        encontrados.add(this.tipoValor(e, this.funcionDe(l), p, defs, visitados));
      }
    }
    final Function1<AsignacionIndice, Boolean> _function_1 = (AsignacionIndice it) -> {
      return Boolean.valueOf(((it.getValor() != null) && Objects.equals(this.clave(it.getLista(), this.funcionDe(it)), clave)));
    };
    List<AsignacionIndice> _list = IteratorExtensions.<AsignacionIndice>toList(IteratorExtensions.<AsignacionIndice>filter(Iterators.<AsignacionIndice>filter(p.eAllContents(), AsignacionIndice.class), _function_1));
    for (final AsignacionIndice a : _list) {
      encontrados.add(this.tipoValor(a.getValor(), this.funcionDe(a), p, defs, visitados));
    }
    boolean _contains = encontrados.contains("string");
    if (_contains) {
      return "string";
    }
    boolean _contains_1 = encontrados.contains("bool");
    if (_contains_1) {
      return "bool";
    }
    return "float64";
  }

  public String tipoValor(final String texto, final Funcion donde, final Programa p, final List<Definicion> defs, final Set<String> visitados) {
    final String v = this.quitarLlamadas(texto, p, defs, visitados);
    boolean _esLogico = this.esLogico(v);
    if (_esLogico) {
      return "bool";
    }
    boolean _esCadena = this.esCadena(v);
    if (_esCadena) {
      return "string";
    }
    List<String> _nombresEn = this.nombresEn(v);
    for (final String otra : _nombresEn) {
      {
        final String k = this.clave(otra, donde);
        if (((!visitados.contains(k)) && this.conocido(otra, p, defs))) {
          final String lista = this.tipoGo(k, p, defs, visitados);
          String _xifexpression = null;
          boolean _matches = v.matches((("(?s).*\\b" + otra) + " *\\[.*"));
          if (_matches) {
            _xifexpression = lista.replaceFirst("^\\[\\]", "");
          } else {
            _xifexpression = lista;
          }
          final String t = _xifexpression;
          boolean _notEquals = (!Objects.equals(t, "float64"));
          if (_notEquals) {
            return t;
          }
        }
      }
    }
    return "float64";
  }

  public String tipoRetorno(final Funcion f, final Programa p, final List<Definicion> defs, final Set<String> visitados) {
    visitados.add(f.getNombre());
    final Function1<Retorno, Boolean> _function = (Retorno it) -> {
      String _valor = it.getValor();
      return Boolean.valueOf((_valor != null));
    };
    final Retorno r = IteratorExtensions.<Retorno>findFirst(Iterators.<Retorno>filter(f.eAllContents(), Retorno.class), _function);
    if ((r == null)) {
      return "";
    }
    return this.tipoValor(r.getValor(), f, p, defs, visitados);
  }

  public String tipoParametro(final Funcion f, final int i, final Programa p, final List<Definicion> defs, final Set<String> visitados) {
    final List<Pair<EObject, List<String>>> llamadas = this.llamadasA(f, p);
    final Function1<Pair<EObject, List<String>>, Boolean> _function = (Pair<EObject, List<String>> it) -> {
      boolean _isAncestor = EcoreUtil.isAncestor(f, it.getKey());
      return Boolean.valueOf((!_isAncestor));
    };
    Iterable<Pair<EObject, List<String>>> _filter = IterableExtensions.<Pair<EObject, List<String>>>filter(llamadas, _function);
    final Function1<Pair<EObject, List<String>>, Boolean> _function_1 = (Pair<EObject, List<String>> it) -> {
      return Boolean.valueOf(EcoreUtil.isAncestor(f, it.getKey()));
    };
    Iterable<Pair<EObject, List<String>>> _filter_1 = IterableExtensions.<Pair<EObject, List<String>>>filter(llamadas, _function_1);
    final Iterable<Pair<EObject, List<String>>> ordenadas = Iterables.<Pair<EObject, List<String>>>concat(_filter, _filter_1);
    final Function1<Pair<EObject, List<String>>, Boolean> _function_2 = (Pair<EObject, List<String>> it) -> {
      int _size = it.getValue().size();
      return Boolean.valueOf((_size > i));
    };
    final Pair<EObject, List<String>> llamada = IterableExtensions.<Pair<EObject, List<String>>>findFirst(ordenadas, _function_2);
    if ((llamada == null)) {
      return "float64";
    }
    return this.tipoValor(llamada.getValue().get(i), this.funcionDe(llamada.getKey()), p, defs, visitados);
  }

  public List<Pair<EObject, List<String>>> llamadasA(final Funcion f, final Programa p) {
    final ArrayList<Pair<EObject, List<String>>> llamadas = CollectionLiterals.<Pair<EObject, List<String>>>newArrayList();
    List<EObject> _list = IteratorExtensions.<EObject>toList(p.eAllContents());
    for (final EObject o : _list) {
      {
        if (((o instanceof Llamada) && Objects.equals(((Llamada) o).getFuncion(), f.getNombre()))) {
          final Function1<String, String> _function = (String it) -> {
            return it.trim();
          };
          List<String> _list_1 = IterableExtensions.<String>toList(ListExtensions.<String, String>map(((Llamada) o).getArgumentos(), _function));
          Pair<EObject, List<String>> _mappedTo = Pair.<EObject, List<String>>of(o, _list_1);
          llamadas.add(_mappedTo);
        }
        Iterable<String> _filterNull = IterableExtensions.<String>filterNull(this.textosDe(o));
        for (final String t : _filterNull) {
          List<List<String>> _argumentosEn = this.argumentosEn(t, f.getNombre());
          for (final List<String> a : _argumentosEn) {
            Pair<EObject, List<String>> _mappedTo_1 = Pair.<EObject, List<String>>of(o, a);
            llamadas.add(_mappedTo_1);
          }
        }
      }
    }
    return llamadas;
  }

  public List<List<String>> argumentosEn(final String t, final String nombre) {
    final ArrayList<List<String>> res = CollectionLiterals.<List<String>>newArrayList();
    int i = 0;
    while ((i < t.length())) {
      {
        final String c = t.substring(i, (i + 1));
        if ((Objects.equals(c, "\"") || Objects.equals(c, "\'"))) {
          i = this.finCadena(t, i);
        } else {
          if ((Character.isLetter(t.charAt(i)) || Objects.equals(c, "_"))) {
            int j = i;
            while (((j < t.length()) && (Character.isLetterOrDigit(t.charAt(j)) || Objects.equals(Character.valueOf(t.charAt(j)), "_")))) {
              j = (j + 1);
            }
            int k = j;
            while (((k < t.length()) && Objects.equals(Character.valueOf(t.charAt(k)), " "))) {
              k = (k + 1);
            }
            if (((Objects.equals(t.substring(i, j), nombre) && (k < t.length())) && Objects.equals(t.substring(k, (k + 1)), "("))) {
              final int fin = this.finParentesis(t, k);
              res.add(this.partirComas(t.substring((k + 1), Math.max((k + 1), (fin - 1)))));
            }
            i = j;
          } else {
            i = (i + 1);
          }
        }
      }
    }
    return res;
  }

  public String quitarLlamadas(final String v, final Programa p, final List<Definicion> defs, final Set<String> visitados) {
    final StringBuilder sb = new StringBuilder();
    int i = 0;
    while ((i < v.length())) {
      {
        final String c = v.substring(i, (i + 1));
        if ((Objects.equals(c, "\"") || Objects.equals(c, "\'"))) {
          final int fin = this.finCadena(v, i);
          sb.append(v.substring(i, fin));
          i = fin;
        } else {
          if ((Character.isLetter(v.charAt(i)) || Objects.equals(c, "_"))) {
            int j = i;
            while (((j < v.length()) && (Character.isLetterOrDigit(v.charAt(j)) || Objects.equals(Character.valueOf(v.charAt(j)), "_")))) {
              j = (j + 1);
            }
            int k = j;
            while (((k < v.length()) && Objects.equals(Character.valueOf(v.charAt(k)), " "))) {
              k = (k + 1);
            }
            if (((k < v.length()) && Objects.equals(v.substring(k, (k + 1)), "("))) {
              final String nombre = v.substring(i, j);
              final Function1<Funcion, Boolean> _function = (Funcion it) -> {
                String _nombre = it.getNombre();
                return Boolean.valueOf(Objects.equals(_nombre, nombre));
              };
              final Funcion f = IterableExtensions.<Funcion>findFirst(Iterables.<Funcion>filter(defs, Funcion.class), _function);
              String _xifexpression = null;
              if (((f == null) || visitados.contains(nombre))) {
                _xifexpression = "float64";
              } else {
                _xifexpression = this.tipoRetorno(f, p, defs, visitados);
              }
              final String t = _xifexpression;
              String _xifexpression_1 = null;
              boolean _equals = Objects.equals(t, "string");
              if (_equals) {
                _xifexpression_1 = "\"\"";
              } else {
                String _xifexpression_2 = null;
                boolean _equals_1 = Objects.equals(t, "bool");
                if (_equals_1) {
                  _xifexpression_2 = "verdadero";
                } else {
                  _xifexpression_2 = "0";
                }
                _xifexpression_1 = _xifexpression_2;
              }
              sb.append(_xifexpression_1);
              i = this.finParentesis(v, k);
            } else {
              sb.append(v.substring(i, j));
              i = j;
            }
          } else {
            sb.append(c);
            i = (i + 1);
          }
        }
      }
    }
    return sb.toString();
  }

  public boolean conocido(final String n, final Programa p, final List<Definicion> defs) {
    return (IterableExtensions.<Definicion>exists(defs, ((Function1<Definicion, Boolean>) (Definicion it) -> {
      String _nombre = it.getNombre();
      return Boolean.valueOf(Objects.equals(_nombre, n));
    })) || IteratorExtensions.<Variable>exists(Iterators.<Variable>filter(p.eAllContents(), Variable.class), ((Function1<Variable, Boolean>) (Variable it) -> {
      String _nombre = it.getNombre();
      return Boolean.valueOf(Objects.equals(_nombre, n));
    })));
  }

  public String tipoLeer(final Leer l, final String clave, final Programa p, final List<Definicion> defs, final Set<String> visitados) {
    Conversion _conversion = l.getConversion();
    boolean _equals = Objects.equals(_conversion, Conversion.NUMERO);
    if (_equals) {
      return "float64";
    }
    Conversion _conversion_1 = l.getConversion();
    boolean _equals_1 = Objects.equals(_conversion_1, Conversion.TEXTO);
    if (_equals_1) {
      return "string";
    }
    final Function1<Asignacion, Boolean> _function = (Asignacion it) -> {
      return Boolean.valueOf((((Objects.equals(it.getNombre(), l.getNombre()) && (it.getValor() != null)) && Objects.equals(this.clave(it.getNombre(), this.funcionDe(it)), clave)) && Objects.equals(this.tipoValor(it.getValor(), this.funcionDe(it), p, defs, visitados), "float64")));
    };
    final boolean otraNumerica = IterableExtensions.<Asignacion>exists(Iterables.<Asignacion>filter(defs, Asignacion.class), _function);
    if ((otraNumerica || this.seUsaComoNumero(clave, p, defs, visitados))) {
      return "float64";
    }
    return "string";
  }

  public boolean seUsaComoNumero(final String clave, final Programa p, final List<Definicion> defs, final Set<String> visitados) {
    final String nombre = this.nombreDe(clave);
    final Function1<Incremento, Boolean> _function = (Incremento it) -> {
      return Boolean.valueOf((Objects.equals(it.getNombre(), nombre) && Objects.equals(this.clave(it.getNombre(), this.funcionDe(it)), clave)));
    };
    boolean _exists = IteratorExtensions.<Incremento>exists(Iterators.<Incremento>filter(p.eAllContents(), Incremento.class), _function);
    if (_exists) {
      return true;
    }
    final Function1<Para, Boolean> _function_1 = (Para it) -> {
      return Boolean.valueOf((IterableExtensions.<String>exists(it.getLimites(), ((Function1<String, Boolean>) (String it_1) -> {
        return Boolean.valueOf(this.nombresEn(it_1).contains(nombre));
      })) && Objects.equals(this.clave(nombre, this.funcionDe(it)), clave)));
    };
    boolean _exists_1 = IteratorExtensions.<Para>exists(Iterators.<Para>filter(p.eAllContents(), Para.class), _function_1);
    if (_exists_1) {
      return true;
    }
    final Function1<Elegir, Boolean> _function_2 = (Elegir it) -> {
      boolean _and = false;
      boolean _and_1 = false;
      String _expresion = it.getExpresion();
      String _trim = null;
      if (_expresion!=null) {
        _trim=_expresion.trim();
      }
      boolean _equals = Objects.equals(_trim, nombre);
      if (!_equals) {
        _and_1 = false;
      } else {
        String _clave = this.clave(nombre, this.funcionDe(it));
        boolean _equals_1 = Objects.equals(_clave, clave);
        _and_1 = _equals_1;
      }
      if (!_and_1) {
        _and = false;
      } else {
        final Function1<Caso, Boolean> _function_3 = (Caso it_1) -> {
          final Function1<String, Boolean> _function_4 = (String it_2) -> {
            return Boolean.valueOf(it_2.matches("[0-9].*"));
          };
          return Boolean.valueOf(IterableExtensions.<String>exists(it_1.getValores(), _function_4));
        };
        boolean _exists_2 = IterableExtensions.<Caso>exists(it.getCasos(), _function_3);
        _and = _exists_2;
      }
      return Boolean.valueOf(_and);
    };
    boolean _exists_2 = IteratorExtensions.<Elegir>exists(Iterators.<Elegir>filter(p.eAllContents(), Elegir.class), _function_2);
    if (_exists_2) {
      return true;
    }
    Iterable<Funcion> _filter = Iterables.<Funcion>filter(defs, Funcion.class);
    for (final Funcion f : _filter) {
      List<Pair<EObject, List<String>>> _llamadasA = this.llamadasA(f, p);
      for (final Pair<EObject, List<String>> llamada : _llamadasA) {
        {
          final int i = llamada.getValue().indexOf(nombre);
          if ((((i >= 0) && (i < f.getParametros().size())) && Objects.equals(this.clave(nombre, this.funcionDe(llamada.getKey())), clave))) {
            String _nombre = f.getNombre();
            String _plus = (_nombre + "/");
            String _nombre_1 = f.getParametros().get(i).getNombre();
            final String parametro = (_plus + _nombre_1);
            boolean _contains = visitados.contains(parametro);
            boolean _not = (!_contains);
            if (_not) {
              visitados.add(parametro);
              boolean _seUsaComoNumero = this.seUsaComoNumero(parametro, p, defs, visitados);
              if (_seUsaComoNumero) {
                return true;
              }
            }
          }
        }
      }
    }
    final String n = (("\\b" + nombre) + "\\b");
    final String otro = "(-? *[0-9]|[a-zA-Z_][a-zA-Z0-9_]*)";
    final String cmp = " *(<=|>=|==|!=|<|>) *";
    Pattern _compile = Pattern.compile(((n + cmp) + otro));
    Pattern _compile_1 = Pattern.compile(((("\\b" + otro) + cmp) + n));
    final List<Pattern> comparaciones = Collections.<Pattern>unmodifiableList(CollectionLiterals.<Pattern>newArrayList(_compile, _compile_1));
    List<EObject> _list = IteratorExtensions.<EObject>toList(p.eAllContents());
    for (final EObject o : _list) {
      {
        final Funcion donde = this.funcionDe(o);
        String _clave = this.clave(nombre, donde);
        boolean _equals = Objects.equals(_clave, clave);
        if (_equals) {
          final Function1<String, String> _function_3 = (String it) -> {
            return this.sinCadenas(it);
          };
          Iterable<String> _map = IterableExtensions.<String, String>map(IterableExtensions.<String>filterNull(this.textosDe(o)), _function_3);
          for (final String t : _map) {
            {
              if ((t.matches(((".*" + n) + " *[-+*/%].*")) || t.matches(((".*[-+*/%] *" + n) + ".*")))) {
                return true;
              }
              boolean _matches = t.matches(((".*\\[[^\\]]*" + n) + "[^\\]]*\\].*"));
              if (_matches) {
                return true;
              }
              for (final Pattern patron : comparaciones) {
                {
                  final Matcher m = patron.matcher(t);
                  while (m.find()) {
                    {
                      String _xifexpression = null;
                      boolean _matches_1 = m.group(1).matches("(<=|>=|==|!=|<|>)");
                      if (_matches_1) {
                        _xifexpression = m.group(2);
                      } else {
                        _xifexpression = m.group(1);
                      }
                      final String lado = _xifexpression;
                      boolean _matches_2 = lado.matches("-? *[0-9].*");
                      if (_matches_2) {
                        return true;
                      }
                      final String k = this.clave(lado, donde);
                      if ((((!visitados.contains(k)) && this.conocido(lado, p, defs)) && Objects.equals(this.tipoGo(k, p, defs, visitados), "float64"))) {
                        return true;
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return false;
  }

  public List<String> expresiones(final Programa p) {
    final Function1<EObject, List<String>> _function = (EObject it) -> {
      return this.textosDe(it);
    };
    return IterableExtensions.<String>toList(IterableExtensions.<String>filterNull(Iterables.<String>concat(ListExtensions.<EObject, List<String>>map(IteratorExtensions.<EObject>toList(p.eAllContents()), _function))));
  }

  public List<String> textosDe(final EObject o) {
    List<String> _switchResult = null;
    boolean _matched = false;
    if (o instanceof Asignacion) {
      _matched=true;
      String _valor = ((Asignacion)o).getValor();
      _switchResult = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList(_valor));
    }
    if (!_matched) {
      if (o instanceof Lista) {
        _matched=true;
        _switchResult = ((Lista)o).getElementos();
      }
    }
    if (!_matched) {
      if (o instanceof AsignacionIndice) {
        _matched=true;
        String _indice = ((AsignacionIndice)o).getIndice();
        String _valor = ((AsignacionIndice)o).getValor();
        _switchResult = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList(_indice, _valor));
      }
    }
    if (!_matched) {
      if (o instanceof Condicional) {
        _matched=true;
        String _condicion = ((Condicional)o).getCondicion();
        _switchResult = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList(_condicion));
      }
    }
    if (!_matched) {
      if (o instanceof Osi) {
        _matched=true;
        String _condicion = ((Osi)o).getCondicion();
        _switchResult = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList(_condicion));
      }
    }
    if (!_matched) {
      if (o instanceof CicloCondicion) {
        _matched=true;
        String _condicion = ((CicloCondicion)o).getCondicion();
        _switchResult = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList(_condicion));
      }
    }
    if (!_matched) {
      if (o instanceof Para) {
        _matched=true;
        _switchResult = ((Para)o).getLimites();
      }
    }
    if (!_matched) {
      if (o instanceof Elegir) {
        _matched=true;
        String _expresion = ((Elegir)o).getExpresion();
        _switchResult = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList(_expresion));
      }
    }
    if (!_matched) {
      if (o instanceof Caso) {
        _matched=true;
        _switchResult = ((Caso)o).getValores();
      }
    }
    if (!_matched) {
      if (o instanceof Retorno) {
        _matched=true;
        String _valor = ((Retorno)o).getValor();
        _switchResult = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList(_valor));
      }
    }
    if (!_matched) {
      if (o instanceof Llamada) {
        _matched=true;
        _switchResult = ((Llamada)o).getArgumentos();
      }
    }
    if (!_matched) {
      if (o instanceof Imprimir) {
        _matched=true;
        String _mensaje = ((Imprimir)o).getMensaje();
        _switchResult = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList(_mensaje));
      }
    }
    if (!_matched) {
      _switchResult = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList());
    }
    return _switchResult;
  }

  public boolean esLogico(final String v) {
    boolean _xblockexpression = false;
    {
      final String s = this.sinCadenas(v);
      _xblockexpression = (s.matches(".*(==|!=|<|>|&&|\\|\\||!).*") || s.matches(".*\\b(verdadero|cierto|falso)\\b.*"));
    }
    return _xblockexpression;
  }

  public boolean esCadena(final String v) {
    return ((v.contains("\"") || v.contains("\'")) || this.sinCadenas(v).contains(".."));
  }

  public List<String> nombresEn(final String v) {
    final Function1<String, Boolean> _function = (String it) -> {
      return Boolean.valueOf((((it.matches("[a-zA-Z_][a-zA-Z0-9_]*") && (!Objects.equals(it, "verdadero"))) && (!Objects.equals(it, "cierto"))) && (!Objects.equals(it, "falso"))));
    };
    return IterableExtensions.<String>toList(IterableExtensions.<String>filter(((Iterable<String>)Conversions.doWrapArray(this.sinCadenas(v).split("[^a-zA-Z0-9_]+"))), _function));
  }

  public String sinCadenas(final String v) {
    return v.replaceAll("\"[^\"]*\"", "").replaceAll("\'[^\']*\'", "");
  }

  public String traducir(final String texto) {
    if ((texto == null)) {
      return "";
    }
    final List<String> partes = this.partirConcat(texto);
    int _size = partes.size();
    boolean _greaterThan = (_size > 1);
    if (_greaterThan) {
      final Function1<String, String> _function = (String it) -> {
        return this.comoTexto(this.traducirSimple(it));
      };
      String _join = IterableExtensions.join(ListExtensions.<String, String>map(partes, _function), " + ");
      String _plus = ("(" + _join);
      return (_plus + ")");
    }
    return this.traducirSimple(texto);
  }

  public String textoGo(final String texto) {
    if (((texto != null) && (this.partirConcat(texto).size() > 1))) {
      return this.traducir(texto);
    }
    return this.comoTexto(this.traducir(texto));
  }

  public String comoTexto(final String go) {
    boolean _matches = go.matches("\"([^\"\\\\]|\\\\.)*\"");
    if (_matches) {
      return go;
    }
    this.usaTexto = true;
    return (("aTexto(" + go) + ")");
  }

  public List<String> partirConcat(final String t) {
    final ArrayList<String> partes = CollectionLiterals.<String>newArrayList();
    int inicio = 0;
    int nivel = 0;
    int i = 0;
    while ((i < t.length())) {
      {
        final String c = t.substring(i, (i + 1));
        if ((Objects.equals(c, "\"") || Objects.equals(c, "\'"))) {
          i = this.finCadena(t, i);
        } else {
          if ((Objects.equals(c, "(") || Objects.equals(c, "["))) {
            nivel = (nivel + 1);
            i = (i + 1);
          } else {
            if ((Objects.equals(c, ")") || Objects.equals(c, "]"))) {
              nivel = (nivel - 1);
              i = (i + 1);
            } else {
              if (((nivel == 0) && t.startsWith("..", i))) {
                partes.add(t.substring(inicio, i).trim());
                i = (i + 2);
                inicio = i;
              } else {
                i = (i + 1);
              }
            }
          }
        }
      }
    }
    partes.add(t.substring(inicio).trim());
    return partes;
  }

  public String traducirSimple(final String texto) {
    final StringBuilder sb = new StringBuilder();
    int i = 0;
    while ((i < texto.length())) {
      {
        final String c = texto.substring(i, (i + 1));
        if ((Objects.equals(c, "\"") || Objects.equals(c, "\'"))) {
          final int fin = this.finCadena(texto, i);
          String cadena = texto.substring(i, fin);
          boolean _equals = Objects.equals(c, "\'");
          if (_equals) {
            int _length = cadena.length();
            int _minus = (_length - 1);
            final String contenido = cadena.substring(1, Math.max(1, _minus));
            String _replace = contenido.replace("\"", "\\\"");
            String _plus = ("\"" + _replace);
            String _plus_1 = (_plus + "\"");
            cadena = _plus_1;
          }
          sb.append(cadena);
          i = fin;
        } else {
          boolean _equals_1 = Objects.equals(c, "(");
          if (_equals_1) {
            final int fin_1 = this.finParentesis(texto, i);
            final String dentro = texto.substring((i + 1), Math.max((i + 1), (fin_1 - 1)));
            int _size = this.partirConcat(dentro).size();
            boolean _greaterThan = (_size > 1);
            if (_greaterThan) {
              sb.append(this.traducir(dentro));
            } else {
              String _traducir = this.traducir(dentro);
              String _plus_2 = ("(" + _traducir);
              String _plus_3 = (_plus_2 + ")");
              sb.append(_plus_3);
            }
            i = fin_1;
          } else {
            if ((Character.isLetter(texto.charAt(i)) || Objects.equals(c, "_"))) {
              int j = i;
              while (((j < texto.length()) && (Character.isLetterOrDigit(texto.charAt(j)) || Objects.equals(texto.substring(j, (j + 1)), "_")))) {
                j = (j + 1);
              }
              sb.append(this.palabraGo(texto.substring(i, j)));
              i = j;
              int k = j;
              while (((k < texto.length()) && Objects.equals(Character.valueOf(texto.charAt(k)), " "))) {
                k = (k + 1);
              }
              if (((k < texto.length()) && Objects.equals(texto.substring(k, (k + 1)), "["))) {
                final int fin_2 = this.finParentesis(texto, k);
                String _indiceGo = this.indiceGo(texto.substring((k + 1), Math.max((k + 1), (fin_2 - 1))));
                String _plus_4 = ("[" + _indiceGo);
                String _plus_5 = (_plus_4 + "]");
                sb.append(_plus_5);
                i = fin_2;
              } else {
                if (((k < texto.length()) && Objects.equals(texto.substring(k, (k + 1)), "("))) {
                  final int fin_3 = this.finParentesis(texto, k);
                  final Function1<String, String> _function = (String it) -> {
                    return this.traducir(it);
                  };
                  String _join = IterableExtensions.join(ListExtensions.<String, String>map(this.partirComas(texto.substring((k + 1), Math.max((k + 1), (fin_3 - 1)))), _function), ", ");
                  String _plus_6 = ("(" + _join);
                  String _plus_7 = (_plus_6 + ")");
                  sb.append(_plus_7);
                  i = fin_3;
                }
              }
            } else {
              boolean _isDigit = Character.isDigit(texto.charAt(i));
              if (_isDigit) {
                int j_1 = i;
                while (((j_1 < texto.length()) && Character.isDigit(texto.charAt(j_1)))) {
                  j_1 = (j_1 + 1);
                }
                if (((((j_1 + 1) < texto.length()) && Objects.equals(texto.substring(j_1, (j_1 + 1)), ".")) && Character.isDigit(texto.charAt((j_1 + 1))))) {
                  j_1 = (j_1 + 1);
                  while (((j_1 < texto.length()) && Character.isDigit(texto.charAt(j_1)))) {
                    j_1 = (j_1 + 1);
                  }
                  sb.append(texto.substring(i, j_1));
                } else {
                  String _substring = texto.substring(i, j_1);
                  String _plus_8 = (_substring + ".0");
                  sb.append(_plus_8);
                }
                i = j_1;
              } else {
                if ((Objects.equals(c, "-") && (sb.toString().endsWith("-") || sb.toString().endsWith("<")))) {
                  sb.append(" ");
                }
                sb.append(c);
                i = (i + 1);
              }
            }
          }
        }
      }
    }
    final String go = sb.toString();
    boolean _contains = this.sinCadenas(go).contains("%");
    if (_contains) {
      return this.conModulo(go);
    }
    return go;
  }

  public String conModulo(final String t) {
    final ArrayList<String> operandos = CollectionLiterals.<String>newArrayList();
    final ArrayList<String> operadores = CollectionLiterals.<String>newArrayList();
    StringBuilder actual = new StringBuilder();
    int i = 0;
    while ((i < t.length())) {
      {
        final String c = t.substring(i, (i + 1));
        String _xifexpression = null;
        int _length = t.length();
        boolean _lessThan = ((i + 1) < _length);
        if (_lessThan) {
          _xifexpression = t.substring(i, (i + 2));
        } else {
          _xifexpression = "";
        }
        final String dos = _xifexpression;
        if ((Objects.equals(c, "\"") || Objects.equals(c, "\'"))) {
          final int fin = this.finCadena(t, i);
          actual.append(t.substring(i, fin));
          i = fin;
        } else {
          if ((Objects.equals(c, "(") || Objects.equals(c, "["))) {
            final int fin_1 = this.finParentesis(t, i);
            actual.append(t.substring(i, fin_1));
            i = fin_1;
          } else {
            boolean _contains = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("==", "!=", "<=", ">=", "&&", "||")).contains(dos);
            if (_contains) {
              operandos.add(actual.toString().trim());
              operadores.add(dos);
              StringBuilder _stringBuilder = new StringBuilder();
              actual = _stringBuilder;
              i = (i + 2);
            } else {
              if (("<>+-*/%".contains(c) && (!actual.toString().trim().isEmpty()))) {
                operandos.add(actual.toString().trim());
                operadores.add(c);
                StringBuilder _stringBuilder_1 = new StringBuilder();
                actual = _stringBuilder_1;
                i = (i + 1);
              } else {
                actual.append(c);
                i = (i + 1);
              }
            }
          }
        }
      }
    }
    operandos.add(actual.toString().trim());
    final StringBuilder sb = new StringBuilder();
    String acumulado = IterableExtensions.<String>head(operandos);
    int _size = operadores.size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    for (final Integer k : _doubleDotLessThan) {
      {
        final String op = operadores.get((k).intValue());
        final String siguiente = operandos.get(((k).intValue() + 1));
        boolean _equals = Objects.equals(op, "%");
        if (_equals) {
          this.usaModulo = true;
          acumulado = (((("math.Mod(" + acumulado) + ", ") + siguiente) + ")");
        } else {
          if ((Objects.equals(op, "*") || Objects.equals(op, "/"))) {
            acumulado = ((((acumulado + " ") + op) + " ") + siguiente);
          } else {
            sb.append((((acumulado + " ") + op) + " "));
            acumulado = siguiente;
          }
        }
      }
    }
    sb.append(acumulado);
    return sb.toString();
  }

  public List<String> partirComas(final String t) {
    final ArrayList<String> partes = CollectionLiterals.<String>newArrayList();
    boolean _isEmpty = t.trim().isEmpty();
    if (_isEmpty) {
      return partes;
    }
    int inicio = 0;
    int nivel = 0;
    int i = 0;
    while ((i < t.length())) {
      {
        final String c = t.substring(i, (i + 1));
        if ((Objects.equals(c, "\"") || Objects.equals(c, "\'"))) {
          i = this.finCadena(t, i);
        } else {
          if ((Objects.equals(c, "(") || Objects.equals(c, "["))) {
            nivel = (nivel + 1);
          }
          if ((Objects.equals(c, ")") || Objects.equals(c, "]"))) {
            nivel = (nivel - 1);
          }
          if ((Objects.equals(c, ",") && (nivel == 0))) {
            partes.add(t.substring(inicio, i).trim());
            inicio = (i + 1);
          }
          i = (i + 1);
        }
      }
    }
    partes.add(t.substring(inicio).trim());
    return partes;
  }

  public int finParentesis(final String t, final int inicio) {
    int nivel = 0;
    int j = inicio;
    while ((j < t.length())) {
      {
        final String c = t.substring(j, (j + 1));
        if ((Objects.equals(c, "\"") || Objects.equals(c, "\'"))) {
          j = this.finCadena(t, j);
        } else {
          if ((Objects.equals(c, "(") || Objects.equals(c, "["))) {
            nivel = (nivel + 1);
          }
          if ((Objects.equals(c, ")") || Objects.equals(c, "]"))) {
            nivel = (nivel - 1);
          }
          j = (j + 1);
          if ((nivel == 0)) {
            return j;
          }
        }
      }
    }
    return t.length();
  }

  public int finCadena(final String t, final int inicio) {
    final String comilla = t.substring(inicio, (inicio + 1));
    int j = (inicio + 1);
    while (((j < t.length()) && (!Objects.equals(t.substring(j, (j + 1)), comilla)))) {
      String _substring = t.substring(j, (j + 1));
      boolean _equals = Objects.equals(_substring, "\\");
      if (_equals) {
        j = (j + 2);
      } else {
        j = (j + 1);
      }
    }
    return Math.min((j + 1), t.length());
  }

  public String indiceGo(final String indice) {
    boolean _matches = indice.trim().matches("[0-9]+");
    if (_matches) {
      return indice.trim();
    }
    String _traducir = this.traducir(indice);
    String _plus = ("int(" + _traducir);
    return (_plus + ")");
  }

  public String palabraGo(final String palabra) {
    String _switchResult = null;
    if (palabra != null) {
      switch (palabra) {
        case "verdadero":
          _switchResult = "true";
          break;
        case "cierto":
          _switchResult = "true";
          break;
        case "falso":
          _switchResult = "false";
          break;
        default:
          _switchResult = palabra;
          break;
      }
    } else {
      _switchResult = palabra;
    }
    return _switchResult;
  }

  @XbaseGenerated
  public CharSequence sentencia(final Sentencia d) {
    if (d instanceof Desde) {
      return _sentencia((Desde)d);
    } else if (d instanceof Mientras) {
      return _sentencia((Mientras)d);
    } else if (d instanceof Repetir) {
      return _sentencia((Repetir)d);
    } else if (d instanceof Asignacion) {
      return _sentencia((Asignacion)d);
    } else if (d instanceof Continuar) {
      return _sentencia((Continuar)d);
    } else if (d instanceof Leer) {
      return _sentencia((Leer)d);
    } else if (d instanceof Lista) {
      return _sentencia((Lista)d);
    } else if (d instanceof Para) {
      return _sentencia((Para)d);
    } else if (d instanceof Romper) {
      return _sentencia((Romper)d);
    } else if (d instanceof AsignacionIndice) {
      return _sentencia((AsignacionIndice)d);
    } else if (d instanceof Condicional) {
      return _sentencia((Condicional)d);
    } else if (d instanceof Elegir) {
      return _sentencia((Elegir)d);
    } else if (d instanceof Imprimir) {
      return _sentencia((Imprimir)d);
    } else if (d instanceof Incremento) {
      return _sentencia((Incremento)d);
    } else if (d instanceof Llamada) {
      return _sentencia((Llamada)d);
    } else if (d instanceof Retorno) {
      return _sentencia((Retorno)d);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(d).toString());
    }
  }
}
