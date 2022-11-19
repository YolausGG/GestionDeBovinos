/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import clases.BotonesTabla;
import clases.Bovino;
import clases.Macho;
import dominio.dControladora;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmApareable extends javax.swing.JInternalFrame {

    
    public static String sexo = "";

    public static int columna, row; // Metodo para cuando hacemos click en los botones

    public frmApareable() {
        initComponents();

        this.setSize(frmInicio.jDkPEscritorio.getWidth(), frmInicio.jDkPEscritorio.getHeight());
        this.setTitle("LISTADO DE BOVINOS BUENOS PARA REPRODUCIR");

        lblRCaravana.setVisible(false);
        txtCaravana.setText(frmBuscarBovino.caravana);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBovinos = new javax.swing.JTable();
        lblRCaravana = new java.awt.Label();
        jPanel2 = new javax.swing.JPanel();
        btnListar = new javax.swing.JButton();
        txtCaravana = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
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

            lblRCaravana.setText("Requerido");
            jPanel1.add(lblRCaravana, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 90, 30));

            btnListar.setText("Listar");
            btnListar.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    btnListarMouseClicked(evt);
                }
            });

            jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            jLabel3.setText("Caravana:");

            btnBuscarBovino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar16px.png"))); // NOI18N
            btnBuscarBovino.setText("Buscar");
            btnBuscarBovino.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    btnBuscarBovinoMouseClicked(evt);
                }
            });

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(txtCaravana, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnBuscarBovino, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(543, Short.MAX_VALUE))
            );
            jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(19, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCaravana, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscarBovino, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(43, 43, 43)
                    .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(22, 22, 22))
            );

            jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 170));

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

<<<<<<< HEAD
        for (Bovino b : listaBovinosFiltroSexo) {
            
             SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String fechaNacimiento = formato.format(b.getFechaNacimiento());
=======
        if (sexo.equals("Macho")) {
            model.addColumn("Nº Caravana");
            model.addColumn("Fecha Nacimiento");
            model.addColumn("Raza");
            model.addColumn("Sexo");
            for (Bovino b : listaBovinosFiltroSexo) {
>>>>>>> 7f77656 (2 Listas y ficha andando Yolaus)

                model.addRow(new Object[]{b.getCaravanaBovino(), b.getFechaNacimiento(), b.getRaza().getTipo(), "Hembra"});

<<<<<<< HEAD
            model.addRow(new Object[]{b.getCaravanaBovino(), fechaNacimiento, b.getRaza().getTipo(), tipo, modificar, eliminar});
        }
=======
            }
        } else {
            model.addColumn("Nº Caravana");
            model.addColumn("Fecha Nacimiento");
            model.addColumn("Raza");
            model.addColumn("Sexo");
            model.addColumn("Tipo Macho");
            
            for (Bovino b : listaBovinosFiltroSexo) {
                ;
                Macho macho = (Macho) b;
                model.addRow(new Object[]{b.getCaravanaBovino(), b.getFechaNacimiento(), b.getRaza().getTipo(), "Macho", macho.getTipo()});
            }
>>>>>>> 7f77656 (2 Listas y ficha andando Yolaus)

        }
        jTableBovinos.setModel(model);
        jTableBovinos.setRowHeight(25);
    }

    private void jTableBovinosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableBovinosMouseClicked

        columna = jTableBovinos.getColumnModel().getColumnIndexAtX(evt.getX());
        row = evt.getY() / jTableBovinos.getRowHeight();
        if (columna <= jTableBovinos.getColumnCount() && columna >= 0 && row <= jTableBovinos.getRowCount() && row >= 0) {
            
            if (evt.getClickCount() == 2) {

                int fila = jTableBovinos.getSelectedRow();

                if (fila != -1) {

                    frmBovino.caravana = jTableBovinos.getValueAt(fila, 0).toString();
                    frmBovino.sexo = jTableBovinos.getValueAt(fila, 3).toString();

                    frmFichaBovino fichaBovino = new frmFichaBovino();
                    frmInicio.jDkPEscritorio.add(fichaBovino);
                    fichaBovino.setVisible(true);
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableBovinos;
    private java.awt.Label lblRCaravana;
    private javax.swing.JTextField txtCaravana;
    // End of variables declaration//GEN-END:variables
}
