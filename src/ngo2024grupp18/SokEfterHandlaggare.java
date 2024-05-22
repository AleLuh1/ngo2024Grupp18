/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo2024grupp18;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author marin
 */
public class SokEfterHandlaggare extends javax.swing.JFrame {

    private InfDB idb;
    private String aid;
    private String avdid;

    /**
     * Creates new form SokEfterHandlaggare
     */
    public SokEfterHandlaggare(InfDB idb, String aid, String avdid) {
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

        lblTitel = new javax.swing.JLabel();
        tfSokFornamn = new javax.swing.JTextField();
        tfSokEpost = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taListaInfo = new javax.swing.JTextArea();
        btnSok = new javax.swing.JButton();
        btnTillbaka = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tfSokEfternamn = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitel.setText("Sök efter handläggare på min avdelning");

        jLabel1.setText("Sök på förnamn");

        jLabel2.setText("Sök på e-post:");

        taListaInfo.setColumns(20);
        taListaInfo.setRows(5);
        jScrollPane1.setViewportView(taListaInfo);

        btnSok.setText("Sök");
        btnSok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokActionPerformed(evt);
            }
        });

        btnTillbaka.setText("Tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        jLabel3.setText("Sök på efternamn");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTillbaka)
                            .addComponent(lblTitel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfSokEpost, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSok)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel3))
                                    .addGap(113, 113, 113)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tfSokFornamn, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                        .addComponent(tfSokEfternamn)))))))
                .addContainerGap(276, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblTitel)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfSokFornamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfSokEfternamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSokEpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(23, 23, 23)
                .addComponent(btnSok)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(btnTillbaka)
                .addContainerGap(186, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokActionPerformed
        String sokFornamn = tfSokFornamn.getText();
        String sokEfternamn = tfSokEfternamn.getText();
        String sokEpost = tfSokEpost.getText();
        int avdelning = Integer.parseInt(this.avdid);
        taListaInfo.setText("");
        if (sokFornamn.isEmpty() && sokEfternamn.isEmpty() && sokEpost.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vänligen fyll i minst ett fält");
        } else if (!sokFornamn.isEmpty()) {
            System.out.println("Söker på förnamn");
            String sqlFraga = "SELECT fornamn, efternamn, telefon, epost, adress FROM anstalld "
                    + "JOIN handlaggare ON handlaggare.aid = anstalld.aid "
                    + "WHERE fornamn = '" + sokFornamn + "' AND avdelning = " + avdelning;
            try {
                ArrayList<HashMap<String, String>> listaFornamn = idb.fetchRows(sqlFraga);
                for (int i = 0; i < listaFornamn.size(); i++) {
                    taListaInfo.append(" Förnamn: " + listaFornamn.get(i).get("fornamn") + "\n "
                            + "Efternamn: " + listaFornamn.get(i).get("efternamn") + "\n "
                            + "Telefon: " + listaFornamn.get(i).get("telefon") + "\n "
                            + "E-post: " + listaFornamn.get(i).get("epost") + "\n "
                            + "Adress: " + listaFornamn.get(i).get("adress") + "\n "
                            + "------------------- \n");
                }
                if (!Validering.finnsTextTA(taListaInfo)) {
                    JOptionPane.showMessageDialog(null, "Vänligen skriv in ett giltigt namn");
                }

            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } else if (!sokEfternamn.isEmpty()) {
            System.out.println("Söker på efternamn");
            String sqlFraga = "SELECT fornamn, efternamn, telefon, epost, adress FROM anstalld WHERE efternamn = '" + sokEfternamn + "' AND avdelning = " + avdelning;
            try {
                ArrayList<HashMap<String, String>> listaEfternamn = idb.fetchRows(sqlFraga);
                for (int i = 0; i < listaEfternamn.size(); i++) {
                    taListaInfo.append(listaEfternamn.get(i).get("fornamn") + "\n" + listaEfternamn.get(i).get("efternamn") + "\n" + listaEfternamn.get(i).get("telefon") + "\n" + listaEfternamn.get(i).get("epost") + "\n" + listaEfternamn.get(i).get("adress") + "\n" + "------------------- \n");
                }
                if (!Validering.finnsTextTA(taListaInfo)) {
                    JOptionPane.showMessageDialog(null, "Vänligen skriv in ett giltigt namn");
                }

            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } else if (!sokEpost.isEmpty()) {
            String sqlFraga = "SELECT fornamn, efternamn, telefon, epost, adress FROM anstalld WHERE fornamn = '" + sokEpost + "' AND avdelning = " + avdelning;
            try {
                ArrayList<HashMap<String, String>> listaEpost = idb.fetchRows(sqlFraga);
                for (int i = 0; i < listaEpost.size(); i++) {
                    taListaInfo.append(listaEpost.get(i).get("fornamn") + "\n" + listaEpost.get(i).get("efternamn") + "\n" + listaEpost.get(i).get("telefon") + "\n" + listaEpost.get(i).get("epost") + "\n" + listaEpost.get(i).get("adress") + "\n" + "------------------- \n");
                }
                if (!Validering.finnsTextTA(taListaInfo)) {
                    JOptionPane.showMessageDialog(null, "Vänligen skriv in en giltig e-post");
                }

            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }

    }//GEN-LAST:event_btnSokActionPerformed

    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        this.toBack();
        Meny nyMeny = new Meny(idb, aid, avdid);
        nyMeny.setVisible(true);
        nyMeny.toFront();
    }//GEN-LAST:event_btnTillbakaActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSok;
    private javax.swing.JButton btnTillbaka;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitel;
    private javax.swing.JTextArea taListaInfo;
    private javax.swing.JTextField tfSokEfternamn;
    private javax.swing.JTextField tfSokEpost;
    private javax.swing.JTextField tfSokFornamn;
    // End of variables declaration//GEN-END:variables
}
