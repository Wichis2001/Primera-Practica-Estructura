/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Apuesta;

/**
 *
 * @author luis
 */
public class Apuesta {
    private String nombreApostador;
    private Double montoApuesta;
    private int posicionesCaballos[];
    private int puntos;

    public Apuesta(String nombreApostador, Double montoApuesta, int[] posicionesCaballos) {
        this.nombreApostador = nombreApostador;
        this.montoApuesta = montoApuesta;
        this.posicionesCaballos = posicionesCaballos;
    }

    public String getNombreApostador() {
        return nombreApostador;
    }

    public void setNombreApostador(String nombreApostador) {
        this.nombreApostador = nombreApostador;
    }

    public Double getMontoApuesta() {
        return montoApuesta;
    }

    public void setMontoApuesta(Double montoApuesta) {
        this.montoApuesta = montoApuesta;
    }

    public int[] getPosicionesCaballos() {
        return posicionesCaballos;
    }

    public void setPosicionesCaballos(int[] posicionesCaballos) {
        this.posicionesCaballos = posicionesCaballos;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return "Apuesta{" + "nombreApostador=" + nombreApostador + ", montoApuesta=" + montoApuesta + ", puntos Recaudados=" + puntos + '}'+"\n";
    }
    
    
    
}
