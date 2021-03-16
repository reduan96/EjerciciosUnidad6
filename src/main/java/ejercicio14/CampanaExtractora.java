/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

/**
 *
 * @author redu2
 */
public class CampanaExtractora extends Electrodomestico implements MuestraInformacion{

    private int db;

    public CampanaExtractora(int db, double consumo, String modelo) {
        super(consumo, modelo);
        this.db = db;
    }

    public int getDb() {
        return db;
    }

    public void setDb(int db) {
        this.db = db;
    }

    @Override
    public String toString() {
        return "CampanaExtractora{" + "db=" + db + '}';
    }
    
    @Override
    public void muestra() {
        
        System.out.println("Decibelios máximos de 87db");
    }
    
}
