/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Jpanel;

import Controladores.ControladorCliente;
import Modelo.Cliente;
import Vistas.Jframe.ClienteRecepcionista;
import Vistas.Jpanel.jPmensaje;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author nicol
 */
public class ClientesRegistradosGUI extends javax.swing.JPanel {

    /**
     * Creates new form ClientesRegistradosGUI
     */
    
    ControladorCliente Controladorcliente = new ControladorCliente();
    ClienteRecepcionista panel_prin;
    private ArrayList<jPclienteRecepcionista> clientes;

    
    public ClientesRegistradosGUI(ClienteRecepcionista cr) {
        this.panel_prin = cr;
        clientes = new ArrayList<>();
        initComponents();
        cargarLista(0);
    }
    
    public void cargarLista(Integer id) {
        try{
            ArrayList<Cliente> listadoCli = new ArrayList<>();
            listadoCli = Controladorcliente.listClients(0);

            jPcontenido.removeAll();
            for (int i = 0; i < listadoCli.size(); i++) {
                jPclienteRecepcionista jpcli = new 
                    jPclienteRecepcionista(listadoCli.get(i), panel_prin);
                if(id==0 || jTbuscador.getText()==""){
                    clientes.add(jpcli);
                }else{
                    if (id==listadoCli.get(i).getID()) {
                        cleanLista();
                        clientes.add(jpcli);
                        break;
                    } else {
                        cleanLista();
                       jPcontenido.add(
                                new jPmensaje
                                         ("Tu búsqueda no tuvo resultados!"));
                    }
                }
                

            }
            for (int i = 0; i < clientes.size(); i++) {
                jPcontenido.add(clientes.get(i));
                jPcontenido.revalidate();
                jPcontenido.repaint();
            }
        }
        catch(Exception e){}

    }
    
    private void cleanLista(){
        
        clientes.clear();
        jPcontenido.removeAll();
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

        jTbuscador = new javax.swing.JTextField();
        jBbuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPcontenido = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTbuscador.setFont(new java.awt.Font("Decker", 0, 15)); // NOI18N
        jTbuscador.setForeground(new java.awt.Color(191, 191, 191));
        jTbuscador.setText("Buscar cliente por ID");
        jTbuscador.setBorder(null);
        jTbuscador.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTbuscadorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTbuscadorFocusLost(evt);
            }
        });
        jTbuscador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTbuscadorMouseClicked(evt);
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
        add(jTbuscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 47, 174, 19));

        jBbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar-azul.png"))); // NOI18N
        jBbuscar.setBorder(null);
        jBbuscar.setBorderPainted(false);
        jBbuscar.setContentAreaFilled(false);
        jBbuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBbuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBbuscarMouseClicked(evt);
            }
        });
        add(jBbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 44, 24, 24));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setOpaque(false);

        jPcontenido.setBackground(new java.awt.Color(255, 255, 255));
        jPcontenido.setLayout(new java.awt.GridLayout(0, 1, 0, 1));
        jScrollPane2.setViewportView(jPcontenido);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 120, 810, 340));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MarcoListaCli.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 77, 830, 400));
    }// </editor-fold>//GEN-END:initComponents

    private void jTbuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTbuscadorActionPerformed
        
    }//GEN-LAST:event_jTbuscadorActionPerformed

    private void jTbuscadorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTbuscadorFocusLost
        // TODO add your handling code here
    }//GEN-LAST:event_jTbuscadorFocusLost

    private void jTbuscadorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTbuscadorFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTbuscadorFocusGained

    private void jBbuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBbuscarMouseClicked
       try {
            
            cleanLista();
            if (jTbuscador.getText().isEmpty()) {
                cargarLista(0);
            }
            if (jTbuscador.getText().matches("[0-9]*")) {
                cargarLista(Integer.parseInt(jTbuscador.getText()));
            } else {
                cleanLista();
                jPcontenido.add(new jPmensaje("Tu búsqueda no tuvo resultados!"));
            }

        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_jBbuscarMouseClicked

    private void jTbuscadorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTbuscadorKeyPressed
       
    }//GEN-LAST:event_jTbuscadorKeyPressed

    private void jTbuscadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTbuscadorMouseClicked
        
        if(jTbuscador.getText().equalsIgnoreCase("Buscar cliente por ID")){
            jTbuscador.setText("");
        } else{}
    }//GEN-LAST:event_jTbuscadorMouseClicked

    private void jTbuscadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTbuscadorKeyTyped
        int key = evt.getKeyCode();
        if(key == KeyEvent.VK_ENTER){
            if (jTbuscador.getText().isEmpty() || jTbuscador.getText() == "") {
                cargarLista(0);
            }else{
         cargarLista(Integer.parseInt(jTbuscador.getText()));
            }
        }
    }//GEN-LAST:event_jTbuscadorKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPcontenido;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTbuscador;
    // End of variables declaration//GEN-END:variables
}
