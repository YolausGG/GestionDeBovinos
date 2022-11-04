/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import clases.Hembra;
import clases.Macho;
import dominio.dControladora;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.System.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Godoy
 */
public class frmFichaBovino extends javax.swing.JInternalFrame {

    public frmFichaBovino() {
        initComponents();
        
        this.setSize(frmInicio.jDkPEscritorio.getWidth(), frmInicio.jDkPEscritorio.getHeight());
        lblTipoMachoText.setVisible(false);
        lblTipoMacho.setVisible(false);
        if (frmBovino.sexo.equals("Macho")) {
            Macho macho = dControladora.buscarMachoPorCaravanaCompleto(frmBovino.caravana);

            lblTipoMachoText.setVisible(false);
            lblTipoMacho.setVisible(false);

            lblCaravanaBovino.setText(macho.getCaravanaBovino());
            lblFechaNacimientoBovino.setText(macho.getFechaNacimiento().toString());
            lblRazaBovino.setText(macho.getRaza().getTipo());
            lblSexoBovino.setText("Macho");
            lblTipoMacho.setText(macho.getTipo());

            try {
                byte[] bi = macho.getFoto();
                BufferedImage image = null;
                InputStream in = new ByteArrayInputStream(bi);
                image = ImageIO.read(in);
                ImageIcon imgi = new ImageIcon(image.getScaledInstance(lblFotoBovino.getWidth(), lblFotoBovino.getHeight(), Image.SCALE_DEFAULT));
                lblFotoBovino.setIcon(imgi);

            } catch (Exception ex) {
                lblFotoBovino.setText("Sin foto");
            }

            lblCaravanaMadre.setText(macho.getMadre().getCaravanaBovino());
            try {
                byte[] bi = macho.getMadre().getFoto();
                BufferedImage image = null;
                InputStream in = new ByteArrayInputStream(bi);
                image = ImageIO.read(in);
                ImageIcon imgi = new ImageIcon(image.getScaledInstance(lblFotoMadre.getWidth(), lblFotoMadre.getHeight(), Image.SCALE_DEFAULT));
                lblFotoMadre.setIcon(imgi);

            } catch (Exception ex) {
                lblFotoMadre.setText("Sin foto");
            }

            lblCaravanaPadre.setText(macho.getMadre().getCaravanaBovino());
            try {
                byte[] bi = macho.getMadre().getFoto();
                BufferedImage image = null;
                InputStream in = new ByteArrayInputStream(bi);
                image = ImageIO.read(in);
                ImageIcon imgi = new ImageIcon(image.getScaledInstance(lblFotoPadre.getWidth(), lblFotoPadre.getHeight(), Image.SCALE_DEFAULT));
                lblFotoPadre.setIcon(imgi);

            } catch (Exception ex) {
                lblFotoPadre.setText("Sin foto");
            }

        } else {

            Hembra hembra = dControladora.buscarHembraPorCaravanaCompleta(frmBovino.caravana);

            lblCaravanaBovino.setText(hembra.getCaravanaBovino());
            lblFechaNacimientoBovino.setText(hembra.getFechaNacimiento().toString());
            lblRazaBovino.setText(hembra.getRaza().getTipo());
            lblSexoBovino.setText("Hembra");

            try {
                byte[] bi = hembra.getFoto();

                ByteArrayInputStream bis = new ByteArrayInputStream(hembra.getFoto());
                BufferedImage image;

                image = ImageIO.read(bis);
                
                Image imgi = image.getScaledInstance(lblFotoBovino.getWidth(), lblFotoBovino.getHeight(), Image.SCALE_DEFAULT);
                
                lblFotoBovino.setIcon(new ImageIcon(imgi));

            } catch (Exception ex) {
                lblFotoBovino.setText("");
            }
            if (hembra.getMadre() != null) {
                lblCaravanaMadre.setText(hembra.getMadre().getCaravanaBovino());
                try {
                    byte[] bi = hembra.getMadre().getFoto();
                    BufferedImage image = null;
                    InputStream in = new ByteArrayInputStream(bi);
                    image = ImageIO.read(in);
                    ImageIcon imgi = new ImageIcon(image.getScaledInstance(lblFotoMadre.getWidth(), lblFotoMadre.getHeight(), Image.SCALE_DEFAULT));
                    lblFotoMadre.setIcon(imgi);

                } catch (Exception ex) {
                    lblFotoMadre.setText("");
                }
            }

            if (hembra.getPadre() != null) {
                lblCaravanaPadre.setText(hembra.getMadre().getCaravanaBovino());
                try {
                    byte[] bi = hembra.getMadre().getFoto();
                    BufferedImage image = null;
                    InputStream in = new ByteArrayInputStream(bi);
                    image = ImageIO.read(in);
                    ImageIcon imgi = new ImageIcon(image.getScaledInstance(lblFotoPadre.getWidth(), lblFotoPadre.getHeight(), Image.SCALE_DEFAULT));
                    lblFotoPadre.setIcon(imgi);

                } catch (Exception ex) {
                    lblFotoPadre.setText("");
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblSexoBovino = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblFechaNacimientoBovino = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblCaravanaBovino = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblRazaBovino = new javax.swing.JLabel();
        lblTipoMachoText = new javax.swing.JLabel();
        lblTipoMacho = new javax.swing.JLabel();
        lblCaravanaMadre = new javax.swing.JLabel();
        lblCaravanaPadre = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblFotoPadre = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblFotoMadre = new javax.swing.JLabel();
        lblFotoBovino = new javax.swing.JLabel();

        popupMenu1.setLabel("popupMenu1");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Sexo:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 40, 30));

        lblSexoBovino.setText("...");
        jPanel1.add(lblSexoBovino, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 90, 30));

        jLabel2.setText("Fecha Nacimiento:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 110, 30));

        lblFechaNacimientoBovino.setText("...");
        jPanel1.add(lblFechaNacimientoBovino, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 110, 30));

        jLabel3.setText("Caravana:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, 30));

        lblCaravanaBovino.setText("...");
        jPanel1.add(lblCaravanaBovino, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 100, 30));

        jLabel4.setText("Raza:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 40, 30));

        lblRazaBovino.setText("...");
        jPanel1.add(lblRazaBovino, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 90, 30));

        lblTipoMachoText.setText("Tipo:");
        jPanel1.add(lblTipoMachoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 30, 30));

        lblTipoMacho.setText("...");
        jPanel1.add(lblTipoMacho, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 90, 30));

        lblCaravanaMadre.setText("...");
        jPanel1.add(lblCaravanaMadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 70, 30));

        lblCaravanaPadre.setText("...");
        jPanel1.add(lblCaravanaPadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 40, 30));

        jLabel9.setText("Madre:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 40, 30));
        jPanel1.add(lblFotoPadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 160, 90));

        jLabel11.setText("Padre:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 40, 30));
        jPanel1.add(lblFotoMadre, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 160, 90));
        jPanel1.add(lblFotoBovino, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 250, 160));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 927, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel lblCaravanaBovino;
    private javax.swing.JLabel lblCaravanaMadre;
    private javax.swing.JLabel lblCaravanaPadre;
    private javax.swing.JLabel lblFechaNacimientoBovino;
    private javax.swing.JLabel lblFotoBovino;
    private javax.swing.JLabel lblFotoMadre;
    private javax.swing.JLabel lblFotoPadre;
    private javax.swing.JLabel lblRazaBovino;
    private javax.swing.JLabel lblSexoBovino;
    private javax.swing.JLabel lblTipoMacho;
    private javax.swing.JLabel lblTipoMachoText;
    private java.awt.PopupMenu popupMenu1;
    // End of variables declaration//GEN-END:variables

}
