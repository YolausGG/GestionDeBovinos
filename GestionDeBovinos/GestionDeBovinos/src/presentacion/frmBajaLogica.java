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

<<<<<<< HEAD
/**
 *
 * @author nico_
 */
public class frmBajaLogica extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmBajaLogica1
     */
    public frmBajaLogica() {
        initComponents();
=======
public class frmBajaLogica extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmBajaLogica
     */
    public frmBajaLogica() {
        initComponents();
        
>>>>>>> 7464209 (CambioFormularios Yolaus)
        this.setTitle("BAJA LÓGICA DE BOVINO");
        lblRFechaBaja.setVisible(false);
        lblRMotivoBaja.setVisible(false);
        lblCaravanaBovinoTxt.setText(frmBovino.caravana);
    }

<<<<<<< HEAD
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
=======
    
>>>>>>> 7464209 (CambioFormularios Yolaus)
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

<<<<<<< HEAD
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

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
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
=======
        jPanel2 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        lblCaravanaBovinoTxt = new java.awt.Label();
        lblRFechaBaja = new java.awt.Label();
        jDateFechaBaja = new com.toedter.calendar.JDateChooser();
        label3 = new java.awt.Label();
        label2 = new java.awt.Label();
        lblRMotivoBaja = new java.awt.Label();
        cboMotivo = new javax.swing.JComboBox<>();
        btnConfirmarBaja = new javax.swing.JButton();
        btnCancelarBaja = new javax.swing.JButton();

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label1.setText("¿Está seguro que quiere dar de Baja el Bovino");
        jPanel2.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        lblCaravanaBovinoTxt.setText("...");
        jPanel2.add(lblCaravanaBovinoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 80, -1));

        lblRFechaBaja.setText("Requerido");
        jPanel2.add(lblRFechaBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 90, 30));
        jPanel2.add(jDateFechaBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 210, 30));

        label3.setText("Fecha");
        jPanel2.add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        label2.setText("Motivo de Baja");
        jPanel2.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 90, 30));

        lblRMotivoBaja.setText("Requerido");
        jPanel2.add(lblRMotivoBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 90, 30));

        cboMotivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Muerte", "Vendido", "Mal Ingresado" }));
        jPanel2.add(cboMotivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 210, 30));

        btnConfirmarBaja.setText("Confirmar");
        btnConfirmarBaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfirmarBajaMouseClicked(evt);
            }
        });
        jPanel2.add(btnConfirmarBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 100, 30));
>>>>>>> 7464209 (CambioFormularios Yolaus)

        btnCancelarBaja.setText("Cancelar");
        btnCancelarBaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarBajaMouseClicked(evt);
            }
        });
<<<<<<< HEAD
        btnCancelarBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarBajaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelarBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 100, 30));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 330));
=======
        jPanel2.add(btnCancelarBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 100, 30));

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
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                .addContainerGap())
        );
>>>>>>> 7464209 (CambioFormularios Yolaus)

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
<<<<<<< HEAD
                frmInicio.jDkPEscritorio.add(formularioBovino);
=======
>>>>>>> 7464209 (CambioFormularios Yolaus)
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

<<<<<<< HEAD
    private void btnConfirmarBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarBajaActionPerformed

    }//GEN-LAST:event_btnConfirmarBajaActionPerformed

=======
>>>>>>> 7464209 (CambioFormularios Yolaus)
    private void btnCancelarBajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarBajaMouseClicked
        frmBovino.caravana = "";
        this.dispose();

    }//GEN-LAST:event_btnCancelarBajaMouseClicked

<<<<<<< HEAD
    private void btnCancelarBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarBajaActionPerformed

    }//GEN-LAST:event_btnCancelarBajaActionPerformed

=======
>>>>>>> 7464209 (CambioFormularios Yolaus)

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarBaja;
    private javax.swing.JButton btnConfirmarBaja;
    private javax.swing.JComboBox<String> cboMotivo;
    private com.toedter.calendar.JDateChooser jDateFechaBaja;
<<<<<<< HEAD
    private javax.swing.JPanel jPanel1;
=======
    private javax.swing.JPanel jPanel2;
>>>>>>> 7464209 (CambioFormularios Yolaus)
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label lblCaravanaBovinoTxt;
    private java.awt.Label lblRFechaBaja;
    private java.awt.Label lblRMotivoBaja;
    // End of variables declaration//GEN-END:variables
}
