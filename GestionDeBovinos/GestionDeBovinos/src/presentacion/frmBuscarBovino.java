/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import clases.Bovino;
import clases.Hembra;
import clases.Macho;
import dominio.dControladora;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nico_
 */
public class frmBuscarBovino extends javax.swing.JInternalFrame {

    public static String frm;

    /**
     * Creates new form frmBuscarBovino1
     */
    public frmBuscarBovino() {
        initComponents();

        this.setTitle("BUSCAR BOVINO");

        if (chkHembra.isSelected()) {
            actualizarTablaHembra();
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
        jTableBovinos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtBuscarCaravana = new javax.swing.JTextField();
        chkHembra = new javax.swing.JCheckBox();
        chkMacho = new javax.swing.JCheckBox();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

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
            jTableBovinos.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyReleased(java.awt.event.KeyEvent evt) {
                    jTableBovinosKeyReleased(evt);
                }
            });
            jScrollPane1.setViewportView(jTableBovinos);

            jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 580, 240));

            jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            jLabel1.setText("Caravana:");
            jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 160, -1));

            txtBuscarCaravana.addKeyListener(new java.awt.event.KeyAdapter() {
                public void keyReleased(java.awt.event.KeyEvent evt) {
                    txtBuscarCaravanaKeyReleased(evt);
                }
            });
            jPanel1.add(txtBuscarCaravana, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 210, 30));

            grupoBotones.add(chkHembra);
            chkHembra.setSelected(true);
            chkHembra.setText("Hembra");
            chkHembra.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    chkHembraMouseClicked(evt);
                }
            });
            jPanel1.add(chkHembra, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, -1));

            grupoBotones.add(chkMacho);
            chkMacho.setText("Macho");
            chkMacho.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    chkMachoMouseClicked(evt);
                }
            });
            jPanel1.add(chkMacho, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, -1, -1));

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    public void actualizarTablaMacho() {

        DefaultTableModel model = new DefaultTableModel();

        ArrayList<Bovino> listaBovino = dControladora.listarBovinos();

        model.addColumn("Nº Caravana");
        model.addColumn("Fecha Nacimiento");
        model.addColumn("Raza");
        model.addColumn("Tipo");

        for (Bovino b : listaBovino) {

            if (b.getClass().getSimpleName().toString().equals("Macho")) {

                String tipo = b.getClass().getSimpleName().toString();

                model.addRow(new Object[]{b.getCaravanaBovino(), b.getFechaNacimiento(), b.getRaza().getTipo(), tipo});

            }
        }
        jTableBovinos.setModel(model);

    }

    public void actualizarTablaHembra() {

        DefaultTableModel model = new DefaultTableModel();

        ArrayList<Bovino> listaBovino = dControladora.listarBovinos();

        model.addColumn("Nº Caravana");
        model.addColumn("Fecha Nacimiento");
        model.addColumn("Raza");
        model.addColumn("Tipo");

        for (Bovino b : listaBovino) {

            if (b.getClass().getSimpleName().toString().equals("Hembra")) {

                String tipo = b.getClass().getSimpleName().toString();

                model.addRow(new Object[]{b.getCaravanaBovino(), b.getFechaNacimiento(), b.getRaza().getTipo(), tipo});

            }
        }
        jTableBovinos.setModel(model);

    }

    public void buscarHembra(String pCaravana) {

        DefaultTableModel model = new DefaultTableModel();

        ArrayList<Hembra> listaHembra = dControladora.buscarHembrasCaravanaLIKE(pCaravana);

        model.addColumn("Nº Caravana");
        model.addColumn("Fecha Nacimiento");
        model.addColumn("Raza");
        model.addColumn("Tipo");

        for (Hembra h : listaHembra) {

            String tipo = h.getClass().getSimpleName().toString();
            model.addRow(new Object[]{h.getCaravanaBovino(), h.getFechaNacimiento(), h.getRaza().getTipo(), tipo});

        }

        jTableBovinos.setModel(model);

    }

    public void buscarMacho(String pCaravana) {

        DefaultTableModel model = new DefaultTableModel();

        ArrayList<Macho> listaMacho = dControladora.buscarMachosCaravanaLIKE(pCaravana);

        model.addColumn("Nº Caravana");
        model.addColumn("Fecha Nacimiento");
        model.addColumn("Raza");
        model.addColumn("Tipo");

        for (Macho m : listaMacho) {

            String tipo = m.getClass().getSimpleName().toString();
            model.addRow(new Object[]{m.getCaravanaBovino(), m.getFechaNacimiento(), m.getRaza().getTipo(), tipo});

        }

        jTableBovinos.setModel(model);

    }

    public static String caravana = "";
    private void jTableBovinosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableBovinosMouseClicked

        if (evt.getClickCount() == 2) {

            int fila = jTableBovinos.getSelectedRow();

            if (fila != -1) {

                caravana = jTableBovinos.getValueAt(fila, 0).toString();

                this.dispose();

                switch (frm) {
                    case "frmPadeceEnfermedad":
                        frmPadeceEnfermedad formularioPadeceEnfermedad = new frmPadeceEnfermedad();
                        frmInicio.jDkPEscritorio.add(formularioPadeceEnfermedad);
                        formularioPadeceEnfermedad.setVisible(true);
                        break;
                    case "frmModificarPadeceEnfermedad":
                        frmModificarPadeceEnfermedad.caravana = caravana;
                        frmModificarPadeceEnfermedad formularioModificarPadeceEnfermedad = new frmModificarPadeceEnfermedad();
                        frmInicio.jDkPEscritorio.add(formularioModificarPadeceEnfermedad);
                        formularioModificarPadeceEnfermedad.setVisible(true);
                        break;
                    case "frmEstadoConBovino":
                        frmEstadoConBovino formularioEstadoConBovino = new frmEstadoConBovino();
                        frmInicio.jDkPEscritorio.add(formularioEstadoConBovino);
                        formularioEstadoConBovino.setVisible(true);
                        break;
                    case "frmModificarEstadoConBovino":
                        frmModificarEstadoConBovino.caravana = caravana;
                        frmModificarEstadoConBovino formularioModificarEstadoConBovino = new frmModificarEstadoConBovino();
                        frmInicio.jDkPEscritorio.add(formularioModificarEstadoConBovino);
                        formularioModificarEstadoConBovino.setVisible(true);
                    case "frmApareable":
                        frmApareable formularioApareable = new frmApareable();
                        frmInicio.jDkPEscritorio.add(formularioApareable);
                        formularioApareable.setVisible(true);
                        break;
                    default:
                        throw new AssertionError();
                }

            } else {
                JOptionPane.showMessageDialog(null, "Error: No se selecciono el Bovino");
            }

        }
    }//GEN-LAST:event_jTableBovinosMouseClicked

    private void jTableBovinosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableBovinosKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableBovinosKeyReleased

    private void txtBuscarCaravanaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarCaravanaKeyReleased

        if (chkHembra.isSelected()) {
            buscarHembra(txtBuscarCaravana.getText());

        } else if (chkMacho.isSelected()) {
            buscarMacho(txtBuscarCaravana.getText());
        }
    }//GEN-LAST:event_txtBuscarCaravanaKeyReleased

    private void chkHembraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkHembraMouseClicked

        actualizarTablaHembra();
    }//GEN-LAST:event_chkHembraMouseClicked

    private void chkMachoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkMachoMouseClicked
        actualizarTablaMacho();
    }//GEN-LAST:event_chkMachoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chkHembra;
    private javax.swing.JCheckBox chkMacho;
    private javax.swing.ButtonGroup grupoBotones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableBovinos;
    private javax.swing.JTextField txtBuscarCaravana;
    // End of variables declaration//GEN-END:variables
}
