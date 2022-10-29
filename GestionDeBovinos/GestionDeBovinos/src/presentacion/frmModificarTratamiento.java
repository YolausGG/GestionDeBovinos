/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author nico_
 */
public class frmModificarTratamiento extends javax.swing.JFrame {

    public frmModificarTratamiento() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH); // Maximisa la ventana 
        this.setTitle("MODIFICAR TRATAMIENTO ENFERMEDAD");

        lblRFechaInicioT.setVisible(false);

        Tratamiento tratamiento = dControladora.buscarTratamiento(frmTratamiento.idTratamiento);
        jDateFechaInicioT.setDate(tratamiento.getFechaInicio());
        jDateFechaFinalizacionT.setDate(tratamiento.getFechaFinalizacion());
        jTextAreaDetalle.setText(tratamiento.getDetalle());

        Bovino bovino = dControladora.buscarBovinoId(tratamiento.getPadece().getIdBovino());
        Enfermedad enfermedad = dControladora.buscarEnfermedad(tratamiento.getPadece().getIdEnfermedad());

        Padece p = new Padece(tratamiento.getPadece().getIdEnfermedad(), tratamiento.getPadece().getIdBovino(), tratamiento.getPadece().getFechaInicio());
        Padece padece = dControladora.buscarPadece(p);

        lblCaravana.setText(bovino.getCaravanaBovino());
        lblEnfermedad.setText(enfermedad.getNombre());

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String fechaInicioE = formato.format(padece.getFechaInicio());
        lblFechaInicioE.setText(fechaInicioE);
        Date fechaFinE = padece.getFechaFinalizacion();

        if (fechaFinE == null) {
            lblFechaFinE.setText("SIN FECHA FINALIZACIÓN");
        } else {
            String fechaFin = formato.format(fechaFinE);
            lblFechaFinE.setText(fechaFin);
        }

        actualizarTablaContagiosActivos();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotones = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jDateFechaInicioT = new com.toedter.calendar.JDateChooser();
        lblRFechaInicioT = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaDetalle = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePadeceEnfermedad = new javax.swing.JTable();
        btnModificarTratamiento = new javax.swing.JButton();
        jDateFechaFinalizacionT = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblCaravana = new javax.swing.JLabel();
        lblEnfermedad = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblFechaFinE = new javax.swing.JLabel();
        lblFechaInicioE = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

            jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 450, 170));

            btnModificarTratamiento.setText("Modificar");
            btnModificarTratamiento.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    btnModificarTratamientoMouseClicked(evt);
                }
            });
            jPanel2.add(btnModificarTratamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 90, -1));
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

            jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 910, 410));

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 986, Short.MAX_VALUE)
                    .addContainerGap())
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE))
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

            model.addRow(new Object[]{bovino.getCaravanaBovino(), enfermedad.getIdEnfermedad(), enfermedad.getNombre(), p.getFechaInicio(), p.getFechaFinalizacion()});
        }

        jTablePadeceEnfermedad.setModel(model);
        jTablePadeceEnfermedad.setRowHeight(25);
        jTablePadeceEnfermedad.getColumnModel().getColumn(1).setMaxWidth(0);
        jTablePadeceEnfermedad.getColumnModel().getColumn(1).setMinWidth(0);
        jTablePadeceEnfermedad.getColumnModel().getColumn(1).setPreferredWidth(0);
    }

    private void jTablePadeceEnfermedadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePadeceEnfermedadMouseClicked

        int fila = jTablePadeceEnfermedad.getSelectedRow();

        if (fila != -1) {

            String caravana = jTablePadeceEnfermedad.getValueAt(fila, 0).toString();
            String enfermedad = jTablePadeceEnfermedad.getValueAt(fila, 2).toString();
            Date fechaInicioE = (Date) jTablePadeceEnfermedad.getValueAt(fila, 3);
            Date fechaFinE = (Date) jTablePadeceEnfermedad.getValueAt(fila, 4);

            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String fechaInicio = formato.format(fechaInicioE);

            if (fechaFinE == null) {
                lblFechaFinE.setText("SIN FECHA FINALIZACIÓN");
            } else {
                String fechaFin = formato.format(fechaFinE);
                lblFechaFinE.setText(fechaFin);
            }

            lblCaravana.setText(caravana);
            lblEnfermedad.setText(enfermedad);
            lblFechaInicioE.setText(fechaInicio);

        } else {
            JOptionPane.showMessageDialog(null, "Error: No se selecciono el Bovino a modificar");
        }

    }//GEN-LAST:event_jTablePadeceEnfermedadMouseClicked

    private void btnModificarTratamientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarTratamientoMouseClicked
       
        if (validarCampos()) {

            int fila = jTablePadeceEnfermedad.getSelectedRow();

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
            
            int idTratamiento = frmTratamiento.idTratamiento;
            Tratamiento tratamiento = new Tratamiento(idTratamiento,padece, detalle, fechaInicioT);
            Tratamiento tratamientoFechaF = new Tratamiento(idTratamiento,padece, detalle, fechaInicioT, fechaFinalizacionT);

            try {

                if (jDateFechaFinalizacionT.getDate() == null) {
                    boolean resultado = dControladora.modificarTratamientoFechaInicio(tratamiento);

                    if (resultado) {

                        JOptionPane.showMessageDialog(null, "Se Modificó Correctamente el Tratamiento al Bovino Enfermo");

                        limpiarCajas(); // Limpiamos Caja de Texto

                        this.dispose();
                        frmTratamiento tratamiento1 = new frmTratamiento();
                        tratamiento1.setVisible(true);

                    } else {
                        JOptionPane.showMessageDialog(null, "Error: No se pudo Modificar el Tratamiento al Bovino Enfermo");
                    }
                } else {
                    boolean resultado = dominio.dTratamiento.modificarTratamiento(tratamientoFechaF);

                    if (resultado) {

                        JOptionPane.showMessageDialog(null, "Se Modificó Correctamente el Tratamiento al Bovino Enfermo");

                        limpiarCajas(); // Limpiamos Caja de Texto

                        this.dispose();
                        frmTratamiento tratamiento1 = new frmTratamiento();
                        tratamiento1.setVisible(true);

                    } else {
                        JOptionPane.showMessageDialog(null, "Error: 111No se pudo Modificar el Tratamiento al Bovino Enfermo");
                    }
                }

            } catch (Exception e) {
                throw e;
            }

        } else {
            JOptionPane.showMessageDialog(null, "Ingrese los datos faltantes");
        }
    }//GEN-LAST:event_btnModificarTratamientoMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])  {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmModificarTratamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmModificarTratamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmModificarTratamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmModificarTratamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmModificarTratamiento().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModificarTratamiento;
    private javax.swing.ButtonGroup grupoBotones;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablePadeceEnfermedad;
    private javax.swing.JTextArea jTextAreaDetalle;
    private javax.swing.JLabel lblCaravana;
    private javax.swing.JLabel lblEnfermedad;
    private javax.swing.JLabel lblFechaFinE;
    private javax.swing.JLabel lblFechaInicioE;
    private javax.swing.JLabel lblRFechaInicioT;
    // End of variables declaration//GEN-END:variables
}
