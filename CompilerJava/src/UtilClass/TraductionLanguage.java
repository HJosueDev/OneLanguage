/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UtilClass;

/**
 *
 * @author Developer
 */
public class TraductionLanguage {
    DataType dataType=new DataType();
    
    private String content="";
    public void TraductionLanguage(){
        
    }
    
    public void TraductionLanguage(String content){
        if (!content.isEmpty()) {
            this.content=content;
        }
        setTraduction(this.content);
        
        
    }
    
    public void setTraduction(String textArea){
        String code = textArea;
        String contentArray[] = code.split(";");
        for (int i = 0; i < contentArray.length; i++) {
            //comparationDataLine(contentArray[i]);
            //String codeLine=
            String contentLine[]=contentArray[i].split("\"");
            for(int a=0; a<contentArray[i].length(); a++){
                if (true) {
                    
                }
            }
        }
    }
    
    public String comparationDataLine(String data){
        String cadena=data;
        
        //String cadenaOrdenada[]=new String[cadena.length()];
        String cadenaOrdenada="";
        
        
        String caracter="";
        String operadores="";
        
        for (int i = 0; i <cadena.length(); i++) {
            if (cadena.charAt(i)==' ') {
                if (cadena.charAt(i)!='>' && 
                    cadena.charAt(i)!='<' && 
                    cadena.charAt(i)!='+' &&
                    cadena.charAt(i)!='-' &&
                    cadena.charAt(i)!='*' &&
                    cadena.charAt(i)!='/' &&
                    cadena.charAt(i)!='#' &&
                    cadena.charAt(i)!='%') {
                    
                    if (true) {
                        
                    }
                    caracter= caracter+cadena.charAt(i);
                    
                }
                else{
                    //operadores=
                }
                
                caracter=caracter+String.valueOf(cadena.charAt(i));
                
            }
        }
        if (true) {
            
        }
        return "Hola";
    }
}
