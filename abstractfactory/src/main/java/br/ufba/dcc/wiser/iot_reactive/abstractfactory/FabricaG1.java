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
public class FabricaG1 implements IndustriaFabrica {

    @Override
    public Peca criarPeca() {
      System.out.println("criando peças para caminhao");
      return new PecaCaminhao();
    }

    @Override
    public Veiculo criarVeiculo() {
      System.out.println("criando um veículo do tipo caminhao");

        return new Caminhao(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
