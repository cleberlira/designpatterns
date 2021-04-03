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
public class CasaAltoPadrao implements ICasaBuilder {
    
    private Casa casa;
    
    public CasaAltoPadrao(){
        
        this.casa = new Casa();
    }

    @Override
    public void construirBase() {
        System.out.println("Base para uma casa alto padrão"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void construirEstrutura() {
        System.out.println("Estrutura para uma casa alto padrão"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void construirCobertura() {
       System.out.println("Cobertura para uma casa alto padrão"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void construirInterior() {
        System.out.println("Interior para uma casa alto padrão"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Casa getCasa() {
       return casa; //To change body of generated methods, choose Tools | Templates.
    }
    
}
