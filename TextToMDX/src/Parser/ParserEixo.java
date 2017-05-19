/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parser;

import java.util.regex.Pattern;

/**
 *
 * @author xavier
 * 
 * Exemplo de Eixo:Eixo 1, Medida Sales Amount, Medida Taxes Amount, Dimensao Cliente Atributo nome igual a José
 */

public class ParserEixo {
    
    private String example;
    private static Pattern medida = Pattern.compile("[OoNnDdEe ][0-9 ,a-zA-zã.]+");
    private static Pattern dimensao = Pattern.compile("[OoNnDdEe ][0-9 ,a-zA-zã.]+");
    

    public ParserEixo(String example) {
        this.example = example;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }
    
    public String getNumero(){
    
       
        String[] part1=this.example.split(",");
        String[] part2=part1[0].split(" ");
        return part2[1];
        
        
    }
    
}
