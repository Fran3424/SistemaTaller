/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capa_Acceso_Datos;

import Capa_Entidades.EntidadFactura;
import Config.Config;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Fran
 */
public class DAFactura {
    
    private Connection _cnn;
        private String mensaje;
    public String getMensaje() {
        return mensaje;
    }
    

       public DAFactura() throws Exception{
        try {
            String url = Config.getConnectionString();
            _cnn = DriverManager.getConnection(url); //Clase de tipo interfaz
            mensaje = "";
        } catch (Exception ex) {
            throw ex;
        }
    }
    
            public int Insertar(EntidadFactura factura) throws SQLException {
        int id_orden = -1;
        int resultado=-1;
        try {
            CallableStatement cllbst = _cnn.prepareCall("{call SP_INGRESARFACTURA(?,?,?,?,?)}");
            cllbst.setInt(1, factura.getId_pago());
            cllbst.setInt(2, factura.getId_cliente());
            cllbst.setString(3, factura.getDescripcion());
            cllbst.setDate(4,new java.sql.Date( factura.getFecha().getTime()));
            cllbst.setInt(5, resultado);
            cllbst.registerOutParameter(5, java.sql.Types.INTEGER);
            cllbst.execute();
 
            resultado=cllbst.getInt(5);
            
        
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
        
    
    
    
    
        public ResultSet ListarFacturasMES(String condicion,String orden) throws Exception{
            ResultSet rs= null;
            try{
            Statement stm = _cnn.createStatement();
            String sentencia = "SELECT Id_Cliente,Id_Factura,Id_Pago,Fecha FROM Facturas";
            if(!condicion.equals("")){
                sentencia = String.format("%s where %s",sentencia,condicion);
            
            }
            
            if(!orden.equals("")){
                sentencia = String.format("%s order by %s",sentencia,orden);
            
            }
            
            rs= stm.executeQuery(sentencia);
            
            return rs;
            
            }catch(SQLException ex){
            throw ex;
                    } 
  
         
                
            
            
    }  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
