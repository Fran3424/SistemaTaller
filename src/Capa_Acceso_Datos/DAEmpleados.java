/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capa_Acceso_Datos;

import Capa_Entidades.EntidadCliente;
import Capa_Entidades.EntidadEmpleado;
import Config.Config;
import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Fran
 */
public class DAEmpleados {
     private Connection _cnn;

    private String mensaje;
    public String getMensaje() {
        return mensaje;
    }

        public DAEmpleados() throws Exception{
        try {
            String url = Config.getConnectionString();
            _cnn = DriverManager.getConnection(url); //Clase de tipo interfaz
            mensaje = "";
        } catch (Exception ex) {
            throw ex;
        }
    }
    
    
    
  
    public int Insertar(EntidadEmpleado empleado) throws SQLException {
        int id_empleado = -1;
        String sentencia = "INSERT INTO Empleados(Nombre ,Apellido1,Apellido2,Telefono) VALUES(?,?,?,?) ";
        try {
            PreparedStatement ps = _cnn.prepareStatement(sentencia, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, empleado.getNombre());
            ps.setString(2, empleado.getApellido1());
            ps.setString(3, empleado.getApellido2());
            ps.setInt(4, empleado.getTelefono());
            ps.execute();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs != null && rs.next()) {
                id_empleado = rs.getInt(1);
                mensaje = "Cliente ingresado satisfactoriamente";
            }
        } catch (Exception ex) {
            throw ex;
        } finally {
            _cnn = null;
        }
        return id_empleado;
    }
    
    
    
       public int Modificar(EntidadEmpleado empleado) throws SQLException {
        int resultado = 0;
        String sentencia = "UPDATE Empleados SET Nombre=?,Apellido1=?,Apellido2=?,Telefono=? WHERE Id_Empleado=?";
        try {
            PreparedStatement ps = _cnn.prepareStatement(sentencia);
            ps.setString(1, empleado.getNombre());
            ps.setString(2, empleado.getApellido1());
            ps.setString(3, empleado.getApellido2());
            ps.setInt(4, empleado.getTelefono());
            ps.setInt(5, empleado.getId());
            
            resultado = ps.executeUpdate();
            if (resultado > 0) {
               mensaje = "Cliente modificado!"; 
            }

        } catch (Exception ex) {
            throw ex;
        } finally {
            _cnn = null;
        }
        return resultado;

    }
    
    
    public int Eliminar(EntidadEmpleado empleado) throws SQLException {
        int resultado = 0;
        String sentencia = "DELETE FROM Empleados WHERE Id_Empleado=?";
        try {
            PreparedStatement ps = _cnn.prepareStatement(sentencia);
            ps.setInt(1, empleado.getId());       
            resultado = ps.executeUpdate();
            if (resultado > 0) {
               mensaje = "Cliente eliminado!"; 
            }
        } catch (Exception ex) {
            throw ex;
        } finally {
            _cnn = null;
        }
        return resultado;

    }
    
    
 
    public List<EntidadEmpleado> ListarEmpleados(String condicion) throws SQLException{
        ResultSet rs = null;
        List<EntidadEmpleado> lista = new ArrayList();
        try {
            Statement stm = _cnn.createStatement();
            String sentencia = "SELECT Id_Empleado,Nombre,Apellido1,Apellido2,Telefono  FROM Empleados";
            if (!condicion.equals("")) {
                sentencia = String.format("%s WHERE %s", sentencia, condicion);
            }
            rs = stm.executeQuery(sentencia);
            while(rs.next()){
                lista.add(new EntidadEmpleado(rs.getInt("Id_Empleado"),
                                             rs.getString("Nombre"),
                                             rs.getString("Apellido1"),
                                             rs.getString("Apellido2"),
                                             rs.getInt("Telefono")
                                            
                ));
            }
        } catch (Exception ex) {
            Component parentComponent = null;
            JOptionPane.showMessageDialog(parentComponent,"Shir");
        } finally {
            _cnn = null;
        }     
        return lista;
    }
    
    
    
    
    public EntidadEmpleado ObtenerUnEmpleado(String condicion) throws SQLException{
        ResultSet rs = null;
        EntidadEmpleado empleado = new EntidadEmpleado();
        try {
            Statement stm = _cnn.createStatement();
            String sentencia = "Select Id_Empleado , Nombre , Apellido1 , Apellido2 , Telefono  from Empleados";
            if (!condicion.equals("")) {
                sentencia = String.format("%s WHERE %s", sentencia, condicion);
            }
            rs = stm.executeQuery(sentencia);
            if (rs.next()) {
                empleado.setId(rs.getInt(1));
                empleado.setNombre(rs.getString(2));
                empleado.setApellido1(rs.getString(3));
                empleado.setApellido2(rs.getString(4));
                empleado.setTelefono(rs.getInt(5));
                empleado.setExiste(true);
            }

        } catch (Exception ex) {
            throw ex;
        } finally {
            _cnn = null;
        }
        return empleado;
    }
    
}
