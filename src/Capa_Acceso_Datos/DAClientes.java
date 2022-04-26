/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capa_Acceso_Datos;

import Capa_Entidades.EntidadCliente;
import Capa_Entidades.EntidadPersona;
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
public class DAClientes {
    
   private Connection _cnn;


    private String mensaje;
    public String getMensaje() {
        return mensaje;
    }
    

       public DAClientes() throws Exception{
        try {
            String url = Config.getConnectionString();
            _cnn = DriverManager.getConnection(url); //Clase de tipo interfaz
            mensaje = "";
        } catch (Exception ex) {
            throw ex;
        }
    }
    
    

    public int Insertar(EntidadCliente cliente) throws SQLException {
        int id_cliente = -1;
        String sentencia = "INSERT INTO CLIENTES(Nombre ,Apellido1,Apellido2,Telefono) VALUES(?,?,?,?) ";
        try {
            PreparedStatement ps = _cnn.prepareStatement(sentencia, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellido1());
            ps.setString(3, cliente.getApellido2());
            ps.setInt(4, cliente.getTelefono());
            ps.execute();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs != null && rs.next()) {
                id_cliente = rs.getInt(1);
                mensaje = "Cliente ingresado Al sistema";
            }
        } catch (Exception ex) {
            Component parentComponent = null;
            JOptionPane.showMessageDialog(parentComponent,ex);
        } finally {
            _cnn = null;
        }
        return id_cliente;
    }
    
    
    
       public int Modificar(EntidadCliente cliente) throws SQLException {
        int resultado = 0;
        String sentencia = "UPDATE Clientes SET Nombre=?,Apellido1=?,Apellido2=?,Telefono=? WHERE Id_Cliente=?";
        try {
            PreparedStatement ps = _cnn.prepareStatement(sentencia);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellido1());
            ps.setString(3, cliente.getApellido2());
            ps.setInt(4, cliente.getTelefono());
            ps.setInt(5, cliente.getId());
            
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
    
    
    public int Eliminar(EntidadCliente cliente) throws SQLException {
        int resultado = 0;
        String sentencia = "DELETE FROM Clientes WHERE Id_Cliente=?";
        try {
            PreparedStatement ps = _cnn.prepareStatement(sentencia);
            ps.setInt(1, cliente.getId());       
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
    
    
    

    public List<EntidadCliente> ListarClientes(String condicion) throws SQLException{
        ResultSet rs = null;
        List<EntidadCliente> lista = new ArrayList();
        try {
            Statement stm = _cnn.createStatement();
            String sentencia = "SELECT Id_Cliente,Nombre,Apellido1,Apellido2,Telefono  FROM Clientes";
            if (!condicion.equals("")) {
                sentencia = String.format("%s WHERE %s", sentencia, condicion);
            }
            rs = stm.executeQuery(sentencia);
            while(rs.next()){
                lista.add(new EntidadCliente(rs.getInt("Id_Cliente"),
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
    
    
    
   
    public EntidadCliente ObtenerUnCliente(String condicion) throws SQLException{
        ResultSet rs = null;
        EntidadCliente cliente = new EntidadCliente();
        try {
            Statement stm = _cnn.createStatement();
            String sentencia = "Select Id_Cliente , Nombre , Apellido1 , Apellido2 , Telefono  from Clientes";
            if (!condicion.equals("")) {
                sentencia = String.format("%s WHERE %s", sentencia, condicion);
            }
            rs = stm.executeQuery(sentencia);
            if (rs.next()) {
                cliente.setId(rs.getInt(1));
                cliente.setNombre(rs.getString(2));
                cliente.setApellido1(rs.getString(3));
                cliente.setApellido2(rs.getString(4));
                cliente.setTelefono(rs.getInt(5));
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

