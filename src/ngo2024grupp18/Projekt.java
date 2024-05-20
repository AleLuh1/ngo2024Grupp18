/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo2024grupp18;

import java.util.HashMap;
import oru.inf.InfDB;

/**
 *
 * @author alex
 */
public class Projekt extends javax.swing.JFrame {
    private InfDB idb;
    private String aid;
    private String avdid;
    /**
     * Creates new form Projekt
     */
    public Projekt(InfDB idb, String aid, String avdid) {
        initComponents();
        this.idb = idb;
        this.aid = aid;
        this.avdid = avdid;
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMinaProjekt = new javax.swing.JButton();
        btnAvdProjekt = new javax.swing.JButton();
        btnAllaProjekt = new javax.swing.JButton();
        btnTillbakaProj = new javax.swing.JButton();
        lblProjektRuta = new javax.swing.JLabel();
        btnLandProjekt = new javax.swing.JButton();
        btnHallbarhetsMal = new javax.swing.JButton();
        btnSokAvdProjDatum = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnMinaProjekt.setText("Mina projekt");
        btnMinaProjekt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinaProjektActionPerformed(evt);
            }
        });

        btnAvdProjekt.setText("Avdelningens projekt");
        btnAvdProjekt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvdProjektActionPerformed(evt);
            }
        });

        btnAllaProjekt.setText("Alla projekt");
        btnAllaProjekt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllaProjektActionPerformed(evt);
            }
        });

        btnTillbakaProj.setText("Tillbaka");
        btnTillbakaProj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaProjActionPerformed(evt);
            }
        });

        lblProjektRuta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblProjektRuta.setText("Projekt");

        btnLandProjekt.setText("Länder");
        btnLandProjekt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLandProjektActionPerformed(evt);
            }
        });

        btnHallbarhetsMal.setText("Hållbarhetsmål");
        btnHallbarhetsMal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHallbarhetsMalActionPerformed(evt);
            }
        });

        btnSokAvdProjDatum.setText("Sök projekt på datum");
        btnSokAvdProjDatum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokAvdProjDatumActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTillbakaProj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                        .addComponent(btnSokAvdProjDatum)
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnHallbarhetsMal)
                            .addComponent(btnLandProjekt)
                            .addComponent(lblProjektRuta)
                            .addComponent(btnAllaProjekt)
                            .addComponent(btnAvdProjekt)
                            .addComponent(btnMinaProjekt))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblProjektRuta)
                .addGap(12, 12, 12)
                .addComponent(btnMinaProjekt)
                .addGap(18, 18, 18)
                .addComponent(btnAvdProjekt)
                .addGap(18, 18, 18)
                .addComponent(btnLandProjekt)
                .addGap(18, 18, 18)
                .addComponent(btnAllaProjekt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(btnHallbarhetsMal)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTillbakaProj)
                    .addComponent(btnSokAvdProjDatum))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMinaProjektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinaProjektActionPerformed
        new MinaProjekt(idb, aid, avdid).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnMinaProjektActionPerformed

    private void btnTillbakaProjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaProjActionPerformed
        this.toBack();
        Meny nyMeny = new Meny(idb, aid, avdid);
        nyMeny.setVisible(true);
        nyMeny.toFront();
        
    }//GEN-LAST:event_btnTillbakaProjActionPerformed

    private void btnAvdProjektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvdProjektActionPerformed
        new AvdelningensProjekt(idb, aid, avdid).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnAvdProjektActionPerformed
    private void btnAllaProjektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllaProjektActionPerformed
       new AllaProjekt(idb, aid, avdid).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnAllaProjektActionPerformed

    private void btnLandProjektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLandProjektActionPerformed
        new Land(idb,aid,avdid).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnLandProjektActionPerformed

    private void btnHallbarhetsMalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHallbarhetsMalActionPerformed
        new HallbarhetsMal(idb).setVisible(true); 
        setVisible(false);
    }//GEN-LAST:event_btnHallbarhetsMalActionPerformed

    private void btnSokAvdProjDatumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokAvdProjDatumActionPerformed
        this.setVisible(false);
        new SokProjekt(idb, aid, avdid).setVisible(true);
    }//GEN-LAST:event_btnSokAvdProjDatumActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAllaProjekt;
    private javax.swing.JButton btnAvdProjekt;
    private javax.swing.JButton btnHallbarhetsMal;
    private javax.swing.JButton btnLandProjekt;
    private javax.swing.JButton btnMinaProjekt;
    private javax.swing.JButton btnSokAvdProjDatum;
    private javax.swing.JButton btnTillbakaProj;
    private javax.swing.JLabel lblProjektRuta;
    // End of variables declaration//GEN-END:variables
}
