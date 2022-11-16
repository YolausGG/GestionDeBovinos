/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;


import javax.swing.JOptionPane;

/**
 *
 * @author nico_
 */
public class frmModificarEnfermedad extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmModificarEnfermedad1
     */
    public frmModificarEnfermedad() {
        initComponents();
        
        this.setSize(frmInicio.jDkPEscritorio.getWidth(), frmInicio.jDkPEscritorio.getHeight());
        this.setTitle("MODIFICAR ENFERMEDAD");

        frmEnfermedad nuevo = new frmEnfermedad();
        
        txtModificarEnfermedad.setText(nuevo.nombreEnfermedad);
        String nombre = txtModificarEnfermedad.getText();
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
        txtModificarEnfermedad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnModificarEnfermedad = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Modificar Enfermedad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 2, 12))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(txtModificarEnfermedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 210, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Nombre Enfermedad:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 160, -1));

        btnModificarEnfermedad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Modificar16px.png"))); // NOI18N
        btnModificarEnfermedad.setText("Modificar");
        btnModificarEnfermedad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarEnfermedadMouseClicked(evt);
            }
        });
        jPanel2.add(btnModificarEnfermedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 440, 190));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void limpiarCajas() {

        txtModificarEnfermedad.setText(null);

    }
    
    private void btnModificarEnfermedadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarEnfermedadMouseClicked

        frmEnfermedad nuevo = new frmEnfermedad();

        int id = nuevo.idEnfermedad;
        String nombre = txtModificarEnfermedad.getText();

        clases.Enfermedad enfermedad = new clases.Enfermedad(nombre);

        try {
            boolean resultado = dominio.dEnfermedad.modificarEnfermedad(id, enfermedad);

            if (resultado) {

                JOptionPane.showMessageDialog(null, "Enfermedad Modificada Correctamente");
                limpiarCajas(); // Limpiamos Caja de Texto
                this.dispose();
                frmInicio.jDkPEscritorio.add(nuevo);
                nuevo.actualizarTabla();
                nuevo.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Error: No se pudo Modificar la Enfermedad");
            }
        } catch (Exception e) {
            throw e;
        }
    }//GEN-LAST:event_btnModificarEnfermedadMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModificarEnfermedad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtModificarEnfermedad;
    // End of variables declaration//GEN-END:variables
}
