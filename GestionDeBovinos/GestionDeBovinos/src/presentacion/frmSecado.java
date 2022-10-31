/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import clases.BotonesTabla;
import clases.EventoDeSanidad;
import clases.Hembra;
import clases.Secado;
import dominio.dControladora;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.*;
import java.util.Date;
import javax.swing.JTable;

public class frmSecado extends javax.swing.JInternalFrame {

    JButton modificar = new JButton(""); // Creamos los botones para la tabla
    JButton eliminar = new JButton("");
    
    public static int idSecado = 0;
    public static int columna, row; // Metodo para cuando hacemos click en los botones    

    public void insertarIconos(JButton btn, String ruta) { // Insertar Iconos en Botones Tabla

        btn.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta)));

    }
    
    public frmSecado() {
        initComponents();
        
        //setExtendedState(MAXIMIZED_BOTH); // Maximisa la ventana 
        this.setTitle("SECADO");
        insertarIconos(modificar, "/Imagenes/btnModificarChico.png");
        insertarIconos(eliminar, "/Imagenes/btnEliminarChico.png");
        txtCaravanaHembra.setText(frmBuscarHembra.caravana);
        modificar.setName("btnModificar");
        eliminar.setName("btnEliminar");      
        lblRCausa.setVisible(false);
        lblRFechaSecado.setVisible(false);
        lblRHembra.setVisible(false);
        
        if(txtCaravanaHembra.getText().isEmpty()){
            actualizarTabla();
        }
        else{
            actualizarTablaHembra();
        }
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAltaSecado = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cboCausa = new javax.swing.JComboBox<>();
        lblRCausa = new java.awt.Label();
        lblRHembra = new java.awt.Label();
        jLabel3 = new javax.swing.JLabel();
        jDateFechaSecado = new com.toedter.calendar.JDateChooser();
        lblRFechaSecado = new java.awt.Label();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaDetalle = new javax.swing.JTextArea();
        txtCaravanaHembra = new javax.swing.JTextField();
        btnBuscarBovino = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSecados = new javax.swing.JTable();

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Causa:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 160, 30));

        btnAltaSecado.setText("Agregar");
        btnAltaSecado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAltaSecadoMouseClicked(evt);
            }
        });
        jPanel2.add(btnAltaSecado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 100, 30));

        btnImprimir.setText("Imprimir");
        btnImprimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnImprimirMouseClicked(evt);
            }
        });
        jPanel2.add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, 100, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Detalle (Opcional): ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 160, 30));

        cboCausa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Prelactancia", "Baja Producción" }));
        jPanel2.add(cboCausa, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 210, 30));

        lblRCausa.setText("Requerido");
        jPanel2.add(lblRCausa, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 70, 30));

        lblRHembra.setText("Requerido");
        jPanel2.add(lblRHembra, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 70, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Hembra:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 160, 30));
        jPanel2.add(jDateFechaSecado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 210, 30));

        lblRFechaSecado.setText("Requerido");
        jPanel2.add(lblRFechaSecado, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 70, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Fecha Secado:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        txaDetalle.setColumns(20);
        txaDetalle.setRows(5);
        jScrollPane2.setViewportView(txaDetalle);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 270, 90));

        txtCaravanaHembra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCaravanaHembraKeyReleased(evt);
            }
        });
        jPanel2.add(txtCaravanaHembra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 160, 30));

        btnBuscarBovino.setText("Buscar");
        btnBuscarBovino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarBovinoMouseClicked(evt);
            }
        });
        jPanel2.add(btnBuscarBovino, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 80, 30));

        jTableSecados = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        jTableSecados.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableSecados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableSecadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableSecados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void limpiarCajas() {

        txtCaravanaHembra.setText(null);
        cboCausa.setSelectedIndex(0);
        jDateFechaSecado.setDate(null);
        txaDetalle.setText(null);  
    }
    
    private boolean validarCampos(){
        int contador = 0;
        
        if(txtCaravanaHembra.getText().isEmpty()){ lblRHembra.setVisible(true); contador++; }else { lblRHembra.setVisible(false);}
        if(cboCausa.getSelectedIndex() < 1){ lblRCausa.setVisible(true); contador++; }else { lblRCausa.setVisible(false);}
        if(jDateFechaSecado.getDate() == null){ lblRFechaSecado.setVisible(true); contador++; }else { lblRFechaSecado.setVisible(false);}
        
        if(contador < 1){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void actualizarTabla() {
        jTableSecados.setDefaultRenderer(Object.class, new BotonesTabla());

        DefaultTableModel model = new DefaultTableModel();
        ArrayList<Secado> listaSecados = dControladora.listarSecados();

        model.addColumn("id Secado");
        model.addColumn("Caravana Hembra");
        model.addColumn("Fecha");
        model.addColumn("Detalle");
        model.addColumn("Causa");
        model.addColumn("Modificar ");
        model.addColumn("Eliminar ");
        
        for (Secado s : listaSecados) {

            model.addRow(new Object[]{s.getIdEventoDeSanidad(), s.getHembra().getCaravanaBovino(), s.getFecha(), s.getDetalle(), s.getCausa(), modificar, eliminar});
        }

        jTableSecados.setModel(model);
        jTableSecados.setRowHeight(35);
    }
    
    public void actualizarTablaHembra() {
        jTableSecados.setDefaultRenderer(Object.class, new BotonesTabla());

        DefaultTableModel model = new DefaultTableModel();
        
        ArrayList<Secado> listaSecados = dControladora.listarSecadosPorCaravana(txtCaravanaHembra.getText());

        model.addColumn("id Secado");
        model.addColumn("Caravana Hembra");
        model.addColumn("Fecha");
        model.addColumn("Detalle");
        model.addColumn("Causa");
        model.addColumn("Modificar ");
        model.addColumn("Eliminar ");
        
        for (Secado s : listaSecados) {

            model.addRow(new Object[]{s.getIdEventoDeSanidad(), s.getHembra().getCaravanaBovino(), s.getFecha(), s.getDetalle(), s.getCausa(), modificar, eliminar});
        }

        jTableSecados.setModel(model);
        jTableSecados.setRowHeight(35);
    }
    
    private void btnAltaSecadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAltaSecadoMouseClicked

        if(validarCampos()){

            String caravana = txtCaravanaHembra.getText();
            Hembra hembra = dControladora.buscarHembraPorCaravana(caravana);

            Date fechaSecado = jDateFechaSecado.getDate();

            String detalle = txaDetalle.getText();

            EventoDeSanidad eventoDeSanidad = new EventoDeSanidad(fechaSecado, detalle, hembra);

            try {

                if (dControladora.altaEventoDeSanidad(eventoDeSanidad)) {

                    eventoDeSanidad = dControladora.buscarEventoDeSanidadUltimo();

                    String causa = cboCausa.getSelectedItem().toString();

                    Secado secado = new Secado(eventoDeSanidad.getIdEventoDeSanidad(), fechaSecado, detalle, hembra, causa);

                    if(dControladora.altaSecado(secado)){
                        JOptionPane.showMessageDialog(null, "Secado Ingresado Correctamente");
                        actualizarTabla();
                        limpiarCajas(); // Limpiamos Caja de Texto
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Secado No Ingresado Correctamente");
                        limpiarCajas(); // Limpiamos Caja de Texto
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Error: No se pudo agregar el Evento de Sanidad");
                }

            } catch (Exception e) {
                throw e;
            }
        }else {
            JOptionPane.showMessageDialog(null, "Ingrese los datos faltantes");
        }
    }//GEN-LAST:event_btnAltaSecadoMouseClicked

    private void btnImprimirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirMouseClicked

        MessageFormat header = new MessageFormat("Reporte ");
        MessageFormat footer = new MessageFormat("Page {0, number, integer}");

        try {
            jTableSecados.print(JTable.PrintMode.NORMAL, header, footer);
        } catch (java.awt.print.PrinterException e) {
            System.err.format("No se pudo Imprimir", e.getMessage());
        }

    }//GEN-LAST:event_btnImprimirMouseClicked

    private void txtCaravanaHembraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCaravanaHembraKeyReleased
        if (txtCaravanaHembra.getText().isEmpty()) {
            actualizarTabla();
        }
    }//GEN-LAST:event_txtCaravanaHembraKeyReleased

    private void btnBuscarBovinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarBovinoMouseClicked

        frmBuscarHembra buscarHembra = new frmBuscarHembra();
        frmBuscarHembra.frm = "frmSecado";
        buscarHembra.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBuscarBovinoMouseClicked

    private void jTableSecadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableSecadosMouseClicked

        columna = jTableSecados.getColumnModel().getColumnIndexAtX(evt.getX());
        row = evt.getY() / jTableSecados.getRowHeight();
        if (columna <= jTableSecados.getColumnCount() && columna >= 0 && row <= jTableSecados.getRowCount() && row >= 0) {
            Object objeto = jTableSecados.getValueAt(row, columna);
            if (objeto instanceof JButton) {
                ((JButton) objeto).doClick();
                JButton botones = (JButton) objeto;

                if (botones.getName().equals("btnModificar")) {

                    int fila = jTableSecados.getSelectedRow();

                    if (fila != -1) {
                        limpiarCajas();

                        idSecado = (int) jTableSecados.getValueAt(fila, 0);
                        this.dispose();

                        frmModificarSecado modificarSecado = new frmModificarSecado();
                        modificarSecado.setVisible(true);

                    } else {
                        JOptionPane.showMessageDialog(null, "Error: No se selecciono el Secado a modificar");
                    }
                } else {
                    if (botones.getName().equals("btnEliminar")) {

                        int fila = jTableSecados.getSelectedRow();
                        int id = Integer.parseInt(this.jTableSecados.getValueAt(fila, 0).toString());

                        try {

                            //La primera opcion seleccionada (SI) devuelve cero y la segunda (NO) devuelve uno
                            int opcion = JOptionPane.showConfirmDialog(null, "Desea Eliminar el Secado?", "Eliminar Secado ", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                            if (opcion == 0) {

                                if (dControladora.bajaSecado(id)) {

                                    JOptionPane.showMessageDialog(null, "Se eliminó el Secado");
                                    actualizarTabla();
                                    limpiarCajas(); // Limpiamos Caja de Texto

                                } else {
                                    JOptionPane.showMessageDialog(null, "Error: No se pudo Eliminar el Secado");
                                }

                            } else {

                                JOptionPane.showMessageDialog(null, "El Secado no se Eliminó");
                            }

                        } catch (Exception e) {
                            throw e;
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_jTableSecadosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAltaSecado;
    private javax.swing.JButton btnBuscarBovino;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JComboBox<String> cboCausa;
    private com.toedter.calendar.JDateChooser jDateFechaSecado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableSecados;
    private java.awt.Label lblRCausa;
    private java.awt.Label lblRFechaSecado;
    private java.awt.Label lblRHembra;
    private javax.swing.JTextArea txaDetalle;
    private javax.swing.JTextField txtCaravanaHembra;
    // End of variables declaration//GEN-END:variables
}
