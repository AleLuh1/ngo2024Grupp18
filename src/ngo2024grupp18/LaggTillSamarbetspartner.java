/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo2024grupp18;

import oru.inf.InfDB;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author ellenor
 */
public class LaggTillSamarbetspartner extends javax.swing.JFrame {

    private InfDB idb;
    private String aid;
    private String avdid;

    /**
     * Creates new form LaggTillPartner
     */
    public LaggTillSamarbetspartner(InfDB idb, String aid, String avdid) {
        initComponents();
        this.idb = idb;
        this.aid = aid;
        this.avdid = avdid;
        LaggaTillNyPartnerID();
        this.setLocationRelativeTo(null);
    }

    // Genererar ett nytt partner-id (pid) när man lägger till nya partners 
    private String LaggaTillNyPartnerID() {
        String nyPartnerId = null;
        try {
            //SQL-fråga för att hämta ut största pid som finns i partner
            String sqlFragaHogstPid = "SELECT max(pid) FROM partner";
            System.out.println(sqlFragaHogstPid);
            //Hämtar ut resultatet från sql-frågan i en sträng 
            String hogstPartnerPidDB = idb.fetchSingle(sqlFragaHogstPid);
            //Konverterar strängen med högst pid till en int
            int hogstPartnerPidInt = Integer.parseInt(hogstPartnerPidDB);
            int nyPartnerPidInt = hogstPartnerPidInt + 1;
            System.out.println(nyPartnerPidInt);
            nyPartnerId = Integer.toString(nyPartnerPidInt);
            tfPartnerIDLaggTillPartner.setText(nyPartnerId);
            tfPartnerIDLaggTillPartner.setEditable(false);
            lblPartnerIDLaggTillPartner.requestFocus();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return nyPartnerId;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSamarbetspartnerRuta = new javax.swing.JLabel();
        lblProjektIDLaggTillPartner = new javax.swing.JLabel();
        lblNamnLaggTillPartner = new javax.swing.JLabel();
        lblEpostLaggTillPartner = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblTnrLaggTillPartner = new javax.swing.JLabel();
        lblAdressLaggTillPartner = new javax.swing.JLabel();
        lblBranchLaggTillPartner = new javax.swing.JLabel();
        lblStadLaggTillPartner = new javax.swing.JLabel();
        tfProjektIDLaggTillPartner = new javax.swing.JTextField();
        tfProjektNamnLaggTillPartner = new javax.swing.JTextField();
        tfKontaktpersonLaggTillPartner = new javax.swing.JTextField();
        tfEpostLaggTillPartner = new javax.swing.JTextField();
        tfTelefonLaggTillPartner = new javax.swing.JTextField();
        tfAdressLaggTillPartner = new javax.swing.JTextField();
        tfBranchLaggTillPartner = new javax.swing.JTextField();
        tfStadLaggTillPartner = new javax.swing.JTextField();
        btnTillbakaLaggTillPartner = new javax.swing.JButton();
        btnSparaLaggTillPartner = new javax.swing.JButton();
        lblPartnerIDLaggTillPartner = new javax.swing.JLabel();
        tfPartnerIDLaggTillPartner = new javax.swing.JTextField();
        lblPartnerNamnLaggTillPartner = new javax.swing.JLabel();
        tfPartnerNamnLaggTillPartner = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblSamarbetspartnerRuta.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblSamarbetspartnerRuta.setText("Lägg till samarbetspartner ");

        lblProjektIDLaggTillPartner.setText("Projekt-ID");

        lblNamnLaggTillPartner.setText("Projektnamn");

        lblEpostLaggTillPartner.setText("Kontaktperson");

        jLabel4.setText("E-post");

        lblTnrLaggTillPartner.setText("Telefon");

        lblAdressLaggTillPartner.setText("Adress");

        lblBranchLaggTillPartner.setText("Branch");

        lblStadLaggTillPartner.setText("Stad");

        btnTillbakaLaggTillPartner.setText("Tillbaka");
        btnTillbakaLaggTillPartner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaLaggTillPartnerActionPerformed(evt);
            }
        });

        btnSparaLaggTillPartner.setText("Spara");
        btnSparaLaggTillPartner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSparaLaggTillPartnerActionPerformed(evt);
            }
        });

        lblPartnerIDLaggTillPartner.setText("Partner-ID");

        lblPartnerNamnLaggTillPartner.setText("Partnernamn");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTillbakaLaggTillPartner)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSparaLaggTillPartner)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSamarbetspartnerRuta)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblStadLaggTillPartner)
                                        .addComponent(lblProjektIDLaggTillPartner)
                                        .addComponent(lblEpostLaggTillPartner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4)
                                        .addComponent(lblTnrLaggTillPartner)
                                        .addComponent(lblAdressLaggTillPartner)
                                        .addComponent(lblBranchLaggTillPartner)
                                        .addComponent(lblPartnerIDLaggTillPartner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblNamnLaggTillPartner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(lblPartnerNamnLaggTillPartner, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfProjektIDLaggTillPartner)
                                    .addComponent(tfProjektNamnLaggTillPartner)
                                    .addComponent(tfKontaktpersonLaggTillPartner)
                                    .addComponent(tfEpostLaggTillPartner)
                                    .addComponent(tfTelefonLaggTillPartner)
                                    .addComponent(tfAdressLaggTillPartner)
                                    .addComponent(tfBranchLaggTillPartner)
                                    .addComponent(tfStadLaggTillPartner, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                    .addComponent(tfPartnerIDLaggTillPartner)
                                    .addComponent(tfPartnerNamnLaggTillPartner))))
                        .addContainerGap(54, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblSamarbetspartnerRuta)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPartnerIDLaggTillPartner)
                    .addComponent(tfPartnerIDLaggTillPartner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPartnerNamnLaggTillPartner)
                    .addComponent(tfPartnerNamnLaggTillPartner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProjektIDLaggTillPartner, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfProjektIDLaggTillPartner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNamnLaggTillPartner, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfProjektNamnLaggTillPartner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEpostLaggTillPartner)
                    .addComponent(tfKontaktpersonLaggTillPartner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfEpostLaggTillPartner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTnrLaggTillPartner, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfTelefonLaggTillPartner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAdressLaggTillPartner, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfAdressLaggTillPartner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBranchLaggTillPartner)
                    .addComponent(tfBranchLaggTillPartner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfStadLaggTillPartner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStadLaggTillPartner))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTillbakaLaggTillPartner)
                    .addComponent(btnSparaLaggTillPartner))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTillbakaLaggTillPartnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaLaggTillPartnerActionPerformed
        this.toBack();
        Samarbetspartner nyPartner = new Samarbetspartner(idb, aid, avdid);
        nyPartner.setVisible(true);
        nyPartner.toFront();
    }//GEN-LAST:event_btnTillbakaLaggTillPartnerActionPerformed

    private void btnSparaLaggTillPartnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSparaLaggTillPartnerActionPerformed
        // kontrollerar om textfields är tomma
        String PartnerID = tfPartnerIDLaggTillPartner.getText();
        //Gör om nya partnerID till en int igen för att kunna lägga i db 
        int nyPartnerIdInt = Integer.parseInt(PartnerID);
        
        String partnerNamn = tfPartnerNamnLaggTillPartner.getText();
        
        String projektNamn = tfProjektNamnLaggTillPartner.getText();
        
        String projektIDStr = tfProjektIDLaggTillPartner.getText();
        int projektID = Integer.parseInt(projektIDStr); 
        
        String laggTillKontaktperson = tfKontaktpersonLaggTillPartner.getText();

        if (laggTillKontaktperson.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vänligen fyll i kontaktperson");
        }

        String laggTillKontaktEpost = tfEpostLaggTillPartner.getText();

        if (laggTillKontaktEpost.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vänligen fyll i E-post");
        }

        String laggTillTelefonnummer = tfTelefonLaggTillPartner.getText();

        if (laggTillTelefonnummer.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vänligen fyll i telefonnummer");
        }

        String laggTillAdress = tfAdressLaggTillPartner.getText();

        if (laggTillAdress.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vänligen fyll i adress");
        }

        String laggTillBranch = tfBranchLaggTillPartner.getText();

        if (laggTillBranch.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vänligen fyll i branch");
        }

        String laggTillStadStr = tfStadLaggTillPartner.getText();
        // Gör om stad från String till int för att kunna lägga in i db
        int laggTillStad = Integer.parseInt(laggTillStadStr);

        if (laggTillStadStr.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vänligen fyll i stad");
        }

        try {
            String sqlFraga = "INSERT INTO partner (pid, namn, kontaktperson, kontaktepost, telefon, adress, branch, stad) VALUES (" + nyPartnerIdInt + ",'" + partnerNamn + "', '" + laggTillKontaktperson + "', '" + laggTillKontaktEpost + "', '" + laggTillTelefonnummer + "', '" + laggTillAdress + "', '" + laggTillBranch + "', " + laggTillStad + ")";
            idb.insert(sqlFraga);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }


    }//GEN-LAST:event_btnSparaLaggTillPartnerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSparaLaggTillPartner;
    private javax.swing.JButton btnTillbakaLaggTillPartner;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblAdressLaggTillPartner;
    private javax.swing.JLabel lblBranchLaggTillPartner;
    private javax.swing.JLabel lblEpostLaggTillPartner;
    private javax.swing.JLabel lblNamnLaggTillPartner;
    private javax.swing.JLabel lblPartnerIDLaggTillPartner;
    private javax.swing.JLabel lblPartnerNamnLaggTillPartner;
    private javax.swing.JLabel lblProjektIDLaggTillPartner;
    private javax.swing.JLabel lblSamarbetspartnerRuta;
    private javax.swing.JLabel lblStadLaggTillPartner;
    private javax.swing.JLabel lblTnrLaggTillPartner;
    private javax.swing.JTextField tfAdressLaggTillPartner;
    private javax.swing.JTextField tfBranchLaggTillPartner;
    private javax.swing.JTextField tfEpostLaggTillPartner;
    private javax.swing.JTextField tfKontaktpersonLaggTillPartner;
    private javax.swing.JTextField tfPartnerIDLaggTillPartner;
    private javax.swing.JTextField tfPartnerNamnLaggTillPartner;
    private javax.swing.JTextField tfProjektIDLaggTillPartner;
    private javax.swing.JTextField tfProjektNamnLaggTillPartner;
    private javax.swing.JTextField tfStadLaggTillPartner;
    private javax.swing.JTextField tfTelefonLaggTillPartner;
    // End of variables declaration//GEN-END:variables
}
