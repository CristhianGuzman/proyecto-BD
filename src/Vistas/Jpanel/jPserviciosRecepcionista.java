/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Jpanel;

/**
 *
 * @author nicol
 */
public class jPserviciosRecepcionista extends javax.swing.JPanel {
       private String nombre;
       private double precio;
       private int cantidad;
    /**
     * Creates new form jPserviciosRecepcionista
     */
    public jPserviciosRecepcionista(String nombre_,double precio_, int cantidad_) {
        initComponents();
        jLnombre.setText(nombre_);
        jLprecio.setText(String.valueOf(precio_));
        jTcantidad.setText(String.valueOf(cantidad_));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLnombre = new javax.swing.JLabel();
        jLprecio = new javax.swing.JLabel();
        jTcantidad = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLnombre.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jLnombre.setForeground(new java.awt.Color(112, 112, 112));
        jLnombre.setText("Chocolate");
        add(jLnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 8, -1, -1));

        jLprecio.setFont(new java.awt.Font("Decker", 0, 12)); // NOI18N
        jLprecio.setForeground(new java.awt.Color(112, 112, 112));
        jLprecio.setText("55");
        add(jLprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 8, -1, -1));

        jTcantidad.setToolTipText("");
        jTcantidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(72, 159, 229), 2));
        add(jTcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 8, 21, 15));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 32, 170, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLnombre;
    private javax.swing.JLabel jLprecio;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTcantidad;
    // End of variables declaration//GEN-END:variables
}
