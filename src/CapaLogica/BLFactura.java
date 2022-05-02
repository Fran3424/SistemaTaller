/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaLogica;

import Capa_Acceso_Datos.DAFactura;
import Capa_Acceso_Datos.DAPagos;
import Capa_Entidades.EntidadFactura;
import Capa_Entidades.EntidadPagos;
import java.awt.Component;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Fran
 */
public class BLFactura {
    
              private String mensaje;
    
    
     public String getMensaje() {
        return mensaje;
    }
     
    
    
       //Llamar al método insertar de la lógica
    public int Insertar(EntidadFactura factura) throws Exception{
        int resultado = -1;
        DAFactura daFactura;
        try {
           daFactura = new DAFactura();
           resultado = daFactura.Insertar(factura);
           mensaje = daFactura.getMensaje();
        } catch (Exception ex) {
            Component parentComponent = null;
            JOptionPane.showMessageDialog(parentComponent,ex);
        }
        return resultado;
    }
    
    
    public ResultSet listarFacturasMES(String condicion,String orden) throws Exception{
        ResultSet rs;
        DAFactura daFactura;
        try
        {
            daFactura = new DAFactura();
            rs = daFactura.ListarFacturasMES(condicion, orden);
        } catch (Exception ex)
        {
            throw ex;
        }
        return rs;
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
