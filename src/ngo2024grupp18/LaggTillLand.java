/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo2024grupp18;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;

/**
 *
 * @author ellenor
 */
public class LaggTillLand extends javax.swing.JFrame {

    private InfDB idb;
    private String aid;
    private String avdid;

    /**
     * Creates new form LaggTillLand
     */
    public LaggTillLand(InfDB idb, String aid, String avdid) {
        initComponents();
        this.idb = idb;
        this.aid = aid;
        this.avdid = avdid;
        this.setLocationRelativeTo(null);
        LaggaTillNyLid();
    }

    //Genererar ny land-id vid tillägg av nytt land genom att +1 på högsta befintliga land-id
    private String LaggaTillNyLid() {
        String nyLid = null;
        try {
            //SQL-fråga för att hämta ut största land-id (lid) som finns i land
            String sqlFragaHogstLid = "SELECT max(lid) FROM land";
            System.out.println(sqlFragaHogstLid);
            //Hämtar ut resultatet från sql-frågan i en sträng 
            String hogstLidDB = idb.fetchSingle(sqlFragaHogstLid);
            //Konverterar strängen med högst lid till en int
            int hogstLidInt = Integer.parseInt(hogstLidDB);
            int nyLidInt = hogstLidInt + 1;
            System.out.println(nyLidInt);
            nyLid = Integer.toString(nyLidInt);
            tfLandIDLaggTillLand.setText(nyLid);
            tfLandIDLaggTillLand.setEditable(false);
            lblLandIDLaggTillLand.requestFocus();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return nyLid;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblLandIDLaggTillLand = new javax.swing.JLabel();
        lblNamnLaggTillLand = new javax.swing.JLabel();
        lblValutaLaggTillLand = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblTidszonLaggTillLand = new javax.swing.JLabel();
        lblPolitiskStrukturLaggTillLand = new javax.swing.JLabel();
        lblEkonomiLaggTillLand = new javax.swing.JLabel();
        tfLandIDLaggTillLand = new javax.swing.JTextField();
        tfNamnLaggTillLand = new javax.swing.JTextField();
        tfSprakLaggTillLand = new javax.swing.JTextField();
        tfValutaLaggTillLand = new javax.swing.JTextField();
        tfTidszonLaggTillLand = new javax.swing.JTextField();
        tfPolitiskStrukturLaggTillLand = new javax.swing.JTextField();
        tfEkonomiLaggTillLand = new javax.swing.JTextField();
        btnTillbakaLaggTillLand = new javax.swing.JButton();
        btnSparaLaggTillLand = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setText("Lägg till land ");

        lblLandIDLaggTillLand.setText("Land-ID");

        lblNamnLaggTillLand.setText("Namn");

        lblValutaLaggTillLand.setText("Språk");

        jLabel5.setText("Valuta");

        lblTidszonLaggTillLand.setText("Tidszon");

        lblPolitiskStrukturLaggTillLand.setText("Politisk struktur ");

        lblEkonomiLaggTillLand.setText("Ekonomi");

        btnTillbakaLaggTillLand.setText("Tillbaka");
        btnTillbakaLaggTillLand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaLaggTillLandActionPerformed(evt);
            }
        });

        btnSparaLaggTillLand.setText("Spara");
        btnSparaLaggTillLand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSparaLaggTillLandActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnSparaLaggTillLand)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblPolitiskStrukturLaggTillLand)
                                        .addComponent(lblEkonomiLaggTillLand))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfEkonomiLaggTillLand, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(4, 4, 4)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tfPolitiskStrukturLaggTillLand, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblLandIDLaggTillLand)
                                        .addComponent(lblNamnLaggTillLand)
                                        .addComponent(lblValutaLaggTillLand)
                                        .addComponent(jLabel5)
                                        .addComponent(lblTidszonLaggTillLand))
                                    .addGap(60, 60, 60)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfValutaLaggTillLand, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfTidszonLaggTillLand, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfSprakLaggTillLand, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfNamnLaggTillLand, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfLandIDLaggTillLand, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnTillbakaLaggTillLand)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLandIDLaggTillLand)
                    .addComponent(tfLandIDLaggTillLand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNamnLaggTillLand)
                    .addComponent(tfNamnLaggTillLand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValutaLaggTillLand)
                    .addComponent(tfSprakLaggTillLand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(tfValutaLaggTillLand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTidszonLaggTillLand)
                    .addComponent(tfTidszonLaggTillLand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPolitiskStrukturLaggTillLand)
                    .addComponent(tfPolitiskStrukturLaggTillLand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEkonomiLaggTillLand)
                    .addComponent(tfEkonomiLaggTillLand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTillbakaLaggTillLand)
                    .addComponent(btnSparaLaggTillLand))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTillbakaLaggTillLandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaLaggTillLandActionPerformed
        this.toBack();
        Land nyttLand = new Land(idb, aid, avdid);
        nyttLand.setVisible(true);
        nyttLand.toFront();


    }//GEN-LAST:event_btnTillbakaLaggTillLandActionPerformed

    private void btnSparaLaggTillLandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSparaLaggTillLandActionPerformed
        //Gör om nya lid från String till int för att kunna lägga in i db
        String nyLidStr = tfLandIDLaggTillLand.getText();
        int nyLid = Integer.parseInt(nyLidStr);
        
        // kontrollerar om textfields är tomma
        String laggTillNamn = tfNamnLaggTillLand.getText();

        if (laggTillNamn.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vänligen fyll i namn");

        }

        String laggTillSprak = tfSprakLaggTillLand.getText();

        if (laggTillSprak.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vänligen fyll i språk");

        }

        String laggTillValuta = tfValutaLaggTillLand.getText();

        if (laggTillValuta.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vänligen fyll i valuta");

        }

        String laggTillTidszon = tfTidszonLaggTillLand.getText();

        if (laggTillTidszon.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vänligen fyll i tidszon");

        }

        String laggTillPolitiskStruktur = tfPolitiskStrukturLaggTillLand.getText();

        if (laggTillPolitiskStruktur.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vänligen fyll i politisk struktur");

        }
        String laggTillEkonomi = tfEkonomiLaggTillLand.getText();

        if (laggTillEkonomi.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vänligen fyll i ekonomi");

        }

        try {
            String landID = tfLandIDLaggTillLand.getText();
            String namn = tfNamnLaggTillLand.getText();
            String sprak = tfSprakLaggTillLand.getText();
            String valuta = tfValutaLaggTillLand.getText();
            String tidszon = tfTidszonLaggTillLand.getText();
            String politiskStruktur = tfPolitiskStrukturLaggTillLand.getText();
            String ekonomi = tfEkonomiLaggTillLand.getText();

            String sqlFraga = " INSERT INTO land WHERE lid = (lid, namn, sprak, valuta, tidszon, politisk_struktur, ekonomi) VALUES ('" + landID + "','" + namn + "', '" + sprak + "', '" + valuta + "', '" + tidszon + "', '" + politiskStruktur + "', '" + ekonomi + "')";
            idb.insert(sqlFraga);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }


    }//GEN-LAST:event_btnSparaLaggTillLandActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSparaLaggTillLand;
    private javax.swing.JButton btnTillbakaLaggTillLand;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblEkonomiLaggTillLand;
    private javax.swing.JLabel lblLandIDLaggTillLand;
    private javax.swing.JLabel lblNamnLaggTillLand;
    private javax.swing.JLabel lblPolitiskStrukturLaggTillLand;
    private javax.swing.JLabel lblTidszonLaggTillLand;
    private javax.swing.JLabel lblValutaLaggTillLand;
    private javax.swing.JTextField tfEkonomiLaggTillLand;
    private javax.swing.JTextField tfLandIDLaggTillLand;
    private javax.swing.JTextField tfNamnLaggTillLand;
    private javax.swing.JTextField tfPolitiskStrukturLaggTillLand;
    private javax.swing.JTextField tfSprakLaggTillLand;
    private javax.swing.JTextField tfTidszonLaggTillLand;
    private javax.swing.JTextField tfValutaLaggTillLand;
    // End of variables declaration//GEN-END:variables
}
