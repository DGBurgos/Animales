/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

public class AppAnimales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Gato pupi = new Gato();
            Gato pupa = new Gato(Sexo.MACHO, "persa");
            System.out.println(pupi);
            System.out.println(pupa);
            pupi.pelearCon(pupa);
            pupi.comer("pescado");
            pupa.comer("Mandioca");
            
            pupi.dormir();
            
    }
    
}
