/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo2024grupp18;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import ngo2024grupp18.Validering;

/**
 *
 * @author marin
 */
public class SokProjekt extends javax.swing.JFrame {

    private InfDB idb;
    private String aid;
    private String avdid;

    /**
     * Creates new form SokProjekt
     */
    public SokProjekt(InfDB idb, String aid, String avdid) {
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

        lblRubrikSokAktivaProj = new javax.swing.JLabel();
        lblFranDatum = new javax.swing.JLabel();
        lblTillDatum = new javax.swing.JLabel();
        tfStartDatum = new javax.swing.JTextField();
        tfSlutDatum = new javax.swing.JTextField();
        btnSokProjekt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taResultatSoktaProjekt = new javax.swing.JTextArea();
        lblDatumFormat1 = new javax.swing.JLabel();
        lblDatumFormat2 = new javax.swing.JLabel();
        btnTillbaka = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblRubrikSokAktivaProj.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRubrikSokAktivaProj.setText("Sök efter aktiva projekt");

        lblFranDatum.setText("Från datum");

        lblTillDatum.setText("Till datum");

        btnSokProjekt.setText("Sök");
        btnSokProjekt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokProjektActionPerformed(evt);
            }
        });

        taResultatSoktaProjekt.setColumns(20);
        taResultatSoktaProjekt.setRows(5);
        jScrollPane1.setViewportView(taResultatSoktaProjekt);

        lblDatumFormat1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblDatumFormat1.setText("ÅÅÅÅ-MM-DD");

        lblDatumFormat2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblDatumFormat2.setText("ÅÅÅÅ-MM-DD");

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblRubrikSokAktivaProj)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFranDatum)
                            .addComponent(tfStartDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDatumFormat1))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfSlutDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(btnSokProjekt))
                            .addComponent(lblTillDatum)
                            .addComponent(lblDatumFormat2)))
                    .addComponent(jScrollPane1))
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTillbaka)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblRubrikSokAktivaProj)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFranDatum)
                    .addComponent(lblTillDatum))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfStartDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSlutDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSokProjekt))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDatumFormat1)
                    .addComponent(lblDatumFormat2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(btnTillbaka)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSokProjektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokProjektActionPerformed
        String sokStartDatum = tfStartDatum.getText();
        String sokSlutDatum = tfSlutDatum.getText();
        int avdelning = Integer.parseInt(this.avdid);
        System.out.println(avdelning);
        taResultatSoktaProjekt.setText("");
        if (sokStartDatum.isEmpty() && sokSlutDatum.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vänligen fyll i båda fälten");
        }
        //if (!Validering.isKorrektFormatDatum(sokStartDatum)) || (!Validering.isKorrektFormatDatum(sokSlutDatum)) {
          //          return;
        //        }
        //}
        else {
            String sqlFraga = "select distinct projekt.pid, projektnamn, beskrivning, startdatum, slutdatum, kostnad, status, prioritet, projektchef, land FROM projekt "
                    + "join ans_proj on ans_proj.pid = projekt.pid "
                    + "join anstalld on anstalld.aid = ans_proj.aid "
                    + "where anstalld.avdelning = " + avdelning + " and status = 'Pågående' and startdatum >= '" + sokStartDatum + "' and slutdatum <= '" + sokSlutDatum + "' ";

            try {
                ArrayList<HashMap<String, String>> resultatListaProjekt = idb.fetchRows(sqlFraga);
                for (int i = 0; i < resultatListaProjekt.size(); i++) {
                    
                    String fragaChef = "SELECT fornamn, efternamn FROM anstalld WHERE aid="+resultatListaProjekt.get(i).get("projektchef");
                    HashMap<String,String> chefNamnEfternamn = idb.fetchRow(fragaChef);
                    String chef = chefNamnEfternamn.get("fornamn")+" "+chefNamnEfternamn.get("efternamn");
                    
                    String fragaLand = "SELECT namn FROM land WHERE lid="+resultatListaProjekt.get(i).get("land");
                    String land = idb.fetchSingle(fragaLand);
                    
                    taResultatSoktaProjekt.append("ProjektID: " + resultatListaProjekt.get(i).get("pid") + "\n "
                            + "Namn: " + resultatListaProjekt.get(i).get("projektnamn") + "\n "
                            + "Beskrivning: " + resultatListaProjekt.get(i).get("beskrivning") + "\n "
                            + "Startdatum: " + resultatListaProjekt.get(i).get("startdatum") + "\n "
                            + "Slutdatum: " + resultatListaProjekt.get(i).get("slutdatum") + "\n "
                            + "Kostnad: " + resultatListaProjekt.get(i).get("kostnad") + "\n "
                            + "Status: " + resultatListaProjekt.get(i).get("status") + "\n "
                            + "Prioritet: " + resultatListaProjekt.get(i).get("prioritet") + "\n "
                            + "Projektchef: " + chef + "\n "
                            + "Land(lid): " + land + "\n " + "------------------- \n");
                }
                taResultatSoktaProjekt.setCaretPosition(0);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnSokProjektActionPerformed

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        this.dispose();
        Projekt nyttProject = new Projekt(idb, aid, avdid);
        nyttProject.setVisible(true);
    }//GEN-LAST:event_btnTillbakaActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSokProjekt;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDatumFormat1;
    private javax.swing.JLabel lblDatumFormat2;
    private javax.swing.JLabel lblFranDatum;
    private javax.swing.JLabel lblRubrikSokAktivaProj;
    private javax.swing.JLabel lblTillDatum;
    private javax.swing.JTextArea taResultatSoktaProjekt;
    private javax.swing.JTextField tfSlutDatum;
    private javax.swing.JTextField tfStartDatum;
    // End of variables declaration//GEN-END:variables
}
