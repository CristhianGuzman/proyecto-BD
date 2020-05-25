/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Jpanel;

import java.util.ArrayList;
import Controladores.ControladorCliente;
import Modelo.Cliente;
import Vistas.Jframe.Clientes;
import javax.swing.JOptionPane;

/**
 *
 * @author nicol
 */
public class ClienteListaGUI extends javax.swing.JPanel {

    ControladorCliente controladorCliente = new ControladorCliente();
    private ArrayList<jPcliente> clientes;
    Clientes panel_prin;

    /**
     * Creates new form ClienteListaGUI
     */
    public ClienteListaGUI(Clientes c) {
        this.panel_prin = c;
        clientes = new ArrayList<>();
        initComponents();
        CargarLista(0);
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
        jScrollPane3 = new javax.swing.JScrollPane();
        jPmensajes = new javax.swing.JPanel();
        jTbuscador = new javax.swing.JTextField();
        jBbuscar = new javax.swing.JButton();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ContornoHabitacion.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 84, -1, -1));

        jScrollPane3.setBorder(null);
        jScrollPane3.setHorizontalScrollBar(null);

        jPmensajes.setBackground(new java.awt.Color(255, 255, 255));
        jPmensajes.setLayout(new java.awt.GridLayout(0, 3, 0, 1));
        jScrollPane3.setViewportView(jPmensajes);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 90, 710, 340));

        jTbuscador.setFont(new java.awt.Font("Decker", 0, 15)); // NOI18N
        jTbuscador.setForeground(new java.awt.Color(191, 191, 191));
        jTbuscador.setText("Buscar cliente por ID");
        jTbuscador.setBorder(null);
        jTbuscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTbuscadorActionPerformed(evt);
            }
        });
        add(jTbuscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 47, 174, 19));

        jBbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar-azul.png"))); // NOI18N
        jBbuscar.setBorder(null);
        jBbuscar.setBorderPainted(false);
        jBbuscar.setContentAreaFilled(false);
        jBbuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add(jBbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 44, 24, 24));
    }// </editor-fold>//GEN-END:initComponents

    private void jTbuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTbuscadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTbuscadorActionPerformed

    private void cleanLista() {

        clientes.clear();
        jPmensajes.removeAll();
        jPmensajes.revalidate();
        jPmensajes.repaint();

    }

    public void CargarLista(int id) {

        ArrayList<Cliente> listaClientes = new ArrayList<>();
        listaClientes = ControladorCliente.listClients(0);

        for (int i = 0; i < listaClientes.size(); i++) {
            int cedula = listaClientes.get(i).getID();

            String telefono = listaClientes.get(i).getTelefono();

            String nombre = listaClientes.get(i).getNombre() + " "
                    + listaClientes.get(i).getApellido();
            String correo = listaClientes.get(i).getCorreo();
            jPcliente jp = new jPcliente(listaClientes.get(i), panel_prin);
            if (id == 0) {
                clientes.add(jp);
            } else {
                if (id == cedula) {
                    cleanLista();
                    clientes.add(jp);
                    break;
                } else {
                    cleanLista();
                    jPmensajes.add(
                            new jPmensaje("Tu búsqueda no tuvo resultados!"));
                }
            }

        }

        //LA LISTA ES CARGADA EN UN JPANEL 
        for (int i = 0; i < clientes.size(); i++) {
            jPmensajes.add(clientes.get(i));
            jPmensajes.revalidate();
            jPmensajes.repaint();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPmensajes;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTbuscador;
    // End of variables declaration//GEN-END:variables
}
