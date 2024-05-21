/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo2024grupp18;

import oru.inf.InfDB;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author alex
 */
public class AllaProjekt extends javax.swing.JFrame {

    private InfDB idb;
    private String aid;
    private String avdid;

    /**
     * Creates new form AllaProjekt
     */
    public AllaProjekt(InfDB idb, String aid, String avdid) {
        initComponents();
        this.idb = idb;
        this.aid = aid;
        this.avdid = avdid;
        fyllCBAllaProjekt();
        this.setLocationRelativeTo(null);
    }

    // CB = combobox
    public void fyllCBAllaProjekt() {
        try {
            String sqlFraga = "SELECT projektnamn FROM projekt";
            System.out.println(sqlFraga);
            ArrayList<String> projektNamnLista = idb.fetchColumn(sqlFraga);

            for (String ettProjekt : projektNamnLista) {
                cbAllaProjekt.addItem(ettProjekt);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }

    }

    // Genererar ny projekt-id (pid) genom att lägga till +1 på största befintliga pid
    private String LaggaTillNyPid() {
        String nyProjektPid = null;
        try {
            //SQL-fråga för att hämta ut största pid som finns i projekt
            String sqlFragaHogstPid = "SELECT max(pid) FROM projekt";
            System.out.println(sqlFragaHogstPid);
            //Hämtar ut resultatet från sql-frågan i en sträng 
            String hogstProjektPidDB = idb.fetchSingle(sqlFragaHogstPid);
            //Konverterar strängen med högst pid till en int
            int hogstProjektPidInt = Integer.parseInt(hogstProjektPidDB);
            int nyProjektPidInt = hogstProjektPidInt + 1;
            System.out.println(nyProjektPidInt);
            nyProjektPid = Integer.toString(nyProjektPidInt);
            tfNyttProjektNyPid.setText(nyProjektPid);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return nyProjektPid;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTillbakaAllaProj = new javax.swing.JButton();
        lblAllaProjektRuta = new javax.swing.JLabel();
        cbAllaProjekt = new javax.swing.JComboBox<>();
        lblBeskrivningAllaProjekt = new javax.swing.JLabel();
        lblStartDatumAllaProjekt = new javax.swing.JLabel();
        lblSlutdatumAllaProjekt = new javax.swing.JLabel();
        lblKostnadAllaProjekt = new javax.swing.JLabel();
        lblStatusAllaProjekt = new javax.swing.JLabel();
        lblPrioAllaProjekt = new javax.swing.JLabel();
        lblLandAllaProjekt = new javax.swing.JLabel();
        lblProduktchefAllaProjekt = new javax.swing.JLabel();
        tfProjektchefAllaProjekt = new javax.swing.JTextField();
        tfBeskrivningAllaProjekt = new javax.swing.JTextField();
        tfStartdatumAllaProjekt = new javax.swing.JTextField();
        tfSlutDatumAllaProjekt = new javax.swing.JTextField();
        tfKostnadAllaProjekt = new javax.swing.JTextField();
        tfStatusAllaProjekt = new javax.swing.JTextField();
        tfPrioAllaProjekt = new javax.swing.JTextField();
        tfLandAllaProjekt = new javax.swing.JTextField();
        bnTaBortAllaProjekt = new javax.swing.JButton();
        btnAndraAllaProjekt = new javax.swing.JButton();
        lblProjektnamnAllaProjekt = new javax.swing.JLabel();
        tfProjektnamnAllaProjekt = new javax.swing.JTextField();
        tfNyttProjektNyPid = new javax.swing.JTextField();
        lblNyttProjektNyPid = new javax.swing.JLabel();
        btnLaggTillProjektAllaProjekt = new javax.swing.JButton();
        lblHallbarhetsmalAllaProjekt = new javax.swing.JLabel();
        tfHallbarhetsmalAllaProjekt = new javax.swing.JTextField();
        cbHallbTest = new javax.swing.JComboBox<>();
        lblHallbTest = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnTillbakaAllaProj.setText("Tillbaka");
        btnTillbakaAllaProj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaAllaProjActionPerformed(evt);
            }
        });

        lblAllaProjektRuta.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblAllaProjektRuta.setText("Alla projekt");

        cbAllaProjekt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj projekt" }));
        cbAllaProjekt.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cbAllaProjektPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        lblBeskrivningAllaProjekt.setText("Beskrivning");

        lblStartDatumAllaProjekt.setText("Startdatum");

        lblSlutdatumAllaProjekt.setText("Slutdatum");

        lblKostnadAllaProjekt.setText("Kostnad");

        lblStatusAllaProjekt.setText("Status");

        lblPrioAllaProjekt.setText("Prioritet");

        lblLandAllaProjekt.setText("Land");

        lblProduktchefAllaProjekt.setText("Projektchef");

        bnTaBortAllaProjekt.setText("Ta bort projekt");
        bnTaBortAllaProjekt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnTaBortAllaProjektActionPerformed(evt);
            }
        });

        btnAndraAllaProjekt.setText("Spara ändringar");
        btnAndraAllaProjekt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndraAllaProjektActionPerformed(evt);
            }
        });

        lblProjektnamnAllaProjekt.setText("Projektnamn");

        lblNyttProjektNyPid.setText("Projekt-ID");

        btnLaggTillProjektAllaProjekt.setText("Lägg till projekt");
        btnLaggTillProjektAllaProjekt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaggTillProjektAllaProjektActionPerformed(evt);
            }
        });

        lblHallbarhetsmalAllaProjekt.setText("Hållbarhetsmål");

        lblHallbTest.setText("HållbarhetsmålTest");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnTillbakaAllaProj)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbAllaProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAllaProjektRuta)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblProjektnamnAllaProjekt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblBeskrivningAllaProjekt)
                                .addComponent(lblStartDatumAllaProjekt)
                                .addComponent(lblSlutdatumAllaProjekt)
                                .addComponent(lblKostnadAllaProjekt)
                                .addComponent(lblStatusAllaProjekt)
                                .addComponent(lblPrioAllaProjekt)
                                .addComponent(lblLandAllaProjekt)
                                .addComponent(lblProduktchefAllaProjekt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblNyttProjektNyPid, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHallbarhetsmalAllaProjekt)))
                    .addComponent(lblHallbTest, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAndraAllaProjekt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                .addComponent(bnTaBortAllaProjekt))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnLaggTillProjektAllaProjekt)))
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfProjektchefAllaProjekt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfStartdatumAllaProjekt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfSlutDatumAllaProjekt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfKostnadAllaProjekt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfStatusAllaProjekt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPrioAllaProjekt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfBeskrivningAllaProjekt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfLandAllaProjekt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfProjektnamnAllaProjekt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(tfNyttProjektNyPid, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfHallbarhetsmalAllaProjekt))
                            .addComponent(cbHallbTest, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblAllaProjektRuta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAllaProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLaggTillProjektAllaProjekt))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNyttProjektNyPid)
                    .addComponent(tfNyttProjektNyPid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProjektnamnAllaProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfProjektnamnAllaProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProduktchefAllaProjekt)
                    .addComponent(tfProjektchefAllaProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBeskrivningAllaProjekt)
                    .addComponent(tfBeskrivningAllaProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStartDatumAllaProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfStartdatumAllaProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSlutdatumAllaProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSlutDatumAllaProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKostnadAllaProjekt)
                    .addComponent(tfKostnadAllaProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStatusAllaProjekt)
                    .addComponent(tfStatusAllaProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrioAllaProjekt)
                    .addComponent(tfPrioAllaProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLandAllaProjekt)
                    .addComponent(tfLandAllaProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHallbarhetsmalAllaProjekt)
                    .addComponent(tfHallbarhetsmalAllaProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAndraAllaProjekt)
                    .addComponent(bnTaBortAllaProjekt)
                    .addComponent(btnTillbakaAllaProj))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbHallbTest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHallbTest))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbAllaProjektPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbAllaProjektPopupMenuWillBecomeInvisible

        String projektNamn = cbAllaProjekt.getSelectedItem().toString();
        try {
            String sqlFraga = "SELECT * FROM projekt WHERE projektnamn = '" + projektNamn + "'";
            System.out.println(sqlFraga);

            HashMap<String, String> projektNamnLista = idb.fetchRow(sqlFraga);

5275c0ccaa982fc07bb583e8cb8ed0322e96dc6a
            String sqlFragaHallbMal = "SELECT DISTINCT namn FROM hallbarhetsmal JOIN proj_hallbarhet ON proj_hallbarhet.hid = hallbarhetsmal.hid JOIN projekt ON projekt.pid = proj_hallbarhet.pid WHERE projektnamn = '" + projektNamn + "'";
            System.out.println(sqlFragaHallbMal);
            ArrayList<String> projektHallbMal = idb.fetchColumn(sqlFragaHallbMal); 
            for(String ettMal : projektHallbMal) {
                cbHallbTest.addItem(ettMal);
            }
            
            if (projektNamnLista != null) {
                String sqlFraga2 = "SELECT namn FROM land WHERE lid = '" + projektNamnLista.get("land") + "'";
                String land = idb.fetchSingle(sqlFraga2);

                String sqlFraga3 = "SELECT fornamn FROM anstalld WHERE aid ='" + projektNamnLista.get("projektchef") + "'";
                String projektchef = idb.fetchSingle(sqlFraga3);

                tfNyttProjektNyPid.setText(projektNamnLista.get("pid"));
                tfProjektnamnAllaProjekt.setText(projektNamnLista.get("projektnamn"));
                tfProjektchefAllaProjekt.setText(projektchef);
                tfBeskrivningAllaProjekt.setText(projektNamnLista.get("beskrivning"));
                tfStartdatumAllaProjekt.setText(projektNamnLista.get("startdatum"));
                tfSlutDatumAllaProjekt.setText(projektNamnLista.get("slutdatum"));
                tfKostnadAllaProjekt.setText(projektNamnLista.get("kostnad"));
                tfStatusAllaProjekt.setText(projektNamnLista.get("status"));
                tfPrioAllaProjekt.setText(projektNamnLista.get("prioritet"));
                tfLandAllaProjekt.setText(land);
                tfHallbarhetsmalAllaProjekt.setText(("hallbarhetsmal"));

            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }


    }//GEN-LAST:event_cbAllaProjektPopupMenuWillBecomeInvisible

    private void btnTillbakaAllaProjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaAllaProjActionPerformed
        this.toBack();
        Projekt nyttProject = new Projekt(idb, aid, avdid);
        nyttProject.setVisible(true);
        nyttProject.toFront();
    }//GEN-LAST:event_btnTillbakaAllaProjActionPerformed

    private void btnAndraAllaProjektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraAllaProjektActionPerformed
        try {
            String projektNamn = cbAllaProjekt.getSelectedItem().toString();

            String projektnamn = tfProjektnamnAllaProjekt.getText();
            String projektchef = tfProjektchefAllaProjekt.getText();
            String beskrivning = tfBeskrivningAllaProjekt.getText();
            String startdatum = tfStartdatumAllaProjekt.getText();
            String slutdatum = tfSlutDatumAllaProjekt.getText();
            String kostnad = tfKostnadAllaProjekt.getText();
            String status = tfStatusAllaProjekt.getText();
            String prioritet = tfPrioAllaProjekt.getText();
            String land = tfLandAllaProjekt.getText();

            String sqlFraga = "UPDATE projekt SET projektnamn = '" + projektnamn + "', projektchef = " + projektchef + ", beskrivning = '" + beskrivning + "', startdatum = '" + startdatum + "', slutdatum = '" + slutdatum + "', kostnad = '" + kostnad + "', status = '" + status + "', prioritet = '" + prioritet + "', land = " + land + " WHERE projektnamn = '" + projektNamn + "'";
            idb.update(sqlFraga);
            cbAllaProjekt.removeAllItems();
            fyllCBAllaProjekt();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnAndraAllaProjektActionPerformed

    private void bnTaBortAllaProjektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnTaBortAllaProjektActionPerformed

        try {

            String projektNamn = cbAllaProjekt.getSelectedItem().toString();
            String sqlFragaPid = "SELECT pid FROM projekt WHERE projektnamn = '" + projektNamn + "'";
            System.out.println(sqlFragaPid);
            String pid = idb.fetchSingle(sqlFragaPid);

            String sqlFraga1 = "DELETE FROM ans_proj WHERE pid = " + pid + "";
            System.out.println(sqlFraga1);
            idb.delete(sqlFraga1);

            String sqlFraga2 = "DELETE FROM proj_hallbarhet WHERE pid = " + pid + "";
            System.out.println(sqlFraga2);
            idb.delete(sqlFraga2);

            String sqlFraga3 = "DELETE FROM projekt_partner WHERE pid = " + pid + "";
            System.out.println(sqlFraga3);
            idb.delete(sqlFraga3);

            String sqlFraga4 = "DELETE FROM projekt WHERE pid = " + pid + "";
            System.out.println(sqlFraga4);
            idb.delete(sqlFraga4);

            // rensar textfields från uppgifter
            tfNyttProjektNyPid.setText(" ");
            tfProjektnamnAllaProjekt.setText(" ");
            tfProjektchefAllaProjekt.setText(" ");
            tfBeskrivningAllaProjekt.setText(" ");
            tfStartdatumAllaProjekt.setText(" ");
            tfSlutDatumAllaProjekt.setText(" ");
            tfKostnadAllaProjekt.setText(" ");
            tfStatusAllaProjekt.setText(" ");
            tfPrioAllaProjekt.setText(" ");
            tfLandAllaProjekt.setText(" ");
            tfHallbarhetsmalAllaProjekt.setText(" ");

            // uppdaterar comboboxen
            cbAllaProjekt.removeAllItems();
            fyllCBAllaProjekt();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_bnTaBortAllaProjektActionPerformed

    private void btnLaggTillProjektAllaProjektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaggTillProjektAllaProjektActionPerformed

        new LaggTillProjekt(idb, aid, avdid).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnLaggTillProjektAllaProjektActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnTaBortAllaProjekt;
    private javax.swing.JButton btnAndraAllaProjekt;
    private javax.swing.JButton btnLaggTillProjektAllaProjekt;
    private javax.swing.JButton btnTillbakaAllaProj;
    private javax.swing.JComboBox<String> cbAllaProjekt;
    private javax.swing.JComboBox<String> cbHallbTest;
    private javax.swing.JLabel lblAllaProjektRuta;
    private javax.swing.JLabel lblBeskrivningAllaProjekt;
    private javax.swing.JLabel lblHallbTest;
    private javax.swing.JLabel lblHallbarhetsmalAllaProjekt;
    private javax.swing.JLabel lblKostnadAllaProjekt;
    private javax.swing.JLabel lblLandAllaProjekt;
    private javax.swing.JLabel lblNyttProjektNyPid;
    private javax.swing.JLabel lblPrioAllaProjekt;
    private javax.swing.JLabel lblProduktchefAllaProjekt;
    private javax.swing.JLabel lblProjektnamnAllaProjekt;
    private javax.swing.JLabel lblSlutdatumAllaProjekt;
    private javax.swing.JLabel lblStartDatumAllaProjekt;
    private javax.swing.JLabel lblStatusAllaProjekt;
    private javax.swing.JTextField tfBeskrivningAllaProjekt;
    private javax.swing.JTextField tfHallbarhetsmalAllaProjekt;
    private javax.swing.JTextField tfKostnadAllaProjekt;
    private javax.swing.JTextField tfLandAllaProjekt;
    private javax.swing.JTextField tfNyttProjektNyPid;
    private javax.swing.JTextField tfPrioAllaProjekt;
    private javax.swing.JTextField tfProjektchefAllaProjekt;
    private javax.swing.JTextField tfProjektnamnAllaProjekt;
    private javax.swing.JTextField tfSlutDatumAllaProjekt;
    private javax.swing.JTextField tfStartdatumAllaProjekt;
    private javax.swing.JTextField tfStatusAllaProjekt;
    // End of variables declaration//GEN-END:variables
}
