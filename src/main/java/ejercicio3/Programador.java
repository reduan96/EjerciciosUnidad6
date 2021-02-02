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
public class Programador extends Empleado{
    
    private Categorias categoria;

    public Programador() {
        
    }

    public Programador(Categorias categoria, int salario, String nombre, String nif, int edad) {
        super(salario, nombre, nif, edad);
        this.categoria = categoria;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return super.toString() + "Programador{" + "categoria=" + categoria + '}';
    }
    

}
