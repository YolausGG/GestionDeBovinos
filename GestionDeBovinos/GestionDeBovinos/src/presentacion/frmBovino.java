/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import clases.BotonesTabla;
import clases.Bovino;
import clases.Hembra;
import clases.Macho;
import clases.Pedigree;
import clases.Raza;
import dominio.dControladora;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import persistencia.pRaza;

/**
 *
 * @author nico_
 */

public class frmBovino extends javax.swing.JFrame {

    JButton modificar = new JButton("Modificar"); // Creamos los botones para la tabla
    JButton eliminar = new JButton("Eliminar");
    public static String caravana = "";
    public static String sexo = "";
    
    public static frmBovino frmBovino1 = null;
    
    public static int columna, row; // Metodo para cuando hacemos click en los botones
    
    public frmBovino() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH); // Maximisa la ventana 
        this.setTitle("BOVINOS");
        llenarComboRaza();        
        grupoBotones.add(chkHembra);
        grupoBotones.add(chkMacho);
        lblTipo.setVisible(false);
        cboTipo.setVisible(false);
        lblRCaravana.setVisible(false);
        lblRFechaNacimiento.setVisible(false);
        lblRRaza.setVisible(false);
        lblRTipoMacho.setVisible(false);
        lblRNumeroPedigree.setVisible(false);
        lblNumeroPedigree.setVisible(false);
        txtNumeroPedigree.setVisible(false);
        llenarComboPadre();
        llenarComboMadre();
        // dControladora.cargarBovinos();
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

        grupoBotones = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBovinos = new javax.swing.JTable();
        lblNumeroPedigree = new javax.swing.JLabel();
        txtNumeroPedigree = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        jDateFechaNacimiento = new com.toedter.calendar.JDateChooser();
        chkHembra = new javax.swing.JCheckBox();
        chkMacho = new javax.swing.JCheckBox();
        cboPadre = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cboMadre = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cboTipo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboRaza = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        lblRFechaNacimiento = new java.awt.Label();
        lblRRaza = new java.awt.Label();
        lblRNumeroPedigree = new java.awt.Label();
        lblRCaravana = new java.awt.Label();
        chkPedigree = new javax.swing.JCheckBox();
        txtCaravana = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblRTipoMacho = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

            jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 730, 260));

            lblNumeroPedigree.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            lblNumeroPedigree.setText("Número de Pedigree por ARU:");
            jPanel1.add(lblNumeroPedigree, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 210, -1));
            jPanel1.add(txtNumeroPedigree, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 210, 30));

            lblTipo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            lblTipo.setText("Tipo:");
            jPanel1.add(lblTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, -1));
            jPanel1.add(jDateFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 210, 30));

            grupoBotones.add(chkHembra);
            chkHembra.setText("Hembra");
            chkHembra.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    chkHembraMouseClicked(evt);
                }
            });
            jPanel1.add(chkHembra, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

            grupoBotones.add(chkMacho);
            chkMacho.setText("Macho");
            chkMacho.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    chkMachoMouseClicked(evt);
                }
            });
            jPanel1.add(chkMacho, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, -1, -1));

            cboPadre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
            jPanel1.add(cboPadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 220, 30));

            jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            jLabel4.setText("Fecha Nacimiento:");
            jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

            cboMadre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
            jPanel1.add(cboMadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 70, 220, 30));

            jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            jLabel5.setText("Padre:");
            jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, -1, -1));

            cboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "En Pie", "Congelado" }));
            jPanel1.add(cboTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 210, 30));

            jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            jLabel6.setText("Madre:");
            jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 40, -1, -1));

            jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            jLabel2.setText("Raza:");
            jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 40, -1));

            cboRaza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
            jPanel1.add(cboRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 210, 30));

            btnAgregar.setText("Agregar");
            btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    btnAgregarMouseClicked(evt);
                }
            });
            jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, -1, -1));

            lblRFechaNacimiento.setText("Requerido");
            jPanel1.add(lblRFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 90, 30));

            lblRRaza.setText("Requerido");
            jPanel1.add(lblRRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 90, 30));

            lblRNumeroPedigree.setText("Requerido");
            jPanel1.add(lblRNumeroPedigree, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 340, 90, 30));

            lblRCaravana.setText("Requerido");
            jPanel1.add(lblRCaravana, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 90, 30));

            chkPedigree.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            chkPedigree.setText("Pedigree");
            chkPedigree.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    chkPedigreeMouseClicked(evt);
                }
            });
            chkPedigree.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    chkPedigreeActionPerformed(evt);
                }
            });
            jPanel1.add(chkPedigree, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, -1, 30));
            jPanel1.add(txtCaravana, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 210, 30));

            jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            jLabel3.setText("Caravana:");
            jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 160, -1));

            lblRTipoMacho.setText("Requerido");
            jPanel1.add(lblRTipoMacho, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 90, 30));

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    public boolean validarCampos(){
        
        int contador = 0;
        if(txtCaravana.getText().equals("")){ lblRCaravana.setVisible(true); contador++;} else { lblRCaravana.setVisible(false);}
        if(jDateFechaNacimiento.getDate() == null ){ lblRFechaNacimiento.setVisible(true); contador++;} else { lblRFechaNacimiento.setVisible(false);}
        if(cboRaza.getSelectedIndex() == 0){ lblRRaza.setVisible(true); contador++;} else { lblRRaza.setVisible(false);}
        if(cboTipo.getSelectedIndex() == 0 && chkMacho.isSelected()){ lblRTipoMacho.setVisible(true); contador++;} else { lblRTipoMacho.setVisible(false);}
        if(txtNumeroPedigree.getText().equals("") && chkPedigree.isSelected()){ lblRNumeroPedigree.setVisible(true); contador++;} else { lblRNumeroPedigree.setVisible(false);}
        
        if(contador < 1){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void limpiarCajas() {

        txtCaravana.setText(null);
        jDateFechaNacimiento.setDate(null);
        chkHembra.setSelected(false);
        chkMacho.setSelected(false);
        cboRaza.setSelectedIndex(0);
        cboTipo.setSelectedIndex(0);
        cboPadre.setSelectedIndex(0);
        cboMadre.setSelectedIndex(0);
        chkPedigree.setSelected(false);
        txtNumeroPedigree.setText(null);
    }

    private void llenarComboRaza() {

        ArrayList<Raza> listaRazas = pRaza.buscarRazas();

        for (Raza raza : listaRazas) {

            cboRaza.addItem(raza);
        }

    }

    private void llenarComboPadre() {

        ArrayList<Macho> listaMachos = dControladora.listarMachos();
        
        int total = cboPadre.getItemCount();
        
        if(cboPadre.getItemCount()>1){
            for (int i = 0; i < total-1; i++) {
                cboPadre.removeItemAt(1);
            } 
            
        }
        
        for (Macho macho : listaMachos) {

            cboPadre.addItem(macho);

        }

    }

    private void llenarComboMadre() {

        ArrayList<Hembra> listaHembras = dControladora.listarHembras();
        
        int total = cboMadre.getItemCount();
        
        if(cboMadre.getItemCount()>1){
            for (int i = 0; i < total-1; i++) {
                cboMadre.removeItemAt(1);
            } 
            
        }

        for (Hembra hembra : listaHembras) {
            cboMadre.addItem(hembra);
        }

    }

    public void actualizarTabla() {
        jTableBovinos.setDefaultRenderer(Object.class, new BotonesTabla());
        DefaultTableModel model = new DefaultTableModel();
        
        ArrayList<Bovino> listaBovino = dControladora.listarBovinos();
        
        model.addColumn("Nº Caravana");
        model.addColumn("Fecha Nacimiento");
        model.addColumn("Raza");
        model.addColumn("Sexo");
        model.addColumn("Modificar ");
        model.addColumn("Eliminar ");

        for (Bovino b : listaBovino) {
            
            String tipo = b.getClass().getSimpleName().toString().equals("Macho") ? "Macho" : "Hembra";
            
            model.addRow(new Object[]{b.getCaravanaBovino(), b.getFechaNacimiento(), b.getRaza().getTipo(),tipo, modificar, eliminar});
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
                        modificarBovino.setVisible(true); // Abre el formulario de Modificar la Enfermedad
                        
                    } else {
                        JOptionPane.showMessageDialog(null, "Error: No se selecciono el Bovino a modificar");
                    }
                } else {
                    if (botones.getName().equals("btnEliminar")) {

                        int fila = jTableBovinos.getSelectedRow();
                        
                        String caravana = jTableBovinos.getValueAt(fila, 0).toString();
                        
                        frmBovino.caravana = caravana;
                       
                        frmBajaLogica formularioBajaLogica = new frmBajaLogica();
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

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked

        if(validarCampos()){
            
            String caravana = txtCaravana.getText();
            Date fechaNacimiento = jDateFechaNacimiento.getDate();
            Raza raza = (Raza) cboRaza.getSelectedItem();
            
            String numeroPredigree = null;
            
            if(!txtNumeroPedigree.getText().equals("")){
                numeroPredigree = txtNumeroPedigree.getText();
            }

            Macho padre = null;
            Hembra madre = null;

            if (cboPadre.getSelectedIndex() > 0) {
                padre = (Macho) cboPadre.getSelectedItem();
            }
            if (cboMadre.getSelectedIndex() > 0) {

                madre = (Hembra) cboMadre.getSelectedItem();
            }

            try {

                if (chkMacho.isSelected()) {
                    String tipo = cboTipo.getSelectedItem().toString();
                    
                    Bovino bovino = new Bovino(caravana, fechaNacimiento, madre, padre, raza);

                    if(dControladora.altaBovino(bovino)){

                        Bovino bovinoRecienIngresado =  dControladora.buscarBovinoCaravana(caravana);
                        Macho macho = new Macho(bovinoRecienIngresado.getIdBovino(), caravana, fechaNacimiento, raza, tipo);

                        if(dControladora.altaMacho(macho)){
                            
                            if(chkPedigree.isSelected()){
                                
                                Pedigree pedigree = new Pedigree(macho, numeroPredigree);
                                if(dControladora.altaPedigree(pedigree)){
                                    JOptionPane.showMessageDialog(null, "Macho Pedigree Ingresado Correctamente");
                                    actualizarTabla();
                                    llenarComboPadre();
                                    limpiarCajas(); // Limpiamos Caja de Texto
                                }
                            }else{
                                JOptionPane.showMessageDialog(null, "Macho Ingresado Correctamente");

                                actualizarTabla();
                                llenarComboPadre();
                                limpiarCajas(); // Limpiamos Caja de Texto
                            }
                        }else{
                            JOptionPane.showMessageDialog(null, "Error: No se pudo agregar el Macho");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Error: No se pudo agregar el Bovino");
                    }
                } else if (chkHembra.isSelected()) {

                    Bovino bovino = new Bovino(caravana, fechaNacimiento, madre, padre, raza);

                    if(dControladora.altaBovino(bovino)){

                        Bovino bovinoRecienIngresado =  dControladora.buscarBovinoCaravana(caravana);
                        Hembra hembra = new Hembra(bovinoRecienIngresado.getIdBovino(), caravana, fechaNacimiento, raza, madre, padre);

                        if(dControladora.altaHembra(hembra)){
                            
                            if(chkPedigree.isSelected()){
                                
                                Pedigree pedigree = new Pedigree(hembra, numeroPredigree);
                                if(dControladora.altaPedigree(pedigree)){
                                    JOptionPane.showMessageDialog(null, "Hembra Pedigree Ingresada Correctamente");
                                    actualizarTabla();
                                    llenarComboMadre();
                                    limpiarCajas(); // Limpiamos Caja de Texto
                                }
                            }else{
                                JOptionPane.showMessageDialog(null, "Hembra Ingresada Correctamente");
                                actualizarTabla();
                                llenarComboMadre();
                                limpiarCajas(); // Limpiamos Caja de Texto
                            }
                        }else{
                            JOptionPane.showMessageDialog(null, "Error: No se pudo agregar la Hembra");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Error: No se pudo agregar el Bovino");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Seleccione el sexo del Bovino");
                }

            } catch (Exception e) {
                throw e;
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Ingrese los datos faltantes");
        }
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void chkHembraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkHembraMouseClicked

        lblTipo.setVisible(false);
        cboTipo.setVisible(false);
        lblRTipoMacho.setVisible(false);

    }//GEN-LAST:event_chkHembraMouseClicked

    private void chkMachoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkMachoMouseClicked

        lblTipo.setVisible(true);
        cboTipo.setVisible(true);
    }//GEN-LAST:event_chkMachoMouseClicked

    private void chkPedigreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPedigreeActionPerformed
        
        if(chkPedigree.isSelected()){
            lblNumeroPedigree.setVisible(true);
            txtNumeroPedigree.setVisible(true);
        }
        else{            
            lblNumeroPedigree.setVisible(false);
            txtNumeroPedigree.setVisible(false);
            lblRNumeroPedigree.setVisible(false);
        }
        
    }//GEN-LAST:event_chkPedigreeActionPerformed

    private void chkPedigreeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkPedigreeMouseClicked
        
        
    }//GEN-LAST:event_chkPedigreeMouseClicked

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
            java.util.logging.Logger.getLogger(frmBovino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmBovino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmBovino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmBovino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmBovino().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JComboBox<Object> cboMadre;
    private javax.swing.JComboBox<Object> cboPadre;
    private javax.swing.JComboBox<Object> cboRaza;
    private javax.swing.JComboBox<String> cboTipo;
    private javax.swing.JCheckBox chkHembra;
    private javax.swing.JCheckBox chkMacho;
    private javax.swing.JCheckBox chkPedigree;
    private javax.swing.ButtonGroup grupoBotones;
    private com.toedter.calendar.JDateChooser jDateFechaNacimiento;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableBovinos;
    private javax.swing.JLabel lblNumeroPedigree;
    private java.awt.Label lblRCaravana;
    private java.awt.Label lblRFechaNacimiento;
    private java.awt.Label lblRNumeroPedigree;
    private java.awt.Label lblRRaza;
    private java.awt.Label lblRTipoMacho;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JTextField txtCaravana;
    private javax.swing.JTextField txtNumeroPedigree;
    // End of variables declaration//GEN-END:variables
}
