/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Jpanel;


import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author nicol
 */
public class jPhabitacionCheckIn extends javax.swing.JPanel {
    int numeroHabitacion;
    String tipo;
    int precio;
    int capacidad;
    JTextField jLabelHab;

    public void setjThabitacion(JTextField jThabitacion) {
        this.jLabelHab = jThabitacion;
    }
    
    
    /**
     * Creates new form jPhabitacionCheckIn
     */
     public jPhabitacionCheckIn(){
     }
     
    public jPhabitacionCheckIn(int numeroHabitacion_,String tipo_,
        int precio_, int capacidad_) {
        initComponents();
        this.numeroHabitacion = numeroHabitacion_;
        this.tipo = tipo_;
        this.precio = precio_;
        this.capacidad = capacidad_;    
        jLnumero.setText(String.valueOf(numeroHabitacion_));
        jLtipo.setText(tipo_);
        jLprecio.setText(String.valueOf(precio_));
        jLcapacidad.setText(String.valueOf(capacidad_));
    }
    
    public void pintarPanel(){
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder
                            (2, 2, 2, 2, new java.awt.Color(0, 102, 255)));
    }
    
    
    public void setRoomSelected(){
            jLabelHab.setText(""+numeroHabitacion);
            pintarPanel();
            JPanel panel = (JPanel)getParent();
            for(int a = 0; a < panel.getComponentCount(); a++){
                if(!panel.getComponent(a).equals(this)){
                    jPhabitacionCheckIn panelsito;
                    panelsito = (jPhabitacionCheckIn)panel.getComponent(a);
                    panelsito.jButton1.setBorder(null);
                }   
            }
    }

    public JButton getjButton1() {
        return jButton1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLcapacidad = new javax.swing.JLabel();
        jLnumero = new javax.swing.JLabel();
        jLtipo = new javax.swing.JLabel();
        jLprecio = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLcapacidad.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jLcapacidad.setForeground(new java.awt.Color(112, 112, 112));
        jLcapacidad.setText("2");
        add(jLcapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 10, -1));

        jLnumero.setFont(new java.awt.Font("Decker", 1, 12)); // NOI18N
        jLnumero.setForeground(new java.awt.Color(0, 153, 255));
        jLnumero.setText("09");
        add(jLnumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 30, -1, -1));

        jLtipo.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jLtipo.setForeground(new java.awt.Color(112, 112, 112));
        jLtipo.setText("MATRIMONIAL");
        add(jLtipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 80, -1));

        jLprecio.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jLprecio.setForeground(new java.awt.Color(112, 112, 112));
        jLprecio.setText("56");
        add(jLprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 50, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/HabitacionChe.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/HabitacionSeleccion.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setRoomSelected();   
          
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLcapacidad;
    private javax.swing.JLabel jLnumero;
    private javax.swing.JLabel jLprecio;
    private javax.swing.JLabel jLtipo;
    // End of variables declaration//GEN-END:variables
}
