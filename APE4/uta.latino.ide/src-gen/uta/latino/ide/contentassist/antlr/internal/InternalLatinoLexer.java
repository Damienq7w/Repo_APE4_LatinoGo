package uta.latino.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLatinoLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=7;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalLatinoLexer() {;} 
    public InternalLatinoLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalLatinoLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalLatino.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:11:7: ( 'otro' )
            // InternalLatino.g:11:9: 'otro'
            {
            match("otro"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:12:7: ( 'defecto' )
            // InternalLatino.g:12:9: 'defecto'
            {
            match("defecto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:13:7: ( 'funcion' )
            // InternalLatino.g:13:9: 'funcion'
            {
            match("funcion"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:14:7: ( 'fun' )
            // InternalLatino.g:14:9: 'fun'
            {
            match("fun"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:15:7: ( 'retorno' )
            // InternalLatino.g:15:9: 'retorno'
            {
            match("retorno"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:16:7: ( 'retornar' )
            // InternalLatino.g:16:9: 'retornar'
            {
            match("retornar"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:17:7: ( 'ret' )
            // InternalLatino.g:17:9: 'ret'
            {
            match("ret"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:18:7: ( 'escribir' )
            // InternalLatino.g:18:9: 'escribir'
            {
            match("escribir"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:19:7: ( 'imprimir' )
            // InternalLatino.g:19:9: 'imprimir'
            {
            match("imprimir"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:20:7: ( 'poner' )
            // InternalLatino.g:20:9: 'poner'
            {
            match("poner"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:21:7: ( '==' )
            // InternalLatino.g:21:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:22:7: ( '!=' )
            // InternalLatino.g:22:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:23:7: ( '<' )
            // InternalLatino.g:23:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:24:7: ( '<=' )
            // InternalLatino.g:24:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:25:7: ( '>' )
            // InternalLatino.g:25:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:26:7: ( '>=' )
            // InternalLatino.g:26:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:27:7: ( '+' )
            // InternalLatino.g:27:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:28:7: ( '-' )
            // InternalLatino.g:28:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:29:7: ( '*' )
            // InternalLatino.g:29:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:30:7: ( '/' )
            // InternalLatino.g:30:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:31:7: ( '%' )
            // InternalLatino.g:31:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:32:7: ( 'verdadero' )
            // InternalLatino.g:32:9: 'verdadero'
            {
            match("verdadero"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:33:7: ( 'cierto' )
            // InternalLatino.g:33:9: 'cierto'
            {
            match("cierto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:34:7: ( 'falso' )
            // InternalLatino.g:34:9: 'falso'
            {
            match("falso"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:35:7: ( 'anumero' )
            // InternalLatino.g:35:9: 'anumero'
            {
            match("anumero"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:36:7: ( 'acadena' )
            // InternalLatino.g:36:9: 'acadena'
            {
            match("acadena"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:37:7: ( '++' )
            // InternalLatino.g:37:9: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:38:7: ( '--' )
            // InternalLatino.g:38:9: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:39:7: ( '=' )
            // InternalLatino.g:39:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:40:7: ( '(' )
            // InternalLatino.g:40:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:41:7: ( 'leer' )
            // InternalLatino.g:41:9: 'leer'
            {
            match("leer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:42:7: ( ')' )
            // InternalLatino.g:42:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:43:7: ( '[' )
            // InternalLatino.g:43:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:44:7: ( ']' )
            // InternalLatino.g:44:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:45:7: ( ',' )
            // InternalLatino.g:45:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:46:7: ( 'si' )
            // InternalLatino.g:46:9: 'si'
            {
            match("si"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:47:7: ( 'fin' )
            // InternalLatino.g:47:9: 'fin'
            {
            match("fin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:48:7: ( 'sino' )
            // InternalLatino.g:48:9: 'sino'
            {
            match("sino"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:49:7: ( 'osi' )
            // InternalLatino.g:49:9: 'osi'
            {
            match("osi"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:50:7: ( 'mientras' )
            // InternalLatino.g:50:9: 'mientras'
            {
            match("mientras"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:51:7: ( 'repetir' )
            // InternalLatino.g:51:9: 'repetir'
            {
            match("repetir"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:52:7: ( 'hasta' )
            // InternalLatino.g:52:9: 'hasta'
            {
            match("hasta"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:53:7: ( 'desde' )
            // InternalLatino.g:53:9: 'desde'
            {
            match("desde"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:54:7: ( ';' )
            // InternalLatino.g:54:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:55:7: ( 'para' )
            // InternalLatino.g:55:9: 'para'
            {
            match("para"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:56:7: ( 'en' )
            // InternalLatino.g:56:9: 'en'
            {
            match("en"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:57:7: ( 'rango' )
            // InternalLatino.g:57:9: 'rango'
            {
            match("rango"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:58:7: ( 'romper' )
            // InternalLatino.g:58:9: 'romper'
            {
            match("romper"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:59:7: ( 'continuar' )
            // InternalLatino.g:59:9: 'continuar'
            {
            match("continuar"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:60:7: ( 'elegir' )
            // InternalLatino.g:60:9: 'elegir'
            {
            match("elegir"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:61:7: ( ':' )
            // InternalLatino.g:61:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:62:7: ( 'caso' )
            // InternalLatino.g:62:9: 'caso'
            {
            match("caso"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:63:7: ( '||' )
            // InternalLatino.g:63:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:64:7: ( '&&' )
            // InternalLatino.g:64:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:65:7: ( '..' )
            // InternalLatino.g:65:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:66:7: ( '!' )
            // InternalLatino.g:66:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:67:7: ( '.' )
            // InternalLatino.g:67:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:6752:17: ( ( '#' | '//' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalLatino.g:6752:19: ( '#' | '//' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            // InternalLatino.g:6752:19: ( '#' | '//' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='#') ) {
                alt1=1;
            }
            else if ( (LA1_0=='/') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalLatino.g:6752:20: '#'
                    {
                    match('#'); 

                    }
                    break;
                case 2 :
                    // InternalLatino.g:6752:24: '//'
                    {
                    match("//"); 


                    }
                    break;

            }

            // InternalLatino.g:6752:30: (~ ( ( '\\n' | '\\r' ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalLatino.g:6752:30: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalLatino.g:6752:46: ( ( '\\r' )? '\\n' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\n'||LA4_0=='\r') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalLatino.g:6752:47: ( '\\r' )? '\\n'
                    {
                    // InternalLatino.g:6752:47: ( '\\r' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='\r') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalLatino.g:6752:47: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:6754:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalLatino.g:6754:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalLatino.g:6754:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalLatino.g:6754:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalLatino.g:6754:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalLatino.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:6756:10: ( ( '0' .. '9' )+ )
            // InternalLatino.g:6756:12: ( '0' .. '9' )+
            {
            // InternalLatino.g:6756:12: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalLatino.g:6756:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:6758:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalLatino.g:6758:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalLatino.g:6758:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"') ) {
                alt10=1;
            }
            else if ( (LA10_0=='\'') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalLatino.g:6758:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalLatino.g:6758:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalLatino.g:6758:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalLatino.g:6758:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalLatino.g:6758:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalLatino.g:6758:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalLatino.g:6758:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalLatino.g:6758:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:6760:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalLatino.g:6760:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalLatino.g:6760:24: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='/') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalLatino.g:6760:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:6762:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalLatino.g:6762:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalLatino.g:6762:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalLatino.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLatino.g:6764:16: ( . )
            // InternalLatino.g:6764:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalLatino.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=64;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // InternalLatino.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // InternalLatino.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // InternalLatino.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // InternalLatino.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // InternalLatino.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // InternalLatino.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // InternalLatino.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // InternalLatino.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // InternalLatino.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // InternalLatino.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // InternalLatino.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // InternalLatino.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // InternalLatino.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // InternalLatino.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // InternalLatino.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // InternalLatino.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // InternalLatino.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // InternalLatino.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // InternalLatino.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // InternalLatino.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // InternalLatino.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // InternalLatino.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // InternalLatino.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // InternalLatino.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // InternalLatino.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // InternalLatino.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // InternalLatino.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // InternalLatino.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // InternalLatino.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // InternalLatino.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // InternalLatino.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // InternalLatino.g:1:196: T__42
                {
                mT__42(); 

                }
                break;
            case 33 :
                // InternalLatino.g:1:202: T__43
                {
                mT__43(); 

                }
                break;
            case 34 :
                // InternalLatino.g:1:208: T__44
                {
                mT__44(); 

                }
                break;
            case 35 :
                // InternalLatino.g:1:214: T__45
                {
                mT__45(); 

                }
                break;
            case 36 :
                // InternalLatino.g:1:220: T__46
                {
                mT__46(); 

                }
                break;
            case 37 :
                // InternalLatino.g:1:226: T__47
                {
                mT__47(); 

                }
                break;
            case 38 :
                // InternalLatino.g:1:232: T__48
                {
                mT__48(); 

                }
                break;
            case 39 :
                // InternalLatino.g:1:238: T__49
                {
                mT__49(); 

                }
                break;
            case 40 :
                // InternalLatino.g:1:244: T__50
                {
                mT__50(); 

                }
                break;
            case 41 :
                // InternalLatino.g:1:250: T__51
                {
                mT__51(); 

                }
                break;
            case 42 :
                // InternalLatino.g:1:256: T__52
                {
                mT__52(); 

                }
                break;
            case 43 :
                // InternalLatino.g:1:262: T__53
                {
                mT__53(); 

                }
                break;
            case 44 :
                // InternalLatino.g:1:268: T__54
                {
                mT__54(); 

                }
                break;
            case 45 :
                // InternalLatino.g:1:274: T__55
                {
                mT__55(); 

                }
                break;
            case 46 :
                // InternalLatino.g:1:280: T__56
                {
                mT__56(); 

                }
                break;
            case 47 :
                // InternalLatino.g:1:286: T__57
                {
                mT__57(); 

                }
                break;
            case 48 :
                // InternalLatino.g:1:292: T__58
                {
                mT__58(); 

                }
                break;
            case 49 :
                // InternalLatino.g:1:298: T__59
                {
                mT__59(); 

                }
                break;
            case 50 :
                // InternalLatino.g:1:304: T__60
                {
                mT__60(); 

                }
                break;
            case 51 :
                // InternalLatino.g:1:310: T__61
                {
                mT__61(); 

                }
                break;
            case 52 :
                // InternalLatino.g:1:316: T__62
                {
                mT__62(); 

                }
                break;
            case 53 :
                // InternalLatino.g:1:322: T__63
                {
                mT__63(); 

                }
                break;
            case 54 :
                // InternalLatino.g:1:328: T__64
                {
                mT__64(); 

                }
                break;
            case 55 :
                // InternalLatino.g:1:334: T__65
                {
                mT__65(); 

                }
                break;
            case 56 :
                // InternalLatino.g:1:340: T__66
                {
                mT__66(); 

                }
                break;
            case 57 :
                // InternalLatino.g:1:346: T__67
                {
                mT__67(); 

                }
                break;
            case 58 :
                // InternalLatino.g:1:352: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 59 :
                // InternalLatino.g:1:368: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 60 :
                // InternalLatino.g:1:376: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 61 :
                // InternalLatino.g:1:385: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 62 :
                // InternalLatino.g:1:397: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 63 :
                // InternalLatino.g:1:413: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 64 :
                // InternalLatino.g:1:421: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\7\54\1\73\1\75\1\77\1\101\1\103\1\105\1\uffff\1\111\1\uffff\3\54\1\uffff\1\54\4\uffff\3\54\2\uffff\2\51\1\137\1\uffff\1\51\2\uffff\2\51\2\uffff\2\54\1\uffff\10\54\1\157\4\54\21\uffff\6\54\1\uffff\1\54\4\uffff\1\174\2\54\11\uffff\1\54\1\u0080\2\54\1\u0084\1\54\1\u0086\1\u0088\4\54\1\uffff\14\54\1\uffff\2\54\1\u009b\1\uffff\3\54\1\uffff\1\54\1\uffff\1\54\1\uffff\7\54\1\u00a8\3\54\1\u00ac\2\54\1\u00af\1\u00b0\2\54\1\uffff\1\54\1\u00b4\1\54\1\u00b6\2\54\1\u00b9\4\54\1\u00be\1\uffff\3\54\1\uffff\2\54\2\uffff\1\54\1\u00c5\1\54\1\uffff\1\54\1\uffff\2\54\1\uffff\1\u00cb\1\54\1\u00cd\1\54\1\uffff\1\54\1\u00d0\4\54\1\uffff\1\u00d5\1\u00d6\1\u00d7\1\54\1\u00d9\1\uffff\1\54\1\uffff\2\54\1\uffff\1\54\1\u00de\1\u00df\1\54\3\uffff\1\u00e1\1\uffff\1\u00e2\1\u00e3\2\54\2\uffff\1\u00e6\3\uffff\1\u00e7\1\u00e8\3\uffff";
    static final String DFA13_eofS =
        "\u00e9\uffff";
    static final String DFA13_minS =
        "\1\0\1\163\1\145\2\141\1\154\1\155\1\141\4\75\1\53\1\55\1\uffff\1\52\1\uffff\1\145\1\141\1\143\1\uffff\1\145\4\uffff\2\151\1\141\2\uffff\1\174\1\46\1\56\1\uffff\1\101\2\uffff\2\0\2\uffff\1\162\1\151\1\uffff\1\146\1\156\1\154\1\156\1\160\1\156\1\155\1\143\1\60\1\145\1\160\1\156\1\162\21\uffff\1\162\1\145\1\156\1\163\1\165\1\141\1\uffff\1\145\4\uffff\1\60\1\145\1\163\11\uffff\1\157\1\60\1\145\1\144\1\60\1\163\2\60\1\145\1\147\1\160\1\162\1\uffff\1\147\1\162\1\145\1\141\1\144\1\162\1\164\1\157\1\155\1\144\1\162\1\157\1\uffff\1\156\1\164\1\60\1\uffff\1\143\1\145\1\151\1\uffff\1\157\1\uffff\1\162\1\uffff\1\164\1\157\1\145\3\151\1\162\1\60\1\141\1\164\1\151\1\60\2\145\2\60\1\164\1\141\1\uffff\1\164\1\60\1\157\1\60\1\156\1\151\1\60\1\162\1\142\1\162\1\155\1\60\1\uffff\1\144\1\157\1\156\1\uffff\1\162\1\156\2\uffff\1\162\1\60\1\157\1\uffff\1\156\1\uffff\1\141\1\162\1\uffff\1\60\1\151\1\60\1\151\1\uffff\1\145\1\60\1\165\1\157\2\141\1\uffff\3\60\1\162\1\60\1\uffff\1\162\1\uffff\2\162\1\uffff\1\141\2\60\1\163\3\uffff\1\60\1\uffff\2\60\1\157\1\162\2\uffff\1\60\3\uffff\2\60\3\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\164\1\145\1\165\1\157\1\163\1\155\1\157\4\75\1\53\1\55\1\uffff\1\57\1\uffff\1\145\1\157\1\156\1\uffff\1\145\4\uffff\2\151\1\141\2\uffff\1\174\1\46\1\56\1\uffff\1\172\2\uffff\2\uffff\2\uffff\1\162\1\151\1\uffff\1\163\1\156\1\154\1\156\1\164\1\156\1\155\1\143\1\172\1\145\1\160\1\156\1\162\21\uffff\1\162\1\145\1\156\1\163\1\165\1\141\1\uffff\1\145\4\uffff\1\172\1\145\1\163\11\uffff\1\157\1\172\1\145\1\144\1\172\1\163\2\172\1\145\1\147\1\160\1\162\1\uffff\1\147\1\162\1\145\1\141\1\144\1\162\1\164\1\157\1\155\1\144\1\162\1\157\1\uffff\1\156\1\164\1\172\1\uffff\1\143\1\145\1\151\1\uffff\1\157\1\uffff\1\162\1\uffff\1\164\1\157\1\145\3\151\1\162\1\172\1\141\1\164\1\151\1\172\2\145\2\172\1\164\1\141\1\uffff\1\164\1\172\1\157\1\172\1\156\1\151\1\172\1\162\1\142\1\162\1\155\1\172\1\uffff\1\144\1\157\1\156\1\uffff\1\162\1\156\2\uffff\1\162\1\172\1\157\1\uffff\1\156\1\uffff\1\157\1\162\1\uffff\1\172\1\151\1\172\1\151\1\uffff\1\145\1\172\1\165\1\157\2\141\1\uffff\3\172\1\162\1\172\1\uffff\1\162\1\uffff\2\162\1\uffff\1\141\2\172\1\163\3\uffff\1\172\1\uffff\2\172\1\157\1\162\2\uffff\1\172\3\uffff\2\172\3\uffff";
    static final String DFA13_acceptS =
        "\16\uffff\1\23\1\uffff\1\25\3\uffff\1\36\1\uffff\1\40\1\41\1\42\1\43\3\uffff\1\54\1\63\3\uffff\1\72\1\uffff\1\73\1\74\2\uffff\1\77\1\100\2\uffff\1\73\15\uffff\1\13\1\35\1\14\1\70\1\16\1\15\1\20\1\17\1\33\1\21\1\34\1\22\1\23\1\72\1\76\1\24\1\25\6\uffff\1\36\1\uffff\1\40\1\41\1\42\1\43\3\uffff\1\54\1\63\1\65\1\66\1\67\1\71\1\74\1\75\1\77\14\uffff\1\56\14\uffff\1\44\3\uffff\1\47\3\uffff\1\4\1\uffff\1\45\1\uffff\1\7\22\uffff\1\1\14\uffff\1\55\3\uffff\1\64\2\uffff\1\37\1\46\3\uffff\1\53\1\uffff\1\30\2\uffff\1\57\4\uffff\1\12\6\uffff\1\52\5\uffff\1\60\1\uffff\1\62\2\uffff\1\27\4\uffff\1\2\1\3\1\5\1\uffff\1\51\4\uffff\1\31\1\32\1\uffff\1\6\1\10\1\11\2\uffff\1\50\1\26\1\61";
    static final String DFA13_specialS =
        "\1\0\45\uffff\1\2\1\1\u00c1\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\51\2\50\2\51\1\50\22\51\1\50\1\11\1\46\1\42\1\51\1\20\1\40\1\47\1\24\1\26\1\16\1\14\1\31\1\15\1\41\1\17\12\45\1\36\1\35\1\12\1\10\1\13\2\51\32\44\1\27\1\51\1\30\1\43\1\44\1\51\1\23\1\44\1\22\1\2\1\5\1\3\1\44\1\34\1\6\2\44\1\25\1\33\1\44\1\1\1\7\1\44\1\4\1\32\2\44\1\21\4\44\1\51\1\37\uff83\51",
            "\1\53\1\52",
            "\1\55",
            "\1\57\7\uffff\1\60\13\uffff\1\56",
            "\1\62\3\uffff\1\61\11\uffff\1\63",
            "\1\66\1\uffff\1\65\4\uffff\1\64",
            "\1\67",
            "\1\71\15\uffff\1\70",
            "\1\72",
            "\1\74",
            "\1\76",
            "\1\100",
            "\1\102",
            "\1\104",
            "",
            "\1\110\4\uffff\1\107",
            "",
            "\1\113",
            "\1\116\7\uffff\1\114\5\uffff\1\115",
            "\1\120\12\uffff\1\117",
            "",
            "\1\122",
            "",
            "",
            "",
            "",
            "\1\127",
            "\1\130",
            "\1\131",
            "",
            "",
            "\1\134",
            "\1\135",
            "\1\136",
            "",
            "\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "",
            "\0\141",
            "\0\141",
            "",
            "",
            "\1\143",
            "\1\144",
            "",
            "\1\145\14\uffff\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\153\3\uffff\1\152",
            "\1\154",
            "\1\155",
            "\1\156",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "",
            "\1\172",
            "",
            "",
            "",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\15\54\1\173\14\54",
            "\1\175",
            "\1\176",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\177",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0081",
            "\1\u0082",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\2\54\1\u0083\27\54",
            "\1\u0085",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\16\54\1\u0087\13\54",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "",
            "\1\u0099",
            "\1\u009a",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "",
            "\1\u009f",
            "",
            "\1\u00a0",
            "",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00ad",
            "\1\u00ae",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00b1",
            "\1\u00b2",
            "",
            "\1\u00b3",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00b5",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00b7",
            "\1\u00b8",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "",
            "\1\u00c2",
            "\1\u00c3",
            "",
            "",
            "\1\u00c4",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00c6",
            "",
            "\1\u00c7",
            "",
            "\1\u00c9\15\uffff\1\u00c8",
            "\1\u00ca",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00cc",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00ce",
            "",
            "\1\u00cf",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00d8",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\1\u00da",
            "",
            "\1\u00db",
            "\1\u00dc",
            "",
            "\1\u00dd",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00e0",
            "",
            "",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00e4",
            "\1\u00e5",
            "",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | RULE_SL_COMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='o') ) {s = 1;}

                        else if ( (LA13_0=='d') ) {s = 2;}

                        else if ( (LA13_0=='f') ) {s = 3;}

                        else if ( (LA13_0=='r') ) {s = 4;}

                        else if ( (LA13_0=='e') ) {s = 5;}

                        else if ( (LA13_0=='i') ) {s = 6;}

                        else if ( (LA13_0=='p') ) {s = 7;}

                        else if ( (LA13_0=='=') ) {s = 8;}

                        else if ( (LA13_0=='!') ) {s = 9;}

                        else if ( (LA13_0=='<') ) {s = 10;}

                        else if ( (LA13_0=='>') ) {s = 11;}

                        else if ( (LA13_0=='+') ) {s = 12;}

                        else if ( (LA13_0=='-') ) {s = 13;}

                        else if ( (LA13_0=='*') ) {s = 14;}

                        else if ( (LA13_0=='/') ) {s = 15;}

                        else if ( (LA13_0=='%') ) {s = 16;}

                        else if ( (LA13_0=='v') ) {s = 17;}

                        else if ( (LA13_0=='c') ) {s = 18;}

                        else if ( (LA13_0=='a') ) {s = 19;}

                        else if ( (LA13_0=='(') ) {s = 20;}

                        else if ( (LA13_0=='l') ) {s = 21;}

                        else if ( (LA13_0==')') ) {s = 22;}

                        else if ( (LA13_0=='[') ) {s = 23;}

                        else if ( (LA13_0==']') ) {s = 24;}

                        else if ( (LA13_0==',') ) {s = 25;}

                        else if ( (LA13_0=='s') ) {s = 26;}

                        else if ( (LA13_0=='m') ) {s = 27;}

                        else if ( (LA13_0=='h') ) {s = 28;}

                        else if ( (LA13_0==';') ) {s = 29;}

                        else if ( (LA13_0==':') ) {s = 30;}

                        else if ( (LA13_0=='|') ) {s = 31;}

                        else if ( (LA13_0=='&') ) {s = 32;}

                        else if ( (LA13_0=='.') ) {s = 33;}

                        else if ( (LA13_0=='#') ) {s = 34;}

                        else if ( (LA13_0=='^') ) {s = 35;}

                        else if ( ((LA13_0>='A' && LA13_0<='Z')||LA13_0=='_'||LA13_0=='b'||LA13_0=='g'||(LA13_0>='j' && LA13_0<='k')||LA13_0=='n'||LA13_0=='q'||(LA13_0>='t' && LA13_0<='u')||(LA13_0>='w' && LA13_0<='z')) ) {s = 36;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 37;}

                        else if ( (LA13_0=='\"') ) {s = 38;}

                        else if ( (LA13_0=='\'') ) {s = 39;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 40;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='$'||(LA13_0>='?' && LA13_0<='@')||LA13_0=='\\'||LA13_0=='`'||LA13_0=='{'||(LA13_0>='}' && LA13_0<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_39 = input.LA(1);

                        s = -1;
                        if ( ((LA13_39>='\u0000' && LA13_39<='\uFFFF')) ) {s = 97;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_38 = input.LA(1);

                        s = -1;
                        if ( ((LA13_38>='\u0000' && LA13_38<='\uFFFF')) ) {s = 97;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}