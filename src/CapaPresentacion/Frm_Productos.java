/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package CapaPresentacion;

import CapaLogica.BLProductos;
import Capa_Entidades.EntidadProducto;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fran
 */
public class Frm_Productos extends javax.swing.JInternalFrame {

    /**
     * Creates new form Frm_Productos
     */
    public Frm_Productos() {
        initComponents();
        try {
            CargarDatos("");
        } catch (Exception ex) {
            Logger.getLogger(Frm_Productos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TblProductos = new javax.swing.JTable();
        lblDescripcion = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        lblmonto = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        lblCantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        LblID = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnElliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnInsertar = new javax.swing.JButton();
        btnBuscarProducto = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        TblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TblProductos);

        lblDescripcion.setText("Descripcion");

        lblmonto.setText("Monto");

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane2.setViewportView(txtDescripcion);

        lblCantidad.setText("Cantidad");

        txtId.setEditable(false);

        LblID.setText("ID");

        lblNombre.setText("Nombre");

        btnElliminar.setBackground(new java.awt.Color(255, 0, 51));
        btnElliminar.setText("Eliminar");
        btnElliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(153, 153, 0));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnInsertar.setBackground(new java.awt.Color(255, 255, 0));
        btnInsertar.setText("Insertar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnBuscarProducto.setBackground(new java.awt.Color(0, 153, 153));
        btnBuscarProducto.setText("Buscar");
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(255, 51, 51));
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(LblID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblCantidad)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblNombre)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblmonto)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblDescripcion)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(btnElliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(117, 117, 117)
                                .addComponent(btnBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 104, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblID)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCantidad)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblmonto)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblDescripcion)
                        .addGap(27, 27, 27)))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnElliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
      DefaultTableModel modelo = new DefaultTableModel() {
        @Override
      
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    
    
    
    private void btnElliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElliminarActionPerformed
      
        BLProductos logica = new BLProductos();
        EntidadProducto producto;
        try {
            producto = GenerarEntidad();
            if(producto.isExiste()){
                if(logica.Eliminar(producto) > 0){
                    JOptionPane.showMessageDialog(this, logica.getMensaje());
                   Limpiar();
                    CargarDatos("");
                }else{
                    JOptionPane.showMessageDialog(this, "No fue posible eliminar el Producto");
                }
            }else{
                JOptionPane.showMessageDialog(this, "Debe seleccionar el Producto que desea eliminar");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "No fue posible eliminar el Producto debido a que hay una orden de compra relacionada");
        }
      
    }//GEN-LAST:event_btnElliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
       Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
       if(
            !txtDescripcion.getText().isEmpty()& 
            esnumero(txtMonto.getText())& 
             !txtNombre.getText().isEmpty()& 
            esnumero(txtCantidad.getText())     
                
                
                ){
        BLProductos logica = new BLProductos();
        EntidadProducto producto = GenerarEntidad();
        try {
            if (producto.isExiste()) {
                logica.Modificar(producto);
            }
            else{
                logica.Insertar(producto);
            }
            Limpiar();
            CargarDatos("");
            JOptionPane.showMessageDialog(this, logica.getMensaje());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "ERROR " + ex.getMessage());
        }
    
       }else{
       
           JOptionPane.showMessageDialog(this,"Faltan campos por llenar o no se estan poniendo valores numericos necesarios");
       }
       
        
        
        
        
    }//GEN-LAST:event_btnInsertarActionPerformed

        private EntidadProducto GenerarEntidad(){
        EntidadProducto producto = new EntidadProducto();
        if (!txtId.getText().equals("")) {
            producto.setExiste(true);
            producto.setId(Integer.parseInt(txtId.getText()));
        }
       producto.setNombre(txtNombre.getText());
       producto.setCantidad(Integer.parseInt(  txtCantidad.getText()));
       producto.setPrecio( Integer.parseInt( txtMonto.getText()));
       producto.setDescripcion(txtDescripcion.getText());
        return producto;
    }
    
    
    
    
      public static boolean esnumero(String str) {
        return str != null && str.matches("[-+]?\\d*\\.?\\d+");
    }
    
    
    
    
    
    
    
    
    
    
    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
        Frm_Buscar_Producto buscar = new Frm_Buscar_Producto(null, true);

        buscar.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                try {
                    int id = buscar.ObtenerId();
                    String condicion = "";
                    BLProductos logica = new BLProductos();
                    EntidadProducto producto;
                    if (id > -1) {
                        condicion = String.format("Id_Producto=%d", id);
                        producto = logica.ObtenerUnProducto(condicion);
                        txtId.setText(String.valueOf(producto.getId()));
                        txtMonto.setText(String.valueOf(producto.getPrecio()));
                        txtNombre.setText(producto.getNombre());
                        txtCantidad.setText(String.valueOf(producto.getCantidad()));
                        txtDescripcion.setText(String.valueOf(producto.getDescripcion()));
                    }
                    else{
                        txtId.setText("");

                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
        buscar.setVisible(true);
    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    private void TblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblProductosMouseClicked
        if (evt.getClickCount() == 2) {
            int fila = TblProductos.rowAtPoint(evt.getPoint());
            txtId.setText(TblProductos.getValueAt(fila, 0).toString());
            txtNombre.setText(TblProductos.getValueAt(fila, 1).toString());
            txtCantidad.setText(TblProductos.getValueAt(fila, 2).toString());
            txtMonto.setText(TblProductos.getValueAt(fila, 3).toString());
            txtDescripcion.setText(TblProductos.getValueAt(fila, 4).toString());
           
        }
    }//GEN-LAST:event_TblProductosMouseClicked

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    
    
    
    
    
    
    
    
    
        private void CargarDatos(String condicion) throws Exception {
        BLProductos logica = new BLProductos();
        List<EntidadProducto> lista;
        LimpiarTabla();
        Object[] fila = new Object[5];
        try {
            lista = logica.ListarProductos(condicion);
            for (EntidadProducto pr:lista) {
                fila[0]=pr.getId();
                fila[1]=pr.getNombre();
                fila[2]=pr.getCantidad();
                fila[3]=pr.getPrecio();
                fila[4]=pr.getDescripcion();
                modelo.addRow(fila);
            }
        } catch (Exception ex) {
             JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    
      
        public int ObtenerId() {
        int id = -1;
        if (!txtId.getText().equals("")) {
            id = Integer.parseInt(txtId.getText());
        }
        return id;
    }
      
      
       public void Limpiar() {
        txtId.setText(null);
        txtNombre.setText(null);
        txtCantidad.setText(null);
        txtMonto.setText(null);
        txtDescripcion.setText(null);
    }
     
      
      
      
      
    
      private void LimpiarTabla(){
        modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };     
        TblProductos.setModel(modelo);
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio");
        modelo.addColumn("Descripcion");   
    }
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblID;
    private javax.swing.JTable TblProductos;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnElliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblmonto;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
