/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capa_Acceso_Datos;

import Capa_Entidades.EntidadProducto;
import Capa_Entidades.Entidad_Servicio;
import Config.Config;
import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
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
public class DAProductos {
    
         private Connection _cnn;

    private String mensaje;
    public String getMensaje() {
        return mensaje;
    }

        public DAProductos() throws Exception{
        try {
            String url = Config.getConnectionString();
            _cnn = DriverManager.getConnection(url); //Clase de tipo interfaz
            mensaje = "";
        } catch (Exception ex) {
            throw ex;
        }
    }
    
    
    
    
    
    
     public List<EntidadProducto> ListarProductos(String condicion) throws SQLException{
        ResultSet rs = null;
        List<EntidadProducto> lista = new ArrayList();
        try {
            Statement stm = _cnn.createStatement();
            String sentencia = "Select Id_Producto,Cantidad,Nombre,Precio from Productos";
            if (!condicion.equals("")) {
                sentencia = String.format("%s WHERE %s", sentencia, condicion);
            }
            rs = stm.executeQuery(sentencia);
            while(rs.next()){
                lista.add(new EntidadProducto
                                            (rs.getInt("Id_Producto"),
                                             rs.getInt("Cantidad"),
                                             rs.getString("Nombre"),
                                             rs.getInt("Precio")
                                             
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
    

    
      public EntidadProducto ObtenerUnProducto(String condicion) throws SQLException{
        ResultSet rs = null;
        EntidadProducto servicio = new EntidadProducto();
        try {
            Statement stm = _cnn.createStatement();
            String sentencia = "Select Id_Producto,Cantidad,Nombre,Precio from Productos";
            if (!condicion.equals("")) {
                sentencia = String.format("%s WHERE %s", sentencia, condicion);
            }
            rs = stm.executeQuery(sentencia);
            if (rs.next()) {
                servicio.setId(rs.getInt(1));
                servicio.setCantidad(rs.getInt(2));
                servicio.setNombre(rs.getString(3));
                servicio.setPrecio(rs.getInt(4));
                servicio.setExiste(true);
            }

        } catch (Exception ex) {
            throw ex;
        } finally {
            _cnn = null;
        }
        return servicio;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
