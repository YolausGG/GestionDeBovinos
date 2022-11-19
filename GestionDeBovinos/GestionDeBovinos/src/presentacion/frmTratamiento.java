/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import clases.BotonesTabla;
import clases.Bovino;
import clases.Enfermedad;
import clases.Padece;
import clases.Tratamiento;
import dominio.dControladora;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static presentacion.frmInicio.jDkPEscritorio;

/**
 *
 * @author nico_
 */
public class frmTratamiento extends javax.swing.JInternalFrame {

    JButton modificar = new JButton("Modificar"); // Creamos los botones para la tabla
    JButton eliminar = new JButton("Eliminar");
    JButton finalizar = new JButton("Finalizar");

    public static int idTratamiento = 0;
    public static frmTratamiento frmTratamiento1 = null;

    public static int columna, row; // Metodo para cuando hacemos click en los botones

    public void insertarIconos(JButton btn, String ruta) { // Insertar Iconos en Botones Tabla

        btn.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta)));

    }

    /**
     * Creates new form frmTratamiento1
     */
    public frmTratamiento() {
        initComponents();

        this.setSize(frmInicio.jDkPEscritorio.getWidth(), frmInicio.jDkPEscritorio.getHeight());
        this.setTitle("TRATAMIENTO ENFERMEDAD");
        modificar.setName("btnModificar");
        eliminar.setName("btnEliminar");
        finalizar.setName("btnFinalizar");
        modificar.setBorder(null);
        eliminar.setBorder(null);
        insertarIconos(modificar, "/Imagenes/Modificar16px.png");
        insertarIconos(eliminar, "/Imagenes/Eliminar16px.png");
        lblRFechaInicioT.setVisible(false);

        actualizarTabla();
        actualizarTablaContagiosActivos();

        if (frmPadeceEnfermedad.caravana != null) {

            lblCaravana.setText(frmPadeceEnfermedad.caravana);
            int idEnfermedad = frmPadeceEnfermedad.padece.getIdEnfermedad();
            Enfermedad enfermedad = dControladora.buscarEnfermedad(idEnfermedad);
            lblEnfermedad.setText(enfermedad.getNombre());
            Date fechaInicioE = frmPadeceEnfermedad.padece.getFechaInicio();
            Date fechaFinE = frmPadeceEnfermedad.padece.getFechaFinalizacion();

            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String fechaInicio = formato.format(fechaInicioE);

            if (fechaFinE == null) {
                lblFechaFinE.setText("SIN FECHA FINALIZACIÓN");
            } else {
                String fechaFin = formato.format(fechaFinE);
                lblFechaFinE.setText(fechaFin);
            }

            lblFechaInicioE.setText(fechaInicio);

        } else {

            lblCaravana.setText("...");
            lblEnfermedad.setText("...");
            lblFechaFinE.setText("...");
            lblFechaFinE.setText("...");
            lblFechaInicioE.setText("...");

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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableTratamiento = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jDateFechaInicioT = new com.toedter.calendar.JDateChooser();
        lblRFechaInicioT = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaDetalle = new javax.swing.JTextArea();
        btnAltaTratamiento = new javax.swing.JButton();
        jDateFechaFinalizacionT = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblCaravana = new javax.swing.JLabel();
        lblEnfermedad = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblFechaFinE = new javax.swing.JLabel();
        lblFechaInicioE = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePadeceEnfermedad = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTablePadeceEnfermedad = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column){
                return false;
            }};
            jTableTratamiento.setModel(new javax.swing.table.DefaultTableModel(
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
            jTableTratamiento.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jTableTratamientoMouseClicked(evt);
                }
            });
            jScrollPane3.setViewportView(jTableTratamiento);

            jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 910, 220));

            jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jLabel4.setText("Fecha Comienzo de Tratamiento:");
            jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));
            jPanel2.add(jDateFechaInicioT, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 160, 30));

            lblRFechaInicioT.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
            lblRFechaInicioT.setForeground(new java.awt.Color(0, 0, 0));
            lblRFechaInicioT.setText("Requerido");
            jPanel2.add(lblRFechaInicioT, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 120, 20));

            jLabel9.setText("Fecha Finalizacion de Tratamiento:");
            jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

            jLabel8.setText("Detalle:");
            jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

            jTextAreaDetalle.setColumns(20);
            jTextAreaDetalle.setRows(5);
            jScrollPane2.setViewportView(jTextAreaDetalle);

            jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 290, -1));

            btnAltaTratamiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ingresar 16px.png"))); // NOI18N
            btnAltaTratamiento.setText("Ingresar");
            btnAltaTratamiento.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    btnAltaTratamientoMouseClicked(evt);
                }
            });
            jPanel2.add(btnAltaTratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, 30));
            jPanel2.add(jDateFechaFinalizacionT, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 160, 30));

            jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
            jLabel1.setText("Fecha Fin Enfermedad:");
            jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 130, 20));

            jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
            jLabel2.setText("Enfermedad:");
            jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 90, -1));

            lblCaravana.setText("...");
            jPanel2.add(lblCaravana, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 60, -1));

            lblEnfermedad.setText("...");
            jPanel2.add(lblEnfermedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 80, -1));

            jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
            jLabel3.setText("CARAVANA:");
            jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 70, -1));

            jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
            jLabel5.setText("Fecha Inicio Enfermedad:");
            jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 150, 20));

            lblFechaFinE.setText("...");
            jPanel2.add(lblFechaFinE, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, 170, 20));

            lblFechaInicioE.setText("...");
            jPanel2.add(lblFechaInicioE, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, 80, 20));

            jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enfermedades Activas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 2, 12))); // NOI18N
            jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jTablePadeceEnfermedad = new javax.swing.JTable(){
                public boolean isCellEditable(int row, int column){
                    return false;
                }};
                jTablePadeceEnfermedad.setModel(new javax.swing.table.DefaultTableModel(
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
                jTablePadeceEnfermedad.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        jTablePadeceEnfermedadMouseClicked(evt);
                    }
                });
                jScrollPane1.setViewportView(jTablePadeceEnfermedad);

                jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 450, 170));

                jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 470, 200));

                jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 910, 410));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                );
                layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(41, 41, 41))
                );

                pack();
            }// </editor-fold>//GEN-END:initComponents

    public boolean validarCampos() {

        int contador = 0;
        if (jDateFechaInicioT.getDate() == null) {
            lblRFechaInicioT.setVisible(true);
            contador++;
        } else {
            lblRFechaInicioT.setVisible(false);
        }

        if (contador < 1) {
            return true;
        } else {
            return false;
        }
    }

    public void limpiarCajas() {

        jDateFechaInicioT.setDate(null);
        jDateFechaFinalizacionT.setDate(null);
        jTextAreaDetalle.setText(null);

    }

    public void actualizarTabla() {
        jTableTratamiento.setDefaultRenderer(Object.class, new BotonesTabla());
        DefaultTableModel model = new DefaultTableModel();

        ArrayList<Tratamiento> listaTratamientos = dControladora.listarTratamientos();

        model.addColumn("ID Tratamiento");
        model.addColumn("Caravana");
        model.addColumn("Enfermedad");
        model.addColumn("");
        model.addColumn("Fecha Inicio");
        model.addColumn("Fecha Finalización");
        model.addColumn("Detalle");
        model.addColumn("Finalizar Tratamiento ");
        model.addColumn("Modificar ");
        model.addColumn("Eliminar ");

        for (Tratamiento t : listaTratamientos) {

            Bovino bovino = dControladora.buscarBovinoId(t.getPadece().getIdBovino());
            Enfermedad enfermedad = dControladora.buscarEnfermedad(t.getPadece().getIdEnfermedad());

            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String fechaInicioT = formato.format(t.getFechaInicio());

            if (t.getFechaFinalizacion() == null) {

                model.addRow(new Object[]{t.getIdTratamiento(), bovino.getCaravanaBovino(), enfermedad.getNombre(), t.getPadece().getFechaInicio(), fechaInicioT, t.getFechaFinalizacion(), t.getDetalle(), finalizar, modificar, eliminar});

            } else {

                SimpleDateFormat formato1 = new SimpleDateFormat("dd/MM/yyyy");
                String fechaFinalizacionT = formato1.format(t.getFechaFinalizacion());

                model.addRow(new Object[]{t.getIdTratamiento(), bovino.getCaravanaBovino(), enfermedad.getNombre(), t.getPadece().getFechaInicio(), fechaInicioT, fechaFinalizacionT, t.getDetalle(), finalizar, modificar, eliminar});
            }

        }

        jTableTratamiento.setModel(model);
        jTableTratamiento.setRowHeight(25);
        jTableTratamiento.getColumnModel().getColumn(3).setMaxWidth(0);
        jTableTratamiento.getColumnModel().getColumn(3).setMinWidth(0);
        jTableTratamiento.getColumnModel().getColumn(3).setPreferredWidth(0);
    }

    public void actualizarTablaContagiosActivos() {

        jTablePadeceEnfermedad.setDefaultRenderer(Object.class, new BotonesTabla());
        DefaultTableModel model = new DefaultTableModel();

        ArrayList<Padece> listaPadeceEnfermedad = dControladora.listarContagiosActivos();

        model.addColumn("Caravana");
        model.addColumn("");
        model.addColumn("Enfermedad");
        model.addColumn("Fecha Inicio");
        model.addColumn("Fecha Finalización");

        for (Padece p : listaPadeceEnfermedad) {

            Enfermedad enfermedad = dControladora.buscarEnfermedad(p.getIdEnfermedad());
            Bovino bovino = dControladora.buscarBovinoId(p.getIdBovino());

            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String fechaInicioE = formato.format(p.getFechaInicio());

            if (p.getFechaFinalizacion() == null) {

                model.addRow(new Object[]{bovino.getCaravanaBovino(), enfermedad.getIdEnfermedad(), enfermedad.getNombre(), fechaInicioE, p.getFechaFinalizacion()});

            } else {

                SimpleDateFormat formato1 = new SimpleDateFormat("dd/MM/yyyy");
                String fechaFinalizacionE = formato1.format(p.getFechaFinalizacion());

                model.addRow(new Object[]{bovino.getCaravanaBovino(), enfermedad.getIdEnfermedad(), enfermedad.getNombre(), fechaInicioE, fechaFinalizacionE});
            }

        }

        jTablePadeceEnfermedad.setModel(model);
        jTablePadeceEnfermedad.setRowHeight(25);
        jTablePadeceEnfermedad.getColumnModel().getColumn(1).setMaxWidth(0);
        jTablePadeceEnfermedad.getColumnModel().getColumn(1).setMinWidth(0);
        jTablePadeceEnfermedad.getColumnModel().getColumn(1).setPreferredWidth(0);
    }

    private void jTableTratamientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTratamientoMouseClicked

        columna = jTableTratamiento.getColumnModel().getColumnIndexAtX(evt.getX());
        row = evt.getY() / jTableTratamiento.getRowHeight();
        if (columna <= jTableTratamiento.getColumnCount() && columna >= 0 && row <= jTableTratamiento.getRowCount() && row >= 0) {
            Object objeto = jTableTratamiento.getValueAt(row, columna);
            if (objeto instanceof JButton) {
                ((JButton) objeto).doClick();
                JButton botones = (JButton) objeto;

                if (botones.getName().equals("btnModificar")) {

                    int fila = jTableTratamiento.getSelectedRow();

                    if (fila != -1) {
                        limpiarCajas();

                        idTratamiento = (int) jTableTratamiento.getValueAt(fila, 0);

                        this.dispose();
                        frmModificarTratamiento modificarTratamiento = new frmModificarTratamiento();
                        frmInicio.jDkPEscritorio.add(modificarTratamiento);
                        modificarTratamiento.setVisible(true); // Abre el formulario de Modificar la Enfermedad

                    } else {
                        JOptionPane.showMessageDialog(null, "Error: No se selecciono el Bovino a modificar");
                    }
                }
                if (botones.getName().equals("btnEliminar")) {
                    int fila = jTableTratamiento.getSelectedRow();

                    int idTratamiento = (int) this.jTableTratamiento.getValueAt(fila, 0);

                    try {

                        //La primera opcion seleccionada (SI) devuelve cero y la segunda (NO) devuelve uno
                        int opcion = JOptionPane.showConfirmDialog(null, "Desea Eliminar el Tratamiento del Bovino?", "Eliminar Tratamiento del Bovino ", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                        if (opcion == 0) {

                            boolean resultado = dControladora.bajaTratamiento(idTratamiento);

                            if (resultado) {

                                JOptionPane.showMessageDialog(null, "Se Elimino correctamente el Tratamiento del Bovino");
                                actualizarTabla();
                                limpiarCajas(); // Limpiamos Caja de Texto

                            } else {
                                JOptionPane.showMessageDialog(null, "Error: No se pudo Eliminar el Tratamiento");
                            }

                        } else {

                            JOptionPane.showMessageDialog(null, "El Tratamiento del Bovino no se Elimino");
                        }

                    } catch (Exception e) {
                        throw e;
                    }

                }
                if (botones.getName().equals("btnFinalizar")) {

                    int fila = jTableTratamiento.getSelectedRow();

                    idTratamiento = (int) jTableTratamiento.getValueAt(fila, 0);

                    frmFechaFinalizacionTratamiento frmFechaFT = new frmFechaFinalizacionTratamiento();
                    frmInicio.jDkPEscritorio.add(frmFechaFT);
                    frmFechaFT.setVisible(true);

                    frmTratamiento1 = this;

                }
            }
        }
    }//GEN-LAST:event_jTableTratamientoMouseClicked

    private void jTablePadeceEnfermedadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePadeceEnfermedadMouseClicked

        int fila = jTablePadeceEnfermedad.getSelectedRow();

        if (fila != -1) {

            String caravana = jTablePadeceEnfermedad.getValueAt(fila, 0).toString();
            String enfermedad = jTablePadeceEnfermedad.getValueAt(fila, 2).toString();
            String fechaInicioE = (String) jTablePadeceEnfermedad.getValueAt(fila, 3);
            String fechaFinE = (String) jTablePadeceEnfermedad.getValueAt(fila, 4);

            if (fechaFinE == null) {
                lblFechaFinE.setText("SIN FECHA FINALIZACIÓN");
            } else {

                lblFechaFinE.setText(fechaFinE);
            }

            lblCaravana.setText(caravana);
            lblEnfermedad.setText(enfermedad);
            lblFechaInicioE.setText(fechaInicioE);

        } else {
            JOptionPane.showMessageDialog(null, "Error: No se selecciono el Bovino a modificar");
        }
    }//GEN-LAST:event_jTablePadeceEnfermedadMouseClicked

    private void btnAltaTratamientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAltaTratamientoMouseClicked

        if (validarCampos()) {
            // int fila = jTablePadeceEnfermedad.getSelectedRow();           

            String caravana = lblCaravana.getText();
            Bovino bovino = dControladora.buscarBovinoCaravana(caravana);

            Enfermedad enfermedad = dControladora.buscarEnfermedadNombre(lblEnfermedad.getText());
            int idEnfermedad = enfermedad.getIdEnfermedad();

            String fecha = lblFechaInicioE.getText();
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date fechaPadece = null;

            try {
                fechaPadece = formato.parse(fecha);
            } catch (ParseException ex) {
                Logger.getLogger(frmModificarTratamiento.class.getName()).log(Level.SEVERE, null, ex);
            }

            Padece padece = new Padece(idEnfermedad, bovino.getIdBovino(), fechaPadece);

            String detalle = jTextAreaDetalle.getText();
            Date fechaInicioT = jDateFechaInicioT.getDate();
            Date fechaFinalizacionT = jDateFechaFinalizacionT.getDate();

            Tratamiento tratamiento = new Tratamiento(padece, detalle, fechaInicioT);
            Tratamiento tratamientoFechaF = new Tratamiento(padece, detalle, fechaInicioT, fechaFinalizacionT);

            try {

                if (jDateFechaFinalizacionT.getDate() == null) {
                    boolean resultado = dominio.dTratamiento.altaTratamientoFechaInicio(tratamiento);

                    if (resultado) {

                        JOptionPane.showMessageDialog(null, "Se Ingreso Correctamente el Tratamiento al Bovino Enfermo");
                        actualizarTabla();
                        limpiarCajas(); // Limpiamos Caja de Texto

                    } else {
                        JOptionPane.showMessageDialog(null, "Error: No se pudo ingresar el Tratamiento al Bovino Enfermo");
                    }
                } else if (jDateFechaFinalizacionT.getDate().before(fechaInicioT)) {

                    JOptionPane.showMessageDialog(null, "La Fecha de Finalización debe ser Mayor o Igual a la de Inicio");

                } else {
                    boolean resultado = dominio.dTratamiento.altaTratamiento(tratamientoFechaF);

                    if (resultado) {

                        JOptionPane.showMessageDialog(null, "Se Ingreso Correctamente el Tratamiento al Bovino Enfermo");
                        actualizarTabla();
                        limpiarCajas(); // Limpiamos Caja de Texto

                    } else {
                        JOptionPane.showMessageDialog(null, "Error: No se pudo ingresar el Tratamiento al Bovino Enfermo");
                    }
                }

            } catch (Exception e) {
                throw e;
            }

        } else {
            JOptionPane.showMessageDialog(null, "Ingrese los datos faltantes");
        }
    }//GEN-LAST:event_btnAltaTratamientoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAltaTratamiento;
    private com.toedter.calendar.JDateChooser jDateFechaFinalizacionT;
    private com.toedter.calendar.JDateChooser jDateFechaInicioT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTablePadeceEnfermedad;
    private javax.swing.JTable jTableTratamiento;
    private javax.swing.JTextArea jTextAreaDetalle;
    private javax.swing.JLabel lblCaravana;
    private javax.swing.JLabel lblEnfermedad;
    private javax.swing.JLabel lblFechaFinE;
    private javax.swing.JLabel lblFechaInicioE;
    private javax.swing.JLabel lblRFechaInicioT;
    // End of variables declaration//GEN-END:variables
}
