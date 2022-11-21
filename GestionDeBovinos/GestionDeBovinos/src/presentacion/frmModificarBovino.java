/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import clases.Bovino;
import clases.Hembra;
import clases.Macho;
import clases.Pedigree;
import clases.Raza;
import dominio.dControladora;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import persistencia.pHembra;
import persistencia.pMacho;
import persistencia.pRaza;
import static presentacion.frmFichaBovino.lblFotoBovino;
import static presentacion.frmModificarBovino.hembra;
import static presentacion.frmModificarBovino.macho;

/**
 *
 * @author nico_
 */
public class frmModificarBovino extends javax.swing.JInternalFrame {

    public static Macho macho = null;
    public static Hembra hembra = null;

    /**
     * Creates new form frmModificarBovino1
     */
    public frmModificarBovino() {
        initComponents();

        this.setSize(frmInicio.jDkPEscritorio.getWidth(), frmInicio.jDkPEscritorio.getHeight());
        this.setTitle("MODIFICAR BOVINOS");
        llenarComboRaza();
        grupoBotones.add(chkHembra);
        grupoBotones.add(chkMacho);
        lblTipo.setVisible(false);
        cboTipo.setVisible(false);
        lblRCaravana.setVisible(false);
        lblRFechaNacimiento.setVisible(false);
        lblRRaza.setVisible(false);
        lblRTipoMacho.setVisible(false);
        lblNumeroPedigree.setVisible(false);
        txtNumeroPedigree.setVisible(false);
        lblRNumeroPedigree.setVisible(false);

        if (frmBovino.sexo.equals("Macho")) {

            macho = dControladora.buscarMachoPorCaravana(frmBovino.caravana);

            ArrayList<Bovino> padres = dControladora.buscarPadres(macho.getIdBovino());

            if (padres.size() > 0) {
                for (Bovino padre : padres) {

                    if (padre.getClass().getSimpleName().toString().equals("Macho")) {
                        macho.setPadre((Macho) padre);
                    } else {
                        macho.setMadre((Hembra) padre);
                    }
                }
            }

            chkMacho.setSelected(true);
            cboTipo.setVisible(true);
            cboTipo.setSelectedItem(macho.getTipo());

            cboRaza.getModel().setSelectedItem(macho.getRaza());
            cboRaza.setSelectedItem(macho.getRaza());

            txtModificarCaravana.setText(macho.getCaravanaBovino());
            jDateFechaNacimiento.setDate(macho.getFechaNacimiento());

            try {
                byte[] bi = macho.getFoto();
                BufferedImage image = null;
                InputStream in = new ByteArrayInputStream(bi);
                image = ImageIO.read(in);
                ImageIcon imgi = new ImageIcon(image.getScaledInstance(150, 150, Image.SCALE_DEFAULT));
                lblFotoBovino.setIcon(imgi);

            } catch (Exception ex) {
                lblFotoBovino.setText("Sin foto");
            }

            Pedigree pedigreeMacho = dControladora.buscarPedigreeIdBovino(macho.getIdBovino());

            if (pedigreeMacho != null) {

                chkPedigree.setSelected(true);
                lblNumeroPedigree.setVisible(true);
                txtNumeroPedigree.setVisible(true);
                txtNumeroPedigree.setText(pedigreeMacho.getNumeroPedigree());

            }

            for (Bovino padre : padres) {

                if (padre.getClass().getSimpleName().toString().equals("Macho") && padre != null) {

                    cboPadre.getModel().setSelectedItem(padre.getCaravanaBovino());
                }
                if (padre.getClass().getSimpleName().toString().equals("Hembra") && padre != null) {

                    cboMadre.getModel().setSelectedItem(padre.getCaravanaBovino());
                }
            }

        } else {

            chkHembra.setSelected(true);

            hembra = dControladora.buscarHembraPorCaravana(frmBovino.caravana);

            ArrayList<Bovino> padresH = dControladora.buscarPadres(hembra.getIdBovino());

            if (padresH.size() > 0) {
                for (Bovino padreH : padresH) {

                    if (padreH.getClass().getSimpleName().toString().equals("Macho")) {
                        hembra.setPadre((Macho) padreH);
                    } else {
                        hembra.setMadre((Hembra) padreH);
                    }
                }
            }

            txtModificarCaravana.setText(hembra.getCaravanaBovino());
            jDateFechaNacimiento.setDate(hembra.getFechaNacimiento());
            cboRaza.getModel().setSelectedItem(hembra.getRaza());
            cboRaza.setSelectedItem(hembra.getRaza());

            Pedigree pedigreeHembra = dControladora.buscarPedigreeIdBovino(hembra.getIdBovino());

            if (pedigreeHembra != null) {

                chkPedigree.setSelected(true);
                lblNumeroPedigree.setVisible(true);
                txtNumeroPedigree.setVisible(true);
                txtNumeroPedigree.setText(pedigreeHembra.getNumeroPedigree());

            }

            for (Bovino padre : padresH) {

                if (padre.getClass().getSimpleName().toString().equals("Macho") && padre != null) {

                    cboPadre.getModel().setSelectedItem(padre.getCaravanaBovino());
                }

                if (padre.getClass().getSimpleName().toString().equals("Hembra") && padre != null) {

                    cboMadre.getModel().setSelectedItem(padre.getCaravanaBovino());
                }
            }
        }
        llenarComboPadre();
        llenarComboMadre();
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
        jLabel1 = new javax.swing.JLabel();
        txtModificarCaravana = new javax.swing.JTextField();
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
        btnModificar = new javax.swing.JButton();
        lblRFechaNacimiento = new java.awt.Label();
        lblRRaza = new java.awt.Label();
        lblRTipoMacho = new java.awt.Label();
        lblRCaravana = new java.awt.Label();
        lblRNumeroPedigree = new java.awt.Label();
        chkPedigree = new javax.swing.JCheckBox();
        txtNumeroPedigree = new javax.swing.JTextField();
        lblNumeroPedigree = new javax.swing.JLabel();
        btnBuscarFoto = new javax.swing.JButton();
        txtRutaFoto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lblFotoBovino = new javax.swing.JLabel();

        setBackground(new java.awt.Color(54, 67, 114));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(133, 146, 158));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Caravana:");

        lblTipo.setText("Tipo:");

        grupoBotones.add(chkHembra);
        chkHembra.setText("Hembra");
        chkHembra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkHembraMouseClicked(evt);
            }
        });

        grupoBotones.add(chkMacho);
        chkMacho.setText("Macho");
        chkMacho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chkMachoMouseClicked(evt);
            }
        });

        cboPadre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));

        jLabel4.setText("Fecha Nacimiento:");

        cboMadre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));

        jLabel5.setText("Padre:");

        cboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "En Pie", "Congelado" }));

        jLabel6.setText("Madre:");

        jLabel2.setText("Raza:");

        cboRaza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Modificar16px.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarMouseClicked(evt);
            }
        });

        lblRFechaNacimiento.setText("Requerido");

        lblRRaza.setText("Requerido");

        lblRTipoMacho.setText("Requerido");

        lblRCaravana.setText("Requerido");

        lblRNumeroPedigree.setText("Requerido");

        chkPedigree.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        chkPedigree.setText("Pedigree");
        chkPedigree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPedigreeActionPerformed(evt);
            }
        });

        lblNumeroPedigree.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNumeroPedigree.setText("Número de Pedigree por ARU:");

        btnBuscarFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar16px.png"))); // NOI18N
        btnBuscarFoto.setText("Buscar Foto");
        btnBuscarFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarFotoMouseClicked(evt);
            }
        });

        txtRutaFoto.setEditable(false);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Ruta Foto:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnModificar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtModificarCaravana, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(lblRCaravana, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jDateFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(chkHembra)
                                                .addGap(34, 34, 34)
                                                .addComponent(chkMacho))
                                            .addComponent(jLabel2))
                                        .addGap(10, 10, 10)
                                        .addComponent(lblRFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cboRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(lblRRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblTipo)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(lblRTipoMacho, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRutaFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBuscarFoto))
                                .addGap(60, 60, 60)
                                .addComponent(lblFotoBovino, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(chkPedigree)
                            .addComponent(lblNumeroPedigree, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtNumeroPedigree, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(lblRNumeroPedigree, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboPadre, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(cboMadre, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtModificarCaravana, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRCaravana, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cboPadre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboMadre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jDateFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkHembra)
                            .addComponent(chkMacho))
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2))
                    .addComponent(lblRFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtRutaFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnBuscarFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblFotoBovino, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkPedigree, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblTipo))
                    .addComponent(lblNumeroPedigree))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRTipoMacho, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroPedigree, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRNumeroPedigree, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(190, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean validarCampos() {

        int contador = 0;
        if (txtModificarCaravana.getText().equals("")) {
            lblRCaravana.setVisible(true);
            contador++;
        } else {
            lblRCaravana.setVisible(false);
        }
        if (jDateFechaNacimiento.getDate() == null) {
            lblRFechaNacimiento.setVisible(true);
            contador++;
        } else {
            lblRFechaNacimiento.setVisible(false);
        }
        if (cboRaza.getSelectedIndex() == 0) {
            lblRRaza.setVisible(true);
            contador++;
        } else {
            lblRRaza.setVisible(false);
        }
        if (cboTipo.getSelectedIndex() == 0 && chkMacho.isSelected()) {
            lblRTipoMacho.setVisible(true);
            contador++;
        } else {
            lblRTipoMacho.setVisible(false);
        }
        if (txtNumeroPedigree.getText().equals("") && chkPedigree.isSelected()) {
            lblRNumeroPedigree.setVisible(true);
            contador++;
        } else {
            lblRNumeroPedigree.setVisible(false);
        }

        if (contador < 1) {
            return true;
        } else {
            return false;
        }
    }

    public void limpiarCajas() {

        txtModificarCaravana.setText(null);
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

        ArrayList<Macho> listaMachos = pMacho.listarMachos();

        for (Macho macho : listaMachos) {

            if (!macho.getCaravanaBovino().equals(frmBovino.caravana)) {
                cboPadre.addItem(macho);
            }
        }

    }

    private void llenarComboMadre() {

        ArrayList<Hembra> listaHembras = pHembra.listarHembras();

        for (Hembra hembra : listaHembras) {
            if (!hembra.getCaravanaBovino().equals(frmBovino.caravana)) {
                cboMadre.addItem(hembra);
            }
        }

    }

    private void chkHembraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkHembraMouseClicked

        lblTipo.setVisible(false);
        cboTipo.setVisible(false);
        lblRTipoMacho.setVisible(false);
    }//GEN-LAST:event_chkHembraMouseClicked

    private void chkMachoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chkMachoMouseClicked

        lblTipo.setVisible(true);
        cboTipo.setVisible(true);
    }//GEN-LAST:event_chkMachoMouseClicked

    private byte[] getImagen(String pRuta){
        
        File imagen = new File(pRuta);
        try {
            byte[] icono = new byte[(int) imagen.length()];
            InputStream input = new FileInputStream(imagen);
            input.read(icono);
            return icono;
            
        } catch (Exception e) {
            return null;
        }
    }
    
    private void btnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseClicked

        if (validarCampos()) {
            frmBovino nuevoFormulario = new frmBovino();
            String caravanaBovino = nuevoFormulario.caravana;

            Bovino bovino = dControladora.buscarBovinoCaravana(caravanaBovino);

            String caravana = txtModificarCaravana.getText();
            Date fechaNacimiento = jDateFechaNacimiento.getDate();

            Raza raza = null;
            if (cboRaza.getSelectedIndex() > 0) {
                raza = (Raza) cboRaza.getSelectedItem();
            } else {
                raza = (Raza) cboRaza.getModel().getSelectedItem();
            }

            Pedigree pedigreeBDM = null;
            Pedigree pedigreeBDH = null;

            if (frmModificarBovino.macho != null) {
                pedigreeBDM = dControladora.buscarPedigreeIdBovino(frmModificarBovino.macho.getIdBovino());
            }
            if (frmModificarBovino.hembra != null) {
                pedigreeBDH = dControladora.buscarPedigreeIdBovino(frmModificarBovino.hembra.getIdBovino());
            }
            String numeroPedigree = null;
            if (chkPedigree.isSelected()) {
                numeroPedigree = txtNumeroPedigree.getText();
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

                    String tipo = null;
                    if (cboTipo.getSelectedIndex() > 0) {
                        tipo = cboTipo.getSelectedItem().toString();
                    }

                    Macho macho = new Macho(bovino.getIdBovino(), caravana, fechaNacimiento, raza, tipo, madre, padre);

                    if (txtRutaFoto.getText().isEmpty()) {

                        if (dControladora.modificarBovino(macho)) {

                            if (frmModificarBovino.macho != null) {
                                if (dControladora.modificarMacho(macho)) {
                                    JOptionPane.showMessageDialog(null, "Macho Modificado Correctamente");
                                }
                            } else {
                                if (dControladora.bajaHembra(macho.getIdBovino()) && dControladora.altaMacho(macho)) {
                                    if (dControladora.bajaParentescos(macho.getIdBovino())) {
                                        JOptionPane.showMessageDialog(null, "Parentescos del Bovino quitados");
                                    }
                                    JOptionPane.showMessageDialog(null, "Hembra Modificado a Macho Correctamente");
                                }
                            }

                            if (chkPedigree.isSelected()) {

                                Pedigree pedigree = new Pedigree(macho, numeroPedigree);

                                if (frmModificarBovino.macho != null && pedigreeBDM == null
                                        || frmModificarBovino.hembra != null && pedigreeBDH == null) {

                                    if (dControladora.altaPedigree(pedigree)) {
                                        JOptionPane.showMessageDialog(null, "Macho Modificado a Pedigree Correctamente");
                                    }
                                } else if (frmModificarBovino.macho != null && pedigreeBDM != null && !pedigreeBDM.getNumeroPedigree().equals(pedigree.getNumeroPedigree())
                                        || frmModificarBovino.hembra != null && pedigreeBDH != null && !pedigreeBDH.getNumeroPedigree().equals(pedigree.getNumeroPedigree())) {

                                    if (dControladora.modificarPedigree(pedigree)) {
                                        JOptionPane.showMessageDialog(null, "Número Pedigree Modificado Correctamente");
                                    }
                                }
                            } else if (pedigreeBDM != null) {
                                if (dControladora.bajaPedigree(pedigreeBDM.getBovino().getIdBovino())) {
                                    JOptionPane.showMessageDialog(null, "Dado de Baja como Bovino Pedigree Correctamente");
                                }
                            } else if (pedigreeBDH != null) {
                                if (dControladora.bajaPedigree(pedigreeBDH.getBovino().getIdBovino())) {
                                    JOptionPane.showMessageDialog(null, "Dado de Baja como Bovino Pedigree Correctamente");
                                }
                            }

                            if (frmModificarBovino.macho != null && frmModificarBovino.macho.getPadre() == null || frmModificarBovino.hembra != null && frmModificarBovino.hembra.getPadre() == null) {
                                if (padre != null) {
                                    dControladora.altaParentesco(macho.getIdBovino(), padre.getIdBovino(), "Padre");
                                    JOptionPane.showMessageDialog(null, "Padre agregado Correctamente");
                                }
                            } else if (frmModificarBovino.macho != null && frmModificarBovino.macho.getPadre() != null && macho.getPadre() != null && frmModificarBovino.macho.getPadre().getIdBovino() != macho.getPadre().getIdBovino()
                                    || frmModificarBovino.hembra != null && frmModificarBovino.hembra.getPadre() != null && macho.getPadre() != null && frmModificarBovino.hembra.getPadre().getIdBovino() != macho.getPadre().getIdBovino()) {

                                if (dControladora.buscarParentescoPadre(macho.getIdBovino()) != null) {
                                    dControladora.modificarParentesco(macho.getIdBovino(), padre.getIdBovino(), "Padre");
                                    JOptionPane.showMessageDialog(null, "Padre modificado Correctamente");
                                }

                            }
                            if (frmModificarBovino.macho != null && frmModificarBovino.macho.getMadre() == null || frmModificarBovino.hembra != null && frmModificarBovino.hembra.getMadre() == null) {
                                if (madre != null) {
                                    dControladora.altaParentesco(macho.getIdBovino(), madre.getIdBovino(), "Madre");
                                    JOptionPane.showMessageDialog(null, "Madre agregada Correctamente");
                                }
                            } else if (frmModificarBovino.macho != null && frmModificarBovino.macho.getMadre() != null && macho.getMadre() != null && frmModificarBovino.macho.getMadre().getIdBovino() != macho.getMadre().getIdBovino()
                                    || frmModificarBovino.hembra != null && frmModificarBovino.hembra.getMadre() != null && macho.getMadre() != null && frmModificarBovino.hembra.getMadre().getIdBovino() != macho.getMadre().getIdBovino()) {

                                if (dControladora.buscarParentescoMadre(macho.getIdBovino()) != null) {
                                    dControladora.modificarParentesco(macho.getIdBovino(), madre.getIdBovino(), "Madre");
                                    JOptionPane.showMessageDialog(null, "Madre modificada Correctamente");
                                }
                            }

                            frmModificarBovino.macho = null;
                            frmModificarBovino.hembra = null;

                            limpiarCajas(); // Limpiamos Caja de Texto
                            this.dispose();
                            nuevoFormulario.actualizarTabla();
                            frmInicio.jDkPEscritorio.add(nuevoFormulario);
                            nuevoFormulario.setVisible(true);

                        } else {
                            JOptionPane.showMessageDialog(null, "Error: No se pudo Modificar el Macho");
                        }
                    } else {

                        byte[] foto = getImagen(txtRutaFoto.getText());
                        
                        Macho machoFoto = new Macho(tipo, bovino.getIdBovino(), caravana, fechaNacimiento, madre, padre, raza, foto);
                        if (dControladora.modificarBovinoFoto(machoFoto)) {

                            if (frmModificarBovino.macho != null) {
                                if (dControladora.modificarMacho(machoFoto)) {
                                    JOptionPane.showMessageDialog(null, "Macho Modificado Correctamente");
                                }
                            } else {
                                if (dControladora.bajaHembra(machoFoto.getIdBovino()) && dControladora.altaMacho(machoFoto)) {
                                    if (dControladora.bajaParentescos(machoFoto.getIdBovino())) {
                                        JOptionPane.showMessageDialog(null, "Parentescos del Bovino quitados");
                                    }
                                    JOptionPane.showMessageDialog(null, "Hembra Modificado a Macho Correctamente");
                                }
                            }

                            if (chkPedigree.isSelected()) {

                                Pedigree pedigree = new Pedigree(machoFoto, numeroPedigree);

                                if (frmModificarBovino.macho != null && pedigreeBDM == null
                                        || frmModificarBovino.hembra != null && pedigreeBDH == null) {

                                    if (dControladora.altaPedigree(pedigree)) {
                                        JOptionPane.showMessageDialog(null, "Macho Modificado a Pedigree Correctamente");
                                    }
                                } else if (frmModificarBovino.macho != null && pedigreeBDM != null && !pedigreeBDM.getNumeroPedigree().equals(pedigree.getNumeroPedigree())
                                        || frmModificarBovino.hembra != null && pedigreeBDH != null && !pedigreeBDH.getNumeroPedigree().equals(pedigree.getNumeroPedigree())) {

                                    if (dControladora.modificarPedigree(pedigree)) {
                                        JOptionPane.showMessageDialog(null, "Número Pedigree Modificado Correctamente");
                                    }
                                }
                            } else if (pedigreeBDM != null) {
                                if (dControladora.bajaPedigree(pedigreeBDM.getBovino().getIdBovino())) {
                                    JOptionPane.showMessageDialog(null, "Dado de Baja como Bovino Pedigree Correctamente");
                                }
                            } else if (pedigreeBDH != null) {
                                if (dControladora.bajaPedigree(pedigreeBDH.getBovino().getIdBovino())) {
                                    JOptionPane.showMessageDialog(null, "Dado de Baja como Bovino Pedigree Correctamente");
                                }
                            }

                            if (frmModificarBovino.macho != null && frmModificarBovino.macho.getPadre() == null || frmModificarBovino.hembra != null && frmModificarBovino.hembra.getPadre() == null) {
                                if (padre != null) {
                                    dControladora.altaParentesco(machoFoto.getIdBovino(), padre.getIdBovino(), "Padre");
                                    JOptionPane.showMessageDialog(null, "Padre agregado Correctamente");
                                }
                            } else if (frmModificarBovino.macho != null && frmModificarBovino.macho.getPadre() != null && machoFoto.getPadre() != null && frmModificarBovino.macho.getPadre().getIdBovino() != machoFoto.getPadre().getIdBovino()
                                    || frmModificarBovino.hembra != null && frmModificarBovino.hembra.getPadre() != null && machoFoto.getPadre() != null && frmModificarBovino.hembra.getPadre().getIdBovino() != machoFoto.getPadre().getIdBovino()) {

                                if (dControladora.buscarParentescoPadre(machoFoto.getIdBovino()) != null) {
                                    dControladora.modificarParentesco(machoFoto.getIdBovino(), padre.getIdBovino(), "Padre");
                                    JOptionPane.showMessageDialog(null, "Padre modificado Correctamente");
                                }

                            }
                            if (frmModificarBovino.macho != null && frmModificarBovino.macho.getMadre() == null || frmModificarBovino.hembra != null && frmModificarBovino.hembra.getMadre() == null) {
                                if (madre != null) {
                                    dControladora.altaParentesco(machoFoto.getIdBovino(), madre.getIdBovino(), "Madre");
                                    JOptionPane.showMessageDialog(null, "Madre agregada Correctamente");
                                }
                            } else if (frmModificarBovino.macho != null && frmModificarBovino.macho.getMadre() != null && machoFoto.getMadre() != null && frmModificarBovino.macho.getMadre().getIdBovino() != machoFoto.getMadre().getIdBovino()
                                    || frmModificarBovino.hembra != null && frmModificarBovino.hembra.getMadre() != null && machoFoto.getMadre() != null && frmModificarBovino.hembra.getMadre().getIdBovino() != machoFoto.getMadre().getIdBovino()) {

                                if (dControladora.buscarParentescoMadre(machoFoto.getIdBovino()) != null) {
                                    dControladora.modificarParentesco(machoFoto.getIdBovino(), madre.getIdBovino(), "Madre");
                                    JOptionPane.showMessageDialog(null, "Madre modificada Correctamente");
                                }
                            }

                            frmModificarBovino.macho = null;
                            frmModificarBovino.hembra = null;

                            limpiarCajas(); // Limpiamos Caja de Texto
                            this.dispose();
                            nuevoFormulario.actualizarTabla();
                            frmInicio.jDkPEscritorio.add(nuevoFormulario);
                            nuevoFormulario.setVisible(true);

                        } else {
                            JOptionPane.showMessageDialog(null, "Error: No se pudo Modificar el Macho");
                        }
                    }

                } else if (chkHembra.isSelected()) {

                    if (txtRutaFoto.getText().isEmpty()) {
                        Hembra hembra = new Hembra(bovino.getIdBovino(), caravana, fechaNacimiento, raza, madre, padre);
                        if (dControladora.modificarBovino(hembra)) {

                            if (frmModificarBovino.hembra != null) {
                                JOptionPane.showMessageDialog(null, "Hembra Modificado Correctamente");

                            } else {
                                if (dControladora.bajaMacho(hembra.getIdBovino()) && dControladora.altaHembra(hembra)) {
                                    if (dControladora.bajaParentescos(bovino.getIdBovino())) {
                                        JOptionPane.showMessageDialog(null, "Parentescos del Bovino quitados");
                                    }
                                    JOptionPane.showMessageDialog(null, "Macho Modificado a Hembra Correctamente");

                                }
                            }

                            if (chkPedigree.isSelected()) {

                                Pedigree pedigree = new Pedigree(hembra, numeroPedigree);

                                if (frmModificarBovino.macho != null && pedigreeBDM == null
                                        || frmModificarBovino.hembra != null && pedigreeBDH == null) {

                                    if (dControladora.altaPedigree(pedigree)) {
                                        JOptionPane.showMessageDialog(null, "Hembra Modificada a Pedigree Correctamente");
                                    }
                                } else if (frmModificarBovino.macho != null && pedigreeBDM != null && !pedigreeBDM.getNumeroPedigree().equals(pedigree.getNumeroPedigree())
                                        || frmModificarBovino.hembra != null && pedigreeBDH != null && !pedigreeBDH.getNumeroPedigree().equals(pedigree.getNumeroPedigree())) {

                                    if (dControladora.modificarPedigree(pedigree)) {
                                        JOptionPane.showMessageDialog(null, "Número Pedigree Modificado Correctamente");
                                    }
                                }
                            } else if (pedigreeBDM != null) {
                                if (dControladora.bajaPedigree(pedigreeBDM.getBovino().getIdBovino())) {
                                    JOptionPane.showMessageDialog(null, "Dado de Baja como Bovino Pedigree Correctamente");
                                }
                            } else if (pedigreeBDH != null) {
                                if (dControladora.bajaPedigree(pedigreeBDH.getBovino().getIdBovino())) {
                                    JOptionPane.showMessageDialog(null, "Dado de Baja como Bovino Pedigree Correctamente");
                                }
                            }

                            if (frmModificarBovino.hembra != null && frmModificarBovino.hembra.getPadre() == null || frmModificarBovino.macho != null && frmModificarBovino.macho.getPadre() == null) {
                                if (padre != null) {
                                    dControladora.altaParentesco(hembra.getIdBovino(), padre.getIdBovino(), "Padre");
                                    JOptionPane.showMessageDialog(null, "Padre modificado Correctamente");
                                }

                            } else if (frmModificarBovino.hembra != null && frmModificarBovino.hembra.getPadre() != null && hembra.getPadre() != null && frmModificarBovino.hembra.getPadre().getIdBovino() != hembra.getPadre().getIdBovino()
                                    || frmModificarBovino.macho != null && frmModificarBovino.macho.getPadre() != null && hembra.getPadre() != null && frmModificarBovino.macho.getPadre().getIdBovino() != hembra.getPadre().getIdBovino()) {

                                if (dControladora.buscarParentescoPadre(hembra.getIdBovino()) != null) {
                                    dControladora.modificarParentesco(hembra.getIdBovino(), padre.getIdBovino(), "Padre");
                                    JOptionPane.showMessageDialog(null, "Padre modificado Correctamente");
                                }

                            }
                            if (frmModificarBovino.hembra != null && frmModificarBovino.hembra.getMadre() == null || frmModificarBovino.macho != null && frmModificarBovino.macho.getMadre() == null) {
                                if (madre != null) {
                                    dControladora.altaParentesco(hembra.getIdBovino(), madre.getIdBovino(), "Madre");
                                    JOptionPane.showMessageDialog(null, "Madre agregada Correctamente");
                                }
                            } else if (frmModificarBovino.hembra != null && frmModificarBovino.hembra.getMadre() != null && hembra.getMadre() != null && frmModificarBovino.hembra.getMadre().getIdBovino() != hembra.getMadre().getIdBovino()
                                    || frmModificarBovino.macho != null && frmModificarBovino.macho.getMadre() != null && hembra.getMadre() != null && frmModificarBovino.macho.getMadre().getIdBovino() != hembra.getMadre().getIdBovino()) {

                                if (dControladora.buscarParentescoMadre(hembra.getIdBovino()) != null) {
                                    dControladora.modificarParentesco(hembra.getIdBovino(), madre.getIdBovino(), "Madre");
                                    JOptionPane.showMessageDialog(null, "Madre modificada Correctamente");
                                }
                            }

                            frmModificarBovino.macho = null;
                            frmModificarBovino.hembra = null;

                            limpiarCajas(); // Limpiamos Caja de Texto
                            this.dispose();
                            nuevoFormulario.actualizarTabla();
                            frmInicio.jDkPEscritorio.add(nuevoFormulario);
                            nuevoFormulario.setVisible(true);

                        } else {
                            JOptionPane.showMessageDialog(null, "Error: No se pudo modificar la Hembra");
                        }
                    } else {

                        byte[] foto = getImagen(txtRutaFoto.getText());
                        
                        Hembra hembraFoto = new Hembra(bovino.getIdBovino(), caravana, fechaNacimiento, madre, padre, raza, foto);
                        
                        if (dControladora.modificarBovinoFoto(hembraFoto)) {

                            if (frmModificarBovino.hembra != null) {
                                JOptionPane.showMessageDialog(null, "Hembra Modificado Correctamente");

                            } else {
                                if (dControladora.bajaMacho(hembraFoto.getIdBovino()) && dControladora.altaHembra(hembraFoto)) {
                                    if (dControladora.bajaParentescos(hembraFoto.getIdBovino())) {
                                        JOptionPane.showMessageDialog(null, "Parentescos del Bovino quitados");
                                    }
                                    JOptionPane.showMessageDialog(null, "Macho Modificado a Hembra Correctamente");

                                }
                            }

                            if (chkPedigree.isSelected()) {

                                Pedigree pedigree = new Pedigree(hembraFoto, numeroPedigree);

                                if (frmModificarBovino.macho != null && pedigreeBDM == null
                                        || frmModificarBovino.hembra != null && pedigreeBDH == null) {

                                    if (dControladora.altaPedigree(pedigree)) {
                                        JOptionPane.showMessageDialog(null, "Hembra Modificada a Pedigree Correctamente");
                                    }
                                } else if (frmModificarBovino.macho != null && pedigreeBDM != null && !pedigreeBDM.getNumeroPedigree().equals(pedigree.getNumeroPedigree())
                                        || frmModificarBovino.hembra != null && pedigreeBDH != null && !pedigreeBDH.getNumeroPedigree().equals(pedigree.getNumeroPedigree())) {

                                    if (dControladora.modificarPedigree(pedigree)) {
                                        JOptionPane.showMessageDialog(null, "Número Pedigree Modificado Correctamente");
                                    }
                                }
                            } else if (pedigreeBDM != null) {
                                if (dControladora.bajaPedigree(pedigreeBDM.getBovino().getIdBovino())) {
                                    JOptionPane.showMessageDialog(null, "Dado de Baja como Bovino Pedigree Correctamente");
                                }
                            } else if (pedigreeBDH != null) {
                                if (dControladora.bajaPedigree(pedigreeBDH.getBovino().getIdBovino())) {
                                    JOptionPane.showMessageDialog(null, "Dado de Baja como Bovino Pedigree Correctamente");
                                }
                            }

                            if (frmModificarBovino.hembra != null && frmModificarBovino.hembra.getPadre() == null || frmModificarBovino.macho != null && frmModificarBovino.macho.getPadre() == null) {
                                if (padre != null) {
                                    dControladora.altaParentesco(hembra.getIdBovino(), padre.getIdBovino(), "Padre");
                                    JOptionPane.showMessageDialog(null, "Padre modificado Correctamente");
                                }

                            } else if (frmModificarBovino.hembra != null && frmModificarBovino.hembra.getPadre() != null && hembraFoto.getPadre() != null && frmModificarBovino.hembra.getPadre().getIdBovino() != hembraFoto.getPadre().getIdBovino()
                                    || frmModificarBovino.macho != null && frmModificarBovino.macho.getPadre() != null && hembraFoto.getPadre() != null && frmModificarBovino.macho.getPadre().getIdBovino() != hembraFoto.getPadre().getIdBovino()) {

                                if (dControladora.buscarParentescoPadre(hembraFoto.getIdBovino()) != null) {
                                    dControladora.modificarParentesco(hembraFoto.getIdBovino(), padre.getIdBovino(), "Padre");
                                    JOptionPane.showMessageDialog(null, "Padre modificado Correctamente");
                                }

                            }
                            if (frmModificarBovino.hembra != null && frmModificarBovino.hembra.getMadre() == null || frmModificarBovino.macho != null && frmModificarBovino.macho.getMadre() == null) {
                                if (madre != null) {
                                    dControladora.altaParentesco(hembraFoto.getIdBovino(), madre.getIdBovino(), "Madre");
                                    JOptionPane.showMessageDialog(null, "Madre agregada Correctamente");
                                }
                            } else if (frmModificarBovino.hembra != null && frmModificarBovino.hembra.getMadre() != null && hembraFoto.getMadre() != null && frmModificarBovino.hembra.getMadre().getIdBovino() != hembraFoto.getMadre().getIdBovino()
                                    || frmModificarBovino.macho != null && frmModificarBovino.macho.getMadre() != null && hembraFoto.getMadre() != null && frmModificarBovino.macho.getMadre().getIdBovino() != hembraFoto.getMadre().getIdBovino()) {

                                if (dControladora.buscarParentescoMadre(hembraFoto.getIdBovino()) != null) {
                                    dControladora.modificarParentesco(hembraFoto.getIdBovino(), madre.getIdBovino(), "Madre");
                                    JOptionPane.showMessageDialog(null, "Madre modificada Correctamente");
                                }
                            }

                            frmModificarBovino.macho = null;
                            frmModificarBovino.hembra = null;

                            limpiarCajas(); // Limpiamos Caja de Texto
                            this.dispose();
                            nuevoFormulario.actualizarTabla();
                            frmInicio.jDkPEscritorio.add(nuevoFormulario);
                            nuevoFormulario.setVisible(true);

                        } else {
                            JOptionPane.showMessageDialog(null, "Error: No se pudo modificar la Hembra");
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Seleccione el sexo del Bovino");
                }

            } catch (Exception e) {
                throw e;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese los datos faltantes");
        }
    }//GEN-LAST:event_btnModificarMouseClicked

    private void chkPedigreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPedigreeActionPerformed

        if (chkPedigree.isSelected()) {
            lblNumeroPedigree.setVisible(true);
            txtNumeroPedigree.setVisible(true);
        } else {
            lblNumeroPedigree.setVisible(false);
            txtNumeroPedigree.setVisible(false);
            txtNumeroPedigree.setText(null);
            lblRNumeroPedigree.setVisible(false);
        }
    }//GEN-LAST:event_chkPedigreeActionPerformed

    private void btnBuscarFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarFotoMouseClicked

        JFileChooser j = new JFileChooser();
        FileNameExtensionFilter fil = new FileNameExtensionFilter("JPG, PNG & GIF", "jpg", "png", "gif");
        j.setFileFilter(fil);

        int s = j.showOpenDialog(this);
        if (s == JFileChooser.APPROVE_OPTION) {
            String ruta = j.getSelectedFile().getAbsolutePath();
            txtRutaFoto.setText(ruta);

            Image foto = getToolkit().getImage(ruta);
            foto = foto.getScaledInstance(lblFotoBovino.getWidth(), lblFotoBovino.getHeight(), Image.SCALE_DEFAULT);

            lblFotoBovino.setIcon(new ImageIcon(foto));
        }
    }//GEN-LAST:event_btnBuscarFotoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarFoto;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<Object> cboMadre;
    private javax.swing.JComboBox<Object> cboPadre;
    private javax.swing.JComboBox<Object> cboRaza;
    private javax.swing.JComboBox<String> cboTipo;
    private javax.swing.JCheckBox chkHembra;
    private javax.swing.JCheckBox chkMacho;
    private javax.swing.JCheckBox chkPedigree;
    private javax.swing.ButtonGroup grupoBotones;
    private com.toedter.calendar.JDateChooser jDateFechaNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFotoBovino;
    private javax.swing.JLabel lblNumeroPedigree;
    private java.awt.Label lblRCaravana;
    private java.awt.Label lblRFechaNacimiento;
    private java.awt.Label lblRNumeroPedigree;
    private java.awt.Label lblRRaza;
    private java.awt.Label lblRTipoMacho;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JTextField txtModificarCaravana;
    private javax.swing.JTextField txtNumeroPedigree;
    private javax.swing.JTextField txtRutaFoto;
    // End of variables declaration//GEN-END:variables
}
