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
private String pid;
 
    /**
     * Creates new form AllaProjekt
     */
    public AllaProjekt(InfDB idb) {
        initComponents();
        this.idb= idb; 
        fyllCBAllaProjekt();
    }

    // CB = combobox
    public void fyllCBAllaProjekt(){
        try{
            String sqlFraga = "SELECT projektnamn FROM projekt";
            System.out.println(sqlFraga);
            ArrayList<String> projektNamnLista = idb.fetchColumn(sqlFraga);

            for(String ettProjekt: projektNamnLista){
                cbAllaProjekt.addItem(ettProjekt);
            }
        }catch(Exception ex){
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
        btnLaggTillProjektAllaProjekt = new javax.swing.JButton();
        lblProjektnamnAllaProjekt = new javax.swing.JLabel();
        tfProjektnamnAllaProjekt = new javax.swing.JTextField();

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

        bnTaBortAllaProjekt.setText("Ta bort");
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

        btnLaggTillProjektAllaProjekt.setText("Lägg till projekt");
        btnLaggTillProjektAllaProjekt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaggTillProjektAllaProjektActionPerformed(evt);
            }
        });

        lblProjektnamnAllaProjekt.setText("Projektnamn");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblProjektnamnAllaProjekt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblBeskrivningAllaProjekt)
                                .addComponent(lblStartDatumAllaProjekt)
                                .addComponent(lblSlutdatumAllaProjekt)
                                .addComponent(lblKostnadAllaProjekt)
                                .addComponent(lblStatusAllaProjekt)
                                .addComponent(lblPrioAllaProjekt)
                                .addComponent(lblLandAllaProjekt)
                                .addComponent(btnTillbakaAllaProj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblProduktchefAllaProjekt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(cbAllaProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnLaggTillProjektAllaProjekt)
                                .addComponent(tfProjektchefAllaProjekt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(tfStartdatumAllaProjekt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfSlutDatumAllaProjekt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfKostnadAllaProjekt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfStatusAllaProjekt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfPrioAllaProjekt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfBeskrivningAllaProjekt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfLandAllaProjekt, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfProjektnamnAllaProjekt, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAndraAllaProjekt)
                                .addGap(18, 18, 18)
                                .addComponent(bnTaBortAllaProjekt))))
                    .addComponent(lblAllaProjektRuta))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblAllaProjektRuta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLaggTillProjektAllaProjekt)
                    .addComponent(cbAllaProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
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
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTillbakaAllaProj)
                    .addComponent(btnAndraAllaProjekt)
                    .addComponent(bnTaBortAllaProjekt))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbAllaProjektPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbAllaProjektPopupMenuWillBecomeInvisible
     String projektNamn =(String) cbAllaProjekt.getSelectedItem();
    try{
    String sqlFraga = "SELECT * FROM projekt WHERE projektnamn = '" + projektNamn +"'"; 
    System.out.println(sqlFraga);
  
    HashMap<String,String>projektNamnLista = idb.fetchRow(sqlFraga);
    
    if(projektNamnLista !=null){
    tfProjektnamnAllaProjekt.setText(projektNamnLista.get("projektnamn"));
    tfProjektchefAllaProjekt.setText(projektNamnLista.get("projektchef"));
    tfBeskrivningAllaProjekt.setText(projektNamnLista.get("beskrivning"));
    tfStartdatumAllaProjekt.setText(projektNamnLista.get("startdatum"));
    tfSlutDatumAllaProjekt.setText(projektNamnLista.get("slutdatum"));
    tfKostnadAllaProjekt.setText(projektNamnLista.get("kostnad"));
    tfStatusAllaProjekt.setText(projektNamnLista.get("status"));
    tfPrioAllaProjekt.setText(projektNamnLista.get("prioritet"));
    tfLandAllaProjekt.setText(projektNamnLista.get("land"));
    
    
    }
    }catch(Exception ex){
    System.out.println(ex.getMessage());
    
    }
        
        
        
    }//GEN-LAST:event_cbAllaProjektPopupMenuWillBecomeInvisible

    private void btnTillbakaAllaProjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaAllaProjActionPerformed
      this.toBack();
        Projekt nyttProjekt = new Projekt(idb, pid, aid);
        nyttProjekt.setVisible(true);
        nyttProjekt.toFront();
    }//GEN-LAST:event_btnTillbakaAllaProjActionPerformed

    private void btnAndraAllaProjektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndraAllaProjektActionPerformed
     try{
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
    } catch(Exception ex){
    System.out.println(ex.getMessage());
    }
    }//GEN-LAST:event_btnAndraAllaProjektActionPerformed

    private void bnTaBortAllaProjektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnTaBortAllaProjektActionPerformed
             try{
        String projektNamn = cbAllaProjekt.getSelectedItem().toString();


        String projektchef = tfProjektchefAllaProjekt.getText();
        String beskrivning = tfBeskrivningAllaProjekt.getText();
        String startdatum = tfStartdatumAllaProjekt.getText();
        String slutdatum = tfSlutDatumAllaProjekt.getText();
        String kostnad = tfKostnadAllaProjekt.getText();
        String status = tfStatusAllaProjekt.getText();
        String prioritet = tfPrioAllaProjekt.getText();
        String land = tfLandAllaProjekt.getText();
        
      
    
        String sqlFraga = "DELETE projekt FROM projekt WHERE projektnamn = '" + projektNamn +"'";
        idb.delete(sqlFraga);
    } catch(Exception ex){
    System.out.println(ex.getMessage());
    }
    }//GEN-LAST:event_bnTaBortAllaProjektActionPerformed

    private void btnLaggTillProjektAllaProjektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaggTillProjektAllaProjektActionPerformed
         try{
        String projektNamn = cbAllaProjekt.getSelectedItem().toString();


        String projektchef = tfProjektchefAllaProjekt.getText();
        String beskrivning = tfBeskrivningAllaProjekt.getText();
        String startdatum = tfStartdatumAllaProjekt.getText();
        String slutdatum = tfSlutDatumAllaProjekt.getText();
        String kostnad = tfKostnadAllaProjekt.getText();
        String status = tfStatusAllaProjekt.getText();
        String prioritet = tfPrioAllaProjekt.getText();
        String land = tfLandAllaProjekt.getText();
        
      
    
        String sqlFraga = "INSERT INTO projekt (projektchef, beskrivning, startdatum,slutdatum,kostnad,status,prioritet,land) WHERE projektnamn = '" + projektNamn +"'";
        idb.insert(sqlFraga);
    } catch(Exception ex){
    System.out.println(ex.getMessage());
    }   
    }//GEN-LAST:event_btnLaggTillProjektAllaProjektActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnTaBortAllaProjekt;
    private javax.swing.JButton btnAndraAllaProjekt;
    private javax.swing.JButton btnLaggTillProjektAllaProjekt;
    private javax.swing.JButton btnTillbakaAllaProj;
    private javax.swing.JComboBox<String> cbAllaProjekt;
    private javax.swing.JLabel lblAllaProjektRuta;
    private javax.swing.JLabel lblBeskrivningAllaProjekt;
    private javax.swing.JLabel lblKostnadAllaProjekt;
    private javax.swing.JLabel lblLandAllaProjekt;
    private javax.swing.JLabel lblPrioAllaProjekt;
    private javax.swing.JLabel lblProduktchefAllaProjekt;
    private javax.swing.JLabel lblProjektnamnAllaProjekt;
    private javax.swing.JLabel lblSlutdatumAllaProjekt;
    private javax.swing.JLabel lblStartDatumAllaProjekt;
    private javax.swing.JLabel lblStatusAllaProjekt;
    private javax.swing.JTextField tfBeskrivningAllaProjekt;
    private javax.swing.JTextField tfKostnadAllaProjekt;
    private javax.swing.JTextField tfLandAllaProjekt;
    private javax.swing.JTextField tfPrioAllaProjekt;
    private javax.swing.JTextField tfProjektchefAllaProjekt;
    private javax.swing.JTextField tfProjektnamnAllaProjekt;
    private javax.swing.JTextField tfSlutDatumAllaProjekt;
    private javax.swing.JTextField tfStartdatumAllaProjekt;
    private javax.swing.JTextField tfStatusAllaProjekt;
    // End of variables declaration//GEN-END:variables
}
