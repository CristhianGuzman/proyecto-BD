/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Jpanel;

import java.awt.event.KeyEvent;
import Modelo.Reserva;
import Controladores.ControllerHospedaje;
import Modelo.Hospedaje;
import Controladores.ControladorCheckout;
import Controladores.ControllerHabitacion;
import Modelo.Checkout;
import javax.swing.JOptionPane;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
/**
 *
 * @author nicol
 */
public class CheckInReservaPreviaGUI extends javax.swing.JPanel {
    /*int idReserva;
    int idHabitacion;
    int idCliente;
    int idEmpleado;
    int numeroPersonas;
    String fechaReserva;
    String fechaIngreso;
    String fechSalida;
    */
    int numEmpleado;
    int comprobacion;
    /**
     * Creates new form CheckInReservaPreviaGUI
     */
    public CheckInReservaPreviaGUI(int ie) {
        numEmpleado = ie;
        initComponents();
    }
    
    private void agregarDatosReserva(){
     
      
      String id = jTbuscador.getText().trim();
      Hospedaje hospedaje = new Hospedaje();
      int idcliente;
      if(id.equalsIgnoreCase("")||
             id.equalsIgnoreCase("Buscar reserva por ID de cliente")){
            JOptionPane.showMessageDialog(null,
               " Debe ingresar la identificacion de un cliente "
                       + "para encontrar la reserva");
            vaciarCampos();
        }else if(id.length()>10){
           JOptionPane.showMessageDialog(null,
               "La identificación no debe de tener mas de 10 caracateres.");
            vaciarCampos();
       }
        else{
          idcliente = Integer.parseInt(id);
          hospedaje = ControllerHospedaje.getReserva(idcliente);
          if(hospedaje.getIdHospedaje()!=0){
              jLnumeroReserva.setText(hospedaje.getIdHospedaje()+"");
              jLidHabitacion.setText(hospedaje.getIdHabitacion()+"");
              jLidCliente.setText(hospedaje.getIdCliente()+"");
              jLidEmpleado.setText(hospedaje.getIdEmpleado()+"");
              jLnumeroPersonas.setText(hospedaje.getNumeroPesonas()+"");
              jLfechaReserva.setText(hospedaje.getfAcutalizacion()+"");
              jLfechaIngreso.setText(hospedaje.getFechaIngreso()+"");
              jLfechaSalida.setText(hospedaje.getFechaSalida()+"");
           }else {
              JOptionPane.showMessageDialog(null,
                 "No se encontro ninguna reserva con este ID,"
                       + " verifique si fue ingresado correctamente");
              vaciarCampos();
            }   
      }     
   }
    
   private void hacerHospedaje(String estado){
       
       
       int numReserva = Integer.parseInt(jLnumeroReserva.getText());
       
       int i = ControllerHospedaje.cambiarEstado(numReserva,estado);
       //---------------
      if(i==1){
          crearCheckout(numReserva);
          JOptionPane.showMessageDialog(null,
                 "Hospedaje registrado con exito."); 
            vaciarCampos();
      }
      else {
          JOptionPane.showMessageDialog(null,
                 "Ocurrio un error al realizar el Hospedaje.");
          vaciarCampos();
      }
   }
   
  private void vaciarCampos(){
               jLnumeroReserva.setText("  ");
              jLidHabitacion.setText("  ");
              jLidCliente.setText("  ");
              jLidEmpleado.setText("  ");
              jLnumeroPersonas.setText("  ");
              jLfechaReserva.setText("  ");
              jLfechaIngreso.setText("  ");
              jLfechaSalida.setText("  "); 
  }
  //----------------------------
   private void crearCheckout(int idhospedaje){
      Checkout c = new Checkout();
      ControladorCheckout co = new ControladorCheckout(); 
      ControllerHabitacion ch = new ControllerHabitacion();
      
      int valorTotal = numDias()*
             ch.getPrecioHabitacion(Integer.parseInt(jLidHabitacion.getText()));
      c.setIdCheckout(idhospedaje);
      c.setIdHospedaje(idhospedaje);
      c.setValorTotal(valorTotal);
      //c.setFpago(fp);
      co.grabarChekout(c);
  }
   
   
   private int numDias(){
       int dias=0;
       try {
       String fi = jLfechaIngreso.getText();
       String fs = jLfechaSalida.getText();
       fi = fi.substring(0, fi.indexOf(" "));
       fs = fs.substring(0, fs.indexOf(" "));
       SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");       
       Date fechaInicial = dateFormat.parse(fi);
       Date fechaFinal = dateFormat.parse(fs);
       dias=(int) ((fechaFinal.getTime()-fechaInicial.getTime())/86400000);      
       } catch(ParseException e){
        JOptionPane.showMessageDialog(null,
                 "Ocurrio un error al realizar el Hospedaje");
       } finally {
           return dias;
       }
    }
  //----------------------------
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLidHabitacion = new javax.swing.JLabel();
        jLidCliente = new javax.swing.JLabel();
        jLidEmpleado = new javax.swing.JLabel();
        jLfechaReserva = new javax.swing.JLabel();
        jLfechaIngreso = new javax.swing.JLabel();
        jLfechaSalida = new javax.swing.JLabel();
        jLnumeroPersonas = new javax.swing.JLabel();
        jLnumeroReserva = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTbuscador = new javax.swing.JTextField();
        jBcancelar = new javax.swing.JButton();
        jBcheckIn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLidHabitacion.setFont(new java.awt.Font("Decker", 0, 15)); // NOI18N
        jLidHabitacion.setForeground(new java.awt.Color(112, 112, 112));
        jLidHabitacion.setText("  ");
        add(jLidHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 185, 190, -1));

        jLidCliente.setFont(new java.awt.Font("Decker", 0, 15)); // NOI18N
        jLidCliente.setForeground(new java.awt.Color(112, 112, 112));
        jLidCliente.setText("  ");
        add(jLidCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 215, 300, -1));

        jLidEmpleado.setFont(new java.awt.Font("Decker", 0, 15)); // NOI18N
        jLidEmpleado.setForeground(new java.awt.Color(112, 112, 112));
        jLidEmpleado.setText("  ");
        add(jLidEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 245, 300, -1));

        jLfechaReserva.setFont(new java.awt.Font("Decker", 0, 15)); // NOI18N
        jLfechaReserva.setForeground(new java.awt.Color(112, 112, 112));
        jLfechaReserva.setText("  ");
        add(jLfechaReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 275, 255, -1));

        jLfechaIngreso.setFont(new java.awt.Font("Decker", 0, 15)); // NOI18N
        jLfechaIngreso.setForeground(new java.awt.Color(112, 112, 112));
        jLfechaIngreso.setText("  ");
        add(jLfechaIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 305, 260, -1));

        jLfechaSalida.setFont(new java.awt.Font("Decker", 0, 15)); // NOI18N
        jLfechaSalida.setForeground(new java.awt.Color(112, 112, 112));
        jLfechaSalida.setText("  ");
        add(jLfechaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 335, 260, -1));

        jLnumeroPersonas.setFont(new java.awt.Font("Decker", 0, 15)); // NOI18N
        jLnumeroPersonas.setForeground(new java.awt.Color(112, 112, 112));
        jLnumeroPersonas.setText("  ");
        add(jLnumeroPersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 365, 220, -1));

        jLnumeroReserva.setFont(new java.awt.Font("Decker", 1, 17)); // NOI18N
        jLnumeroReserva.setForeground(new java.awt.Color(112, 112, 112));
        jLnumeroReserva.setText("  ");
        add(jLnumeroReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(639, 143, 60, -1));

        jLabel10.setFont(new java.awt.Font("Decker", 1, 17)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(112, 112, 112));
        jLabel10.setText("Reserva");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(567, 143, 70, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar-azul.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 44, 24, 24));

        jTbuscador.setFont(new java.awt.Font("Decker", 0, 15)); // NOI18N
        jTbuscador.setForeground(new java.awt.Color(191, 191, 191));
        jTbuscador.setText("Buscar reserva por ID de cliente");
        jTbuscador.setBorder(null);
        jTbuscador.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTbuscadorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTbuscadorFocusLost(evt);
            }
        });
        jTbuscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTbuscadorActionPerformed(evt);
            }
        });
        jTbuscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTbuscadorKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTbuscadorKeyTyped(evt);
            }
        });
        add(jTbuscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 47, 210, -1));

        jBcancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar-sinSeleccion.png"))); // NOI18N
        jBcancelar.setBorder(null);
        jBcancelar.setBorderPainted(false);
        jBcancelar.setContentAreaFilled(false);
        jBcancelar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar-seleccionado.png"))); // NOI18N
        jBcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcancelarActionPerformed(evt);
            }
        });
        add(jBcancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 440, 125, 40));

        jBcheckIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Check-inBoton.png"))); // NOI18N
        jBcheckIn.setBorder(null);
        jBcheckIn.setContentAreaFilled(false);
        jBcheckIn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Check-in-seleccionado.png"))); // NOI18N
        jBcheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcheckInActionPerformed(evt);
            }
        });
        add(jBcheckIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 440, 125, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MostrarReserva.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 114, 660, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        agregarDatosReserva();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTbuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTbuscadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTbuscadorActionPerformed

    private void jTbuscadorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTbuscadorFocusGained

        jTbuscador.setText("");      
    }//GEN-LAST:event_jTbuscadorFocusGained

    private void jTbuscadorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTbuscadorFocusLost
        if(jTbuscador.getText().equalsIgnoreCase("")){ 
        jTbuscador.setText("Buscar reserva por ID de cliente");
        }
    }//GEN-LAST:event_jTbuscadorFocusLost

    private void jTbuscadorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTbuscadorKeyPressed
        int key = evt.getKeyCode();
        if(key == KeyEvent.VK_ENTER){
        agregarDatosReserva();
        }
    }//GEN-LAST:event_jTbuscadorKeyPressed

    private void jBcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcancelarActionPerformed

        vaciarCampos();      
    }//GEN-LAST:event_jBcancelarActionPerformed

    private void jTbuscadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTbuscadorKeyTyped
        char car = evt.getKeyChar();
        if((car<'0' || car>'9')) evt.consume();
    }//GEN-LAST:event_jTbuscadorKeyTyped

    private void jBcheckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcheckInActionPerformed
        if(!jLnumeroReserva.getText().equalsIgnoreCase("  ")){
           hacerHospedaje("ACTIVO");
        }else{   
          JOptionPane.showMessageDialog(null,
                  "Debe buscar una reserva primero.");
          vaciarCampos();
        }
    }//GEN-LAST:event_jBcheckInActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBcancelar;
    private javax.swing.JButton jBcheckIn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLfechaIngreso;
    private javax.swing.JLabel jLfechaReserva;
    private javax.swing.JLabel jLfechaSalida;
    private javax.swing.JLabel jLidCliente;
    private javax.swing.JLabel jLidEmpleado;
    private javax.swing.JLabel jLidHabitacion;
    private javax.swing.JLabel jLnumeroPersonas;
    private javax.swing.JLabel jLnumeroReserva;
    private javax.swing.JTextField jTbuscador;
    // End of variables declaration//GEN-END:variables
}
