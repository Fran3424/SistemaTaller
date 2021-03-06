/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package CapaPresentacion;

import CapaLogica.BLClientes;
import CapaLogica.BLCompras;
import CapaLogica.BLPagos;
import CapaLogica.BLReparaciones;
import Capa_Entidades.EntidadCliente;
import Capa_Entidades.EntidadCompraProducto;
import Capa_Entidades.EntidadPagos;
import Capa_Entidades.EntidadReparaciones;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Fran
 */
public class Frm_Transaccion extends javax.swing.JInternalFrame {

    /**
     * Creates new form Frm_Transaccion
     */
    public Frm_Transaccion() {
        initComponents();
    }

    int total;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        lblID_Orden_Compra = new javax.swing.JLabel();
        lblReparacion = new javax.swing.JLabel();
        txtOrdenCompra = new javax.swing.JTextField();
        txtIDReparacion = new javax.swing.JTextField();
        btnBuscarOrdenCompra = new javax.swing.JButton();
        btnBuscarReparacion = new javax.swing.JButton();
        btnPagar = new javax.swing.JButton();
        txtMontoCompra = new javax.swing.JTextField();
        lblMontoCompra = new javax.swing.JLabel();
        lblMontoReparacion = new javax.swing.JLabel();
        txtMontoReparacion = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();

        jTextField2.setText("jTextField2");

        jTextField3.setText("jTextField3");

        lblID_Orden_Compra.setText("ID_Orden_Compra");

        lblReparacion.setText("ID_Reparacion");

        btnBuscarOrdenCompra.setText("Buscar orden de compra");
        btnBuscarOrdenCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarOrdenCompraActionPerformed(evt);
            }
        });

        btnBuscarReparacion.setText("Buscar Reparacion");
        btnBuscarReparacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarReparacionActionPerformed(evt);
            }
        });

        btnPagar.setText("Realizar Transaccion");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });

        lblMontoCompra.setText("MontoCompra");

        lblMontoReparacion.setText("MontoReparacion");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblReparacion)
                                .addGap(40, 40, 40)
                                .addComponent(txtIDReparacion))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblID_Orden_Compra)
                                .addGap(18, 18, 18)
                                .addComponent(txtOrdenCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(btnBuscarOrdenCompra))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarReparacion)))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMontoCompra)
                            .addComponent(lblMontoReparacion))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMontoCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                            .addComponent(txtMontoReparacion)))
                    .addComponent(btnPagar))
                .addGap(23, 102, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID_Orden_Compra)
                    .addComponent(txtOrdenCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarOrdenCompra)
                    .addComponent(txtMontoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMontoCompra))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblReparacion)
                            .addComponent(txtIDReparacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarReparacion)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMontoReparacion)
                            .addComponent(txtMontoReparacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(62, 62, 62)
                .addComponent(btnPagar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarOrdenCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarOrdenCompraActionPerformed
          Frm_Buscar_Orden_Compra buscar = new Frm_Buscar_Orden_Compra(null, true);
        buscar.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                try {
                    int id = buscar.ObtenerId();
                    String condicion = "";
                    BLCompras logica = new BLCompras();
                    EntidadCompraProducto compra;
                    if (id > -1) {
                        condicion = String.format("Id_Compra=%d", id);
                        compra = logica.ObtenerUnaCompra(condicion);
                        txtOrdenCompra.setText(String.valueOf(compra.getId_Compra()));
                        txtMontoCompra.setText(String.valueOf(compra.getMonto()));
                        
                    }
                    else{
                        txtOrdenCompra.setText("");
                    }                      
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
        buscar.setVisible(true); 
    }//GEN-LAST:event_btnBuscarOrdenCompraActionPerformed

    private void btnBuscarReparacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarReparacionActionPerformed
         Buscar_Reparaciones buscar = new Buscar_Reparaciones(null, true);
        buscar.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                try {
                    int id = buscar.ObtenerId();
                    String condicion = "";
                    BLReparaciones logica = new BLReparaciones();
                    EntidadReparaciones reparacion;
                    if (id > -1) {
                        condicion = String.format("Id_Reparacion=%d", id);
                        reparacion = logica.ObtenerUnaReparacion(condicion);
                        txtIDReparacion.setText(String.valueOf(reparacion.getId()));
                        txtMontoReparacion.setText(String.valueOf(reparacion.getMonto()));
                           
                        
                    }
                    else{
                        txtIDReparacion.setText("");
                    }                      
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
        buscar.setVisible(true);   
    }//GEN-LAST:event_btnBuscarReparacionActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
       
        BLPagos logica = new BLPagos();
        EntidadPagos pago = GenerarEntidad();
        int monto=0;
        int montoCompra;
        int montoReparacion;
        if(txtOrdenCompra.getText().isEmpty()&txtIDReparacion.getText().isEmpty()){
          JOptionPane.showMessageDialog(this, "Debe seleccionar almenos una orden de compra o una reparacion a para registar");
        }
        else if(txtIDReparacion.getText().isEmpty()){
            pago.setId_compra(Integer.parseInt(txtOrdenCompra.getText()));
            pago.setId_reparacion(-1);
            monto=Integer.parseInt(txtMontoCompra.getText());
            pago.setMonto(monto);
        }
        
          else if(txtOrdenCompra.getText().isEmpty()){
            pago.setId_compra(-1);
             pago.setId_reparacion(Integer.parseInt(txtIDReparacion.getText()));
            monto=Integer.parseInt(txtMontoReparacion.getText());
            pago.setMonto(monto);
        }
        
          else if(!txtMontoCompra.getText().isEmpty()&!txtMontoReparacion.getText().isEmpty()){
              pago.setId_compra(Integer.parseInt(txtOrdenCompra.getText()));
              pago.setId_reparacion(Integer.parseInt(txtIDReparacion.getText()));
           montoReparacion=Integer.parseInt(txtMontoReparacion.getText());
            montoCompra=Integer.parseInt(txtMontoCompra.getText());    
            monto=montoCompra+montoReparacion;
            pago.setMonto(monto);   
             try {
             logica.RealizarPago(pago);
            JOptionPane.showMessageDialog(this, logica.getMensaje());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,"Faltan datos" );
        }
            
          }
        
        
       
        
        
   
        
        
        
        
        
    }//GEN-LAST:event_btnPagarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    
      private EntidadPagos GenerarEntidad(){
        EntidadPagos pago = new EntidadPagos();
        
        
  
        return pago;   
    }

    
    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarOrdenCompra;
    private javax.swing.JButton btnBuscarReparacion;
    private javax.swing.JButton btnPagar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lblID_Orden_Compra;
    private javax.swing.JLabel lblMontoCompra;
    private javax.swing.JLabel lblMontoReparacion;
    private javax.swing.JLabel lblReparacion;
    private javax.swing.JTextField txtIDReparacion;
    private javax.swing.JTextField txtMontoCompra;
    private javax.swing.JTextField txtMontoReparacion;
    private javax.swing.JTextField txtOrdenCompra;
    // End of variables declaration//GEN-END:variables
}
