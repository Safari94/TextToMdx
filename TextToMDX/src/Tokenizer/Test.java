/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tokenizer;

/**
 *
 * @author xavier
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String example ="Cubo Adventure Works.\n"+
               "Eixo 0, Medida x, Dimensao y atributo z.\n"+
               "Eixo 1, Medida a, Dimensao y atributo z.\n"+
               "Onde dimensao x atributo y menor 0.";
       
       Tokenizer tokenizer = new Tokenizer(example);
       
       while(tokenizer.hasNextToken()){
           System.out.println(tokenizer.nextToken().getToken() + tokenizer.nextToken().getType().toString());
       
       }
       
    }
    
}
