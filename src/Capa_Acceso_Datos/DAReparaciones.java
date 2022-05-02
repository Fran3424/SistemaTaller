/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capa_Acceso_Datos;

import Capa_Entidades.EntidadAutomovil;
import Capa_Entidades.EntidadCliente;
import Capa_Entidades.EntidadEmpleado;
import Capa_Entidades.EntidadReparaciones;
import Config.Config;
import java.awt.Component;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Fran
 */
public class DAReparaciones {
    
        private Connection _cnn;

    private String mensaje;
    public String getMensaje() {
        return mensaje;
    }

        public DAReparaciones() throws Exception{
        try {
            String url = Config.getConnectionString();
            _cnn = DriverManager.getConnection(url); //Clase de tipo interfaz
            mensaje = "";
        } catch (Exception ex) {
            throw ex;
        }
    }
    
    
      
    public int Insertar(EntidadReparaciones reparacion) throws SQLException {
        int id_empleado = -1;
        String sentencia = "Insert into Reparaciones(Id_Servicio,Id_Empleado,Id_Automovil,FechaInicio,FechaFin,Monto) VALUES(?,?,?,?,?,?) ";
        try {
            PreparedStatement ps = _cnn.prepareStatement(sentencia, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, reparacion.getId_servicio());
            ps.setInt(2, reparacion.getId_empleado());
            ps.setInt(3, reparacion.getId_auto());
            ps.setDate(4,new java.sql.Date( reparacion.getFechaInicio().getTime())   );
            ps.setDate(5,new java.sql.Date( reparacion.getFechaInicio().getTime()) );
            ps.setInt(6,reparacion.getMonto());
            ps.execute();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs != null && rs.next()) {
                id_empleado = rs.getInt(1);
                mensaje = "Cliente ingresado satisfactoriamente";
            }
        } catch (Exception ex) {
            Component parentComponent = null;
            JOptionPane.showMessageDialog(parentComponent,ex);
        } finally {
            _cnn = null;
        }
        return id_empleado;
    }
    
    
      public List<EntidadReparaciones> ListarReparaciones(String condicion) throws SQLException{
        ResultSet rs = null;
        List<EntidadReparaciones> lista = new ArrayList();
        try {
            Statement stm = _cnn.createStatement();
            String sentencia = "Select Id_Reparacion,Id_Automovil,Id_Empleado,Id_Servicio,Monto,FechaInicio,FechaFin from Reparaciones";
            if (!condicion.equals("")) {
                sentencia = String.format("%s WHERE %s", sentencia, condicion);
            }
            rs = stm.executeQuery(sentencia);
            while(rs.next()){
                lista.add(new EntidadReparaciones(
                                             rs.getInt("Id_Reparacion"),
                                             rs.getInt("Id_Automovil"),
                                             rs.getInt("Id_Empleado"),
                                              rs.getInt("Id_Servicio"),
                                             rs.getDate("FechaInicio"),
                                              rs.getDate("FechaFin"),
                                              rs.getInt("Monto")
                                            
                                            
                ));
            }
        } catch (Exception ex) {
            Component parentComponent = null;
            JOptionPane.showMessageDialog(parentComponent,ex);
        } finally {
            _cnn = null;
        }     
        return lista;
    }
    
        public EntidadReparaciones ObtenerUnaReparacion(String condicion) throws SQLException{
        ResultSet rs = null;
        EntidadReparaciones cliente = new EntidadReparaciones();
        try {
            Statement stm = _cnn.createStatement();
            String sentencia = "Select Id_Reparacion,Id_Automovil,Id_Empleado,Id_Servicio,Monto,FechaInicio,FechaFin from Reparaciones";
            if (!condicion.equals("")) {
                sentencia = String.format("%s WHERE %s", sentencia, condicion);
            }
            rs = stm.executeQuery(sentencia);
            if (rs.next()) {
                cliente.setId(rs.getInt(1));
                cliente.setId_auto(rs.getInt(2));
                cliente.setId_empleado(rs.getInt(3));
                cliente.setId_servicio(rs.getInt(4));
                cliente.setMonto(rs.getInt(5));
                cliente.setFechaInicio(rs.getDate(6));
                 cliente.setFechaFin(rs.getDate(7));
                cliente.setExiste(true);
            }

        } catch (Exception ex) {
            throw ex;
        } finally {
            _cnn = null;
        }
        return cliente;
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
