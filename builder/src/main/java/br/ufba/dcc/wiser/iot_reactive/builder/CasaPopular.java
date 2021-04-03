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
public class CasaPopular implements ICasaBuilder{
    
    private Casa casa;
    
    
    public CasaPopular(){
        this.casa = new Casa();
    }

    @Override
    public void construirBase() {
        System.out.println("Casa Popular Base" );

    }

    @Override
    public void construirEstrutura() {
        System.out.println("Casa Popular Estrutura" );
    }

    @Override
    public void construirCobertura() {
            System.out.println("Casa Popular Cobertura" );    }

    @Override
    public void construirInterior() {
            System.out.println("Casa Popular Interior" );    
    }

    @Override
    public Casa getCasa() {
        return this.casa;
    }
    
    
    
}
