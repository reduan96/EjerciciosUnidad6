/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16;

import java.util.Random;

/**
 *
 * @author redu2
 */
public class Robot implements Comparable<Robot>{
    
    private int numeroSerie;
    private int porcentajeVida;
    private static final Random rd = new Random();

    public Robot() {
        this.numeroSerie = rd.nextInt(1001);
        this.porcentajeVida = rd.nextInt(101);
    }

    public Integer getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public Integer getPorcentajeVida() {
        return porcentajeVida;
    }

    public void setPorcentajeVida(int porcentajeVida) {
        this.porcentajeVida = porcentajeVida;
    }

    @Override
    public String toString() {
        return "Robot{" + "numeroSerie=" + numeroSerie + ", porcentajeVida=" + porcentajeVida + '}';
    }

    @Override
    public int compareTo(Robot robot) {
        
        return this.porcentajeVida - robot.getPorcentajeVida();
    }
    
}
