/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import Apuesta.Apuesta;
import Apuesta.IngresoApuesta;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import ventanas.VentanaPrincipal;

/**
 *
 * @author luis
 */
public class CargaDatos {
    
    public static File archivoAProcesar;
    private IngresoApuesta ingreso = new IngresoApuesta();
       
    /**
     * Este constructor me permite hacer la carga de un archivo y poder aplicarla a la ventana deseada, en este caso a la ventana de carga de datos 
     * @param archivoAProcesar
     */
    public CargaDatos(File archivoAProcesar){
        this.archivoAProcesar = archivoAProcesar;
    }
    
    /**
     * Este metodo me permite leer el archivo de entrada ingresado por el usuairo y que este pueda ser extraido para su analisis
     */
    public Apuesta[] anilizarTexto(Apuesta[] apuestaRecibida){
        try {
            //Llamamos al metodo leer archivo
            apuestaRecibida=leerArchivo(apuestaRecibida);
            System.out.println(apuestaRecibida.length);
            return apuestaRecibida;
            //Archivo no encontrado
        } catch (FileNotFoundException e) {
            System.err.println(e);
            return null;
            //Errores Generales
        } catch (IOException | ArrayIndexOutOfBoundsException e) {
            System.err.println(e);
            return null;
            //Error en el indice ilegal que posee el arreglo 
        }
    }

    /**
     * Este metodo se encarga de la lectura del archivo de texto y la extraccion de datos para cada objeto respectivamente 
     */
    private Apuesta[] leerArchivo(Apuesta[] apuestas) throws FileNotFoundException, IOException, ArrayIndexOutOfBoundsException{
        //Leemos el texto del archivo       
        BufferedReader lector = new BufferedReader(new FileReader(this.archivoAProcesar));
        //Usamos esta variable para la lectura de linea por linea
        String auxiliar = lector.readLine();
        //Usamos esta variable para determinar la poscion en la que esta ubicada la linea
        String temporal="";
        while(auxiliar != null){
            //Procedemos a hacer una separación de los campos
            temporal=temporal+auxiliar;
            if (!temporal.equalsIgnoreCase("")) {
                apuestas=ingreso.redimensionarApuestas(apuestas, nuevaApuesta(separarCampos(auxiliar)));
                System.out.println(apuestas.length);
                System.out.println(nuevaApuesta(separarCampos(auxiliar)).toString());
                
    
            }
            auxiliar = lector.readLine();
        }      
        
        //Establecemos que la carga fue exitosa y cerramos el lector
        JOptionPane.showMessageDialog(null, "Datos cargados con éxito.", "CARGA DE DATOS", JOptionPane.INFORMATION_MESSAGE);
        lector.close();
        System.out.println(apuestas.length);
        return apuestas;
    }   


    
    private int[] separarPosiciones(String[] posicionCaballo) {
        int posiciones[] = new int[10];
        for (int i = 0; i < posiciones.length; i++) {
            try {
                posiciones[i] = Integer.parseInt(posicionCaballo[i + 2]);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,"La posicicion ingresada en: " + posiciones[i] + " no es valida", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
        return posiciones;
    }
    
    private String[] separarCampos(String linea) {
        return linea.split(",");
    }

    private Apuesta nuevaApuesta(String[] apuestaString) {
        return new Apuesta(apuestaString[0], Double.parseDouble(apuestaString[1]), separarPosiciones(apuestaString));
    }
}
