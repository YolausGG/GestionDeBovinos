/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import clases.BotonesTabla;
import clases.Bovino;
import clases.Enfermedad;
import clases.Hembra;
import clases.Padece;
import dominio.dControladora;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import persistencia.pEnfermedad;


/**
 *
 * @author nico_
 */
public class frmFechaFinalizacionEnfermedad extends javax.swing.JFrame {    

    public frmFechaFinalizacionEnfermedad() {
        initComponents();
        //setExtendedState(MAXIMIZED_BOTH); // Maximisa la ventana 
        this.setTitle("FECHA FINALIZACIÓN ENFERMEDAD");         

       // lblCaravana.setText(frmPadeceEnfermedad.);     
        
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
        jDateFechaFinalizacionE = new com.toedter.calendar.JDateChooser();
        btnIngresar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblFechaInicio = new javax.swing.JLabel();
        lblCaravana = new javax.swing.JLabel();
        lblEnfermedad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jDateFechaFinalizacionE, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 160, 30));

        btnIngresar.setText("Ingresar");
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngresarMouseClicked(evt);
            }
        });
        jPanel2.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 90, -1));

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

        lblFechaInicio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblFechaInicio.setText("...");
        jPanel2.add(lblFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, -1));

        lblCaravana.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCaravana.setText("...");
        jPanel2.add(lblCaravana, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        lblEnfermedad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEnfermedad.setText("...");
        jPanel2.add(lblEnfermedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 400, 310));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    public void limpiarCajas() {
       
        jDateFechaFinalizacionE.setDate(null);
        
    }       

    public static int idProduccion = 0;
    private void btnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseClicked
/*
        if (validarCampos()) {

            String caravana = txtCaravanaBovino.getText();
            Date fechaInicioE = jDateFechaInicioE.getDate();
            Date fechaFinalizacionE = jDateFechaFinalizacionE.getDate();
            Enfermedad enfermedad = (Enfermedad) cboEnfermedad.getSelectedItem();

            Bovino bovino = dControladora.buscarBovinoCaravana(caravana);

            Padece padece = new Padece(enfermedad.getIdEnfermedad(), bovino.getIdBovino(), fechaInicioE);
           
            Padece padeceFechaF = new Padece(enfermedad.getIdEnfermedad(), bovino.getIdBovino(), fechaInicioE, fechaFinalizacionE);

            try {
                if (jDateFechaFinalizacionE.getDate() == null) {

                    boolean resultado = dominio.dPadece.altaPadeceFechaInicio(padece);

                    if (resultado) {

                        JOptionPane.showMessageDialog(null, "Se Ingreso Correctamente el Bovino Enfermo");
                        actualizarTabla();
                        limpiarCajas(); // Limpiamos Caja de Texto

                    } else {
                        JOptionPane.showMessageDialog(null, "Error: No se pudo ingresar el Bovino Enfermo");
                    }
                } else {
                    boolean resultado = dominio.dPadece.altaPadece(padeceFechaF);

                    if (resultado) {

                        JOptionPane.showMessageDialog(null, "Se Ingreso Correctamente el Bovino Enfermo");
                        actualizarTabla();
                        limpiarCajas(); // Limpiamos Caja de Texto

                    } else {
                        JOptionPane.showMessageDialog(null, "Error: No se pudo ingresar el Bovino Enfermo");
                    }

                }

            } catch (Exception e) {
                throw e;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese los datos faltantes");
        }
*/
    }//GEN-LAST:event_btnIngresarMouseClicked

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
            java.util.logging.Logger.getLogger(frmFechaFinalizacionEnfermedad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmFechaFinalizacionEnfermedad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmFechaFinalizacionEnfermedad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmFechaFinalizacionEnfermedad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmFechaFinalizacionEnfermedad().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.ButtonGroup grupoBotones;
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
    // End of variables declaration//GEN-END:variables
}
