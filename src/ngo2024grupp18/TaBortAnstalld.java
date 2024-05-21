/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo2024grupp18;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;

/**
 *
 * @author ellenor
 */
public class TaBortAnstalld extends javax.swing.JFrame {

    private InfDB idb;
    private String aid;
    private String avdid;

    /**
     * Creates new form TaBortAnstalld1
     */
    public TaBortAnstalld(InfDB idb, String aid, String avdid) {
        initComponents();
        this.idb = idb;
        this.aid = aid;
        this.avdid = avdid;
        this.setLocationRelativeTo(null);
        fyllCBTaBortAnstalld();
    }

    private void fyllCBTaBortAnstalld() {

        try {
            String sqlFraga = "SELECT fornamn, efternamn FROM anstalld";
            System.out.println(sqlFraga);
            ArrayList<HashMap<String, String>> anstalldaNamnLista = idb.fetchRows(sqlFraga);

            for (HashMap<String, String> ettNamn : anstalldaNamnLista) {
                cbTaBortAnstalld.addItem(ettNamn.get("fornamn") + " " + ettNamn.get("efternamn"));
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

        jLabel1 = new javax.swing.JLabel();
        cbTaBortAnstalld = new javax.swing.JComboBox<>();
        btnTillbakaTaBortAnstalld = new javax.swing.JButton();
        btnTaBortAnstalld = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setText("Ta bort anställd");

        cbTaBortAnstalld.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj anställd" }));
        cbTaBortAnstalld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTaBortAnstalldActionPerformed(evt);
            }
        });

        btnTillbakaTaBortAnstalld.setText("Tillbaka");
        btnTillbakaTaBortAnstalld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaTaBortAnstalldActionPerformed(evt);
            }
        });

        btnTaBortAnstalld.setText("Ta bort");
        btnTaBortAnstalld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortAnstalldActionPerformed(evt);
            }
        });

        jButton1.setText("Gå till ändra projektchef");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbTaBortAnstalld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTillbakaTaBortAnstalld)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTaBortAnstalld)
                        .addGap(53, 53, 53))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbTaBortAnstalld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTillbakaTaBortAnstalld)
                    .addComponent(btnTaBortAnstalld))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTillbakaTaBortAnstalldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaTaBortAnstalldActionPerformed
        this.toBack();
        Meny nyTaBortAnstalld = new Meny(idb, aid, avdid);
        nyTaBortAnstalld.setVisible(true);
        nyTaBortAnstalld.toFront();        nyTaBortAnstalld.toFront();    }//GEN-LAST:event_btnTillbakaTaBortAnstalldActionPerformed

    private void btnTaBortAnstalldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortAnstalldActionPerformed
        String anstalld = cbTaBortAnstalld.getSelectedItem().toString();
        try {
            String sqlFragaAid = "SELECT aid FROM anstalld WHERE fornamn = '" + anstalld + "'";
            System.out.println(sqlFragaAid);
            String aid = idb.fetchSingle(sqlFragaAid);

            String sqlFraga1 = "DELETE FROM ans_proj WHERE aid = " + aid;
            System.out.println(sqlFraga1);
            idb.delete(sqlFraga1);

            String sqlFraga2 = "DELETE FROM admin WHERE aid = " + aid;
            System.out.println(sqlFraga2);
            idb.delete(sqlFraga2);

            String sqlFraga8 = "DELETE FROM handlaggare WHERE mentor = " + aid;
            System.out.println(sqlFraga8);
            idb.delete(sqlFraga8);

            String sqlFraga3 = "DELETE FROM handlaggare WHERE aid = " + aid;
            System.out.println(sqlFraga3);
            idb.delete(sqlFraga3);

            String sqlFraga4 = "DELETE FROM avdelning WHERE chef = " + aid;
            System.out.println(sqlFraga4);
            idb.delete(sqlFraga4);

            String sqlFraga6 = "DELETE FROM ans_proj WHERE aid =" + aid;
            System.out.println(sqlFraga6);
            idb.delete(sqlFraga6);

            String sqlFraga7 = "DELETE FROM anstalld WHERE aid = " + aid;
            System.out.println(sqlFraga7);
            idb.delete(sqlFraga7);

            JOptionPane.showMessageDialog(null, "Anställd borttagen");

            // uppdaterar comboboxen
            cbTaBortAnstalld.removeAllItems();
            fyllCBTaBortAnstalld();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }


    }//GEN-LAST:event_btnTaBortAnstalldActionPerformed

    private void cbTaBortAnstalldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTaBortAnstalldActionPerformed
        btnTaBortAnstalld.setVisible(true);

        String anstalld = cbTaBortAnstalld.getSelectedItem().toString();

        try {

            String fornamn = anstalld.split(" ")[0];
            String efternamn = anstalld.split(" ")[1];
            
            String sqlFragaAid = "SELECT aid FROM anstalld WHERE fornamn = '" + fornamn + "' AND efternamn = '"+efternamn+"'";
            System.out.println(sqlFragaAid);
            String aid = idb.fetchSingle(sqlFragaAid);

            String sqlFraga13 = "SELECT pid FROM projekt WHERE projektchef =" + aid;
            System.out.println(sqlFraga13);
            String projektchef = idb.fetchSingle(sqlFraga13);
            
           
            if(projektchef != null){
                JOptionPane.showMessageDialog(null, "Vänligen utse en ny projektchef innan projektet kan tas bort");
                btnTaBortAnstalld.setVisible(false);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }

    }//GEN-LAST:event_cbTaBortAnstalldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTaBortAnstalld;
    private javax.swing.JButton btnTillbakaTaBortAnstalld;
    private javax.swing.JComboBox<String> cbTaBortAnstalld;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
