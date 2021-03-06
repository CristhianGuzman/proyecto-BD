/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Jpanel;

import Controladores.ControladorEmpleado;
import Modelo.Empleado;
import Vistas.Jframe.Empleados;
import java.sql.Timestamp;
import javax.swing.JOptionPane;

/**
 *
 * @author nicol
 */
public class EmpleadoFormulario extends javax.swing.JPanel {
    
    Empleados panel_prin;
    String validar_panel;

    /**
     * Creates new form EmpleadoAgregarModificarGUI
     */
    public EmpleadoFormulario(Empleados s) {
        
        this.panel_prin = s;
        initComponents();
    }
    
    public void setValidar(String value)
    {
        this.validar_panel = value;
    }
    
    public String getValidar()
    {
        return validar_panel;
    }

    
    public void llenarValores(Empleado datos){
        
        String Cedula = String.valueOf(datos.getID());
        jTcedula.setText(Cedula);
        jTnombre.setText(datos.getNombre() + " " + datos.getApellido());
        jTcargo.setText(datos.getCargo());
        jTcorreo.setText(datos.getCorreo());
        jTtelefono.setText(datos.getTelefono());
        jTsalario.setText(datos.getSalario() + "");
        jTdireccion.setText(datos.getDireccion());
        jCestado.removeAllItems();
        jCestado.addItem("Activo");
        jCestado.addItem("Inactivo");
        if (datos.getEstado() == true)
        {
            jCestado.setSelectedIndex(0);
        }else {
            jCestado.setSelectedIndex(1);
        }
    }
    
    
    public void limpiarCampos()
    {
        jTcedula.setText("");
        jTnombre.setText("");
        jTcargo.setText("");
        jTcorreo.setText("");
        jTtelefono.setText("");
        jTsalario.setText("");
        jTdireccion.setText("");
        jCestado.removeAllItems();
        jCestado.addItem("Activo");
        jCestado.addItem("Inactivo");
    }
    
    private Empleado registrarEmpleado()
    {
        int z = jCestado.getSelectedIndex();
        boolean h;
        if (z == 0)
        {
            h = true;
        } else
        {
            h = false;
        }
        
         
        Empleado empleado = new Empleado();
        empleado.setID(Integer.parseInt(jTcedula.getText()));
        empleado.setNombre(jTnombre.getText());
        empleado.setApellido("");
        empleado.setCargo(jTcargo.getText());
        empleado.setCorreo(jTcorreo.getText());
        empleado.setTelefono(jTtelefono.getText());
        empleado.setSalario(Integer.parseInt(jTsalario.getText()));
        empleado.setDireccion(jTdireccion.getText());
        empleado.setEstado(h);
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        empleado.setFechaIngreso(timestamp);
        
        return empleado;
    }
    
   
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBcancelar = new javax.swing.JButton();
        jBguardar = new javax.swing.JButton();
        jTcedula = new javax.swing.JTextField();
        jTnombre = new javax.swing.JTextField();
        jTtelefono = new javax.swing.JTextField();
        jTdireccion = new javax.swing.JTextField();
        jTapellido = new javax.swing.JTextField();
        jTcargo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTsalario = new javax.swing.JTextField();
        jTcorreo = new javax.swing.JTextField();
        jCestado = new javax.swing.JComboBox<>();
        jLfondo = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBcancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar-sinSeleccion.png"))); // NOI18N
        jBcancelar.setContentAreaFilled(false);
        jBcancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBcancelar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar-seleccionado.png"))); // NOI18N
        jBcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcancelarActionPerformed(evt);
            }
        });
        add(jBcancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 405, 130, 50));

        jBguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar-SinSele.png"))); // NOI18N
        jBguardar.setBorder(null);
        jBguardar.setBorderPainted(false);
        jBguardar.setContentAreaFilled(false);
        jBguardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBguardar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar-seleccionado.png"))); // NOI18N
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });
        add(jBguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 405, -1, -1));

        jTcedula.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jTcedula.setForeground(new java.awt.Color(153, 153, 153));
        jTcedula.setText("Cédula");
        jTcedula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTcedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTcedulaActionPerformed(evt);
            }
        });
        add(jTcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 148, 276, 25));

        jTnombre.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jTnombre.setForeground(new java.awt.Color(153, 153, 153));
        jTnombre.setText("Nombre");
        jTnombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        add(jTnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 198, 276, 25));

        jTtelefono.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jTtelefono.setForeground(new java.awt.Color(153, 153, 153));
        jTtelefono.setText("Teléfono");
        jTtelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        add(jTtelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 148, 276, 25));

        jTdireccion.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jTdireccion.setForeground(new java.awt.Color(153, 153, 153));
        jTdireccion.setText("Dirección");
        jTdireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        add(jTdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 198, 276, 25));

        jTapellido.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jTapellido.setForeground(new java.awt.Color(153, 153, 153));
        jTapellido.setText("Apellido");
        jTapellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTapellidoActionPerformed(evt);
            }
        });
        add(jTapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 248, 276, 25));

        jTcargo.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jTcargo.setForeground(new java.awt.Color(153, 153, 153));
        jTcargo.setText("Cargo");
        jTcargo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        add(jTcargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 248, 276, 25));

        jLabel2.setFont(new java.awt.Font("Decker", 0, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(112, 112, 112));
        jLabel2.setText("Empleado");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 94, -1, -1));

        jLabel1.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Estado");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 302, -1, -1));

        jTsalario.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jTsalario.setForeground(new java.awt.Color(153, 153, 153));
        jTsalario.setText("Salario");
        jTsalario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTsalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTsalarioActionPerformed(evt);
            }
        });
        add(jTsalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 298, 276, 25));

        jTcorreo.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jTcorreo.setForeground(new java.awt.Color(153, 153, 153));
        jTcorreo.setText("Correo");
        jTcorreo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTcorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTcorreoActionPerformed(evt);
            }
        });
        add(jTcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 348, 276, 25));

        jCestado.setBackground(new java.awt.Color(241, 242, 246));
        jCestado.setFont(new java.awt.Font("Decker", 0, 14)); // NOI18N
        jCestado.setForeground(new java.awt.Color(153, 153, 153));
        jCestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2" }));
        add(jCestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(589, 298, 220, 25));

        jLfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/marcoEmpleado.png"))); // NOI18N
        jLfondo.setPreferredSize(new java.awt.Dimension(739, 429));
        add(jLfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 73, 695, 388));
    }// </editor-fold>//GEN-END:initComponents

    private void jBcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcancelarActionPerformed
        
        if(validar_panel == "agregar")
        {
            limpiarCampos();
        } else
        {
            panel_prin.btnModificar();
        }

    }//GEN-LAST:event_jBcancelarActionPerformed

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
        
       if(validar_panel == "agregar")
        {
                ControladorEmpleado.grabarEmpleado(registrarEmpleado());
                JOptionPane.showMessageDialog(null, "Se ha agregado con éxito");
               
        } else
        {
            try
            {
                ControladorEmpleado.modificarEmpleado(registrarEmpleado());
                
            }
            catch (Error error)
            {
                JOptionPane.showMessageDialog(null, "Se ha producido un error "
                        + "modificando");
            }
            JOptionPane.showMessageDialog(null, "Se ha modificado con "
                        + "éxito");
            
        }

    }//GEN-LAST:event_jBguardarActionPerformed

    private void jTcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTcorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTcorreoActionPerformed

    private void jTapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTapellidoActionPerformed

    private void jTsalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTsalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTsalarioActionPerformed

    private void jTcedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTcedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTcedulaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBcancelar;
    private javax.swing.JButton jBguardar;
    private javax.swing.JComboBox<String> jCestado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLfondo;
    private javax.swing.JTextField jTapellido;
    private javax.swing.JTextField jTcargo;
    private javax.swing.JTextField jTcedula;
    private javax.swing.JTextField jTcorreo;
    private javax.swing.JTextField jTdireccion;
    private javax.swing.JTextField jTnombre;
    private javax.swing.JTextField jTsalario;
    private javax.swing.JTextField jTtelefono;
    // End of variables declaration//GEN-END:variables
}
