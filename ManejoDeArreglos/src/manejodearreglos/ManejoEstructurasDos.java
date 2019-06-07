/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejodearreglos;

/**
 *
 * @author COMPUMARS
 */
public class ManejoEstructurasDos {

    /**
     * @param args the command line arguments
     */
    public static void main (String[] args){
        String datos = ""; //Declaración de la variable cadena 
        
        String [] listaNombres = {"Marjan", "Jhon", "Rodrigo", "Miguel", 
            "José"};
        String [] listaCiudades = {"Loja", "Catamayo", "Calvas", "Celica", 
            "Pindal"};
        double [] listaSueldos = {900.1, 1000.2, 450.3, 1500.2, 861.9};
        // Variables que usará el programa, las variables son matrices
        
        datos = String.format("%s%s\n", datos, 
                "LISTADO DE TRABJADORES." + "\n"); 
                // Uso de un solo String.format 
        
        for (int i = 0; i < listaNombres.length; i++) {
            datos = String.format("%s%s de la ciudad de %s,\ntiene un sueldo "
                    + "de %.1f\n\n", 
                    datos, listaNombres[i], listaCiudades[i], 
                    listaSueldos[i]);
        }
        System.out.printf("%s", datos);
        // Para presentar la variable cadena
    }
}