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
public class Prueba {
    
    public static void main(String[] args) {
        
        Persona p = new Persona("Redu", "09076396K", 24);
        
        System.out.println(p.toString());
        
        Empleado e = new Empleado(1300, "Juan", "09923458J", 20);
        
        System.out.println(e.toString());
        
        e.aumentarSalario(500); 
        System.out.println(e.toString());
        
        Programador prog = new Programador(Categorias.JUNIOR, 1100, "Pepe", 
        "091344467F", 19);
        
        System.out.println(prog.toString());
    }
    
}
