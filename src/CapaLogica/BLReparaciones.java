/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaLogica;

import Capa_Acceso_Datos.DAClientes;
import Capa_Acceso_Datos.DAReparaciones;
import Capa_Entidades.EntidadCliente;
import Capa_Entidades.EntidadReparaciones;
import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Fran
 */
public class BLReparaciones {
    
         private String mensaje;
    
    
     public String getMensaje() {
        return mensaje;
    }
     
   
       //Llamar al método insertar de la lógica
    public int Insertar(EntidadReparaciones reparacion) throws Exception{
        int resultado = -1;
        DAReparaciones dareparacion;
        try {
           dareparacion = new DAReparaciones();
           resultado = dareparacion.Insertar(reparacion);
           mensaje = dareparacion.getMensaje();
        } catch (Exception ex) {
            Component parentComponent = null;
            JOptionPane.showMessageDialog(parentComponent,ex);
        }
        return resultado;
    }
    
    
    
    
    
    
    
    
    
}
