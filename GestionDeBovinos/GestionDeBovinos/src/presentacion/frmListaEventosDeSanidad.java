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

        this.setSize(frmInicio.jDkPEscritorio.getWidth(), frmInicio.jDkPEscritorio.getHeight());
        this.setTitle("LISTADO DE EVENTOS DE SANIDAD");

        lblCaravanaMacho.setVisible(false);
        txtCaravanaMacho.setVisible(false);
        btnBuscarCaravanaMacho.setVisible(false);
        btnLimpiarMacho.setVisible(false);

        txtCaravanaHembra.setText(frmBuscarHembra.caravana);
        txtCaravanaMacho.setText(frmBuscarMacho.caravana);

        if (cboTipoEvento.getSelectedIndex() == 3) {
            listarEventosDeSanidadPorTipoEventoCaravanas();
        }

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
        btnLimpiarMacho = new javax.swing.JButton();
        cboTipoEvento = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        btnBuscarCaravanaMacho = new javax.swing.JButton();
        txtCaravanaMacho = new javax.swing.JTextField();
        lblCaravanaMacho = new javax.swing.JLabel();
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

        btnLimpiarMacho.setText("Limpiar");
        btnLimpiarMacho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMachoMouseClicked(evt);
            }
        });

        cboTipoEvento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Tacto", "Secado", "Inseminacion", "Celo", "Parto", "Aborto" }));
        cboTipoEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipoEventoActionPerformed(evt);
            }
        });

        jLabel8.setText("Tipo de Evento");

        btnBuscarCaravanaMacho.setText("Buscar Caravana");
        btnBuscarCaravanaMacho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarCaravanaMachoMouseClicked(evt);
            }
        });

        txtCaravanaMacho.setEditable(false);

        lblCaravanaMacho.setText("Caravana Macho:");

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
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCaravanaMacho, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCaravanaMacho, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarCaravanaMacho, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnLimpiarMacho, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCaravanaMacho, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCaravanaHembra, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboTipoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCaravana, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCaravanaMacho, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCaravanaMacho, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpiarMacho, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiarHembra, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(jScrollPane1)
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
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

    public void listarEventosDeSanidadPorTipoEvento() {

        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableEventosDeSanidad.setRowSorter(elQueOrdena);

        switch (cboTipoEvento.getSelectedItem().toString()) {
            case "Seleccionar":
                listarEventosDeSanidad();
                break;
            case "Tacto":
                ArrayList<Tacto> listaTactos = dControladora.listarTactos();

                model.addColumn("id Tacto");
                model.addColumn("Caravana Hembra");
                model.addColumn("Fecha");
                model.addColumn("Detalle");
                model.addColumn("Resultado");
                model.addColumn("Diagnostico");

                for (Tacto t : listaTactos) {

                    model.addRow(new Object[]{t.getIdEventoDeSanidad(), t.getHembra().getCaravanaBovino(), t.getFecha(), t.getDetalle(), t.getResultado(), t.getDiagnostico()});
                }
                break;
            case "Secado":
                ArrayList<Secado> listaSecados = dControladora.listarSecados();

                model.addColumn("id Secado");
                model.addColumn("Caravana Hembra");
                model.addColumn("Fecha");
                model.addColumn("Detalle");
                model.addColumn("Causa");

                for (Secado s : listaSecados) {

                    model.addRow(new Object[]{s.getIdEventoDeSanidad(), s.getHembra().getCaravanaBovino(), s.getFecha(), s.getDetalle(), s.getCausa()});
                }
                break;
            case "Inseminacion":
                ArrayList<Inseminacion> listaInseminaciones = dControladora.listarInseminaciones();

                model.addColumn("id Inseminacion");
                model.addColumn("Caravana Hembra");
                model.addColumn("Caravana Macho");
                model.addColumn("Fecha");
                model.addColumn("Detalle");

                for (Inseminacion i : listaInseminaciones) {

                    model.addRow(new Object[]{i.getIdEventoDeSanidad(), i.getHembra().getCaravanaBovino(), i.getMacho().getCaravanaBovino(), i.getFecha(), i.getDetalle()});
                }
                break;
            case "Celo":
                ArrayList<Celo> listaCelos = dControladora.listarCelos();

                model.addColumn("id Celo");
                model.addColumn("Caravana Hembra");
                model.addColumn("Fecha");
                model.addColumn("Detalle");
                model.addColumn("Causa");

                for (Celo c : listaCelos) {

                    model.addRow(new Object[]{c.getIdEventoDeSanidad(), c.getHembra().getCaravanaBovino(), c.getFecha(), c.getDetalle(), c.getCausa()});
                }
                break;
            case "Parto":
                ArrayList<Parto> listaPartos = dControladora.listarPartos();

                model.addColumn("id Parto");
                model.addColumn("Caravana Hembra");
                model.addColumn("Fecha");
                model.addColumn("Detalle");
                model.addColumn("Tipo");

                for (Parto p : listaPartos) {

                    model.addRow(new Object[]{p.getIdEventoDeSanidad(), p.getHembra().getCaravanaBovino(), p.getFecha(), p.getDetalle(), p.getTipo()});
                }
                break;
            case "Aborto":
                ArrayList<Aborto> listaAbortos = dControladora.listarAbortos();

                model.addColumn("id Aborto");
                model.addColumn("Caravana Hembra");
                model.addColumn("Fecha");
                model.addColumn("Detalle");
                model.addColumn("Causa");

                for (Aborto a : listaAbortos) {

                    model.addRow(new Object[]{a.getIdEventoDeSanidad(), a.getHembra().getCaravanaBovino(), a.getFecha(), a.getDetalle(), a.getCausa()});
                }
                break;
            default:
                throw new AssertionError();
        }
        jTableEventosDeSanidad.setModel(model);
        jTableEventosDeSanidad.setRowHeight(25);
    }

    public void listarEventosDeSanidadPorTipoEventoCaravanas() {

        DefaultTableModel model = new DefaultTableModel();

        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(model);
        jTableEventosDeSanidad.setRowSorter(elQueOrdena);

        String caravana = txtCaravanaHembra.getText();

        switch (cboTipoEvento.getSelectedItem().toString()) {
            case "Seleccionar":
                listarEventosDeSanidad();
                break;
            case "Tacto":
                ArrayList<Tacto> listaTactos = dControladora.listarTactosPorCaravana(caravana);

                model.addColumn("id Tacto");
                model.addColumn("Caravana Hembra");
                model.addColumn("Fecha");
                model.addColumn("Detalle");
                model.addColumn("Resultado");
                model.addColumn("Diagnostico");

                for (Tacto t : listaTactos) {

                    model.addRow(new Object[]{t.getIdEventoDeSanidad(), t.getHembra().getCaravanaBovino(), t.getFecha(), t.getDetalle(), t.getResultado(), t.getDiagnostico()});
                }
                break;
            case "Secado":
                ArrayList<Secado> listaSecados = dControladora.listarSecadosPorCaravana(caravana);

                model.addColumn("id Secado");
                model.addColumn("Caravana Hembra");
                model.addColumn("Fecha");
                model.addColumn("Detalle");
                model.addColumn("Causa");

                for (Secado s : listaSecados) {

                    model.addRow(new Object[]{s.getIdEventoDeSanidad(), s.getHembra().getCaravanaBovino(), s.getFecha(), s.getDetalle(), s.getCausa()});
                }
                break;
            case "Inseminacion":

                ArrayList<Inseminacion> listaInseminaciones = new ArrayList<>();

                if (!txtCaravanaHembra.getText().isEmpty() && !txtCaravanaMacho.getText().isEmpty()) {
                    listaInseminaciones = dControladora.listarInseminacionesPorCaravanaHembraYMacho(txtCaravanaHembra.getText(), txtCaravanaMacho.getText());
                } else if (!txtCaravanaHembra.getText().isEmpty()) {
                    listaInseminaciones = dControladora.listarInseminacionesPorCaravana(txtCaravanaHembra.getText());
                } else if (!txtCaravanaMacho.getText().isEmpty()) {
                    listaInseminaciones = dControladora.listarInseminacionesPorCaravana(txtCaravanaMacho.getText());
                }
                model.addColumn("id Inseminacion");
                model.addColumn("Caravana Hembra");
                model.addColumn("Caravana Macho");
                model.addColumn("Fecha");
                model.addColumn("Detalle");

                for (Inseminacion i : listaInseminaciones) {

                    model.addRow(new Object[]{i.getIdEventoDeSanidad(), i.getHembra().getCaravanaBovino(), i.getMacho().getCaravanaBovino(), i.getFecha(), i.getDetalle()});
                }
                break;

            case "Celo":
                ArrayList<Celo> listaCelos = dControladora.listarCelosPorCaravana(caravana);

                model.addColumn("id Celo");
                model.addColumn("Caravana Hembra");
                model.addColumn("Fecha");
                model.addColumn("Detalle");
                model.addColumn("Causa");

                for (Celo c : listaCelos) {

                    model.addRow(new Object[]{c.getIdEventoDeSanidad(), c.getHembra().getCaravanaBovino(), c.getFecha(), c.getDetalle(), c.getCausa()});
                }
                break;
            case "Parto":
                ArrayList<Parto> listaPartos = dControladora.listarPartosPorCaravana(caravana);

                model.addColumn("id Parto");
                model.addColumn("Caravana Hembra");
                model.addColumn("Fecha");
                model.addColumn("Detalle");
                model.addColumn("Tipo");

                for (Parto p : listaPartos) {

                    model.addRow(new Object[]{p.getIdEventoDeSanidad(), p.getHembra().getCaravanaBovino(), p.getFecha(), p.getDetalle(), p.getTipo()});
                }
                break;
            case "Aborto":
                ArrayList<Aborto> listaAbortos = dControladora.listarAbortosPorCaravana(caravana);

                model.addColumn("id Aborto");
                model.addColumn("Caravana Hembra");
                model.addColumn("Fecha");
                model.addColumn("Detalle");
                model.addColumn("Causa");

                for (Aborto a : listaAbortos) {

                    model.addRow(new Object[]{a.getIdEventoDeSanidad(), a.getHembra().getCaravanaBovino(), a.getFecha(), a.getDetalle(), a.getCausa()});
                }
                break;
            default:
                throw new AssertionError();
        }
        jTableEventosDeSanidad.setModel(model);

        jTableEventosDeSanidad.setRowHeight(
                25);
    }

    private void btnBuscarCaravanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarCaravanaMouseClicked

        frmBuscarHembra form = new frmBuscarHembra();
        form.frm = "frmListaEventosDeSanidad";
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
            if (cboTipoEvento.getSelectedIndex() == 3) {
                lblCaravanaMacho.setVisible(true);
                txtCaravanaMacho.setVisible(true);
                btnBuscarCaravanaMacho.setVisible(true);
                btnLimpiarMacho.setVisible(true);
                if (!txtCaravanaHembra.getText().isEmpty() || !txtCaravanaMacho.getText().isEmpty()) {
                    listarEventosDeSanidadPorTipoEventoCaravanas();
                } else {
                    listarEventosDeSanidadPorTipoEvento();
                }
            } else {
                lblCaravanaMacho.setVisible(false);
                txtCaravanaMacho.setVisible(false);
                btnBuscarCaravanaMacho.setVisible(false);
                btnLimpiarMacho.setVisible(false);
            }
            if (!txtCaravanaHembra.getText().isEmpty()) {
                listarEventosDeSanidadPorTipoEventoCaravanas();
            } else {
                listarEventosDeSanidadPorTipoEvento();
            }

        } else {
            lblCaravanaMacho.setVisible(false);
            txtCaravanaMacho.setVisible(false);
            btnBuscarCaravanaMacho.setVisible(false);
            btnLimpiarMacho.setVisible(false);
            if (!txtCaravanaHembra.getText().isEmpty()) {
                listarEventosDeSanidadHembra();
            } else {
                listarEventosDeSanidad();
            }
        }
    }//GEN-LAST:event_cboTipoEventoActionPerformed

    private void btnLimpiarHembraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarHembraMouseClicked

        txtCaravanaHembra.setText(null);
        if (cboTipoEvento.getSelectedIndex() != 0) {
            if (cboTipoEvento.getSelectedIndex() == 3) {
                lblCaravanaMacho.setVisible(true);
                txtCaravanaMacho.setVisible(true);
                btnBuscarCaravanaMacho.setVisible(true);
                btnLimpiarMacho.setVisible(true);
                if (!txtCaravanaMacho.getText().isEmpty()) {
                    listarEventosDeSanidadPorTipoEventoCaravanas();
                } else {
                    listarEventosDeSanidadPorTipoEvento();
                }
            } else {
                listarEventosDeSanidadPorTipoEvento();
                lblCaravanaMacho.setVisible(false);
                txtCaravanaMacho.setVisible(false);
                btnBuscarCaravanaMacho.setVisible(false);
                btnLimpiarMacho.setVisible(false);
            }

        } else {

            listarEventosDeSanidad();
        }
    }//GEN-LAST:event_btnLimpiarHembraMouseClicked

    private void btnBuscarCaravanaMachoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarCaravanaMachoMouseClicked
        frmBuscarMacho form = new frmBuscarMacho();
        form.frm = "frmListaEventosDeSanidad";
        frmInicio.jDkPEscritorio.add(form);
        form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBuscarCaravanaMachoMouseClicked

    private void btnLimpiarMachoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMachoMouseClicked

        this.txtCaravanaMacho.setText(null);

        if (cboTipoEvento.getSelectedIndex() != 0) {
            if (cboTipoEvento.getSelectedIndex() == 3) {
                lblCaravanaMacho.setVisible(true);
                txtCaravanaMacho.setVisible(true);
                btnBuscarCaravanaMacho.setVisible(true);
                btnLimpiarMacho.setVisible(true);
                if (!txtCaravanaHembra.getText().isEmpty()) {
                    listarEventosDeSanidadPorTipoEventoCaravanas();
                } else {
                    listarEventosDeSanidadPorTipoEvento();
                }
            } else {
                lblCaravanaMacho.setVisible(false);
                txtCaravanaMacho.setVisible(false);
                btnBuscarCaravanaMacho.setVisible(false);
                btnLimpiarMacho.setVisible(false);
            }
            if (!txtCaravanaHembra.getText().isEmpty()) {
                listarEventosDeSanidadPorTipoEventoCaravanas();
            } else {
                listarEventosDeSanidadPorTipoEvento();
            }

        } else {

            if (!txtCaravanaHembra.getText().isEmpty()) {
                listarEventosDeSanidadHembra();
            } else {
                listarEventosDeSanidad();
            }
        }

    }//GEN-LAST:event_btnLimpiarMachoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCaravana;
    private javax.swing.JButton btnBuscarCaravanaMacho;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnLimpiarHembra;
    private javax.swing.JButton btnLimpiarMacho;
    public static javax.swing.JComboBox<Object> cboTipoEvento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEventosDeSanidad;
    private javax.swing.JLabel lblCaravanaMacho;
    private javax.swing.JTextField txtCaravanaHembra;
    private javax.swing.JTextField txtCaravanaMacho;
    // End of variables declaration//GEN-END:variables
}
