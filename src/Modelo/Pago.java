/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Timestamp;

/**
 *
 * @author Leonardo
 */
public class Pago {
    private String formaPago, concepto_pago;
    private Timestamp fecha_pago;
    private int numero_factura, valor_total;
    private Cliente unCliente;
    private Empleado unEmpleado;
}
