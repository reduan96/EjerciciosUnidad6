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
public class Microondas extends Electrodomestico implements MuestraInformacion, Comparable<Microondas> {

    private int vatios;

    public Microondas(int vatios, double consumo, String modelo) {
        super(consumo, modelo);
        this.vatios = vatios;
    }

    public int getVatios() {
        return vatios;
    }

    public void setVatios(int vatios) {
        this.vatios = vatios;
    }

    @Override
    public String toString() {
        return "Microondas{" + "vatios=" + vatios + '}';
    }

    @Override
    public void muestra() {

        System.out.println("2000w máximos de potencia");
    }

    @Override
    public int compareTo(Microondas m) {

        return this.vatios - m.getVatios();
    }

}
