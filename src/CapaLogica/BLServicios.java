/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaLogica;

import Capa_Acceso_Datos.DAClientes;
import Capa_Acceso_Datos.DAServicios;
import Capa_Entidades.EntidadCliente;
import Capa_Entidades.Entidad_Servicio;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fran
 */
public class BLServicios {
    
      public List<Entidad_Servicio> ListarServicios(String condicion) throws Exception{
        List<Entidad_Servicio> servicios = new ArrayList();
        DAServicios daServicio;
        try {
            daServicio = new DAServicios();
            servicios = daServicio.ListarServicios(condicion);
        } catch (Exception ex) {
            throw ex;
        }
        return servicios;
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
