/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaLogica;

import Capa_Acceso_Datos.DACompras;
import Capa_Acceso_Datos.DAReparaciones;
import Capa_Entidades.EntidadCompraProducto;
import Capa_Entidades.EntidadReparaciones;
import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Fran
 */
public class BLCompras {
              private String mensaje;
       //Llamar al método insertar de la lógica
    public int Insertar(EntidadCompraProducto orden) throws Exception{
        int resultado = -1;
        DACompras daCompra;
        try {
           daCompra = new DACompras();
           resultado = daCompra.Insertar(orden);
           mensaje = daCompra.getMensaje();
        } catch (Exception ex) {
            Component parentComponent = null;
            JOptionPane.showMessageDialog(parentComponent,ex);
        }
        return resultado;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
