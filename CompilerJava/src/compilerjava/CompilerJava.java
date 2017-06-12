/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilerjava;

import View.Translator;

/**
 *
 * @author Developer
 */
public class CompilerJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Translator translator=new Translator();
        translator.setVisible(true);
        translator.setLocationRelativeTo(null);
    }
    
}
