/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

import java.util.ArrayList;

/**
 *
 * @author redu2
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<Persona> listaPersonas = new ArrayList<>();

        listaPersonas.add(new Estudiante(23, "Juan", "Martin Perez", "09176452L",
                new Direccion("Granada", "Estepona", 29680, "España")));
        listaPersonas.add(new Estudiante(15, "Pedro", "Rodriguez Marin", "09078966H",
                new Direccion("Andalucia", "Estepona", 29680, "España")));
        listaPersonas.add(new Profesor("Matematicas", "Miguel", "Ruiz Castro", "09156932J",
                new Direccion("Ebro", "Estepona", 29680, "España")));
        listaPersonas.add(new Profesor("Fisica", "Diego", "Martinez Arena", "09078839D",
                new Direccion("Estepa", "Estepona", 29680, "España")));

        for (Persona p : listaPersonas) {

            p.identificable();

            if (p instanceof Estudiante) {

                System.out.println("idEstudiante: " + 
                        ((Estudiante) p).getIdEstudiante());
            } else if (p instanceof Profesor) {

                System.out.println("especialidadProf: " +
                        ((Profesor) p).getEspecialidad());
            }
        }
    }
}

/*
No, no se puede instanciar objetos de clases abstractas
*/
