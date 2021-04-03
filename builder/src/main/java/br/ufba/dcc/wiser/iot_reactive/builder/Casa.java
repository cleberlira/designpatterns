/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufba.dcc.wiser.iot_reactive.builder;

/**
 *
 * @author cleberlira
 */
public class Casa implements ICasa{
    
    private String base;
    private String estrutura;
    private String cobertura;
    private String interior;
            
            
            

    @Override
    public void setBase(String base) {
      this.base = base;
    }

    @Override
    public void setEstrutura(String estrutura) {
      this.estrutura = estrutura;  
    }

    @Override
    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }

    @Override
    public void setInterior(String interior) {
        this.interior = interior; //To change body of generated methods, choose Tools | Templates.
    }
    
    

   
    
}
