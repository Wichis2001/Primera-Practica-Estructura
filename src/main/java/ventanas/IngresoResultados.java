/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import Apuesta.Apuesta;
import Apuesta.IngresoApuesta;
import datos.CargaDatos;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import manejadores.ManejadorIngresoApuesta;
import manejadores.ManejadorResultados;

/**
 *
 * @author luis
 */
public class IngresoResultados extends javax.swing.JFrame {
    
    private String archivoALeer;
    private Apuesta apuestas[];
    private ManejadorResultados manejador  = new ManejadorResultados();
    
    /**
     * Creates new form CargaApuestas
     */
    public IngresoResultados(Apuesta[] apuestas) {
        this.apuestas= apuestas;
        initComponents();
        this.setLocationRelativeTo(null);
        primerLugar.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        quintoLugar = new javax.swing.JComboBox<>();
        primerLugar = new javax.swing.JComboBox<>();
        segundoLugar = new javax.swing.JComboBox<>();
        tercerLugar = new javax.swing.JComboBox<>();
        cuartoLugar = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        decimoLugar = new javax.swing.JComboBox<>();
        sextoLugar = new javax.swing.JComboBox<>();
        septimoLugar = new javax.swing.JComboBox<>();
        octavoLugar = new javax.swing.JComboBox<>();
        novenoLugar = new javax.swing.JComboBox<>();
        Regresar = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Purisa", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("INGRESO DE RESULTADOS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 760, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/—Pngtree—horse racing vector logo design_5290315 (2)-modified.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 130, 90));

        jLabel5.setFont(new java.awt.Font("Purisa", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ingrese el Orden en el que considera que llegaran los Caballos:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, 20));

        jLabel7.setFont(new java.awt.Font("Purisa", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("5° Lugar");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, -1, -1));

        jLabel10.setFont(new java.awt.Font("Purisa", 3, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("1° Lugar");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, -1, -1));

        jLabel11.setFont(new java.awt.Font("Purisa", 3, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("2° Lugar");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, -1));

        jLabel12.setFont(new java.awt.Font("Purisa", 3, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("3° Lugar");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, -1, -1));

        jLabel13.setFont(new java.awt.Font("Purisa", 3, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("4° Lugar");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, -1, -1));

        quintoLugar.setBackground(new java.awt.Color(51, 102, 255));
        quintoLugar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        quintoLugar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                quintoLugarKeyPressed(evt);
            }
        });
        getContentPane().add(quintoLugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 50, -1));

        primerLugar.setBackground(new java.awt.Color(51, 102, 255));
        primerLugar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        primerLugar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                primerLugarKeyPressed(evt);
            }
        });
        getContentPane().add(primerLugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 50, -1));

        segundoLugar.setBackground(new java.awt.Color(51, 102, 255));
        segundoLugar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        segundoLugar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                segundoLugarKeyPressed(evt);
            }
        });
        getContentPane().add(segundoLugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 50, -1));

        tercerLugar.setBackground(new java.awt.Color(51, 102, 255));
        tercerLugar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        tercerLugar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tercerLugarKeyPressed(evt);
            }
        });
        getContentPane().add(tercerLugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 50, -1));

        cuartoLugar.setBackground(new java.awt.Color(51, 102, 255));
        cuartoLugar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cuartoLugar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cuartoLugarKeyPressed(evt);
            }
        });
        getContentPane().add(cuartoLugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 50, -1));

        jLabel14.setFont(new java.awt.Font("Purisa", 3, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("10° Lugar");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, -1, -1));

        jLabel15.setFont(new java.awt.Font("Purisa", 3, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("6° Lugar");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, -1, -1));

        jLabel16.setFont(new java.awt.Font("Purisa", 3, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("7° Lugar");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 260, -1, -1));

        jLabel17.setFont(new java.awt.Font("Purisa", 3, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("8° Lugar");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, -1, -1));

        jLabel18.setFont(new java.awt.Font("Purisa", 3, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("9° Lugar");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, -1, -1));

        decimoLugar.setBackground(new java.awt.Color(51, 102, 255));
        decimoLugar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        decimoLugar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                decimoLugarKeyPressed(evt);
            }
        });
        getContentPane().add(decimoLugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 350, 50, -1));

        sextoLugar.setBackground(new java.awt.Color(51, 102, 255));
        sextoLugar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        sextoLugar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sextoLugarKeyPressed(evt);
            }
        });
        getContentPane().add(sextoLugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 230, 50, -1));

        septimoLugar.setBackground(new java.awt.Color(51, 102, 255));
        septimoLugar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        septimoLugar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                septimoLugarKeyPressed(evt);
            }
        });
        getContentPane().add(septimoLugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, 50, -1));

        octavoLugar.setBackground(new java.awt.Color(51, 102, 255));
        octavoLugar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        octavoLugar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                octavoLugarKeyPressed(evt);
            }
        });
        getContentPane().add(octavoLugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, 50, -1));

        novenoLugar.setBackground(new java.awt.Color(51, 102, 255));
        novenoLugar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        novenoLugar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                novenoLugarKeyPressed(evt);
            }
        });
        getContentPane().add(novenoLugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 320, 50, -1));

        Regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regresar.png"))); // NOI18N
        Regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegresarMouseClicked(evt);
            }
        });
        getContentPane().add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 420, -1, -1));

        jLabel19.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabel19.setText("REGRESAR");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 500, -1, -1));

        jButton2.setBackground(new java.awt.Color(51, 102, 255));
        jButton2.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Registrar Resultados");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 240, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoCliente.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresarMouseClicked
        //Regresamos al menú de manejadores
        int response = JOptionPane.showConfirmDialog(this,"¿Quieres Regresar al inicio", "Regresar",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if (response==JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(this, "Regresando...");
            //Cerramos esta ventana y procedemos a mostrar el menu manejadores
            this.setVisible(false);
            CargaApuestas ventana = new CargaApuestas();
            ventana.setVisible(true);
        }
    }//GEN-LAST:event_RegresarMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        apuestas = manejador.calcularPuntosParticipantes(posicionesCarreraCaballos(), apuestas);
        manejador.GuardarResultadosObtenidos(apuestas);
        SeleccionReportes seleccion = new SeleccionReportes(apuestas);
        this.setVisible(false);
        seleccion.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void primerLugarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_primerLugarKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            segundoLugar.requestFocus();
        }
    }//GEN-LAST:event_primerLugarKeyPressed

    private void segundoLugarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_segundoLugarKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            tercerLugar.requestFocus();
        }
    }//GEN-LAST:event_segundoLugarKeyPressed

    private void tercerLugarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tercerLugarKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            cuartoLugar.requestFocus();
        }
    }//GEN-LAST:event_tercerLugarKeyPressed

    private void cuartoLugarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cuartoLugarKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            quintoLugar.requestFocus();
        }
    }//GEN-LAST:event_cuartoLugarKeyPressed

    private void quintoLugarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quintoLugarKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            sextoLugar.requestFocus();
        }
    }//GEN-LAST:event_quintoLugarKeyPressed

    private void sextoLugarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sextoLugarKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            septimoLugar.requestFocus();
        }
    }//GEN-LAST:event_sextoLugarKeyPressed

    private void septimoLugarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_septimoLugarKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            octavoLugar.requestFocus();
        }
    }//GEN-LAST:event_septimoLugarKeyPressed

    private void octavoLugarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_octavoLugarKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            novenoLugar.requestFocus();
        }
    }//GEN-LAST:event_octavoLugarKeyPressed

    private void novenoLugarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_novenoLugarKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            decimoLugar.requestFocus();
        }
    }//GEN-LAST:event_novenoLugarKeyPressed

    private void decimoLugarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_decimoLugarKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            jButton2.requestFocus();
        }
    }//GEN-LAST:event_decimoLugarKeyPressed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_RIGHT){
            primerLugar.requestFocus();
        }
    }//GEN-LAST:event_jButton2KeyPressed

   private int[] posicionesCarreraCaballos() {
        int[] posiciones = {manejador.parserCombo(primerLugar),manejador.parserCombo(segundoLugar), manejador.parserCombo(tercerLugar), manejador.parserCombo(cuartoLugar), manejador.parserCombo(quintoLugar), manejador.parserCombo(sextoLugar), manejador.parserCombo(septimoLugar), manejador.parserCombo(octavoLugar), manejador.parserCombo(novenoLugar), manejador.parserCombo(decimoLugar)};
        return posiciones;
    }
   
   
    
    private void reiniciarVariables(){
        primerLugar.setSelectedIndex(0);
        segundoLugar.setSelectedIndex(0);
        tercerLugar.setSelectedIndex(0);
        cuartoLugar.setSelectedIndex(0);
        quintoLugar.setSelectedIndex(0);
        sextoLugar.setSelectedIndex(0);
        septimoLugar.setSelectedIndex(0);
        octavoLugar.setSelectedIndex(0);
        novenoLugar.setSelectedIndex(0);
        decimoLugar.setSelectedIndex(0);
        primerLugar.requestFocus();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Regresar;
    private javax.swing.JComboBox<String> cuartoLugar;
    private javax.swing.JComboBox<String> decimoLugar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox<String> novenoLugar;
    private javax.swing.JComboBox<String> octavoLugar;
    private javax.swing.JComboBox<String> primerLugar;
    private javax.swing.JComboBox<String> quintoLugar;
    private javax.swing.JComboBox<String> segundoLugar;
    private javax.swing.JComboBox<String> septimoLugar;
    private javax.swing.JComboBox<String> sextoLugar;
    private javax.swing.JComboBox<String> tercerLugar;
    // End of variables declaration//GEN-END:variables
}
