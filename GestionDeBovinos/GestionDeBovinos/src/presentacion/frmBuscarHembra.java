/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import clases.Hembra;
import dominio.dControladora;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nico_
 */
public class frmBuscarHembra extends javax.swing.JInternalFrame {

    public static String frm;

    /**
     * Creates new form frmBuscarHembra1
     */
    public frmBuscarHembra() {
        initComponents();
        
        this.setSize(frmInicio.jDkPEscritorio.getWidth(), frmInicio.jDkPEscritorio.getHeight());
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableHembras = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtBuscarCaravana = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

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
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    public void actualizarTabla() {

        DefaultTableModel model = new DefaultTableModel();

        ArrayList<Hembra> listaHembras = dControladora.listarHembras();

        model.addColumn("Nº Caravana");
        model.addColumn("Fecha Nacimiento");
        model.addColumn("Raza");

        for (Hembra h : listaHembras) {
            
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String fechaNacimientoH = formato.format(h.getFechaNacimiento());
            
            model.addRow(new Object[]{h.getCaravanaBovino(), fechaNacimientoH, h.getRaza().getTipo()});

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
            
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String fechaNacimientoH = formato.format(h.getFechaNacimiento());
            
            model.addRow(new Object[]{h.getCaravanaBovino(), fechaNacimientoH, h.getRaza().getTipo()});

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
                    case "frmProduccion":
                        frmProduccion formularioProduccion = new frmProduccion();
                        frmInicio.jDkPEscritorio.add(formularioProduccion);
                        formularioProduccion.setVisible(true);
                        break;
                    case "frmCelo":
                        frmCelo formularioCelo = new frmCelo();
                        frmInicio.jDkPEscritorio.add(formularioCelo);
                        formularioCelo.setVisible(true);
                        break;
                    case "frmAborto":
                        frmAborto formularioAborto = new frmAborto();
                        frmInicio.jDkPEscritorio.add(formularioAborto);
                        formularioAborto.setVisible(true);
                        break;
                    case "frmParto":
                        frmParto formularioParto = new frmParto();
                        frmInicio.jDkPEscritorio.add(formularioParto);
                        formularioParto.setVisible(true);
                        break;
                    case "frmSecado":
                        frmSecado formularioSecado = new frmSecado();
                        frmInicio.jDkPEscritorio.add(formularioSecado);
                        formularioSecado.setVisible(true);
                        break;
                    case "frmTacto":
                        frmTacto formularioTacto = new frmTacto();
                        frmInicio.jDkPEscritorio.add(formularioTacto);
                        formularioTacto.setVisible(true);
                        break;
                    case "frmInseminacion":
                        frmInseminacion formularioInseminacion = new frmInseminacion();
                        frmInicio.jDkPEscritorio.add(formularioInseminacion);
                        formularioInseminacion.setVisible(true);
                        break;
                    case "frmEventoFuturo":
                        frmEventoFuturo formularioEventoFuturo = new frmEventoFuturo();
                        frmInicio.jDkPEscritorio.add(formularioEventoFuturo);
                        formularioEventoFuturo.setVisible(true);
                        break;
                    case "frmListaProduccion":
                        frmListaProduccion formularioListaProduccion = new frmListaProduccion();
                        frmInicio.jDkPEscritorio.add(formularioListaProduccion);
                        formularioListaProduccion.setVisible(true);
                        break;
                    case "frmListaEventosDeSanidad":
                        frmListaEventosDeSanidad formularioListaEventosDeSanidad = new frmListaEventosDeSanidad();
                        frmInicio.jDkPEscritorio.add(formularioListaEventosDeSanidad);
                        formularioListaEventosDeSanidad.setVisible(true);
                        break;
                    case "frmListaEventosFuturos":
                        frmListaEventosFuturos frmListaEventosFuturos = new frmListaEventosFuturos();
                        frmInicio.jDkPEscritorio.add(frmListaEventosFuturos);
                        frmListaEventosFuturos.setVisible(true);
                        break;
                    case "frmModificarProduccion":
                        frmModificarProduccion.caravana = caravana;
                        frmModificarProduccion formularioModificarProduccion = new frmModificarProduccion();
                        frmInicio.jDkPEscritorio.add(formularioModificarProduccion);
                        formularioModificarProduccion.setVisible(true);
                        break;
                    case "frmModificarCelo":
                        frmModificarCelo.caravana = caravana;
                        frmModificarCelo formularioModificarCelo = new frmModificarCelo();
                        frmInicio.jDkPEscritorio.add(formularioModificarCelo);
                        formularioModificarCelo.setVisible(true);
                        break;
                    case "frmModificarAborto":
                        frmModificarAborto.caravana = caravana;
                        frmModificarAborto formularioModificarAborto = new frmModificarAborto();
                        frmInicio.jDkPEscritorio.add(formularioModificarAborto);
                        formularioModificarAborto.setVisible(true);
                        break;
                    case "frmModificarSecado":
                        frmModificarSecado.caravana = caravana;
                        frmModificarSecado formularioModificarSecado = new frmModificarSecado();
                        frmInicio.jDkPEscritorio.add(formularioModificarSecado);
                        formularioModificarSecado.setVisible(true);
                        break;
                    case "frmModificarParto":
                        frmModificarParto.caravana = caravana;
                        frmModificarParto formularioModificarParto = new frmModificarParto();
                        frmInicio.jDkPEscritorio.add(formularioModificarParto);
                        formularioModificarParto.setVisible(true);
                        break;
                    case "frmModificarTacto":
                        frmModificarTacto.caravana = caravana;
                        frmModificarTacto formularioModificarTacto = new frmModificarTacto();
                        frmInicio.jDkPEscritorio.add(formularioModificarTacto);
                        formularioModificarTacto.setVisible(true);
                        break;
                    case "frmModificarInseminacion":
                        frmModificarInseminacion.caravanaHembra = caravana;
                        frmModificarInseminacion formularioModificarInseminacion = new frmModificarInseminacion();
                        frmInicio.jDkPEscritorio.add(formularioModificarInseminacion);
                        formularioModificarInseminacion.setVisible(true);
                        break;
                    case "frmModificarEventoFuturo":
                        frmModificarEventoFuturo.caravana = caravana;
                        frmModificarEventoFuturo formularioModificarEventoFuturo = new frmModificarEventoFuturo();
                        frmInicio.jDkPEscritorio.add(formularioModificarEventoFuturo);
                        formularioModificarEventoFuturo.setVisible(true);
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableHembras;
    private javax.swing.JTextField txtBuscarCaravana;
    // End of variables declaration//GEN-END:variables
}
