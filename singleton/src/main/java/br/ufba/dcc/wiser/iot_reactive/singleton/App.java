/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufba.dcc.wiser.iot_reactive.singleton;

/**
 *
 * @author cleberlira
 */
public class App {
    public static void main (String args[]){
        Singleton singleton1 = Singleton.getSingleton();
        
        System.out.println("singleton1 " + singleton1 );
        
        Singleton singleton2 = Singleton.getSingleton();
        
       System.out.println("singleton2 " + singleton2 );
       
       if (singleton1 == singleton2){
           
           System.out.println("the same object");
       }

    }
}
