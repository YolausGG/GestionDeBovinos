/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import clases.BotonesTabla;
import clases.EventoDeSanidad;
import clases.EventoFuturo;
import clases.Hembra;
import clases.Inseminacion;
import clases.Macho;
import dominio.dControladora;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.*;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JTable;

public class frmInseminacion extends javax.swing.JInternalFrame {

    JButton modificar = new JButton(""); // Creamos los botones para la tabla
    JButton eliminar = new JButton("");
    
    public static int idInseminacion = 0;
    public static int columna, row; // Metodo para cuando hacemos click en los botones    
    public static String caravanaHembra, caravanaMacho;
    public void insertarIconos(JButton btn, String ruta) { // Insertar Iconos en Botones Tabla

        btn.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta)));

    }
    
    public frmInseminacion() {
        initComponents();
        
        this.setSize(frmInicio.jDkPEscritorio.getWidth(), frmInicio.jDkPEscritorio.getHeight()); 
        this.setTitle("INSEMINACIÓN");
        insertarIconos(modificar, "/Imagenes/btnModificarChico.png");
        insertarIconos(eliminar, "/Imagenes/btnEliminarChico.png");
        txtCaravanaHembra.setText(frmBuscarHembra.caravana);
        txtCaravanaMacho.setText(frmBuscarMacho.caravana);
        modificar.setName("btnModificar");
        eliminar.setName("btnEliminar");      
        lblRMacho.setVisible(false);
        lblRFechaCelo.setVisible(false);
        lblRHembra.setVisible(false);
        
        if(txtCaravanaHembra.getText().isEmpty() && txtCaravanaMacho.getText().isEmpty()){
            actualizarTabla();
        }else if(!txtCaravanaHembra.getText().isEmpty()){
            actualizarTablaHembraMacho(txtCaravanaHembra.getText());
        }else if(!txtCaravanaMacho.getText().isEmpty()){
            actualizarTablaHembraMacho(txtCaravanaMacho.getText());
        }
    }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAltaInseminacion = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblRMacho = new java.awt.Label();
        lblRHembra = new java.awt.Label();
        jLabel3 = new javax.swing.JLabel();
        jDateFechaInseminacion = new com.toedter.calendar.JDateChooser();
        lblRFechaCelo = new java.awt.Label();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaDetalle = new javax.swing.JTextArea();
        txtCaravanaMacho = new javax.swing.JTextField();
        btnBuscarMacho = new javax.swing.JButton();
        txtCaravanaHembra = new javax.swing.JTextField();
        btnBuscarHembra = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableInseminaciones = new javax.swing.JTable();

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Macho:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 160, 30));

        btnAltaInseminacion.setText("Agregar");
        btnAltaInseminacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAltaInseminacionMouseClicked(evt);
            }
        });
        jPanel2.add(btnAltaInseminacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 100, 30));

        btnImprimir.setText("Imprimir");
        btnImprimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnImprimirMouseClicked(evt);
            }
        });
        jPanel2.add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 330, 100, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Detalle (Opcional): ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 160, 30));

        lblRMacho.setText("Requerido");
        jPanel2.add(lblRMacho, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, 70, 30));

        lblRHembra.setText("Requerido");
        jPanel2.add(lblRHembra, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 70, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Hembra:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 160, 30));
        jPanel2.add(jDateFechaInseminacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 210, 30));

        lblRFechaCelo.setText("Requerido");
        jPanel2.add(lblRFechaCelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 70, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Fecha Inseminación:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        txaDetalle.setColumns(20);
        txaDetalle.setRows(5);
        jScrollPane2.setViewportView(txaDetalle);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 270, 90));

        txtCaravanaMacho.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCaravanaMachoKeyReleased(evt);
            }
        });
        jPanel2.add(txtCaravanaMacho, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 160, 30));

        btnBuscarMacho.setText("Buscar");
        btnBuscarMacho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMachoMouseClicked(evt);
            }
        });
        jPanel2.add(btnBuscarMacho, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 80, 30));

        txtCaravanaHembra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCaravanaHembraKeyReleased(evt);
            }
        });
        jPanel2.add(txtCaravanaHembra, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 160, 30));

        btnBuscarHembra.setText("Buscar");
        btnBuscarHembra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarHembraMouseClicked(evt);
            }
        });
        jPanel2.add(btnBuscarHembra, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 80, 30));

        jTableInseminaciones = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        jTableInseminaciones.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableInseminaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableInseminacionesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableInseminaciones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        txtCaravanaMacho.setText(null);
        txtCaravanaMacho.setText(null);
        jDateFechaInseminacion.setDate(null);
        txaDetalle.setText(null);  
    }
    
    private boolean validarCampos(){
        int contador = 0;
        
        if(txtCaravanaMacho.getText().isEmpty()){ lblRHembra.setVisible(true); contador++; }else { lblRHembra.setVisible(false);}
        if(txtCaravanaMacho.getText().isEmpty()){ lblRMacho.setVisible(true); contador++; }else { lblRMacho.setVisible(false);}
        if(jDateFechaInseminacion.getDate() == null){ lblRFechaCelo.setVisible(true); contador++; }else { lblRFechaCelo.setVisible(false);}
        
        if(contador < 1){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void actualizarTabla() {
        jTableInseminaciones.setDefaultRenderer(Object.class, new BotonesTabla());

        DefaultTableModel model = new DefaultTableModel();
        ArrayList<Inseminacion> listaInseminaciones = dControladora.listarInseminaciones();

        model.addColumn("id Inseminacion");
        model.addColumn("Caravana Hembra");
        model.addColumn("Caravana Macho");
        model.addColumn("Fecha");
        model.addColumn("Detalle");
        model.addColumn("Modificar ");
        model.addColumn("Eliminar ");
        
        for (Inseminacion i : listaInseminaciones) {

            model.addRow(new Object[]{i.getIdEventoDeSanidad(),i.getHembra().getCaravanaBovino(), i.getMacho().getCaravanaBovino(), i.getFecha(),i.getDetalle(), modificar, eliminar});
        }

        jTableInseminaciones.setModel(model);
        jTableInseminaciones.setRowHeight(25);
    }
    
    public void actualizarTablaHembraMacho(String pCaravana) {
        jTableInseminaciones.setDefaultRenderer(Object.class, new BotonesTabla());

        DefaultTableModel model = new DefaultTableModel();
        
        ArrayList<Inseminacion> listaInseminaciones = dControladora.listarInseminacionesPorCaravana(pCaravana);

        model.addColumn("id Inseminacion");
        model.addColumn("Caravana Hembra");
        model.addColumn("Caravana Macho");
        model.addColumn("Fecha");
        model.addColumn("Detalle");
        model.addColumn("Modificar ");
        model.addColumn("Eliminar ");
        
        for (Inseminacion i : listaInseminaciones) {

            model.addRow(new Object[]{i.getIdEventoDeSanidad(),i.getHembra().getCaravanaBovino(), i.getMacho().getCaravanaBovino(), i.getFecha(),i.getDetalle(), modificar, eliminar});
        }

        jTableInseminaciones.setModel(model);
        jTableInseminaciones.setRowHeight(35);
    }
    
    private void btnAltaInseminacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAltaInseminacionMouseClicked

        if(validarCampos()){

            String caravanaHembra = txtCaravanaHembra.getText();
            Hembra hembra = dControladora.buscarHembraPorCaravana(caravanaHembra);

            Date fechaInseminacion = jDateFechaInseminacion.getDate();

            String detalle = txaDetalle.getText();

            EventoDeSanidad eventoDeSanidad = new EventoDeSanidad(fechaInseminacion, detalle, hembra);

            try {

                if (dControladora.altaEventoDeSanidad(eventoDeSanidad)) {

                    eventoDeSanidad = dControladora.buscarEventoDeSanidadUltimo();

                    String caravanaMacho = txtCaravanaMacho.getText();
                    Macho macho = dControladora.buscarMachoPorCaravana(caravanaMacho);

                    Inseminacion inseminacion = new Inseminacion(eventoDeSanidad.getIdEventoDeSanidad(), fechaInseminacion, detalle, hembra, macho);

                    if(dControladora.altaInseminacion(inseminacion)){
                        JOptionPane.showMessageDialog(null, "Inseminación Ingresada Correctamente");
                        actualizarTabla();
                        limpiarCajas(); // Limpiamos Caja de Texto

                        Calendar calendar = Calendar.getInstance();
                        calendar.setTime(fechaInseminacion);

                        calendar.add(Calendar.DAY_OF_YEAR, 90);

                        Date fechaPrevista = calendar.getTime();
                        EventoFuturo eventoFuturo = new EventoFuturo(hembra, "Tacto", fechaPrevista);

                        if(dControladora.altaEventoFuturo(eventoFuturo)){
                            JOptionPane.showMessageDialog(null, "Tacto Previsto Agregado como Evento Futuro en 3 Meses");
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Tacto Previsto No Agregado");
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Inseminación No Ingresada Correctamente");
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
    }//GEN-LAST:event_btnAltaInseminacionMouseClicked

    private void btnImprimirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirMouseClicked

        MessageFormat header = new MessageFormat("Reporte ");
        MessageFormat footer = new MessageFormat("Page {0, number, integer}");

        try {
            jTableInseminaciones.print(JTable.PrintMode.NORMAL, header, footer);
        } catch (java.awt.print.PrinterException e) {
            System.err.format("No se pudo Imprimir", e.getMessage());
        }

    }//GEN-LAST:event_btnImprimirMouseClicked

    private void txtCaravanaMachoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCaravanaMachoKeyReleased
        if (txtCaravanaMacho.getText().isEmpty()) {
            actualizarTabla();
        }
    }//GEN-LAST:event_txtCaravanaMachoKeyReleased

    private void btnBuscarMachoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMachoMouseClicked

        frmBuscarMacho buscarMacho = new frmBuscarMacho();
        frmBuscarMacho.frm = "frmInseminacion";
        buscarMacho.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBuscarMachoMouseClicked

    private void txtCaravanaHembraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCaravanaHembraKeyReleased
        if (txtCaravanaHembra.getText().isEmpty()) {
            actualizarTabla();
        }
    }//GEN-LAST:event_txtCaravanaHembraKeyReleased

    private void btnBuscarHembraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarHembraMouseClicked
        frmBuscarHembra buscarHembra = new frmBuscarHembra();
        frmBuscarHembra.frm = "frmInseminacion";
        frmInicio.jDkPEscritorio.add(buscarHembra);
        buscarHembra.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBuscarHembraMouseClicked

    private void jTableInseminacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableInseminacionesMouseClicked

        columna = jTableInseminaciones.getColumnModel().getColumnIndexAtX(evt.getX());
        row = evt.getY() / jTableInseminaciones.getRowHeight();
        if (columna <= jTableInseminaciones.getColumnCount() && columna >= 0 && row <= jTableInseminaciones.getRowCount() && row >= 0) {
            Object objeto = jTableInseminaciones.getValueAt(row, columna);
            if (objeto instanceof JButton) {
                ((JButton) objeto).doClick();
                JButton botones = (JButton) objeto;

                if (botones.getName().equals("btnModificar")) {

                    int fila = jTableInseminaciones.getSelectedRow();

                    if (fila != -1) {
                        limpiarCajas();

                        idInseminacion = (int) jTableInseminaciones.getValueAt(fila, 0);
                        this.dispose();

                        frmModificarInseminacion modificarInseminacion = new frmModificarInseminacion();
                        frmInicio.jDkPEscritorio.add(modificarInseminacion);
                        modificarInseminacion.setVisible(true);

                    } else {
                        JOptionPane.showMessageDialog(null, "Error: No se selecciono la Inseminación a modificar");
                    }
                } else {
                    if (botones.getName().equals("btnEliminar")) {

                        int fila = jTableInseminaciones.getSelectedRow();
                        int id = Integer.parseInt(this.jTableInseminaciones.getValueAt(fila, 0).toString());

                        try {

                            //La primera opcion seleccionada (SI) devuelve cero y la segunda (NO) devuelve uno
                            int opcion = JOptionPane.showConfirmDialog(null, "Desea Eliminar la Inseminación?", "Eliminar Inseminación ", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                            if (opcion == 0) {

                                if (dControladora.bajaInseminacion(id)) {

                                    JOptionPane.showMessageDialog(null, "Se eliminó el Inseminación");
                                    actualizarTabla();
                                    limpiarCajas(); // Limpiamos Caja de Texto

                                } else {
                                    JOptionPane.showMessageDialog(null, "Error: No se pudo Eliminar la Inseminación");
                                }

                            } else {

                                JOptionPane.showMessageDialog(null, "La Inseminación no se Eliminó");
                            }

                        } catch (Exception e) {
                            throw e;
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_jTableInseminacionesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAltaInseminacion;
    private javax.swing.JButton btnBuscarHembra;
    private javax.swing.JButton btnBuscarMacho;
    private javax.swing.JButton btnImprimir;
    private com.toedter.calendar.JDateChooser jDateFechaInseminacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableInseminaciones;
    private java.awt.Label lblRFechaCelo;
    private java.awt.Label lblRHembra;
    private java.awt.Label lblRMacho;
    private javax.swing.JTextArea txaDetalle;
    private javax.swing.JTextField txtCaravanaHembra;
    private javax.swing.JTextField txtCaravanaMacho;
    // End of variables declaration//GEN-END:variables
}
