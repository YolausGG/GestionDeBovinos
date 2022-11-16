/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import clases.BotonesTabla;
import clases.Bovino;
import dominio.dControladora;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmApareable extends javax.swing.JInternalFrame {

    JButton modificar = new JButton("Modificar"); // Creamos los botones para la tabla
    JButton eliminar = new JButton("Eliminar");
    public static String caravana = "";
    public static String sexo = "";

    public static frmApareable frmBovino1 = null;

    public static int columna, row; // Metodo para cuando hacemos click en los botones

    public frmApareable() {
        initComponents();

        this.setSize(frmInicio.jDkPEscritorio.getWidth(), frmInicio.jDkPEscritorio.getHeight());
        this.setTitle("LISTADO DE BOVINOS BUENOS PARA REPRODUCIR");

        lblRCaravana.setVisible(false);
        txtCaravana.setText(frmBuscarBovino.caravana);
        modificar.setName("btnModificar");
        eliminar.setName("btnEliminar");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBovinos = new javax.swing.JTable();
        btnListar = new javax.swing.JButton();
        lblRCaravana = new java.awt.Label();
        jLabel3 = new javax.swing.JLabel();
        txtCaravana = new javax.swing.JTextField();
        btnBuscarBovino = new javax.swing.JButton();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableBovinos = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column){
                return false;
            }};
            jTableBovinos.setModel(new javax.swing.table.DefaultTableModel(
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
            jTableBovinos.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jTableBovinosMouseClicked(evt);
                }
            });
            jScrollPane1.setViewportView(jTableBovinos);

            jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 780, 260));

            btnListar.setText("Listar");
            btnListar.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    btnListarMouseClicked(evt);
                }
            });
            jPanel1.add(btnListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 90, 30));

            lblRCaravana.setText("Requerido");
            jPanel1.add(lblRCaravana, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 90, 30));

            jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            jLabel3.setText("Caravana:");
            jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 160, -1));

            txtCaravana.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyReleased(java.awt.event.KeyEvent evt) {
                    txtCaravanaKeyReleased(evt);
                }
            });
            jPanel1.add(txtCaravana, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 160, 30));

            btnBuscarBovino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar16px.png"))); // NOI18N
            btnBuscarBovino.setText("Buscar");
            btnBuscarBovino.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    btnBuscarBovinoMouseClicked(evt);
                }
            });
            jPanel1.add(btnBuscarBovino, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 90, 30));

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 821, Short.MAX_VALUE)
                    .addContainerGap())
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
                    .addContainerGap())
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    public boolean validarCampos() {

        int contador = 0;
        if (txtCaravana.getText().equals("")) {
            lblRCaravana.setVisible(true);
            contador++;
        } else {
            lblRCaravana.setVisible(false);
        }

        if (contador < 1) {
            return true;
        } else {
            return false;
        }
    }

    public void limpiarCajas() {

        txtCaravana.setText(null);
    }

    public void actualizarTabla() {

        jTableBovinos.setDefaultRenderer(Object.class, new BotonesTabla());
        DefaultTableModel model = new DefaultTableModel();

        Bovino bovino = dControladora.buscarBovinoCaravanaCompleto(txtCaravana.getText());

        //ArrayList<Bovino> arbolGenealogico = dControladora.arbolGenealogico(0, bovino, new ArrayList<Bovino>());
        ArrayList<Bovino> listaBovinos = dControladora.listarBovinos();

        ArrayList<Bovino> noApareables = dControladora.noApareables(0, bovino, new ArrayList<Bovino>());

        // ArrayList<Bovino> listaBovinosHijos = dControladora.parentescos_Hermanos_Sobrinos_SobrinoNieto(0, bovino, new ArrayList<Bovino>());
        
        ArrayList<Bovino> listaBovinosFiltroSexo = new ArrayList<>();
        
        
        for (Bovino listaBovino : listaBovinos) {
            if (!listaBovino.getClass().getSimpleName().equals(sexo)) {

                listaBovinosFiltroSexo.add(listaBovino);
            }
        }

        for (Bovino bovino1 : noApareables) {

            for (Bovino bovino2 : listaBovinosFiltroSexo) {

                if (bovino1.getCaravanaBovino().equals(bovino2.getCaravanaBovino())) {
                    listaBovinosFiltroSexo.remove(bovino2);
                    break;
                }
            }
        }
        model.addColumn("Nº Caravana");
        model.addColumn("Fecha Nacimiento");
        model.addColumn("Raza");
        model.addColumn("Sexo");
        model.addColumn("Modificar ");
        model.addColumn("Eliminar ");

        for (Bovino b : listaBovinosFiltroSexo) {

            String tipo = b.getClass().getSimpleName().equals("Macho") ? "Macho" : "Hembra";

            model.addRow(new Object[]{b.getCaravanaBovino(), b.getFechaNacimiento(), b.getRaza().getTipo(), tipo, modificar, eliminar});
        }

        jTableBovinos.setModel(model);
        jTableBovinos.setRowHeight(25);
    }

    private void jTableBovinosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableBovinosMouseClicked

        columna = jTableBovinos.getColumnModel().getColumnIndexAtX(evt.getX());
        row = evt.getY() / jTableBovinos.getRowHeight();
        if (columna <= jTableBovinos.getColumnCount() && columna >= 0 && row <= jTableBovinos.getRowCount() && row >= 0) {
            Object objeto = jTableBovinos.getValueAt(row, columna);
            if (objeto instanceof JButton) {
                ((JButton) objeto).doClick();
                JButton botones = (JButton) objeto;

                if (botones.getName().equals("btnModificar")) {

                    int fila = jTableBovinos.getSelectedRow();

                    if (fila != -1) {
                        limpiarCajas();

                        caravana = jTableBovinos.getValueAt(fila, 0).toString();
                        sexo = jTableBovinos.getValueAt(fila, 3).toString();
                        this.dispose();
                        frmModificarBovino modificarBovino = new frmModificarBovino();
                        frmInicio.jDkPEscritorio.add(modificarBovino);
                        modificarBovino.setVisible(true); // Abre el formulario de Modificar la Enfermedad

                    } else {
                        JOptionPane.showMessageDialog(null, "Error: No se selecciono el Bovino a modificar");
                    }
                } else {
                    if (botones.getName().equals("btnEliminar")) {

                        int fila = jTableBovinos.getSelectedRow();

                        String caravana = jTableBovinos.getValueAt(fila, 0).toString();

                        frmApareable.caravana = caravana;

                        frmBajaLogica formularioBajaLogica = new frmBajaLogica();
                        frmInicio.jDkPEscritorio.add(formularioBajaLogica);
                        formularioBajaLogica.setVisible(true);

                        frmBovino1 = this;

                        //this.dispose();
                        //actualizarTabla();
                        //La primera opcion seleccionada (SI) devuelve cero y la segunda (NO) devuelve uno
                        //int opcion = JOptionPane.showConfirmDialog(null, "Desea Eliminar el Bovino?", "Eliminar Bovino ", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    }
                }
            }
        }
    }//GEN-LAST:event_jTableBovinosMouseClicked

    private void btnListarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListarMouseClicked

        if (!txtCaravana.getText().isEmpty()) {
            actualizarTabla();
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese los datos faltantes");
        }
    }//GEN-LAST:event_btnListarMouseClicked

    private void txtCaravanaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCaravanaKeyReleased

        if (!txtCaravana.getText().isEmpty()) {
            actualizarTabla();
        } else {

        }
    }//GEN-LAST:event_txtCaravanaKeyReleased

    private void btnBuscarBovinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarBovinoMouseClicked

        frmBuscarBovino buscarBovino = new frmBuscarBovino();
        frmBuscarBovino.frm = "frmApareable";
        frmInicio.jDkPEscritorio.add(buscarBovino);
        buscarBovino.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBuscarBovinoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarBovino;
    private javax.swing.JButton btnListar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableBovinos;
    private java.awt.Label lblRCaravana;
    private javax.swing.JTextField txtCaravana;
    // End of variables declaration//GEN-END:variables
}
