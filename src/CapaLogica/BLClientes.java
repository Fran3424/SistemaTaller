/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaLogica;

import Capa_Acceso_Datos.DAClientes;
import Capa_Entidades.EntidadCliente;
import Capa_Entidades.EntidadPersona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fran
 */
public class BLClientes {
       private String mensaje;
    
    
     public String getMensaje() {
        return mensaje;
    }
     
     
        //Llamar al método modificar de la lógica
    public int Modificar(EntidadCliente cliente) throws Exception{
        int resultado = -1;
        DAClientes daCliente;
        try {
           daCliente = new DAClientes();
           resultado = daCliente.Modificar(cliente);
           mensaje = daCliente.getMensaje();
        } catch (Exception ex) {
            throw ex;
        }
        return resultado;
    }
    
    //Llamar al método eliminar de la lógica
    public int Eliminar(EntidadCliente cliente) throws Exception{
        int resultado = -1;
        DAClientes daCliente;
        try {
           daCliente = new DAClientes();
           resultado = daCliente.Eliminar(cliente);
           mensaje = daCliente.getMensaje();
        } catch (Exception ex) {
            throw ex;
        }
        return resultado;
    }
    
    //Llamar al método insertar de la lógica
    public int Insertar(EntidadCliente cliente) throws Exception{
        int resultado = -1;
        DAClientes daCliente;
        try {
           daCliente = new DAClientes();
           resultado = daCliente.Insertar(cliente);
           mensaje = daCliente.getMensaje();
        } catch (Exception ex) {
            throw ex;
        }
        return resultado;
    }
    
    public List<EntidadCliente> ListarClientes(String condicion) throws Exception{
        List<EntidadCliente> clientes = new ArrayList();
        DAClientes daCliente;
        try {
            daCliente = new DAClientes();
            clientes = daCliente.ListarClientes(condicion);
        } catch (Exception ex) {
            throw ex;
        }
        return clientes;
    }
    
    public EntidadCliente ObtenerUnCliente(String condicion) throws Exception{
        EntidadCliente resultado;
        DAClientes daCliente;
        try {
            daCliente = new DAClientes();
            resultado = daCliente.ObtenerUnCliente(condicion);
            if (resultado.isExiste()) {
                mensaje = "Cliente encontrado!";
            }
            else{
                mensaje = "Cliente NO encontrado";
            }
        } catch (Exception ex) {
            throw ex;
        }
        return resultado;
    }
     
     
     
     
     
     
     
}
