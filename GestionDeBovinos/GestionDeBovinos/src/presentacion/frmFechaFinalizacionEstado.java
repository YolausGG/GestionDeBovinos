/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import clases.Bovino;
import clases.EstadoBovino;
import dominio.dControladora;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author nico_
 */
public class frmFechaFinalizacionEstado extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmFechaFinalizacionEstado1
     */
    public frmFechaFinalizacionEstado() {
        initComponents();

        this.setTitle("FECHA FINALIZACIÓN ESTADO");
        lblRFechaF.setVisible(false);

        EstadoBovino estado = frmEstadoConBovino.estadoBovino;
        Bovino bovino = dControladora.buscarBovinoId(estado.getIdBovino());

        lblCaravana.setText(bovino.getCaravanaBovino());
        lblEstado.setText(frmEstadoConBovino.estado);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String fechaDate = formato.format(estado.getFechaInicio());
        lblFechaInicioE.setText(fechaDate);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jDateFechaFinalizacionE = new com.toedter.calendar.JDateChooser();
        btnConfirmar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblFechaInicioE = new javax.swing.JLabel();
        lblCaravana = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        lblRFechaF = new javax.swing.JLabel();

        setBackground(new java.awt.Color(54, 67, 114));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel2.setBackground(new java.awt.Color(133, 146, 158));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ingresar 16px.png"))); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfirmarMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Fecha Finalización de Estado:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Fecha Inicio Estado:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Bovino:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Estado:");

        lblFechaInicioE.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblFechaInicioE.setForeground(new java.awt.Color(0, 0, 0));
        lblFechaInicioE.setText("...");

        lblCaravana.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblCaravana.setForeground(new java.awt.Color(0, 0, 0));
        lblCaravana.setText("...");

        lblEstado.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblEstado.setForeground(new java.awt.Color(0, 0, 0));
        lblEstado.setText("...");

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eliminar16px.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });

        lblRFechaF.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblRFechaF.setForeground(new java.awt.Color(0, 0, 0));
        lblRFechaF.setText("Requerido");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(lblCaravana, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(lblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(lblFechaInicioE, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jDateFechaFinalizacionE, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lblRFechaF, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btnConfirmar)
                        .addGap(106, 106, 106)
                        .addComponent(btnCancelar)))
                .addGap(69, 69, 69))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCaravana, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFechaInicioE, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel9)
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateFechaFinalizacionE, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblRFechaF)))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

            EstadoBovino estado = frmEstadoConBovino.estadoBovino;

            Date fechaI = estado.getFechaInicio();
            Date fechaF = jDateFechaFinalizacionE.getDate();

            EstadoBovino estadoViejo = new EstadoBovino(estado.getIdEstadoDelBovino(), estado.getIdBovino(), estado.getFechaInicio());
            EstadoBovino estadoNuevo = new EstadoBovino(estado.getIdEstadoDelBovino(), estado.getIdBovino(), estado.getFechaInicio(), fechaF);

            try {
                if (jDateFechaFinalizacionE.getDate().before(fechaI)) {
                    
                    JOptionPane.showMessageDialog(null, "La Fecha de Finalización debe ser Mayor o Igual a la de Inicio");
                    
                } else {
                    if (dControladora.modificarEstadoBovino(estadoNuevo, estadoViejo)) {

                        JOptionPane.showMessageDialog(null, "Se Ingreso Correctamente la Fecha de Finalización ");

                        frmEstadoConBovino.frmEstadoConBovino1.dispose();
                        frmEstadoConBovino.frmEstadoConBovino1 = null;

                        frmEstadoConBovino fEstadoConBovino = new frmEstadoConBovino();
                        frmInicio.jDkPEscritorio.add(fEstadoConBovino);
                        fEstadoConBovino.setVisible(true);
                        this.dispose();

                    } else {
                        JOptionPane.showMessageDialog(null, "Error: No se pudo ingresar la Fecha de Finalización ");

                        frmEstadoConBovino fEstadoConBovino = new frmEstadoConBovino();
                        fEstadoConBovino.actualizarTabla();
                        this.dispose();
                    }
                }
            } catch (Exception e) {
                throw e;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese los datos faltantes");
        }
    }//GEN-LAST:event_btnConfirmarMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        frmEstadoConBovino.caravana = "";
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCaravana;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblFechaInicioE;
    private javax.swing.JLabel lblRFechaF;
    // End of variables declaration//GEN-END:variables
}
