/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Jpanel;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author nicol
 */
public class HabitacionAgregarModificarGUI extends javax.swing.JPanel {
    
    /**
     * Creates new form HabitacionAgregarModificarGUI
     */
    String validador;
    
    public HabitacionAgregarModificarGUI() {
        initComponents();
        cargarTipoHabitacion();
        cargarNumCamas();
        validador = "guardar";
    }

    public void setValidador(String validador) {
        this.validador = validador;
    }

    public String getValidador() {
        return validador;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLidHabitacion = new javax.swing.JLabel();
        jLpiso = new javax.swing.JLabel();
        jLprecio = new javax.swing.JLabel();
        jLtipo = new javax.swing.JLabel();
        jLcapacidadPer = new javax.swing.JLabel();
        jLnumCamas = new javax.swing.JLabel();
        jBcancelar = new javax.swing.JButton();
        jTprecio = new javax.swing.JTextField();
        jBguardar = new javax.swing.JButton();
        jCnumeroCamas = new javax.swing.JComboBox();
        jTnumeroHabitacion = new javax.swing.JTextField();
        jCtipoHabi = new javax.swing.JComboBox();
        jTcapacidad = new javax.swing.JTextField();
        jTpiso = new javax.swing.JTextField();
        jLfondo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(241, 242, 246));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(739, 429));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Decker", 0, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(112, 112, 112));
        jLabel1.setText("Habitación");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 111, 85, 21));

        jLidHabitacion.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLidHabitacion.setForeground(new java.awt.Color(191, 191, 191));
        jLidHabitacion.setText("Número de habitación");
        add(jLidHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 162, 180, 20));

        jLpiso.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLpiso.setForeground(new java.awt.Color(191, 191, 191));
        jLpiso.setText("Piso");
        add(jLpiso, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 220, 180, 20));

        jLprecio.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLprecio.setForeground(new java.awt.Color(191, 191, 191));
        jLprecio.setText("Precio");
        add(jLprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 284, 180, 20));

        jLtipo.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLtipo.setForeground(new java.awt.Color(191, 191, 191));
        jLtipo.setText("Tipo de habitación");
        add(jLtipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 162, 180, 20));

        jLcapacidadPer.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLcapacidadPer.setForeground(new java.awt.Color(191, 191, 191));
        jLcapacidadPer.setText("Capacidad de personas");
        add(jLcapacidadPer, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 220, 180, 20));

        jLnumCamas.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLnumCamas.setForeground(new java.awt.Color(191, 191, 191));
        jLnumCamas.setText("Número de camas");
        add(jLnumCamas, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 284, 180, 20));

        jBcancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar-sinSeleccion.png"))); // NOI18N
        jBcancelar.setBorder(null);
        jBcancelar.setContentAreaFilled(false);
        jBcancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBcancelar.setInheritsPopupMenu(true);
        jBcancelar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar-seleccionado.png"))); // NOI18N
        jBcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcancelarActionPerformed(evt);
            }
        });
        add(jBcancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 371, 130, 50));

        jTprecio.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jTprecio.setForeground(new java.awt.Color(153, 153, 153));
        jTprecio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTprecio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTprecioFocusGained(evt);
            }
        });
        jTprecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTprecioKeyTyped(evt);
            }
        });
        add(jTprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 310, 276, 25));

        jBguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar-SinSele.png"))); // NOI18N
        jBguardar.setBorder(null);
        jBguardar.setContentAreaFilled(false);
        jBguardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBguardar.setInheritsPopupMenu(true);
        jBguardar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GuardarSele.png"))); // NOI18N
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });
        add(jBguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 371, -1, -1));

        jCnumeroCamas.setBackground(new java.awt.Color(241, 242, 246));
        jCnumeroCamas.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jCnumeroCamas.setForeground(new java.awt.Color(153, 153, 153));
        jCnumeroCamas.setOpaque(false);
        jCnumeroCamas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCnumeroCamasActionPerformed(evt);
            }
        });
        add(jCnumeroCamas, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 310, 276, 25));

        jTnumeroHabitacion.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jTnumeroHabitacion.setForeground(new java.awt.Color(153, 153, 153));
        jTnumeroHabitacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTnumeroHabitacion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTnumeroHabitacionFocusGained(evt);
            }
        });
        jTnumeroHabitacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTnumeroHabitacionKeyTyped(evt);
            }
        });
        add(jTnumeroHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 188, 276, 25));

        jCtipoHabi.setBackground(new java.awt.Color(241, 242, 246));
        jCtipoHabi.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jCtipoHabi.setForeground(new java.awt.Color(153, 153, 153));
        jCtipoHabi.setOpaque(false);
        add(jCtipoHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 188, 276, 25));

        jTcapacidad.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jTcapacidad.setForeground(new java.awt.Color(153, 153, 153));
        jTcapacidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTcapacidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTcapacidadFocusGained(evt);
            }
        });
        jTcapacidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTcapacidadKeyTyped(evt);
            }
        });
        add(jTcapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 246, 276, 25));

        jTpiso.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jTpiso.setForeground(new java.awt.Color(153, 153, 153));
        jTpiso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTpiso.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTpisoFocusGained(evt);
            }
        });
        jTpiso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTpisoKeyTyped(evt);
            }
        });
        add(jTpiso, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 246, 276, 25));

        jLfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ContornoHabitacion.png"))); // NOI18N
        jLfondo.setPreferredSize(new java.awt.Dimension(739, 429));
        add(jLfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 84, 726, 354));
    }// </editor-fold>//GEN-END:initComponents

    private void jCnumeroCamasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCnumeroCamasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCnumeroCamasActionPerformed

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jBguardarActionPerformed

    private void jBcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcancelarActionPerformed
        // TODO add your handling code here:
       setearCampos();
    }//GEN-LAST:event_jBcancelarActionPerformed

    private void jTpisoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTpisoKeyTyped
        // TODO add your handling code here:
        validaNumero(evt.getKeyChar(), evt);
        
    }//GEN-LAST:event_jTpisoKeyTyped

    private void jTpisoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTpisoFocusGained
        // TODO add your handling code here:
        if (jTpiso.getText().equalsIgnoreCase("****")){
            jTpiso.setForeground(Color.BLACK);
            jTpiso.setText("");
        }
        
    }//GEN-LAST:event_jTpisoFocusGained

    private void jTcapacidadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTcapacidadFocusGained
        // TODO add your handling code here:
        if (jTcapacidad.getText().equalsIgnoreCase("****")){
            jTcapacidad.setForeground(Color.BLACK);
            jTcapacidad.setText("");
        }
    }//GEN-LAST:event_jTcapacidadFocusGained

    private void jTprecioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTprecioFocusGained
        // TODO add your handling code here:
        if (jTprecio.getText().equalsIgnoreCase("****")){
            jTprecio.setForeground(Color.BLACK);
            jTprecio.setText("");
        }
        
    }//GEN-LAST:event_jTprecioFocusGained

    private void jTnumeroHabitacionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTnumeroHabitacionFocusGained
        // TODO add your handling code here:
        if (jTnumeroHabitacion.getText().equalsIgnoreCase("****")){
            jTnumeroHabitacion.setForeground(Color.BLACK);
            jTnumeroHabitacion.setText("");
        }
        
    }//GEN-LAST:event_jTnumeroHabitacionFocusGained

    private void jTnumeroHabitacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTnumeroHabitacionKeyTyped
        // TODO add your handling code here:
        validaNumero(evt.getKeyChar(), evt);
    }//GEN-LAST:event_jTnumeroHabitacionKeyTyped

    private void jTcapacidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTcapacidadKeyTyped
        // TODO add your handling code here:
        validaNumero(evt.getKeyChar(), evt);
    }//GEN-LAST:event_jTcapacidadKeyTyped

    private void jTprecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTprecioKeyTyped
        // TODO add your handling code here:
        validaNumero(evt.getKeyChar(), evt);
    }//GEN-LAST:event_jTprecioKeyTyped

    /*public void Modificar(int numero_){
        
       //SE BUSCA EN LA BASE DE DATOS EL NÚMERO DE HABITACIÓN Y SE COMPARA
       /* Por hacer*/
   //    int numeroH = Integer.parseInt(jTnumeroHabitacion.getText());
        
     //  if(numero_ == numeroH){
           //LOS DATOS QUE DEVUELVE SE PONE EN LA INTERFAZ
     //  }
        
    //}
    
    
   
    public JButton getjBcancelar() {
        return jBcancelar;
    }

    public JButton getjBguardar() {
        return jBguardar;
    }

    public JTextField getjTcapacidad() {
        return jTcapacidad;
    }

    public JTextField getjTnumeroHabitacion() {
        return jTnumeroHabitacion;
    }

    public JTextField getjTpiso() {
        return jTpiso;
    }

    public JTextField getjTprecio() {
        return jTprecio;
    }

    public JComboBox getjCnumeroCamas() {
        return jCnumeroCamas;
    }

    public JComboBox getjCtipoHabi() {
        return jCtipoHabi;
    }
    
    
    //Mensajes
    public void gestionMensajes(String mensaje, String titulo, int icono) {
        JOptionPane.showMessageDialog(this, mensaje, titulo, icono);
    }
    
    //Metodo para cargar Tipo de habitacion a un combo box
    public void cargarTipoHabitacion (){
        DefaultComboBoxModel model;
        
        String [] arregloTipoHabitacion = new String [5];
        
        arregloTipoHabitacion[0] = "Seleccione...";
        arregloTipoHabitacion[1] = "SIMPLE";
        arregloTipoHabitacion[2] = "DOBLE";
        arregloTipoHabitacion[3] = "MATRIMONIAL";
        arregloTipoHabitacion[4] = "SUITES";
        
        model = new DefaultComboBoxModel (arregloTipoHabitacion);
        
        jCtipoHabi.setModel(model);
    }
    
    //Método para cargar número de camas en un combobox
    public void cargarNumCamas (){
        DefaultComboBoxModel model;
        
        String [] arregloNumeroCamas = new String [4];
        
        arregloNumeroCamas[0] = "Seleccione...";
        arregloNumeroCamas[1] = "1";
        arregloNumeroCamas[2] = "2";
        arregloNumeroCamas[3] = "3";
        
        model = new DefaultComboBoxModel (arregloNumeroCamas);
        
        jCnumeroCamas.setModel(model);
    }
    
    public int validarCampos() {
        int rtdo = 1;
        
        if (jTnumeroHabitacion.getText().equals("") || jTnumeroHabitacion.getText().equals("****")) {

            rtdo = 0;
            mostrarCamposVacios(jTnumeroHabitacion);

        }
        if (jTpiso.getText().equals("") || jTpiso.getText().equals("****")) {

            rtdo = 0;
            mostrarCamposVacios(jTpiso);

        }
        if (jTcapacidad.getText().equals("") || jTcapacidad.getText().equals("****")) {
            
            rtdo = 0;
            mostrarCamposVacios(jTcapacidad);
        }
        if(jTprecio.getText().equals("") || jTprecio.getText().equals("****")) {
                  
            rtdo = 0;
            mostrarCamposVacios(jTprecio);
        }
        if(jCnumeroCamas.getSelectedItem().equals("Seleccione...") ){
          
            rtdo= 0;
            //animacionCombobox();
        }
        
        if(jCtipoHabi.getSelectedItem().equals("Seleccione...")){
          
            rtdo= 0;
            //animacionCombobox();
        }       
  
        return rtdo;
    }
    
    /*public void animacionCombobox(){
        
        Thread obj = new Thread();
        
        try {
            jCtipoHabi.setBackground(Color.blue);
            obj.sleep(3000);
            jCtipoHabi.setBackground(Color.white);
            obj.sleep(3000);
            jCtipoHabi.setBackground(Color.blue);
            obj.sleep(3000);
            jCtipoHabi.setBackground(Color.yellow);
        } catch (InterruptedException ex) {
            Logger.getLogger(HabitacionAgregarModificarGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/
    
    

    public void mostrarCamposVacios(JTextField jt) {
        jt.setForeground(Color.blue);
        jt.setText("****");

    }
    
    public void validaNumero(char c, KeyEvent evt) {
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }
    
    public void setearCampos() {

        jTnumeroHabitacion.setText("");
        jTpiso.setText("");
        jTcapacidad.setText("");
        jTprecio.setText("");
        jCtipoHabi.setSelectedIndex(0);
        jCnumeroCamas.setSelectedIndex(0);
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBcancelar;
    private javax.swing.JButton jBguardar;
    private javax.swing.JComboBox jCnumeroCamas;
    private javax.swing.JComboBox jCtipoHabi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLcapacidadPer;
    private javax.swing.JLabel jLfondo;
    private javax.swing.JLabel jLidHabitacion;
    private javax.swing.JLabel jLnumCamas;
    private javax.swing.JLabel jLpiso;
    private javax.swing.JLabel jLprecio;
    private javax.swing.JLabel jLtipo;
    private javax.swing.JTextField jTcapacidad;
    private javax.swing.JTextField jTnumeroHabitacion;
    private javax.swing.JTextField jTpiso;
    private javax.swing.JTextField jTprecio;
    // End of variables declaration//GEN-END:variables
}

