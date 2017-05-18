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
public class Where {
    
   private ArrayList<Medida> medidas;
   private ArrayList<Dimensao> dimensoes;
   
   public Where(){
    this.medidas=new ArrayList<>();
    this.dimensoes=new ArrayList<>();
   }
   
   public void addDimensao(Dimensao dim){
    this.dimensoes.add(dim);
   }
   
   public void addMedida(Medida med){
    this.medidas.add(med);
   }
}
