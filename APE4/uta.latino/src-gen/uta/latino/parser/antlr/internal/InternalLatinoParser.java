package uta.latino.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uta.latino.services.LatinoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLatinoParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'('", "'leer'", "')'", "'['", "','", "']'", "'si'", "'sino'", "'fin'", "'osi'", "'mientras'", "'repetir'", "'hasta'", "'desde'", "';'", "'para'", "'en'", "'rango'", "'romper'", "'continuar'", "'elegir'", "'otro'", "'defecto'", "':'", "'caso'", "'funcion'", "'fun'", "'retorno'", "'retornar'", "'regresar'", "'devolver'", "'ret'", "'escribir'", "'imprimir'", "'poner'", "'||'", "'&&'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'..'", "'+'", "'-'", "'*'", "'/'", "'%'", "'!'", "'verdadero'", "'cierto'", "'falso'", "'.'", "'anumero'", "'acadena'", "'++'", "'--'"
    };
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
    public static final int RULE_ID=4;
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
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=5;
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


        public InternalLatinoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLatinoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLatinoParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLatino.g"; }



     	private LatinoGrammarAccess grammarAccess;

        public InternalLatinoParser(TokenStream input, LatinoGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Programa";
       	}

       	@Override
       	protected LatinoGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePrograma"
    // InternalLatino.g:65:1: entryRulePrograma returns [EObject current=null] : iv_rulePrograma= rulePrograma EOF ;
    public final EObject entryRulePrograma() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrograma = null;


        try {
            // InternalLatino.g:65:49: (iv_rulePrograma= rulePrograma EOF )
            // InternalLatino.g:66:2: iv_rulePrograma= rulePrograma EOF
            {
             newCompositeNode(grammarAccess.getProgramaRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrograma=rulePrograma();

            state._fsp--;

             current =iv_rulePrograma; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrograma"


    // $ANTLR start "rulePrograma"
    // InternalLatino.g:72:1: rulePrograma returns [EObject current=null] : ( () ( (lv_sentencias_1_0= ruleSentenciaPrincipal ) )* ) ;
    public final EObject rulePrograma() throws RecognitionException {
        EObject current = null;

        EObject lv_sentencias_1_0 = null;



        	enterRule();

        try {
            // InternalLatino.g:78:2: ( ( () ( (lv_sentencias_1_0= ruleSentenciaPrincipal ) )* ) )
            // InternalLatino.g:79:2: ( () ( (lv_sentencias_1_0= ruleSentenciaPrincipal ) )* )
            {
            // InternalLatino.g:79:2: ( () ( (lv_sentencias_1_0= ruleSentenciaPrincipal ) )* )
            // InternalLatino.g:80:3: () ( (lv_sentencias_1_0= ruleSentenciaPrincipal ) )*
            {
            // InternalLatino.g:80:3: ()
            // InternalLatino.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProgramaAccess().getProgramaAction_0(),
            					current);
            			

            }

            // InternalLatino.g:87:3: ( (lv_sentencias_1_0= ruleSentenciaPrincipal ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==18||(LA1_0>=22 && LA1_0<=23)||LA1_0==25||LA1_0==27||(LA1_0>=30 && LA1_0<=32)||(LA1_0>=37 && LA1_0<=46)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLatino.g:88:4: (lv_sentencias_1_0= ruleSentenciaPrincipal )
            	    {
            	    // InternalLatino.g:88:4: (lv_sentencias_1_0= ruleSentenciaPrincipal )
            	    // InternalLatino.g:89:5: lv_sentencias_1_0= ruleSentenciaPrincipal
            	    {

            	    					newCompositeNode(grammarAccess.getProgramaAccess().getSentenciasSentenciaPrincipalParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_sentencias_1_0=ruleSentenciaPrincipal();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramaRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sentencias",
            	    						lv_sentencias_1_0,
            	    						"uta.latino.Latino.SentenciaPrincipal");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrograma"


    // $ANTLR start "entryRuleSentenciaPrincipal"
    // InternalLatino.g:110:1: entryRuleSentenciaPrincipal returns [EObject current=null] : iv_ruleSentenciaPrincipal= ruleSentenciaPrincipal EOF ;
    public final EObject entryRuleSentenciaPrincipal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSentenciaPrincipal = null;


        try {
            // InternalLatino.g:110:59: (iv_ruleSentenciaPrincipal= ruleSentenciaPrincipal EOF )
            // InternalLatino.g:111:2: iv_ruleSentenciaPrincipal= ruleSentenciaPrincipal EOF
            {
             newCompositeNode(grammarAccess.getSentenciaPrincipalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSentenciaPrincipal=ruleSentenciaPrincipal();

            state._fsp--;

             current =iv_ruleSentenciaPrincipal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSentenciaPrincipal"


    // $ANTLR start "ruleSentenciaPrincipal"
    // InternalLatino.g:117:1: ruleSentenciaPrincipal returns [EObject current=null] : (this_Sentencia_0= ruleSentencia | this_Funcion_1= ruleFuncion ) ;
    public final EObject ruleSentenciaPrincipal() throws RecognitionException {
        EObject current = null;

        EObject this_Sentencia_0 = null;

        EObject this_Funcion_1 = null;



        	enterRule();

        try {
            // InternalLatino.g:123:2: ( (this_Sentencia_0= ruleSentencia | this_Funcion_1= ruleFuncion ) )
            // InternalLatino.g:124:2: (this_Sentencia_0= ruleSentencia | this_Funcion_1= ruleFuncion )
            {
            // InternalLatino.g:124:2: (this_Sentencia_0= ruleSentencia | this_Funcion_1= ruleFuncion )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID||LA2_0==18||(LA2_0>=22 && LA2_0<=23)||LA2_0==25||LA2_0==27||(LA2_0>=30 && LA2_0<=32)||(LA2_0>=39 && LA2_0<=46)) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=37 && LA2_0<=38)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalLatino.g:125:3: this_Sentencia_0= ruleSentencia
                    {

                    			newCompositeNode(grammarAccess.getSentenciaPrincipalAccess().getSentenciaParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sentencia_0=ruleSentencia();

                    state._fsp--;


                    			current = this_Sentencia_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLatino.g:134:3: this_Funcion_1= ruleFuncion
                    {

                    			newCompositeNode(grammarAccess.getSentenciaPrincipalAccess().getFuncionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Funcion_1=ruleFuncion();

                    state._fsp--;


                    			current = this_Funcion_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSentenciaPrincipal"


    // $ANTLR start "entryRuleSentencia"
    // InternalLatino.g:146:1: entryRuleSentencia returns [EObject current=null] : iv_ruleSentencia= ruleSentencia EOF ;
    public final EObject entryRuleSentencia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSentencia = null;


        try {
            // InternalLatino.g:146:50: (iv_ruleSentencia= ruleSentencia EOF )
            // InternalLatino.g:147:2: iv_ruleSentencia= ruleSentencia EOF
            {
             newCompositeNode(grammarAccess.getSentenciaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSentencia=ruleSentencia();

            state._fsp--;

             current =iv_ruleSentencia; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSentencia"


    // $ANTLR start "ruleSentencia"
    // InternalLatino.g:153:1: ruleSentencia returns [EObject current=null] : (this_Asignacion_0= ruleAsignacion | this_Leer_1= ruleLeer | this_Lista_2= ruleLista | this_AsignacionIndice_3= ruleAsignacionIndice | this_Incremento_4= ruleIncremento | this_Condicional_5= ruleCondicional | this_Imprimir_6= ruleImprimir | this_Mientras_7= ruleMientras | this_Repetir_8= ruleRepetir | this_Desde_9= ruleDesde | this_Para_10= rulePara | this_Romper_11= ruleRomper | this_Continuar_12= ruleContinuar | this_Elegir_13= ruleElegir | this_Retorno_14= ruleRetorno | this_Llamada_15= ruleLlamada ) ;
    public final EObject ruleSentencia() throws RecognitionException {
        EObject current = null;

        EObject this_Asignacion_0 = null;

        EObject this_Leer_1 = null;

        EObject this_Lista_2 = null;

        EObject this_AsignacionIndice_3 = null;

        EObject this_Incremento_4 = null;

        EObject this_Condicional_5 = null;

        EObject this_Imprimir_6 = null;

        EObject this_Mientras_7 = null;

        EObject this_Repetir_8 = null;

        EObject this_Desde_9 = null;

        EObject this_Para_10 = null;

        EObject this_Romper_11 = null;

        EObject this_Continuar_12 = null;

        EObject this_Elegir_13 = null;

        EObject this_Retorno_14 = null;

        EObject this_Llamada_15 = null;



        	enterRule();

        try {
            // InternalLatino.g:159:2: ( (this_Asignacion_0= ruleAsignacion | this_Leer_1= ruleLeer | this_Lista_2= ruleLista | this_AsignacionIndice_3= ruleAsignacionIndice | this_Incremento_4= ruleIncremento | this_Condicional_5= ruleCondicional | this_Imprimir_6= ruleImprimir | this_Mientras_7= ruleMientras | this_Repetir_8= ruleRepetir | this_Desde_9= ruleDesde | this_Para_10= rulePara | this_Romper_11= ruleRomper | this_Continuar_12= ruleContinuar | this_Elegir_13= ruleElegir | this_Retorno_14= ruleRetorno | this_Llamada_15= ruleLlamada ) )
            // InternalLatino.g:160:2: (this_Asignacion_0= ruleAsignacion | this_Leer_1= ruleLeer | this_Lista_2= ruleLista | this_AsignacionIndice_3= ruleAsignacionIndice | this_Incremento_4= ruleIncremento | this_Condicional_5= ruleCondicional | this_Imprimir_6= ruleImprimir | this_Mientras_7= ruleMientras | this_Repetir_8= ruleRepetir | this_Desde_9= ruleDesde | this_Para_10= rulePara | this_Romper_11= ruleRomper | this_Continuar_12= ruleContinuar | this_Elegir_13= ruleElegir | this_Retorno_14= ruleRetorno | this_Llamada_15= ruleLlamada )
            {
            // InternalLatino.g:160:2: (this_Asignacion_0= ruleAsignacion | this_Leer_1= ruleLeer | this_Lista_2= ruleLista | this_AsignacionIndice_3= ruleAsignacionIndice | this_Incremento_4= ruleIncremento | this_Condicional_5= ruleCondicional | this_Imprimir_6= ruleImprimir | this_Mientras_7= ruleMientras | this_Repetir_8= ruleRepetir | this_Desde_9= ruleDesde | this_Para_10= rulePara | this_Romper_11= ruleRomper | this_Continuar_12= ruleContinuar | this_Elegir_13= ruleElegir | this_Retorno_14= ruleRetorno | this_Llamada_15= ruleLlamada )
            int alt3=16;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalLatino.g:161:3: this_Asignacion_0= ruleAsignacion
                    {

                    			newCompositeNode(grammarAccess.getSentenciaAccess().getAsignacionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Asignacion_0=ruleAsignacion();

                    state._fsp--;


                    			current = this_Asignacion_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLatino.g:170:3: this_Leer_1= ruleLeer
                    {

                    			newCompositeNode(grammarAccess.getSentenciaAccess().getLeerParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Leer_1=ruleLeer();

                    state._fsp--;


                    			current = this_Leer_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalLatino.g:179:3: this_Lista_2= ruleLista
                    {

                    			newCompositeNode(grammarAccess.getSentenciaAccess().getListaParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Lista_2=ruleLista();

                    state._fsp--;


                    			current = this_Lista_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalLatino.g:188:3: this_AsignacionIndice_3= ruleAsignacionIndice
                    {

                    			newCompositeNode(grammarAccess.getSentenciaAccess().getAsignacionIndiceParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_AsignacionIndice_3=ruleAsignacionIndice();

                    state._fsp--;


                    			current = this_AsignacionIndice_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalLatino.g:197:3: this_Incremento_4= ruleIncremento
                    {

                    			newCompositeNode(grammarAccess.getSentenciaAccess().getIncrementoParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Incremento_4=ruleIncremento();

                    state._fsp--;


                    			current = this_Incremento_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalLatino.g:206:3: this_Condicional_5= ruleCondicional
                    {

                    			newCompositeNode(grammarAccess.getSentenciaAccess().getCondicionalParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Condicional_5=ruleCondicional();

                    state._fsp--;


                    			current = this_Condicional_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalLatino.g:215:3: this_Imprimir_6= ruleImprimir
                    {

                    			newCompositeNode(grammarAccess.getSentenciaAccess().getImprimirParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Imprimir_6=ruleImprimir();

                    state._fsp--;


                    			current = this_Imprimir_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalLatino.g:224:3: this_Mientras_7= ruleMientras
                    {

                    			newCompositeNode(grammarAccess.getSentenciaAccess().getMientrasParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Mientras_7=ruleMientras();

                    state._fsp--;


                    			current = this_Mientras_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalLatino.g:233:3: this_Repetir_8= ruleRepetir
                    {

                    			newCompositeNode(grammarAccess.getSentenciaAccess().getRepetirParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Repetir_8=ruleRepetir();

                    state._fsp--;


                    			current = this_Repetir_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalLatino.g:242:3: this_Desde_9= ruleDesde
                    {

                    			newCompositeNode(grammarAccess.getSentenciaAccess().getDesdeParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_Desde_9=ruleDesde();

                    state._fsp--;


                    			current = this_Desde_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalLatino.g:251:3: this_Para_10= rulePara
                    {

                    			newCompositeNode(grammarAccess.getSentenciaAccess().getParaParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_Para_10=rulePara();

                    state._fsp--;


                    			current = this_Para_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalLatino.g:260:3: this_Romper_11= ruleRomper
                    {

                    			newCompositeNode(grammarAccess.getSentenciaAccess().getRomperParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_Romper_11=ruleRomper();

                    state._fsp--;


                    			current = this_Romper_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalLatino.g:269:3: this_Continuar_12= ruleContinuar
                    {

                    			newCompositeNode(grammarAccess.getSentenciaAccess().getContinuarParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_Continuar_12=ruleContinuar();

                    state._fsp--;


                    			current = this_Continuar_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalLatino.g:278:3: this_Elegir_13= ruleElegir
                    {

                    			newCompositeNode(grammarAccess.getSentenciaAccess().getElegirParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_Elegir_13=ruleElegir();

                    state._fsp--;


                    			current = this_Elegir_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 15 :
                    // InternalLatino.g:287:3: this_Retorno_14= ruleRetorno
                    {

                    			newCompositeNode(grammarAccess.getSentenciaAccess().getRetornoParserRuleCall_14());
                    		
                    pushFollow(FOLLOW_2);
                    this_Retorno_14=ruleRetorno();

                    state._fsp--;


                    			current = this_Retorno_14;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 16 :
                    // InternalLatino.g:296:3: this_Llamada_15= ruleLlamada
                    {

                    			newCompositeNode(grammarAccess.getSentenciaAccess().getLlamadaParserRuleCall_15());
                    		
                    pushFollow(FOLLOW_2);
                    this_Llamada_15=ruleLlamada();

                    state._fsp--;


                    			current = this_Llamada_15;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSentencia"


    // $ANTLR start "entryRuleAsignacion"
    // InternalLatino.g:308:1: entryRuleAsignacion returns [EObject current=null] : iv_ruleAsignacion= ruleAsignacion EOF ;
    public final EObject entryRuleAsignacion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsignacion = null;


        try {
            // InternalLatino.g:308:51: (iv_ruleAsignacion= ruleAsignacion EOF )
            // InternalLatino.g:309:2: iv_ruleAsignacion= ruleAsignacion EOF
            {
             newCompositeNode(grammarAccess.getAsignacionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAsignacion=ruleAsignacion();

            state._fsp--;

             current =iv_ruleAsignacion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAsignacion"


    // $ANTLR start "ruleAsignacion"
    // InternalLatino.g:315:1: ruleAsignacion returns [EObject current=null] : ( ( (lv_nombre_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_valor_2_0= ruleExpresion ) ) ) ;
    public final EObject ruleAsignacion() throws RecognitionException {
        EObject current = null;

        Token lv_nombre_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_valor_2_0 = null;



        	enterRule();

        try {
            // InternalLatino.g:321:2: ( ( ( (lv_nombre_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_valor_2_0= ruleExpresion ) ) ) )
            // InternalLatino.g:322:2: ( ( (lv_nombre_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_valor_2_0= ruleExpresion ) ) )
            {
            // InternalLatino.g:322:2: ( ( (lv_nombre_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_valor_2_0= ruleExpresion ) ) )
            // InternalLatino.g:323:3: ( (lv_nombre_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_valor_2_0= ruleExpresion ) )
            {
            // InternalLatino.g:323:3: ( (lv_nombre_0_0= RULE_ID ) )
            // InternalLatino.g:324:4: (lv_nombre_0_0= RULE_ID )
            {
            // InternalLatino.g:324:4: (lv_nombre_0_0= RULE_ID )
            // InternalLatino.g:325:5: lv_nombre_0_0= RULE_ID
            {
            lv_nombre_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_nombre_0_0, grammarAccess.getAsignacionAccess().getNombreIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAsignacionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nombre",
            						lv_nombre_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getAsignacionAccess().getEqualsSignKeyword_1());
            		
            // InternalLatino.g:345:3: ( (lv_valor_2_0= ruleExpresion ) )
            // InternalLatino.g:346:4: (lv_valor_2_0= ruleExpresion )
            {
            // InternalLatino.g:346:4: (lv_valor_2_0= ruleExpresion )
            // InternalLatino.g:347:5: lv_valor_2_0= ruleExpresion
            {

            					newCompositeNode(grammarAccess.getAsignacionAccess().getValorExpresionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_valor_2_0=ruleExpresion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAsignacionRule());
            					}
            					set(
            						current,
            						"valor",
            						lv_valor_2_0,
            						"uta.latino.Latino.Expresion");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAsignacion"


    // $ANTLR start "entryRuleLeer"
    // InternalLatino.g:368:1: entryRuleLeer returns [EObject current=null] : iv_ruleLeer= ruleLeer EOF ;
    public final EObject entryRuleLeer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeer = null;


        try {
            // InternalLatino.g:368:45: (iv_ruleLeer= ruleLeer EOF )
            // InternalLatino.g:369:2: iv_ruleLeer= ruleLeer EOF
            {
             newCompositeNode(grammarAccess.getLeerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLeer=ruleLeer();

            state._fsp--;

             current =iv_ruleLeer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLeer"


    // $ANTLR start "ruleLeer"
    // InternalLatino.g:375:1: ruleLeer returns [EObject current=null] : ( ( (lv_nombre_0_0= RULE_ID ) ) otherlv_1= '=' ( ( ( (lv_conversion_2_0= ruleConversion ) ) otherlv_3= '(' otherlv_4= 'leer' otherlv_5= '(' otherlv_6= ')' otherlv_7= ')' ) | (otherlv_8= 'leer' otherlv_9= '(' otherlv_10= ')' ) ) ) ;
    public final EObject ruleLeer() throws RecognitionException {
        EObject current = null;

        Token lv_nombre_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Enumerator lv_conversion_2_0 = null;



        	enterRule();

        try {
            // InternalLatino.g:381:2: ( ( ( (lv_nombre_0_0= RULE_ID ) ) otherlv_1= '=' ( ( ( (lv_conversion_2_0= ruleConversion ) ) otherlv_3= '(' otherlv_4= 'leer' otherlv_5= '(' otherlv_6= ')' otherlv_7= ')' ) | (otherlv_8= 'leer' otherlv_9= '(' otherlv_10= ')' ) ) ) )
            // InternalLatino.g:382:2: ( ( (lv_nombre_0_0= RULE_ID ) ) otherlv_1= '=' ( ( ( (lv_conversion_2_0= ruleConversion ) ) otherlv_3= '(' otherlv_4= 'leer' otherlv_5= '(' otherlv_6= ')' otherlv_7= ')' ) | (otherlv_8= 'leer' otherlv_9= '(' otherlv_10= ')' ) ) )
            {
            // InternalLatino.g:382:2: ( ( (lv_nombre_0_0= RULE_ID ) ) otherlv_1= '=' ( ( ( (lv_conversion_2_0= ruleConversion ) ) otherlv_3= '(' otherlv_4= 'leer' otherlv_5= '(' otherlv_6= ')' otherlv_7= ')' ) | (otherlv_8= 'leer' otherlv_9= '(' otherlv_10= ')' ) ) )
            // InternalLatino.g:383:3: ( (lv_nombre_0_0= RULE_ID ) ) otherlv_1= '=' ( ( ( (lv_conversion_2_0= ruleConversion ) ) otherlv_3= '(' otherlv_4= 'leer' otherlv_5= '(' otherlv_6= ')' otherlv_7= ')' ) | (otherlv_8= 'leer' otherlv_9= '(' otherlv_10= ')' ) )
            {
            // InternalLatino.g:383:3: ( (lv_nombre_0_0= RULE_ID ) )
            // InternalLatino.g:384:4: (lv_nombre_0_0= RULE_ID )
            {
            // InternalLatino.g:384:4: (lv_nombre_0_0= RULE_ID )
            // InternalLatino.g:385:5: lv_nombre_0_0= RULE_ID
            {
            lv_nombre_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_nombre_0_0, grammarAccess.getLeerAccess().getNombreIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLeerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nombre",
            						lv_nombre_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getLeerAccess().getEqualsSignKeyword_1());
            		
            // InternalLatino.g:405:3: ( ( ( (lv_conversion_2_0= ruleConversion ) ) otherlv_3= '(' otherlv_4= 'leer' otherlv_5= '(' otherlv_6= ')' otherlv_7= ')' ) | (otherlv_8= 'leer' otherlv_9= '(' otherlv_10= ')' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=66 && LA4_0<=67)) ) {
                alt4=1;
            }
            else if ( (LA4_0==13) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalLatino.g:406:4: ( ( (lv_conversion_2_0= ruleConversion ) ) otherlv_3= '(' otherlv_4= 'leer' otherlv_5= '(' otherlv_6= ')' otherlv_7= ')' )
                    {
                    // InternalLatino.g:406:4: ( ( (lv_conversion_2_0= ruleConversion ) ) otherlv_3= '(' otherlv_4= 'leer' otherlv_5= '(' otherlv_6= ')' otherlv_7= ')' )
                    // InternalLatino.g:407:5: ( (lv_conversion_2_0= ruleConversion ) ) otherlv_3= '(' otherlv_4= 'leer' otherlv_5= '(' otherlv_6= ')' otherlv_7= ')'
                    {
                    // InternalLatino.g:407:5: ( (lv_conversion_2_0= ruleConversion ) )
                    // InternalLatino.g:408:6: (lv_conversion_2_0= ruleConversion )
                    {
                    // InternalLatino.g:408:6: (lv_conversion_2_0= ruleConversion )
                    // InternalLatino.g:409:7: lv_conversion_2_0= ruleConversion
                    {

                    							newCompositeNode(grammarAccess.getLeerAccess().getConversionConversionEnumRuleCall_2_0_0_0());
                    						
                    pushFollow(FOLLOW_7);
                    lv_conversion_2_0=ruleConversion();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getLeerRule());
                    							}
                    							set(
                    								current,
                    								"conversion",
                    								lv_conversion_2_0,
                    								"uta.latino.Latino.Conversion");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_3=(Token)match(input,12,FOLLOW_8); 

                    					newLeafNode(otherlv_3, grammarAccess.getLeerAccess().getLeftParenthesisKeyword_2_0_1());
                    				
                    otherlv_4=(Token)match(input,13,FOLLOW_7); 

                    					newLeafNode(otherlv_4, grammarAccess.getLeerAccess().getLeerKeyword_2_0_2());
                    				
                    otherlv_5=(Token)match(input,12,FOLLOW_9); 

                    					newLeafNode(otherlv_5, grammarAccess.getLeerAccess().getLeftParenthesisKeyword_2_0_3());
                    				
                    otherlv_6=(Token)match(input,14,FOLLOW_9); 

                    					newLeafNode(otherlv_6, grammarAccess.getLeerAccess().getRightParenthesisKeyword_2_0_4());
                    				
                    otherlv_7=(Token)match(input,14,FOLLOW_2); 

                    					newLeafNode(otherlv_7, grammarAccess.getLeerAccess().getRightParenthesisKeyword_2_0_5());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalLatino.g:448:4: (otherlv_8= 'leer' otherlv_9= '(' otherlv_10= ')' )
                    {
                    // InternalLatino.g:448:4: (otherlv_8= 'leer' otherlv_9= '(' otherlv_10= ')' )
                    // InternalLatino.g:449:5: otherlv_8= 'leer' otherlv_9= '(' otherlv_10= ')'
                    {
                    otherlv_8=(Token)match(input,13,FOLLOW_7); 

                    					newLeafNode(otherlv_8, grammarAccess.getLeerAccess().getLeerKeyword_2_1_0());
                    				
                    otherlv_9=(Token)match(input,12,FOLLOW_9); 

                    					newLeafNode(otherlv_9, grammarAccess.getLeerAccess().getLeftParenthesisKeyword_2_1_1());
                    				
                    otherlv_10=(Token)match(input,14,FOLLOW_2); 

                    					newLeafNode(otherlv_10, grammarAccess.getLeerAccess().getRightParenthesisKeyword_2_1_2());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLeer"


    // $ANTLR start "entryRuleLista"
    // InternalLatino.g:467:1: entryRuleLista returns [EObject current=null] : iv_ruleLista= ruleLista EOF ;
    public final EObject entryRuleLista() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLista = null;


        try {
            // InternalLatino.g:467:46: (iv_ruleLista= ruleLista EOF )
            // InternalLatino.g:468:2: iv_ruleLista= ruleLista EOF
            {
             newCompositeNode(grammarAccess.getListaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLista=ruleLista();

            state._fsp--;

             current =iv_ruleLista; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLista"


    // $ANTLR start "ruleLista"
    // InternalLatino.g:474:1: ruleLista returns [EObject current=null] : ( ( (lv_nombre_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '[' ( ( (lv_elementos_3_0= ruleExpresion ) ) (otherlv_4= ',' ( (lv_elementos_5_0= ruleExpresion ) ) )* )? otherlv_6= ']' ) ;
    public final EObject ruleLista() throws RecognitionException {
        EObject current = null;

        Token lv_nombre_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_elementos_3_0 = null;

        AntlrDatatypeRuleToken lv_elementos_5_0 = null;



        	enterRule();

        try {
            // InternalLatino.g:480:2: ( ( ( (lv_nombre_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '[' ( ( (lv_elementos_3_0= ruleExpresion ) ) (otherlv_4= ',' ( (lv_elementos_5_0= ruleExpresion ) ) )* )? otherlv_6= ']' ) )
            // InternalLatino.g:481:2: ( ( (lv_nombre_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '[' ( ( (lv_elementos_3_0= ruleExpresion ) ) (otherlv_4= ',' ( (lv_elementos_5_0= ruleExpresion ) ) )* )? otherlv_6= ']' )
            {
            // InternalLatino.g:481:2: ( ( (lv_nombre_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '[' ( ( (lv_elementos_3_0= ruleExpresion ) ) (otherlv_4= ',' ( (lv_elementos_5_0= ruleExpresion ) ) )* )? otherlv_6= ']' )
            // InternalLatino.g:482:3: ( (lv_nombre_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '[' ( ( (lv_elementos_3_0= ruleExpresion ) ) (otherlv_4= ',' ( (lv_elementos_5_0= ruleExpresion ) ) )* )? otherlv_6= ']'
            {
            // InternalLatino.g:482:3: ( (lv_nombre_0_0= RULE_ID ) )
            // InternalLatino.g:483:4: (lv_nombre_0_0= RULE_ID )
            {
            // InternalLatino.g:483:4: (lv_nombre_0_0= RULE_ID )
            // InternalLatino.g:484:5: lv_nombre_0_0= RULE_ID
            {
            lv_nombre_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_nombre_0_0, grammarAccess.getListaAccess().getNombreIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nombre",
            						lv_nombre_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,11,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getListaAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getListaAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalLatino.g:508:3: ( ( (lv_elementos_3_0= ruleExpresion ) ) (otherlv_4= ',' ( (lv_elementos_5_0= ruleExpresion ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_INT)||LA6_0==12||LA6_0==57||(LA6_0>=61 && LA6_0<=64)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalLatino.g:509:4: ( (lv_elementos_3_0= ruleExpresion ) ) (otherlv_4= ',' ( (lv_elementos_5_0= ruleExpresion ) ) )*
                    {
                    // InternalLatino.g:509:4: ( (lv_elementos_3_0= ruleExpresion ) )
                    // InternalLatino.g:510:5: (lv_elementos_3_0= ruleExpresion )
                    {
                    // InternalLatino.g:510:5: (lv_elementos_3_0= ruleExpresion )
                    // InternalLatino.g:511:6: lv_elementos_3_0= ruleExpresion
                    {

                    						newCompositeNode(grammarAccess.getListaAccess().getElementosExpresionParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_elementos_3_0=ruleExpresion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getListaRule());
                    						}
                    						add(
                    							current,
                    							"elementos",
                    							lv_elementos_3_0,
                    							"uta.latino.Latino.Expresion");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalLatino.g:528:4: (otherlv_4= ',' ( (lv_elementos_5_0= ruleExpresion ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==16) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalLatino.g:529:5: otherlv_4= ',' ( (lv_elementos_5_0= ruleExpresion ) )
                    	    {
                    	    otherlv_4=(Token)match(input,16,FOLLOW_5); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getListaAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalLatino.g:533:5: ( (lv_elementos_5_0= ruleExpresion ) )
                    	    // InternalLatino.g:534:6: (lv_elementos_5_0= ruleExpresion )
                    	    {
                    	    // InternalLatino.g:534:6: (lv_elementos_5_0= ruleExpresion )
                    	    // InternalLatino.g:535:7: lv_elementos_5_0= ruleExpresion
                    	    {

                    	    							newCompositeNode(grammarAccess.getListaAccess().getElementosExpresionParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_elementos_5_0=ruleExpresion();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getListaRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elementos",
                    	    								lv_elementos_5_0,
                    	    								"uta.latino.Latino.Expresion");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getListaAccess().getRightSquareBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLista"


    // $ANTLR start "entryRuleAsignacionIndice"
    // InternalLatino.g:562:1: entryRuleAsignacionIndice returns [EObject current=null] : iv_ruleAsignacionIndice= ruleAsignacionIndice EOF ;
    public final EObject entryRuleAsignacionIndice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsignacionIndice = null;


        try {
            // InternalLatino.g:562:57: (iv_ruleAsignacionIndice= ruleAsignacionIndice EOF )
            // InternalLatino.g:563:2: iv_ruleAsignacionIndice= ruleAsignacionIndice EOF
            {
             newCompositeNode(grammarAccess.getAsignacionIndiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAsignacionIndice=ruleAsignacionIndice();

            state._fsp--;

             current =iv_ruleAsignacionIndice; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAsignacionIndice"


    // $ANTLR start "ruleAsignacionIndice"
    // InternalLatino.g:569:1: ruleAsignacionIndice returns [EObject current=null] : ( ( (lv_lista_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_indice_2_0= ruleExpresion ) ) otherlv_3= ']' otherlv_4= '=' ( (lv_valor_5_0= ruleExpresion ) ) ) ;
    public final EObject ruleAsignacionIndice() throws RecognitionException {
        EObject current = null;

        Token lv_lista_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_indice_2_0 = null;

        AntlrDatatypeRuleToken lv_valor_5_0 = null;



        	enterRule();

        try {
            // InternalLatino.g:575:2: ( ( ( (lv_lista_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_indice_2_0= ruleExpresion ) ) otherlv_3= ']' otherlv_4= '=' ( (lv_valor_5_0= ruleExpresion ) ) ) )
            // InternalLatino.g:576:2: ( ( (lv_lista_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_indice_2_0= ruleExpresion ) ) otherlv_3= ']' otherlv_4= '=' ( (lv_valor_5_0= ruleExpresion ) ) )
            {
            // InternalLatino.g:576:2: ( ( (lv_lista_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_indice_2_0= ruleExpresion ) ) otherlv_3= ']' otherlv_4= '=' ( (lv_valor_5_0= ruleExpresion ) ) )
            // InternalLatino.g:577:3: ( (lv_lista_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_indice_2_0= ruleExpresion ) ) otherlv_3= ']' otherlv_4= '=' ( (lv_valor_5_0= ruleExpresion ) )
            {
            // InternalLatino.g:577:3: ( (lv_lista_0_0= RULE_ID ) )
            // InternalLatino.g:578:4: (lv_lista_0_0= RULE_ID )
            {
            // InternalLatino.g:578:4: (lv_lista_0_0= RULE_ID )
            // InternalLatino.g:579:5: lv_lista_0_0= RULE_ID
            {
            lv_lista_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_lista_0_0, grammarAccess.getAsignacionIndiceAccess().getListaIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAsignacionIndiceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lista",
            						lv_lista_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getAsignacionIndiceAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalLatino.g:599:3: ( (lv_indice_2_0= ruleExpresion ) )
            // InternalLatino.g:600:4: (lv_indice_2_0= ruleExpresion )
            {
            // InternalLatino.g:600:4: (lv_indice_2_0= ruleExpresion )
            // InternalLatino.g:601:5: lv_indice_2_0= ruleExpresion
            {

            					newCompositeNode(grammarAccess.getAsignacionIndiceAccess().getIndiceExpresionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
            lv_indice_2_0=ruleExpresion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAsignacionIndiceRule());
            					}
            					set(
            						current,
            						"indice",
            						lv_indice_2_0,
            						"uta.latino.Latino.Expresion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getAsignacionIndiceAccess().getRightSquareBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getAsignacionIndiceAccess().getEqualsSignKeyword_4());
            		
            // InternalLatino.g:626:3: ( (lv_valor_5_0= ruleExpresion ) )
            // InternalLatino.g:627:4: (lv_valor_5_0= ruleExpresion )
            {
            // InternalLatino.g:627:4: (lv_valor_5_0= ruleExpresion )
            // InternalLatino.g:628:5: lv_valor_5_0= ruleExpresion
            {

            					newCompositeNode(grammarAccess.getAsignacionIndiceAccess().getValorExpresionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_valor_5_0=ruleExpresion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAsignacionIndiceRule());
            					}
            					set(
            						current,
            						"valor",
            						lv_valor_5_0,
            						"uta.latino.Latino.Expresion");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAsignacionIndice"


    // $ANTLR start "entryRuleCondicional"
    // InternalLatino.g:649:1: entryRuleCondicional returns [EObject current=null] : iv_ruleCondicional= ruleCondicional EOF ;
    public final EObject entryRuleCondicional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondicional = null;


        try {
            // InternalLatino.g:649:52: (iv_ruleCondicional= ruleCondicional EOF )
            // InternalLatino.g:650:2: iv_ruleCondicional= ruleCondicional EOF
            {
             newCompositeNode(grammarAccess.getCondicionalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondicional=ruleCondicional();

            state._fsp--;

             current =iv_ruleCondicional; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondicional"


    // $ANTLR start "ruleCondicional"
    // InternalLatino.g:656:1: ruleCondicional returns [EObject current=null] : (otherlv_0= 'si' ( (lv_condicion_1_0= ruleExpresion ) ) ( (lv_entonces_2_0= ruleSentencia ) )* ( (lv_osis_3_0= ruleOsi ) )* (otherlv_4= 'sino' ( (lv_sino_5_0= ruleSentencia ) )* )? otherlv_6= 'fin' ) ;
    public final EObject ruleCondicional() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_condicion_1_0 = null;

        EObject lv_entonces_2_0 = null;

        EObject lv_osis_3_0 = null;

        EObject lv_sino_5_0 = null;



        	enterRule();

        try {
            // InternalLatino.g:662:2: ( (otherlv_0= 'si' ( (lv_condicion_1_0= ruleExpresion ) ) ( (lv_entonces_2_0= ruleSentencia ) )* ( (lv_osis_3_0= ruleOsi ) )* (otherlv_4= 'sino' ( (lv_sino_5_0= ruleSentencia ) )* )? otherlv_6= 'fin' ) )
            // InternalLatino.g:663:2: (otherlv_0= 'si' ( (lv_condicion_1_0= ruleExpresion ) ) ( (lv_entonces_2_0= ruleSentencia ) )* ( (lv_osis_3_0= ruleOsi ) )* (otherlv_4= 'sino' ( (lv_sino_5_0= ruleSentencia ) )* )? otherlv_6= 'fin' )
            {
            // InternalLatino.g:663:2: (otherlv_0= 'si' ( (lv_condicion_1_0= ruleExpresion ) ) ( (lv_entonces_2_0= ruleSentencia ) )* ( (lv_osis_3_0= ruleOsi ) )* (otherlv_4= 'sino' ( (lv_sino_5_0= ruleSentencia ) )* )? otherlv_6= 'fin' )
            // InternalLatino.g:664:3: otherlv_0= 'si' ( (lv_condicion_1_0= ruleExpresion ) ) ( (lv_entonces_2_0= ruleSentencia ) )* ( (lv_osis_3_0= ruleOsi ) )* (otherlv_4= 'sino' ( (lv_sino_5_0= ruleSentencia ) )* )? otherlv_6= 'fin'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getCondicionalAccess().getSiKeyword_0());
            		
            // InternalLatino.g:668:3: ( (lv_condicion_1_0= ruleExpresion ) )
            // InternalLatino.g:669:4: (lv_condicion_1_0= ruleExpresion )
            {
            // InternalLatino.g:669:4: (lv_condicion_1_0= ruleExpresion )
            // InternalLatino.g:670:5: lv_condicion_1_0= ruleExpresion
            {

            					newCompositeNode(grammarAccess.getCondicionalAccess().getCondicionExpresionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_condicion_1_0=ruleExpresion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCondicionalRule());
            					}
            					set(
            						current,
            						"condicion",
            						lv_condicion_1_0,
            						"uta.latino.Latino.Expresion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLatino.g:687:3: ( (lv_entonces_2_0= ruleSentencia ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==18||(LA7_0>=22 && LA7_0<=23)||LA7_0==25||LA7_0==27||(LA7_0>=30 && LA7_0<=32)||(LA7_0>=39 && LA7_0<=46)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalLatino.g:688:4: (lv_entonces_2_0= ruleSentencia )
            	    {
            	    // InternalLatino.g:688:4: (lv_entonces_2_0= ruleSentencia )
            	    // InternalLatino.g:689:5: lv_entonces_2_0= ruleSentencia
            	    {

            	    					newCompositeNode(grammarAccess.getCondicionalAccess().getEntoncesSentenciaParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_entonces_2_0=ruleSentencia();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCondicionalRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entonces",
            	    						lv_entonces_2_0,
            	    						"uta.latino.Latino.Sentencia");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalLatino.g:706:3: ( (lv_osis_3_0= ruleOsi ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalLatino.g:707:4: (lv_osis_3_0= ruleOsi )
            	    {
            	    // InternalLatino.g:707:4: (lv_osis_3_0= ruleOsi )
            	    // InternalLatino.g:708:5: lv_osis_3_0= ruleOsi
            	    {

            	    					newCompositeNode(grammarAccess.getCondicionalAccess().getOsisOsiParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_osis_3_0=ruleOsi();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCondicionalRule());
            	    					}
            	    					add(
            	    						current,
            	    						"osis",
            	    						lv_osis_3_0,
            	    						"uta.latino.Latino.Osi");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalLatino.g:725:3: (otherlv_4= 'sino' ( (lv_sino_5_0= ruleSentencia ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalLatino.g:726:4: otherlv_4= 'sino' ( (lv_sino_5_0= ruleSentencia ) )*
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getCondicionalAccess().getSinoKeyword_4_0());
                    			
                    // InternalLatino.g:730:4: ( (lv_sino_5_0= ruleSentencia ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_ID||LA9_0==18||(LA9_0>=22 && LA9_0<=23)||LA9_0==25||LA9_0==27||(LA9_0>=30 && LA9_0<=32)||(LA9_0>=39 && LA9_0<=46)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalLatino.g:731:5: (lv_sino_5_0= ruleSentencia )
                    	    {
                    	    // InternalLatino.g:731:5: (lv_sino_5_0= ruleSentencia )
                    	    // InternalLatino.g:732:6: lv_sino_5_0= ruleSentencia
                    	    {

                    	    						newCompositeNode(grammarAccess.getCondicionalAccess().getSinoSentenciaParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_16);
                    	    lv_sino_5_0=ruleSentencia();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCondicionalRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"sino",
                    	    							lv_sino_5_0,
                    	    							"uta.latino.Latino.Sentencia");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCondicionalAccess().getFinKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondicional"


    // $ANTLR start "entryRuleOsi"
    // InternalLatino.g:758:1: entryRuleOsi returns [EObject current=null] : iv_ruleOsi= ruleOsi EOF ;
    public final EObject entryRuleOsi() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOsi = null;


        try {
            // InternalLatino.g:758:44: (iv_ruleOsi= ruleOsi EOF )
            // InternalLatino.g:759:2: iv_ruleOsi= ruleOsi EOF
            {
             newCompositeNode(grammarAccess.getOsiRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOsi=ruleOsi();

            state._fsp--;

             current =iv_ruleOsi; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOsi"


    // $ANTLR start "ruleOsi"
    // InternalLatino.g:765:1: ruleOsi returns [EObject current=null] : (otherlv_0= 'osi' ( (lv_condicion_1_0= ruleExpresion ) ) ( (lv_sentencias_2_0= ruleSentencia ) )* ) ;
    public final EObject ruleOsi() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_condicion_1_0 = null;

        EObject lv_sentencias_2_0 = null;



        	enterRule();

        try {
            // InternalLatino.g:771:2: ( (otherlv_0= 'osi' ( (lv_condicion_1_0= ruleExpresion ) ) ( (lv_sentencias_2_0= ruleSentencia ) )* ) )
            // InternalLatino.g:772:2: (otherlv_0= 'osi' ( (lv_condicion_1_0= ruleExpresion ) ) ( (lv_sentencias_2_0= ruleSentencia ) )* )
            {
            // InternalLatino.g:772:2: (otherlv_0= 'osi' ( (lv_condicion_1_0= ruleExpresion ) ) ( (lv_sentencias_2_0= ruleSentencia ) )* )
            // InternalLatino.g:773:3: otherlv_0= 'osi' ( (lv_condicion_1_0= ruleExpresion ) ) ( (lv_sentencias_2_0= ruleSentencia ) )*
            {
            otherlv_0=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getOsiAccess().getOsiKeyword_0());
            		
            // InternalLatino.g:777:3: ( (lv_condicion_1_0= ruleExpresion ) )
            // InternalLatino.g:778:4: (lv_condicion_1_0= ruleExpresion )
            {
            // InternalLatino.g:778:4: (lv_condicion_1_0= ruleExpresion )
            // InternalLatino.g:779:5: lv_condicion_1_0= ruleExpresion
            {

            					newCompositeNode(grammarAccess.getOsiAccess().getCondicionExpresionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_17);
            lv_condicion_1_0=ruleExpresion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOsiRule());
            					}
            					set(
            						current,
            						"condicion",
            						lv_condicion_1_0,
            						"uta.latino.Latino.Expresion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLatino.g:796:3: ( (lv_sentencias_2_0= ruleSentencia ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==18||(LA11_0>=22 && LA11_0<=23)||LA11_0==25||LA11_0==27||(LA11_0>=30 && LA11_0<=32)||(LA11_0>=39 && LA11_0<=46)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalLatino.g:797:4: (lv_sentencias_2_0= ruleSentencia )
            	    {
            	    // InternalLatino.g:797:4: (lv_sentencias_2_0= ruleSentencia )
            	    // InternalLatino.g:798:5: lv_sentencias_2_0= ruleSentencia
            	    {

            	    					newCompositeNode(grammarAccess.getOsiAccess().getSentenciasSentenciaParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_sentencias_2_0=ruleSentencia();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getOsiRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sentencias",
            	    						lv_sentencias_2_0,
            	    						"uta.latino.Latino.Sentencia");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOsi"


    // $ANTLR start "entryRuleMientras"
    // InternalLatino.g:819:1: entryRuleMientras returns [EObject current=null] : iv_ruleMientras= ruleMientras EOF ;
    public final EObject entryRuleMientras() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMientras = null;


        try {
            // InternalLatino.g:819:49: (iv_ruleMientras= ruleMientras EOF )
            // InternalLatino.g:820:2: iv_ruleMientras= ruleMientras EOF
            {
             newCompositeNode(grammarAccess.getMientrasRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMientras=ruleMientras();

            state._fsp--;

             current =iv_ruleMientras; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMientras"


    // $ANTLR start "ruleMientras"
    // InternalLatino.g:826:1: ruleMientras returns [EObject current=null] : (otherlv_0= 'mientras' ( (lv_condicion_1_0= ruleExpresion ) ) ( (lv_cuerpo_2_0= ruleSentencia ) )* otherlv_3= 'fin' ) ;
    public final EObject ruleMientras() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_condicion_1_0 = null;

        EObject lv_cuerpo_2_0 = null;



        	enterRule();

        try {
            // InternalLatino.g:832:2: ( (otherlv_0= 'mientras' ( (lv_condicion_1_0= ruleExpresion ) ) ( (lv_cuerpo_2_0= ruleSentencia ) )* otherlv_3= 'fin' ) )
            // InternalLatino.g:833:2: (otherlv_0= 'mientras' ( (lv_condicion_1_0= ruleExpresion ) ) ( (lv_cuerpo_2_0= ruleSentencia ) )* otherlv_3= 'fin' )
            {
            // InternalLatino.g:833:2: (otherlv_0= 'mientras' ( (lv_condicion_1_0= ruleExpresion ) ) ( (lv_cuerpo_2_0= ruleSentencia ) )* otherlv_3= 'fin' )
            // InternalLatino.g:834:3: otherlv_0= 'mientras' ( (lv_condicion_1_0= ruleExpresion ) ) ( (lv_cuerpo_2_0= ruleSentencia ) )* otherlv_3= 'fin'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMientrasAccess().getMientrasKeyword_0());
            		
            // InternalLatino.g:838:3: ( (lv_condicion_1_0= ruleExpresion ) )
            // InternalLatino.g:839:4: (lv_condicion_1_0= ruleExpresion )
            {
            // InternalLatino.g:839:4: (lv_condicion_1_0= ruleExpresion )
            // InternalLatino.g:840:5: lv_condicion_1_0= ruleExpresion
            {

            					newCompositeNode(grammarAccess.getMientrasAccess().getCondicionExpresionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_condicion_1_0=ruleExpresion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMientrasRule());
            					}
            					set(
            						current,
            						"condicion",
            						lv_condicion_1_0,
            						"uta.latino.Latino.Expresion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLatino.g:857:3: ( (lv_cuerpo_2_0= ruleSentencia ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||LA12_0==18||(LA12_0>=22 && LA12_0<=23)||LA12_0==25||LA12_0==27||(LA12_0>=30 && LA12_0<=32)||(LA12_0>=39 && LA12_0<=46)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalLatino.g:858:4: (lv_cuerpo_2_0= ruleSentencia )
            	    {
            	    // InternalLatino.g:858:4: (lv_cuerpo_2_0= ruleSentencia )
            	    // InternalLatino.g:859:5: lv_cuerpo_2_0= ruleSentencia
            	    {

            	    					newCompositeNode(grammarAccess.getMientrasAccess().getCuerpoSentenciaParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_cuerpo_2_0=ruleSentencia();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMientrasRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cuerpo",
            	    						lv_cuerpo_2_0,
            	    						"uta.latino.Latino.Sentencia");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getMientrasAccess().getFinKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMientras"


    // $ANTLR start "entryRuleRepetir"
    // InternalLatino.g:884:1: entryRuleRepetir returns [EObject current=null] : iv_ruleRepetir= ruleRepetir EOF ;
    public final EObject entryRuleRepetir() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepetir = null;


        try {
            // InternalLatino.g:884:48: (iv_ruleRepetir= ruleRepetir EOF )
            // InternalLatino.g:885:2: iv_ruleRepetir= ruleRepetir EOF
            {
             newCompositeNode(grammarAccess.getRepetirRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRepetir=ruleRepetir();

            state._fsp--;

             current =iv_ruleRepetir; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRepetir"


    // $ANTLR start "ruleRepetir"
    // InternalLatino.g:891:1: ruleRepetir returns [EObject current=null] : (otherlv_0= 'repetir' ( (lv_cuerpo_1_0= ruleSentencia ) )* otherlv_2= 'hasta' ( (lv_condicion_3_0= ruleExpresion ) ) ) ;
    public final EObject ruleRepetir() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_cuerpo_1_0 = null;

        AntlrDatatypeRuleToken lv_condicion_3_0 = null;



        	enterRule();

        try {
            // InternalLatino.g:897:2: ( (otherlv_0= 'repetir' ( (lv_cuerpo_1_0= ruleSentencia ) )* otherlv_2= 'hasta' ( (lv_condicion_3_0= ruleExpresion ) ) ) )
            // InternalLatino.g:898:2: (otherlv_0= 'repetir' ( (lv_cuerpo_1_0= ruleSentencia ) )* otherlv_2= 'hasta' ( (lv_condicion_3_0= ruleExpresion ) ) )
            {
            // InternalLatino.g:898:2: (otherlv_0= 'repetir' ( (lv_cuerpo_1_0= ruleSentencia ) )* otherlv_2= 'hasta' ( (lv_condicion_3_0= ruleExpresion ) ) )
            // InternalLatino.g:899:3: otherlv_0= 'repetir' ( (lv_cuerpo_1_0= ruleSentencia ) )* otherlv_2= 'hasta' ( (lv_condicion_3_0= ruleExpresion ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getRepetirAccess().getRepetirKeyword_0());
            		
            // InternalLatino.g:903:3: ( (lv_cuerpo_1_0= ruleSentencia ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||LA13_0==18||(LA13_0>=22 && LA13_0<=23)||LA13_0==25||LA13_0==27||(LA13_0>=30 && LA13_0<=32)||(LA13_0>=39 && LA13_0<=46)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalLatino.g:904:4: (lv_cuerpo_1_0= ruleSentencia )
            	    {
            	    // InternalLatino.g:904:4: (lv_cuerpo_1_0= ruleSentencia )
            	    // InternalLatino.g:905:5: lv_cuerpo_1_0= ruleSentencia
            	    {

            	    					newCompositeNode(grammarAccess.getRepetirAccess().getCuerpoSentenciaParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_cuerpo_1_0=ruleSentencia();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRepetirRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cuerpo",
            	    						lv_cuerpo_1_0,
            	    						"uta.latino.Latino.Sentencia");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_2=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getRepetirAccess().getHastaKeyword_2());
            		
            // InternalLatino.g:926:3: ( (lv_condicion_3_0= ruleExpresion ) )
            // InternalLatino.g:927:4: (lv_condicion_3_0= ruleExpresion )
            {
            // InternalLatino.g:927:4: (lv_condicion_3_0= ruleExpresion )
            // InternalLatino.g:928:5: lv_condicion_3_0= ruleExpresion
            {

            					newCompositeNode(grammarAccess.getRepetirAccess().getCondicionExpresionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_condicion_3_0=ruleExpresion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRepetirRule());
            					}
            					set(
            						current,
            						"condicion",
            						lv_condicion_3_0,
            						"uta.latino.Latino.Expresion");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRepetir"


    // $ANTLR start "entryRuleDesde"
    // InternalLatino.g:949:1: entryRuleDesde returns [EObject current=null] : iv_ruleDesde= ruleDesde EOF ;
    public final EObject entryRuleDesde() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDesde = null;


        try {
            // InternalLatino.g:949:46: (iv_ruleDesde= ruleDesde EOF )
            // InternalLatino.g:950:2: iv_ruleDesde= ruleDesde EOF
            {
             newCompositeNode(grammarAccess.getDesdeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDesde=ruleDesde();

            state._fsp--;

             current =iv_ruleDesde; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDesde"


    // $ANTLR start "ruleDesde"
    // InternalLatino.g:956:1: ruleDesde returns [EObject current=null] : (otherlv_0= 'desde' otherlv_1= '(' ( (lv_inicio_2_0= ruleAsignacion ) ) otherlv_3= ';' ( (lv_condicion_4_0= ruleExpresion ) ) otherlv_5= ';' ( ( (lv_paso_6_1= ruleAsignacion | lv_paso_6_2= ruleIncremento ) ) ) otherlv_7= ')' ( (lv_cuerpo_8_0= ruleSentencia ) )* otherlv_9= 'fin' ) ;
    public final EObject ruleDesde() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_inicio_2_0 = null;

        AntlrDatatypeRuleToken lv_condicion_4_0 = null;

        EObject lv_paso_6_1 = null;

        EObject lv_paso_6_2 = null;

        EObject lv_cuerpo_8_0 = null;



        	enterRule();

        try {
            // InternalLatino.g:962:2: ( (otherlv_0= 'desde' otherlv_1= '(' ( (lv_inicio_2_0= ruleAsignacion ) ) otherlv_3= ';' ( (lv_condicion_4_0= ruleExpresion ) ) otherlv_5= ';' ( ( (lv_paso_6_1= ruleAsignacion | lv_paso_6_2= ruleIncremento ) ) ) otherlv_7= ')' ( (lv_cuerpo_8_0= ruleSentencia ) )* otherlv_9= 'fin' ) )
            // InternalLatino.g:963:2: (otherlv_0= 'desde' otherlv_1= '(' ( (lv_inicio_2_0= ruleAsignacion ) ) otherlv_3= ';' ( (lv_condicion_4_0= ruleExpresion ) ) otherlv_5= ';' ( ( (lv_paso_6_1= ruleAsignacion | lv_paso_6_2= ruleIncremento ) ) ) otherlv_7= ')' ( (lv_cuerpo_8_0= ruleSentencia ) )* otherlv_9= 'fin' )
            {
            // InternalLatino.g:963:2: (otherlv_0= 'desde' otherlv_1= '(' ( (lv_inicio_2_0= ruleAsignacion ) ) otherlv_3= ';' ( (lv_condicion_4_0= ruleExpresion ) ) otherlv_5= ';' ( ( (lv_paso_6_1= ruleAsignacion | lv_paso_6_2= ruleIncremento ) ) ) otherlv_7= ')' ( (lv_cuerpo_8_0= ruleSentencia ) )* otherlv_9= 'fin' )
            // InternalLatino.g:964:3: otherlv_0= 'desde' otherlv_1= '(' ( (lv_inicio_2_0= ruleAsignacion ) ) otherlv_3= ';' ( (lv_condicion_4_0= ruleExpresion ) ) otherlv_5= ';' ( ( (lv_paso_6_1= ruleAsignacion | lv_paso_6_2= ruleIncremento ) ) ) otherlv_7= ')' ( (lv_cuerpo_8_0= ruleSentencia ) )* otherlv_9= 'fin'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDesdeAccess().getDesdeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getDesdeAccess().getLeftParenthesisKeyword_1());
            		
            // InternalLatino.g:972:3: ( (lv_inicio_2_0= ruleAsignacion ) )
            // InternalLatino.g:973:4: (lv_inicio_2_0= ruleAsignacion )
            {
            // InternalLatino.g:973:4: (lv_inicio_2_0= ruleAsignacion )
            // InternalLatino.g:974:5: lv_inicio_2_0= ruleAsignacion
            {

            					newCompositeNode(grammarAccess.getDesdeAccess().getInicioAsignacionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
            lv_inicio_2_0=ruleAsignacion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDesdeRule());
            					}
            					set(
            						current,
            						"inicio",
            						lv_inicio_2_0,
            						"uta.latino.Latino.Asignacion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getDesdeAccess().getSemicolonKeyword_3());
            		
            // InternalLatino.g:995:3: ( (lv_condicion_4_0= ruleExpresion ) )
            // InternalLatino.g:996:4: (lv_condicion_4_0= ruleExpresion )
            {
            // InternalLatino.g:996:4: (lv_condicion_4_0= ruleExpresion )
            // InternalLatino.g:997:5: lv_condicion_4_0= ruleExpresion
            {

            					newCompositeNode(grammarAccess.getDesdeAccess().getCondicionExpresionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_20);
            lv_condicion_4_0=ruleExpresion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDesdeRule());
            					}
            					set(
            						current,
            						"condicion",
            						lv_condicion_4_0,
            						"uta.latino.Latino.Expresion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,26,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getDesdeAccess().getSemicolonKeyword_5());
            		
            // InternalLatino.g:1018:3: ( ( (lv_paso_6_1= ruleAsignacion | lv_paso_6_2= ruleIncremento ) ) )
            // InternalLatino.g:1019:4: ( (lv_paso_6_1= ruleAsignacion | lv_paso_6_2= ruleIncremento ) )
            {
            // InternalLatino.g:1019:4: ( (lv_paso_6_1= ruleAsignacion | lv_paso_6_2= ruleIncremento ) )
            // InternalLatino.g:1020:5: (lv_paso_6_1= ruleAsignacion | lv_paso_6_2= ruleIncremento )
            {
            // InternalLatino.g:1020:5: (lv_paso_6_1= ruleAsignacion | lv_paso_6_2= ruleIncremento )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==11) ) {
                    alt14=1;
                }
                else if ( ((LA14_1>=68 && LA14_1<=69)) ) {
                    alt14=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalLatino.g:1021:6: lv_paso_6_1= ruleAsignacion
                    {

                    						newCompositeNode(grammarAccess.getDesdeAccess().getPasoAsignacionParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_paso_6_1=ruleAsignacion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDesdeRule());
                    						}
                    						set(
                    							current,
                    							"paso",
                    							lv_paso_6_1,
                    							"uta.latino.Latino.Asignacion");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalLatino.g:1037:6: lv_paso_6_2= ruleIncremento
                    {

                    						newCompositeNode(grammarAccess.getDesdeAccess().getPasoIncrementoParserRuleCall_6_0_1());
                    					
                    pushFollow(FOLLOW_9);
                    lv_paso_6_2=ruleIncremento();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDesdeRule());
                    						}
                    						set(
                    							current,
                    							"paso",
                    							lv_paso_6_2,
                    							"uta.latino.Latino.Incremento");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_16); 

            			newLeafNode(otherlv_7, grammarAccess.getDesdeAccess().getRightParenthesisKeyword_7());
            		
            // InternalLatino.g:1059:3: ( (lv_cuerpo_8_0= ruleSentencia ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||LA15_0==18||(LA15_0>=22 && LA15_0<=23)||LA15_0==25||LA15_0==27||(LA15_0>=30 && LA15_0<=32)||(LA15_0>=39 && LA15_0<=46)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalLatino.g:1060:4: (lv_cuerpo_8_0= ruleSentencia )
            	    {
            	    // InternalLatino.g:1060:4: (lv_cuerpo_8_0= ruleSentencia )
            	    // InternalLatino.g:1061:5: lv_cuerpo_8_0= ruleSentencia
            	    {

            	    					newCompositeNode(grammarAccess.getDesdeAccess().getCuerpoSentenciaParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_cuerpo_8_0=ruleSentencia();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDesdeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cuerpo",
            	    						lv_cuerpo_8_0,
            	    						"uta.latino.Latino.Sentencia");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_9=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getDesdeAccess().getFinKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDesde"


    // $ANTLR start "entryRulePara"
    // InternalLatino.g:1086:1: entryRulePara returns [EObject current=null] : iv_rulePara= rulePara EOF ;
    public final EObject entryRulePara() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePara = null;


        try {
            // InternalLatino.g:1086:45: (iv_rulePara= rulePara EOF )
            // InternalLatino.g:1087:2: iv_rulePara= rulePara EOF
            {
             newCompositeNode(grammarAccess.getParaRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePara=rulePara();

            state._fsp--;

             current =iv_rulePara; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePara"


    // $ANTLR start "rulePara"
    // InternalLatino.g:1093:1: rulePara returns [EObject current=null] : (otherlv_0= 'para' ( (lv_variable_1_0= ruleVariable ) ) otherlv_2= 'en' otherlv_3= 'rango' otherlv_4= '(' ( (lv_limites_5_0= ruleExpresion ) ) (otherlv_6= ',' ( (lv_limites_7_0= ruleExpresion ) ) (otherlv_8= ',' ( (lv_limites_9_0= ruleExpresion ) ) )? )? otherlv_10= ')' ( (lv_cuerpo_11_0= ruleSentencia ) )* otherlv_12= 'fin' ) ;
    public final EObject rulePara() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_variable_1_0 = null;

        AntlrDatatypeRuleToken lv_limites_5_0 = null;

        AntlrDatatypeRuleToken lv_limites_7_0 = null;

        AntlrDatatypeRuleToken lv_limites_9_0 = null;

        EObject lv_cuerpo_11_0 = null;



        	enterRule();

        try {
            // InternalLatino.g:1099:2: ( (otherlv_0= 'para' ( (lv_variable_1_0= ruleVariable ) ) otherlv_2= 'en' otherlv_3= 'rango' otherlv_4= '(' ( (lv_limites_5_0= ruleExpresion ) ) (otherlv_6= ',' ( (lv_limites_7_0= ruleExpresion ) ) (otherlv_8= ',' ( (lv_limites_9_0= ruleExpresion ) ) )? )? otherlv_10= ')' ( (lv_cuerpo_11_0= ruleSentencia ) )* otherlv_12= 'fin' ) )
            // InternalLatino.g:1100:2: (otherlv_0= 'para' ( (lv_variable_1_0= ruleVariable ) ) otherlv_2= 'en' otherlv_3= 'rango' otherlv_4= '(' ( (lv_limites_5_0= ruleExpresion ) ) (otherlv_6= ',' ( (lv_limites_7_0= ruleExpresion ) ) (otherlv_8= ',' ( (lv_limites_9_0= ruleExpresion ) ) )? )? otherlv_10= ')' ( (lv_cuerpo_11_0= ruleSentencia ) )* otherlv_12= 'fin' )
            {
            // InternalLatino.g:1100:2: (otherlv_0= 'para' ( (lv_variable_1_0= ruleVariable ) ) otherlv_2= 'en' otherlv_3= 'rango' otherlv_4= '(' ( (lv_limites_5_0= ruleExpresion ) ) (otherlv_6= ',' ( (lv_limites_7_0= ruleExpresion ) ) (otherlv_8= ',' ( (lv_limites_9_0= ruleExpresion ) ) )? )? otherlv_10= ')' ( (lv_cuerpo_11_0= ruleSentencia ) )* otherlv_12= 'fin' )
            // InternalLatino.g:1101:3: otherlv_0= 'para' ( (lv_variable_1_0= ruleVariable ) ) otherlv_2= 'en' otherlv_3= 'rango' otherlv_4= '(' ( (lv_limites_5_0= ruleExpresion ) ) (otherlv_6= ',' ( (lv_limites_7_0= ruleExpresion ) ) (otherlv_8= ',' ( (lv_limites_9_0= ruleExpresion ) ) )? )? otherlv_10= ')' ( (lv_cuerpo_11_0= ruleSentencia ) )* otherlv_12= 'fin'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getParaAccess().getParaKeyword_0());
            		
            // InternalLatino.g:1105:3: ( (lv_variable_1_0= ruleVariable ) )
            // InternalLatino.g:1106:4: (lv_variable_1_0= ruleVariable )
            {
            // InternalLatino.g:1106:4: (lv_variable_1_0= ruleVariable )
            // InternalLatino.g:1107:5: lv_variable_1_0= ruleVariable
            {

            					newCompositeNode(grammarAccess.getParaAccess().getVariableVariableParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_21);
            lv_variable_1_0=ruleVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParaRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_1_0,
            						"uta.latino.Latino.Variable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getParaAccess().getEnKeyword_2());
            		
            otherlv_3=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getParaAccess().getRangoKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getParaAccess().getLeftParenthesisKeyword_4());
            		
            // InternalLatino.g:1136:3: ( (lv_limites_5_0= ruleExpresion ) )
            // InternalLatino.g:1137:4: (lv_limites_5_0= ruleExpresion )
            {
            // InternalLatino.g:1137:4: (lv_limites_5_0= ruleExpresion )
            // InternalLatino.g:1138:5: lv_limites_5_0= ruleExpresion
            {

            					newCompositeNode(grammarAccess.getParaAccess().getLimitesExpresionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_23);
            lv_limites_5_0=ruleExpresion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParaRule());
            					}
            					add(
            						current,
            						"limites",
            						lv_limites_5_0,
            						"uta.latino.Latino.Expresion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLatino.g:1155:3: (otherlv_6= ',' ( (lv_limites_7_0= ruleExpresion ) ) (otherlv_8= ',' ( (lv_limites_9_0= ruleExpresion ) ) )? )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==16) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalLatino.g:1156:4: otherlv_6= ',' ( (lv_limites_7_0= ruleExpresion ) ) (otherlv_8= ',' ( (lv_limites_9_0= ruleExpresion ) ) )?
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getParaAccess().getCommaKeyword_6_0());
                    			
                    // InternalLatino.g:1160:4: ( (lv_limites_7_0= ruleExpresion ) )
                    // InternalLatino.g:1161:5: (lv_limites_7_0= ruleExpresion )
                    {
                    // InternalLatino.g:1161:5: (lv_limites_7_0= ruleExpresion )
                    // InternalLatino.g:1162:6: lv_limites_7_0= ruleExpresion
                    {

                    						newCompositeNode(grammarAccess.getParaAccess().getLimitesExpresionParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_limites_7_0=ruleExpresion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParaRule());
                    						}
                    						add(
                    							current,
                    							"limites",
                    							lv_limites_7_0,
                    							"uta.latino.Latino.Expresion");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalLatino.g:1179:4: (otherlv_8= ',' ( (lv_limites_9_0= ruleExpresion ) ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==16) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalLatino.g:1180:5: otherlv_8= ',' ( (lv_limites_9_0= ruleExpresion ) )
                            {
                            otherlv_8=(Token)match(input,16,FOLLOW_5); 

                            					newLeafNode(otherlv_8, grammarAccess.getParaAccess().getCommaKeyword_6_2_0());
                            				
                            // InternalLatino.g:1184:5: ( (lv_limites_9_0= ruleExpresion ) )
                            // InternalLatino.g:1185:6: (lv_limites_9_0= ruleExpresion )
                            {
                            // InternalLatino.g:1185:6: (lv_limites_9_0= ruleExpresion )
                            // InternalLatino.g:1186:7: lv_limites_9_0= ruleExpresion
                            {

                            							newCompositeNode(grammarAccess.getParaAccess().getLimitesExpresionParserRuleCall_6_2_1_0());
                            						
                            pushFollow(FOLLOW_9);
                            lv_limites_9_0=ruleExpresion();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getParaRule());
                            							}
                            							add(
                            								current,
                            								"limites",
                            								lv_limites_9_0,
                            								"uta.latino.Latino.Expresion");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,14,FOLLOW_16); 

            			newLeafNode(otherlv_10, grammarAccess.getParaAccess().getRightParenthesisKeyword_7());
            		
            // InternalLatino.g:1209:3: ( (lv_cuerpo_11_0= ruleSentencia ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID||LA18_0==18||(LA18_0>=22 && LA18_0<=23)||LA18_0==25||LA18_0==27||(LA18_0>=30 && LA18_0<=32)||(LA18_0>=39 && LA18_0<=46)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalLatino.g:1210:4: (lv_cuerpo_11_0= ruleSentencia )
            	    {
            	    // InternalLatino.g:1210:4: (lv_cuerpo_11_0= ruleSentencia )
            	    // InternalLatino.g:1211:5: lv_cuerpo_11_0= ruleSentencia
            	    {

            	    					newCompositeNode(grammarAccess.getParaAccess().getCuerpoSentenciaParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_cuerpo_11_0=ruleSentencia();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getParaRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cuerpo",
            	    						lv_cuerpo_11_0,
            	    						"uta.latino.Latino.Sentencia");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_12=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getParaAccess().getFinKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePara"


    // $ANTLR start "entryRuleVariable"
    // InternalLatino.g:1236:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalLatino.g:1236:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalLatino.g:1237:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalLatino.g:1243:1: ruleVariable returns [EObject current=null] : ( (lv_nombre_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_nombre_0_0=null;


        	enterRule();

        try {
            // InternalLatino.g:1249:2: ( ( (lv_nombre_0_0= RULE_ID ) ) )
            // InternalLatino.g:1250:2: ( (lv_nombre_0_0= RULE_ID ) )
            {
            // InternalLatino.g:1250:2: ( (lv_nombre_0_0= RULE_ID ) )
            // InternalLatino.g:1251:3: (lv_nombre_0_0= RULE_ID )
            {
            // InternalLatino.g:1251:3: (lv_nombre_0_0= RULE_ID )
            // InternalLatino.g:1252:4: lv_nombre_0_0= RULE_ID
            {
            lv_nombre_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_nombre_0_0, grammarAccess.getVariableAccess().getNombreIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableRule());
            				}
            				setWithLastConsumed(
            					current,
            					"nombre",
            					lv_nombre_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleIncremento"
    // InternalLatino.g:1271:1: entryRuleIncremento returns [EObject current=null] : iv_ruleIncremento= ruleIncremento EOF ;
    public final EObject entryRuleIncremento() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIncremento = null;


        try {
            // InternalLatino.g:1271:51: (iv_ruleIncremento= ruleIncremento EOF )
            // InternalLatino.g:1272:2: iv_ruleIncremento= ruleIncremento EOF
            {
             newCompositeNode(grammarAccess.getIncrementoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIncremento=ruleIncremento();

            state._fsp--;

             current =iv_ruleIncremento; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIncremento"


    // $ANTLR start "ruleIncremento"
    // InternalLatino.g:1278:1: ruleIncremento returns [EObject current=null] : ( ( (lv_nombre_0_0= RULE_ID ) ) ( (lv_operador_1_0= ruleOperadorPaso ) ) ) ;
    public final EObject ruleIncremento() throws RecognitionException {
        EObject current = null;

        Token lv_nombre_0_0=null;
        Enumerator lv_operador_1_0 = null;



        	enterRule();

        try {
            // InternalLatino.g:1284:2: ( ( ( (lv_nombre_0_0= RULE_ID ) ) ( (lv_operador_1_0= ruleOperadorPaso ) ) ) )
            // InternalLatino.g:1285:2: ( ( (lv_nombre_0_0= RULE_ID ) ) ( (lv_operador_1_0= ruleOperadorPaso ) ) )
            {
            // InternalLatino.g:1285:2: ( ( (lv_nombre_0_0= RULE_ID ) ) ( (lv_operador_1_0= ruleOperadorPaso ) ) )
            // InternalLatino.g:1286:3: ( (lv_nombre_0_0= RULE_ID ) ) ( (lv_operador_1_0= ruleOperadorPaso ) )
            {
            // InternalLatino.g:1286:3: ( (lv_nombre_0_0= RULE_ID ) )
            // InternalLatino.g:1287:4: (lv_nombre_0_0= RULE_ID )
            {
            // InternalLatino.g:1287:4: (lv_nombre_0_0= RULE_ID )
            // InternalLatino.g:1288:5: lv_nombre_0_0= RULE_ID
            {
            lv_nombre_0_0=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(lv_nombre_0_0, grammarAccess.getIncrementoAccess().getNombreIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIncrementoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nombre",
            						lv_nombre_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalLatino.g:1304:3: ( (lv_operador_1_0= ruleOperadorPaso ) )
            // InternalLatino.g:1305:4: (lv_operador_1_0= ruleOperadorPaso )
            {
            // InternalLatino.g:1305:4: (lv_operador_1_0= ruleOperadorPaso )
            // InternalLatino.g:1306:5: lv_operador_1_0= ruleOperadorPaso
            {

            					newCompositeNode(grammarAccess.getIncrementoAccess().getOperadorOperadorPasoEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_operador_1_0=ruleOperadorPaso();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIncrementoRule());
            					}
            					set(
            						current,
            						"operador",
            						lv_operador_1_0,
            						"uta.latino.Latino.OperadorPaso");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIncremento"


    // $ANTLR start "entryRuleRomper"
    // InternalLatino.g:1327:1: entryRuleRomper returns [EObject current=null] : iv_ruleRomper= ruleRomper EOF ;
    public final EObject entryRuleRomper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRomper = null;


        try {
            // InternalLatino.g:1327:47: (iv_ruleRomper= ruleRomper EOF )
            // InternalLatino.g:1328:2: iv_ruleRomper= ruleRomper EOF
            {
             newCompositeNode(grammarAccess.getRomperRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRomper=ruleRomper();

            state._fsp--;

             current =iv_ruleRomper; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRomper"


    // $ANTLR start "ruleRomper"
    // InternalLatino.g:1334:1: ruleRomper returns [EObject current=null] : ( () otherlv_1= 'romper' ) ;
    public final EObject ruleRomper() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalLatino.g:1340:2: ( ( () otherlv_1= 'romper' ) )
            // InternalLatino.g:1341:2: ( () otherlv_1= 'romper' )
            {
            // InternalLatino.g:1341:2: ( () otherlv_1= 'romper' )
            // InternalLatino.g:1342:3: () otherlv_1= 'romper'
            {
            // InternalLatino.g:1342:3: ()
            // InternalLatino.g:1343:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRomperAccess().getRomperAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getRomperAccess().getRomperKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRomper"


    // $ANTLR start "entryRuleContinuar"
    // InternalLatino.g:1357:1: entryRuleContinuar returns [EObject current=null] : iv_ruleContinuar= ruleContinuar EOF ;
    public final EObject entryRuleContinuar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContinuar = null;


        try {
            // InternalLatino.g:1357:50: (iv_ruleContinuar= ruleContinuar EOF )
            // InternalLatino.g:1358:2: iv_ruleContinuar= ruleContinuar EOF
            {
             newCompositeNode(grammarAccess.getContinuarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContinuar=ruleContinuar();

            state._fsp--;

             current =iv_ruleContinuar; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContinuar"


    // $ANTLR start "ruleContinuar"
    // InternalLatino.g:1364:1: ruleContinuar returns [EObject current=null] : ( () otherlv_1= 'continuar' ) ;
    public final EObject ruleContinuar() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalLatino.g:1370:2: ( ( () otherlv_1= 'continuar' ) )
            // InternalLatino.g:1371:2: ( () otherlv_1= 'continuar' )
            {
            // InternalLatino.g:1371:2: ( () otherlv_1= 'continuar' )
            // InternalLatino.g:1372:3: () otherlv_1= 'continuar'
            {
            // InternalLatino.g:1372:3: ()
            // InternalLatino.g:1373:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContinuarAccess().getContinuarAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getContinuarAccess().getContinuarKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContinuar"


    // $ANTLR start "entryRuleElegir"
    // InternalLatino.g:1387:1: entryRuleElegir returns [EObject current=null] : iv_ruleElegir= ruleElegir EOF ;
    public final EObject entryRuleElegir() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElegir = null;


        try {
            // InternalLatino.g:1387:47: (iv_ruleElegir= ruleElegir EOF )
            // InternalLatino.g:1388:2: iv_ruleElegir= ruleElegir EOF
            {
             newCompositeNode(grammarAccess.getElegirRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElegir=ruleElegir();

            state._fsp--;

             current =iv_ruleElegir; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElegir"


    // $ANTLR start "ruleElegir"
    // InternalLatino.g:1394:1: ruleElegir returns [EObject current=null] : (otherlv_0= 'elegir' ( (lv_expresion_1_0= ruleExpresion ) ) ( (lv_casos_2_0= ruleCaso ) )* ( (otherlv_3= 'otro' | otherlv_4= 'defecto' ) otherlv_5= ':' ( (lv_defecto_6_0= ruleSentencia ) )+ )? otherlv_7= 'fin' ) ;
    public final EObject ruleElegir() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_expresion_1_0 = null;

        EObject lv_casos_2_0 = null;

        EObject lv_defecto_6_0 = null;



        	enterRule();

        try {
            // InternalLatino.g:1400:2: ( (otherlv_0= 'elegir' ( (lv_expresion_1_0= ruleExpresion ) ) ( (lv_casos_2_0= ruleCaso ) )* ( (otherlv_3= 'otro' | otherlv_4= 'defecto' ) otherlv_5= ':' ( (lv_defecto_6_0= ruleSentencia ) )+ )? otherlv_7= 'fin' ) )
            // InternalLatino.g:1401:2: (otherlv_0= 'elegir' ( (lv_expresion_1_0= ruleExpresion ) ) ( (lv_casos_2_0= ruleCaso ) )* ( (otherlv_3= 'otro' | otherlv_4= 'defecto' ) otherlv_5= ':' ( (lv_defecto_6_0= ruleSentencia ) )+ )? otherlv_7= 'fin' )
            {
            // InternalLatino.g:1401:2: (otherlv_0= 'elegir' ( (lv_expresion_1_0= ruleExpresion ) ) ( (lv_casos_2_0= ruleCaso ) )* ( (otherlv_3= 'otro' | otherlv_4= 'defecto' ) otherlv_5= ':' ( (lv_defecto_6_0= ruleSentencia ) )+ )? otherlv_7= 'fin' )
            // InternalLatino.g:1402:3: otherlv_0= 'elegir' ( (lv_expresion_1_0= ruleExpresion ) ) ( (lv_casos_2_0= ruleCaso ) )* ( (otherlv_3= 'otro' | otherlv_4= 'defecto' ) otherlv_5= ':' ( (lv_defecto_6_0= ruleSentencia ) )+ )? otherlv_7= 'fin'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getElegirAccess().getElegirKeyword_0());
            		
            // InternalLatino.g:1406:3: ( (lv_expresion_1_0= ruleExpresion ) )
            // InternalLatino.g:1407:4: (lv_expresion_1_0= ruleExpresion )
            {
            // InternalLatino.g:1407:4: (lv_expresion_1_0= ruleExpresion )
            // InternalLatino.g:1408:5: lv_expresion_1_0= ruleExpresion
            {

            					newCompositeNode(grammarAccess.getElegirAccess().getExpresionExpresionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_25);
            lv_expresion_1_0=ruleExpresion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElegirRule());
            					}
            					set(
            						current,
            						"expresion",
            						lv_expresion_1_0,
            						"uta.latino.Latino.Expresion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLatino.g:1425:3: ( (lv_casos_2_0= ruleCaso ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==36) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalLatino.g:1426:4: (lv_casos_2_0= ruleCaso )
            	    {
            	    // InternalLatino.g:1426:4: (lv_casos_2_0= ruleCaso )
            	    // InternalLatino.g:1427:5: lv_casos_2_0= ruleCaso
            	    {

            	    					newCompositeNode(grammarAccess.getElegirAccess().getCasosCasoParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_casos_2_0=ruleCaso();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getElegirRule());
            	    					}
            	    					add(
            	    						current,
            	    						"casos",
            	    						lv_casos_2_0,
            	    						"uta.latino.Latino.Caso");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // InternalLatino.g:1444:3: ( (otherlv_3= 'otro' | otherlv_4= 'defecto' ) otherlv_5= ':' ( (lv_defecto_6_0= ruleSentencia ) )+ )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=33 && LA22_0<=34)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalLatino.g:1445:4: (otherlv_3= 'otro' | otherlv_4= 'defecto' ) otherlv_5= ':' ( (lv_defecto_6_0= ruleSentencia ) )+
                    {
                    // InternalLatino.g:1445:4: (otherlv_3= 'otro' | otherlv_4= 'defecto' )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==33) ) {
                        alt20=1;
                    }
                    else if ( (LA20_0==34) ) {
                        alt20=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalLatino.g:1446:5: otherlv_3= 'otro'
                            {
                            otherlv_3=(Token)match(input,33,FOLLOW_26); 

                            					newLeafNode(otherlv_3, grammarAccess.getElegirAccess().getOtroKeyword_3_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalLatino.g:1451:5: otherlv_4= 'defecto'
                            {
                            otherlv_4=(Token)match(input,34,FOLLOW_26); 

                            					newLeafNode(otherlv_4, grammarAccess.getElegirAccess().getDefectoKeyword_3_0_1());
                            				

                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,35,FOLLOW_27); 

                    				newLeafNode(otherlv_5, grammarAccess.getElegirAccess().getColonKeyword_3_1());
                    			
                    // InternalLatino.g:1460:4: ( (lv_defecto_6_0= ruleSentencia ) )+
                    int cnt21=0;
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==RULE_ID||LA21_0==18||(LA21_0>=22 && LA21_0<=23)||LA21_0==25||LA21_0==27||(LA21_0>=30 && LA21_0<=32)||(LA21_0>=39 && LA21_0<=46)) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalLatino.g:1461:5: (lv_defecto_6_0= ruleSentencia )
                    	    {
                    	    // InternalLatino.g:1461:5: (lv_defecto_6_0= ruleSentencia )
                    	    // InternalLatino.g:1462:6: lv_defecto_6_0= ruleSentencia
                    	    {

                    	    						newCompositeNode(grammarAccess.getElegirAccess().getDefectoSentenciaParserRuleCall_3_2_0());
                    	    					
                    	    pushFollow(FOLLOW_16);
                    	    lv_defecto_6_0=ruleSentencia();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getElegirRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"defecto",
                    	    							lv_defecto_6_0,
                    	    							"uta.latino.Latino.Sentencia");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt21 >= 1 ) break loop21;
                                EarlyExitException eee =
                                    new EarlyExitException(21, input);
                                throw eee;
                        }
                        cnt21++;
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getElegirAccess().getFinKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElegir"


    // $ANTLR start "entryRuleCaso"
    // InternalLatino.g:1488:1: entryRuleCaso returns [EObject current=null] : iv_ruleCaso= ruleCaso EOF ;
    public final EObject entryRuleCaso() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaso = null;


        try {
            // InternalLatino.g:1488:45: (iv_ruleCaso= ruleCaso EOF )
            // InternalLatino.g:1489:2: iv_ruleCaso= ruleCaso EOF
            {
             newCompositeNode(grammarAccess.getCasoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCaso=ruleCaso();

            state._fsp--;

             current =iv_ruleCaso; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCaso"


    // $ANTLR start "ruleCaso"
    // InternalLatino.g:1495:1: ruleCaso returns [EObject current=null] : (otherlv_0= 'caso' ( (lv_valores_1_0= ruleConstante ) ) otherlv_2= ':' (otherlv_3= 'caso' ( (lv_valores_4_0= ruleConstante ) ) otherlv_5= ':' )* ( (lv_sentencias_6_0= ruleSentencia ) )+ ) ;
    public final EObject ruleCaso() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_valores_1_0 = null;

        AntlrDatatypeRuleToken lv_valores_4_0 = null;

        EObject lv_sentencias_6_0 = null;



        	enterRule();

        try {
            // InternalLatino.g:1501:2: ( (otherlv_0= 'caso' ( (lv_valores_1_0= ruleConstante ) ) otherlv_2= ':' (otherlv_3= 'caso' ( (lv_valores_4_0= ruleConstante ) ) otherlv_5= ':' )* ( (lv_sentencias_6_0= ruleSentencia ) )+ ) )
            // InternalLatino.g:1502:2: (otherlv_0= 'caso' ( (lv_valores_1_0= ruleConstante ) ) otherlv_2= ':' (otherlv_3= 'caso' ( (lv_valores_4_0= ruleConstante ) ) otherlv_5= ':' )* ( (lv_sentencias_6_0= ruleSentencia ) )+ )
            {
            // InternalLatino.g:1502:2: (otherlv_0= 'caso' ( (lv_valores_1_0= ruleConstante ) ) otherlv_2= ':' (otherlv_3= 'caso' ( (lv_valores_4_0= ruleConstante ) ) otherlv_5= ':' )* ( (lv_sentencias_6_0= ruleSentencia ) )+ )
            // InternalLatino.g:1503:3: otherlv_0= 'caso' ( (lv_valores_1_0= ruleConstante ) ) otherlv_2= ':' (otherlv_3= 'caso' ( (lv_valores_4_0= ruleConstante ) ) otherlv_5= ':' )* ( (lv_sentencias_6_0= ruleSentencia ) )+
            {
            otherlv_0=(Token)match(input,36,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getCasoAccess().getCasoKeyword_0());
            		
            // InternalLatino.g:1507:3: ( (lv_valores_1_0= ruleConstante ) )
            // InternalLatino.g:1508:4: (lv_valores_1_0= ruleConstante )
            {
            // InternalLatino.g:1508:4: (lv_valores_1_0= ruleConstante )
            // InternalLatino.g:1509:5: lv_valores_1_0= ruleConstante
            {

            					newCompositeNode(grammarAccess.getCasoAccess().getValoresConstanteParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_26);
            lv_valores_1_0=ruleConstante();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCasoRule());
            					}
            					add(
            						current,
            						"valores",
            						lv_valores_1_0,
            						"uta.latino.Latino.Constante");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getCasoAccess().getColonKeyword_2());
            		
            // InternalLatino.g:1530:3: (otherlv_3= 'caso' ( (lv_valores_4_0= ruleConstante ) ) otherlv_5= ':' )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==36) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalLatino.g:1531:4: otherlv_3= 'caso' ( (lv_valores_4_0= ruleConstante ) ) otherlv_5= ':'
            	    {
            	    otherlv_3=(Token)match(input,36,FOLLOW_28); 

            	    				newLeafNode(otherlv_3, grammarAccess.getCasoAccess().getCasoKeyword_3_0());
            	    			
            	    // InternalLatino.g:1535:4: ( (lv_valores_4_0= ruleConstante ) )
            	    // InternalLatino.g:1536:5: (lv_valores_4_0= ruleConstante )
            	    {
            	    // InternalLatino.g:1536:5: (lv_valores_4_0= ruleConstante )
            	    // InternalLatino.g:1537:6: lv_valores_4_0= ruleConstante
            	    {

            	    						newCompositeNode(grammarAccess.getCasoAccess().getValoresConstanteParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_valores_4_0=ruleConstante();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCasoRule());
            	    						}
            	    						add(
            	    							current,
            	    							"valores",
            	    							lv_valores_4_0,
            	    							"uta.latino.Latino.Constante");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_5=(Token)match(input,35,FOLLOW_29); 

            	    				newLeafNode(otherlv_5, grammarAccess.getCasoAccess().getColonKeyword_3_2());
            	    			

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            // InternalLatino.g:1559:3: ( (lv_sentencias_6_0= ruleSentencia ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_ID||LA24_0==18||(LA24_0>=22 && LA24_0<=23)||LA24_0==25||LA24_0==27||(LA24_0>=30 && LA24_0<=32)||(LA24_0>=39 && LA24_0<=46)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalLatino.g:1560:4: (lv_sentencias_6_0= ruleSentencia )
            	    {
            	    // InternalLatino.g:1560:4: (lv_sentencias_6_0= ruleSentencia )
            	    // InternalLatino.g:1561:5: lv_sentencias_6_0= ruleSentencia
            	    {

            	    					newCompositeNode(grammarAccess.getCasoAccess().getSentenciasSentenciaParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_sentencias_6_0=ruleSentencia();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCasoRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sentencias",
            	    						lv_sentencias_6_0,
            	    						"uta.latino.Latino.Sentencia");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCaso"


    // $ANTLR start "entryRuleConstante"
    // InternalLatino.g:1582:1: entryRuleConstante returns [String current=null] : iv_ruleConstante= ruleConstante EOF ;
    public final String entryRuleConstante() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstante = null;


        try {
            // InternalLatino.g:1582:49: (iv_ruleConstante= ruleConstante EOF )
            // InternalLatino.g:1583:2: iv_ruleConstante= ruleConstante EOF
            {
             newCompositeNode(grammarAccess.getConstanteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstante=ruleConstante();

            state._fsp--;

             current =iv_ruleConstante.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstante"


    // $ANTLR start "ruleConstante"
    // InternalLatino.g:1589:1: ruleConstante returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Numero_0= ruleNumero | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleConstante() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_1=null;
        AntlrDatatypeRuleToken this_Numero_0 = null;



        	enterRule();

        try {
            // InternalLatino.g:1595:2: ( (this_Numero_0= ruleNumero | this_STRING_1= RULE_STRING ) )
            // InternalLatino.g:1596:2: (this_Numero_0= ruleNumero | this_STRING_1= RULE_STRING )
            {
            // InternalLatino.g:1596:2: (this_Numero_0= ruleNumero | this_STRING_1= RULE_STRING )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_INT) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_STRING) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalLatino.g:1597:3: this_Numero_0= ruleNumero
                    {

                    			newCompositeNode(grammarAccess.getConstanteAccess().getNumeroParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Numero_0=ruleNumero();

                    state._fsp--;


                    			current.merge(this_Numero_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLatino.g:1608:3: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_1);
                    		

                    			newLeafNode(this_STRING_1, grammarAccess.getConstanteAccess().getSTRINGTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstante"


    // $ANTLR start "entryRuleFuncion"
    // InternalLatino.g:1619:1: entryRuleFuncion returns [EObject current=null] : iv_ruleFuncion= ruleFuncion EOF ;
    public final EObject entryRuleFuncion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncion = null;


        try {
            // InternalLatino.g:1619:48: (iv_ruleFuncion= ruleFuncion EOF )
            // InternalLatino.g:1620:2: iv_ruleFuncion= ruleFuncion EOF
            {
             newCompositeNode(grammarAccess.getFuncionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFuncion=ruleFuncion();

            state._fsp--;

             current =iv_ruleFuncion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFuncion"


    // $ANTLR start "ruleFuncion"
    // InternalLatino.g:1626:1: ruleFuncion returns [EObject current=null] : ( (otherlv_0= 'funcion' | otherlv_1= 'fun' ) ( (lv_nombre_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parametros_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_parametros_6_0= ruleVariable ) ) )* )? otherlv_7= ')' ( (lv_cuerpo_8_0= ruleSentencia ) )* otherlv_9= 'fin' ) ;
    public final EObject ruleFuncion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_nombre_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_parametros_4_0 = null;

        EObject lv_parametros_6_0 = null;

        EObject lv_cuerpo_8_0 = null;



        	enterRule();

        try {
            // InternalLatino.g:1632:2: ( ( (otherlv_0= 'funcion' | otherlv_1= 'fun' ) ( (lv_nombre_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parametros_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_parametros_6_0= ruleVariable ) ) )* )? otherlv_7= ')' ( (lv_cuerpo_8_0= ruleSentencia ) )* otherlv_9= 'fin' ) )
            // InternalLatino.g:1633:2: ( (otherlv_0= 'funcion' | otherlv_1= 'fun' ) ( (lv_nombre_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parametros_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_parametros_6_0= ruleVariable ) ) )* )? otherlv_7= ')' ( (lv_cuerpo_8_0= ruleSentencia ) )* otherlv_9= 'fin' )
            {
            // InternalLatino.g:1633:2: ( (otherlv_0= 'funcion' | otherlv_1= 'fun' ) ( (lv_nombre_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parametros_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_parametros_6_0= ruleVariable ) ) )* )? otherlv_7= ')' ( (lv_cuerpo_8_0= ruleSentencia ) )* otherlv_9= 'fin' )
            // InternalLatino.g:1634:3: (otherlv_0= 'funcion' | otherlv_1= 'fun' ) ( (lv_nombre_2_0= RULE_ID ) ) otherlv_3= '(' ( ( (lv_parametros_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_parametros_6_0= ruleVariable ) ) )* )? otherlv_7= ')' ( (lv_cuerpo_8_0= ruleSentencia ) )* otherlv_9= 'fin'
            {
            // InternalLatino.g:1634:3: (otherlv_0= 'funcion' | otherlv_1= 'fun' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==37) ) {
                alt26=1;
            }
            else if ( (LA26_0==38) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalLatino.g:1635:4: otherlv_0= 'funcion'
                    {
                    otherlv_0=(Token)match(input,37,FOLLOW_19); 

                    				newLeafNode(otherlv_0, grammarAccess.getFuncionAccess().getFuncionKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalLatino.g:1640:4: otherlv_1= 'fun'
                    {
                    otherlv_1=(Token)match(input,38,FOLLOW_19); 

                    				newLeafNode(otherlv_1, grammarAccess.getFuncionAccess().getFunKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalLatino.g:1645:3: ( (lv_nombre_2_0= RULE_ID ) )
            // InternalLatino.g:1646:4: (lv_nombre_2_0= RULE_ID )
            {
            // InternalLatino.g:1646:4: (lv_nombre_2_0= RULE_ID )
            // InternalLatino.g:1647:5: lv_nombre_2_0= RULE_ID
            {
            lv_nombre_2_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_nombre_2_0, grammarAccess.getFuncionAccess().getNombreIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFuncionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nombre",
            						lv_nombre_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_3, grammarAccess.getFuncionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalLatino.g:1667:3: ( ( (lv_parametros_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_parametros_6_0= ruleVariable ) ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalLatino.g:1668:4: ( (lv_parametros_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_parametros_6_0= ruleVariable ) ) )*
                    {
                    // InternalLatino.g:1668:4: ( (lv_parametros_4_0= ruleVariable ) )
                    // InternalLatino.g:1669:5: (lv_parametros_4_0= ruleVariable )
                    {
                    // InternalLatino.g:1669:5: (lv_parametros_4_0= ruleVariable )
                    // InternalLatino.g:1670:6: lv_parametros_4_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getFuncionAccess().getParametrosVariableParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_parametros_4_0=ruleVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFuncionRule());
                    						}
                    						add(
                    							current,
                    							"parametros",
                    							lv_parametros_4_0,
                    							"uta.latino.Latino.Variable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalLatino.g:1687:4: (otherlv_5= ',' ( (lv_parametros_6_0= ruleVariable ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==16) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalLatino.g:1688:5: otherlv_5= ',' ( (lv_parametros_6_0= ruleVariable ) )
                    	    {
                    	    otherlv_5=(Token)match(input,16,FOLLOW_19); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getFuncionAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalLatino.g:1692:5: ( (lv_parametros_6_0= ruleVariable ) )
                    	    // InternalLatino.g:1693:6: (lv_parametros_6_0= ruleVariable )
                    	    {
                    	    // InternalLatino.g:1693:6: (lv_parametros_6_0= ruleVariable )
                    	    // InternalLatino.g:1694:7: lv_parametros_6_0= ruleVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getFuncionAccess().getParametrosVariableParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    lv_parametros_6_0=ruleVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFuncionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parametros",
                    	    								lv_parametros_6_0,
                    	    								"uta.latino.Latino.Variable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FOLLOW_16); 

            			newLeafNode(otherlv_7, grammarAccess.getFuncionAccess().getRightParenthesisKeyword_4());
            		
            // InternalLatino.g:1717:3: ( (lv_cuerpo_8_0= ruleSentencia ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID||LA29_0==18||(LA29_0>=22 && LA29_0<=23)||LA29_0==25||LA29_0==27||(LA29_0>=30 && LA29_0<=32)||(LA29_0>=39 && LA29_0<=46)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalLatino.g:1718:4: (lv_cuerpo_8_0= ruleSentencia )
            	    {
            	    // InternalLatino.g:1718:4: (lv_cuerpo_8_0= ruleSentencia )
            	    // InternalLatino.g:1719:5: lv_cuerpo_8_0= ruleSentencia
            	    {

            	    					newCompositeNode(grammarAccess.getFuncionAccess().getCuerpoSentenciaParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_cuerpo_8_0=ruleSentencia();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFuncionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cuerpo",
            	    						lv_cuerpo_8_0,
            	    						"uta.latino.Latino.Sentencia");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_9=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getFuncionAccess().getFinKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFuncion"


    // $ANTLR start "entryRuleRetorno"
    // InternalLatino.g:1744:1: entryRuleRetorno returns [EObject current=null] : iv_ruleRetorno= ruleRetorno EOF ;
    public final EObject entryRuleRetorno() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRetorno = null;


        try {
            // InternalLatino.g:1744:48: (iv_ruleRetorno= ruleRetorno EOF )
            // InternalLatino.g:1745:2: iv_ruleRetorno= ruleRetorno EOF
            {
             newCompositeNode(grammarAccess.getRetornoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRetorno=ruleRetorno();

            state._fsp--;

             current =iv_ruleRetorno; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRetorno"


    // $ANTLR start "ruleRetorno"
    // InternalLatino.g:1751:1: ruleRetorno returns [EObject current=null] : ( (otherlv_0= 'retorno' | otherlv_1= 'retornar' | otherlv_2= 'regresar' | otherlv_3= 'devolver' | otherlv_4= 'ret' ) ( (lv_valor_5_0= ruleExpresion ) ) ) ;
    public final EObject ruleRetorno() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_valor_5_0 = null;



        	enterRule();

        try {
            // InternalLatino.g:1757:2: ( ( (otherlv_0= 'retorno' | otherlv_1= 'retornar' | otherlv_2= 'regresar' | otherlv_3= 'devolver' | otherlv_4= 'ret' ) ( (lv_valor_5_0= ruleExpresion ) ) ) )
            // InternalLatino.g:1758:2: ( (otherlv_0= 'retorno' | otherlv_1= 'retornar' | otherlv_2= 'regresar' | otherlv_3= 'devolver' | otherlv_4= 'ret' ) ( (lv_valor_5_0= ruleExpresion ) ) )
            {
            // InternalLatino.g:1758:2: ( (otherlv_0= 'retorno' | otherlv_1= 'retornar' | otherlv_2= 'regresar' | otherlv_3= 'devolver' | otherlv_4= 'ret' ) ( (lv_valor_5_0= ruleExpresion ) ) )
            // InternalLatino.g:1759:3: (otherlv_0= 'retorno' | otherlv_1= 'retornar' | otherlv_2= 'regresar' | otherlv_3= 'devolver' | otherlv_4= 'ret' ) ( (lv_valor_5_0= ruleExpresion ) )
            {
            // InternalLatino.g:1759:3: (otherlv_0= 'retorno' | otherlv_1= 'retornar' | otherlv_2= 'regresar' | otherlv_3= 'devolver' | otherlv_4= 'ret' )
            int alt30=5;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt30=1;
                }
                break;
            case 40:
                {
                alt30=2;
                }
                break;
            case 41:
                {
                alt30=3;
                }
                break;
            case 42:
                {
                alt30=4;
                }
                break;
            case 43:
                {
                alt30=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalLatino.g:1760:4: otherlv_0= 'retorno'
                    {
                    otherlv_0=(Token)match(input,39,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getRetornoAccess().getRetornoKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalLatino.g:1765:4: otherlv_1= 'retornar'
                    {
                    otherlv_1=(Token)match(input,40,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getRetornoAccess().getRetornarKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalLatino.g:1770:4: otherlv_2= 'regresar'
                    {
                    otherlv_2=(Token)match(input,41,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getRetornoAccess().getRegresarKeyword_0_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalLatino.g:1775:4: otherlv_3= 'devolver'
                    {
                    otherlv_3=(Token)match(input,42,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getRetornoAccess().getDevolverKeyword_0_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalLatino.g:1780:4: otherlv_4= 'ret'
                    {
                    otherlv_4=(Token)match(input,43,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRetornoAccess().getRetKeyword_0_4());
                    			

                    }
                    break;

            }

            // InternalLatino.g:1785:3: ( (lv_valor_5_0= ruleExpresion ) )
            // InternalLatino.g:1786:4: (lv_valor_5_0= ruleExpresion )
            {
            // InternalLatino.g:1786:4: (lv_valor_5_0= ruleExpresion )
            // InternalLatino.g:1787:5: lv_valor_5_0= ruleExpresion
            {

            					newCompositeNode(grammarAccess.getRetornoAccess().getValorExpresionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_valor_5_0=ruleExpresion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRetornoRule());
            					}
            					set(
            						current,
            						"valor",
            						lv_valor_5_0,
            						"uta.latino.Latino.Expresion");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRetorno"


    // $ANTLR start "entryRuleLlamada"
    // InternalLatino.g:1808:1: entryRuleLlamada returns [EObject current=null] : iv_ruleLlamada= ruleLlamada EOF ;
    public final EObject entryRuleLlamada() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLlamada = null;


        try {
            // InternalLatino.g:1808:48: (iv_ruleLlamada= ruleLlamada EOF )
            // InternalLatino.g:1809:2: iv_ruleLlamada= ruleLlamada EOF
            {
             newCompositeNode(grammarAccess.getLlamadaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLlamada=ruleLlamada();

            state._fsp--;

             current =iv_ruleLlamada; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLlamada"


    // $ANTLR start "ruleLlamada"
    // InternalLatino.g:1815:1: ruleLlamada returns [EObject current=null] : ( ( (lv_funcion_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_argumentos_2_0= ruleExpresion ) ) (otherlv_3= ',' ( (lv_argumentos_4_0= ruleExpresion ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleLlamada() throws RecognitionException {
        EObject current = null;

        Token lv_funcion_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_argumentos_2_0 = null;

        AntlrDatatypeRuleToken lv_argumentos_4_0 = null;



        	enterRule();

        try {
            // InternalLatino.g:1821:2: ( ( ( (lv_funcion_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_argumentos_2_0= ruleExpresion ) ) (otherlv_3= ',' ( (lv_argumentos_4_0= ruleExpresion ) ) )* )? otherlv_5= ')' ) )
            // InternalLatino.g:1822:2: ( ( (lv_funcion_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_argumentos_2_0= ruleExpresion ) ) (otherlv_3= ',' ( (lv_argumentos_4_0= ruleExpresion ) ) )* )? otherlv_5= ')' )
            {
            // InternalLatino.g:1822:2: ( ( (lv_funcion_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_argumentos_2_0= ruleExpresion ) ) (otherlv_3= ',' ( (lv_argumentos_4_0= ruleExpresion ) ) )* )? otherlv_5= ')' )
            // InternalLatino.g:1823:3: ( (lv_funcion_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_argumentos_2_0= ruleExpresion ) ) (otherlv_3= ',' ( (lv_argumentos_4_0= ruleExpresion ) ) )* )? otherlv_5= ')'
            {
            // InternalLatino.g:1823:3: ( (lv_funcion_0_0= RULE_ID ) )
            // InternalLatino.g:1824:4: (lv_funcion_0_0= RULE_ID )
            {
            // InternalLatino.g:1824:4: (lv_funcion_0_0= RULE_ID )
            // InternalLatino.g:1825:5: lv_funcion_0_0= RULE_ID
            {
            lv_funcion_0_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_funcion_0_0, grammarAccess.getLlamadaAccess().getFuncionIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLlamadaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"funcion",
            						lv_funcion_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getLlamadaAccess().getLeftParenthesisKeyword_1());
            		
            // InternalLatino.g:1845:3: ( ( (lv_argumentos_2_0= ruleExpresion ) ) (otherlv_3= ',' ( (lv_argumentos_4_0= ruleExpresion ) ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=RULE_ID && LA32_0<=RULE_INT)||LA32_0==12||LA32_0==57||(LA32_0>=61 && LA32_0<=64)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalLatino.g:1846:4: ( (lv_argumentos_2_0= ruleExpresion ) ) (otherlv_3= ',' ( (lv_argumentos_4_0= ruleExpresion ) ) )*
                    {
                    // InternalLatino.g:1846:4: ( (lv_argumentos_2_0= ruleExpresion ) )
                    // InternalLatino.g:1847:5: (lv_argumentos_2_0= ruleExpresion )
                    {
                    // InternalLatino.g:1847:5: (lv_argumentos_2_0= ruleExpresion )
                    // InternalLatino.g:1848:6: lv_argumentos_2_0= ruleExpresion
                    {

                    						newCompositeNode(grammarAccess.getLlamadaAccess().getArgumentosExpresionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_argumentos_2_0=ruleExpresion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLlamadaRule());
                    						}
                    						add(
                    							current,
                    							"argumentos",
                    							lv_argumentos_2_0,
                    							"uta.latino.Latino.Expresion");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalLatino.g:1865:4: (otherlv_3= ',' ( (lv_argumentos_4_0= ruleExpresion ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==16) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalLatino.g:1866:5: otherlv_3= ',' ( (lv_argumentos_4_0= ruleExpresion ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FOLLOW_5); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getLlamadaAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalLatino.g:1870:5: ( (lv_argumentos_4_0= ruleExpresion ) )
                    	    // InternalLatino.g:1871:6: (lv_argumentos_4_0= ruleExpresion )
                    	    {
                    	    // InternalLatino.g:1871:6: (lv_argumentos_4_0= ruleExpresion )
                    	    // InternalLatino.g:1872:7: lv_argumentos_4_0= ruleExpresion
                    	    {

                    	    							newCompositeNode(grammarAccess.getLlamadaAccess().getArgumentosExpresionParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    lv_argumentos_4_0=ruleExpresion();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getLlamadaRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"argumentos",
                    	    								lv_argumentos_4_0,
                    	    								"uta.latino.Latino.Expresion");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getLlamadaAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLlamada"


    // $ANTLR start "entryRuleImprimir"
    // InternalLatino.g:1899:1: entryRuleImprimir returns [EObject current=null] : iv_ruleImprimir= ruleImprimir EOF ;
    public final EObject entryRuleImprimir() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImprimir = null;


        try {
            // InternalLatino.g:1899:49: (iv_ruleImprimir= ruleImprimir EOF )
            // InternalLatino.g:1900:2: iv_ruleImprimir= ruleImprimir EOF
            {
             newCompositeNode(grammarAccess.getImprimirRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImprimir=ruleImprimir();

            state._fsp--;

             current =iv_ruleImprimir; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImprimir"


    // $ANTLR start "ruleImprimir"
    // InternalLatino.g:1906:1: ruleImprimir returns [EObject current=null] : ( (otherlv_0= 'escribir' | otherlv_1= 'imprimir' | otherlv_2= 'poner' ) otherlv_3= '(' ( (lv_mensaje_4_0= ruleExpresion ) ) otherlv_5= ')' ) ;
    public final EObject ruleImprimir() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_mensaje_4_0 = null;



        	enterRule();

        try {
            // InternalLatino.g:1912:2: ( ( (otherlv_0= 'escribir' | otherlv_1= 'imprimir' | otherlv_2= 'poner' ) otherlv_3= '(' ( (lv_mensaje_4_0= ruleExpresion ) ) otherlv_5= ')' ) )
            // InternalLatino.g:1913:2: ( (otherlv_0= 'escribir' | otherlv_1= 'imprimir' | otherlv_2= 'poner' ) otherlv_3= '(' ( (lv_mensaje_4_0= ruleExpresion ) ) otherlv_5= ')' )
            {
            // InternalLatino.g:1913:2: ( (otherlv_0= 'escribir' | otherlv_1= 'imprimir' | otherlv_2= 'poner' ) otherlv_3= '(' ( (lv_mensaje_4_0= ruleExpresion ) ) otherlv_5= ')' )
            // InternalLatino.g:1914:3: (otherlv_0= 'escribir' | otherlv_1= 'imprimir' | otherlv_2= 'poner' ) otherlv_3= '(' ( (lv_mensaje_4_0= ruleExpresion ) ) otherlv_5= ')'
            {
            // InternalLatino.g:1914:3: (otherlv_0= 'escribir' | otherlv_1= 'imprimir' | otherlv_2= 'poner' )
            int alt33=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt33=1;
                }
                break;
            case 45:
                {
                alt33=2;
                }
                break;
            case 46:
                {
                alt33=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalLatino.g:1915:4: otherlv_0= 'escribir'
                    {
                    otherlv_0=(Token)match(input,44,FOLLOW_7); 

                    				newLeafNode(otherlv_0, grammarAccess.getImprimirAccess().getEscribirKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalLatino.g:1920:4: otherlv_1= 'imprimir'
                    {
                    otherlv_1=(Token)match(input,45,FOLLOW_7); 

                    				newLeafNode(otherlv_1, grammarAccess.getImprimirAccess().getImprimirKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalLatino.g:1925:4: otherlv_2= 'poner'
                    {
                    otherlv_2=(Token)match(input,46,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getImprimirAccess().getPonerKeyword_0_2());
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getImprimirAccess().getLeftParenthesisKeyword_1());
            		
            // InternalLatino.g:1934:3: ( (lv_mensaje_4_0= ruleExpresion ) )
            // InternalLatino.g:1935:4: (lv_mensaje_4_0= ruleExpresion )
            {
            // InternalLatino.g:1935:4: (lv_mensaje_4_0= ruleExpresion )
            // InternalLatino.g:1936:5: lv_mensaje_4_0= ruleExpresion
            {

            					newCompositeNode(grammarAccess.getImprimirAccess().getMensajeExpresionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_mensaje_4_0=ruleExpresion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImprimirRule());
            					}
            					set(
            						current,
            						"mensaje",
            						lv_mensaje_4_0,
            						"uta.latino.Latino.Expresion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getImprimirAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImprimir"


    // $ANTLR start "entryRuleExpresion"
    // InternalLatino.g:1961:1: entryRuleExpresion returns [String current=null] : iv_ruleExpresion= ruleExpresion EOF ;
    public final String entryRuleExpresion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpresion = null;


        try {
            // InternalLatino.g:1961:49: (iv_ruleExpresion= ruleExpresion EOF )
            // InternalLatino.g:1962:2: iv_ruleExpresion= ruleExpresion EOF
            {
             newCompositeNode(grammarAccess.getExpresionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpresion=ruleExpresion();

            state._fsp--;

             current =iv_ruleExpresion.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpresion"


    // $ANTLR start "ruleExpresion"
    // InternalLatino.g:1968:1: ruleExpresion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Conjuncion_0= ruleConjuncion (kw= '||' this_Conjuncion_2= ruleConjuncion )* ) ;
    public final AntlrDatatypeRuleToken ruleExpresion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Conjuncion_0 = null;

        AntlrDatatypeRuleToken this_Conjuncion_2 = null;



        	enterRule();

        try {
            // InternalLatino.g:1974:2: ( (this_Conjuncion_0= ruleConjuncion (kw= '||' this_Conjuncion_2= ruleConjuncion )* ) )
            // InternalLatino.g:1975:2: (this_Conjuncion_0= ruleConjuncion (kw= '||' this_Conjuncion_2= ruleConjuncion )* )
            {
            // InternalLatino.g:1975:2: (this_Conjuncion_0= ruleConjuncion (kw= '||' this_Conjuncion_2= ruleConjuncion )* )
            // InternalLatino.g:1976:3: this_Conjuncion_0= ruleConjuncion (kw= '||' this_Conjuncion_2= ruleConjuncion )*
            {

            			newCompositeNode(grammarAccess.getExpresionAccess().getConjuncionParserRuleCall_0());
            		
            pushFollow(FOLLOW_32);
            this_Conjuncion_0=ruleConjuncion();

            state._fsp--;


            			current.merge(this_Conjuncion_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalLatino.g:1986:3: (kw= '||' this_Conjuncion_2= ruleConjuncion )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==47) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalLatino.g:1987:4: kw= '||' this_Conjuncion_2= ruleConjuncion
            	    {
            	    kw=(Token)match(input,47,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getExpresionAccess().getVerticalLineVerticalLineKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getExpresionAccess().getConjuncionParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_32);
            	    this_Conjuncion_2=ruleConjuncion();

            	    state._fsp--;


            	    				current.merge(this_Conjuncion_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpresion"


    // $ANTLR start "entryRuleConjuncion"
    // InternalLatino.g:2007:1: entryRuleConjuncion returns [String current=null] : iv_ruleConjuncion= ruleConjuncion EOF ;
    public final String entryRuleConjuncion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConjuncion = null;


        try {
            // InternalLatino.g:2007:50: (iv_ruleConjuncion= ruleConjuncion EOF )
            // InternalLatino.g:2008:2: iv_ruleConjuncion= ruleConjuncion EOF
            {
             newCompositeNode(grammarAccess.getConjuncionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConjuncion=ruleConjuncion();

            state._fsp--;

             current =iv_ruleConjuncion.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConjuncion"


    // $ANTLR start "ruleConjuncion"
    // InternalLatino.g:2014:1: ruleConjuncion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Comparacion_0= ruleComparacion (kw= '&&' this_Comparacion_2= ruleComparacion )* ) ;
    public final AntlrDatatypeRuleToken ruleConjuncion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Comparacion_0 = null;

        AntlrDatatypeRuleToken this_Comparacion_2 = null;



        	enterRule();

        try {
            // InternalLatino.g:2020:2: ( (this_Comparacion_0= ruleComparacion (kw= '&&' this_Comparacion_2= ruleComparacion )* ) )
            // InternalLatino.g:2021:2: (this_Comparacion_0= ruleComparacion (kw= '&&' this_Comparacion_2= ruleComparacion )* )
            {
            // InternalLatino.g:2021:2: (this_Comparacion_0= ruleComparacion (kw= '&&' this_Comparacion_2= ruleComparacion )* )
            // InternalLatino.g:2022:3: this_Comparacion_0= ruleComparacion (kw= '&&' this_Comparacion_2= ruleComparacion )*
            {

            			newCompositeNode(grammarAccess.getConjuncionAccess().getComparacionParserRuleCall_0());
            		
            pushFollow(FOLLOW_33);
            this_Comparacion_0=ruleComparacion();

            state._fsp--;


            			current.merge(this_Comparacion_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalLatino.g:2032:3: (kw= '&&' this_Comparacion_2= ruleComparacion )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==48) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalLatino.g:2033:4: kw= '&&' this_Comparacion_2= ruleComparacion
            	    {
            	    kw=(Token)match(input,48,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getConjuncionAccess().getAmpersandAmpersandKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getConjuncionAccess().getComparacionParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_33);
            	    this_Comparacion_2=ruleComparacion();

            	    state._fsp--;


            	    				current.merge(this_Comparacion_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConjuncion"


    // $ANTLR start "entryRuleComparacion"
    // InternalLatino.g:2053:1: entryRuleComparacion returns [String current=null] : iv_ruleComparacion= ruleComparacion EOF ;
    public final String entryRuleComparacion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComparacion = null;


        try {
            // InternalLatino.g:2053:51: (iv_ruleComparacion= ruleComparacion EOF )
            // InternalLatino.g:2054:2: iv_ruleComparacion= ruleComparacion EOF
            {
             newCompositeNode(grammarAccess.getComparacionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparacion=ruleComparacion();

            state._fsp--;

             current =iv_ruleComparacion.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparacion"


    // $ANTLR start "ruleComparacion"
    // InternalLatino.g:2060:1: ruleComparacion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Concatenacion_0= ruleConcatenacion ( (kw= '==' | kw= '!=' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' ) this_Concatenacion_7= ruleConcatenacion )? ) ;
    public final AntlrDatatypeRuleToken ruleComparacion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Concatenacion_0 = null;

        AntlrDatatypeRuleToken this_Concatenacion_7 = null;



        	enterRule();

        try {
            // InternalLatino.g:2066:2: ( (this_Concatenacion_0= ruleConcatenacion ( (kw= '==' | kw= '!=' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' ) this_Concatenacion_7= ruleConcatenacion )? ) )
            // InternalLatino.g:2067:2: (this_Concatenacion_0= ruleConcatenacion ( (kw= '==' | kw= '!=' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' ) this_Concatenacion_7= ruleConcatenacion )? )
            {
            // InternalLatino.g:2067:2: (this_Concatenacion_0= ruleConcatenacion ( (kw= '==' | kw= '!=' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' ) this_Concatenacion_7= ruleConcatenacion )? )
            // InternalLatino.g:2068:3: this_Concatenacion_0= ruleConcatenacion ( (kw= '==' | kw= '!=' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' ) this_Concatenacion_7= ruleConcatenacion )?
            {

            			newCompositeNode(grammarAccess.getComparacionAccess().getConcatenacionParserRuleCall_0());
            		
            pushFollow(FOLLOW_34);
            this_Concatenacion_0=ruleConcatenacion();

            state._fsp--;


            			current.merge(this_Concatenacion_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalLatino.g:2078:3: ( (kw= '==' | kw= '!=' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' ) this_Concatenacion_7= ruleConcatenacion )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=49 && LA37_0<=54)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalLatino.g:2079:4: (kw= '==' | kw= '!=' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' ) this_Concatenacion_7= ruleConcatenacion
                    {
                    // InternalLatino.g:2079:4: (kw= '==' | kw= '!=' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' )
                    int alt36=6;
                    switch ( input.LA(1) ) {
                    case 49:
                        {
                        alt36=1;
                        }
                        break;
                    case 50:
                        {
                        alt36=2;
                        }
                        break;
                    case 51:
                        {
                        alt36=3;
                        }
                        break;
                    case 52:
                        {
                        alt36=4;
                        }
                        break;
                    case 53:
                        {
                        alt36=5;
                        }
                        break;
                    case 54:
                        {
                        alt36=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 0, input);

                        throw nvae;
                    }

                    switch (alt36) {
                        case 1 :
                            // InternalLatino.g:2080:5: kw= '=='
                            {
                            kw=(Token)match(input,49,FOLLOW_5); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getComparacionAccess().getEqualsSignEqualsSignKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalLatino.g:2086:5: kw= '!='
                            {
                            kw=(Token)match(input,50,FOLLOW_5); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getComparacionAccess().getExclamationMarkEqualsSignKeyword_1_0_1());
                            				

                            }
                            break;
                        case 3 :
                            // InternalLatino.g:2092:5: kw= '<'
                            {
                            kw=(Token)match(input,51,FOLLOW_5); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getComparacionAccess().getLessThanSignKeyword_1_0_2());
                            				

                            }
                            break;
                        case 4 :
                            // InternalLatino.g:2098:5: kw= '<='
                            {
                            kw=(Token)match(input,52,FOLLOW_5); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getComparacionAccess().getLessThanSignEqualsSignKeyword_1_0_3());
                            				

                            }
                            break;
                        case 5 :
                            // InternalLatino.g:2104:5: kw= '>'
                            {
                            kw=(Token)match(input,53,FOLLOW_5); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getComparacionAccess().getGreaterThanSignKeyword_1_0_4());
                            				

                            }
                            break;
                        case 6 :
                            // InternalLatino.g:2110:5: kw= '>='
                            {
                            kw=(Token)match(input,54,FOLLOW_5); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getComparacionAccess().getGreaterThanSignEqualsSignKeyword_1_0_5());
                            				

                            }
                            break;

                    }


                    				newCompositeNode(grammarAccess.getComparacionAccess().getConcatenacionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_Concatenacion_7=ruleConcatenacion();

                    state._fsp--;


                    				current.merge(this_Concatenacion_7);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparacion"


    // $ANTLR start "entryRuleConcatenacion"
    // InternalLatino.g:2131:1: entryRuleConcatenacion returns [String current=null] : iv_ruleConcatenacion= ruleConcatenacion EOF ;
    public final String entryRuleConcatenacion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConcatenacion = null;


        try {
            // InternalLatino.g:2131:53: (iv_ruleConcatenacion= ruleConcatenacion EOF )
            // InternalLatino.g:2132:2: iv_ruleConcatenacion= ruleConcatenacion EOF
            {
             newCompositeNode(grammarAccess.getConcatenacionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConcatenacion=ruleConcatenacion();

            state._fsp--;

             current =iv_ruleConcatenacion.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConcatenacion"


    // $ANTLR start "ruleConcatenacion"
    // InternalLatino.g:2138:1: ruleConcatenacion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Suma_0= ruleSuma (kw= '..' this_Suma_2= ruleSuma )* ) ;
    public final AntlrDatatypeRuleToken ruleConcatenacion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Suma_0 = null;

        AntlrDatatypeRuleToken this_Suma_2 = null;



        	enterRule();

        try {
            // InternalLatino.g:2144:2: ( (this_Suma_0= ruleSuma (kw= '..' this_Suma_2= ruleSuma )* ) )
            // InternalLatino.g:2145:2: (this_Suma_0= ruleSuma (kw= '..' this_Suma_2= ruleSuma )* )
            {
            // InternalLatino.g:2145:2: (this_Suma_0= ruleSuma (kw= '..' this_Suma_2= ruleSuma )* )
            // InternalLatino.g:2146:3: this_Suma_0= ruleSuma (kw= '..' this_Suma_2= ruleSuma )*
            {

            			newCompositeNode(grammarAccess.getConcatenacionAccess().getSumaParserRuleCall_0());
            		
            pushFollow(FOLLOW_35);
            this_Suma_0=ruleSuma();

            state._fsp--;


            			current.merge(this_Suma_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalLatino.g:2156:3: (kw= '..' this_Suma_2= ruleSuma )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==55) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalLatino.g:2157:4: kw= '..' this_Suma_2= ruleSuma
            	    {
            	    kw=(Token)match(input,55,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getConcatenacionAccess().getFullStopFullStopKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getConcatenacionAccess().getSumaParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_35);
            	    this_Suma_2=ruleSuma();

            	    state._fsp--;


            	    				current.merge(this_Suma_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConcatenacion"


    // $ANTLR start "entryRuleSuma"
    // InternalLatino.g:2177:1: entryRuleSuma returns [String current=null] : iv_ruleSuma= ruleSuma EOF ;
    public final String entryRuleSuma() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSuma = null;


        try {
            // InternalLatino.g:2177:44: (iv_ruleSuma= ruleSuma EOF )
            // InternalLatino.g:2178:2: iv_ruleSuma= ruleSuma EOF
            {
             newCompositeNode(grammarAccess.getSumaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSuma=ruleSuma();

            state._fsp--;

             current =iv_ruleSuma.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSuma"


    // $ANTLR start "ruleSuma"
    // InternalLatino.g:2184:1: ruleSuma returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Producto_0= ruleProducto ( (kw= '+' | kw= '-' ) this_Producto_3= ruleProducto )* ) ;
    public final AntlrDatatypeRuleToken ruleSuma() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Producto_0 = null;

        AntlrDatatypeRuleToken this_Producto_3 = null;



        	enterRule();

        try {
            // InternalLatino.g:2190:2: ( (this_Producto_0= ruleProducto ( (kw= '+' | kw= '-' ) this_Producto_3= ruleProducto )* ) )
            // InternalLatino.g:2191:2: (this_Producto_0= ruleProducto ( (kw= '+' | kw= '-' ) this_Producto_3= ruleProducto )* )
            {
            // InternalLatino.g:2191:2: (this_Producto_0= ruleProducto ( (kw= '+' | kw= '-' ) this_Producto_3= ruleProducto )* )
            // InternalLatino.g:2192:3: this_Producto_0= ruleProducto ( (kw= '+' | kw= '-' ) this_Producto_3= ruleProducto )*
            {

            			newCompositeNode(grammarAccess.getSumaAccess().getProductoParserRuleCall_0());
            		
            pushFollow(FOLLOW_36);
            this_Producto_0=ruleProducto();

            state._fsp--;


            			current.merge(this_Producto_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalLatino.g:2202:3: ( (kw= '+' | kw= '-' ) this_Producto_3= ruleProducto )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=56 && LA40_0<=57)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalLatino.g:2203:4: (kw= '+' | kw= '-' ) this_Producto_3= ruleProducto
            	    {
            	    // InternalLatino.g:2203:4: (kw= '+' | kw= '-' )
            	    int alt39=2;
            	    int LA39_0 = input.LA(1);

            	    if ( (LA39_0==56) ) {
            	        alt39=1;
            	    }
            	    else if ( (LA39_0==57) ) {
            	        alt39=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 39, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt39) {
            	        case 1 :
            	            // InternalLatino.g:2204:5: kw= '+'
            	            {
            	            kw=(Token)match(input,56,FOLLOW_5); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getSumaAccess().getPlusSignKeyword_1_0_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalLatino.g:2210:5: kw= '-'
            	            {
            	            kw=(Token)match(input,57,FOLLOW_5); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getSumaAccess().getHyphenMinusKeyword_1_0_1());
            	            				

            	            }
            	            break;

            	    }


            	    				newCompositeNode(grammarAccess.getSumaAccess().getProductoParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_36);
            	    this_Producto_3=ruleProducto();

            	    state._fsp--;


            	    				current.merge(this_Producto_3);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSuma"


    // $ANTLR start "entryRuleProducto"
    // InternalLatino.g:2231:1: entryRuleProducto returns [String current=null] : iv_ruleProducto= ruleProducto EOF ;
    public final String entryRuleProducto() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProducto = null;


        try {
            // InternalLatino.g:2231:48: (iv_ruleProducto= ruleProducto EOF )
            // InternalLatino.g:2232:2: iv_ruleProducto= ruleProducto EOF
            {
             newCompositeNode(grammarAccess.getProductoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProducto=ruleProducto();

            state._fsp--;

             current =iv_ruleProducto.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProducto"


    // $ANTLR start "ruleProducto"
    // InternalLatino.g:2238:1: ruleProducto returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Unario_0= ruleUnario ( (kw= '*' | kw= '/' | kw= '%' ) this_Unario_4= ruleUnario )* ) ;
    public final AntlrDatatypeRuleToken ruleProducto() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Unario_0 = null;

        AntlrDatatypeRuleToken this_Unario_4 = null;



        	enterRule();

        try {
            // InternalLatino.g:2244:2: ( (this_Unario_0= ruleUnario ( (kw= '*' | kw= '/' | kw= '%' ) this_Unario_4= ruleUnario )* ) )
            // InternalLatino.g:2245:2: (this_Unario_0= ruleUnario ( (kw= '*' | kw= '/' | kw= '%' ) this_Unario_4= ruleUnario )* )
            {
            // InternalLatino.g:2245:2: (this_Unario_0= ruleUnario ( (kw= '*' | kw= '/' | kw= '%' ) this_Unario_4= ruleUnario )* )
            // InternalLatino.g:2246:3: this_Unario_0= ruleUnario ( (kw= '*' | kw= '/' | kw= '%' ) this_Unario_4= ruleUnario )*
            {

            			newCompositeNode(grammarAccess.getProductoAccess().getUnarioParserRuleCall_0());
            		
            pushFollow(FOLLOW_37);
            this_Unario_0=ruleUnario();

            state._fsp--;


            			current.merge(this_Unario_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalLatino.g:2256:3: ( (kw= '*' | kw= '/' | kw= '%' ) this_Unario_4= ruleUnario )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=58 && LA42_0<=60)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalLatino.g:2257:4: (kw= '*' | kw= '/' | kw= '%' ) this_Unario_4= ruleUnario
            	    {
            	    // InternalLatino.g:2257:4: (kw= '*' | kw= '/' | kw= '%' )
            	    int alt41=3;
            	    switch ( input.LA(1) ) {
            	    case 58:
            	        {
            	        alt41=1;
            	        }
            	        break;
            	    case 59:
            	        {
            	        alt41=2;
            	        }
            	        break;
            	    case 60:
            	        {
            	        alt41=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 41, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt41) {
            	        case 1 :
            	            // InternalLatino.g:2258:5: kw= '*'
            	            {
            	            kw=(Token)match(input,58,FOLLOW_5); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getProductoAccess().getAsteriskKeyword_1_0_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalLatino.g:2264:5: kw= '/'
            	            {
            	            kw=(Token)match(input,59,FOLLOW_5); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getProductoAccess().getSolidusKeyword_1_0_1());
            	            				

            	            }
            	            break;
            	        case 3 :
            	            // InternalLatino.g:2270:5: kw= '%'
            	            {
            	            kw=(Token)match(input,60,FOLLOW_5); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getProductoAccess().getPercentSignKeyword_1_0_2());
            	            				

            	            }
            	            break;

            	    }


            	    				newCompositeNode(grammarAccess.getProductoAccess().getUnarioParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_37);
            	    this_Unario_4=ruleUnario();

            	    state._fsp--;


            	    				current.merge(this_Unario_4);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProducto"


    // $ANTLR start "entryRuleUnario"
    // InternalLatino.g:2291:1: entryRuleUnario returns [String current=null] : iv_ruleUnario= ruleUnario EOF ;
    public final String entryRuleUnario() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnario = null;


        try {
            // InternalLatino.g:2291:46: (iv_ruleUnario= ruleUnario EOF )
            // InternalLatino.g:2292:2: iv_ruleUnario= ruleUnario EOF
            {
             newCompositeNode(grammarAccess.getUnarioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnario=ruleUnario();

            state._fsp--;

             current =iv_ruleUnario.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnario"


    // $ANTLR start "ruleUnario"
    // InternalLatino.g:2298:1: ruleUnario returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '!' this_Unario_1= ruleUnario ) | (kw= '-' this_Unario_3= ruleUnario ) | this_Primario_4= rulePrimario ) ;
    public final AntlrDatatypeRuleToken ruleUnario() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Unario_1 = null;

        AntlrDatatypeRuleToken this_Unario_3 = null;

        AntlrDatatypeRuleToken this_Primario_4 = null;



        	enterRule();

        try {
            // InternalLatino.g:2304:2: ( ( (kw= '!' this_Unario_1= ruleUnario ) | (kw= '-' this_Unario_3= ruleUnario ) | this_Primario_4= rulePrimario ) )
            // InternalLatino.g:2305:2: ( (kw= '!' this_Unario_1= ruleUnario ) | (kw= '-' this_Unario_3= ruleUnario ) | this_Primario_4= rulePrimario )
            {
            // InternalLatino.g:2305:2: ( (kw= '!' this_Unario_1= ruleUnario ) | (kw= '-' this_Unario_3= ruleUnario ) | this_Primario_4= rulePrimario )
            int alt43=3;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt43=1;
                }
                break;
            case 57:
                {
                alt43=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case 12:
            case 62:
            case 63:
            case 64:
                {
                alt43=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalLatino.g:2306:3: (kw= '!' this_Unario_1= ruleUnario )
                    {
                    // InternalLatino.g:2306:3: (kw= '!' this_Unario_1= ruleUnario )
                    // InternalLatino.g:2307:4: kw= '!' this_Unario_1= ruleUnario
                    {
                    kw=(Token)match(input,61,FOLLOW_5); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getUnarioAccess().getExclamationMarkKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getUnarioAccess().getUnarioParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_Unario_1=ruleUnario();

                    state._fsp--;


                    				current.merge(this_Unario_1);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLatino.g:2324:3: (kw= '-' this_Unario_3= ruleUnario )
                    {
                    // InternalLatino.g:2324:3: (kw= '-' this_Unario_3= ruleUnario )
                    // InternalLatino.g:2325:4: kw= '-' this_Unario_3= ruleUnario
                    {
                    kw=(Token)match(input,57,FOLLOW_5); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getUnarioAccess().getHyphenMinusKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getUnarioAccess().getUnarioParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_Unario_3=ruleUnario();

                    state._fsp--;


                    				current.merge(this_Unario_3);
                    			

                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalLatino.g:2342:3: this_Primario_4= rulePrimario
                    {

                    			newCompositeNode(grammarAccess.getUnarioAccess().getPrimarioParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Primario_4=rulePrimario();

                    state._fsp--;


                    			current.merge(this_Primario_4);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnario"


    // $ANTLR start "entryRulePrimario"
    // InternalLatino.g:2356:1: entryRulePrimario returns [String current=null] : iv_rulePrimario= rulePrimario EOF ;
    public final String entryRulePrimario() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimario = null;


        try {
            // InternalLatino.g:2356:48: (iv_rulePrimario= rulePrimario EOF )
            // InternalLatino.g:2357:2: iv_rulePrimario= rulePrimario EOF
            {
             newCompositeNode(grammarAccess.getPrimarioRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimario=rulePrimario();

            state._fsp--;

             current =iv_rulePrimario.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimario"


    // $ANTLR start "rulePrimario"
    // InternalLatino.g:2363:1: rulePrimario returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID ( (kw= '[' this_Expresion_2= ruleExpresion kw= ']' ) | (kw= '(' (this_Expresion_5= ruleExpresion (kw= ',' this_Expresion_7= ruleExpresion )* )? kw= ')' ) )? ) | this_STRING_9= RULE_STRING | this_Numero_10= ruleNumero | kw= 'verdadero' | kw= 'cierto' | kw= 'falso' | (kw= '(' this_Expresion_15= ruleExpresion kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken rulePrimario() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_STRING_9=null;
        AntlrDatatypeRuleToken this_Expresion_2 = null;

        AntlrDatatypeRuleToken this_Expresion_5 = null;

        AntlrDatatypeRuleToken this_Expresion_7 = null;

        AntlrDatatypeRuleToken this_Numero_10 = null;

        AntlrDatatypeRuleToken this_Expresion_15 = null;



        	enterRule();

        try {
            // InternalLatino.g:2369:2: ( ( (this_ID_0= RULE_ID ( (kw= '[' this_Expresion_2= ruleExpresion kw= ']' ) | (kw= '(' (this_Expresion_5= ruleExpresion (kw= ',' this_Expresion_7= ruleExpresion )* )? kw= ')' ) )? ) | this_STRING_9= RULE_STRING | this_Numero_10= ruleNumero | kw= 'verdadero' | kw= 'cierto' | kw= 'falso' | (kw= '(' this_Expresion_15= ruleExpresion kw= ')' ) ) )
            // InternalLatino.g:2370:2: ( (this_ID_0= RULE_ID ( (kw= '[' this_Expresion_2= ruleExpresion kw= ']' ) | (kw= '(' (this_Expresion_5= ruleExpresion (kw= ',' this_Expresion_7= ruleExpresion )* )? kw= ')' ) )? ) | this_STRING_9= RULE_STRING | this_Numero_10= ruleNumero | kw= 'verdadero' | kw= 'cierto' | kw= 'falso' | (kw= '(' this_Expresion_15= ruleExpresion kw= ')' ) )
            {
            // InternalLatino.g:2370:2: ( (this_ID_0= RULE_ID ( (kw= '[' this_Expresion_2= ruleExpresion kw= ']' ) | (kw= '(' (this_Expresion_5= ruleExpresion (kw= ',' this_Expresion_7= ruleExpresion )* )? kw= ')' ) )? ) | this_STRING_9= RULE_STRING | this_Numero_10= ruleNumero | kw= 'verdadero' | kw= 'cierto' | kw= 'falso' | (kw= '(' this_Expresion_15= ruleExpresion kw= ')' ) )
            int alt47=7;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt47=1;
                }
                break;
            case RULE_STRING:
                {
                alt47=2;
                }
                break;
            case RULE_INT:
                {
                alt47=3;
                }
                break;
            case 62:
                {
                alt47=4;
                }
                break;
            case 63:
                {
                alt47=5;
                }
                break;
            case 64:
                {
                alt47=6;
                }
                break;
            case 12:
                {
                alt47=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalLatino.g:2371:3: (this_ID_0= RULE_ID ( (kw= '[' this_Expresion_2= ruleExpresion kw= ']' ) | (kw= '(' (this_Expresion_5= ruleExpresion (kw= ',' this_Expresion_7= ruleExpresion )* )? kw= ')' ) )? )
                    {
                    // InternalLatino.g:2371:3: (this_ID_0= RULE_ID ( (kw= '[' this_Expresion_2= ruleExpresion kw= ']' ) | (kw= '(' (this_Expresion_5= ruleExpresion (kw= ',' this_Expresion_7= ruleExpresion )* )? kw= ')' ) )? )
                    // InternalLatino.g:2372:4: this_ID_0= RULE_ID ( (kw= '[' this_Expresion_2= ruleExpresion kw= ']' ) | (kw= '(' (this_Expresion_5= ruleExpresion (kw= ',' this_Expresion_7= ruleExpresion )* )? kw= ')' ) )?
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_38); 

                    				current.merge(this_ID_0);
                    			

                    				newLeafNode(this_ID_0, grammarAccess.getPrimarioAccess().getIDTerminalRuleCall_0_0());
                    			
                    // InternalLatino.g:2379:4: ( (kw= '[' this_Expresion_2= ruleExpresion kw= ']' ) | (kw= '(' (this_Expresion_5= ruleExpresion (kw= ',' this_Expresion_7= ruleExpresion )* )? kw= ')' ) )?
                    int alt46=3;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==15) ) {
                        alt46=1;
                    }
                    else if ( (LA46_0==12) ) {
                        alt46=2;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalLatino.g:2380:5: (kw= '[' this_Expresion_2= ruleExpresion kw= ']' )
                            {
                            // InternalLatino.g:2380:5: (kw= '[' this_Expresion_2= ruleExpresion kw= ']' )
                            // InternalLatino.g:2381:6: kw= '[' this_Expresion_2= ruleExpresion kw= ']'
                            {
                            kw=(Token)match(input,15,FOLLOW_5); 

                            						current.merge(kw);
                            						newLeafNode(kw, grammarAccess.getPrimarioAccess().getLeftSquareBracketKeyword_0_1_0_0());
                            					

                            						newCompositeNode(grammarAccess.getPrimarioAccess().getExpresionParserRuleCall_0_1_0_1());
                            					
                            pushFollow(FOLLOW_13);
                            this_Expresion_2=ruleExpresion();

                            state._fsp--;


                            						current.merge(this_Expresion_2);
                            					

                            						afterParserOrEnumRuleCall();
                            					
                            kw=(Token)match(input,17,FOLLOW_2); 

                            						current.merge(kw);
                            						newLeafNode(kw, grammarAccess.getPrimarioAccess().getRightSquareBracketKeyword_0_1_0_2());
                            					

                            }


                            }
                            break;
                        case 2 :
                            // InternalLatino.g:2403:5: (kw= '(' (this_Expresion_5= ruleExpresion (kw= ',' this_Expresion_7= ruleExpresion )* )? kw= ')' )
                            {
                            // InternalLatino.g:2403:5: (kw= '(' (this_Expresion_5= ruleExpresion (kw= ',' this_Expresion_7= ruleExpresion )* )? kw= ')' )
                            // InternalLatino.g:2404:6: kw= '(' (this_Expresion_5= ruleExpresion (kw= ',' this_Expresion_7= ruleExpresion )* )? kw= ')'
                            {
                            kw=(Token)match(input,12,FOLLOW_31); 

                            						current.merge(kw);
                            						newLeafNode(kw, grammarAccess.getPrimarioAccess().getLeftParenthesisKeyword_0_1_1_0());
                            					
                            // InternalLatino.g:2409:6: (this_Expresion_5= ruleExpresion (kw= ',' this_Expresion_7= ruleExpresion )* )?
                            int alt45=2;
                            int LA45_0 = input.LA(1);

                            if ( ((LA45_0>=RULE_ID && LA45_0<=RULE_INT)||LA45_0==12||LA45_0==57||(LA45_0>=61 && LA45_0<=64)) ) {
                                alt45=1;
                            }
                            switch (alt45) {
                                case 1 :
                                    // InternalLatino.g:2410:7: this_Expresion_5= ruleExpresion (kw= ',' this_Expresion_7= ruleExpresion )*
                                    {

                                    							newCompositeNode(grammarAccess.getPrimarioAccess().getExpresionParserRuleCall_0_1_1_1_0());
                                    						
                                    pushFollow(FOLLOW_23);
                                    this_Expresion_5=ruleExpresion();

                                    state._fsp--;


                                    							current.merge(this_Expresion_5);
                                    						

                                    							afterParserOrEnumRuleCall();
                                    						
                                    // InternalLatino.g:2420:7: (kw= ',' this_Expresion_7= ruleExpresion )*
                                    loop44:
                                    do {
                                        int alt44=2;
                                        int LA44_0 = input.LA(1);

                                        if ( (LA44_0==16) ) {
                                            alt44=1;
                                        }


                                        switch (alt44) {
                                    	case 1 :
                                    	    // InternalLatino.g:2421:8: kw= ',' this_Expresion_7= ruleExpresion
                                    	    {
                                    	    kw=(Token)match(input,16,FOLLOW_5); 

                                    	    								current.merge(kw);
                                    	    								newLeafNode(kw, grammarAccess.getPrimarioAccess().getCommaKeyword_0_1_1_1_1_0());
                                    	    							

                                    	    								newCompositeNode(grammarAccess.getPrimarioAccess().getExpresionParserRuleCall_0_1_1_1_1_1());
                                    	    							
                                    	    pushFollow(FOLLOW_23);
                                    	    this_Expresion_7=ruleExpresion();

                                    	    state._fsp--;


                                    	    								current.merge(this_Expresion_7);
                                    	    							

                                    	    								afterParserOrEnumRuleCall();
                                    	    							

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop44;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }

                            kw=(Token)match(input,14,FOLLOW_2); 

                            						current.merge(kw);
                            						newLeafNode(kw, grammarAccess.getPrimarioAccess().getRightParenthesisKeyword_0_1_1_2());
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLatino.g:2447:3: this_STRING_9= RULE_STRING
                    {
                    this_STRING_9=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_9);
                    		

                    			newLeafNode(this_STRING_9, grammarAccess.getPrimarioAccess().getSTRINGTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalLatino.g:2455:3: this_Numero_10= ruleNumero
                    {

                    			newCompositeNode(grammarAccess.getPrimarioAccess().getNumeroParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Numero_10=ruleNumero();

                    state._fsp--;


                    			current.merge(this_Numero_10);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalLatino.g:2466:3: kw= 'verdadero'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimarioAccess().getVerdaderoKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalLatino.g:2472:3: kw= 'cierto'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimarioAccess().getCiertoKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalLatino.g:2478:3: kw= 'falso'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrimarioAccess().getFalsoKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalLatino.g:2484:3: (kw= '(' this_Expresion_15= ruleExpresion kw= ')' )
                    {
                    // InternalLatino.g:2484:3: (kw= '(' this_Expresion_15= ruleExpresion kw= ')' )
                    // InternalLatino.g:2485:4: kw= '(' this_Expresion_15= ruleExpresion kw= ')'
                    {
                    kw=(Token)match(input,12,FOLLOW_5); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getPrimarioAccess().getLeftParenthesisKeyword_6_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimarioAccess().getExpresionParserRuleCall_6_1());
                    			
                    pushFollow(FOLLOW_9);
                    this_Expresion_15=ruleExpresion();

                    state._fsp--;


                    				current.merge(this_Expresion_15);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,14,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getPrimarioAccess().getRightParenthesisKeyword_6_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimario"


    // $ANTLR start "entryRuleNumero"
    // InternalLatino.g:2510:1: entryRuleNumero returns [String current=null] : iv_ruleNumero= ruleNumero EOF ;
    public final String entryRuleNumero() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumero = null;


        try {
            // InternalLatino.g:2510:46: (iv_ruleNumero= ruleNumero EOF )
            // InternalLatino.g:2511:2: iv_ruleNumero= ruleNumero EOF
            {
             newCompositeNode(grammarAccess.getNumeroRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumero=ruleNumero();

            state._fsp--;

             current =iv_ruleNumero.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumero"


    // $ANTLR start "ruleNumero"
    // InternalLatino.g:2517:1: ruleNumero returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleNumero() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalLatino.g:2523:2: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // InternalLatino.g:2524:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // InternalLatino.g:2524:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // InternalLatino.g:2525:3: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_39); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getNumeroAccess().getINTTerminalRuleCall_0());
            		
            // InternalLatino.g:2532:3: (kw= '.' this_INT_2= RULE_INT )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==65) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalLatino.g:2533:4: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,65,FOLLOW_40); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getNumeroAccess().getFullStopKeyword_1_0());
                    			
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_2);
                    			

                    				newLeafNode(this_INT_2, grammarAccess.getNumeroAccess().getINTTerminalRuleCall_1_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumero"


    // $ANTLR start "ruleConversion"
    // InternalLatino.g:2550:1: ruleConversion returns [Enumerator current=null] : ( (enumLiteral_0= 'anumero' ) | (enumLiteral_1= 'acadena' ) ) ;
    public final Enumerator ruleConversion() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalLatino.g:2556:2: ( ( (enumLiteral_0= 'anumero' ) | (enumLiteral_1= 'acadena' ) ) )
            // InternalLatino.g:2557:2: ( (enumLiteral_0= 'anumero' ) | (enumLiteral_1= 'acadena' ) )
            {
            // InternalLatino.g:2557:2: ( (enumLiteral_0= 'anumero' ) | (enumLiteral_1= 'acadena' ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==66) ) {
                alt49=1;
            }
            else if ( (LA49_0==67) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalLatino.g:2558:3: (enumLiteral_0= 'anumero' )
                    {
                    // InternalLatino.g:2558:3: (enumLiteral_0= 'anumero' )
                    // InternalLatino.g:2559:4: enumLiteral_0= 'anumero'
                    {
                    enumLiteral_0=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getConversionAccess().getNUMEROEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getConversionAccess().getNUMEROEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLatino.g:2566:3: (enumLiteral_1= 'acadena' )
                    {
                    // InternalLatino.g:2566:3: (enumLiteral_1= 'acadena' )
                    // InternalLatino.g:2567:4: enumLiteral_1= 'acadena'
                    {
                    enumLiteral_1=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getConversionAccess().getTEXTOEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getConversionAccess().getTEXTOEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConversion"


    // $ANTLR start "ruleOperadorPaso"
    // InternalLatino.g:2577:1: ruleOperadorPaso returns [Enumerator current=null] : ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) ;
    public final Enumerator ruleOperadorPaso() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalLatino.g:2583:2: ( ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) ) )
            // InternalLatino.g:2584:2: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            {
            // InternalLatino.g:2584:2: ( (enumLiteral_0= '++' ) | (enumLiteral_1= '--' ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==68) ) {
                alt50=1;
            }
            else if ( (LA50_0==69) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalLatino.g:2585:3: (enumLiteral_0= '++' )
                    {
                    // InternalLatino.g:2585:3: (enumLiteral_0= '++' )
                    // InternalLatino.g:2586:4: enumLiteral_0= '++'
                    {
                    enumLiteral_0=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getOperadorPasoAccess().getMASEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOperadorPasoAccess().getMASEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLatino.g:2593:3: (enumLiteral_1= '--' )
                    {
                    // InternalLatino.g:2593:3: (enumLiteral_1= '--' )
                    // InternalLatino.g:2594:4: enumLiteral_1= '--'
                    {
                    enumLiteral_1=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getOperadorPasoAccess().getMENOSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOperadorPasoAccess().getMENOSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperadorPaso"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\23\uffff";
    static final String dfa_2s = "\1\4\1\13\12\uffff\1\4\6\uffff";
    static final String dfa_3s = "\1\56\1\105\12\uffff\1\103\6\uffff";
    static final String dfa_4s = "\2\uffff\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\uffff\1\4\1\5\1\20\1\1\1\3\1\2";
    static final String dfa_5s = "\23\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\15\uffff\1\2\3\uffff\1\4\1\5\1\uffff\1\6\1\uffff\1\7\2\uffff\1\10\1\11\1\12\6\uffff\5\13\3\3",
            "\1\14\1\17\2\uffff\1\15\64\uffff\2\16",
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
            "\3\20\5\uffff\1\20\1\22\1\uffff\1\21\51\uffff\1\20\3\uffff\4\20\1\uffff\2\22",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "160:2: (this_Asignacion_0= ruleAsignacion | this_Leer_1= ruleLeer | this_Lista_2= ruleLista | this_AsignacionIndice_3= ruleAsignacionIndice | this_Incremento_4= ruleIncremento | this_Condicional_5= ruleCondicional | this_Imprimir_6= ruleImprimir | this_Mientras_7= ruleMientras | this_Repetir_8= ruleRepetir | this_Desde_9= ruleDesde | this_Para_10= rulePara | this_Romper_11= ruleRomper | this_Continuar_12= ruleContinuar | this_Elegir_13= ruleElegir | this_Retorno_14= ruleRetorno | this_Llamada_15= ruleLlamada )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00007FE1CAC40012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0xE200000000001070L,0x0000000000000001L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L,0x000000000000000CL});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0xE200000000021070L,0x0000000000000001L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00007F81CAFC0010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00007F81CAD40010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00007F81CAC40012L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00007F81CBC40010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001600100000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00007F81CAC40010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00007F91CAC40010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0xE200000000005070L,0x0000000000000001L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x007E000000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0300000000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x1C00000000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000009002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000040L});

}