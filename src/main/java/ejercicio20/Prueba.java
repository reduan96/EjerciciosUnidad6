/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio20;

import java.util.Scanner;

/**
 *
 * @author redu2
 */
public class Prueba {
    
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);
        boolean repetir = true;
        int opcion;
        int fila;
        int columna;
        
        Avion airbus = new Avion();
        
        do{
            System.out.println("Bienvenido, introduzca la opción deseada:\n"
                    + "1.Reservar asiento\n2.Anular reserva asiento\n3.Salir");
            opcion = tec.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Introduzca la fila y la columna del asiento"
                            + "que desea reservar:");
                    fila = tec.nextInt();
                    columna = tec.nextInt();
                    airbus.reservarAsiento(fila, columna);
                case 2:
                    System.out.println("Introduzca la fila y la columna del asiento"
                            + "que desea anular:");
                    fila = tec.nextInt();
                    columna = tec.nextInt();
                    airbus.eliminarReservaAsiento(fila, columna);
                case 3:
                    System.out.println("Saliendo del programa...");
                    repetir = false;
            }
        }while(repetir);
    }
    
}
