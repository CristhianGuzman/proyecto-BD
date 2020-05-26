/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Jpanel;

import Controladores.ControllerHospedaje;
import Modelo.Hospedaje;
import Modelo.Reserva;
import Vistas.Jframe.Reservas;
import java.util.ArrayList;

/**
 *
 * @author nicol
 */
public class ListaReservasGUI extends javax.swing.JPanel {

    /**
     * Creates new form listaReservas
     */
    
    Reservas frame_reservas;
    public ListaReservasGUI(Reservas frame_reservas) {
        this.frame_reservas = frame_reservas;
        initComponents(); 
        ArrayList<Hospedaje> listaReservas;
        listaReservas = ControllerHospedaje.listarReservas();
        cargarListaReservas(listaReservas);   
    }
    
    
    
    public void establecerLayout(ArrayList<Hospedaje> listaReservas){
        //Establece un gridlayout al panel que contiene las reservas,
        //deacuerdo al numero de reservas que exista
        jPcontenido.removeAll();
        int row;
        if(listaReservas.size() < 6)
        {
            row = 6;
        }else{
            row = listaReservas.size();
        }
        jPcontenido.setLayout(new java.awt.GridLayout(row,1,1,1));
    }
    
    
    
    public void cargarListaReservas(ArrayList<Hospedaje> listaReservas){
        establecerLayout(listaReservas);
        
        for (int i = 0; i < listaReservas.size(); i++) {
            int num_res = listaReservas.get(i).getIdHospedaje();
            int id_cli = listaReservas.get(i).getIdCliente();
            int id_hab = listaReservas.get(i).getIdHabitacion();
            int cant_per = listaReservas.get(i).getNumeroPesonas();
            String fech_in = listaReservas.get(i).getFechaIngreso().toString();
            String fech_out = listaReservas.get(i).getFechaSalida().toString();
            jPreservasHospedaje jp = new jPreservasHospedaje
                        (num_res,id_cli,id_hab,cant_per,fech_in,fech_out);
            jp.setFrame_reservas(frame_reservas);
            jPcontenido.add(jp);  
        }
        jPcontenido.revalidate();
        jPcontenido.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPcontenido = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setOpaque(false);

        jPcontenido.setBackground(new java.awt.Color(255, 255, 255));
        jPcontenido.setAutoscrolls(true);
        jPcontenido.setLayout(new java.awt.GridLayout(1, 0));
        jScrollPane2.setViewportView(jPcontenido);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 140, 860, 330));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Marco.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 90, 880, 400));

        jTextField1.setFont(new java.awt.Font("Decker", 0, 15)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(191, 191, 191));
        jTextField1.setText("Buscar reserva por ID de cliente");
        jTextField1.setBorder(null);
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 47, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar-azul.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 44, 24, 24));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        ArrayList<Hospedaje> listaReservas;
        if(jTextField1.getText().equals("")){
            listaReservas = ControllerHospedaje.listarReservas();
            cargarListaReservas(listaReservas);
        }else{
            int numReserva = Integer.parseInt(jTextField1.getText());
            listaReservas = ControllerHospedaje.listarReservasLike(numReserva);
            cargarListaReservas(listaReservas);
        } 
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        jTextField1.setText("Buscar reserva por ID de cliente");
    }//GEN-LAST:event_jTextField1FocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPcontenido;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
