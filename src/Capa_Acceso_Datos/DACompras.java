/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capa_Acceso_Datos;

import Capa_Entidades.EntidadCompraProducto;
import Capa_Entidades.EntidadEmpleado;
import Capa_Entidades.EntidadProducto;
import Capa_Entidades.EntidadReparaciones;
import Config.Config;
import java.awt.Component;
import java.sql.CallableStatement;
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
        int resultado=-1;
        try {
            CallableStatement cllbst = _cnn.prepareCall("{call SP_INSERTAR_ORDEN_VERIFICACION(?,?,?,?,?,?)}");
            cllbst.setInt(1, compra.getCantidad());
            cllbst.setInt(2, compra.getId_Producto());
            cllbst.setInt(3, compra.getId_Empleado());
            cllbst.setString(4, compra.getDescripcion());
            cllbst.setInt(5, compra.getMonto());
            cllbst.setInt(6, resultado);
            cllbst.registerOutParameter(6, java.sql.Types.INTEGER);
            cllbst.execute();
 
            resultado=cllbst.getInt(6);
            
        
            if(resultado==0){
            mensaje="No se pudo hacer la orden de compra debido a que no hay suficiente cantidad del producto";
                 
            }
            else{
            mensaje="Orden registrada con exito se debera pagar esta orden para poder emitir una factura";
           
            
            }
            
            
            
            
        } catch (Exception ex) {
            throw ex;
        } finally {
            _cnn = null;
        }
        return id_orden;
    }
        
        
       public List<EntidadCompraProducto> ListarCompras(String condicion) throws SQLException{
        ResultSet rs = null;
        List<EntidadCompraProducto> lista = new ArrayList();
        try {
            Statement stm = _cnn.createStatement();
            String sentencia = "Select Id_Compra,Id_Empleado,Id_Producto,Monto,Descripcion,Cantidad from Orden_Compras";
            if (!condicion.equals("")) {
                sentencia = String.format("%s WHERE %s", sentencia, condicion);
            }
            rs = stm.executeQuery(sentencia);
            while(rs.next()){
                lista.add(new EntidadCompraProducto
                                            (rs.getInt("Id_Compra"),
                                             rs.getInt("Id_Empleado"),
                                             rs.getInt("Id_Producto"),
                                             rs.getInt("Monto"),
                                             rs.getString("Descripcion"),
                                             rs.getInt("Cantidad")
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
    

       
         public EntidadCompraProducto ObtenerUnaCompra(String condicion) throws SQLException{
        ResultSet rs = null;
        EntidadCompraProducto compra = new EntidadCompraProducto();
        try {
            Statement stm = _cnn.createStatement();
            String sentencia = "Select Id_Compra,Id_Empleado,Id_Producto,Monto,Descripcion,Cantidad from Orden_Compras";
            if (!condicion.equals("")) {
                sentencia = String.format("%s WHERE %s", sentencia, condicion);
            }
            rs = stm.executeQuery(sentencia);
            if (rs.next()) {
                compra.setId_Compra(rs.getInt(1));
                compra.setId_Empleado(rs.getInt(2));
                compra.setId_Producto(rs.getInt(3));
                compra.setMonto(rs.getInt(4));
                compra.setDescripcion(rs.getString(5));
                compra.setCantidad(rs.getInt(6));
                compra.setExiste(true);
            }

        } catch (Exception ex) {
            throw ex;
        } finally {
            _cnn = null;
        }
        return compra;
        
    }
    
        
        public int EliminarCompra(EntidadCompraProducto compra) throws SQLException {
        int id_orden = -1;
        int resultado=-1;
        try {
            CallableStatement cllbst = _cnn.prepareCall("{call  SP_ELIMINAR_ORDEN_VERIFICACION(?,?)}");
            cllbst.setInt(1, compra.getId_Compra());
            cllbst.setInt(2, resultado);
            cllbst.registerOutParameter(2, java.sql.Types.INTEGER);
            cllbst.execute();
 
            resultado=cllbst.getInt(2);
            
        
            if(resultado==0){
            mensaje="Orden de compra eliminada correctamente";

            }
            else{
            mensaje="No es posible eliminar la orden de compra";
           
            
            }
            
            
            
            
        } catch (Exception ex) {
            throw ex;
        } finally {
            _cnn = null;
        }
        return id_orden;
    }  
        
        
        
        
        
        
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
