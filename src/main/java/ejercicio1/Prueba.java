/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author redu2
 */
public class Prueba {
    
    public static void main(String[] args) {
        
        Casa c = new Casa();
        
        c.ventana.getPersiana().subir();
        
        c.puerta.abrir();
        
        c.estufa.fijarTemperatura(45);
        
        c.ventana.abrir();
    }
    
}
