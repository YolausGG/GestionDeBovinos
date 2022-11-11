/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import clases.Aborto;
import clases.Celo;
import clases.EventoDeSanidad;
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
public class frmListaEventosDeSanidad extends javax.swing.JInternalFrame {

    public static int columna, row; // Metodo para cuando hacemos click en los botones

    public frmListaEventosDeSanidad() {
        initComponents();

        this.setSize(frmPruebas.jDkPPruebas.getWidth(), frmPruebas.jDkPPruebas.getHeight());
        this.setTitle("LISTADO DE EVENTOS DE SANIDAD");

        txtCaravanaHembra.setText(frmBuscarHembra.caravana);

        if (txtCaravanaHembra.getText().isEmpty()) {
            this.listarEventosDeSanidad();
        } else {
            this.listarEventosDeSanidadHembra();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtCaravanaHembra = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBuscarCaravana = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnImprimir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEventosDeSanidad = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Caravana Hembra");

        btnBuscarCaravana.setText("Buscar Caravana");
        btnBuscarCaravana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarCaravanaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCaravanaHembra, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarCaravana, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuscarCaravana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCaravanaHembra, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
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

    public void listarEventosDeSanidad() {

        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableEventosDeSanidad.setRowSorter(elQueOrdena);

        ArrayList<EventoDeSanidad> listaEventosDeSanidad = dControladora.listarEventosDeSanidad();

        model.addColumn("ID Evento De Sanidad");
        model.addColumn("Tipo");
        model.addColumn("Caravana");
        model.addColumn("Fecha");
        model.addColumn("Detalle");
        model.addColumn("Causa");
        model.addColumn("Tipo");
        model.addColumn("Resultado");
        model.addColumn("Diagnóstico");
        model.addColumn("Caravana Macho");

        for (EventoDeSanidad e : listaEventosDeSanidad) {

            switch (e.getClass().getSimpleName().toString()) {
                case "Inseminacion":
                    Inseminacion ins = (Inseminacion) e;
                    model.addRow(new Object[]{
                        ins.getIdEventoDeSanidad(),
                        "Inseminacion",
                        ins.getHembra().getCaravanaBovino(),
                        ins.getFecha(),
                        ins.getDetalle(),
                        "",
                        "",
                        "",
                        "",
                        ins.getMacho().getCaravanaBovino()});
                    break;
                case "Aborto":
                    Aborto abo = (Aborto) e;
                    model.addRow(new Object[]{
                        abo.getIdEventoDeSanidad(),
                        "Aborto",
                        abo.getHembra().getCaravanaBovino(),
                        abo.getFecha(),
                        abo.getDetalle(),
                        abo.getCausa(),
                        "",
                        "",
                        "",
                        ""});
                    break;
                case "Parto":
                    Parto par = (Parto) e;
                    model.addRow(new Object[]{
                        par.getIdEventoDeSanidad(),
                        "Parto",
                        par.getHembra().getCaravanaBovino(),
                        par.getFecha(),
                        par.getDetalle(),
                        "",
                        par.getTipo(),
                        "",
                        "",
                        ""});
                    break;
                case "Tacto":
                    Tacto tac = (Tacto) e;
                    model.addRow(new Object[]{
                        tac.getIdEventoDeSanidad(),
                        "Tacto",
                        tac.getHembra().getCaravanaBovino(),
                        tac.getFecha(),
                        tac.getDetalle(),
                        "",
                        "",
                        tac.getResultado(),
                        tac.getDiagnostico(),
                        ""});
                    break;
                case "Secado":
                    Secado sec = (Secado) e;
                    model.addRow(new Object[]{
                        sec.getIdEventoDeSanidad(),
                        "Secado",
                        sec.getHembra().getCaravanaBovino(),
                        sec.getFecha(),
                        sec.getDetalle(),
                        sec.getCausa(),
                        "",
                        "",
                        "",
                        ""});
                    break;
                case "Celo":
                    Celo celo = (Celo) e;
                    model.addRow(new Object[]{
                        celo.getIdEventoDeSanidad(),
                        "Celo",
                        celo.getHembra().getCaravanaBovino(),
                        celo.getFecha(),
                        celo.getDetalle(),
                        celo.getCausa(),
                        "",
                        "",
                        "",
                        ""});
                    break;
                default:
                    throw new AssertionError();
            }

        }

        jTableEventosDeSanidad.setModel(model);
        jTableEventosDeSanidad.setRowHeight(25);
    }

    public void listarEventosDeSanidadHembra() {

        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableEventosDeSanidad.setRowSorter(elQueOrdena);

        Hembra hembra = dControladora.buscarHembraPorCaravana(txtCaravanaHembra.getText());

        ArrayList<EventoDeSanidad> listaEventosDeSanidadHembra = dControladora.listarEventosDeSanidadPorCaravana(hembra.getCaravanaBovino());

        for (EventoDeSanidad e : listaEventosDeSanidadHembra) {
            switch (e.getClass().getSimpleName().toString()) {
                case "Inseminacion":
                    Inseminacion ins = (Inseminacion) e;
                    model.addRow(new Object[]{
                        ins.getIdEventoDeSanidad(),
                        "Inseminacion",
                        ins.getHembra().getCaravanaBovino(),
                        ins.getFecha(),
                        ins.getDetalle(),
                        "",
                        "",
                        "",
                        "",
                        ins.getMacho().getCaravanaBovino()});
                    break;
                case "Aborto":
                    Aborto abo = (Aborto) e;
                    model.addRow(new Object[]{
                        abo.getIdEventoDeSanidad(),
                        "Aborto",
                        abo.getHembra().getCaravanaBovino(),
                        abo.getFecha(),
                        abo.getDetalle(),
                        abo.getCausa(),
                        "",
                        "",
                        "",
                        ""});
                    break;
                case "Parto":
                    Parto par = (Parto) e;
                    model.addRow(new Object[]{
                        par.getIdEventoDeSanidad(),
                        "Parto",
                        par.getHembra().getCaravanaBovino(),
                        par.getFecha(),
                        par.getDetalle(),
                        "",
                        par.getTipo(),
                        "",
                        "",
                        ""});
                    break;
                case "Tacto":
                    Tacto tac = (Tacto) e;
                    model.addRow(new Object[]{
                        tac.getIdEventoDeSanidad(),
                        "Tacto",
                        tac.getHembra().getCaravanaBovino(),
                        tac.getFecha(),
                        tac.getDetalle(),
                        "",
                        "",
                        tac.getResultado(),
                        tac.getDiagnostico(),
                        ""});
                    break;
                case "Secado":
                    Secado sec = (Secado) e;
                    model.addRow(new Object[]{
                        sec.getIdEventoDeSanidad(),
                        "Secado",
                        sec.getHembra().getCaravanaBovino(),
                        sec.getFecha(),
                        sec.getDetalle(),
                        sec.getCausa(),
                        "",
                        "",
                        "",
                        ""});
                    break;
                case "Celo":
                    Celo celo = (Celo) e;
                    model.addRow(new Object[]{
                        celo.getIdEventoDeSanidad(),
                        "Celo",
                        celo.getHembra().getCaravanaBovino(),
                        celo.getFecha(),
                        celo.getDetalle(),
                        celo.getCausa(),
                        "",
                        "",
                        "",
                        ""});
                    break;
                default:
                    throw new AssertionError();
            }
        }
        jTableEventosDeSanidad.setModel(model);
        jTableEventosDeSanidad.setRowHeight(25);
    }
    
    

    private void btnBuscarCaravanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarCaravanaMouseClicked
        frmBuscarHembra form = new frmBuscarHembra();
        form.frm = "frmListaEventosDeSanidad";
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCaravana;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEventosDeSanidad;
    private javax.swing.JTextField txtCaravanaHembra;
    // End of variables declaration//GEN-END:variables
}
