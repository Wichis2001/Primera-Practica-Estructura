/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejadores;

import Apuesta.Apuesta;
import Apuesta.IngresoApuesta;
import datos.CargaDatos;
import java.io.File;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import ventanas.CargaApuestas;

/**
 *
 * @author luis
 */
public class ManejadorIngresoApuesta {
    CargaDatos carga;
    IngresoApuesta ingreso = new IngresoApuesta();
    private long tiempoEjecucion = 0;
    private long tiempoPromedioVerificacion = 0;
    private int tamaño = 0;
    
    public ManejadorIngresoApuesta() {
    }
    
    public Apuesta[] cargarDatos(CargaApuestas ventana, String archivoALeer, Apuesta[] apuestas){
        //Agregamos un JFileChooser para poeder hacer la respectiva archovo
        JFileChooser buscarArchivo = new JFileChooser();
        int opcion = buscarArchivo.showOpenDialog(ventana);
        if(opcion == JFileChooser.APPROVE_OPTION){
            //Buscamos el archivo y procedemos a hacer la lectura del mismo
            String archivo = buscarArchivo.getSelectedFile().getAbsolutePath();
            archivoALeer = archivo;
            try{
                File archivoCargar = new File(archivoALeer);
                if(archivoCargar.exists()){
                    //Hacemos una llamada al archivo de carga de datos para almacenar dichos valores
                    carga = new CargaDatos(archivoCargar);
                    apuestas = carga.anilizarTexto(apuestas);
                    System.out.println(apuestas.length);
                    return apuestas;
                } else {
                    return null;
                }
                //Error de punto nulo
            } catch(NullPointerException e){
                
                System.err.println(e);
                return null;
            }
        } else {
            return null;
        }
    }
    
    public Apuesta[] guardarDatos(String nombre, String monto, int posiciones [], Apuesta apuesta []){
        if(nombre!=null && monto != null){
            try {
                apuesta = ingreso.redimensionarApuestas(apuesta, new Apuesta(nombre, Double.parseDouble(monto) , posiciones));
                JOptionPane.showMessageDialog(null, "Datos Guardados con Exito", "GUARDADO EXITOSO", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Datos numericos no han sido agregados con éxito", "ERROR", JOptionPane.ERROR_MESSAGE);
            }    
        } else {
            JOptionPane.showMessageDialog(null, "Hay ciertos campos vacios que no permiten registrar una nueva apuesta", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return apuesta;
            
    }
    
  

    public int parserCombo(JComboBox lugar) {
        try {
            return Integer.parseInt(lugar.getSelectedItem().toString());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Campo Vacio presente en el ingreso de datos", "ERROR", JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }
    
    public Apuesta[] verificarApuestasIngresadas(Apuesta apuestas []){
        int tamaño= apuestas.length;
        for (int i = 0; i < apuestas.length; i++) {                                
            long tiempoInicial = System.nanoTime();
            int[] posTem = new int[10];                                             
            for (int j = 0; j < 10; j++) {                                          
                if (!verificarPosiciones(apuestas[i].getPosicionesCaballos()[j], posTem)) {       
                    apuestas[i] = null;                                             
                    tamaño--;
                    break;
                } 
            }
            tiempoEjecucion += (System.nanoTime() - tiempoInicial);
        }
        try{
            tiempoPromedioVerificacion = tiempoEjecucion / apuestas.length;
            TimeUnit.SECONDS.convert(tiempoEjecucion, TimeUnit.NANOSECONDS);
            
        } catch(ArithmeticException e){
            JOptionPane.showMessageDialog(null, "No hay apuestas validas", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        return apuestas;
    }
    
    public boolean verificarPosiciones(int index, int pos[]) {                 
        if (index > 0 && index <= 10 && pos[index - 1] == 0) {
            pos[index - 1] = index;
            return true;
        } else {
            return false;
        }
    }
    
    public Apuesta[] quitarNulos(Apuesta[] apuestasPostModificacion) {
        Apuesta[] apuestas = new Apuesta[0];
        int index = 0;
        for (int i = 0; i < apuestasPostModificacion.length; i++) {
            if (null != apuestasPostModificacion[i]) {
             
                apuestas = ingreso.redimensionarApuestas(apuestas, apuestasPostModificacion[i]);
                index++;
            } 

        }
        return apuestas;
    }

    public long getTiempoPromedioVerificacion() {
        return tiempoPromedioVerificacion;
    }
}
