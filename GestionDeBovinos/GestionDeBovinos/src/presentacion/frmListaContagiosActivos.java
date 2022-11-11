/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import clases.Aborto;
import clases.Bovino;
import clases.Celo;
import clases.Enfermedad;
import clases.EventoDeSanidad;
import clases.Hembra;
import clases.Inseminacion;
import clases.Padece;
import clases.Parto;
import clases.Secado;
import clases.Tacto;
import dominio.dControladora;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import persistencia.pEnfermedad;

/**
 *
 * @author Godoy
 */
public class frmListaContagiosActivos extends javax.swing.JInternalFrame {

    public static int columna, row; // Metodo para cuando hacemos click en los botones

    public frmListaContagiosActivos() {
        initComponents();

        this.setSize(frmPruebas.jDkPPruebas.getWidth(), frmPruebas.jDkPPruebas.getHeight());
        this.setTitle("LISTADO DE CONTAGIOS ACTIVOS");

        this.llenarComboEnfermedad();
        txtCaravanaBovino.setText(frmBuscarHembra.caravana);

        if (txtCaravanaBovino.getText().isEmpty()) {
            this.listarContagiosActivos();
        } else {
            this.listarContagiosActivosPorBovino();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtCaravanaBovino = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBuscarCaravana = new javax.swing.JButton();
        cboEnfermedad = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        chkActivo = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        btnImprimir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableContagios = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Caravana Bovino");

        btnBuscarCaravana.setText("Buscar Caravana");
        btnBuscarCaravana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarCaravanaMouseClicked(evt);
            }
        });

        cboEnfermedad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));

        jLabel8.setText("Enfermedad:");

        chkActivo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        chkActivo.setText("Activo");
        chkActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkActivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCaravanaBovino, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarCaravana, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboEnfermedad, 0, 193, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBuscarCaravana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCaravanaBovino, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboEnfermedad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
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
                .addGap(49, 49, 49)
                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
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

        jTableContagios = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column){
                return false;
            }};
            jTableContagios.setModel(new javax.swing.table.DefaultTableModel(
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
            jTableContagios.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jTableContagiosMouseClicked(evt);
                }
            });
            jScrollPane1.setViewportView(jTableContagios);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 963, Short.MAX_VALUE))
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                    .addContainerGap())
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    public void listarContagios() {

        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableContagios.setRowSorter(elQueOrdena);

        ArrayList<Padece> listaContagios = dControladora.listarContagios();

        model.addColumn("Caravana");
        model.addColumn("Enfermedad");
        model.addColumn("Fecha Inicio");
        model.addColumn("Fecha Finalización");

        for (Padece p : listaContagios) {

            Enfermedad enfermedad = dControladora.buscarEnfermedad(p.getIdEnfermedad());
            Bovino bovino = dControladora.buscarBovinoId(p.getIdBovino());

            model.addRow(new Object[]{bovino.getCaravanaBovino(), enfermedad.getNombre(), p.getFechaInicio(), p.getFechaFinalizacion()});
        }

        jTableContagios.setModel(model);
        jTableContagios.setRowHeight(25);
    }
    
    public void listarContagiosActivos() {

        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableContagios.setRowSorter(elQueOrdena);

        ArrayList<Padece> listaContagios = dControladora.listarContagiosActivos();

        model.addColumn("Caravana");
        model.addColumn("Enfermedad");
        model.addColumn("Fecha Inicio");
        model.addColumn("Fecha Finalización");

        for (Padece p : listaContagios) {

            Enfermedad enfermedad = dControladora.buscarEnfermedad(p.getIdEnfermedad());
            Bovino bovino = dControladora.buscarBovinoId(p.getIdBovino());

            model.addRow(new Object[]{bovino.getCaravanaBovino(), enfermedad.getNombre(), p.getFechaInicio(), p.getFechaFinalizacion()});
        }

        jTableContagios.setModel(model);
        jTableContagios.setRowHeight(25);
    }
    

    public void listarContagiosPorBovino() {

        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableContagios.setRowSorter(elQueOrdena);
        
        Bovino bovinoSeleccionado = dControladora.buscarBovinoCaravana(txtCaravanaBovino.getText());

        ArrayList<Padece> listaContagios = dControladora.listarContagiosPorBovino(bovinoSeleccionado.getIdBovino());

        model.addColumn("Caravana");
        model.addColumn("Enfermedad");
        model.addColumn("Fecha Inicio");
        model.addColumn("Fecha Finalización");

        for (Padece p : listaContagios) {

            Enfermedad enfermedad = dControladora.buscarEnfermedad(p.getIdEnfermedad());

            model.addRow(new Object[]{bovinoSeleccionado.getCaravanaBovino(), enfermedad.getNombre(), p.getFechaInicio(), p.getFechaFinalizacion()});
        }

        jTableContagios.setModel(model);
        jTableContagios.setRowHeight(25);
    }
    
    public void listarContagiosActivosPorBovino() {

        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableContagios.setRowSorter(elQueOrdena);
        
        Bovino bovinoSeleccionado = dControladora.buscarBovinoCaravana(txtCaravanaBovino.getText());

        ArrayList<Padece> listaContagios = dControladora.listarContagiosPorBovino(bovinoSeleccionado.getIdBovino());

        model.addColumn("Caravana");
        model.addColumn("Enfermedad");
        model.addColumn("Fecha Inicio");
        model.addColumn("Fecha Finalización");

        for (Padece p : listaContagios) {

            Enfermedad enfermedad = dControladora.buscarEnfermedad(p.getIdEnfermedad());

            model.addRow(new Object[]{bovinoSeleccionado.getCaravanaBovino(), enfermedad.getNombre(), p.getFechaInicio(), p.getFechaFinalizacion()});
        }

        jTableContagios.setModel(model);
        jTableContagios.setRowHeight(25);
    }
    
    
    public void listarContagiosPorEnfermedad() {

        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableContagios.setRowSorter(elQueOrdena);
        
        Bovino bovinoSeleccionado = dControladora.buscarBovinoCaravana(txtCaravanaBovino.getText());

        ArrayList<Padece> listaContagios = dControladora.listarContagiosPorBovino(bovinoSeleccionado.getIdBovino());

        model.addColumn("Caravana");
        model.addColumn("Enfermedad");
        model.addColumn("Fecha Inicio");
        model.addColumn("Fecha Finalización");

        for (Padece p : listaContagios) {

            Enfermedad enfermedad = dControladora.buscarEnfermedad(p.getIdEnfermedad());

            model.addRow(new Object[]{bovinoSeleccionado.getCaravanaBovino(), enfermedad.getNombre(), p.getFechaInicio(), p.getFechaFinalizacion()});
        }

        jTableContagios.setModel(model);
        jTableContagios.setRowHeight(25);
    }
    
    public void listarContagiosActivosPorEnfermedad() {

        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableContagios.setRowSorter(elQueOrdena);
        
        Bovino bovinoSeleccionado = dControladora.buscarBovinoCaravana(txtCaravanaBovino.getText());

        ArrayList<Padece> listaContagios = dControladora.listarContagiosPorBovino(bovinoSeleccionado.getIdBovino());

        model.addColumn("Caravana");
        model.addColumn("Enfermedad");
        model.addColumn("Fecha Inicio");
        model.addColumn("Fecha Finalización");

        for (Padece p : listaContagios) {

            Enfermedad enfermedad = dControladora.buscarEnfermedad(p.getIdEnfermedad());

            model.addRow(new Object[]{bovinoSeleccionado.getCaravanaBovino(), enfermedad.getNombre(), p.getFechaInicio(), p.getFechaFinalizacion()});
        }

        jTableContagios.setModel(model);
        jTableContagios.setRowHeight(25);
    }
    
    
    public void listarContagiosPorBovinoPorEnfermedad() {

        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableContagios.setRowSorter(elQueOrdena);
        
        Bovino bovinoSeleccionado = dControladora.buscarBovinoCaravana(txtCaravanaBovino.getText());

        Enfermedad enfermedad = (Enfermedad) cboEnfermedad.getSelectedItem();
                
        ArrayList<Padece> listaContagios = dControladora.listarContagiosPorBovinoPorEnfermedad(bovinoSeleccionado.getIdBovino(),enfermedad.getIdEnfermedad());

        model.addColumn("Caravana");
        model.addColumn("Enfermedad");
        model.addColumn("Fecha Inicio");
        model.addColumn("Fecha Finalización");

        for (Padece p : listaContagios) {

            model.addRow(new Object[]{bovinoSeleccionado.getCaravanaBovino(), enfermedad.getNombre(), p.getFechaInicio(), p.getFechaFinalizacion()});
        }

        jTableContagios.setModel(model);
        jTableContagios.setRowHeight(25);
    }
    
    public void listarContagiosActivosPorBovinoPorEnfermedad() {

        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableContagios.setRowSorter(elQueOrdena);
        
        Bovino bovinoSeleccionado = dControladora.buscarBovinoCaravana(txtCaravanaBovino.getText());

        ArrayList<Padece> listaContagios = dControladora.listarContagiosPorBovino(bovinoSeleccionado.getIdBovino());

        model.addColumn("Caravana");
        model.addColumn("Enfermedad");
        model.addColumn("Fecha Inicio");
        model.addColumn("Fecha Finalización");

        for (Padece p : listaContagios) {

            Enfermedad enfermedad = dControladora.buscarEnfermedad(p.getIdEnfermedad());

            model.addRow(new Object[]{bovinoSeleccionado.getCaravanaBovino(), enfermedad.getNombre(), p.getFechaInicio(), p.getFechaFinalizacion()});
        }

        jTableContagios.setModel(model);
        jTableContagios.setRowHeight(25);
    }
    
    
    private void llenarComboEnfermedad() {

        ArrayList<Enfermedad> listaEnfermedades = pEnfermedad.listarEnfermedades();

        for (Enfermedad enfermedad : listaEnfermedades) {

            cboEnfermedad.addItem(enfermedad);
        }

    }
    
    
    private void btnBuscarCaravanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarCaravanaMouseClicked
        
        frmBuscarBovino form = new frmBuscarBovino();
        form.frm = "frmListaContagiosActivos";
        form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBuscarCaravanaMouseClicked

    private void jTableContagiosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableContagiosMouseClicked

        columna = jTableContagios.getColumnModel().getColumnIndexAtX(evt.getX());
        row = evt.getY() / jTableContagios.getRowHeight();
        if (columna <= jTableContagios.getColumnCount() && columna >= 0 && row <= jTableContagios.getRowCount() && row >= 0) {

            if (evt.getClickCount() == 2) {

                int fila = jTableContagios.getSelectedRow();

                if (fila != -1) {

                    frmBovino.caravana = jTableContagios.getValueAt(fila, 0).toString();
                    frmBovino.sexo = jTableContagios.getValueAt(fila, 3).toString();

                    frmFichaBovino fichaBovino = new frmFichaBovino();
                    frmInicio.jDkPEscritorio.add(fichaBovino);
                    fichaBovino.setVisible(true);
                }
            }

        }
    }//GEN-LAST:event_jTableContagiosMouseClicked

    private void chkActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkActivoActionPerformed

        if (chkActivo.isSelected()) {
        } else {
        }
    }//GEN-LAST:event_chkActivoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCaravana;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JComboBox<Object> cboEnfermedad;
    private javax.swing.JCheckBox chkActivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableContagios;
    private javax.swing.JTextField txtCaravanaBovino;
    // End of variables declaration//GEN-END:variables
}
