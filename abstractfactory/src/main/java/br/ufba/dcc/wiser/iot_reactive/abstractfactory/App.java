/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufba.dcc.wiser.iot_reactive.abstractfactory;

/**
 *
 * @author cleberlira
 */
public class App {
    
    public static void main(String args[]){
        IndustriaFabrica g1 = new FabricaG2();
        g1.criarPeca();
        
        g1.criarVeiculo();
    }
}
