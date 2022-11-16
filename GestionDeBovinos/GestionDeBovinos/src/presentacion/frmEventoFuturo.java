/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import clases.BotonesTabla;
import clases.EventoFuturo;
import clases.Hembra;
import dominio.dControladora;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.*;
import java.util.Date;
import javax.swing.JTable;

public class frmEventoFuturo extends javax.swing.JInternalFrame {

    JButton modificar = new JButton("Modificar"); // Creamos los botones para la tabla
    JButton eliminar = new JButton("Eliminar");

    public static int idEventoFuturo = 0;
    public static int columna, row; // Metodo para cuando hacemos click en los botones    

    public void insertarIconos(JButton btn, String ruta) { // Insertar Iconos en Botones Tabla

        btn.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta)));

    }
    
    public frmEventoFuturo() {
        initComponents();
        
        this.setSize(frmInicio.jDkPEscritorio.getWidth(), frmInicio.jDkPEscritorio.getHeight()); 
        this.setTitle("EVENTO FUTURO");
        insertarIconos(modificar, "/Imagenes/btnModificarChico.png");
        insertarIconos(eliminar, "/Imagenes/btnEliminarChico.png");
        txtCaravanaHembra.setText(frmBuscarHembra.caravana);
        modificar.setName("btnModificar");
        eliminar.setName("btnEliminar");
        modificar.setBorder(null);
        eliminar.setBorder(null);
        insertarIconos(modificar, "/Imagenes/Modificar16px.png");
        insertarIconos(eliminar, "/Imagenes/Eliminar16px.png");
        lblRTipo.setVisible(false);
        lblRFechaEventoFuturo.setVisible(false);
        lblRHembra.setVisible(false);

        if (txtCaravanaHembra.getText().isEmpty()) {
            actualizarTabla();
        } else {
            actualizarTablaHembra();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAltaEventoFuturo = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        cboTipo = new javax.swing.JComboBox<>();
        lblRTipo = new java.awt.Label();
        lblRHembra = new java.awt.Label();
        jLabel3 = new javax.swing.JLabel();
        jDateFechaEventoFuturo = new com.toedter.calendar.JDateChooser();
        lblRFechaEventoFuturo = new java.awt.Label();
        jLabel4 = new javax.swing.JLabel();
        txtCaravanaHembra = new javax.swing.JTextField();
        btnBuscarBovino = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEventosFuturos = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Tipo Evento:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 160, 30));

        btnAltaEventoFuturo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ingresar 16px.png"))); // NOI18N
        btnAltaEventoFuturo.setText("Agregar");
        btnAltaEventoFuturo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAltaEventoFuturoMouseClicked(evt);
            }
        });
        jPanel2.add(btnAltaEventoFuturo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 100, 30));

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/impresora16px.png"))); // NOI18N
        btnImprimir.setText("Imprimir");
        btnImprimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnImprimirMouseClicked(evt);
            }
        });
        jPanel2.add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 220, -1, 30));

        cboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Inseminacion", "Tacto", "Secado", "Parto" }));
        jPanel2.add(cboTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 210, 30));

        lblRTipo.setText("Requerido");
        jPanel2.add(lblRTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 70, 30));

        lblRHembra.setText("Requerido");
        jPanel2.add(lblRHembra, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 70, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Hembra:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 160, 30));
        jPanel2.add(jDateFechaEventoFuturo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 210, 30));

        lblRFechaEventoFuturo.setText("Requerido");
        jPanel2.add(lblRFechaEventoFuturo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 70, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Fecha Prevista del Evento:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        txtCaravanaHembra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCaravanaHembraKeyReleased(evt);
            }
        });
        jPanel2.add(txtCaravanaHembra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 160, 30));

        btnBuscarBovino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar16px.png"))); // NOI18N
        btnBuscarBovino.setText("Buscar");
        btnBuscarBovino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarBovinoMouseClicked(evt);
            }
        });
        jPanel2.add(btnBuscarBovino, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 90, 30));

        jTableEventosFuturos = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        jTableEventosFuturos.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableEventosFuturos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEventosFuturosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEventosFuturos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void limpiarCajas() {

        txtCaravanaHembra.setText(null);
        cboTipo.setSelectedIndex(0);
        jDateFechaEventoFuturo.setDate(null);
    }

    private boolean validarCampos() {
        int contador = 0;

        if (txtCaravanaHembra.getText().isEmpty()) {
            lblRHembra.setVisible(true);
            contador++;
        } else {
            lblRHembra.setVisible(false);
        }
        if (cboTipo.getSelectedIndex() < 1) {
            lblRTipo.setVisible(true);
            contador++;
        } else {
            lblRTipo.setVisible(false);
        }
        if (jDateFechaEventoFuturo.getDate() == null) {
            lblRFechaEventoFuturo.setVisible(true);
            contador++;
        } else {
            lblRFechaEventoFuturo.setVisible(false);
        }

        if (contador < 1) {
            return true;
        } else {
            return false;
        }
    }

    public void actualizarTabla() {
        jTableEventosFuturos.setDefaultRenderer(Object.class, new BotonesTabla());

        DefaultTableModel model = new DefaultTableModel();
        ArrayList<EventoFuturo> listaEventosFuturos = dControladora.listarEventosFuturos();

        model.addColumn("id Evento Futuro");
        model.addColumn("Caravana Hembra");
        model.addColumn("Fecha");
        model.addColumn("Tipo");
        model.addColumn("Modificar ");
        model.addColumn("Eliminar ");

        for (EventoFuturo EF : listaEventosFuturos) {

            model.addRow(new Object[]{EF.getIdEventoFuturo(), EF.getHembra().getCaravanaBovino(), EF.getFechaPrevista(), EF.getTipo(), modificar, eliminar});
        }

        jTableEventosFuturos.setModel(model);
        jTableEventosFuturos.setRowHeight(30);
    }

    public void actualizarTablaHembra() {
        jTableEventosFuturos.setDefaultRenderer(Object.class, new BotonesTabla());

        DefaultTableModel model = new DefaultTableModel();

        ArrayList<EventoFuturo> listaEventosFuturos = dControladora.listarEventosFuturosPorCaravana(txtCaravanaHembra.getText());

        model.addColumn("id Evento Futuro");
        model.addColumn("Caravana Hembra");
        model.addColumn("Fecha");
        model.addColumn("Tipo");
        model.addColumn("Modificar ");
        model.addColumn("Eliminar ");

        for (EventoFuturo EF : listaEventosFuturos) {

            model.addRow(new Object[]{EF.getIdEventoFuturo(), EF.getHembra().getCaravanaBovino(), EF.getFechaPrevista(), EF.getTipo(), modificar, eliminar});
        }

        jTableEventosFuturos.setModel(model);
        jTableEventosFuturos.setRowHeight(30);

    }
    
    private void btnAltaEventoFuturoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAltaEventoFuturoMouseClicked

        if (validarCampos()) {

            String caravana = txtCaravanaHembra.getText();
            Hembra hembra = dControladora.buscarHembraPorCaravana(caravana);

            Date fechaEventoFuturo = jDateFechaEventoFuturo.getDate();

            String tipo = cboTipo.getSelectedItem().toString();

            EventoFuturo eventoFuturo = new EventoFuturo(hembra, tipo, fechaEventoFuturo);
            try {

                if (dControladora.altaEventoFuturo(eventoFuturo)) {
                    JOptionPane.showMessageDialog(null, "Evento Futuro Ingresado Correctamente");
                    actualizarTabla();
                    limpiarCajas(); // Limpiamos Caja de Texto
                } else {
                    JOptionPane.showMessageDialog(null, "Evento Futuro No Ingresado Correctamente");
                    limpiarCajas(); // Limpiamos Caja de Texto
                }
            } catch (Exception e) {
                throw e;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese los datos faltantes");
        }
    }//GEN-LAST:event_btnAltaEventoFuturoMouseClicked

    private void btnImprimirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirMouseClicked

        MessageFormat header = new MessageFormat("Reporte ");
        MessageFormat footer = new MessageFormat("Page {0, number, integer}");

        try {
            jTableEventosFuturos.print(JTable.PrintMode.NORMAL, header, footer);
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
        frmBuscarHembra.frm = "frmEventoFuturo";
        frmInicio.jDkPEscritorio.add(buscarHembra);
        buscarHembra.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBuscarBovinoMouseClicked

    private void jTableEventosFuturosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEventosFuturosMouseClicked

        columna = jTableEventosFuturos.getColumnModel().getColumnIndexAtX(evt.getX());
        row = evt.getY() / jTableEventosFuturos.getRowHeight();
        if (columna <= jTableEventosFuturos.getColumnCount() && columna >= 0 && row <= jTableEventosFuturos.getRowCount() && row >= 0) {
            Object objeto = jTableEventosFuturos.getValueAt(row, columna);
            if (objeto instanceof JButton) {
                ((JButton) objeto).doClick();
                JButton botones = (JButton) objeto;

                if (botones.getName().equals("btnModificar")) {

                    int fila = jTableEventosFuturos.getSelectedRow();

                    if (fila != -1) {
                        limpiarCajas();

                        idEventoFuturo = (int) jTableEventosFuturos.getValueAt(fila, 0);
                        this.dispose();

                        frmModificarEventoFuturo modificarEventoFuturo = new frmModificarEventoFuturo();
                        frmInicio.jDkPEscritorio.add(modificarEventoFuturo);
                        modificarEventoFuturo.setVisible(true);

                    } else {
                        JOptionPane.showMessageDialog(null, "Error: No se selecciono el Evento Futuro a modificar");
                    }
                } else {
                    if (botones.getName().equals("btnEliminar")) {

                        int fila = jTableEventosFuturos.getSelectedRow();
                        int id = Integer.parseInt(this.jTableEventosFuturos.getValueAt(fila, 0).toString());

                        try {

                            //La primera opcion seleccionada (SI) devuelve cero y la segunda (NO) devuelve uno
                            int opcion = JOptionPane.showConfirmDialog(null, "Desea Eliminar el Evento Futuro?", "Eliminar Evento Futuro ", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                            if (opcion == 0) {

                                if (dControladora.bajaEventoFuturo(id)) {

                                    JOptionPane.showMessageDialog(null, "Se eliminó el Evento Futuro");
                                    actualizarTabla();
                                    limpiarCajas(); // Limpiamos Caja de Texto

                                } else {
                                    JOptionPane.showMessageDialog(null, "Error: No se pudo Eliminar el Evento Futuro");
                                }

                            } else {

                                JOptionPane.showMessageDialog(null, "El Evento Futuro no se Eliminó");
                            }

                        } catch (Exception e) {
                            throw e;
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_jTableEventosFuturosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAltaEventoFuturo;
    private javax.swing.JButton btnBuscarBovino;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JComboBox<String> cboTipo;
    private com.toedter.calendar.JDateChooser jDateFechaEventoFuturo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEventosFuturos;
    private java.awt.Label lblRFechaEventoFuturo;
    private java.awt.Label lblRHembra;
    private java.awt.Label lblRTipo;
    private javax.swing.JTextField txtCaravanaHembra;
    // End of variables declaration//GEN-END:variables
}
