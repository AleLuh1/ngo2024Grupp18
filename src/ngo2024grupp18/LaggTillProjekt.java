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
public class LaggTillProjekt extends javax.swing.JFrame {

    private InfDB idb;
    private String aid;
    private String avdid;

    /**
     * Creates new form LaggTillProjekt
     */
    public LaggTillProjekt(InfDB idb, String aid, String avdid) {
        initComponents();
        this.idb = idb;
        this.aid = aid;
        this.avdid = avdid;
        this.setLocationRelativeTo(null);
        LaggaTillNyttProjektPid();
        fyllCBVäljProjektchef();
        fyllCBVäljStatus();
        fyllCBVäljPrioritet();
        fyllCBVäljLand();
        fyllCBVäljHallbarhetsmal();
    }

    // Genererar ett nytt projekt-id (genom att hitta högsta pid och lägger till +1
    private String LaggaTillNyttProjektPid() {
        String nyttProjektPid = null;
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
            nyttProjektPid = Integer.toString(nyProjektPidInt);
            tfProjektIDLaggTIllProjekt.setText(nyttProjektPid);
            tfProjektIDLaggTIllProjekt.setEditable(false);
            lblPorjektIDLaggTIllProjekt.requestFocus();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return nyttProjektPid;
    }

    // Lägger till alla projektchefer i combobox
    public void fyllCBVäljProjektchef() {
        try {
            String sqlFraga = "SELECT DISTINCT projektchef FROM projekt";
            System.out.println(sqlFraga);
            ArrayList<String> projektchefLista = idb.fetchColumn(sqlFraga);

            for (String enProjektchef : projektchefLista) {
                cbProjektChefLaggTillProjekt.addItem(enProjektchef);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }

    }

    // Lägger till beskrivning i combobox
    public void fyllCBVäljHallbarhetsmal() {
        try {
            String sqlFraga = "SELECT DISTINCT namn FROM hallbarhetsmal";
            System.out.println(sqlFraga);
            ArrayList<String> hallbarhetsmalLista = idb.fetchColumn(sqlFraga);

            for (String ettHallbarhetsmal : hallbarhetsmalLista) {
                cbHallbarhetsmalLaggTillProjekt.addItem(ettHallbarhetsmal);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }

    }

    // Lägger till status i comboboxen
    public void fyllCBVäljStatus() {
        try {
            String sqlFraga = "SELECT DISTINCT status FROM projekt";
            System.out.println(sqlFraga);
            ArrayList<String> statusLista = idb.fetchColumn(sqlFraga);

            for (String enStatus : statusLista) {
                cbStatusLaggTillProjekt.addItem(enStatus);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }

    }

    // Lägger till prioritet i combobox
    public void fyllCBVäljPrioritet() {
        try {
            String sqlFraga = "SELECT DISTINCT prioritet FROM projekt";
            System.out.println(sqlFraga);
            ArrayList<String> prioritetLista = idb.fetchColumn(sqlFraga);

            for (String enPrioritet : prioritetLista) {
                cbPrioritetLaggTillProjekt.addItem(enPrioritet);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }

    }

    // Lägger till land i combobox
    public void fyllCBVäljLand() {
        try {
            String sqlFraga = "SELECT DISTINCT lid FROM land";
            System.out.println(sqlFraga);
            ArrayList<String> landLista = idb.fetchColumn(sqlFraga);

            for (String ettLand : landLista) {
                cbLandLaggTillProjekt.addItem(ettLand);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

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

        lblLaggTillProjektRuta = new javax.swing.JLabel();
        lblPorjektIDLaggTIllProjekt = new javax.swing.JLabel();
        lblProjektNamnLaggTIllProjekt = new javax.swing.JLabel();
        lblProjektchefLaggTIllProjekt = new javax.swing.JLabel();
        lblBeskrivningLaggTIllProjekt = new javax.swing.JLabel();
        lblStartdatumLaggTIllProjekt = new javax.swing.JLabel();
        lblSlutdatumLaggTIllProjekt = new javax.swing.JLabel();
        lblKostnadLaggTIllProjekt = new javax.swing.JLabel();
        lblStatusLaggTIllProjekt = new javax.swing.JLabel();
        lblPrioritetLaggTIllProjekt = new javax.swing.JLabel();
        lblLandLaggTIllProjekt = new javax.swing.JLabel();
        btnSparaLaggTIllProjekt = new javax.swing.JButton();
        tfProjektIDLaggTIllProjekt = new javax.swing.JTextField();
        tfProjektnamnLaggTIllProjekt = new javax.swing.JTextField();
        tfStartdatumLaggTIllProjekt = new javax.swing.JTextField();
        tfSlutdatumLaggTIllProjekt = new javax.swing.JTextField();
        tfKostnadLaggTIllProjekt = new javax.swing.JTextField();
        btnTillbakaLaggTIllProjekt = new javax.swing.JButton();
        cbProjektChefLaggTillProjekt = new javax.swing.JComboBox<>();
        cbStatusLaggTillProjekt = new javax.swing.JComboBox<>();
        cbPrioritetLaggTillProjekt = new javax.swing.JComboBox<>();
        cbLandLaggTillProjekt = new javax.swing.JComboBox<>();
        lblHallbarhetsmalLaggTillProjekt = new javax.swing.JLabel();
        cbHallbarhetsmalLaggTillProjekt = new javax.swing.JComboBox<>();
        tfBeskrivningLaggTillProjekt = new javax.swing.JTextField();
        btnAnstalld = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListAllaAnstallda = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblLaggTillProjektRuta.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lblLaggTillProjektRuta.setText("Lägg till projekt");

        lblPorjektIDLaggTIllProjekt.setText("Projekt-ID");

        lblProjektNamnLaggTIllProjekt.setText("Projektnamn");

        lblProjektchefLaggTIllProjekt.setText("Projektchef");

        lblBeskrivningLaggTIllProjekt.setText("Beskrivning");

        lblStartdatumLaggTIllProjekt.setText("Startdatum");

        lblSlutdatumLaggTIllProjekt.setText("Slutdatum");

        lblKostnadLaggTIllProjekt.setText("Kostnad");

        lblStatusLaggTIllProjekt.setText("Status");

        lblPrioritetLaggTIllProjekt.setText("Prioritet");

        lblLandLaggTIllProjekt.setText("Land");

        btnSparaLaggTIllProjekt.setText("Spara");
        btnSparaLaggTIllProjekt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSparaLaggTIllProjektActionPerformed(evt);
            }
        });

        btnTillbakaLaggTIllProjekt.setText("Tillbaka");
        btnTillbakaLaggTIllProjekt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaLaggTIllProjektActionPerformed(evt);
            }
        });

        cbProjektChefLaggTillProjekt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj projektchef" }));

        cbStatusLaggTillProjekt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj status" }));

        cbPrioritetLaggTillProjekt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj prioritet" }));

        cbLandLaggTillProjekt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj land" }));

        lblHallbarhetsmalLaggTillProjekt.setText("Hållbarhetsmål");

        cbHallbarhetsmalLaggTillProjekt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj hållbarhetsmål" }));

        btnAnstalld.setText("Anställd");

        jListAllaAnstallda.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListAllaAnstallda);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(83, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPorjektIDLaggTIllProjekt)
                                    .addComponent(lblLaggTillProjektRuta)))
                            .addComponent(lblSlutdatumLaggTIllProjekt)
                            .addComponent(lblKostnadLaggTIllProjekt)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblProjektNamnLaggTIllProjekt)
                                .addComponent(lblBeskrivningLaggTIllProjekt, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(lblProjektchefLaggTIllProjekt)
                            .addComponent(lblStartdatumLaggTIllProjekt)
                            .addComponent(lblStatusLaggTIllProjekt)
                            .addComponent(lblPrioritetLaggTIllProjekt)
                            .addComponent(lblHallbarhetsmalLaggTillProjekt)
                            .addComponent(lblLandLaggTIllProjekt)
                            .addComponent(btnAnstalld))
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btnTillbakaLaggTIllProjekt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbHallbarhetsmalLaggTillProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(155, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSparaLaggTIllProjekt)
                        .addGap(78, 78, 78))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfStartdatumLaggTIllProjekt, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                            .addComponent(tfBeskrivningLaggTillProjekt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbLandLaggTillProjekt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbPrioritetLaggTillProjekt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfSlutdatumLaggTIllProjekt)
                            .addComponent(tfKostnadLaggTIllProjekt)
                            .addComponent(cbProjektChefLaggTillProjekt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbStatusLaggTillProjekt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfProjektIDLaggTIllProjekt)
                            .addComponent(tfProjektnamnLaggTIllProjekt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lblLaggTillProjektRuta)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPorjektIDLaggTIllProjekt)
                    .addComponent(tfProjektIDLaggTIllProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfProjektnamnLaggTIllProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProjektNamnLaggTIllProjekt))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBeskrivningLaggTIllProjekt)
                    .addComponent(tfBeskrivningLaggTillProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbProjektChefLaggTillProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProjektchefLaggTIllProjekt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnstalld))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStartdatumLaggTIllProjekt)
                    .addComponent(tfStartdatumLaggTIllProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSlutdatumLaggTIllProjekt)
                    .addComponent(tfSlutdatumLaggTIllProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKostnadLaggTIllProjekt)
                    .addComponent(tfKostnadLaggTIllProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbStatusLaggTillProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStatusLaggTIllProjekt))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrioritetLaggTIllProjekt)
                    .addComponent(cbPrioritetLaggTillProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbLandLaggTillProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLandLaggTIllProjekt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHallbarhetsmalLaggTillProjekt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbHallbarhetsmalLaggTillProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTillbakaLaggTIllProjekt)
                    .addComponent(btnSparaLaggTIllProjekt))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTillbakaLaggTIllProjektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaLaggTIllProjektActionPerformed
        this.toBack();
        AllaProjekt nyttAllaProjekt = new AllaProjekt(idb, aid, avdid);
        nyttAllaProjekt.setVisible(true);
        nyttAllaProjekt.toFront();
    }//GEN-LAST:event_btnTillbakaLaggTIllProjektActionPerformed

    private void btnSparaLaggTIllProjektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSparaLaggTIllProjektActionPerformed
        //Gör om nya projektID till en int igen för att kunna lägga i db 
        String nyProjektPidStr = tfProjektIDLaggTIllProjekt.getText();
        int nyProjektPidInt = Integer.parseInt(nyProjektPidStr);

// säkerställer så användaren har fyllt alla textfields och comboboxar 
        String laggTillProjektNamn = tfProjektnamnLaggTIllProjekt.getText();

        if (laggTillProjektNamn.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vänligen fyll i ett projektnamn");
        }

        String laggTillBeskrivning = tfBeskrivningLaggTillProjekt.getText();

        if (laggTillBeskrivning.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vänligen fyll i en beskrivning");
        }

        String laggTillProjektchefStr = cbProjektChefLaggTillProjekt.getSelectedItem().toString();
        //Gör om projektchef från String till int för att kunna lägga in i db
        int laggTillProjektchef = Integer.parseInt(laggTillProjektchefStr);

        if (laggTillProjektchefStr.equals("Välj projektchef")) {
            JOptionPane.showMessageDialog(null, "Vänligen välj en projektchef");
        }

        String laggTillStartdatum = tfStartdatumLaggTIllProjekt.getText();

        if (laggTillStartdatum.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vänligen fyll i en startdatum");
        }

        String laggTillSlutdatum = tfSlutdatumLaggTIllProjekt.getText();

        if (laggTillSlutdatum.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vänligen fyll i en slutdatum");
        }

        String laggTillKostnad = tfKostnadLaggTIllProjekt.getText();

        if (laggTillKostnad.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vänligen fyll i en kostnad");
        }

        String laggTillStatus = cbStatusLaggTillProjekt.getSelectedItem().toString();

        if (laggTillStatus.equals("Välj status")) {
            JOptionPane.showMessageDialog(null, "Vänligen välj status");
        }

        String laggTillPrioritet = cbPrioritetLaggTillProjekt.getSelectedItem().toString();

        if (laggTillPrioritet.equals("Välj prioritet")) {
            JOptionPane.showMessageDialog(null, "Vänligen välj prioritet");
        }

        String laggTillLandStr = cbLandLaggTillProjekt.getSelectedItem().toString();
        // Gör om land från String till int för att kunna lägga in i db
        int laggTillLand = Integer.parseInt(laggTillLandStr);

        if (laggTillLandStr.equals("Välj land")) {
            JOptionPane.showMessageDialog(null, "Vänligen välj ett land");
        }

        String laggTillHallbarhetsmal = cbHallbarhetsmalLaggTillProjekt.getSelectedItem().toString();

        if (laggTillHallbarhetsmal.equals("Välj hållbarhetsmål")) {
            JOptionPane.showMessageDialog(null, "Vänligen välj ett hållbarhetsmål");
        }

        try {
            // String sqlFraga1 = "INSERT INTO projekt WHERE projekt.pid = (pid, projektnamn, projektchef, beskrivning, startdatum, slutdatum, kostnad, status, prioritet, land) VALUES ('" + projektID + "','" + projektnamn + "', '" + projektchef + "', '" + beskrivning + "', '" + startdatum + "', '" + slutdatum + "', '" + kostnad + "', '" + status + "', '" + prioritet + "', '" + land + "')";
            String sqlFraga1 = "INSERT INTO projekt (pid, projektnamn, beskrivning, startdatum, slutdatum, kostnad, status, prioritet, projektchef, land) VALUES (" + nyProjektPidInt + ", '" + laggTillProjektNamn + "', '" + laggTillBeskrivning + "', str_to_date('" + laggTillStartdatum + "', '%Y-%m-%d'),  str_to_date('" + laggTillSlutdatum + "', '%Y-%m-%d'), '" + laggTillKostnad + "', '" + laggTillStatus + "', '" + laggTillPrioritet + "', " + laggTillProjektchef + ", " + laggTillLand + ")";
            idb.insert(sqlFraga1);

            String sqlFraga2 = "INSERT INTO proj_hallbarhet (pid, hid) VALUES (" + nyProjektPidInt + ", " + laggTillHallbarhetsmal + ")";
            //WHERE namn = (malnummer, beskrivning, prioritet, hid) VALUES () ";
            idb.insert(sqlFraga2);
            
            //String sqlFraga3 = "INSERT INTO ans_proj (pid, aid) VALUES (" + nyProjektPidInt + ", " + laggTillAnstalld + ")";
            //idb.insert(sqlFraga3);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }


    }//GEN-LAST:event_btnSparaLaggTIllProjektActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAnstalld;
    private javax.swing.JButton btnSparaLaggTIllProjekt;
    private javax.swing.JButton btnTillbakaLaggTIllProjekt;
    private javax.swing.JComboBox<String> cbHallbarhetsmalLaggTillProjekt;
    private javax.swing.JComboBox<String> cbLandLaggTillProjekt;
    private javax.swing.JComboBox<String> cbPrioritetLaggTillProjekt;
    private javax.swing.JComboBox<String> cbProjektChefLaggTillProjekt;
    private javax.swing.JComboBox<String> cbStatusLaggTillProjekt;
    private javax.swing.JList<String> jListAllaAnstallda;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBeskrivningLaggTIllProjekt;
    private javax.swing.JLabel lblHallbarhetsmalLaggTillProjekt;
    private javax.swing.JLabel lblKostnadLaggTIllProjekt;
    private javax.swing.JLabel lblLaggTillProjektRuta;
    private javax.swing.JLabel lblLandLaggTIllProjekt;
    private javax.swing.JLabel lblPorjektIDLaggTIllProjekt;
    private javax.swing.JLabel lblPrioritetLaggTIllProjekt;
    private javax.swing.JLabel lblProjektNamnLaggTIllProjekt;
    private javax.swing.JLabel lblProjektchefLaggTIllProjekt;
    private javax.swing.JLabel lblSlutdatumLaggTIllProjekt;
    private javax.swing.JLabel lblStartdatumLaggTIllProjekt;
    private javax.swing.JLabel lblStatusLaggTIllProjekt;
    private javax.swing.JTextField tfBeskrivningLaggTillProjekt;
    private javax.swing.JTextField tfKostnadLaggTIllProjekt;
    private javax.swing.JTextField tfProjektIDLaggTIllProjekt;
    private javax.swing.JTextField tfProjektnamnLaggTIllProjekt;
    private javax.swing.JTextField tfSlutdatumLaggTIllProjekt;
    private javax.swing.JTextField tfStartdatumLaggTIllProjekt;
    // End of variables declaration//GEN-END:variables
}
