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
public  class Singleton {
    
    private static Singleton singleton = null;
    
    private Singleton(){}
    
    public static Singleton getSingleton(){
        
        if (singleton == null){
            singleton = new Singleton();
        }
                
        return singleton;       
    
    }
       
    
    
}
