/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import clases.Bovino;
import clases.Padece;
import dominio.dControladora;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author nico_
 */
public class frmFechaFinalizacionEnfermedad extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmFechaFinalizacionEnfermedad1
     */
    public frmFechaFinalizacionEnfermedad() {
        initComponents();
        
        this.setTitle("FECHA FINALIZACIÓN ENFERMEDAD");
        lblRFechaF.setVisible(false);

        lblCaravana.setText(frmPadeceEnfermedad.caravana);
        lblEnfermedad.setText(frmPadeceEnfermedad.enfermedad);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String fechaDate = formato.format(frmPadeceEnfermedad.padece.getFechaInicio());
        lblFechaInicio.setText(fechaDate);
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
        jPanel2 = new javax.swing.JPanel();
        jDateFechaFinalizacionE = new com.toedter.calendar.JDateChooser();
        btnConfirmar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblFechaInicio = new javax.swing.JLabel();
        lblCaravana = new javax.swing.JLabel();
        lblEnfermedad = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        lblRFechaF = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jDateFechaFinalizacionE, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 160, 30));

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfirmarMouseClicked(evt);
            }
        });
        jPanel2.add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 90, 30));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Fecha Finalización de Enfermedad:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Fecha Inicio Enfermedad:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 150, 20));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Bovino:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 50, 20));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Enfermedad:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 80, 20));

        lblFechaInicio.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblFechaInicio.setForeground(new java.awt.Color(0, 0, 0));
        lblFechaInicio.setText("...");
        jPanel2.add(lblFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 100, 20));

        lblCaravana.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblCaravana.setForeground(new java.awt.Color(0, 0, 0));
        lblCaravana.setText("...");
        jPanel2.add(lblCaravana, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 90, 20));

        lblEnfermedad.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblEnfermedad.setForeground(new java.awt.Color(0, 0, 0));
        lblEnfermedad.setText("...");
        jPanel2.add(lblEnfermedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 80, 20));

        btnCancelar.setText("Cancelar");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });
        jPanel2.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 90, 30));

        lblRFechaF.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblRFechaF.setForeground(new java.awt.Color(0, 0, 0));
        lblRFechaF.setText("Requerido");
        jPanel2.add(lblRFechaF, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 70, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 400, 310));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean validarCampos() {

        int contador = 0;

        if (jDateFechaFinalizacionE.getDate() == null) {
            lblRFechaF.setVisible(true);
            contador++;
        } else {
            lblRFechaF.setVisible(false);
        }

        if (contador < 1) {
            return true;
        } else {
            return false;
        }
    }
    
    public void limpiarCajas() {

        jDateFechaFinalizacionE.setDate(null);

    }
    
    private void btnConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmarMouseClicked

        if (validarCampos()) {

            String caravana = frmPadeceEnfermedad.caravana;
            int idEnfermedad = frmPadeceEnfermedad.padece.getIdEnfermedad();
            Date fechaI = frmPadeceEnfermedad.padece.getFechaInicio();
            Date fechaF = jDateFechaFinalizacionE.getDate();

            Bovino bovino = dControladora.buscarBovinoCaravana(caravana);

            Padece padeceViejo = new Padece(idEnfermedad, bovino.getIdBovino(), fechaI);

            Padece padeceNuevo = new Padece(idEnfermedad, bovino.getIdBovino(), fechaI, fechaF);

            try {

                if (dControladora.modificarPadece(padeceNuevo, padeceViejo)) {

                    JOptionPane.showMessageDialog(null, "Se Ingreso Correctamente la Fecha de Finalización ");

                    frmPadeceEnfermedad.frmPadeceEnfermedad1.dispose();
                    frmPadeceEnfermedad.frmPadeceEnfermedad1 = null;

                    frmPadeceEnfermedad fPadeceEnfermedad = new frmPadeceEnfermedad();
                    frmInicio.jDkPEscritorio.add(fPadeceEnfermedad);
                    fPadeceEnfermedad.setVisible(true);
                    this.dispose();

                } else {
                    JOptionPane.showMessageDialog(null, "Error: No se pudo ingresar la Fecha de Finalización ");

                    frmPadeceEnfermedad fPadeceEnfermedad = new frmPadeceEnfermedad();
                    fPadeceEnfermedad.actualizarTabla();
                    this.dispose();
                }

            } catch (Exception e) {
                throw e;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese los datos faltantes");
        }
    }//GEN-LAST:event_btnConfirmarMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        frmPadeceEnfermedad.caravana = "";
        this.dispose();
    }//GEN-LAST:event_btnCancelarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private com.toedter.calendar.JDateChooser jDateFechaFinalizacionE;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCaravana;
    private javax.swing.JLabel lblEnfermedad;
    private javax.swing.JLabel lblFechaInicio;
    private javax.swing.JLabel lblRFechaF;
    // End of variables declaration//GEN-END:variables
}
