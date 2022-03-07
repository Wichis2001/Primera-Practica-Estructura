/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Apuesta;

/**
 *
 * @author luis
 */
public class IngresoApuesta {

    public IngresoApuesta() {
    }
    
    
    public Apuesta[] redimensionarApuestas(Apuesta[] arreglo, Apuesta nvalor){
        Apuesta[] nArreglo=new Apuesta[arreglo.length+1];
        for(int i=0;i<arreglo.length;i++){
            nArreglo[i]=arreglo[i];
        }
        nArreglo[arreglo.length]=nvalor;
        return nArreglo;
        
    }    
}
