/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author redu2
 */
public class Main {
    
    public static void main(String[] args) {
        
        //Creación de la lista que almacena 20 robots
        ArrayList<Robot> listaRobots = new ArrayList<>();
        
        for (int i = 0; i < 20; i++) {
            
            listaRobots.add(new Robot());
        }
        System.out.println("Lista de los robots");
        listaRobots.forEach(System.out::println);
        
        //Imprimir la lista de robot ordenada, de menor a mayor porcentaje de vida. 
        Collections.sort(listaRobots);
        System.out.println("\nLista de los robots ordenados por vida men a may");
        listaRobots.forEach(System.out::println);
        
        //Imprimir la lista de robot ordenada, mayor a menor porcentaje de vida. 
        Comparator <Robot> mayMenVida = (r1, r2)->r1.getPorcentajeVida().compareTo(r2.getPorcentajeVida());
        Collections.sort(listaRobots, mayMenVida.reversed());
        System.out.println("\nLista de los robots ordenado por vida may a men");
        listaRobots.forEach(System.out::println);
        
        //Devolver en una lista de robots aquellos que tienen más del 50% de vida. Imprime dicha lista.
        ArrayList<Robot> listaVida50 = new ArrayList<>();
        for (int i = 0; i < listaRobots.size(); i++) {
            
            if(listaRobots.get(i).getPorcentajeVida() > 50){
                
                listaVida50.add(listaRobots.get(i));
            }
        }
        System.out.println("\nLista de los robots con mas del 50% de vida");
        listaVida50.forEach(System.out::println);
        
        //Además, debe ser posible ordenar los robots por número de serie usando <<Comparable>>.
        Collections.sort(listaRobots, (r1, r2)->r1.getNumeroSerie().compareTo(r2.getNumeroSerie()));
        System.out.println("\nLista de robots ordenados por numero de serie");
        listaRobots.forEach(System.out::println);
        
        //Una vez ordenada la lista por número de serie, realizar búsqueda binaria de algún robot dentro de la lista.
        System.out.println("\nBusqueda del robot en la posición 15 de la listaRobots");
        System.out.println(Collections.binarySearch(listaRobots, listaRobots.get(15)));
        
    }
}
