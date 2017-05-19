/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parser;

import java.util.ArrayList;
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
    
    
    private static Pattern eixo = Pattern.compile("[EIiXxOo ][0-9 ,a-zA-zã.]+");
    private static Pattern onde = Pattern.compile("[OoNnDdEe ][0-9 ,a-zA-zã.]+");
    private static String example1="Cubo Adventure Works.\n"+
               "Eixo 0, Medida x, Dimensao y atributo z.\n"+
               "Eixo 1, Medida a, Dimensao y atributo z.\n"+
               "Onde dimensao x atributo y menor 0.";
    
    private static String example2="Eixo 1, Medida a, Dimensao y atributo z.";

    public Test() {
    }
    
    public String nomeCubo(String s){
        
        String aux = s.trim();
        
        StringBuilder sb = new StringBuilder();
        
        String[] f = aux.split(" ");
        for(int i = 1; i<f.length; i++){
            sb.append(f[i]+ " ");
        
        }
        
        return sb.subSequence(0,sb.length()-2).toString();
    
    
    }
    
    
    
    
    
    public ArrayList<String> retiraEixos(String[] s){
        ArrayList<String> eixos = new ArrayList<String>();
        
        for(String i:s){
            Matcher m=eixo.matcher(i);
            if(m.matches()){
            eixos.add(i);
            }
        }
        
        
    
    
    return eixos;
    }
    
    public ArrayList<String> retiraOnde(String[] s){
        ArrayList<String> ondes = new ArrayList<String>();
        
        for(String i:s){
            Matcher m=onde.matcher(i);
            if(m.matches()){
            ondes.add(i);
            }
        }
        
        
    
    
    return ondes;
    }
    
    
    public static void main(String[] args) {
        
        
        int i=0;
        ArrayList<String> eixos = new ArrayList<>();
        ArrayList<String> ondes = new ArrayList<>();
       
       
       String[] string= example1.split("\n");
       String cube= new Test().nomeCubo(string[0]);
       eixos= new Test().retiraEixos(string);
       ondes= new Test().retiraOnde(string);
       
       ParserEixo pe =new ParserEixo(example2);
       System.out.println("EIXO -> "+pe.getNumero());
       
      
       
      
       for(String s: string){
           System.out.println(i+" -> " +s);
           i++;
       
       
       }
       
       for(String s: eixos){
           i=0;
           System.out.println(i+" -> " +s);
           i++;
       
       
       }
       
       for(String s: ondes){
           i=1;
           System.out.println(i+" -> " +s);
           i++;
       
       
       }
       
       System.out.println(cube);
       
       
       
       /**Tokenizer tokenizer = new Tokenizer(example);
       
       while(tokenizer.hasNextToken()){
           System.out.println(tokenizer.nextToken().getToken() + tokenizer.nextToken().getType().toString());
       
       }*/
       
    }
    
    
    
   
    
}
