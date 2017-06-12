/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UtilClass;

import static UtilClass.DataType.*;

/**
 *
 * @author Developer
 */
public class TypeFile {
    String content="";
    public void TypeFile(){}
    
    public void setCpp(String[] importClass, String content_main){
        content=IOSTREAM+";"+"\n"+
                "int main()\n"+
                OPEN_KEY+"\n\t"+content_main+
                "return 0;\n"+"system ("+"pause"+");\n"+CLOSED_KEY;
    }
    
    public String getContentMain(){
        return this.content;
    }
    
}
