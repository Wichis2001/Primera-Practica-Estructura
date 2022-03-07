/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author luis
 */
public class GuardarDatos {
    JFileChooser seleccionar = new JFileChooser();
    FileInputStream entrada;
    FileOutputStream salida;
    File archivo;
    
     private String escribirArchivo(String documento) {
        String mensaje = null;
        try {
            salida = new FileOutputStream(archivo);
            byte[] bytxt = documento.getBytes();
            salida.write(bytxt);
            mensaje = "archivo guardado";
        } catch (IOException e) {
            System.out.println("error en guardar");
        }
        return mensaje;
    }

    public void guardar(String texto) {
        if (seleccionar.showDialog(null, "guaradar") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionar.getSelectedFile();
            if (archivo.getName().endsWith("txt")) {
                String documento = texto;
                String mensaje = escribirArchivo(documento);
                if (mensaje != null) {
                    JOptionPane.showMessageDialog(null, "Archivo Guardado Exitosamente", "GUARDAR", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Error al guarda archivo", "GUARDAR", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Guardar texto");
            }
        }
    }
}
