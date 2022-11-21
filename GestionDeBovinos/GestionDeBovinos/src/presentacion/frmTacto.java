/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import clases.BotonesTabla;
import clases.EventoDeSanidad;
import clases.EventoFuturo;
import clases.Hembra;
import clases.Tacto;
import dominio.dControladora;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.*;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JTable;

public class frmTacto extends javax.swing.JInternalFrame {

    JButton modificar = new JButton("Modificar"); // Creamos los botones para la tabla
    JButton eliminar = new JButton("Eliminar");

    public static int idTacto = 0;
    public static int columna, row; // Metodo para cuando hacemos click en los botones    

    public void insertarIconos(JButton btn, String ruta) { // Insertar Iconos en Botones Tabla

        btn.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta)));

    }

    public frmTacto() {
        initComponents();

        this.setSize(frmInicio.jDkPEscritorio.getWidth(), frmInicio.jDkPEscritorio.getHeight());
        this.setTitle("TACTO");
        modificar.setBorder(null);
        eliminar.setBorder(null);
        insertarIconos(modificar, "/Imagenes/Modificar16px.png");
        insertarIconos(eliminar, "/Imagenes/Eliminar16px.png");
        txtCaravanaHembra.setText(frmBuscarHembra.caravana);
        modificar.setName("btnModificar");
        eliminar.setName("btnEliminar");
        lblRResultado.setVisible(false);
        lblRFechaTacto.setVisible(false);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTactos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAltaCelo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cboResultado = new javax.swing.JComboBox<>();
        lblRResultado = new java.awt.Label();
        lblRHembra = new java.awt.Label();
        jLabel3 = new javax.swing.JLabel();
        jDateFechaTacto = new com.toedter.calendar.JDateChooser();
        lblRFechaTacto = new java.awt.Label();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaDetalle = new javax.swing.JTextArea();
        txtCaravanaHembra = new javax.swing.JTextField();
        btnBuscarBovino = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txaDiagnostico = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(54, 67, 114));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jTableTactos = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        jTableTactos.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableTactos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTactosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTactos);

        jPanel2.setBackground(new java.awt.Color(133, 146, 158));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Resultado:");

        btnAltaCelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ingresar 16px.png"))); // NOI18N
        btnAltaCelo.setText("Agregar");
        btnAltaCelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAltaCeloMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Detalle (Opcional): ");

        cboResultado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Preñez", "No Preñez" }));

        lblRResultado.setText("Requerido");

        lblRHembra.setText("Requerido");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Hembra:");

        lblRFechaTacto.setText("Requerido");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Fecha Tacto:");

        txaDetalle.setColumns(20);
        txaDetalle.setRows(5);
        jScrollPane2.setViewportView(txaDetalle);

        txtCaravanaHembra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCaravanaHembraKeyReleased(evt);
            }
        });

        btnBuscarBovino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar16px.png"))); // NOI18N
        btnBuscarBovino.setText("Buscar");
        btnBuscarBovino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarBovinoMouseClicked(evt);
            }
        });

        txaDiagnostico.setColumns(20);
        txaDiagnostico.setRows(5);
        jScrollPane3.setViewportView(txaDiagnostico);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Diagnostico (Opcional): ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(180, 180, 180)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtCaravanaHembra, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnBuscarBovino)
                        .addGap(5, 5, 5)
                        .addComponent(lblRHembra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cboResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lblRResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jDateFechaTacto, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lblRFechaTacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(180, 180, 180)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAltaCelo)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCaravanaHembra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarBovino, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRHembra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateFechaTacto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRFechaTacto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(btnAltaCelo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void limpiarCajas() {

        txtCaravanaHembra.setText(null);
        cboResultado.setSelectedIndex(0);
        jDateFechaTacto.setDate(null);
        txaDetalle.setText(null);
        txaDiagnostico.setText(null);
    }

    private boolean validarCampos() {
        int contador = 0;

        if (txtCaravanaHembra.getText().isEmpty()) {
            lblRHembra.setVisible(true);
            contador++;
        } else {
            lblRHembra.setVisible(false);
        }
        if (cboResultado.getSelectedIndex() < 1) {
            lblRResultado.setVisible(true);
            contador++;
        } else {
            lblRResultado.setVisible(false);
        }
        if (jDateFechaTacto.getDate() == null) {
            lblRFechaTacto.setVisible(true);
            contador++;
        } else {
            lblRFechaTacto.setVisible(false);
        }

        if (contador < 1) {
            return true;
        } else {
            return false;
        }
    }

    public void actualizarTabla() {
        jTableTactos.setDefaultRenderer(Object.class, new BotonesTabla());

        DefaultTableModel model = new DefaultTableModel();
        ArrayList<Tacto> listaTactos = dControladora.listarTactos();

        model.addColumn("id Tacto");
        model.addColumn("Caravana Hembra");
        model.addColumn("Fecha");
        model.addColumn("Detalle");
        model.addColumn("Resultado");
        model.addColumn("Diagnostico");
        model.addColumn("Modificar ");
        model.addColumn("Eliminar ");

        for (Tacto t : listaTactos) {
            
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String fechaTacto = formato.format(t.getFecha());
            
            model.addRow(new Object[]{t.getIdEventoDeSanidad(), t.getHembra().getCaravanaBovino(), fechaTacto, t.getDetalle(), t.getResultado(), t.getDiagnostico(), modificar, eliminar});
        }

        jTableTactos.setModel(model);
        jTableTactos.setRowHeight(35);
    }

    public void actualizarTablaHembra() {
        jTableTactos.setDefaultRenderer(Object.class, new BotonesTabla());

        DefaultTableModel model = new DefaultTableModel();

        ArrayList<Tacto> listaTactos = dControladora.listarTactosPorCaravana(txtCaravanaHembra.getText());

        model.addColumn("id Tacto");
        model.addColumn("Caravana Hembra");
        model.addColumn("Fecha");
        model.addColumn("Detalle");
        model.addColumn("Resultado");
        model.addColumn("Diagnostico");
        model.addColumn("Modificar ");
        model.addColumn("Eliminar ");

        for (Tacto t : listaTactos) {
            
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String fechaTacto = formato.format(t.getFecha());
            
            model.addRow(new Object[]{t.getIdEventoDeSanidad(), t.getHembra().getCaravanaBovino(), fechaTacto, t.getDetalle(), t.getResultado(), t.getDiagnostico(), modificar, eliminar});
        }

        jTableTactos.setModel(model);
        jTableTactos.setRowHeight(35);
    }

    private void jTableTactosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTactosMouseClicked

        columna = jTableTactos.getColumnModel().getColumnIndexAtX(evt.getX());
        row = evt.getY() / jTableTactos.getRowHeight();
        if (columna <= jTableTactos.getColumnCount() && columna >= 0 && row <= jTableTactos.getRowCount() && row >= 0) {
            Object objeto = jTableTactos.getValueAt(row, columna);
            if (objeto instanceof JButton) {
                ((JButton) objeto).doClick();
                JButton botones = (JButton) objeto;

                if (botones.getName().equals("btnModificar")) {

                    int fila = jTableTactos.getSelectedRow();

                    if (fila != -1) {
                        limpiarCajas();

                        idTacto = (int) jTableTactos.getValueAt(fila, 0);
                        this.dispose();

                        frmModificarTacto modificarTacto = new frmModificarTacto();
                        frmInicio.jDkPEscritorio.add(modificarTacto);
                        modificarTacto.setVisible(true);

                    } else {
                        JOptionPane.showMessageDialog(null, "Error: No se selecciono el Tacto a modificar");
                    }
                } else {
                    if (botones.getName().equals("btnEliminar")) {

                        int fila = jTableTactos.getSelectedRow();
                        int id = Integer.parseInt(this.jTableTactos.getValueAt(fila, 0).toString());

                        try {

                            //La primera opcion seleccionada (SI) devuelve cero y la segunda (NO) devuelve uno
                            int opcion = JOptionPane.showConfirmDialog(null, "Desea Eliminar el Tacto?", "Eliminar Tacto ", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                            if (opcion == 0) {

                                if (dControladora.bajaCelo(id)) {

                                    JOptionPane.showMessageDialog(null, "Se eliminó el Tacto");
                                    actualizarTabla();
                                    limpiarCajas(); // Limpiamos Caja de Texto

                                } else {
                                    JOptionPane.showMessageDialog(null, "Error: No se pudo Eliminar el Tacto");
                                }

                            } else {

                                JOptionPane.showMessageDialog(null, "El Tacto no se Eliminó");
                            }

                        } catch (Exception e) {
                            throw e;
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_jTableTactosMouseClicked

    private void btnAltaCeloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAltaCeloMouseClicked

        if (validarCampos()) {

            String caravana = txtCaravanaHembra.getText();
            Hembra hembra = dControladora.buscarHembraPorCaravana(caravana);

            Date fechaTacto = jDateFechaTacto.getDate();

            String detalle = txaDetalle.getText();

            EventoDeSanidad eventoDeSanidad = new EventoDeSanidad(fechaTacto, detalle, hembra);

            try {

                if (dControladora.altaEventoDeSanidad(eventoDeSanidad)) {

                    eventoDeSanidad = dControladora.buscarEventoDeSanidadUltimo();

                    String resultado = cboResultado.getSelectedItem().toString();
                    String diagnostico = txaDiagnostico.getText();

                    Tacto tacto = new Tacto(eventoDeSanidad.getIdEventoDeSanidad(), fechaTacto, detalle, hembra, resultado, diagnostico);

                    if (dControladora.altaTacto(tacto)) {
                        JOptionPane.showMessageDialog(null, "Tacto Ingresado Correctamente");
                        actualizarTabla();
                        limpiarCajas(); // Limpiamos Caja de

                        if (resultado.equals("Preñez")) {

                            Calendar calendar = Calendar.getInstance();
                            calendar.setTime(fechaTacto);

                            calendar.add(Calendar.DAY_OF_YEAR, 193);

                            Date fechaPrevista = calendar.getTime();
                            EventoFuturo eventoFuturoParto = new EventoFuturo(hembra, "Parto", fechaPrevista);

                            if (dControladora.altaEventoFuturo(eventoFuturoParto)) {
                                JOptionPane.showMessageDialog(null, "Parto Previsto Agregado como Evento Futuro en 6 Meses y 13 Días");
                            } else {
                                JOptionPane.showMessageDialog(null, "Parto Previsto No Agregado");
                            }

                            calendar.add(Calendar.DAY_OF_YEAR, -45);

                            fechaPrevista = calendar.getTime();

                            EventoFuturo eventoFuturoSecado = new EventoFuturo(hembra, "Secado", fechaPrevista);

                            if (dControladora.altaEventoFuturo(eventoFuturoSecado)) {
                                JOptionPane.showMessageDialog(null, "Secado Previsto Agregado como Evento Futuro 45 Días antes del Parto");
                            } else {
                                JOptionPane.showMessageDialog(null, "Secado Previsto No Agregado");
                            }

                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Tacto No Ingresado Correctamente");
                        limpiarCajas(); // Limpiamos Caja de Texto
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Error: No se pudo agregar el Evento de Sanidad");
                }

            } catch (Exception e) {
                throw e;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese los datos faltantes");
        }
    }//GEN-LAST:event_btnAltaCeloMouseClicked

    private void txtCaravanaHembraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCaravanaHembraKeyReleased
        if (txtCaravanaHembra.getText().isEmpty()) {
            actualizarTabla();
        }
    }//GEN-LAST:event_txtCaravanaHembraKeyReleased

    private void btnBuscarBovinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarBovinoMouseClicked

        frmBuscarHembra buscarHembra = new frmBuscarHembra();
        frmBuscarHembra.frm = "frmTacto";
        frmInicio.jDkPEscritorio.add(buscarHembra);
        buscarHembra.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBuscarBovinoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAltaCelo;
    private javax.swing.JButton btnBuscarBovino;
    private javax.swing.JComboBox<String> cboResultado;
    private com.toedter.calendar.JDateChooser jDateFechaTacto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableTactos;
    private java.awt.Label lblRFechaTacto;
    private java.awt.Label lblRHembra;
    private java.awt.Label lblRResultado;
    private javax.swing.JTextArea txaDetalle;
    private javax.swing.JTextArea txaDiagnostico;
    private javax.swing.JTextField txtCaravanaHembra;
    // End of variables declaration//GEN-END:variables
}
