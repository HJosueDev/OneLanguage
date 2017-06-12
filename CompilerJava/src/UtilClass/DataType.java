/*
 *TIPO DE DATOS EN C++
 */

package UtilClass;

/**
 *
 * @author Henrry
 */
public class DataType {
    DataType(){
        
    }
    
    //TIPOS DE DATOS ENTEROS
    public static String INCLUDE="#include";
    public static String IOSTREAM="#include <iostream>";
    
    public static String INCLUDE_STD="using namespace std";
    
    public static String SHORT="short";
    public static String LONG="long";
    public static String CHAR="char";
    
    //TIPOS DE DATOS REALES
    public static String FLOAT="float";
    public static String DOUBLE="double";
    
    //TIPO DE DATOS LOGICO
    public static String BOOL="bool";
    
    //simbolos especiales
    public static String INSTANCIAR="::";
    public static String OPEN_KEY="{";
    public static String CLOSED_KEY="}";
    public static String LESS_THAN="<";
    public static String GREATER_THAN=">";
    public static String S_PLUS="+";
    public static String S_MINUS="-";
    public static String S_BY="*";
    public static String S_BETWEEN="/";
    public static String S_BETWEEN_M="\\";
    
    String[] wordC={"cout","cin","println","printf"};
    
    public String[] getWordC(){
        return this.wordC;
    }
    
    
}
