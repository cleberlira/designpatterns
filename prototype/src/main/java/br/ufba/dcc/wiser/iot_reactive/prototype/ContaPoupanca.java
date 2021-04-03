/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufba.dcc.wiser.iot_reactive.prototype;

/**
 *
 * @author cleberlira
 */
public class ContaPoupanca extends Conta {

    Integer dv;
    
    
    @Override
    public Conta clone() {
            return new ContaPoupanca(this);   
    }
    
    
    public ContaPoupanca(){
        
    }
    
    
    public ContaPoupanca(ContaPoupanca contapoupanca){
        super(contapoupanca);
        if (contapoupanca!=null)
           this.dv = contapoupanca.dv;
    }

   
  
    
    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof ContaPoupanca) || !super.equals(object2)) return false;
        ContaPoupanca conta2 = (ContaPoupanca) object2;
        return conta2.dv == dv;
    }
    
}
