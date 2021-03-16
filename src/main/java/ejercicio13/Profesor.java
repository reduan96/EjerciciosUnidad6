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
public class Profesor extends Persona {

    private String especialidad;

    public Profesor(String especialidad, String nombre, String apellidos,
            String nif, Direccion direccion) {
        super(nombre, apellidos, nif, direccion);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Profesor{" + "especialidad=" + especialidad + '}';
    }

    @Override
    public void identificable() {
        System.out.println("Es un profesor");
    }

}
