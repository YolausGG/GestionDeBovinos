/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import clases.BotonesTabla;
import clases.EstadoDelBovino;
import dominio.dControladora;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.*;
import javax.swing.JTable;

/**
 *
 * @author nico_
 */
public class frmEstadoDelBovino extends javax.swing.JInternalFrame {

    JButton modificar = new JButton("Modificar"); 
    JButton eliminar = new JButton("Eliminar");
    
    public static int columna, row; // Metodo para cuando hacemos click en los botones    
    
    public static int idEstado = 0;
    
    /**
     * Creates new form frmEstadoDelBovino1
     */
    public frmEstadoDelBovino() {
        initComponents();
        
        
        this.setTitle("ESTADOS");
        actualizarTabla();        
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
        jTableEstado = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txtNombreDelEstado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnAltaEstado = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableEstado = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        jTableEstado.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableEstado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEstadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEstado);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 490, 240));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(txtNombreDelEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 210, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Nuevo Estado:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 160, -1));

        btnAltaEstado.setText("Agregar");
        btnAltaEstado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAltaEstadoMouseClicked(evt);
            }
        });
        jPanel2.add(btnAltaEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        btnImprimir.setText("Imprimir");
        btnImprimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnImprimirMouseClicked(evt);
            }
        });
        jPanel2.add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 490, 140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void limpiarCajas() {

        txtNombreDelEstado.setText(null);

    }
    
    public void actualizarTabla() {
        jTableEstado.setDefaultRenderer(Object.class, new BotonesTabla());

        DefaultTableModel model = new DefaultTableModel();
        ArrayList<EstadoDelBovino> listaEstados = dControladora.listarEstadoDelBovino();

        model.addColumn("id Estado ");
        model.addColumn("Estado ");
        model.addColumn("Modificar ");
        model.addColumn("Eliminar ");
        
        for (EstadoDelBovino e : listaEstados) {

            model.addRow(new Object[]{e.getIdEstadoDelBovino(), e.getEstado(), modificar, eliminar});
        }

        jTableEstado.setModel(model);
        jTableEstado.setRowHeight(25);
    }
    
    public static String nombreEnfermedad = "";
    public static int idEnfermedad = 0;
    private void jTableEstadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEstadoMouseClicked

        columna = jTableEstado.getColumnModel().getColumnIndexAtX(evt.getX());
        row = evt.getY() / jTableEstado.getRowHeight();
        if (columna <= jTableEstado.getColumnCount() && columna >= 0 && row <= jTableEstado.getRowCount() && row >= 0) {
            Object objeto = jTableEstado.getValueAt(row, columna);
            if (objeto instanceof JButton) {
                ((JButton) objeto).doClick();
                JButton botones = (JButton) objeto;

                if (botones.getName().equals("btnModificar")) {

                    int fila = jTableEstado.getSelectedRow();

                    if (fila != -1) {
                        limpiarCajas();

                        idEstado = (int) jTableEstado.getValueAt(fila, 0);

                        this.dispose();
                        frmModificarEstadoDelBovino modificarEstadoDelBovino = new frmModificarEstadoDelBovino();
                        frmInicio.jDkPEscritorio.add(modificarEstadoDelBovino);
                        modificarEstadoDelBovino.setVisible(true); // Abre el formulario de Modificar la Enfermedad

                    } else {
                        JOptionPane.showMessageDialog(null, "Error: No se selecciono la Enfermedad a modificar");
                    }
                } else {
                    if (botones.getName().equals("btnEliminar")) {

                        int fila = jTableEstado.getSelectedRow();
                        int idEstado = Integer.parseInt(this.jTableEstado.getValueAt(fila, 0).toString());

                        try {

                            //La primera opcion seleccionada (SI) devuelve cero y la segunda (NO) devuelve uno
                            int opcion = JOptionPane.showConfirmDialog(null, "Desea Eliminar el Estado?", "Eliminar Estado ", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                            if (opcion == 0) {

                                boolean resultado = dControladora.bajaEstadoDelBovino(idEstado);

                                if (resultado) {

                                    actualizarTabla();
                                    limpiarCajas(); // Limpiamos Caja de Texto

                                } else {
                                    JOptionPane.showMessageDialog(null, "Error: No se pudo Eliminar el Estado");
                                }

                            } else {

                                JOptionPane.showMessageDialog(null, "El Estado no se Elimino");
                            }

                        } catch (Exception e) {
                            throw e;
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_jTableEstadoMouseClicked

    private void btnAltaEstadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAltaEstadoMouseClicked

        String nombre = txtNombreDelEstado.getText();

        EstadoDelBovino estado = new EstadoDelBovino(nombre);

        try {

            if(txtNombreDelEstado.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Debe Ingresar el Estado Nuevo");
            }
            else{
                boolean resultado = dControladora.altaEstadoDelBovino(estado);
                if (resultado) {

                    JOptionPane.showMessageDialog(null, "Estado Ingresado Correctamente");
                    actualizarTabla();
                    limpiarCajas(); // Limpiamos Caja de Texto

                } else {
                    JOptionPane.showMessageDialog(null, "Error: No se pudo agregar el Estado");
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }//GEN-LAST:event_btnAltaEstadoMouseClicked

    private void btnImprimirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnImprimirMouseClicked

        MessageFormat header = new MessageFormat("Reporte ");
        MessageFormat footer = new MessageFormat("Page {0, number, integer}");

        try {
            jTableEstado.print(JTable.PrintMode.NORMAL, header, footer);
        } catch (java.awt.print.PrinterException e) {
            System.err.format("No se pudo Imprimir", e.getMessage());
        }

    }//GEN-LAST:event_btnImprimirMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAltaEstado;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEstado;
    private javax.swing.JTextField txtNombreDelEstado;
    // End of variables declaration//GEN-END:variables
}
