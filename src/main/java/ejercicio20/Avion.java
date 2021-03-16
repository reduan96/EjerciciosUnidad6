/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio20;

/**
 *
 * @author redu2
 */
public class Avion {

    private int[][] matrizAsientos;

    public Avion() {
        matrizAsientos = new int[25][4];
        rellenarMatriz();
    }

    public int[][] getMatrizAsientos() {
        return matrizAsientos;
    }

    private void rellenarMatriz() {

        for (int i = 0; i < this.matrizAsientos.length; i++) {

            for (int j = 0; j < this.matrizAsientos[i].length; j++) {

                this.matrizAsientos[i][j] = 0;
            }
        }
    }

    public void reservarAsiento(int fila, int columna) {

        if (fila >= 0 && fila < 25 && columna >= 0 && columna < 4) {

            if (this.matrizAsientos[fila][columna] != 0) {

                System.out.println("Este asiento ya está reservado");
            } else {

                this.matrizAsientos[fila][columna] = 1;
                System.out.println("Ha reservado el asiento de la fila "
                        + fila + " y de la columna " + columna);
            }
        } else {

            System.out.println("Número de fila o columna incorrecto.");
        }
    }

    public void eliminarReservaAsiento(int fila, int columna) {

        if (fila >= 0 && fila < 25 && columna >= 0 && columna < 4) {

            if (this.matrizAsientos[fila][columna] != 1) {

                System.out.println("Este asiento no está reservado");
            } else {

                this.matrizAsientos[fila][columna] = 0;
                System.out.println("Ha anulado la reserva del asiento de la fila "
                        + fila + " y de la columna " + columna);
            }
        } else {

            System.out.println("Número de fila o columna incorrecto.");
        }
    }

    public void imprimirAsientosReservados() {

        for (int i = 0; i < this.matrizAsientos.length; i++) {

            for (int j = 0; j < this.matrizAsientos[i].length; j++) {

                if (this.matrizAsientos[i][j] == 1) {

                    System.out.println("Asientos reservado, columna " +
                            i + " de la fila " + j);
                }

            }

        }
    }

    public void imprimirMatriz() {

        for (int i = 0; i < this.matrizAsientos.length; i++) {

            for (int j = 0; j < this.matrizAsientos[i].length; j++) {

                System.out.print(matrizAsientos[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
