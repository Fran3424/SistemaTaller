/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package CapaPresentacion;

import CapaLogica.BLAuto;
import CapaLogica.BLClientes;
import Capa_Entidades.EntidadAutomovil;
import Capa_Entidades.EntidadCliente;
import Capa_Entidades.EntidadPersona;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fran
 */
public class Frm_Agrega_Auto extends javax.swing.JInternalFrame {

    /**
     * Creates new form Frm_Agrega_Auto
     */
    public Frm_Agrega_Auto() {
        initComponents();
           try {
            CargarDatos("");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "ñaañañ");
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

        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        lblIDCliente = new javax.swing.JLabel();
        lblTipo_Vehiculo = new javax.swing.JLabel();
        lblPlaca = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        lblModelo = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtID_Cliente = new javax.swing.JTextField();
        txtPlaca = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        cmbTipos = new javax.swing.JComboBox<>();
        btnBuscarCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAutos = new javax.swing.JTable();
        btnAgregarAuto = new javax.swing.JButton();
        EliminarAuto = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnSalir1 = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        jLabel5.setText("jLabel5");

        lblID.setText("ID");

        lblIDCliente.setText("ID_Cliente");

        lblTipo_Vehiculo.setText("Tipo_Vehiculo");

        lblPlaca.setText("Placa");

        lblMarca.setText("Marca");

        lblModelo.setText("Modelo");

        txtID.setEditable(false);

        txtID_Cliente.setEditable(false);

        cmbTipos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MOTOCICLETA", "CAMION", "AUTOMOVIL", "CAMIONETA" }));
        cmbTipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTiposActionPerformed(evt);
            }
        });

        btnBuscarCliente.setText("Buscar cliente");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        tblAutos.setModel(new javax.swing.table.DefaultTableModel(
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
        tblAutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAutos);

        btnAgregarAuto.setText("Agregar Automovil");
        btnAgregarAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAutoActionPerformed(evt);
            }
        });

        EliminarAuto.setText("Eliminar Automovil");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnSalir1.setText("Salie");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(120, 120, 120)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblIDCliente)
                                .addComponent(lblID)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(109, 109, 109)
                            .addComponent(lblTipo_Vehiculo))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lblPlaca)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMarca)
                            .addComponent(lblModelo)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAgregarAuto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EliminarAuto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtID_Cliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(txtID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addComponent(btnBuscarCliente)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                .addComponent(txtModelo))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtPlaca, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cmbTipos, javax.swing.GroupLayout.Alignment.LEADING, 0, 125, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnSalir1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(lblIDCliente))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtID_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTipo_Vehiculo)
                            .addComponent(cmbTipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPlaca))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(lblMarca)))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblModelo)
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                        .addComponent(EliminarAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addComponent(btnAgregarAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnSalir1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbTiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTiposActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTiposActionPerformed

    
    DefaultTableModel modelo = new DefaultTableModel();
    
    
    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        Frm_Buscar_Cliente buscar = new Frm_Buscar_Cliente(null, true);
        buscar.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                try {
                    int id = buscar.ObtenerId();
                    String condicion = "";
                    BLClientes logica = new BLClientes();
                    EntidadCliente cliente;
                    if (id > -1) {
                        condicion = String.format("ID_CLIENTE=%d", id);
                        cliente = logica.ObtenerUnCliente(condicion);
                        txtID_Cliente.setText(String.valueOf(cliente.getId()));
                    }
                    else{
                        txtID_Cliente.setText("");

                    }                      
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
        buscar.setVisible(true);   
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnAgregarAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAutoActionPerformed
         BLAuto logica = new BLAuto();
        EntidadAutomovil auto = GenerarEntidad();
        try {
            if (auto.isExiste()) {
                logica.Modificar(auto);
            }
            else{
                logica.Insertar(auto);
            }
            Limpiar();
            CargarDatos("");
            JOptionPane.showMessageDialog(this, logica.getMensaje());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "ERROR " + ex.getMessage());
        }
    }//GEN-LAST:event_btnAgregarAutoActionPerformed

    private void tblAutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAutosMouseClicked
            BLAuto logica = new BLAuto();
        EntidadAutomovil auto;
        String condicion;
        try {
            if (evt.getClickCount() == 2) {
              int fila = tblAutos.rowAtPoint(evt.getPoint());
              txtID.setText(tblAutos.getValueAt(fila, 0).toString());
              txtID_Cliente.setText(tblAutos.getValueAt(fila, 1).toString());
              cmbTipos.setToolTipText(tblAutos.getValueAt(fila, 2).toString());
              txtMarca.setText(tblAutos.getValueAt(fila, 3).toString());
              txtModelo.setText(tblAutos.getValueAt(fila, 4).toString());
              txtPlaca.setText(tblAutos.getValueAt(fila, 5).toString());
                condicion = String.format("Id_Automovil=%s", txtID.getText());
                auto = logica.ObtenerUnAuto(condicion);
                txtID.setText(String.valueOf(auto.getId()));
                txtID_Cliente.setText(String.valueOf(auto.getId_cliente()));
                txtMarca.setText(auto.getMarca());
                txtModelo.setText(auto.getModelo());
                txtPlaca.setText(String.valueOf(auto.getPlaca()));
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_tblAutosMouseClicked

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    
      public void Limpiar() {
        txtID.setText(null);
        txtID_Cliente.setText(null);
        txtMarca.setText(null);
        txtModelo.setText(null);
        txtPlaca.setText(null);
    }
    
     
    
     private EntidadAutomovil GenerarEntidad(){
        EntidadAutomovil auto = new EntidadAutomovil();
        if (!txtID.getText().equals("")) {
            auto.setExiste(true);
            auto.setId(Integer.parseInt(txtID.getText()));
        }
        //auto.setId(Integer.parseInt(txtID.getText()));
        auto.setId_cliente(Integer.parseInt(txtID_Cliente.getText()));
        String seleccionado = cmbTipos.getSelectedItem().toString();
        auto.setTipo_vehiculo(seleccionado);
        auto.setModelo(txtModelo.getText());
        auto.setMarca(txtMarca.getText());
        auto.setPlaca( Integer.parseInt(txtPlaca.getText()));
        return auto;
    }

      private void CargarDatos(String condicion) throws Exception {
        BLAuto logica = new BLAuto();
        List<EntidadAutomovil> lista;
        LimpiarTabla();
        Object[] fila = new Object[6];
        try {
            lista = logica.ListarAutos(condicion);
            for (EntidadAutomovil aut : lista) {
                fila[0] = aut.getId();
                fila[1] = aut.getId_cliente();
                fila[2] = aut.getTipo_vehiculo();
                fila[3] = aut.getMarca();
                fila[4] = aut.getModelo();
                fila[5] = aut.getPlaca();
                modelo.addRow(fila);
            }
        } catch (Exception ex) {
             JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    
          private void LimpiarTabla(){
        modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };     
        tblAutos.setModel(modelo);
        modelo.addColumn("Id");
        modelo.addColumn("Id Cliente");
        modelo.addColumn("Tipo vehiculo");
        modelo.addColumn("Marca");
        modelo.addColumn("Modelo");
        modelo.addColumn("Placa");
        
    }
    
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EliminarAuto;
    private javax.swing.JButton btnAgregarAuto;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JComboBox<String> cmbTipos;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblIDCliente;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblTipo_Vehiculo;
    private javax.swing.JTable tblAutos;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtID_Cliente;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
