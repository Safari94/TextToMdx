/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tokenizer;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 *
 * @author xavier
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    
    private static Pattern eixo = Pattern.compile("[EwIiXxOo ][0-9 ,a-zA-zã.]+");
    private static Pattern onde = Pattern.compile("[OoNnDdEe ][0-9 ,a-zA-zã.]+");
    
    
    public static void main(String[] args) {
        int i=0;
        String[] eixos=null;
       String example ="Cubo Adventure Works.\n"+
               "Eixo 0, Medida x, Dimensao y atributo z.\n"+
               "Eixo 1, Medida a, Dimensao y atributo z.\n"+
               "Onde dimensao x atributo y menor 0.";
       
       String[] string= example.split("\n");
       String cube= string[0];
      
       
       System.out.println(string[0].trim());
       for(String s: string){
           System.out.println(i+" -> " +s);
           i++;
       
       
       }
       
       /**Tokenizer tokenizer = new Tokenizer(example);
       
       while(tokenizer.hasNextToken()){
           System.out.println(tokenizer.nextToken().getToken() + tokenizer.nextToken().getType().toString());
       
       }*/
       
    }
    
   
    
}
