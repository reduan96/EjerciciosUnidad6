/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author redu2
 */
public class Calefactor {
    
    private Integer temperatura;

    public Calefactor() {
    }

    public Calefactor(Integer temperatura) {
        this.temperatura = temperatura;
    }

    public Integer getTemperatura() {
        return temperatura;
    }
    
    public void encender(){
        
        System.out.println("Encendiendo calefactor...");
    }
    
    public void apagar(){
        
        System.out.println("Apagando calefactor...");
    }
    
    public void fijarTemperatura(Integer temp){
        
        this.temperatura = temp;
    }
}
