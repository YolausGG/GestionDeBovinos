/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import clases.BajaLogicaBovino;
import clases.Bovino;
import dominio.dControladora;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author nico_
 */

public class frmBajaLogica extends javax.swing.JFrame {

    /**
     * Creates new form frmLogin
     */
    public frmBajaLogica() {
        initComponents();
        this.setTitle("BAJA LÓGICA DE BOVINO");
        lblRFechaBaja.setVisible(false);
        lblRMotivoBaja.setVisible(false);
        lblCaravanaBovinoTxt.setText(frmBovino.caravana);
        
    }

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
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        lblCaravanaBovinoTxt = new java.awt.Label();
        btnConfirmarBaja = new javax.swing.JButton();
        jDateFechaBaja = new com.toedter.calendar.JDateChooser();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        lblRMotivoBaja = new java.awt.Label();
        lblRFechaBaja = new java.awt.Label();
        cboMotivo = new javax.swing.JComboBox<>();
        btnCancelarBaja = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(368, 327));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label1.setText("¿Está seguro que quiere dar de Baja el Bovino");
        getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        lblCaravanaBovinoTxt.setText("...");
        getContentPane().add(lblCaravanaBovinoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 80, -1));

        btnConfirmarBaja.setText("Confirmar");
        btnConfirmarBaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfirmarBajaMouseClicked(evt);
            }
        });
        btnConfirmarBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarBajaActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirmarBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 100, 30));
        getContentPane().add(jDateFechaBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 210, 30));

        label2.setText("Motivo de Baja");
        getContentPane().add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 90, 30));

        label3.setText("Fecha");
        getContentPane().add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        lblRMotivoBaja.setText("Requerido");
        getContentPane().add(lblRMotivoBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 90, 30));

        lblRFechaBaja.setText("Requerido");
        getContentPane().add(lblRFechaBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 90, 30));

        cboMotivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Muerte", "Vendido", "Mal Ingresado" }));
        getContentPane().add(cboMotivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 210, 30));

        btnCancelarBaja.setText("Cancelar");
        btnCancelarBaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarBajaMouseClicked(evt);
            }
        });
        btnCancelarBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarBajaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelarBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 100, 30));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarBajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarBajaMouseClicked
        frmBovino.caravana = "";
        this.dispose(); 
       
    }//GEN-LAST:event_btnCancelarBajaMouseClicked

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
                
                frmBovino.frmBovino1 = null;
                frmBovino.frmBovino1.dispose();
                
                frmBovino formularioBovino = new frmBovino();
                formularioBovino.setVisible(true);
                this.dispose();
            }
            else{
                
                JOptionPane.showMessageDialog(null, "No se realizó la Baja Lógica");
                frmBovino.caravana = "";
                
                frmBovino formularioBovino = new frmBovino();
                formularioBovino.actualizarTabla();
                this.dispose();
            }
        
        }
    }//GEN-LAST:event_btnConfirmarBajaMouseClicked

    private void btnCancelarBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarBajaActionPerformed
        
    }//GEN-LAST:event_btnCancelarBajaActionPerformed

    private void btnConfirmarBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarBajaActionPerformed
        
        
    }//GEN-LAST:event_btnConfirmarBajaActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(frmBajaLogica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmBajaLogica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmBajaLogica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmBajaLogica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmBajaLogica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarBaja;
    private javax.swing.JButton btnConfirmarBaja;
    private javax.swing.JComboBox<String> cboMotivo;
    private com.toedter.calendar.JDateChooser jDateFechaBaja;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label lblCaravanaBovinoTxt;
    private java.awt.Label lblRFechaBaja;
    private java.awt.Label lblRMotivoBaja;
    // End of variables declaration//GEN-END:variables

}