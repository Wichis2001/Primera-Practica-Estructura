/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejadores;

import Apuesta.Apuesta;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import ventanas.ReportesJugador;

/**
 *
 * @author luis
 */
public class ManejadorReporteJugadores {
    private long tiempoEjecucionPunaje = 0;
    private long tiempoEjecucionNombre = 0;
    private long tiempoPromedioOrdenamientoNombre = 0;
    private long tiempoPromedioOrdenamientoPuntaje = 0;
    private int tamañoArreglo = 0;
    
    //Establecemos los modelos que tendra la JTable que esta asociada a la ventana
    DefaultTableCellRenderer alinear = new DefaultTableCellRenderer();
    DefaultTableModel modelo = new DefaultTableModel();
    
    /**
     * Metodo que me permite llenar una tabla asignandole un modelo y los datos
     * @param ventana
     */
    public void llenarTabla(ReportesJugador ventana, Apuesta [] apuesta){
        JTable tabla= ventana.getTable();
        this.setModelo(tabla);
        this.setDatos(tabla, apuesta);
    }
    
    /**
     * Este metodo me permite modificar el modelo establecido en un JTable
     * @param tabla
     */
    public void setModelo(JTable tabla){
        //Establecemoos las columnas que tendran la tabla
        String[] columna= {"Nombre Jugador","Monto Apostado","Puntos Acumulados"};
        //Asociamos  el modelo a la tabla
        modelo.setColumnIdentifiers(columna);
        tabla.setModel(modelo);
    }
    
    /**
     * Este metodo me permite modificar los datos de una tabla a travez de los datos asignados a mi tabla
     * @param tabla
     */
    public void setDatos(JTable tabla, Apuesta [] apuesta){
        //Establecemos un objeto el cual contendra mis datos
        Object[] datos= new Object[modelo.getColumnCount()];
        modelo.setRowCount(0);
        //Recorremos el array de errores para extraer sus atributos
        for (int i = 0; i < apuesta.length; i++) {
            datos[0]= apuesta[i].getNombreApostador();
            datos[1]= apuesta[i].getMontoApuesta();
            datos[2]= apuesta[i].getPuntos();
            //Asignamos las filas
            modelo.addRow(datos);
        }
        
        //Centramos los atributos obtenidos por la tabla
        alinear.setHorizontalAlignment(SwingConstants.CENTER);
        tabla.getColumnModel().getColumn(0).setCellRenderer(alinear);
        tabla.getColumnModel().getColumn(1).setCellRenderer(alinear);
        tabla.getColumnModel().getColumn(2).setCellRenderer(alinear);
        tabla.setModel(modelo);
    }
    

    public Apuesta[] ordenarPorPuntaje(Apuesta[] apuestas) {           
        this.inicializarTiempos();
        this.tamañoArreglo = apuestas.length;
        Apuesta aux;
        int posAux;
        for (int i = 0; i < apuestas.length; i++) {                                 
            long tiempoI = System.nanoTime();                                       
            posAux = i;
            aux = apuestas[i];
            while ((posAux > 0) && (apuestas[posAux - 1].getPuntos()< aux.getPuntos())) { 
                apuestas[posAux] = apuestas[posAux - 1];
                posAux--;
            }
            apuestas[posAux] = aux;
            tiempoEjecucionPunaje += (System.nanoTime() - tiempoI);
        }
        this.tiempoPromedioOrdenamientoPuntaje = tiempoEjecucionPunaje / apuestas.length;
        return apuestas;
    }

    public Apuesta[] ordenarPorNombre(Apuesta[] apuestas) {
        this.inicializarTiempos();
        this.tamañoArreglo = apuestas.length;
        Apuesta aux;
        int posAux;
        for (int i = 0; i < apuestas.length; i++) {
            long tiempoI = System.nanoTime();
            posAux = i;
            aux = apuestas[i];
            while ((posAux > 0) && (apuestas[posAux - 1].getNombreApostador().compareTo(aux.getNombreApostador()) > 0)) {
                apuestas[posAux] = apuestas[posAux - 1];
                posAux--;
            }
            apuestas[posAux] = aux;
            tiempoEjecucionNombre += (System.nanoTime() - tiempoI);
        }
        this.tiempoPromedioOrdenamientoNombre = tiempoEjecucionNombre / apuestas.length;

        return apuestas;
    }

    private void inicializarTiempos() {
        this.tiempoEjecucionNombre = 0;
        this.tiempoEjecucionPunaje = 0;
        this.tiempoPromedioOrdenamientoNombre = 0;
        this.tiempoPromedioOrdenamientoPuntaje = 0;
    }

    public long getTiempoPromedioOrdenamientoNombre() {
        return tiempoPromedioOrdenamientoNombre;
    }

    public long getTiempoPromedioOrdenamientoPuntaje() {
        return tiempoPromedioOrdenamientoPuntaje;
    }

    public int getTamañoArreglo() {
        return tamañoArreglo;
    }
}
