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
public interface ICasaBuilder {
    
    public void construirBase();
  
    public void construirEstrutura();
        
    public void construirCobertura();
  
    public void construirInterior();
  
    public Casa getCasa();
}
