/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufba.dcc.wiser.iot_reactive.designpattern;

/**
 *
 * @author cleberlira
 */
public class MeuDocumento implements Documento {
    
    
    @Override
    public void abrir(){
          System.out.println("abrir documento");
    }
    
    
    @Override
    public void fechar(){
         System.out.println("fechar documento");
    }
}
