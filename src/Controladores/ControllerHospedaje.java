/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelo.Habitacion;
import Modelo.Hospedaje;
import Modelo.HospedajeDAO;
import Modelo.Reserva;
import java.sql.Timestamp;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class ControllerHospedaje {
    public static int extraerId()
    {
        HospedajeDAO hd = new HospedajeDAO();  
        return hd.extraerUltimoId();
       
    } 
    
    
    
     public static ArrayList<Hospedaje> listadoHospedaje(int s)
    {
        ArrayList<Hospedaje> listado;
        listado = new ArrayList();
        HospedajeDAO a = new HospedajeDAO();
        listado = a.listadoHospedaje(s);
        return listado; 
    }


    public static int cambiarEstado(int idhospedaje,String estado)
    {
        HospedajeDAO a = new HospedajeDAO();
        int resultado =a.cambiarEstado(idhospedaje,estado);
        return resultado; 
    } 
    
    
    
    
    
    
    
    
    
    
    
    
    
    static int numeroReserva;
    static int numEmpleado;
    
    
   
        
    
    
    public static void setNumEmpleado(int numEmpl) {
        numEmpleado = numEmpl;
    }


    public static void setNumeroReserva(int numeroReserva) {
        ControllerHospedaje.numeroReserva = numeroReserva;
    }

    

    public static int getNumEmpleado() {
        return numEmpleado;
    }
    
    
    public static Hospedaje getReserva(int idcliente){
        HospedajeDAO modelo = new HospedajeDAO();    
        return modelo.getReserva(idcliente);
    }
    
    
    public static ArrayList<Habitacion> loadListRooms
                (Timestamp fi,Timestamp fs,String modo,int numReserva){
        HospedajeDAO modeloHab = new HospedajeDAO();
        return  modeloHab.listadoHabitacion(fi, fs, modo, numReserva); 
    }
    

    
    public static ArrayList<Hospedaje> listarReservas(){
        HospedajeDAO modelo = new HospedajeDAO(); 
        return modelo.listadoReservas();
    }
    
    
    public static int registrarReserva(Hospedaje h) {
        int resultado = 0;
        HospedajeDAO modelo = new HospedajeDAO();
        resultado = modelo.registrarReserva(h);
        if (resultado == 1) {
            gestionMensajes("Registro Grabado con éxito",
                    "Confirmación", JOptionPane.INFORMATION_MESSAGE);
            return 1;
        } else {
            return 0;
        }
    }
   
    
        
    
    public static ArrayList<Hospedaje> listarReservasLike(int numReserva){
        HospedajeDAO modelo = new HospedajeDAO();
        return modelo.listReservasLike(numReserva);
    }
    
    
    
    public static int eliminarReserva(int ID) {
        HospedajeDAO modelo = new HospedajeDAO();
        if (modelo.borrarReserva(ID) == 1) {
            gestionMensajes(
                    "Registro Borrado con éxtio",
                    "Confirmación de acción",
                    JOptionPane.INFORMATION_MESSAGE);
            return 1;
        } else {
            gestionMensajes(
                    "Error al borrar",
                    "Confirmación de acción",
                    JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }
    
    public static int actualizarReserva(Hospedaje reserva){
         HospedajeDAO modelo = new HospedajeDAO();
        if (modelo.modificarReserva(reserva) == 1) {
            gestionMensajes(
                    "Actualización exitosa",
                    "Confirmación ",
                    JOptionPane.INFORMATION_MESSAGE);
            return 1;
        } else {
            gestionMensajes(
                    "Actualización Falida",
                    "Confirmación ",
                    JOptionPane.ERROR_MESSAGE);
            return 0;
        }
        
    }
                        
        
    public static void gestionMensajes(String mensaje, String titulo, int icono) {
        JOptionPane.showMessageDialog(null, mensaje, titulo, icono);
    }
}
