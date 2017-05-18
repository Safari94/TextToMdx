/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Blocos;

import java.util.ArrayList;

/**
 *
 * @author xavier
 */
public class Cubo {
    
    private String nome;
    private ArrayList<Eixo> eixos;
    private Where onde;

    public Cubo(String nome, ArrayList<Eixo> eixos, Where onde) {
        this.nome = nome;
        this.eixos = eixos;
        this.onde = onde;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Eixo> getEixos() {
        return eixos;
    }

    public void setEixos(ArrayList<Eixo> eixos) {
        this.eixos = eixos;
    }

    public Where getOnde() {
        return onde;
    }

    public void setOnde(Where onde) {
        this.onde = onde;
    }
    
    
    
    
    
}
