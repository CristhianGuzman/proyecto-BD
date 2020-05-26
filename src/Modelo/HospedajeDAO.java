/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Servicios.Fachada;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class HospedajeDAO {
    private void mensajeError(SQLException ex){

        JOptionPane.showMessageDialog(null,"Código "+
                    ex.getErrorCode() + "\n Error" + ex.getMessage());
    }
    //--------------------------------------------------------------------------
    
    
    
    
    
    
    

    public int extraerUltimoId()
    {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        int id = 0;       
        try {
            con = Fachada.getConnection();
            String sql = "";

            sql = "select  max(id_hospedaje) as id_hospedaje from hospedaje";
            
            pstm = con.prepareStatement(sql);
            
            rs = pstm.executeQuery();
            
            while (rs.next()) {
                id = rs.getInt("id_hospedaje");
                
            }
        } catch (SQLException ex) {
            mensajeError(ex);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstm != null) {
                    pstm.close();
                }
            } catch (SQLException ex) {
                mensajeError(ex);
            }
        }
        return id;
    }
    //--------------------------------------------------------------------------
    
    
    
    public ArrayList<Hospedaje> listadoHospedaje(int s){ 
          //si s=1 entonces muestra una vista con datos de la habitacion
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ArrayList<Hospedaje> listado = new ArrayList<>();
        try{
            con = Fachada.getConnection();
            String sql="";
            if(s==0){
                sql = "SELECT * FROM hospedaje WHERE estado = 'ACTIVO'"; //---------           
            }else{
                sql = "SELECT * FROM datos_hospedaje "//---------
                    + "ORDER BY id_hospedaje";      
            }                     
            pstm = con.prepareStatement(sql);            
            
            rs = pstm.executeQuery();
                        
           Hospedaje h = null;
            while(rs.next()){
                if(s==0){                    
                    h = new Hospedaje(
                        rs.getInt("id_hospedaje"),
                        rs.getInt("id_habitacion"),
                        rs.getInt("id_cliente"),
                        rs.getInt("id_empleado"),
                        rs.getTimestamp("fecha_ingreso"),
                        rs.getTimestamp("fecha_salida"),
                        rs.getInt("num_personas"),
                        rs.getString("estado")  
                          
                    );           
                } else {
                    h = new Hospedaje(
                        rs.getInt("id_hospedaje"),
                        rs.getInt("habitacion"),
                        rs.getInt("cedula_cliente"),
                        rs.getInt("piso")
                    );
                }
                listado.add(h);
            }
        }
        catch(SQLException ex){
            mensajeError(ex);
        }
        finally{
            try{
                if(rs!=null) rs.close();
                if(pstm!=null) pstm.close();                
            }
            catch(SQLException ex){
                mensajeError(ex);
            }
        }
        return listado;
    }
    //--------------------------------------------------------------------------
    public int cambiarEstado(int idHospedaje, String estado){      
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "UPDATE hospedaje " +
                       "SET estado = ?"
                    + " WHERE id_hospedaje=?";
            pstm = con.prepareStatement(sql);
            pstm.setString(1, estado);            
            pstm.setInt(2, idHospedaje);
            
            
            rtdo = pstm.executeUpdate();  
        }
        catch(SQLException ex){
            mensajeError(ex);
        }
        finally{
            try{
                if(pstm!=null) pstm.close();                
            }
            catch(SQLException ex){
                mensajeError(ex);
            }
        }
        return rtdo;
    }
    
    
     
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
    
    
    
    
    
    
    
    
    

    
    
    
    public int registrarReserva(Hospedaje hospedaje){
        
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
       try{
            con = Fachada.getConnection();
            String sql = "INSERT INTO Hospedaje (id_hospedaje,id_habitacion,"
                    + "id_cliente,id_empleado,FECHA_INGRESO,FECHA_SALIDA,"
                    + "FECHA_ACTUALIZACION, NUM_PERSONAS,estado) "
                    + "VALUES (?,?,?,?,?,?,?,?,?)";
            System.out.println("num "+hospedaje.getIdHospedaje());
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, hospedaje.getIdHospedaje());
            pstm.setInt(2, hospedaje.getIdHabitacion());
            pstm.setInt(3, hospedaje.getIdCliente());
            pstm.setInt(4, hospedaje.getIdEmpleado());
            pstm.setTimestamp(5, hospedaje.getFechaIngreso());
            pstm.setTimestamp(6, hospedaje.getFechaSalida());
            pstm.setTimestamp(7, hospedaje.getfAcutalizacion());
            pstm.setInt(8, hospedaje.getNumeroPesonas());
            pstm.setString(9, hospedaje.getEstado());
            
            
            
            
            rtdo = pstm.executeUpdate();  
        }
        catch(SQLException ex){
            //mensajeError(ex);
        }
        finally{
            try{
                if(pstm!=null) pstm.close();                
            }
            catch(SQLException ex){
                //mensajeError(ex);
            }
        }
        return rtdo;
    }
    
    
    public ArrayList <Hospedaje> listadoReservas(){      
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ArrayList <Hospedaje> listadoReservas = new ArrayList<>();
        try{
            con = Fachada.getConnection(); 
            String sql="";
                       
            sql = "SELECT * FROM Hospedaje WHERE "
                    + "estado = 'RESERVA' ORDER BY fecha_ingreso";   
            
            
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            Hospedaje hospedaje = null;
            
            while(rs.next()){
                
                hospedaje = new Hospedaje();
                hospedaje.setIdHospedaje(rs.getInt("id_hospedaje"));
                hospedaje.setIdHabitacion(rs.getInt("id_habitacion"));
                hospedaje.setIdCliente(rs.getInt("id_cliente"));
                hospedaje.setIdEmpleado(rs.getInt("id_empleado"));
                hospedaje.setfAcutalizacion(rs.getTimestamp("fecha_actualizacion"));
                hospedaje.setFechaIngreso(rs.getTimestamp("fecha_ingreso"));
                hospedaje.setFechaSalida(rs.getTimestamp("fecha_salida"));
                hospedaje.setNumeroPesonas(rs.getInt("num_personas"));
                listadoReservas.add(hospedaje);
            }
        }
        catch(SQLException ex){
            mensajeError(ex);
        }
        finally{
            try{
                if(rs!=null) rs.close();
                if(pstm!=null) pstm.close();                
            }
            catch(SQLException ex){
                mensajeError(ex);
            }
        }
        return listadoReservas;
    }
    
    
    public  ArrayList <Hospedaje> listReservasLike(int i){      
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ArrayList <Hospedaje> listadoReservas = new ArrayList<>();
        try{
            con = Fachada.getConnection(); 
            String sql="";
                       
            sql = " select * from hospedaje where "
                    + "estado = 'RESERVA' AND "
                    + "(SELECT CAST (id_cliente AS varchar(1))) like '"+i+"%'";   
            
            
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            Hospedaje hospedaje = null;
            
            while(rs.next()){
                
                hospedaje = new Hospedaje();
                hospedaje.setIdHospedaje(rs.getInt("id_hospedaje"));
                hospedaje.setIdHabitacion(rs.getInt("id_habitacion"));
                hospedaje.setIdCliente(rs.getInt("id_cliente"));
                hospedaje.setIdEmpleado(rs.getInt("id_empleado"));
                hospedaje.setfAcutalizacion(rs.getTimestamp("fecha_actualizacion"));
                hospedaje.setFechaIngreso(rs.getTimestamp("fecha_ingreso"));
                hospedaje.setFechaSalida(rs.getTimestamp("fecha_salida"));
                hospedaje.setNumeroPesonas(rs.getInt("num_personas"));
                listadoReservas.add(hospedaje);
            }
        }
        catch(SQLException ex){
            mensajeError(ex);
        }
        finally{
            try{
                if(rs!=null) rs.close();
                if(pstm!=null) pstm.close();                
            }
            catch(SQLException ex){
                mensajeError(ex);
            }
        }
        return listadoReservas;
    }
    
    
    
    
    
    public int modificarReserva(Hospedaje hospedaje){      
        Connection con = null;
        PreparedStatement pstm;
        pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "UPDATE hospedaje " 
                    +    "SET id_hospedaje = ?, id_habitacion = ?, id_cliente = ?,"
                    +    " id_empleado = ?, fecha_ingreso = ?, fecha_salida = ?,"
                    +    " fecha_actualizacion = ?, num_personas = ?"
                    +    "WHERE id_hospedaje = ?"; 

            pstm = con.prepareStatement(sql);   

            pstm.setInt(1, hospedaje.getIdHospedaje());
            pstm.setInt(2,hospedaje.getIdHabitacion());
            pstm.setInt(3, hospedaje.getIdCliente());
            pstm.setInt(4, hospedaje.getIdEmpleado());
            pstm.setTimestamp(5, hospedaje.getFechaIngreso());
            pstm.setTimestamp(6, hospedaje.getFechaSalida());
            pstm.setTimestamp(7, hospedaje.getfAcutalizacion());
            pstm.setInt(8, hospedaje.getNumeroPesonas());
            pstm.setInt(9, hospedaje.getIdHospedaje());

            rtdo = pstm.executeUpdate();  
        }
        catch(SQLException ex){
            mensajeError(ex);
        }
        finally{
            try{
                if(pstm!=null) pstm.close();                
            }
            catch(SQLException ex){
                mensajeError(ex);
            }
        }
        return rtdo;
    }
    
    
    
    public int borrarReserva(int id_hospedaje){      
        Connection con = null;
        PreparedStatement pstm = null;
        int rtdo;
        rtdo = 0;
        try{
            con = Fachada.getConnection();
            String sql = "DELETE FROM Hospedaje WHERE id_hospedaje = ?";
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, id_hospedaje);
            rtdo = pstm.executeUpdate(); 
            return rtdo;
        }
        catch(SQLException ex){
            mensajeError(ex);
        } 
        finally{
            try{
                if(pstm!=null) pstm.close();                
            }
            catch(SQLException ex){
                mensajeError(ex);
            }
        }
        return rtdo;
    }
    
    
    
    public Hospedaje getReserva(int idcliente)
    {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Hospedaje hospedaje = new Hospedaje();
        
        try {
            con = Fachada.getConnection();
            String sql = "";

            sql     = "SELECT * FROM hospedaje"      
                    + " WHERE id_cliente = ?"
                    + "AND ESTADO = 'RESERVA'";   
            
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, idcliente);
            rs = pstm.executeQuery();
            
            while (rs.next()) {
                hospedaje = new Hospedaje();
                hospedaje.setIdHospedaje(rs.getInt("id_Hospedaje"));
                hospedaje.setIdHabitacion(rs.getInt("id_habitacion"));
                hospedaje.setIdCliente(rs.getInt("id_cliente"));
                hospedaje.setIdEmpleado(rs.getInt("id_empleado"));
                hospedaje.setfAcutalizacion(rs.getTimestamp("fecha_actualizacion"));
                hospedaje.setFechaIngreso(rs.getTimestamp("fecha_ingreso"));
                hospedaje.setFechaSalida(rs.getTimestamp("fecha_salida"));
                hospedaje.setNumeroPesonas(rs.getInt("num_personas"));
                
            }
        } catch (SQLException ex) {
            mensajeError(ex);
         
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstm != null) {
                    pstm.close();
                }
            } catch (SQLException ex) {
                mensajeError(ex);
            }
        }
        return hospedaje;    
    }
    
    
    
    
    
    
    public ArrayList <Habitacion> listadoHabitacion
                        (Timestamp fi, Timestamp fs,String modo,int idHospedaje){      
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        ArrayList <Habitacion> listadoHabitacion = new ArrayList<>();
        try{
            con = Fachada.getConnection(); 
            String sql="";
            if(modo.equals("save")){
                sql = 
                  "SELECT * FROM HABITACION "
                + "WHERE ID_HABITACION "
                + "NOT IN "
                + "(SELECT ID_HABITACION FROM HOSPEDAJE "
                + "WHERE ((FECHA_INGRESO BETWEEN ? AND ?) "
                + "OR (FECHA_SALIDA BETWEEN ? AND ?)) "
                + "OR((? BETWEEN FECHA_INGRESO AND FECHA_SALIDA ) "
                + "AND (? BETWEEN FECHA_INGRESO AND FECHA_SALIDA))) "
                + "ORDER BY ID_HABITACION";

                
                pstm = con.prepareStatement(sql);
                pstm.setTimestamp(1, fi);
                pstm.setTimestamp(2, fs);
                pstm.setTimestamp(3, fi);
                pstm.setTimestamp(4, fs);
                pstm.setTimestamp(5, fi);
                pstm.setTimestamp(6, fs);
                
                
            }else if(modo.equals("update")){
                
                
                sql =
                  "SELECT * FROM HABITACION WHERE ID_HABITACION = "
                + "(SELECT ID_HABITACION FROM HOSPEDAJE WHERE ID_HOSPEDAJE = ?) " 
                + "AND ID_HABITACION NOT IN " 
                + "(SELECT HABITACION.ID_HABITACION FROM HABITACION , "        
                + "(SELECT * FROM HOSPEDAJE WHERE ID_HABITACION IN " 
                + "(SELECT ID_HABITACION FROM HOSPEDAJE WHERE ID_HOSPEDAJE = ?) "
                + "AND (FECHA_INGRESO BETWEEN ? AND ? OR " 
                + "FECHA_SALIDA BETWEEN ? AND ?))AS R " 
                + "WHERE R.ID_HABITACION = HABITACION.ID_HABITACION"
                + " AND R.ID_HOSPEDAJE <> ?) "
               
                        
                + "UNION SELECT * FROM HABITACION "
                + "WHERE ID_HABITACION "
                + "NOT IN "
                + "(SELECT ID_HABITACION FROM HOSPEDAJE "
                + "WHERE ((FECHA_INGRESO BETWEEN ? AND ?) "
                + "OR (FECHA_SALIDA BETWEEN ? AND ?)) "
                + "OR((? BETWEEN FECHA_INGRESO AND FECHA_SALIDA ) "
                + "AND (? BETWEEN FECHA_INGRESO AND FECHA_SALIDA))) "
                + "ORDER BY ID_HABITACION";
                
                pstm = con.prepareStatement(sql);
                pstm.setInt(1, idHospedaje);
                pstm.setInt(2, idHospedaje);
                pstm.setTimestamp(3, fi);
                pstm.setTimestamp(4, fs);
                pstm.setTimestamp(5, fi);
                pstm.setTimestamp(6, fs);
                pstm.setInt(7, idHospedaje);
                pstm.setTimestamp(8, fi);
                pstm.setTimestamp(9, fs);
                pstm.setTimestamp(10, fi);
                pstm.setTimestamp(11, fs);
                pstm.setTimestamp(12, fi);
                pstm.setTimestamp(13, fs);
            }
              
            rs = pstm.executeQuery();
            
                        
            Habitacion objhabitacion = null;
            while(rs.next()){
                
                objhabitacion = new Habitacion();
                objhabitacion.setId_habitacion(rs.getInt("id_habitacion"));
                objhabitacion.setTipo_habitacion(
                rs.getString("tipo_habitacion"));
                objhabitacion.setPiso(rs.getString("piso"));
                objhabitacion.setCantidadPersonas(
                rs.getInt("cantidad_personas"));
                objhabitacion.setPrecio_hab(rs.getInt("precio_hab"));
                objhabitacion.setNum_camas(rs.getInt("num_camas"));
                objhabitacion.setEstado(rs.getBoolean("estado"));
                listadoHabitacion.add(objhabitacion);
            }
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Código : " + 
                        ex.getErrorCode() + "\nError :" + ex.getMessage());
        }
        finally{
            try{
                if(rs!=null) rs.close();
                if(pstm!=null) pstm.close();                
            }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null,"Habitación : " + 
                        ex.getErrorCode() + "\nError :" + ex.getMessage());
            }
        }
        return listadoHabitacion;
    
    }
}

