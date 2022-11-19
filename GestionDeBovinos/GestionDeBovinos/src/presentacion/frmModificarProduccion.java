/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import clases.Hembra;
import clases.Produccion;
import dominio.dControladora;
import java.util.Date;
import javax.swing.JOptionPane;
import static presentacion.frmModificarProduccion.caravana;

/**
 *
 * @author nico_
 */
public class frmModificarProduccion extends javax.swing.JInternalFrame {

      public static String caravana = null;
      
    /**
     * Creates new form frmModificarProduccion1
     */
    public frmModificarProduccion() {
        initComponents();
        
        this.setSize(frmInicio.jDkPEscritorio.getWidth(), frmInicio.jDkPEscritorio.getHeight()); 
        this.setTitle("MODIFICAR PRODUCCION DE LECHE MENSUAL");
        lblRCaravanaH.setVisible(false);
        lblRFechaProduccion.setVisible(false);
        lblRPrimeraProduccion.setVisible(false);
        lblRSegundaProduccion.setVisible(false);
        lblRProteinas.setVisible(false);
        lblRGrasas.setVisible(false);
        lblRCelulasSomaticas.setVisible(false);
        
        Produccion produccion = dControladora.buscarProduccion(frmProduccion.idProduccion);
        
        if(caravana != null){
            txtModificarCaravanaH.setText(caravana);
        }else{
            txtModificarCaravanaH.setText(produccion.getHembra().getCaravanaBovino());
        }
        jDateModificarFechaP.setDate(produccion.getFecha());
        txtModificarPrimeraP.setText(produccion.getPrimeraProduccion().toString());
        txtModificarSegundaP.setText(produccion.getSegundaProduccion().toString());
        txtModificarProteinas.setText(produccion.getProteina().toString());
        txtModificarGrasas.setText(produccion.getGrasa().toString());
        txtModificarCS.setText(Integer.toString(produccion.getCelulaSomatica()));
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
        jLabel1 = new javax.swing.JLabel();
        txtModificarSegundaP = new javax.swing.JTextField();
        jDateModificarFechaP = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        btnModificarProduccion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtModificarCaravanaH = new javax.swing.JTextField();
        txtModificarGrasas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtModificarPrimeraP = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtModificarCS = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtModificarProteinas = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lblRCelulasSomaticas = new javax.swing.JLabel();
        lblRCaravanaH = new javax.swing.JLabel();
        lblRFechaProduccion = new javax.swing.JLabel();
        lblRPrimeraProduccion = new javax.swing.JLabel();
        lblRSegundaProduccion = new javax.swing.JLabel();
        lblRGrasas = new javax.swing.JLabel();
        lblRProteinas = new javax.swing.JLabel();
        btnBuscarBovino = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Segunda Produccion (lts):");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 160, -1));
        jPanel1.add(txtModificarSegundaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 100, 30));
        jPanel1.add(jDateModificarFechaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 160, 30));

        jLabel4.setText("Fecha Produccion:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, -1, -1));

        btnModificarProduccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Modificar16px.png"))); // NOI18N
        btnModificarProduccion.setText("Modificar");
        btnModificarProduccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarProduccionMouseClicked(evt);
            }
        });
        jPanel1.add(btnModificarProduccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, -1, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Caravana:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 160, -1));
        jPanel1.add(txtModificarCaravanaH, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 120, 30));
        jPanel1.add(txtModificarGrasas, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 100, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Grasas:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 160, -1));
        jPanel1.add(txtModificarPrimeraP, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 100, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Primera Produccion (lts):");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 160, -1));
        jPanel1.add(txtModificarCS, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 100, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Celulas Somaticas:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 160, -1));
        jPanel1.add(txtModificarProteinas, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 100, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Proteinas:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 160, -1));

        lblRCelulasSomaticas.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblRCelulasSomaticas.setForeground(new java.awt.Color(0, 0, 0));
        lblRCelulasSomaticas.setText("Requerido");
        jPanel1.add(lblRCelulasSomaticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, -1, -1));

        lblRCaravanaH.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblRCaravanaH.setForeground(new java.awt.Color(0, 0, 0));
        lblRCaravanaH.setText("Requerido");
        jPanel1.add(lblRCaravanaH, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        lblRFechaProduccion.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblRFechaProduccion.setForeground(new java.awt.Color(0, 0, 0));
        lblRFechaProduccion.setText("Requerido");
        jPanel1.add(lblRFechaProduccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, -1, -1));

        lblRPrimeraProduccion.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblRPrimeraProduccion.setForeground(new java.awt.Color(0, 0, 0));
        lblRPrimeraProduccion.setText("Requerido");
        jPanel1.add(lblRPrimeraProduccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, -1));

        lblRSegundaProduccion.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblRSegundaProduccion.setForeground(new java.awt.Color(0, 0, 0));
        lblRSegundaProduccion.setText("Requerido");
        jPanel1.add(lblRSegundaProduccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, -1, -1));

        lblRGrasas.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblRGrasas.setForeground(new java.awt.Color(0, 0, 0));
        lblRGrasas.setText("Requerido");
        jPanel1.add(lblRGrasas, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, -1, -1));

        lblRProteinas.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblRProteinas.setForeground(new java.awt.Color(0, 0, 0));
        lblRProteinas.setText("Requerido");
        jPanel1.add(lblRProteinas, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, -1, -1));

        btnBuscarBovino.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar16px.png"))); // NOI18N
        btnBuscarBovino.setText("Buscar");
        btnBuscarBovino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarBovinoMouseClicked(evt);
            }
        });
        jPanel1.add(btnBuscarBovino, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
                .addGap(16, 16, 16))
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
        if (txtModificarCaravanaH.getText().equals("")){lblRCaravanaH.setVisible(true);contador++;} else {lblRCaravanaH.setVisible(false);}
        if (jDateModificarFechaP.getDate() == null){lblRFechaProduccion.setVisible(true);contador++;} else{lblRFechaProduccion.setVisible(false);}
        if (txtModificarPrimeraP.getText().equals("")){lblRPrimeraProduccion.setVisible(true); contador++;}else{lblRPrimeraProduccion.setVisible(false);}
        if (txtModificarSegundaP.getText().equals("")){lblRSegundaProduccion.setVisible(true);contador++;} else{lblRSegundaProduccion.setVisible(false);}
        if (txtModificarProteinas.getText().equals("")){lblRProteinas.setVisible(true);contador++;} else{lblRProteinas.setVisible(false);}
        if (txtModificarGrasas.getText().equals("")){lblRGrasas.setVisible(true);contador++;} else{lblRGrasas.setVisible(false);}
        if (txtModificarCS.getText().equals("")){lblRCelulasSomaticas.setVisible(true);contador++;} else{lblRCelulasSomaticas.setVisible(false);}

        if (contador < 1) {
            return true;
        } else {
            return false;
        }
    }
    
    public void limpiarCajas() {

        txtModificarCaravanaH.setText(null);
        txtModificarSegundaP.setText(null);
        jDateModificarFechaP.setDate(null);
        txtModificarPrimeraP.setText(null);
        txtModificarSegundaP.setText(null);
        txtModificarProteinas.setText(null);
        txtModificarGrasas.setText(null);
        txtModificarCS.setText(null);

    }
    
    private void btnModificarProduccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarProduccionMouseClicked

        if(validarCampos()){
            Produccion produccion = dControladora.buscarProduccion(frmProduccion.idProduccion);

            String carvana = txtModificarCaravanaH.getText();
            Hembra hembra = dControladora.buscarHembraPorCaravana(carvana);
            Date fecha  = jDateModificarFechaP.getDate();
            Double primeraP = Double.parseDouble(txtModificarPrimeraP.getText());
            Double segundaP = Double.parseDouble(txtModificarSegundaP.getText());
            Double proteinas = Double.parseDouble(txtModificarProteinas.getText());
            Double grasas = Double.parseDouble(txtModificarGrasas.getText());
            int celulasSomaticas = Integer.parseInt(txtModificarCS.getText());

            Produccion produccionNueva = new Produccion(produccion.getIdProduccion(),primeraP,segundaP,produccion.getProduccionTotal(),proteinas,grasas,celulasSomaticas,fecha,hembra);

            try {

                if (dControladora.modificarProduccion(produccionNueva)) {

                    JOptionPane.showMessageDialog(null, "Producción Modificada Correctamente");
                    caravana = null;
                    limpiarCajas(); // Limpiamos Caja de Texto

                    this.dispose();
                    frmProduccion nuevoFormulario = new frmProduccion();
                     frmInicio.jDkPEscritorio.add(nuevoFormulario);
                    nuevoFormulario.setVisible(true);                 

                } else {
                    JOptionPane.showMessageDialog(null, "Error: No se pudo Modificar la Producción");
                }
            } catch (Exception e) {
                throw e;
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Ingrese los datos faltantes");
        }

    }//GEN-LAST:event_btnModificarProduccionMouseClicked

    private void btnBuscarBovinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarBovinoMouseClicked

        frmBuscarHembra buscarHembra = new frmBuscarHembra();
        frmBuscarHembra.frm = "frmModificarProduccion";
        buscarHembra.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBuscarBovinoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarBovino;
    private javax.swing.JButton btnModificarProduccion;
    private com.toedter.calendar.JDateChooser jDateModificarFechaP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblRCaravanaH;
    private javax.swing.JLabel lblRCelulasSomaticas;
    private javax.swing.JLabel lblRFechaProduccion;
    private javax.swing.JLabel lblRGrasas;
    private javax.swing.JLabel lblRPrimeraProduccion;
    private javax.swing.JLabel lblRProteinas;
    private javax.swing.JLabel lblRSegundaProduccion;
    private javax.swing.JTextField txtModificarCS;
    private javax.swing.JTextField txtModificarCaravanaH;
    private javax.swing.JTextField txtModificarGrasas;
    private javax.swing.JTextField txtModificarPrimeraP;
    private javax.swing.JTextField txtModificarProteinas;
    private javax.swing.JTextField txtModificarSegundaP;
    // End of variables declaration//GEN-END:variables
}
