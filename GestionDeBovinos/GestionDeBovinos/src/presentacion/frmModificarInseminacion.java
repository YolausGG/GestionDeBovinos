/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import clases.EventoDeSanidad;
import clases.Hembra;
import clases.Inseminacion;
import clases.Macho;
import dominio.dControladora;
import javax.swing.JOptionPane;
import java.util.Date;

public class frmModificarInseminacion extends javax.swing.JInternalFrame {

    public static String caravanaHembra, caravanaMacho;
    
    public frmModificarInseminacion() {
        initComponents();
        
        this.setSize(frmInicio.jDkPEscritorio.getWidth(), frmInicio.jDkPEscritorio.getHeight()); 
        this.setTitle("MODIFICAR INSEMINACIÓN");
        
        lblRMacho.setVisible(false);
        lblRFechaInseminacion.setVisible(false);
        lblRHembra.setVisible(false);
        
        Inseminacion Inseminacion = dControladora.buscarInseminacion(frmInseminacion.idInseminacion);
        
        jDateFechaInseminacion.setDate(Inseminacion.getFecha());
        txaDetalle.setText(Inseminacion.getDetalle());
        
        if(this.caravanaHembra != null){
            txtCaravanaHembra.setText(this.caravanaHembra);
        }
        else{
            txtCaravanaHembra.setText(Inseminacion.getHembra().getCaravanaBovino());
        }
        if(this.caravanaMacho != null){
            txtCaravanaMacho.setText(this.caravanaMacho);
        }
        else{
            txtCaravanaMacho.setText(Inseminacion.getMacho().getCaravanaBovino());
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblRHembra = new java.awt.Label();
        jLabel3 = new javax.swing.JLabel();
        jDateFechaInseminacion = new com.toedter.calendar.JDateChooser();
        lblRFechaInseminacion = new java.awt.Label();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaDetalle = new javax.swing.JTextArea();
        txtCaravanaHembra = new javax.swing.JTextField();
        btnModificarInseminacion = new javax.swing.JButton();
        btnBuscarHembra = new javax.swing.JButton();
        txtCaravanaMacho = new javax.swing.JTextField();
        lblRMacho = new java.awt.Label();
        btnBuscarMacho = new javax.swing.JButton();

        setBackground(new java.awt.Color(54, 67, 114));

        jPanel2.setBackground(new java.awt.Color(133, 146, 158));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Macho:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Detalle (Opcional): ");

        lblRHembra.setText("Requerido");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Hembra:");

        lblRFechaInseminacion.setText("Requerido");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Fecha Inseminación:");

        txaDetalle.setColumns(20);
        txaDetalle.setRows(5);
        jScrollPane2.setViewportView(txaDetalle);

        btnModificarInseminacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Modificar16px.png"))); // NOI18N
        btnModificarInseminacion.setText("Modificar");
        btnModificarInseminacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarInseminacionMouseClicked(evt);
            }
        });

        btnBuscarHembra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar16px.png"))); // NOI18N
        btnBuscarHembra.setText("Buscar");
        btnBuscarHembra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarHembraMouseClicked(evt);
            }
        });

        lblRMacho.setText("Requerido");

        btnBuscarMacho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar16px.png"))); // NOI18N
        btnBuscarMacho.setText("Buscar");
        btnBuscarMacho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMachoMouseClicked(evt);
            }
        });

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
                        .addComponent(btnBuscarHembra)
                        .addGap(5, 5, 5)
                        .addComponent(lblRHembra, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtCaravanaMacho, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnBuscarMacho)
                        .addGap(5, 5, 5)
                        .addComponent(lblRMacho, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jDateFechaInseminacion, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lblRFechaInseminacion, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarInseminacion))
                .addContainerGap(18, Short.MAX_VALUE))
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
                    .addComponent(btnBuscarHembra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRHembra, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCaravanaMacho, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarMacho, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRMacho, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateFechaInseminacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRFechaInseminacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnModificarInseminacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
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

    public void limpiarCajas() {

        txtCaravanaHembra.setText(null);
        txtCaravanaMacho.setText(null);
        jDateFechaInseminacion.setDate(null);
        txaDetalle.setText(null);
        
    }
    
    private boolean validarCampos(){
        int contador = 0;
        
        if(txtCaravanaHembra.getText().equals("")){ lblRHembra.setVisible(true); contador++; }else { lblRHembra.setVisible(false);}
        if(txtCaravanaMacho.getText().isEmpty()){ lblRMacho.setVisible(true); contador++; }else { lblRMacho.setVisible(false);}
        if(jDateFechaInseminacion.getDate() == null){ lblRFechaInseminacion.setVisible(true); contador++; }else { lblRFechaInseminacion.setVisible(false);}
        
        if(contador < 1){
            return true;
        }
        else{
            return false;
        }
    }
    
    private void btnModificarInseminacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarInseminacionMouseClicked

        if(validarCampos()){

            String caravana = txtCaravanaHembra.getText();
            Hembra hembra = dControladora.buscarHembraPorCaravana(caravana);

            Date fechaInseminacion = jDateFechaInseminacion.getDate();

            String detalle = txaDetalle.getText();

            EventoDeSanidad eventoDeSanidad = new EventoDeSanidad(fechaInseminacion, detalle, hembra);

            try {

                if (dControladora.modificarEventoDeSanidad(frmInseminacion.idInseminacion, eventoDeSanidad)) {

                    Macho macho = dControladora.buscarMachoPorCaravana(txtCaravanaMacho.getText());

                    Inseminacion inseminacion = new Inseminacion(fechaInseminacion, detalle, hembra, macho);

                    if(dControladora.modificarInseminacion(frmInseminacion.idInseminacion, inseminacion)){

                        JOptionPane.showMessageDialog(null, "Inseminación Modificada Correctamente");
                        this.caravanaHembra = null;
                        this.caravanaMacho = null;
                        this.dispose();
                        frmInseminacion formularioInseminacion = new frmInseminacion();
                        frmInicio.jDkPEscritorio.add(formularioInseminacion);
                        formularioInseminacion.setVisible(true);
                    }
                    else{
                        this.caravanaHembra = null;
                        this.caravanaMacho = null;
                        JOptionPane.showMessageDialog(null, "Inseminación No Modificada Correctamente");
                    }
                } else {
                    this.caravanaHembra = null;
                    this.caravanaMacho = null;
                    JOptionPane.showMessageDialog(null, "Error: No se pudo Modificado el Evento de Sanidad");
                }

            } catch (Exception e) {
                throw e;
            }
        }else {
            JOptionPane.showMessageDialog(null, "Ingrese los datos faltantes");
        }
    }//GEN-LAST:event_btnModificarInseminacionMouseClicked

    private void btnBuscarHembraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarHembraMouseClicked

        frmBuscarHembra buscarHembra = new frmBuscarHembra();
        frmBuscarHembra.frm = "frmModificarInseminacion";
        frmInicio.jDkPEscritorio.add(buscarHembra);
        buscarHembra.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBuscarHembraMouseClicked

    private void btnBuscarMachoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMachoMouseClicked

        frmBuscarMacho buscarMacho = new frmBuscarMacho();
        frmBuscarMacho.frm = "frmModificarInseminacion";
        frmInicio.jDkPEscritorio.add(buscarMacho);
        buscarMacho.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBuscarMachoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarHembra;
    private javax.swing.JButton btnBuscarMacho;
    private javax.swing.JButton btnModificarInseminacion;
    private com.toedter.calendar.JDateChooser jDateFechaInseminacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Label lblRFechaInseminacion;
    private java.awt.Label lblRHembra;
    private java.awt.Label lblRMacho;
    private javax.swing.JTextArea txaDetalle;
    private javax.swing.JTextField txtCaravanaHembra;
    private javax.swing.JTextField txtCaravanaMacho;
    // End of variables declaration//GEN-END:variables
}
