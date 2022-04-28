/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capa_Acceso_Datos;

import Capa_Entidades.EntidadCompraProducto;
import Capa_Entidades.EntidadEmpleado;
import Config.Config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Fran
 */
public class DACompras {
        private Connection _cnn;

    private String mensaje;
    public String getMensaje() {
        return mensaje;
    }

        public DACompras() throws Exception{
        try {
            String url = Config.getConnectionString();
            _cnn = DriverManager.getConnection(url); //Clase de tipo interfaz
            mensaje = "";
        } catch (Exception ex) {
            throw ex;
        }
    }
    
    
        
       public int Insertar(EntidadCompraProducto compra) throws SQLException {
        int id_orden = -1;
        String sentencia = "insert into Orden_Compras(Id_Producto,Id_Empleado,Cantidad,Descripcion) VALUES(?,?,?,?) ";
        try {
            PreparedStatement ps = _cnn.prepareStatement(sentencia, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, compra.getId_Producto());
            ps.setInt(2, compra.getId_Empleado());
            ps.setInt(3, compra.getCantidad());
            ps.setString(4, compra.getDescripcion());
            ps.execute();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs != null && rs.next()) {
                id_orden = rs.getInt(1);
                mensaje = "Cliente ingresado satisfactoriamente";
            }
        } catch (Exception ex) {
            throw ex;
        } finally {
            _cnn = null;
        }
        return id_orden;
    }
        
        
        
        
        
        
        
        
        
        
        
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
