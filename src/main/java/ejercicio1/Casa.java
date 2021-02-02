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
public class Casa {

    Puerta puerta;
    Ventana ventana;
    Calefactor estufa;

    public Casa() {
    }

    public Casa(Puerta puerta, Ventana ventana, Calefactor estufa) {
        this.puerta = puerta;
        this.ventana = ventana;
        this.estufa = estufa;
    }

    public Puerta getPuerta() {
        return puerta;
    }

    public void setPuerta(Puerta puerta) {
        this.puerta = puerta;
    }

    public Ventana getVentana() {
        return ventana;
    }

    public void setVentana(Ventana ventana) {
        this.ventana = ventana;
    }

    public Calefactor getEstufa() {
        return estufa;
    }

    public void setEstufa(Calefactor estufa) {
        this.estufa = estufa;
    }

    @Override
    public String toString() {
        return "Casa{" + "puerta=" + puerta + ", ventana=" 
                + ventana + ", estufa=" + estufa + '}';
    }
    
    
}
