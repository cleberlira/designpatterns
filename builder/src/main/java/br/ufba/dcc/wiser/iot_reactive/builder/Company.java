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
public class Company {
    private ICasaBuilder casaBuilder;
  
    public Company(ICasaBuilder casaBuilder)
    {
        this.casaBuilder = casaBuilder;
    }
  
    public Casa getCasa()
    {
        return this.casaBuilder.getCasa();
    }
  
    public void construirCasa()
    {
        this.casaBuilder.construirBase();
        this.casaBuilder.construirEstrutura();
        this.casaBuilder.construirCobertura();
        this.casaBuilder.construirInterior();
    }
}
