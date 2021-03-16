/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.adivinanza.matriz;

import java.util.Random;

/**
 *
 * @author redu2
 */
public class Matriz {

    private final int[][] matriz;
    private final Random aleatorio = new Random();

    public Matriz() {

        this.matriz = new int[aleatorio.nextInt(4) + 1][aleatorio.nextInt(4) + 1];
        rellenarMatriz();
    }

    public int[][] getMatriz() {
        return matriz;
    }

    private void rellenarMatriz() {

        for (int i = 0; i < this.matriz.length; i++) {

            for (int j = 0; j < this.matriz[i].length; j++) {

                this.matriz[i][j] = aleatorio.nextInt(100) + 1;
            }
        }
    }
    
    
}
