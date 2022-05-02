/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Capa_Entidades;

/**
 *
 * @author Fran
 */
public class EntidadCompraProducto {
    private int Id_Compra;
    private int Id_Producto;
    private int Id_Empleado;
    private int Cantidad;
    private String descripcion;
    private boolean existe=false;
    private int Monto;

    public int getId_Compra() {
        return Id_Compra;
    }

    public void setId_Compra(int Id_Compra) {
        this.Id_Compra = Id_Compra;
    }

    public int getId_Producto() {
        return Id_Producto;
    }

    public void setId_Producto(int Id_Producto) {
        this.Id_Producto = Id_Producto;
    }

    public int getId_Empleado() {
        return Id_Empleado;
    }

    public void setId_Empleado(int Id_Empleado) {
        this.Id_Empleado = Id_Empleado;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isExiste() {
        return existe;
    }

    public void setExiste(boolean existe) {
        this.existe = existe;
    }

    public int getMonto() {
        return Monto;
    }

    public void setMonto(int Monto) {
        this.Monto = Monto;
    }
    
    
    

    public EntidadCompraProducto(int Id_Compra, int Id_Producto, int Id_Empleado, int Cantidad, String descripcion,int monto) {
        this.Id_Compra = Id_Compra;
        this.Id_Producto = Id_Producto;
        this.Id_Empleado = Id_Empleado;
        this.Cantidad = Cantidad;
        this.descripcion = descripcion;
        this.Monto=monto;
    }

    public EntidadCompraProducto() {
       this.Id_Compra = 0;
        this.Id_Producto = 0;
        this.Id_Empleado = 0;
        this.Cantidad = 0;
        this.descripcion = "";
       this.Monto = 0;    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
