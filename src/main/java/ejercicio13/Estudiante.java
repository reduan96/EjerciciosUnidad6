/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

/**
 *
 * @author redu2
 */
public class Estudiante extends Persona {

    private int idEstudiante;

    public Estudiante(int idEstudiante, String nombre, String apellidos,
            String nif, Direccion direccion) {
        super(nombre, apellidos, nif, direccion);
        this.idEstudiante = idEstudiante;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "idEstudiante=" + idEstudiante + '}';
    }

    @Override
    public void identificable() {

        System.out.println("Es un estudiante");
    }

}
