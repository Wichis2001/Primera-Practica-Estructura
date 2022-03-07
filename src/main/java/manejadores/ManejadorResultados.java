/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejadores;

import Apuesta.Apuesta;
import datos.GuardarDatos;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author luis
 */
public class ManejadorResultados {
    private long tiempoEjecucion = 0;
    private long tiempoPromedioResultados = 0;
    public ManejadorResultados() {
    }
    
    public Apuesta[] calcularPuntosParticipantes(int[] ordenLlegada, Apuesta[] apuestas) {      
        tiempoEjecucion = 0;
        tiempoPromedioResultados = 0;
        for (int i = 0; i < apuestas.length; i++) {                                 
            long tiempoI = System.nanoTime();                                       
            int puntajeAcumulado = 0;                                               
            int[] temp = apuestas[i].getPosicionesCaballos();                             
            for (int j = 0; j < 10; j++) {                                          
                if (ordenLlegada[j] == temp[j]) {
                    puntajeAcumulado = puntajeAcumulado + (10 - j); 
                    
                }
            }
            apuestas[i].setPuntos(puntajeAcumulado);
            tiempoEjecucion += (System.nanoTime() - tiempoI);
        }
        this.tiempoPromedioResultados = tiempoEjecucion / apuestas.length;
        return apuestas;
    }
    
    public void GuardarResultadosObtenidos(Apuesta[] apuestas){
        String texto ="";
        for (int i = 0; i < apuestas.length; i++) {
           texto+= apuestas[i].toString();
        }
        GuardarDatos guardar = new GuardarDatos();
        guardar.guardar(texto);
    }
    
    public int parserCombo(JComboBox lugar) {
        try {
            return Integer.parseInt(lugar.getSelectedItem().toString());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Campo Vacio presente en el ingreso de datos", "ERROR", JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }
}
