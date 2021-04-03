/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufba.dcc.wiser.iot_reactive.prototype;

import java.util.Objects;

/**
 *
 * @author cleberlira
 */
public abstract class  Conta {
  public Integer number;
  public String nome; 
  
  public Conta(){
      
  }
  
  
  public Conta (Conta conta){
      if (conta!=null){
          this.nome = conta.nome;
          this.number =conta.number;
      }
      
  }    

  public abstract Conta clone();

     
  public boolean equals(Object object2) {
        if (!(object2 instanceof Conta)) return false;
        Conta conta2  = (Conta) object2;
        return conta2.number == number && Objects.equals(conta2.nome, nome);
   }


  
  
}
