/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo2024grupp18;

import javax.swing.JTextField;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author alex
 */
public class Inloggning extends javax.swing.JFrame {

    private InfDB idb;

    /**
     * Creates new form Inloggning
     */
    public Inloggning(InfDB idb) {
        initComponents();
        this.idb = idb;
        lblFelLosenord.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEpost = new javax.swing.JLabel();
        lblLösenord = new javax.swing.JLabel();
        tfEpost = new javax.swing.JTextField();
        tfLosenord = new javax.swing.JTextField();
        btnLoggaIn = new javax.swing.JButton();
        lblFelLosenord = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblEpost.setText("E-post");

        lblLösenord.setText("Lösenord");

        tfEpost.setText("maria.g@example.com");

        tfLosenord.setText("password123");

        btnLoggaIn.setText("Logga in");
        btnLoggaIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggaInActionPerformed(evt);
            }
        });

        lblFelLosenord.setForeground(new java.awt.Color(255, 0, 0));
        lblFelLosenord.setText("Vänligen ange korrekt e-post eller lösenord");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFelLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLoggaIn))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblEpost, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfEpost, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblLösenord, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                        .addComponent(tfLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(99, 99, 99))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEpost)
                    .addComponent(tfEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLösenord)
                    .addComponent(tfLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLoggaIn)
                    .addComponent(lblFelLosenord))
                .addContainerGap(168, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoggaInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggaInActionPerformed
        String ePost = tfEpost.getText();
        String losen = tfLosenord.getText();

// Kollar att användaren har angett text i rutorna för E-post och lösenord
        if (Validering.finnsText(tfEpost) && Validering.finnsText(tfLosenord)
                && Validering.isKorrektFormatEpost(tfEpost)) {
            try {
                String sqlFraga = "SELECT losenord FROM anstalld WHERE epost = '" + ePost + "'";
                System.out.println(sqlFraga);
                String dbLosen = idb.fetchSingle(sqlFraga);
                if (losen.equals(dbLosen)) {
                    String sqlFraga2 = "SELECT aid FROM anstalld WHERE epost = '" + ePost + "'";
                    System.out.println(sqlFraga2);
                    String dbAid = idb.fetchSingle(sqlFraga2);
                    String sqlFragaprojID = "SELECT pid FROM projekt"; 
                    String pid = idb.fetchSingle(sqlFragaprojID);
                    String sqlFragaAvdID = "SELECT avdelning FROM anstalld WHERE aid = " + dbAid;
                    String avdid = idb.fetchSingle(sqlFragaAvdID);
                    new Meny(idb, dbAid, pid, avdid).setVisible(true);
                    this.setVisible(false);
                } else {
                    lblFelLosenord.setVisible(true);
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

        }
    }//GEN-LAST:event_btnLoggaInActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoggaIn;
    private javax.swing.JLabel lblEpost;
    private javax.swing.JLabel lblFelLosenord;
    private javax.swing.JLabel lblLösenord;
    private javax.swing.JTextField tfEpost;
    private javax.swing.JTextField tfLosenord;
    // End of variables declaration//GEN-END:variables
}
