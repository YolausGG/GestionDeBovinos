/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import clases.Bovino;
import clases.Hembra;
import dominio.dControladora;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author nico_
 */

public class frmBuscarHembra extends javax.swing.JFrame {
    
    
    public static String frm;

    public frmBuscarHembra() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH); // Maximisa la ventana 
        this.setTitle("BUSCAR HEMBRAS");
        actualizarTabla();

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
        jTableHembras = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtBuscarCaravana = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableHembras = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column){
                return false;
            }};
            jTableHembras.setModel(new javax.swing.table.DefaultTableModel(
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
            jTableHembras.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jTableHembrasMouseClicked(evt);
                }
            });
            jScrollPane1.setViewportView(jTableHembras);

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

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    public void actualizarTabla() {

        DefaultTableModel model = new DefaultTableModel();

        ArrayList<Bovino> listaBovino = dControladora.listarBovinos();

        model.addColumn("Nº Caravana");
        model.addColumn("Fecha Nacimiento");
        model.addColumn("Raza");

        for (Bovino b : listaBovino) {

            if (b.getClass().getSimpleName().toString().equals("Hembra")) {
                model.addRow(new Object[]{b.getCaravanaBovino(), b.getFechaNacimiento(), b.getRaza().getTipo()});

            }
        }
        jTableHembras.setModel(model);
        
    }

    public void buscarHembra(String pCaravana) {

        DefaultTableModel model = new DefaultTableModel();

        ArrayList<Hembra> listaHembra = dControladora.buscarHembrasCaravanaLIKE(pCaravana);

        model.addColumn("Nº Caravana");
        model.addColumn("Fecha Nacimiento");
        model.addColumn("Raza");

        for (Hembra h : listaHembra) {
            
            model.addRow(new Object[]{h.getCaravanaBovino(), h.getFechaNacimiento(), h.getRaza().getTipo()});
           
        }

        jTableHembras.setModel(model);

    }

    public static String caravana = "";

    private void jTableHembrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableHembrasMouseClicked

        if (evt.getClickCount() == 2) {

            int fila = jTableHembras.getSelectedRow();

            if (fila != -1) {

                caravana = jTableHembras.getValueAt(fila, 0).toString();

                this.dispose();
                
                switch (frm) {
                    case "frmCelo":
                        frmCelo formularioCelo = new frmCelo();
                        formularioCelo.setVisible(true);
                        break;
                    case "frmProduccion":
                        frmProduccion formularioProduccion = new frmProduccion();
                        formularioProduccion.setVisible(true);
                        break;
                    case "frmModificarProduccion":
                        frmModificarProduccion.caravana = caravana;
                        frmModificarProduccion formularioModificarProduccion = new frmModificarProduccion();
                        formularioModificarProduccion.setVisible(true);
                        break;    
                    case "frmModificarCelo":
                        frmModificarCelo.caravana = caravana;
                        frmModificarCelo formularioModificarCelo = new frmModificarCelo();
                        formularioModificarCelo.setVisible(true);                        
                        break;
                    default:
                        throw new AssertionError();
                }
                
                
            } else {
                JOptionPane.showMessageDialog(null, "Error: No se selecciono la Hembra");
            }

        }
    }//GEN-LAST:event_jTableHembrasMouseClicked

    private void txtBuscarCaravanaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarCaravanaKeyReleased

        buscarHembra(txtBuscarCaravana.getText());
    }//GEN-LAST:event_txtBuscarCaravanaKeyReleased


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
            java.util.logging.Logger.getLogger(frmBuscarHembra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmBuscarHembra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmBuscarHembra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmBuscarHembra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new frmBuscarHembra().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup grupoBotones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableHembras;
    private javax.swing.JTextField txtBuscarCaravana;
    // End of variables declaration//GEN-END:variables
}