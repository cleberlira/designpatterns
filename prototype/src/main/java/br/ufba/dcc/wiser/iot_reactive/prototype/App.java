/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufba.dcc.wiser.iot_reactive.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cleberlira
 */
public class App {
    
    public static void main (String args[]){
        List<Conta> contas = new ArrayList<>();
        List<Conta> contasCopy = new ArrayList<>();

        ContaCorrente contacorrente = new ContaCorrente();
        
        contacorrente.nome = "C1";
        contacorrente.number = 10;
        contacorrente.variacao = 1;
        
        contas.add(contacorrente);
        
        ContaCorrente outracontacorrente = (ContaCorrente) contacorrente.clone();
        contas.add(outracontacorrente);
        
        
        ContaPoupanca contapoupanca = new ContaPoupanca();
        contapoupanca.dv = 1;
        contapoupanca.nome ="CP";
        contapoupanca.number=11;
        contas.add(contapoupanca);
        
        
        ContaPoupanca outracontapoupanca = (ContaPoupanca) contapoupanca.clone();
        contas.add(outracontapoupanca);
        
       
        
        compareClonar(contas, contasCopy);
        
        
    }
    
    
      private static void compareClonar(List<Conta> contas, List<Conta> copias) {
       
          
         for (Conta conta : contas) {
            copias.add(conta.clone());
        }

        for (int i = 0; i < contas.size(); i++) {
            if (contas.get(i) != copias.get(i)) {
                System.out.println(i + ": Objetos diferentes ");
                if (contas.get(i).equals(copias.get(i))) {
                    System.out.println(i + ": São identicas " + "Original " + contas.get(i).number  + " Cópia" + copias.get(i).number);
                } else {
                    System.out.println(i + ": Não são identicas");
                }
            } else {
                System.out.println(i + ": Mesmo objeto");
            }
        }
    }
    
}
