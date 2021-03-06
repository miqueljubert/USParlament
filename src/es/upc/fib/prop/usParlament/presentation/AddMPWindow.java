/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.upc.fib.prop.usParlament.presentation;

import es.upc.fib.prop.usParlament.misc.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.Map;

//import javafx.scene.input.TouchPoint;

/**
 *
 * @author miquel
 */
public class AddMPWindow extends javax.swing.JFrame {

    /**
     * Creates new form AddMPWindow
     */
    public AddMPWindow(PresentationController pcon,MainView father) {
        pc = pcon;
        pops = father;
        initComponents();
        initElements();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NameLabel = new javax.swing.JLabel();
        StateLabel = new javax.swing.JLabel();
        DistrictLabel = new javax.swing.JLabel();
        addMpLabel = new javax.swing.JLabel();
        MPNameTextField = new javax.swing.JTextField();
        districtTextField = new javax.swing.JTextField();
        stateChooser = new javax.swing.JComboBox();
        scrollPane = new javax.swing.JScrollPane();
        MPAttributesTable = new javax.swing.JTable();
        addMPButton = new javax.swing.JButton();
        attributeDefChooser = new javax.swing.JComboBox();
        valueTextField = new javax.swing.JTextField();
        attrDefLabel = new javax.swing.JLabel();
        attrValueLabel = new javax.swing.JLabel();
        addAttributeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        NameLabel.setText("Name:");

        StateLabel.setText("State:");

        DistrictLabel.setText("District:");

        addMpLabel.setText("Add MP");

        districtTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                districtTextFieldActionPerformed(evt);
            }
        });

        stateChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateChooserActionPerformed(evt);
            }
        });

        MPAttributesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Attr.Name", "Value"
            }
        ));
        scrollPane.setViewportView(MPAttributesTable);

        addMPButton.setText("Add MP");
        addMPButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMPButtonActionPerformed(evt);
            }
        });

        valueTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valueTextFieldActionPerformed(evt);
            }
        });

        attrDefLabel.setText("Attribute Def:");

        attrValueLabel.setText("Value:");

        addAttributeButton.setText("Add Attribute");
        addAttributeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAttributeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StateLabel)
                    .addComponent(NameLabel)
                    .addComponent(DistrictLabel))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addMPButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MPNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(districtTextField)
                    .addComponent(stateChooser, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addMpLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(attributeDefChooser, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(valueTextField)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(attrDefLabel)
                                    .addComponent(attrValueLabel))
                                .addGap(0, 31, Short.MAX_VALUE))
                            .addComponent(addAttributeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(addMpLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NameLabel)
                            .addComponent(MPNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(StateLabel)
                            .addComponent(stateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DistrictLabel)
                            .addComponent(districtTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addMPButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(attrDefLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(attributeDefChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(attrValueLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addAttributeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stateChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateChooserActionPerformed
    }//GEN-LAST:event_stateChooserActionPerformed

    private void districtTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_districtTextFieldActionPerformed
    }//GEN-LAST:event_districtTextFieldActionPerformed

    private void addMPButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMPButtonActionPerformed
        String dist = districtTextField.getText();
        String state = (stateChooser.getSelectedItem().toString());
        String name = MPNameTextField.getText();
        //HAVE TO CHECK IF ALREADY EXISTS THE DISTRICT:STATE PAIR IMPORTANT
        if(name.equals("") || dist.equals("")){
            JOptionPane.showMessageDialog(new JFrame(), "Please add a valid input to value");
            return;
        }
        try {
            Integer.parseInt(dist);
        }catch(NumberFormatException exc){
            JOptionPane.showMessageDialog(new JFrame(), "Unvalid district value");
            return;
        }

        mp = new JSONObject();
        mp.addPair(new JSONString("Name"),new JSONString(name));
        mp.addPair(new JSONString("District"), new JSONString(dist));
        mp.addPair(new JSONString("State"),new JSONString(state));
        pc.addMP(mp,jattributes);
        pc.computeRelationships();
        pops.updateMPManagementMPTable();
        JOptionPane.showMessageDialog(new JFrame(), "MP Added");
        setVisible(false);
        dispose();
    }//GEN-LAST:event_addMPButtonActionPerformed

    private void initElements()
    {
        mp = new JSONObject();
        jattributes = new JSONArray();
        
        for(State s:State.values()){
            stateChooser.addItem(s);
        }
        
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("Attr.Name");
        dtm.addColumn("Value");
        MPAttributesTable.setModel(dtm);
        
        JSONObject jotd = pc.getAttrDefs();
        JSONArray jatd = ((JSONArray)jotd.getJSONByKey("Attribute Definitions"));

        for(JSON element:jatd.getArray()){

            Map<String,String> ms = ((JSONObject)element).basicJSONObjectGetInfo();

            attributeDefChooser.addItem(ms.get("AttrDefName"));
            

        }
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // INICIALITZIACIO DELS ELEMENTS DE LA FINESTRA
        

        
    }//GEN-LAST:event_formWindowOpened

    private void valueTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valueTextFieldActionPerformed
    }//GEN-LAST:event_valueTextFieldActionPerformed

    @SuppressWarnings("empty-statement")
    private void addAttributeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAttributeButtonActionPerformed

        String value = valueTextField.getText();
        Object oattr = attributeDefChooser.getSelectedItem();
        String attr = ((String)oattr);

        if(oattr == null){
            JOptionPane.showMessageDialog(new JFrame(), "No attributes left to add");
            return;
        }

        if(value.equals("")){
            JOptionPane.showMessageDialog(new JFrame(), "Please add a valid input to value");
            return;
        }
        
        JSONObject attro = new JSONObject();
        attro.addPair(new JSONString("AttrDefName"),new JSONString(attr));
        attro.addPair(new JSONString("AttrValue"),new JSONString(value));
        valueTextField.setText("");
        attributeDefChooser.removeItem(oattr);
        jattributes.addElement(attro);
        DefaultTableModel dtm = (DefaultTableModel)MPAttributesTable.getModel();
        String[] sa = {attr,value};
        dtm.addRow(sa);
    }//GEN-LAST:event_addAttributeButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddMPWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMPWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMPWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMPWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        //ONLY WHEN TESTING THIS WINDOW
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMPWindow(new PresentationController(),null).setVisible(true);
            }
        });
    }

    
    private JSONArray jattributes ;
    private JSONObject mp;
    private PresentationController pc;
    private MainView pops;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DistrictLabel;
    private javax.swing.JTable MPAttributesTable;
    private javax.swing.JTextField MPNameTextField;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel StateLabel;
    private javax.swing.JButton addAttributeButton;
    private javax.swing.JButton addMPButton;
    private javax.swing.JLabel addMpLabel;
    private javax.swing.JLabel attrDefLabel;
    private javax.swing.JLabel attrValueLabel;
    private javax.swing.JComboBox attributeDefChooser;
    private javax.swing.JTextField districtTextField;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JComboBox stateChooser;
    private javax.swing.JTextField valueTextField;
    // End of variables declaration//GEN-END:variables
}
