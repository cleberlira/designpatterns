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
public class MinhaAplicacao implements Aplicacao {
    
    Documento documento;
    
    //método de fábrica
    @Override
    public Documento criaDocumento(){
        documento = new MeuDocumento();
        return documento;
    }
    
    @Override
    public void novoDocumento(){
        
      this.criaDocumento();
      System.out.println("Novo documento criado");
    }
       
    @Override
    public void abrirDocumento(){
      this.documento.abrir();
        
    }
    
   
    public void fecharDocumento(){
      this.documento.fechar();
              
        
    }
    
}
