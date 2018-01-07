/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package envelope;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.JOptionPane;
/**
 *
 * @author master
 */
public class Envelope extends javax.swing.JFrame {

    /**
     * Creates new form EnvelopeA
     */
    public Envelope() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dimtype = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        wsz = new javax.swing.JTextField();
        lsz = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cflute = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtFilePathName = new javax.swing.JTextField();
        lblBlkSz = new javax.swing.JLabel();
        r2r2upint = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        style = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dsz = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        createDxf = new javax.swing.JButton();
        btnBlkSz = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Envelopes");

        dimtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID: Internal Dimensions", "BB: Bend to Bend", "OD: Outside Dimensions" }));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Dim Type:");

        lsz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lszActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Flute:");

        cflute.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "G", "E", "B", "C", "EB", "N", "F", "R", "BC" }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("File Name:");

        txtFilePathName.setText("aaNewDrawing.dxf");

        lblBlkSz.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBlkSz.setText("1up Blank Size:");

        r2r2upint.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        r2r2upint.setText("Interlock:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Style:");

        style.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DSS OGS" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Pack Size:");

        jLabel5.setText("x");

        dsz.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                dszFocusLost(evt);
            }
        });

        jLabel6.setText("x");

        createDxf.setText("Create DXF Drawing");
        createDxf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createDxfActionPerformed(evt);
            }
        });

        btnBlkSz.setText("Calc Blank Size");
        btnBlkSz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBlkSzActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("(Open Side)");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("(Envelope D)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(createDxf, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBlkSz, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cflute, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFilePathName, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lsz, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(wsz, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dsz, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(dimtype, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblBlkSz, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(r2r2upint, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(36, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addGap(186, 186, 186)))
                .addComponent(style, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(style, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(10, 10, 10)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dimtype, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(lsz, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(wsz, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(dsz, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFilePathName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(cflute, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(lblBlkSz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(r2r2upint, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBlkSz, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createDxf, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lszActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lszActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lszActionPerformed

    private void dszFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dszFocusLost
        try {

        } catch(Exception e) {
            System.err.println("ERROR: " + e.getMessage());
            e.printStackTrace();
        } finally {

        } // end of try
    }//GEN-LAST:event_dszFocusLost

    
    private void createDxfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createDxfActionPerformed
        double l = Double.parseDouble(lsz.getText());
        double w = Double.parseDouble(wsz.getText());
//        double d = Double.parseDouble(dsz.getText());

//        if (dimtype.getSelectedItem() == "ID: Internal Dimensions") {
//          // Do mothing
//        } else if (dimtype.getSelectedItem() == "OD: Outside Dimensions") {
//          l = l - 14;
//          w = w - 4;
//          d = d - 4;
//        } else {
//          l = l - 12;
//          w = w - 2;
//          d = d - 2;
//        }

        String outputDxfData = "";   

        drawEnvelope oDxf = new drawEnvelope();

        oDxf.xabs = 0;
        oDxf.yabs = 0;
        oDxf.length = l;
        oDxf.width = w;
        oDxf.depth = 0;

        oDxf.unit = "M";
        oDxf.style = "";
        oDxf.flute = "E"; //(String) cflutetype.getSelectedItem();
        oDxf.cutlay = "CUT";
        oDxf.crelay = "CREASE";
        oDxf.dxf = ""; // Output File's contents
        oDxf.dxfxmax = String.valueOf(0);
        oDxf.dxfymax = String.valueOf(0);

        oDxf.Xaxis = 1; // Direction of X axis +1 or -1
        oDxf.Yaxis = 1; // Direction of Y axis +1 or -1

        oDxf.allowanceSetup();
        outputDxfData = oDxf.drawDSSOGS();

        String outputDir = ""; // "../temp/";
        File f = new File(outputDir + "AnewEnv.dxf"); // txtFilePathName.getText());
        if(f.exists() && !f.isDirectory()) { 
          f.delete();
        }
        String outputDxfFile = outputDir + "AnewEnv.dxf"; // "testfilel.dxf"; // "/var/www/temp/testfilel.dxf";

        BufferedWriter writer = null; // Note outside try block
        try {
          //create a file
          File newDxfFile = new File(outputDxfFile);

          writer = new BufferedWriter(new FileWriter(newDxfFile));
          writer.write(outputDxfData);
          writer.flush();
        } catch (Exception e) {
          e.printStackTrace();
        } finally {
          try {
            // Close the writer regardless of what happens...
            writer.close();
          } catch (Exception e) {
          }
        }
        JOptionPane.showMessageDialog(null, "Saved: " + outputDxfFile); 
        
    }//GEN-LAST:event_createDxfActionPerformed

    private void btnBlkSzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBlkSzActionPerformed
        double l = Double.parseDouble(lsz.getText());
        double w = Double.parseDouble(wsz.getText());
        double d = Double.parseDouble(dsz.getText());
  //        double d = Double.parseDouble(dsz.getText());


//        if (dimtype.getSelectedItem() == "ID: Internal Dimensions") {
//          // Do mothing
//        } else if (dimtype.getSelectedItem() == "OD: Outside Dimensions") {
//          l = l - 14;
//          w = w - 4;
//          d = d - 4;
//        } else {
//          l = l - 12;
//          w = w - 2;
//          d = d - 2;
//        }

        String outputDxfData = "";   

        drawEnvelope oDxf = new drawEnvelope();

        oDxf.xabs = 0;
        oDxf.yabs = 0;
        oDxf.length = l;
        oDxf.width = w;
        oDxf.depth = 0;

        oDxf.unit = "M";
        oDxf.style = "";
        oDxf.flute = "E"; //(String) cflutetype.getSelectedItem();
        oDxf.cutlay = "CUT";
        oDxf.crelay = "CREASE";
        oDxf.dxf = ""; // Output File's contents
        oDxf.dxfxmax = String.valueOf(0);
        oDxf.dxfymax = String.valueOf(0);

        oDxf.Xaxis = 1; // Direction of X axis +1 or -1
        oDxf.Yaxis = 1; // Direction of Y axis +1 or -1

        oDxf.allowanceSetup();
        outputDxfData = oDxf.drawDSSOGS();

        String outputDir = ""; // "../temp/";
        File f = new File(outputDir + "AnewEnv.dxf"); // txtFilePathName.getText());
        if(f.exists() && !f.isDirectory()) { 
          f.delete();
        }
        String outputDxfFile = outputDir + "AnewEnv.dxf"; // "testfilel.dxf"; // "/var/www/temp/testfilel.dxf";

        BufferedWriter writer = null; // Note outside try block
        try {
          //create a file
          File newDxfFile = new File(outputDxfFile);

          writer = new BufferedWriter(new FileWriter(newDxfFile));
          writer.write(outputDxfData);
          writer.flush();
        } catch (Exception e) {
          e.printStackTrace();
        } finally {
          try {
            // Close the writer regardless of what happens...
            writer.close();
          } catch (Exception e) {
          }
        }
        JOptionPane.showMessageDialog(null, "Saved: " + outputDxfFile); 
  
    }//GEN-LAST:event_btnBlkSzActionPerformed

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
            java.util.logging.Logger.getLogger(Envelope.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Envelope.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Envelope.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Envelope.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Envelope().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBlkSz;
    private javax.swing.JComboBox<String> cflute;
    private javax.swing.JButton createDxf;
    private javax.swing.JComboBox<String> dimtype;
    private javax.swing.JTextField dsz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblBlkSz;
    private javax.swing.JTextField lsz;
    private javax.swing.JLabel r2r2upint;
    private javax.swing.JComboBox<String> style;
    private javax.swing.JTextField txtFilePathName;
    private javax.swing.JTextField wsz;
    // End of variables declaration//GEN-END:variables
}