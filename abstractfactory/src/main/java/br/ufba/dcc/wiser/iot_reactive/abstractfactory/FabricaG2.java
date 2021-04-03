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
public class FabricaG2 implements IndustriaFabrica {

    @Override
    public Peca criarPeca() {
        System.out.println("Peca auto");
        
       return new PecaAutomovel(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Veiculo criarVeiculo() {
        
       System.out.println("Peca Automovel");

       return new Automovel(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
