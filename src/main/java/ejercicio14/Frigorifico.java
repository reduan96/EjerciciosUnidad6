/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

/**
 *
 * @author redu2
 */
public class Frigorifico extends Electrodomestico implements MuestraInformacion, Comparable{

    private int litros;

    public Frigorifico(int litros, double consumo, String modelo) {
        super(consumo, modelo);
        this.litros = litros;
    }

    public int getLitros() {
        return litros;
    }

    public void setLitros(int litros) {
        this.litros = litros;
    }

    @Override
    public String toString() {
        return "Frigorifico{" + "litros=" + litros + '}';
    }
    
    @Override
    public void muestra() {
        
        System.out.println("Capacidad de 60 litros");
    }

    @Override
    public int compareTo(Object o) {
        
    }
    
}
