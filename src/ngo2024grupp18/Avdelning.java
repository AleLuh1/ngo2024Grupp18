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
public class Avdelning extends javax.swing.JFrame {
    private InfDB idb;
    private String avdid;
    /**
     * Creates new form Avdelning
     */
    public Avdelning(InfDB idb, String avdid) {
        initComponents();
        this.idb = idb;
        this.avdid = avdid;
        try {
            String sqlFraga = "SELECT * FROM avdelning WHERE avdid = " + avdid;
            System.out.println(sqlFraga);
            HashMap<String, String> avdelning = idb.fetchRow(sqlFraga); 
        } catch(Exception ex) {
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

        btnSeAnstallda = new javax.swing.JButton();
        btnTillbakaAvd = new javax.swing.JButton();
        lblAvdelningRuta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSeAnstallda.setText("Se anställda");

        btnTillbakaAvd.setText("Tillbaka");

        lblAvdelningRuta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblAvdelningRuta.setText("Avdelning");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAvdelningRuta)
                    .addComponent(btnTillbakaAvd)
                    .addComponent(btnSeAnstallda))
                .addContainerGap(264, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAvdelningRuta)
                .addGap(9, 9, 9)
                .addComponent(btnSeAnstallda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                .addComponent(btnTillbakaAvd)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSeAnstallda;
    private javax.swing.JButton btnTillbakaAvd;
    private javax.swing.JLabel lblAvdelningRuta;
    // End of variables declaration//GEN-END:variables
}
