/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import clases.BajaLogicaBovino;
import clases.Bovino;
import dominio.dControladora;
import java.util.Date;
import javax.swing.JOptionPane;

public class frmBajaLogica extends javax.swing.JInternalFrame {

    
    public frmBajaLogica() {
        initComponents();
        
        this.setTitle("BAJA LÓGICA DE BOVINO");
        lblRFechaBaja.setVisible(false);
        lblRMotivoBaja.setVisible(false);
        txtCaravana.setText(frmBovino.caravana);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        lblRFechaBaja = new java.awt.Label();
        jDateFechaBaja = new com.toedter.calendar.JDateChooser();
        label3 = new java.awt.Label();
        label2 = new java.awt.Label();
        lblRMotivoBaja = new java.awt.Label();
        cboMotivo = new javax.swing.JComboBox<>();
        btnConfirmarBaja = new javax.swing.JButton();
        btnCancelarBaja = new javax.swing.JButton();
        txtCaravana = new javax.swing.JTextField();

        setBackground(new java.awt.Color(54, 67, 114));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel2.setBackground(new java.awt.Color(54, 67, 114));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("¿Está seguro que quiere dar de Baja el Bovino?");
        jPanel2.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 310, 40));

        lblRFechaBaja.setForeground(new java.awt.Color(255, 51, 51));
        lblRFechaBaja.setText("Requerido");
        jPanel2.add(lblRFechaBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 90, 30));
        jPanel2.add(jDateFechaBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 210, 30));

        label3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("Fecha");
        jPanel2.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 70, 30));

        label2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("Motivo de Baja");
        jPanel2.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 90, 30));

        lblRMotivoBaja.setForeground(new java.awt.Color(255, 51, 51));
        lblRMotivoBaja.setText("Requerido");
        jPanel2.add(lblRMotivoBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 90, 30));

        cboMotivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Muerte", "Vendido", "Mal Ingresado" }));
        jPanel2.add(cboMotivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 210, 30));

        btnConfirmarBaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ingresar 16px.png"))); // NOI18N
        btnConfirmarBaja.setText("Confirmar");
        btnConfirmarBaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfirmarBajaMouseClicked(evt);
            }
        });
        jPanel2.add(btnConfirmarBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 120, 30));

        btnCancelarBaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Eliminar16px.png"))); // NOI18N
        btnCancelarBaja.setText("Cancelar");
        btnCancelarBaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarBajaMouseClicked(evt);
            }
        });
        jPanel2.add(btnCancelarBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 120, 30));

        txtCaravana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCaravanaActionPerformed(evt);
            }
        });
        jPanel2.add(txtCaravana, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean validarDatos(){
        
        int contador = 0;
        
        if(jDateFechaBaja.getDate() == null){ lblRFechaBaja.setVisible(true); contador++; } else{ lblRFechaBaja.setVisible(false); }
        if(cboMotivo.getSelectedIndex() < 1){ lblRMotivoBaja.setVisible(true); contador++; }else{ lblRMotivoBaja.setVisible(false); }
    
        if(contador < 1){
            return true;
        }
        else{
            return false;
        }
        
    }
    
    private void btnConfirmarBajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmarBajaMouseClicked
        if(validarDatos()){

            Date fechaBaja = jDateFechaBaja.getDate();
            String motivo = cboMotivo.getSelectedItem().toString();

            Bovino bovino = dControladora.buscarBovinoCaravana(frmBovino.caravana);

            BajaLogicaBovino bajaLogicaBovino = new BajaLogicaBovino(bovino, fechaBaja, motivo);

            if(motivo.equals("Mal Ingresado")){
                if(dControladora.bajaRealBovino(bovino.getIdBovino())){
                    JOptionPane.showMessageDialog(null, "Eliminado Conrrectamente");
                }else{
                    JOptionPane.showMessageDialog(null, "No se realizó la Eliminación");
                }
            }
            else if(dControladora.bajaBovino(bovino.getIdBovino()) && dControladora.altaBajaLogicaBovino(bajaLogicaBovino)){

                JOptionPane.showMessageDialog(null, "Baja Lógica Exitosa");
                frmBovino.caravana = "";

                frmBovino.frmBovino1.dispose();
                frmBovino.frmBovino1 = null;

                frmBovino formularioBovino = new frmBovino();
                frmInicio.jDkPEscritorio.add(formularioBovino);
                formularioBovino.setVisible(true);
                this.dispose();
            }
            else{

                JOptionPane.showMessageDialog(null, "No se realizó la Baja Lógica");
                frmBovino.caravana = "";

                frmBovino formularioBovino = new frmBovino();
                frmInicio.jDkPEscritorio.add(formularioBovino);
                formularioBovino.actualizarTabla();
                this.dispose();
            }

        }
    }//GEN-LAST:event_btnConfirmarBajaMouseClicked

    private void btnCancelarBajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarBajaMouseClicked
        frmBovino.caravana = "";
        this.dispose();

    }//GEN-LAST:event_btnCancelarBajaMouseClicked

    private void txtCaravanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCaravanaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCaravanaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarBaja;
    private javax.swing.JButton btnConfirmarBaja;
    private javax.swing.JComboBox<String> cboMotivo;
    private com.toedter.calendar.JDateChooser jDateFechaBaja;
    private javax.swing.JPanel jPanel2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label lblRFechaBaja;
    private java.awt.Label lblRMotivoBaja;
    private javax.swing.JTextField txtCaravana;
    // End of variables declaration//GEN-END:variables
}
