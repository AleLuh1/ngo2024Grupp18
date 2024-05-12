/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo2024grupp18;

import java.util.HashMap;
import oru.inf.InfDB;

/**
 *
 * @author alex
 */
public class Projekt extends javax.swing.JFrame {
    private InfDB idb;
    private String pid;
    /**
     * Creates new form Projekt
     */
    public Projekt(InfDB idb, String pid) {
        initComponents();
        this.idb = idb;
        this.pid = pid;
        try {
            String sqlFraga = "SELECT * FROM projekt WHERE pid = " + pid;
            System.out.println(sqlFraga);
            HashMap<String, String> projekt = idb.fetchRow(sqlFraga);
//            tfFornamn.setText(anstalld.get("fornamn"));
//            tfFornamn.setEditable(false);
        } catch (Exception ex) {

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

        btnMinaProjekt = new javax.swing.JButton();
        btnAvdProjekt = new javax.swing.JButton();
        btnAllaProjekt = new javax.swing.JButton();
        btnTillbakaProj = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnMinaProjekt.setText("Mina projekt");

        btnAvdProjekt.setText("Avdelningens projekt");

        btnAllaProjekt.setText("Alla projekt");

        btnTillbakaProj.setText("Tillbaka");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTillbakaProj)
                    .addComponent(btnAllaProjekt)
                    .addComponent(btnAvdProjekt)
                    .addComponent(btnMinaProjekt))
                .addContainerGap(220, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btnMinaProjekt)
                .addGap(31, 31, 31)
                .addComponent(btnAvdProjekt)
                .addGap(35, 35, 35)
                .addComponent(btnAllaProjekt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(btnTillbakaProj)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAllaProjekt;
    private javax.swing.JButton btnAvdProjekt;
    private javax.swing.JButton btnMinaProjekt;
    private javax.swing.JButton btnTillbakaProj;
    // End of variables declaration//GEN-END:variables
}