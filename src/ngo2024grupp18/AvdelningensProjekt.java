/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo2024grupp18;

import java.util.ArrayList;
import java.util.HashMap;
import oru.inf.InfDB;

/**
 *
 * @author alex
 */
public class AvdelningensProjekt extends javax.swing.JFrame {

    private InfDB idb;
    private String aid;
    private String avdid;

    /**
     * Creates new form AvdelningensProjekt
     */
    public AvdelningensProjekt(InfDB idb, String aid, String avdid) {
        initComponents();
        this.idb = idb;
        this.aid = aid;
        this.avdid = avdid;
        fyllCBAvdelningensProjekt();
        this.setLocationRelativeTo(null);
        tfAvdProjID.setEditable(false);
        tfAvdProjNamn.setEditable(false);
        taAvdProjBesk.setEditable(false);
        tfAvdProjStart.setEditable(false);
        tfAvdProjSlut.setEditable(false);
        tfAvdProjKostn.setEditable(false);
        tfAvdProjStatus.setEditable(false);
        tfAvdProjPrio.setEditable(false);
        tfAvdProjChef.setEditable(false);
        tfAvdProjLand.setEditable(false);
    }

    private void fyllCBAvdelningensProjekt() {
        String avdProjNamn = cbAvdelningensProjekt.getSelectedItem().toString();
        try {
            String sqlFraga = "SELECT DISTINCT projektnamn FROM projekt "
                    + "JOIN ans_proj ON projekt.pid = ans_proj.pid "
                    + "JOIN anstalld on anstalld.aid = ans_proj.aid WHERE avdelning = " + avdid;
            System.out.println(sqlFraga);
            ArrayList<String> avdelningensProjektLista;
            avdelningensProjektLista = idb.fetchColumn(sqlFraga);
            for (String ettProjektNamn : avdelningensProjektLista) {
                cbAvdelningensProjekt.addItem(ettProjektNamn);
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

        btnTillbakaAvdProj = new javax.swing.JButton();
        lblAvdelningensProjektRuta = new javax.swing.JLabel();
        cbAvdelningensProjekt = new javax.swing.JComboBox<>();
        lblAvdProjID = new javax.swing.JLabel();
        tfAvdProjID = new javax.swing.JTextField();
        lblAvdProjNamn = new javax.swing.JLabel();
        lblAvdProjBesk = new javax.swing.JLabel();
        lblAvdProjStart = new javax.swing.JLabel();
        lblAvdProjSlut = new javax.swing.JLabel();
        lblAvdProjKostn = new javax.swing.JLabel();
        lblAvdProjPrio = new javax.swing.JLabel();
        lblAvdProjStatus = new javax.swing.JLabel();
        lblAvdProjChef = new javax.swing.JLabel();
        lblAvdProjLand = new javax.swing.JLabel();
        tfAvdProjNamn = new javax.swing.JTextField();
        tfAvdProjStart = new javax.swing.JTextField();
        tfAvdProjSlut = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        taAvdProjBesk = new javax.swing.JTextArea();
        tfAvdProjKostn = new javax.swing.JTextField();
        tfAvdProjStatus = new javax.swing.JTextField();
        tfAvdProjPrio = new javax.swing.JTextField();
        tfAvdProjChef = new javax.swing.JTextField();
        tfAvdProjLand = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnTillbakaAvdProj.setText("Tillbaka");
        btnTillbakaAvdProj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaAvdProjActionPerformed(evt);
            }
        });

        lblAvdelningensProjektRuta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblAvdelningensProjektRuta.setText("Avdelningens projekt");

        cbAvdelningensProjekt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj" }));
        cbAvdelningensProjekt.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cbAvdelningensProjektPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        lblAvdProjID.setText("ProjektID");

        lblAvdProjNamn.setText("Projektnamn");

        lblAvdProjBesk.setText("Beskrivning");

        lblAvdProjStart.setText("Startdatum");

        lblAvdProjSlut.setText("Slutdatum");

        lblAvdProjKostn.setText("Kostnad");

        lblAvdProjPrio.setText("Prioritet");

        lblAvdProjStatus.setText("Status");

        lblAvdProjChef.setText("Projektchef");

        lblAvdProjLand.setText("Land");

        taAvdProjBesk.setColumns(20);
        taAvdProjBesk.setRows(5);
        jScrollPane1.setViewportView(taAvdProjBesk);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTillbakaAvdProj)
                    .addComponent(lblAvdelningensProjektRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblAvdProjSlut)
                                    .addGap(31, 31, 31))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblAvdProjStart)
                                    .addGap(25, 25, 25)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAvdProjID)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblAvdProjBesk)
                                            .addComponent(lblAvdProjNamn))
                                        .addComponent(lblAvdProjKostn))
                                    .addComponent(lblAvdProjStatus)
                                    .addComponent(lblAvdProjPrio)
                                    .addComponent(lblAvdProjChef)
                                    .addComponent(lblAvdProjLand))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(tfAvdProjChef)
                            .addComponent(tfAvdProjLand)
                            .addComponent(tfAvdProjID)
                            .addComponent(tfAvdProjNamn)
                            .addComponent(tfAvdProjStart)
                            .addComponent(tfAvdProjSlut)
                            .addComponent(tfAvdProjKostn)
                            .addComponent(tfAvdProjStatus)
                            .addComponent(tfAvdProjPrio)))
                    .addComponent(cbAvdelningensProjekt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblAvdelningensProjektRuta)
                .addGap(18, 18, 18)
                .addComponent(cbAvdelningensProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAvdProjID)
                    .addComponent(tfAvdProjID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAvdProjNamn)
                    .addComponent(tfAvdProjNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAvdProjBesk))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAvdProjStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAvdProjStart))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAvdProjSlut)
                    .addComponent(tfAvdProjSlut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAvdProjKostn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAvdProjKostn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAvdProjStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAvdProjStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAvdProjPrio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAvdProjPrio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAvdProjChef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAvdProjChef))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAvdProjLand)
                    .addComponent(tfAvdProjLand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnTillbakaAvdProj)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTillbakaAvdProjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaAvdProjActionPerformed
        this.dispose();
        Projekt nyttProject = new Projekt(idb, aid, avdid);
        nyttProject.setVisible(true);
    }//GEN-LAST:event_btnTillbakaAvdProjActionPerformed

    private void cbAvdelningensProjektPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbAvdelningensProjektPopupMenuWillBecomeInvisible
        String avdProj = cbAvdelningensProjekt.getSelectedItem().toString();
        try {
            String sqlFraga = "SELECT * FROM anstalld JOIN avdelning ON anstalld.avdelning = avdelning.avdid "
                    + "JOIN ans_proj ON anstalld.aid = ans_proj.aid "
                    + "JOIN projekt ON ans_proj.pid = projekt.pid "
                    + "WHERE anstalld.avdelning = " + avdid + " AND projektnamn = '" + avdProj + "'";
            HashMap<String, String> avdelningensProjekt = idb.fetchRow(sqlFraga);

            String sqlFraga2 = "SELECT namn FROM land WHERE lid = '" + avdelningensProjekt.get("land") + "'";
            String land = idb.fetchSingle(sqlFraga2);

            String sqlFraga3 = "SELECT fornamn, efternamn FROM anstalld "
                    + "WHERE aid ='" + avdelningensProjekt.get("projektchef") + "'";
            HashMap<String, String> projektchef = idb.fetchRow(sqlFraga3);

            tfAvdProjID.setText(avdelningensProjekt.get("pid"));
            tfAvdProjNamn.setText(avdelningensProjekt.get("projektnamn"));
            taAvdProjBesk.setText(avdelningensProjekt.get("beskrivning"));
            tfAvdProjStart.setText(avdelningensProjekt.get("startdatum"));
            tfAvdProjSlut.setText(avdelningensProjekt.get("slutdatum"));
            tfAvdProjKostn.setText(avdelningensProjekt.get("kostnad"));
            tfAvdProjStatus.setText(avdelningensProjekt.get("status"));
            tfAvdProjPrio.setText(avdelningensProjekt.get("prioritet"));
            tfAvdProjChef.setText(projektchef.get("fornamn") + " " + projektchef.get("efternamn"));
            tfAvdProjLand.setText(land);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_cbAvdelningensProjektPopupMenuWillBecomeInvisible


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTillbakaAvdProj;
    private javax.swing.JComboBox<String> cbAvdelningensProjekt;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAvdProjBesk;
    private javax.swing.JLabel lblAvdProjChef;
    private javax.swing.JLabel lblAvdProjID;
    private javax.swing.JLabel lblAvdProjKostn;
    private javax.swing.JLabel lblAvdProjLand;
    private javax.swing.JLabel lblAvdProjNamn;
    private javax.swing.JLabel lblAvdProjPrio;
    private javax.swing.JLabel lblAvdProjSlut;
    private javax.swing.JLabel lblAvdProjStart;
    private javax.swing.JLabel lblAvdProjStatus;
    private javax.swing.JLabel lblAvdelningensProjektRuta;
    private javax.swing.JTextArea taAvdProjBesk;
    private javax.swing.JTextField tfAvdProjChef;
    private javax.swing.JTextField tfAvdProjID;
    private javax.swing.JTextField tfAvdProjKostn;
    private javax.swing.JTextField tfAvdProjLand;
    private javax.swing.JTextField tfAvdProjNamn;
    private javax.swing.JTextField tfAvdProjPrio;
    private javax.swing.JTextField tfAvdProjSlut;
    private javax.swing.JTextField tfAvdProjStart;
    private javax.swing.JTextField tfAvdProjStatus;
    // End of variables declaration//GEN-END:variables
}
