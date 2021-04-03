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
public class App {
    public static void main(String[] args)
    {
        ICasaBuilder casabuilder  = new CasaAltoPadrao();
        Company company = new Company(casabuilder);
  
        company.construirCasa();
  
        Casa casa = company.getCasa();
  
        System.out.println("Casa Construída: "+ casa);
        
       

    }
}
