/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;


import clases.Hembra;
import clases.Macho;
import dominio.dControladora;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
<<<<<<< HEAD
=======
import javax.swing.JLabel;
import javax.swing.Timer;
>>>>>>> 7f77656 (2 Listas y ficha andando Yolaus)

/**
 *
 * @author Godoy
 */
public class frmFichaBovino extends javax.swing.JInternalFrame {

    public frmFichaBovino() {
        initComponents();
        this.setSize(frmInicio.jDkPEscritorio.getWidth(), frmInicio.jDkPEscritorio.getHeight());
<<<<<<< HEAD
        lblTipoMachoText.setVisible(false);
        txtTipoMacho.setVisible(false);

        if (frmBovino.sexo.equals(
                "Macho")) {
            Macho macho = dControladora.buscarMachoPorCaravanaCompleto(frmBovino.caravana);

            lblTipoMachoText.setVisible(true);
            txtTipoMacho.setVisible(true);

            txtCaravanaBovino.setText(macho.getCaravanaBovino());
            txtFechaNacimiento.setText(macho.getFechaNacimiento().toString());
            txtRazaBovino.setText(macho.getRaza().getTipo());
            txtSexoBovino.setText("Macho");
            txtTipoMacho.setText(macho.getTipo());

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

            if (macho.getMadre() != null) {
                txtCaravanaMadre.setText(macho.getMadre().getCaravanaBovino());
                try {
                    byte[] bi = macho.getMadre().getFoto();
                    BufferedImage image = null;
                    InputStream in = new ByteArrayInputStream(bi);
                    image = ImageIO.read(in);
                    ImageIcon imgi = new ImageIcon(image.getScaledInstance(150, 150, Image.SCALE_DEFAULT));
                    lblFotoMadre.setIcon(imgi);

                } catch (Exception ex) {
                    lblFotoMadre.setText("Sin foto");
                }
            }
            if (macho.getPadre() != null) {
                txtCaravanaPadre.setText(macho.getPadre().getCaravanaBovino());
                try {
                    byte[] bi = macho.getPadre().getFoto();
                    BufferedImage image = null;
                    InputStream in = new ByteArrayInputStream(bi);
                    image = ImageIO.read(in);
                    ImageIcon imgi = new ImageIcon(image.getScaledInstance(150, 150, Image.SCALE_DEFAULT));
                    lblFotoPadre.setIcon(imgi);

                } catch (Exception ex) {
                    lblFotoPadre.setText("Sin foto");
                }
            }
        } else {

            Hembra hembra = dControladora.buscarHembraPorCaravanaCompleta(frmBovino.caravana);

            txtCaravanaBovino.setText(hembra.getCaravanaBovino());
            txtFechaNacimiento.setText(hembra.getFechaNacimiento().toString());
            txtRazaBovino.setText(hembra.getRaza().getTipo());
            txtSexoBovino.setText("Hembra");

            try {
                byte[] bi = hembra.getFoto();

                ByteArrayInputStream bis = new ByteArrayInputStream(bi);
                BufferedImage image = null;

                image = ImageIO.read(bis);

                Image imgi = image.getScaledInstance(150, 150, Image.SCALE_DEFAULT);

                ImageIcon foto = new ImageIcon(imgi);
                lblFotoBovino.setIcon(foto);

            } catch (Exception ex) {
                System.out.println(ex.toString());
                lblFotoBovino.setText("Sin foto");
            }
            if (hembra.getMadre() != null) {
                txtCaravanaMadre.setText(hembra.getMadre().getCaravanaBovino());
                try {
                    byte[] bi = hembra.getMadre().getFoto();
                    BufferedImage image = null;
                    InputStream in = new ByteArrayInputStream(bi);
                    image = ImageIO.read(in);
                    ImageIcon imgi = new ImageIcon(image.getScaledInstance(150, 150, Image.SCALE_DEFAULT));
                    lblFotoMadre.setIcon(imgi);

                } catch (Exception ex) {
                    lblFotoMadre.setText("Sin foto");
                }
            }

            if (hembra.getPadre() != null) {
                txtCaravanaPadre.setText(hembra.getPadre().getCaravanaBovino());
                try {
                    byte[] bi = hembra.getPadre().getFoto();
                    BufferedImage image = null;
                    InputStream in = new ByteArrayInputStream(bi);
                    image = ImageIO.read(in);
                    ImageIcon imgi = new ImageIcon(image.getScaledInstance(150, 150, Image.SCALE_DEFAULT));
                    lblFotoPadre.setIcon(imgi);

                } catch (Exception ex) {
                    lblFotoPadre.setText("Sin foto");
                }
            }
        }

=======
        tm1.start();
>>>>>>> 7f77656 (2 Listas y ficha andando Yolaus)
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtCaravanaMadre = new javax.swing.JTextField();
        lblFotoMadre = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lblFotoPadre = new javax.swing.JLabel();
        txtCaravanaPadre = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblTipoMachoText = new javax.swing.JLabel();
        txtCaravanaBovino = new javax.swing.JTextField();
        txtFechaNacimiento = new javax.swing.JTextField();
        txtRazaBovino = new javax.swing.JTextField();
        txtSexoBovino = new javax.swing.JTextField();
        txtTipoMacho = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
<<<<<<< HEAD
        jPanelFoto = new javax.swing.JPanel();
=======
        jpanelFoto = new javax.swing.JPanel();
>>>>>>> 7f77656 (2 Listas y ficha andando Yolaus)
        lblFotoBovino = new javax.swing.JLabel();

        setBackground(new java.awt.Color(54, 67, 114));
        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("FICHA BOVINO");

        jPanel1.setBackground(new java.awt.Color(54, 67, 114));

        jPanel2.setBackground(new java.awt.Color(55, 113, 137));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jPanel5.setBackground(new java.awt.Color(50, 123, 150));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Madre:");

        txtCaravanaMadre.setEditable(false);

        lblFotoMadre.setBackground(new java.awt.Color(55, 113, 137));
        lblFotoMadre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFotoMadre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCaravanaMadre, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCaravanaMadre, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFotoMadre, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(50, 123, 150));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblFotoPadre.setBackground(new java.awt.Color(55, 113, 137));
        lblFotoPadre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtCaravanaPadre.setEditable(false);

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Padre:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFotoPadre, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCaravanaPadre, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCaravanaPadre, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFotoPadre, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel6);

        jPanel3.setBackground(new java.awt.Color(55, 113, 137));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Caravana:");

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Fecha Nacimiento:");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Raza:");

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Sexo:");

        lblTipoMachoText.setForeground(new java.awt.Color(0, 0, 0));
        lblTipoMachoText.setText("Tipo:");

        txtCaravanaBovino.setEditable(false);
        txtCaravanaBovino.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        txtFechaNacimiento.setEditable(false);

        txtRazaBovino.setEditable(false);

        txtSexoBovino.setEditable(false);

        txtTipoMacho.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblTipoMachoText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTipoMacho, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSexoBovino, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCaravanaBovino, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRazaBovino, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(235, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCaravanaBovino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRazaBovino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSexoBovino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoMachoText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTipoMacho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        jPanel4.setBackground(new java.awt.Color(55, 113, 137));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanelFotoLayout = new javax.swing.GroupLayout(jPanelFoto);
        jPanelFoto.setLayout(jPanelFotoLayout);
        jPanelFotoLayout.setHorizontalGroup(
            jPanelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 188, Short.MAX_VALUE)
        );
        jPanelFotoLayout.setVerticalGroup(
            jPanelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jPanelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jPanelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
=======
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
>>>>>>> 7f77656 (2 Listas y ficha andando Yolaus)
        );

        jpanelFoto.setBackground(new java.awt.Color(55, 113, 137));
        jpanelFoto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblFotoBovino.setBackground(new java.awt.Color(55, 113, 137));
        lblFotoBovino.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jpanelFotoLayout = new javax.swing.GroupLayout(jpanelFoto);
        jpanelFoto.setLayout(jpanelFotoLayout);
        jpanelFotoLayout.setHorizontalGroup(
            jpanelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelFotoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFotoBovino, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpanelFotoLayout.setVerticalGroup(
            jpanelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelFotoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFotoBovino, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpanelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpanelFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

<<<<<<< HEAD
    

            

=======
    Integer seg = 0;

    Timer tm1 = new Timer(1, new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

            if (seg > 1) {
                cargarDatos();
                tm1.stop();

            } else {
                seg += 1;
            }
        }
    });


    public void cargarDatos() {

        int ancho = jpanelFoto.getWidth();
        int largo = jpanelFoto.getHeight();
        this.setSize(frmInicio.jDkPEscritorio.getWidth(), frmInicio.jDkPEscritorio.getHeight());
        lblTipoMachoText.setVisible(false);
        txtTipoMacho.setVisible(false);
        if (frmBovino.sexo.equals("Macho")) {
            Macho macho = dControladora.buscarMachoPorCaravanaCompleto(frmBovino.caravana);

            lblTipoMachoText.setVisible(true);
            txtTipoMacho.setVisible(true);

            txtCaravanaBovino.setText(macho.getCaravanaBovino());
            txtFechaNacimiento.setText(macho.getFechaNacimiento().toString());
            txtRazaBovino.setText(macho.getRaza().getTipo());
            txtSexoBovino.setText("Macho");
            txtTipoMacho.setText(macho.getTipo());

            try {
                byte[] bi = macho.getFoto();
                BufferedImage image = null;
                ByteArrayInputStream in = new ByteArrayInputStream(bi);
                image = ImageIO.read(in);
                ImageIcon imgi = new ImageIcon(image.getScaledInstance(ancho, largo, Image.SCALE_DEFAULT));
                lblFotoBovino.setIcon(imgi);

            } catch (Exception ex) {
                lblFotoBovino.setText("Sin foto");
            }

            if (macho.getMadre() != null) {
                txtCaravanaMadre.setText(macho.getMadre().getCaravanaBovino());
                try {
                    byte[] bi = macho.getMadre().getFoto();
                    BufferedImage image = null;
                    ByteArrayInputStream in = new ByteArrayInputStream(bi);
                    image = ImageIO.read(in);
                    ImageIcon imgi = new ImageIcon(image.getScaledInstance(lblFotoMadre.getWidth(), lblFotoMadre.getHeight(), Image.SCALE_DEFAULT));
                    lblFotoMadre.setIcon(imgi);

                } catch (Exception ex) {
                    lblFotoMadre.setText("Sin foto");
                }
            }
            if (macho.getPadre() != null) {
                txtCaravanaPadre.setText(macho.getPadre().getCaravanaBovino());
                try {
                    byte[] bi = macho.getPadre().getFoto();
                    BufferedImage image = null;
                    ByteArrayInputStream in = new ByteArrayInputStream(bi);
                    image = ImageIO.read(in);
                    ImageIcon imgi = new ImageIcon(image.getScaledInstance(lblFotoPadre.getWidth(), lblFotoPadre.getHeight(), Image.SCALE_DEFAULT));
                    lblFotoPadre.setIcon(imgi);

                } catch (Exception ex) {
                    lblFotoPadre.setText("Sin foto");
                }
            }
        } else {

            Hembra hembra = dControladora.buscarHembraPorCaravanaCompleta(frmBovino.caravana);

            txtCaravanaBovino.setText(hembra.getCaravanaBovino());
            txtFechaNacimiento.setText(hembra.getFechaNacimiento().toString());
            txtRazaBovino.setText(hembra.getRaza().getTipo());
            txtSexoBovino.setText("Hembra");

            try {
                byte[] bi = hembra.getFoto();
                ByteArrayInputStream bis = new ByteArrayInputStream(hembra.getFoto());
                BufferedImage image;
                image = ImageIO.read(bis);
                Image imgi = image.getScaledInstance(lblFotoBovino.getWidth(), lblFotoBovino.getHeight(), Image.SCALE_DEFAULT);
                ImageIcon foto = new ImageIcon(imgi);
                lblFotoBovino.setIcon(foto);

            } catch (Exception ex) {
                lblFotoBovino.setText("Sin foto");
            }
            if (hembra.getMadre() != null) {
                txtCaravanaMadre.setText(hembra.getMadre().getCaravanaBovino());
                try {
                    byte[] bi = hembra.getMadre().getFoto();
                    BufferedImage image = null;
                    ByteArrayInputStream in = new ByteArrayInputStream(bi);
                    image = ImageIO.read(in);
                    ImageIcon imgi = new ImageIcon(image.getScaledInstance(lblFotoMadre.getWidth(), lblFotoMadre.getHeight(), Image.SCALE_DEFAULT));
                    lblFotoMadre.setIcon(imgi);

                } catch (Exception ex) {
                    lblFotoMadre.setText("Sin foto");
                }
            }

            if (hembra.getPadre() != null) {
                txtCaravanaPadre.setText(hembra.getPadre().getCaravanaBovino());
                try {
                    byte[] bi = hembra.getPadre().getFoto();
                    BufferedImage image = null;
                    ByteArrayInputStream in = new ByteArrayInputStream(bi);
                    image = ImageIO.read(in);
                    ImageIcon imgi = new ImageIcon(image.getScaledInstance(lblFotoPadre.getWidth(), lblFotoPadre.getHeight(), Image.SCALE_DEFAULT));
                    lblFotoPadre.setIcon(imgi);

                } catch (Exception ex) {
                    lblFotoPadre.setText("Sin foto");
                }
            }
        }
    }
>>>>>>> 7f77656 (2 Listas y ficha andando Yolaus)
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
<<<<<<< HEAD
    public static transient volatile javax.swing.JPanel jPanelFoto;
    public static javax.swing.JLabel lblFotoBovino;
=======
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jpanelFoto;
    public static volatile javax.swing.JLabel lblFotoBovino;
>>>>>>> 7f77656 (2 Listas y ficha andando Yolaus)
    private javax.swing.JLabel lblFotoMadre;
    private javax.swing.JLabel lblFotoPadre;
    private javax.swing.JLabel lblTipoMachoText;
    private javax.swing.JTextField txtCaravanaBovino;
    private javax.swing.JTextField txtCaravanaMadre;
    private javax.swing.JTextField txtCaravanaPadre;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtRazaBovino;
    private javax.swing.JTextField txtSexoBovino;
    private javax.swing.JTextField txtTipoMacho;
    // End of variables declaration//GEN-END:variables

}
