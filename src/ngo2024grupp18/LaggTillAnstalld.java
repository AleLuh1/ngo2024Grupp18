/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo2024grupp18;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.security.SecureRandom;
import java.util.ArrayList;

/**
 *
 * @author alex
 */
public class LaggTillAnstalld extends javax.swing.JFrame {

    private InfDB idb;
    private String aid;
    private String avdid;

    /**
     * Creates new form Anstallda
     */
    public LaggTillAnstalld(InfDB idb, String aid, String avdid) {
        initComponents();
        this.idb = idb;
        this.aid = aid;
        this.avdid = avdid;
        LaggaTillNyAnstalldAid();
        fyllCBAvdNyAnstalld();
        tfLosenordNyAnstalld.setText(skapaSlumpatLosenord());
        tfLosenordNyAnstalld.setEditable(false);
        this.setLocationRelativeTo(null);
        lblAnsvOmradeNyHandlaggare.setVisible(false);
        tfAnsvOmradeNyHandlaggare.setVisible(false);
        lblMentorNyHandlaggare.setVisible(false);
        cbMentorNyHandlaggare.setVisible(false);
        fyllCBMentorNyHandlaggare();
    }

    //Genererar ett nytt aid genom att hitta största aid och sedan göra aid +1
    private void LaggaTillNyAnstalldAid() {
        String nyAnstalldAid = null;
        try {
            //SQL-fråga för att hämta ut största aid som finns i anstalld
            String sqlFragaHogstAid = "SELECT max(aid) FROM anstalld";
            System.out.println(sqlFragaHogstAid);
            //Hämtar ut resultatet från sql-frågan i en sträng 
            String hogstAnstalldAidDB = idb.fetchSingle(sqlFragaHogstAid);
            //Konverterar strängen med högst aid till en int
            int hogstAnstalldAidInt = Integer.parseInt(hogstAnstalldAidDB);
            int nyAnstalldAidInt = hogstAnstalldAidInt + 1;
            System.out.println(nyAnstalldAidInt);
            nyAnstalldAid = Integer.toString(nyAnstalldAidInt);
            tfAidNyAnstalld.setText(nyAnstalldAid);
            tfAidNyAnstalld.setEditable(false);
            lblAidNyAnstalld.requestFocus();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private String skapaSlumpatLosenord() {
        String tecken = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+<>?";
        int losenordLangd = 11;
        SecureRandom slumpatLosenord = new SecureRandom();
        StringBuilder losenord = new StringBuilder(losenordLangd);

        for (int i = 0; i < losenordLangd; i++) {
            int index = slumpatLosenord.nextInt(tecken.length());
            losenord.append(tecken.charAt(index));
        }
        return losenord.toString();
    }

    //Fyller i combo-boxen för avdelning med avd-namn när man lägger till ny anstalld 
    private void fyllCBAvdNyAnstalld() {
        try {
            String sqlFraga = "SELECT namn FROM avdelning";
            System.out.println(sqlFraga);
            ArrayList<String> avdNamnLista = idb.fetchColumn(sqlFraga);
            for (String avdNamn : avdNamnLista) {
                cbAvdNyAnstalld.addItem(avdNamn);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    //Fyller i combo-boxen för mentor (namn på alla anställda) när man lägger till ny handläggare
    private void fyllCBMentorNyHandlaggare() {
        try {
            String sqlFraga = "SELECT aid FROM anstalld";
            System.out.println(sqlFraga);
            ArrayList<String> anstalldAidLista = idb.fetchColumn(sqlFraga);
            for (String anstalldAid : anstalldAidLista) {
                cbMentorNyHandlaggare.addItem(anstalldAid);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLaggTillAnstalldRuta = new javax.swing.JLabel();
        lblFornamnNyAnstalld = new javax.swing.JLabel();
        lblEfternamnNyAnstalld = new javax.swing.JLabel();
        tfFornamnNyAnstalld = new javax.swing.JTextField();
        tfEfternamnNyAnstalld = new javax.swing.JTextField();
        btnSparaNyAnstalld = new javax.swing.JButton();
        btnTillbakaLaggTillAnstalld = new javax.swing.JButton();
        lblAidNyAnstalld = new javax.swing.JLabel();
        tfAidNyAnstalld = new javax.swing.JTextField();
        lblAdressNyAnstalld = new javax.swing.JLabel();
        tfAdressNyAnstalld = new javax.swing.JTextField();
        lblEpostNyAnstalld = new javax.swing.JLabel();
        tfEpostNyAnstalld = new javax.swing.JTextField();
        lblTelefonNyAnstalld = new javax.swing.JLabel();
        tfTelefonNyAnstalld = new javax.swing.JTextField();
        lblAnstallningsdatumNyAnstalld = new javax.swing.JLabel();
        tfAnstallningsdatumNyAnstalld = new javax.swing.JTextField();
        lblLosenordNyAnstalld = new javax.swing.JLabel();
        tfLosenordNyAnstalld = new javax.swing.JTextField();
        lblAvdNyAnstalld = new javax.swing.JLabel();
        lblRollNyAnstalld = new javax.swing.JLabel();
        cbAvdNyAnstalld = new javax.swing.JComboBox<>();
        cbRollNyAnstalld = new javax.swing.JComboBox<>();
        lblAnsvOmradeNyHandlaggare = new javax.swing.JLabel();
        lblMentorNyHandlaggare = new javax.swing.JLabel();
        tfAnsvOmradeNyHandlaggare = new javax.swing.JTextField();
        cbMentorNyHandlaggare = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblLaggTillAnstalldRuta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblLaggTillAnstalldRuta.setText("Lägg till anställd");

        lblFornamnNyAnstalld.setText("Förnamn");

        lblEfternamnNyAnstalld.setText("Efternamn");

        btnSparaNyAnstalld.setText("Spara");
        btnSparaNyAnstalld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSparaNyAnstalldActionPerformed(evt);
            }
        });

        btnTillbakaLaggTillAnstalld.setText("Tillbaka");
        btnTillbakaLaggTillAnstalld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaLaggTillAnstalldActionPerformed(evt);
            }
        });

        lblAidNyAnstalld.setText("Anställnings-ID");

        lblAdressNyAnstalld.setText("Adress");

        lblEpostNyAnstalld.setText("E-post");

        lblTelefonNyAnstalld.setText("Telefon");

        lblAnstallningsdatumNyAnstalld.setText("Anställningsdatum");

        lblLosenordNyAnstalld.setText("Lösenord");

        lblAvdNyAnstalld.setText("Avdelning");

        lblRollNyAnstalld.setText("Roll");

        cbAvdNyAnstalld.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj avdelning" }));

        cbRollNyAnstalld.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj roll", "Admin", "Handläggare" }));
        cbRollNyAnstalld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRollNyAnstalldActionPerformed(evt);
            }
        });

        lblAnsvOmradeNyHandlaggare.setText("Ansvarsområde");

        lblMentorNyHandlaggare.setText("Mentor");

        cbMentorNyHandlaggare.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingen mentor" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnTillbakaLaggTillAnstalld)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSparaNyAnstalld)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblAvdNyAnstalld, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblLosenordNyAnstalld, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTelefonNyAnstalld, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblEpostNyAnstalld, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblAdressNyAnstalld, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblFornamnNyAnstalld, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblEfternamnNyAnstalld, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                .addComponent(lblAidNyAnstalld, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                .addComponent(lblAnstallningsdatumNyAnstalld, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                            .addComponent(lblRollNyAnstalld, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfAdressNyAnstalld)
                            .addComponent(tfEpostNyAnstalld)
                            .addComponent(tfTelefonNyAnstalld)
                            .addComponent(cbRollNyAnstalld, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfFornamnNyAnstalld)
                            .addComponent(tfAidNyAnstalld)
                            .addComponent(tfEfternamnNyAnstalld)
                            .addComponent(tfLosenordNyAnstalld)
                            .addComponent(tfAnstallningsdatumNyAnstalld)
                            .addComponent(cbAvdNyAnstalld, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLaggTillAnstalldRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAnsvOmradeNyHandlaggare, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMentorNyHandlaggare, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfAnsvOmradeNyHandlaggare)
                            .addComponent(cbMentorNyHandlaggare, 0, 350, Short.MAX_VALUE))))
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblLaggTillAnstalldRuta)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAidNyAnstalld)
                            .addComponent(tfAidNyAnstalld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFornamnNyAnstalld)
                        .addGap(6, 6, 6))
                    .addComponent(tfFornamnNyAnstalld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEfternamnNyAnstalld)
                    .addComponent(tfEfternamnNyAnstalld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAdressNyAnstalld)
                    .addComponent(tfAdressNyAnstalld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEpostNyAnstalld)
                    .addComponent(tfEpostNyAnstalld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTelefonNyAnstalld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefonNyAnstalld))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAnstallningsdatumNyAnstalld)
                    .addComponent(tfAnstallningsdatumNyAnstalld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLosenordNyAnstalld)
                    .addComponent(tfLosenordNyAnstalld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAvdNyAnstalld)
                    .addComponent(cbAvdNyAnstalld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRollNyAnstalld)
                    .addComponent(cbRollNyAnstalld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAnsvOmradeNyHandlaggare)
                    .addComponent(tfAnsvOmradeNyHandlaggare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMentorNyHandlaggare)
                    .addComponent(cbMentorNyHandlaggare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSparaNyAnstalld)
                    .addComponent(btnTillbakaLaggTillAnstalld))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSparaNyAnstalldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSparaNyAnstalldActionPerformed
        //get text från fälten och insert i databas
        String nyAnstalldAidStr = tfAidNyAnstalld.getText();
        int nyAnstalldAidInt = Integer.parseInt(nyAnstalldAidStr);

        String nyAnstalldFornamn = tfFornamnNyAnstalld.getText();
        if (nyAnstalldFornamn.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vänligen fyll i ett förnamn");
            return;
        }

        String nyAnstalldEfternamn = tfEfternamnNyAnstalld.getText();
        String nyAnstalldAdress = tfAdressNyAnstalld.getText();
        String nyAnstalldEpost = tfEpostNyAnstalld.getText();
        String nyAnstalldTelefon = tfTelefonNyAnstalld.getText();
        if (!Validering.isKorrektFormatTelnr(nyAnstalldTelefon)) {
                    return;
                }
        String NyAnstalldAnstallningsDatum = tfAnstallningsdatumNyAnstalld.getText();
        //String NyAnstalldLosenord = skapaSlumpatLosenord();
        String NyAnstalldLosenord = tfLosenordNyAnstalld.getText();
        //tfLosenordNyAnstalld.setText(NyAnstalldLosenord);

        String nyAnstalldAvd = cbAvdNyAnstalld.getSelectedItem().toString();

        if (Validering.isKorrektFormatEpostPartner(tfEpostNyAnstalld)) {
            try {
                String sqlFragaAvdNamn = "SELECT avdid FROM avdelning WHERE namn = '" + nyAnstalldAvd + "'";
                System.out.println(sqlFragaAvdNamn);
                String avdIDStr = idb.fetchSingle(sqlFragaAvdNamn);
                int nyAnstalldAvdInt = Integer.parseInt(avdIDStr);
                // När man lägger till ny anställd som blir tilldelad en roll måste även admin/handläggare tabelln
                // uppdateras beroende på vilken roll användaren får
                //Därför måste man ha en if-sats för att lägga in aid i antingen admin om användaren är admin
                // eller i handlaggare om användaren är handläggare

                String sqlLaggTill = "INSERT INTO anstalld (aid, fornamn, efternamn, adress, epost, telefon, anstallningsdatum, losenord, avdelning) VALUES (" + nyAnstalldAidInt + ", '" + nyAnstalldFornamn + "', '" + nyAnstalldEfternamn + "', '" + nyAnstalldAdress + "', '" + nyAnstalldEpost + "', '" + nyAnstalldTelefon + "', str_to_date('" + NyAnstalldAnstallningsDatum + "', '%Y-%m-%d'), '" + NyAnstalldLosenord + "', " + nyAnstalldAvdInt + ")";
                idb.insert(sqlLaggTill);
                JOptionPane.showMessageDialog(null, "Den anställda har lagts till.");

                String nyAnstalldRoll = cbRollNyAnstalld.getSelectedItem().toString();
                if (nyAnstalldRoll.equals("Admin")) {
                    try {
                        String sqlLaggTillRollAdmin = "INSERT INTO admin(aid, behorighetsniva) VALUES (" + nyAnstalldAidInt + ", 1)";
                        System.out.println(sqlLaggTillRollAdmin);
                        idb.insert(sqlLaggTillRollAdmin);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                } else {
                    try {
                        String nyHandlaggareAnsvOmrade = tfAnsvOmradeNyHandlaggare.getText();
                        String mentorStr = cbMentorNyHandlaggare.getSelectedItem().toString();
                        if (mentorStr.equals("Ingen mentor")) {
                            String sqlFraga = "INSERT INTO handlaggare (aid, ansvarighetsomrade, mentor) VALUES (" + nyAnstalldAidInt + ", '" + nyHandlaggareAnsvOmrade + "', null)";
                            System.out.println(sqlFraga);
                            idb.insert(sqlFraga);
                        } else {
                            int mentorAid = Integer.parseInt(mentorStr);
                            String sqlLaggTillRollHandlaggare = "INSERT INTO handlaggare (aid, ansvarighetsomrade, mentor) VALUES (" + nyAnstalldAidInt + ", '" + nyHandlaggareAnsvOmrade + "', " + mentorAid + ")";
                            System.out.println(sqlLaggTillRollHandlaggare);
                            idb.insert(sqlLaggTillRollHandlaggare);
                        }

                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }

            } catch (InfException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnSparaNyAnstalldActionPerformed

    private void btnTillbakaLaggTillAnstalldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaLaggTillAnstalldActionPerformed
        this.dispose();
        Meny nyMeny = new Meny(idb, aid, avdid);
        nyMeny.setVisible(true);
    }//GEN-LAST:event_btnTillbakaLaggTillAnstalldActionPerformed

    private void cbRollNyAnstalldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRollNyAnstalldActionPerformed
        String nyAnstalldRoll = cbRollNyAnstalld.getSelectedItem().toString();
        if (nyAnstalldRoll.equals("Handläggare")) {
            lblAnsvOmradeNyHandlaggare.setVisible(true);
            tfAnsvOmradeNyHandlaggare.setVisible(true);
            lblMentorNyHandlaggare.setVisible(true);
            cbMentorNyHandlaggare.setVisible(true);
        }
    }//GEN-LAST:event_cbRollNyAnstalldActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSparaNyAnstalld;
    private javax.swing.JButton btnTillbakaLaggTillAnstalld;
    private javax.swing.JComboBox<String> cbAvdNyAnstalld;
    private javax.swing.JComboBox<String> cbMentorNyHandlaggare;
    private javax.swing.JComboBox<String> cbRollNyAnstalld;
    private javax.swing.JLabel lblAdressNyAnstalld;
    private javax.swing.JLabel lblAidNyAnstalld;
    private javax.swing.JLabel lblAnstallningsdatumNyAnstalld;
    private javax.swing.JLabel lblAnsvOmradeNyHandlaggare;
    private javax.swing.JLabel lblAvdNyAnstalld;
    private javax.swing.JLabel lblEfternamnNyAnstalld;
    private javax.swing.JLabel lblEpostNyAnstalld;
    private javax.swing.JLabel lblFornamnNyAnstalld;
    private javax.swing.JLabel lblLaggTillAnstalldRuta;
    private javax.swing.JLabel lblLosenordNyAnstalld;
    private javax.swing.JLabel lblMentorNyHandlaggare;
    private javax.swing.JLabel lblRollNyAnstalld;
    private javax.swing.JLabel lblTelefonNyAnstalld;
    private javax.swing.JTextField tfAdressNyAnstalld;
    private javax.swing.JTextField tfAidNyAnstalld;
    private javax.swing.JTextField tfAnstallningsdatumNyAnstalld;
    private javax.swing.JTextField tfAnsvOmradeNyHandlaggare;
    private javax.swing.JTextField tfEfternamnNyAnstalld;
    private javax.swing.JTextField tfEpostNyAnstalld;
    private javax.swing.JTextField tfFornamnNyAnstalld;
    private javax.swing.JTextField tfLosenordNyAnstalld;
    private javax.swing.JTextField tfTelefonNyAnstalld;
    // End of variables declaration//GEN-END:variables
}
