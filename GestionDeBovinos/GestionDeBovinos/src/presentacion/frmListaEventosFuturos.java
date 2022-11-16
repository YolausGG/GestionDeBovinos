/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import clases.Aborto;
import clases.Celo;
import clases.EventoDeSanidad;
import clases.EventoFuturo;
import clases.Hembra;
import clases.Inseminacion;
import clases.Parto;
import clases.Secado;
import clases.Tacto;
import dominio.dControladora;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Godoy
 */
public class frmListaEventosFuturos extends javax.swing.JInternalFrame {

    public static int columna, row; // Metodo para cuando hacemos click en los botones

    public frmListaEventosFuturos() {
        initComponents();

        this.setSize(frmInicio.jDkPEscritorio.getWidth(), frmInicio.jDkPEscritorio.getHeight());
        this.setTitle("LISTADO DE EVENTOS DE SANIDAD");

        txtCaravanaHembra.setText(frmBuscarHembra.caravana);

        if (txtCaravanaHembra.getText().isEmpty()) {
            this.listarEventosFuturos();
        } else {
            this.listarEventosFuturosPorHembra();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtCaravanaHembra = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBuscarCaravana = new javax.swing.JButton();
        cboTipoEvento = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        btnLimpiarHembra = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnImprimir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEventosDeSanidad = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtCaravanaHembra.setEditable(false);

        jLabel1.setText("Caravana Hembra");

        btnBuscarCaravana.setText("Buscar Caravana");
        btnBuscarCaravana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarCaravanaMouseClicked(evt);
            }
        });

        cboTipoEvento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Tacto", "Secado", "Inseminacion", "Parto" }));
        cboTipoEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipoEventoActionPerformed(evt);
            }
        });

        jLabel8.setText("Tipo de Evento");

        btnLimpiarHembra.setText("Limpiar");
        btnLimpiarHembra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarHembraMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCaravanaHembra, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscarCaravana, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboTipoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnLimpiarHembra, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCaravanaHembra, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboTipoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCaravana, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLimpiarHembra, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnImprimir.setText("Imprimir");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Imprimir Lista");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTableEventosDeSanidad = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column){
                return false;
            }};
            jTableEventosDeSanidad.setModel(new javax.swing.table.DefaultTableModel(
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
            jTableEventosDeSanidad.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jTableEventosDeSanidadMouseClicked(evt);
                }
            });
            jScrollPane1.setViewportView(jTableEventosDeSanidad);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 878, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap())
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                    .addContainerGap())
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    public void listarEventosFuturos() {

        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableEventosDeSanidad.setRowSorter(elQueOrdena);

        ArrayList<EventoFuturo> listaEventosFuturo = dControladora.listarEventosFuturos();

        model.addColumn("ID Evento Futuro");
        model.addColumn("Tipo");
        model.addColumn("Caravana Hembra");
        model.addColumn("Fecha Prevista");

        for (EventoFuturo eF : listaEventosFuturo) {

            model.addRow(new Object[]{eF.getIdEventoFuturo(), eF.getTipo(), eF.getHembra().getCaravanaBovino(), eF.getFechaPrevista()});

        }

        jTableEventosDeSanidad.setModel(model);
        jTableEventosDeSanidad.setRowHeight(25);
    }

    public void listarEventosFuturosPorHembra() {

        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableEventosDeSanidad.setRowSorter(elQueOrdena);

        ArrayList<EventoFuturo> listaEventosFuturo = dControladora.listarEventosFuturosPorCaravana(txtCaravanaHembra.getText());

        model.addColumn("ID Evento Futuro");
        model.addColumn("Tipo");
        model.addColumn("Caravana Hembra");
        model.addColumn("Fecha Prevista");

        for (EventoFuturo eF : listaEventosFuturo) {

            model.addRow(new Object[]{eF.getIdEventoFuturo(), eF.getTipo(), eF.getHembra().getCaravanaBovino(), eF.getFechaPrevista()});

        }

        jTableEventosDeSanidad.setModel(model);
        jTableEventosDeSanidad.setRowHeight(25);
    }

    public void listarEventosFuturosPorTipoEvento() {

        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableEventosDeSanidad.setRowSorter(elQueOrdena);

        ArrayList<EventoFuturo> listaEventosFuturo = dControladora.listarEventosFuturos();

        model.addColumn("ID Evento Futuro");
        model.addColumn("Tipo");
        model.addColumn("Caravana Hembra");
        model.addColumn("Fecha Prevista");

        switch (cboTipoEvento.getSelectedItem().toString()) {
            case "Seleccionar":
                listarEventosFuturos();
                break;
            case "Tacto":
                for (EventoFuturo eF : listaEventosFuturo) {
                    if (eF.getTipo().equals("Tacto")) {
                        model.addRow(new Object[]{eF.getIdEventoFuturo(), eF.getTipo(), eF.getHembra().getCaravanaBovino(), eF.getFechaPrevista()});
                    }
                }
                break;
            case "Secado":
                for (EventoFuturo eF : listaEventosFuturo) {
                    if (eF.getTipo().equals("Secado")) {
                        model.addRow(new Object[]{eF.getIdEventoFuturo(), eF.getTipo(), eF.getHembra().getCaravanaBovino(), eF.getFechaPrevista()});
                    }
                }
                break;
            case "Inseminacion":
                for (EventoFuturo eF : listaEventosFuturo) {
                    if (eF.getTipo().equals("Inseminacion")) {
                        model.addRow(new Object[]{eF.getIdEventoFuturo(), eF.getTipo(), eF.getHembra().getCaravanaBovino(), eF.getFechaPrevista()});
                    }
                }
                break;

            case "Parto":
                for (EventoFuturo eF : listaEventosFuturo) {
                    if (eF.getTipo().equals("Parto")) {
                        model.addRow(new Object[]{eF.getIdEventoFuturo(), eF.getTipo(), eF.getHembra().getCaravanaBovino(), eF.getFechaPrevista()});
                    }
                }
                break;

            default:
                throw new AssertionError();
        }
        jTableEventosDeSanidad.setModel(model);
        jTableEventosDeSanidad.setRowHeight(25);
    }

    public void listarEventosFuturosPorTipoEventoPorHembra() {

        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableEventosDeSanidad.setRowSorter(elQueOrdena);

        ArrayList<EventoFuturo> listaEventosFuturo = dControladora.listarEventosFuturosPorCaravana(txtCaravanaHembra.getText());

        model.addColumn("ID Evento Futuro");
        model.addColumn("Tipo");
        model.addColumn("Caravana Hembra");
        model.addColumn("Fecha Prevista");

        switch (cboTipoEvento.getSelectedItem().toString()) {
            case "Seleccionar":
                listarEventosFuturos();
                break;
            case "Tacto":
                for (EventoFuturo eF : listaEventosFuturo) {
                    if (eF.getTipo().equals("Tacto")) {
                        model.addRow(new Object[]{eF.getIdEventoFuturo(), eF.getTipo(), eF.getHembra().getCaravanaBovino(), eF.getFechaPrevista()});
                    }
                }
                break;
            case "Secado":
                for (EventoFuturo eF : listaEventosFuturo) {
                    if (eF.getTipo().equals("Secado")) {
                        model.addRow(new Object[]{eF.getIdEventoFuturo(), eF.getTipo(), eF.getHembra().getCaravanaBovino(), eF.getFechaPrevista()});
                    }
                }
                break;
            case "Inseminacion":
                for (EventoFuturo eF : listaEventosFuturo) {
                    if (eF.getTipo().equals("Inseminacion")) {
                        model.addRow(new Object[]{eF.getIdEventoFuturo(), eF.getTipo(), eF.getHembra().getCaravanaBovino(), eF.getFechaPrevista()});
                    }
                }
                break;

            case "Parto":
                for (EventoFuturo eF : listaEventosFuturo) {
                    if (eF.getTipo().equals("Parto")) {
                        model.addRow(new Object[]{eF.getIdEventoFuturo(), eF.getTipo(), eF.getHembra().getCaravanaBovino(), eF.getFechaPrevista()});
                    }
                }
                break;

            default:
                throw new AssertionError();
        }
        jTableEventosDeSanidad.setModel(model);
        jTableEventosDeSanidad.setRowHeight(25);
    }

    private void btnBuscarCaravanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarCaravanaMouseClicked

        frmBuscarHembra form = new frmBuscarHembra();
        form.frm = "frmListaEventosFuturos";
        frmInicio.jDkPEscritorio.add(form);
        form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBuscarCaravanaMouseClicked

    private void jTableEventosDeSanidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEventosDeSanidadMouseClicked

        columna = jTableEventosDeSanidad.getColumnModel().getColumnIndexAtX(evt.getX());
        row = evt.getY() / jTableEventosDeSanidad.getRowHeight();
        if (columna <= jTableEventosDeSanidad.getColumnCount() && columna >= 0 && row <= jTableEventosDeSanidad.getRowCount() && row >= 0) {

            if (evt.getClickCount() == 2) {

                int fila = jTableEventosDeSanidad.getSelectedRow();

                if (fila != -1) {

                    frmBovino.caravana = jTableEventosDeSanidad.getValueAt(fila, 0).toString();
                    frmBovino.sexo = jTableEventosDeSanidad.getValueAt(fila, 3).toString();

                    frmFichaBovino fichaBovino = new frmFichaBovino();
                    frmInicio.jDkPEscritorio.add(fichaBovino);
                    fichaBovino.setVisible(true);
                }
            }

        }
    }//GEN-LAST:event_jTableEventosDeSanidadMouseClicked


    private void cboTipoEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTipoEventoActionPerformed

        if (cboTipoEvento.getSelectedIndex() != 0) {

            if (!txtCaravanaHembra.getText().isEmpty()) {
                listarEventosFuturosPorTipoEventoPorHembra();
            } else {
                listarEventosFuturosPorTipoEvento();
            }

        } else {

            if (!txtCaravanaHembra.getText().isEmpty()) {
                listarEventosFuturosPorHembra();
            } else {
                listarEventosFuturos();
            }
        }
    }//GEN-LAST:event_cboTipoEventoActionPerformed

    private void btnLimpiarHembraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarHembraMouseClicked

        txtCaravanaHembra.setText(null);
        if (cboTipoEvento.getSelectedIndex() != 0) {
            listarEventosFuturosPorTipoEvento();
        } else {
            listarEventosFuturos();
        }
    }//GEN-LAST:event_btnLimpiarHembraMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCaravana;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnLimpiarHembra;
    public static javax.swing.JComboBox<Object> cboTipoEvento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEventosDeSanidad;
    private javax.swing.JTextField txtCaravanaHembra;
    // End of variables declaration//GEN-END:variables
}
