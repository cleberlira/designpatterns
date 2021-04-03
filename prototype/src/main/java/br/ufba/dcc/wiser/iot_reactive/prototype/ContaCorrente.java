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
public class ContaCorrente extends Conta{

    public Integer variacao;

    public ContaCorrente(){
        
    }
    
    
    public ContaCorrente(ContaCorrente contacorrente){
        super(contacorrente);
        if (contacorrente!=null)
           this.variacao = contacorrente.variacao;
    }

  @Override
    public Conta clone() {
          return new ContaCorrente(this);
    }
    
    
    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof ContaCorrente) || !super.equals(object2)) return false;
        ContaCorrente conta2 = (ContaCorrente) object2;
        return conta2.variacao == variacao;
    }
}
