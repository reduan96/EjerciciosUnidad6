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
public class Ventana {
    
    private Persiana persiana;

    public Ventana() {
        
    }

    public Ventana(Persiana persiana) {
        this.persiana = persiana;
    }

    public Persiana getPersiana() {
        return persiana;
    }

    public void setPersiana(Persiana persiana) {
        this.persiana = persiana;
    }
    
    
    public void abrir(){
        
        System.out.println("Abriendo ventana...");
    }
    
    public void cerrar(){
        
        System.out.println("Cerrando ventana...");
    }

    @Override
    public String toString() {
        return "Ventana{" + "persiana=" + persiana + '}';
    }
    
}
