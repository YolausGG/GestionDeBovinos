/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import clases.BotonesTabla;
import clases.Enfermedad;
import dominio.dControladora;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.*;
import java.awt.print.*;
import javax.swing.JTable;

/**
 *
 * @author nico_
 */

public class frmEnfermedad extends javax.swing.JFrame {

    JButton modificar = new JButton(""); // Creamos los botones para la tabla
    JButton eliminar = new JButton("");
    
    public static int columna, row; // Metodo para cuando hacemos click en los botones    

    public void insertarIconos(JButton btn, String ruta) { // Insertar Iconos en Botones Tabla

        btn.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta)));

    }

    public frmEnfermedad() {
        initComponents();
       
        setExtendedState(MAXIMIZED_BOTH); // Maximisa la ventana 
        this.setTitle("ENFERMEDAD");
        actualizarTabla();
        insertarIconos(modificar, "/Imagenes/btnModificarChico.png");
        insertarIconos(eliminar, "/Imagenes/btnEliminarChico.png");
        modificar.setName("btnModificar");
        eliminar.setName("btnEliminar");      
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEnfermedad = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txtNombreEnfermedad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnAltaEnfermedad = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableEnfermedad = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        jTableEnfermedad.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableEnfermedad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEnfermedadMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEnfermedad);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 360, 240));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(txtNombreEnfermedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 210, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Nombre Enfermedad:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 160, -1));

        btnAltaEnfermedad.setText("Agregar");
        btnAltaEnfermedad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAltaEnfermedadMouseClicked(evt);
            }
        });
        jPanel2.add(btnAltaEnfermedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        btnImprimir.setText("Imprimir");
        btnImprimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnImprimirMouseClicked(evt);
            }
        });
        jPanel2.add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 360, 140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     
    public void limpiarCajas() {

        txtNombreEnfermedad.setText(null);

    }

    public void actualizarTabla() {
        jTableEnfermedad.setDefaultRenderer(Object.class, new BotonesTabla());

        DefaultTableModel model = new DefaultTableModel();
        ArrayList<Enfermedad> listaEnfermedades = dominio.dEnfermedad.listarEnfermedades();

        model.addColumn("id Enfermedad");
        model.addColumn("Nombre ");
        model.addColumn("Modificar ");
        model.addColumn("Eliminar ");
        
        for (Enfermedad e : listaEnfermedades) {

            model.addRow(new Object[]{e.getIdEnfermedad(), e.getNombre(), modificar, eliminar});
        }

        jTableEnfermedad.setModel(model);
        jTableEnfermedad.setRowHeight(40);
    }

    private void btnAltaEnfermedadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAltaEnfermedadMouseClicked

        String nombre = txtNombreEnfermedad.getText();

        clases.Enfermedad enfermedad = new clases.Enfermedad(nombre);

        try {
                      
            
            if(txtNombreEnfermedad.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe Ingresar el Nombre de la Enfermedad");
            }
            else{
                boolean resultado = dominio.dEnfermedad.altaEnfermedad(enfermedad);
            if (resultado) {

                JOptionPane.showMessageDialog(null, "Enfermedad Ingresada Correctamente");
                actualizarTabla();
                limpiarCajas(); // Limpiamos Caja de Texto

            } else {
                JOptionPane.showMessageDialog(null, "Error: No se pudo agregar la Enfermedad");
            }
            }
        } catch (Exception e) {
            throw e;
        }
    }//GEN-LAST:event_btnAltaEnfermedadMouseClicked
    
    public static String nombreEnfermedad = "";
    public static int idEnfermedad = 0;
    
    private void jTableEnfermedadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEnfermedadMouseClicked
        
        columna = jTableEnfermedad.getColumnModel().getColumnIndexAtX(evt.getX());
        row = evt.getY() / jTableEnfermedad.getRowHeight();
        if (columna <= jTableEnfermedad.getColumnCount() && columna >= 0 && row <= jTableEnfermedad.getRowCount() && row >= 0) {
            Object objeto = jTableEnfermedad.getValueAt(row, columna);
            if (objeto instanceof JButton) {
                ((JButton) objeto).doClick();
                JButton botones = (JButton) objeto;

                if (botones.getName().equals("btnModificar")) {

                    int fila = jTableEnfermedad.getSelectedRow();

                    if (fila != -1) {
                        limpiarCajas();
                        
                        idEnfermedad = (int) jTableEnfermedad.getValueAt(fila, 0);
                        nombreEnfermedad = jTableEnfermedad.getValueAt(fila, 1).toString();                       
                        this.dispose();
                        frmModificarEnfermedad modificarEnfermedad = new frmModificarEnfermedad();
                        modificarEnfermedad.setVisible(true); // Abre el formulario de Modificar la Enfermedad
                        
                    } else {
                        JOptionPane.showMessageDialog(null, "Error: No se selecciono la Enfermedad a modificar");
                    }
                } else {
                    if (botones.getName().equals("btnEliminar")) {

                        int fila = jTableEnfermedad.getSelectedRow();
                        int id = Integer.parseInt(this.jTableEnfermedad.getValueAt(fila, 0).toString());

                        try {

                            //La primera opcion seleccionada (SI) devuelve cero y la segunda (NO) devuelve uno
                            int opcion = JOptionPane.showConfirmDialog(null, "Desea Eliminar la Enfermedad?", "Eliminar Enfermedad ", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                            if (opcion == 0) {

                                boolean resultado = dControladora.bajaEnfermedad(id);

                                if (resultado) {

                                    actualizarTabla();
                                    limpiarCajas(); // Limpiamos Caja de Texto

                                } else {
                                    JOptionPane.showMessageDialog(null, "Error: No se pudo Eliminar la Enfermedad");
                                }

                            } else {

                                JOptionPane.showMessageDialog(null, "La Enfermedad no se Elimino");
                            }

                        } catch (Exception e) {
                            throw e;
                        }
                    }
                }
            }
        }

    }//GEN-LAST:event_jTableEnfermedadMouseClicked

    private void btnImprimirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirMouseClicked
       
        MessageFormat header = new MessageFormat("Reporte ");
        MessageFormat footer = new MessageFormat("Page {0, number, integer}");
        
        try {
            jTableEnfermedad.print(JTable.PrintMode.NORMAL, header, footer);
        } catch (java.awt.print.PrinterException e) {
            System.err.format("No se pudo Imprimir", e.getMessage());
        }
        
    }//GEN-LAST:event_btnImprimirMouseClicked

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
            java.util.logging.Logger.getLogger(frmEnfermedad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmEnfermedad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmEnfermedad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmEnfermedad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmEnfermedad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAltaEnfermedad;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEnfermedad;
    private javax.swing.JTextField txtNombreEnfermedad;
    // End of variables declaration//GEN-END:variables
}
