/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author redu2
 */
public class Main {
    
    public static void main(String[] args) {
        
        ArrayList<Electrodomestico> listaElectros = new ArrayList<>();
        
        listaElectros.add(new Frigorifico(70, 3000, "LG"));
        listaElectros.add(new Frigorifico(70, 3500, "Samsung"));
        listaElectros.add(new Microondas(240, 1000, "Moulineux"));
        listaElectros.add(new Microondas(240, 800, "Bluesky"));
        listaElectros.add(new CampanaExtractora(60, 500, "Fagor"));
        listaElectros.add(new CampanaExtractora(48, 350, "Electrolux"));
        
        for (Electrodomestico e : listaElectros) {
            
            if(e instanceof MuestraInformacion){
                
                ((MuestraInformacion) e).muestra();
            }else if(e instanceof Electrodomestico){
                
                e.getConsumo();
                e.getModelo();
            }
        }
        
    }
}
