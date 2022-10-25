/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import clases.BotonesTabla;
import clases.Bovino;
import clases.EstadoBovino;
import clases.EstadoDelBovino;
import clases.Padece;
import dominio.dControladora;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import persistencia.pEstadoDelBovino;

/**
 *
 * @author nico_
 */
public class frmEstadoConBovino extends javax.swing.JFrame {

    JButton modificar = new JButton("Modificar"); // Creamos los botones para la tabla
    JButton eliminar = new JButton("Eliminar");
    JButton finalizar = new JButton("Finalizar");

    public static frmEstadoConBovino frmEstadoConBovino1 = null;

    public static EstadoBovino estadoBovino = new EstadoBovino();

    public static int columna, row; // Metodo para cuando hacemos click en los botones

    public frmEstadoConBovino() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH); // Maximisa la ventana 
        this.setTitle("ASIGNAR ESTADO A BOVINO");
        modificar.setName("btnModificar");
        eliminar.setName("btnEliminar");
        finalizar.setName("btnFinalizar");
        lblRCaravanaB.setVisible(false);
        lblRFechaInicioE.setVisible(false);
        lblREstado.setVisible(false);

        llenarComboEstado();

        txtCaravanaBovino.setText(frmBuscarBovino.caravana);

        if (txtCaravanaBovino.getText().isEmpty()) {
            actualizarTabla();

        } else {
            actualizarTablaEstadoB();
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

        grupoBotones = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEstadoConBovino = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jDateFechaInicioE = new com.toedter.calendar.JDateChooser();
        jDateFechaFinalizacionE = new com.toedter.calendar.JDateChooser();
        txtCaravanaBovino = new javax.swing.JTextField();
        btnBuscarBovino = new javax.swing.JButton();
        lblRCaravanaB = new javax.swing.JLabel();
        lblRFechaInicioE = new javax.swing.JLabel();
        lblREstado = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cboEstado = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableEstadoConBovino = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column){
                return false;
            }};
            jTableEstadoConBovino.setModel(new javax.swing.table.DefaultTableModel(
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
            jTableEstadoConBovino.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jTableEstadoConBovinoMouseClicked(evt);
                }
            });
            jScrollPane1.setViewportView(jTableEstadoConBovino);

            jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 850, 240));

            jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            jLabel2.setText("Caravana:");
            jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 160, -1));
            jPanel2.add(jDateFechaInicioE, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 160, 30));
            jPanel2.add(jDateFechaFinalizacionE, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 160, 30));

            txtCaravanaBovino.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyReleased(java.awt.event.KeyEvent evt) {
                    txtCaravanaBovinoKeyReleased(evt);
                }
            });
            jPanel2.add(txtCaravanaBovino, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 100, 30));

            btnBuscarBovino.setText("Buscar");
            btnBuscarBovino.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    btnBuscarBovinoMouseClicked(evt);
                }
            });
            jPanel2.add(btnBuscarBovino, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

            lblRCaravanaB.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
            lblRCaravanaB.setForeground(new java.awt.Color(0, 0, 0));
            lblRCaravanaB.setText("Requerido");
            jPanel2.add(lblRCaravanaB, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 120, 20));

            lblRFechaInicioE.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
            lblRFechaInicioE.setForeground(new java.awt.Color(0, 0, 0));
            lblRFechaInicioE.setText("Requerido");
            jPanel2.add(lblRFechaInicioE, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 120, 20));

            lblREstado.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
            lblREstado.setForeground(new java.awt.Color(0, 0, 0));
            lblREstado.setText("Requerido");
            jPanel2.add(lblREstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 120, 20));

            btnIngresar.setText("Ingresar");
            btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    btnIngresarMouseClicked(evt);
                }
            });
            jPanel2.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 90, -1));

            jLabel8.setText("Estado:");
            jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

            jLabel9.setText("Fecha Finalizacion de Estado:");
            jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, -1));

            cboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
            jPanel2.add(cboEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 180, 30));

            jLabel4.setText("Fecha Comienzo de Estado:");
            jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

            jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 510, 290));

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
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    public boolean validarCampos() {

        int contador = 0;
        if (txtCaravanaBovino.getText().equals("")) {
            lblRCaravanaB.setVisible(true);
            contador++;
        } else {
            lblRCaravanaB.setVisible(false);
        }
        if (jDateFechaInicioE.getDate() == null) {
            lblRFechaInicioE.setVisible(true);
            contador++;
        } else {
            lblRFechaInicioE.setVisible(false);
        }
        if (cboEstado.getSelectedIndex() == 0) {
            lblREstado.setVisible(true);
            contador++;
        } else {
            lblREstado.setVisible(false);
        }

        if (contador < 1) {
            return true;
        } else {
            return false;
        }
    }

    public void limpiarCajas() {

        txtCaravanaBovino.setText(null);
        jDateFechaInicioE.setDate(null);
        jDateFechaFinalizacionE.setDate(null);
        cboEstado.setSelectedIndex(0);

    }

    public void actualizarTabla() {
        jTableEstadoConBovino.setDefaultRenderer(Object.class, new BotonesTabla());
        DefaultTableModel model = new DefaultTableModel();

        ArrayList<EstadoBovino> listaEstadoBovinos = dControladora.listarEstadosBovino();

        model.addColumn("Caravana");
        model.addColumn("");
        model.addColumn("Estado");
        model.addColumn("Fecha Inicio");
        model.addColumn("Fecha Finalización");
        model.addColumn("Finalizar Estado ");
        model.addColumn("Modificar ");
        model.addColumn("Eliminar ");

        for (EstadoBovino e : listaEstadoBovinos) {

            EstadoDelBovino estado = dControladora.buscarEstadoDelBovino(e.getIdEstadoDelBovino());
            Bovino bovino = dControladora.buscarBovinoId(e.getIdBovino());

            model.addRow(new Object[]{bovino.getCaravanaBovino(),estado.getIdEstadoDelBovino(), estado.getEstado(), e.getFechaInicio(), e.getFechaFinalizacion(), finalizar, modificar, eliminar});
        }

        jTableEstadoConBovino.setModel(model);
        jTableEstadoConBovino.setRowHeight(25);
        jTableEstadoConBovino.getColumnModel().getColumn(1).setMaxWidth(0);
        jTableEstadoConBovino.getColumnModel().getColumn(1).setMinWidth(0);
        jTableEstadoConBovino.getColumnModel().getColumn(1).setPreferredWidth(0);
    }

    public void actualizarTablaEstadoB() {

        jTableEstadoConBovino.setDefaultRenderer(Object.class, new BotonesTabla());
        DefaultTableModel model = new DefaultTableModel();

        String caravana = txtCaravanaBovino.getText();

        Bovino bovino = dControladora.buscarBovinoCaravana(caravana);

        ArrayList<EstadoBovino> listaEstadoB = dControladora.listarEstadosBovinoPorBovino(bovino.getIdBovino());

        model.addColumn("Caravana");
        model.addColumn("");
        model.addColumn("Estado");
        model.addColumn("Fecha Inicio");
        model.addColumn("Fecha Finalización");
        model.addColumn("Finalizar Estado ");
        model.addColumn("Modificar ");
        model.addColumn("Eliminar ");

        for (EstadoBovino e : listaEstadoB) {

            EstadoDelBovino estado = dControladora.buscarEstadoDelBovino(e.getIdEstadoDelBovino());
            Bovino bovinoE = dControladora.buscarBovinoId(e.getIdBovino());

            model.addRow(new Object[]{bovinoE.getCaravanaBovino(),estado.getIdEstadoDelBovino(), estado.getEstado(), e.getFechaInicio(), e.getFechaFinalizacion(), finalizar, modificar, eliminar});
        }

        jTableEstadoConBovino.setModel(model);
        jTableEstadoConBovino.setRowHeight(25);
        jTableEstadoConBovino.getColumnModel().getColumn(1).setMaxWidth(0);
        jTableEstadoConBovino.getColumnModel().getColumn(1).setMinWidth(0);
        jTableEstadoConBovino.getColumnModel().getColumn(1).setPreferredWidth(0);
    }

    private void llenarComboEstado() {

        ArrayList<EstadoDelBovino> listaEstados = pEstadoDelBovino.listarEstadosDelBovino();

        for (EstadoDelBovino estado : listaEstados) {

            cboEstado.addItem(estado);
        }

    }

    public static String caravana = "";
    public static String estado = "";
    private void jTableEstadoConBovinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEstadoConBovinoMouseClicked

        columna = jTableEstadoConBovino.getColumnModel().getColumnIndexAtX(evt.getX());
        row = evt.getY() / jTableEstadoConBovino.getRowHeight();
        if (columna <= jTableEstadoConBovino.getColumnCount() && columna >= 0 && row <= jTableEstadoConBovino.getRowCount() && row >= 0) {
            Object objeto = jTableEstadoConBovino.getValueAt(row, columna);
            if (objeto instanceof JButton) {
                ((JButton) objeto).doClick();
                JButton botones = (JButton) objeto;

                if (botones.getName().equals("btnModificar")) {
                    
                    int fila = jTableEstadoConBovino.getSelectedRow();

                    if (fila != -1) {
                        limpiarCajas();

                        caravana = this.jTableEstadoConBovino.getValueAt(fila, 0).toString();
                        Bovino bovino = dControladora.buscarBovinoCaravana(caravana);
                        estadoBovino.setIdBovino(bovino.getIdBovino());
                        estadoBovino.setIdEstadoDelBovino(Integer.parseInt(this.jTableEstadoConBovino.getValueAt(fila, 1).toString()));
                        estado = this.jTableEstadoConBovino.getValueAt(fila, 2).toString();
                        estadoBovino.setFechaInicio((Date) this.jTableEstadoConBovino.getValueAt(fila, 3));
                        estadoBovino.setFechaFinalizacion((Date) this.jTableEstadoConBovino.getValueAt(fila, 4));

                        this.dispose();
                        frmModificarEstadoConBovino modificarEstadoConBovino = new frmModificarEstadoConBovino();
                        modificarEstadoConBovino.setVisible(true); // Abre el formulario de Modificar la Enfermedad

                    } else {
                        JOptionPane.showMessageDialog(null, "Error: No se selecciono el Bovino a modificar");
                    }
                }
                if (botones.getName().equals("btnEliminar")) {
                    int fila = jTableEstadoConBovino.getSelectedRow();

                    String caravana = this.jTableEstadoConBovino.getValueAt(fila, 0).toString();
                    int idEstado = Integer.parseInt(this.jTableEstadoConBovino.getValueAt(fila, 1).toString());
                    Date fechaInicio = (Date) this.jTableEstadoConBovino.getValueAt(fila, 3);

                    Bovino bovino = dControladora.buscarBovinoCaravana(caravana);

                    EstadoBovino estadoBovino = new EstadoBovino(idEstado, bovino.getIdBovino(), fechaInicio);

                    try {

                        //La primera opcion seleccionada (SI) devuelve cero y la segunda (NO) devuelve uno
                        int opcion = JOptionPane.showConfirmDialog(null, "Desea Eliminar el Estado Asignado al Bovino?", "Eliminar Estado del Bovino ", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                        if (opcion == 0) {

                            boolean resultado = dControladora.deleteEstadoBovino(estadoBovino);

                            if (resultado) {

                                JOptionPane.showMessageDialog(null, "Se Elimino correctamente el Bovino Enfermo");
                                actualizarTabla();
                                limpiarCajas(); // Limpiamos Caja de Texto

                            } else {
                                JOptionPane.showMessageDialog(null, "Error: No se pudo Eliminar el Bovino Enfermo");
                            }

                        } else {

                            JOptionPane.showMessageDialog(null, "El Estado del Bovino no se Elimino");
                        }

                    } catch (Exception e) {
                        throw e;
                    }

                }
                if (botones.getName().equals("btnFinalizar")) {
                    
                    int fila = jTableEstadoConBovino.getSelectedRow();
                    
                    caravana = this.jTableEstadoConBovino.getValueAt(fila, 0).toString();
                    Bovino bovino = dControladora.buscarBovinoCaravana(caravana);
                    estadoBovino.setIdBovino(bovino.getIdBovino());
                    estadoBovino.setIdEstadoDelBovino(Integer.parseInt(this.jTableEstadoConBovino.getValueAt(fila, 1).toString()));
                    estado = this.jTableEstadoConBovino.getValueAt(fila, 2).toString();
                    estadoBovino.setFechaInicio((Date) this.jTableEstadoConBovino.getValueAt(fila, 3));
                    
                    frmFechaFinalizacionEstado frmFechaF = new frmFechaFinalizacionEstado();
                    frmFechaF.setVisible(true);

                    frmEstadoConBovino1 = this;
                }
            }
        }
    }//GEN-LAST:event_jTableEstadoConBovinoMouseClicked

    private void btnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseClicked

        if (validarCampos()) {

            String caravana = txtCaravanaBovino.getText();
            Date fechaInicioE = jDateFechaInicioE.getDate();
            Date fechaFinalizacionE = jDateFechaFinalizacionE.getDate();
            EstadoDelBovino estado = (EstadoDelBovino) cboEstado.getSelectedItem();

            Bovino bovino = dControladora.buscarBovinoCaravana(caravana);

            EstadoBovino estadoBovino = new EstadoBovino(estado.getIdEstadoDelBovino(), bovino.getIdBovino(), fechaInicioE);

            EstadoBovino estadoBovinoFechaF = new EstadoBovino(estado.getIdEstadoDelBovino(), bovino.getIdBovino(), fechaInicioE, fechaFinalizacionE);

            try {
                if (jDateFechaFinalizacionE.getDate() == null) {

                    boolean resultado = dControladora.altaEstadoBovinoFechaInicio(estadoBovino);

                    if (resultado) {

                        JOptionPane.showMessageDialog(null, "Se Asigno Correctamente el Estado al Bovino");
                        actualizarTabla();
                        limpiarCajas(); // Limpiamos Caja de Texto

                    } else {
                        JOptionPane.showMessageDialog(null, "Error: No se pudo Asignar el Estado al Bovino");
                    }
                } else {
                    boolean resultado = dControladora.altaEstadoBovino(estadoBovinoFechaF);

                    if (resultado) {

                        JOptionPane.showMessageDialog(null, "Se Asigno Correctamente el Estado al Bovino");
                        actualizarTabla();
                        limpiarCajas(); // Limpiamos Caja de Texto

                    } else {
                        JOptionPane.showMessageDialog(null, "Error: No se pudo Asignar el Estado al Bovino");
                    }

                }

            } catch (Exception e) {
                throw e;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese los datos faltantes");
        }
    }//GEN-LAST:event_btnIngresarMouseClicked

    private void btnBuscarBovinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarBovinoMouseClicked
        frmBuscarBovino buscarBovino = new frmBuscarBovino();
        frmBuscarBovino.frmBuscar = "frmEstadoConBovino";
        buscarBovino.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBuscarBovinoMouseClicked

    private void txtCaravanaBovinoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCaravanaBovinoKeyReleased
        if (txtCaravanaBovino.getText().isEmpty()) {
            actualizarTabla();

        }
    }//GEN-LAST:event_txtCaravanaBovinoKeyReleased

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
            java.util.logging.Logger.getLogger(frmEstadoConBovino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmEstadoConBovino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmEstadoConBovino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmEstadoConBovino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new frmEstadoConBovino().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarBovino;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JComboBox<Object> cboEstado;
    private javax.swing.ButtonGroup grupoBotones;
    private com.toedter.calendar.JDateChooser jDateFechaFinalizacionE;
    private com.toedter.calendar.JDateChooser jDateFechaInicioE;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEstadoConBovino;
    private javax.swing.JLabel lblRCaravanaB;
    private javax.swing.JLabel lblREstado;
    private javax.swing.JLabel lblRFechaInicioE;
    private javax.swing.JTextField txtCaravanaBovino;
    // End of variables declaration//GEN-END:variables
}