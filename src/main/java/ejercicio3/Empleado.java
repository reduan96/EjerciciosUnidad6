/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author redu2
 */
public class Empleado extends Persona{
    
    private int salario;

    public Empleado() {
        
    }

    public Empleado(int salario, String nombre, String nif, int edad) {
        super(nombre, nif, edad);
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleado{" + "salario=" + salario + '}';
    }
    
    public void aumentarSalario(int aumento){
        
        salario += aumento;
    }
}
