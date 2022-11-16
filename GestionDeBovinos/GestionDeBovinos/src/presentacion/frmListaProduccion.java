/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import clases.Hembra;
import clases.Produccion;
import dominio.dControladora;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class frmListaProduccion extends javax.swing.JInternalFrame {

    public static int columna, row; // Metodo para cuando hacemos click en los botones

    public frmListaProduccion() {
        initComponents();

        this.setSize(frmInicio.jDkPEscritorio.getWidth(), frmInicio.jDkPEscritorio.getHeight());
        this.setTitle("LISTADO DE PRODUCCIONES");

        txtCaravanaHembra.setText(frmBuscarHembra.caravana);

        if (txtCaravanaHembra.getText().isEmpty()) {
            this.listarProducciones();
        } else {
            this.listarProduccionesHembra();
        }

    }

    public void listarProducciones() {

        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableProducciones.setRowSorter(elQueOrdena);

        ArrayList<Produccion> listaProduccion = dControladora.listarProducciones();

        model.addColumn("ID Producción");
        model.addColumn("Caravana");
        model.addColumn("Fecha");
        model.addColumn("1era Producción");
        model.addColumn("2da Producción");
        model.addColumn("Producción Total");
        model.addColumn("Proteinas");
        model.addColumn("Grasas");
        model.addColumn("Celulas Somaticas");

        for (Produccion p : listaProduccion) {

            model.addRow(new Object[]{p.getIdProduccion(), p.getHembra().getCaravanaBovino(), p.getFecha(), p.getPrimeraProduccion(), p.getSegundaProduccion(), p.getProduccionTotal(), p.getProteina(),
                p.getGrasa(), p.getCelulaSomatica()});
        }

        jTableProducciones.setModel(model);
        jTableProducciones.setRowHeight(25);
    }

    public void listarUltimasProducciones() {

        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableProducciones.setRowSorter(elQueOrdena);

        ArrayList<Produccion> listaProduccion = dControladora.listarUltimasProducciones();

        model.addColumn("ID Producción");
        model.addColumn("Caravana");
        model.addColumn("Fecha");
        model.addColumn("1era Producción");
        model.addColumn("2da Producción");
        model.addColumn("Producción Total");
        model.addColumn("Proteinas");
        model.addColumn("Grasas");
        model.addColumn("Celulas Somaticas");

        for (Produccion p : listaProduccion) {

            model.addRow(new Object[]{p.getIdProduccion(), p.getHembra().getCaravanaBovino(), p.getFecha(), p.getPrimeraProduccion(), p.getSegundaProduccion(), p.getProduccionTotal(), p.getProteina(),
                p.getGrasa(), p.getCelulaSomatica()});
        }

        jTableProducciones.setModel(model);
        jTableProducciones.setRowHeight(25);
    }

    public void listarProduccionesHembra() {

        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableProducciones.setRowSorter(elQueOrdena);

        Hembra hembra = dControladora.buscarHembraPorCaravana(txtCaravanaHembra.getText());

        ArrayList<Produccion> listaProduccion = dControladora.listarProduccionesHembra(hembra.getIdBovino());

        model.addColumn("ID Producción");
        model.addColumn("Caravana");
        model.addColumn("Fecha");
        model.addColumn("1era Producción");
        model.addColumn("2da Producción");
        model.addColumn("Producción Total");
        model.addColumn("Proteinas");
        model.addColumn("Grasas");
        model.addColumn("Celulas Somaticas");

        for (Produccion p : listaProduccion) {

            model.addRow(new Object[]{p.getIdProduccion(), p.getHembra().getCaravanaBovino(), p.getFecha(), p.getPrimeraProduccion(), p.getSegundaProduccion(), p.getProduccionTotal(), p.getProteina(),
                p.getGrasa(), p.getCelulaSomatica()});
        }

        jTableProducciones.setModel(model);
        jTableProducciones.setRowHeight(25);
    }

    public void listarUltimaProduccionHembra() {

        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableProducciones.setRowSorter(elQueOrdena);

        Hembra hembra = dControladora.buscarHembraPorCaravana(txtCaravanaHembra.getText());

        Produccion p = dControladora.buscarUltimaProduccionHembra(hembra.getIdBovino());

        model.addColumn("ID Producción");
        model.addColumn("Caravana");
        model.addColumn("Fecha");
        model.addColumn("1era Producción");
        model.addColumn("2da Producción");
        model.addColumn("Producción Total");
        model.addColumn("Proteinas");
        model.addColumn("Grasas");
        model.addColumn("Celulas Somaticas");

        model.addRow(new Object[]{p.getIdProduccion(), p.getHembra().getCaravanaBovino(), p.getFecha(), p.getPrimeraProduccion(), p.getSegundaProduccion(), p.getProduccionTotal(), p.getProteina(),
            p.getGrasa(), p.getCelulaSomatica()});

        jTableProducciones.setModel(model);
        jTableProducciones.setRowHeight(25);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProducciones = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtCaravanaHembra = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBuscarCaravana = new javax.swing.JButton();
        chkUltimaProduccion = new javax.swing.JCheckBox();
        btnLimpiar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnImprimir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jTableProducciones = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column){
                return false;
            }};
            jTableProducciones.setModel(new javax.swing.table.DefaultTableModel(
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
            jTableProducciones.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jTableProduccionesMouseClicked(evt);
                }
            });
            jScrollPane1.setViewportView(jTableProducciones);

            jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

            jLabel1.setText("Caravana Hembra");

            btnBuscarCaravana.setText("Buscar Caravana");
            btnBuscarCaravana.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    btnBuscarCaravanaMouseClicked(evt);
                }
            });

            chkUltimaProduccion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            chkUltimaProduccion.setText("Última Producción");
            chkUltimaProduccion.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    chkUltimaProduccionActionPerformed(evt);
                }
            });

            btnLimpiar.setText("Limpiar");
            btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnLimpiarActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(chkUltimaProduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCaravanaHembra, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnBuscarCaravana, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnBuscarCaravana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCaravanaHembra, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(chkUltimaProduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(12, Short.MAX_VALUE))
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

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 917, Short.MAX_VALUE)
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
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                    .addContainerGap())
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents


    private void jTableProduccionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProduccionesMouseClicked

        columna = jTableProducciones.getColumnModel().getColumnIndexAtX(evt.getX());
        row = evt.getY() / jTableProducciones.getRowHeight();
        if (columna <= jTableProducciones.getColumnCount() && columna >= 0 && row <= jTableProducciones.getRowCount() && row >= 0) {

            if (evt.getClickCount() == 2) {

                int fila = jTableProducciones.getSelectedRow();

                if (fila != -1) {

                    frmBovino.caravana = jTableProducciones.getValueAt(fila, 0).toString();
                    frmBovino.sexo = jTableProducciones.getValueAt(fila, 3).toString();

                    frmFichaBovino fichaBovino = new frmFichaBovino();
                    frmInicio.jDkPEscritorio.add(fichaBovino);
                    fichaBovino.setVisible(true);
                }
            }

        }
    }//GEN-LAST:event_jTableProduccionesMouseClicked

    private void btnBuscarCaravanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarCaravanaMouseClicked
        frmBuscarHembra form = new frmBuscarHembra();
        form.frm = "frmListaProduccion";
        frmInicio.jDkPEscritorio.add(form);
        form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBuscarCaravanaMouseClicked

    private void chkUltimaProduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkUltimaProduccionActionPerformed

        if (chkUltimaProduccion.isSelected()) {
            if (!txtCaravanaHembra.getText().isEmpty()) {
                listarUltimaProduccionHembra();
            } else {
                listarUltimasProducciones();
            }
        } else {
            if (!txtCaravanaHembra.getText().isEmpty()) {
                listarProduccionesHembra();
            } else {
                listarProducciones();
            }
        }
    }//GEN-LAST:event_chkUltimaProduccionActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        this.txtCaravanaHembra.setText(null);
        if (chkUltimaProduccion.isSelected()) {

            listarUltimasProducciones();
        } else {

            listarProducciones();

        }
    }//GEN-LAST:event_btnLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCaravana;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JCheckBox chkUltimaProduccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProducciones;
    private javax.swing.JTextField txtCaravanaHembra;
    // End of variables declaration//GEN-END:variables
}
