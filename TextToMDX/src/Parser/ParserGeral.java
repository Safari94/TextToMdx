/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parser;

import java.util.*;
import java.util.regex.*;

/**
 *
 * @author xavier
 * Nesta classe vamos partir o exemplo nos 3 componentes principais
 * (Nome do Cubo, Eixos de analise e Restrições)
 */
public class ParserGeral {
    
    private String example;
    private static Pattern eixo = Pattern.compile("[EIiXxOo ][0-9 ,a-zA-zã.]+");
    private static Pattern onde = Pattern.compile("[OoNnDdEe ][0-9 ,a-zA-zã.]+");

    public ParserGeral(String example) {
        this.example = example;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    public String getNomeCubo(){
        String[] partida = this.example.split("\n");
        String cubo= partida[0];
        
        StringBuilder sb = new StringBuilder();
        
        String[] f = cubo.split(" ");
        for(int i = 1; i<f.length; i++){
            sb.append(f[i]+ " ");
        
        }
        
        return sb.subSequence(0,sb.length()-2).toString();
        
    }
    
    public ArrayList<String> getEixos(){
        
        ArrayList<String> eixos = new ArrayList<String>();
        String[] s = this.example.split("\n");
        
         for(String i:s){
            Matcher m=eixo.matcher(i);
            if(m.matches()){
            eixos.add(i);
            }
        }
        
        
    
    
    return eixos;
    }
    
      public ArrayList<String> getWhere(){
        
        ArrayList<String> ondes = new ArrayList<String>();
        String[] s = this.example.split("\n");
        
         for(String i:s){
            Matcher m=onde.matcher(i);
            if(m.matches()){
            ondes.add(i);
            }
        }
        
        
    
    
    return ondes;
    }
    
    

    
    
    
    
    
}
