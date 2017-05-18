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
public class Dimensao {
    
    private String nome;
    private String atributo;
    private String restricao=null;
    
    public Dimensao(String nome, String atributo){
        this.nome=nome;
        this.atributo=atributo;
        
    
    }
    
    public Dimensao(String nome, String atributo, String restricao){
        
        this.nome=nome;
        this.atributo=atributo;
        this.restricao=restricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }

    public String getRestricao() {
        return restricao;
    }

    public void setRestricao(String restricao) {
        this.restricao = restricao;
    }
    
    
    
}
