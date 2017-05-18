/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Blocos;

/**
 *
 * @author xavier
 */
public class Medida {
    
    private String nome;
    private String restricao;
    
    public Medida(String nome){
        this.nome=nome;
    
    }
    
    public Medida(String nome, String restricao){
        this.nome=nome;
        this.restricao=restricao;
    }
    
}
