/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lez_05_oggetti;

import java.util.ArrayList;

/**
 *
 * @author tss
 */
public class gestioneScuola extends javax.swing.JFrame {
    // attributi scuola
    // elenco corsi
    ArrayList<corso> elencoCorsi;
    String nomeScuola;
    
    /**
     * Creates new form gestioneScuola
     */
    public gestioneScuola() {
        initComponents();
        elencoCorsi = new ArrayList<corso>();
        nomeScuola ="Ferrucci liceo to";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane3 = new javax.swing.JTabbedPane();
        panCorsi2 = new javax.swing.JPanel();
        addCorso = new javax.swing.JButton();
        tnomecorso = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tedizione = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tore = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tpelencocorsi = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        panCorsi1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTCognome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTNome = new javax.swing.JTextField();
        AddAlunno = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTcorso = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tpVisCorsi = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.lightGray);

        panCorsi2.setBackground(javax.swing.UIManager.getDefaults().getColor("ComboBox.selectionBackground"));

        addCorso.setText("Add Corso");
        addCorso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCorsoActionPerformed(evt);
            }
        });

        tnomecorso.setBackground(java.awt.Color.white);
        tnomecorso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnomecorsoActionPerformed(evt);
            }
        });

        jLabel10.setText("Nome corso");

        jLabel11.setText("Edizione");

        tedizione.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tedizioneActionPerformed(evt);
            }
        });

        jLabel12.setText("numero ore");

        tore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toreActionPerformed(evt);
            }
        });

        jScrollPane4.setViewportView(tpelencocorsi);

        jLabel4.setText("Gestione Corsi");

        javax.swing.GroupLayout panCorsi2Layout = new javax.swing.GroupLayout(panCorsi2);
        panCorsi2.setLayout(panCorsi2Layout);
        panCorsi2Layout.setHorizontalGroup(
            panCorsi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCorsi2Layout.createSequentialGroup()
                .addGroup(panCorsi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addCorso, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(tnomecorso, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addComponent(jLabel11)
                    .addComponent(tedizione)
                    .addComponent(jLabel12)
                    .addComponent(tore))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(326, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panCorsi2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(277, 277, 277))
        );
        panCorsi2Layout.setVerticalGroup(
            panCorsi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panCorsi2Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(21, 21, 21)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panCorsi2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panCorsi2Layout.createSequentialGroup()
                        .addComponent(tnomecorso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tedizione, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tore, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addCorso)
                .addContainerGap())
        );

        jTabbedPane3.addTab("tab2", panCorsi2);

        panCorsi1.setBackground(javax.swing.UIManager.getDefaults().getColor("ComboBox.selectionBackground"));

        jLabel1.setText("Gestione alunni");

        jLabel2.setText("Cognome");

        jTCognome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCognomeActionPerformed(evt);
            }
        });

        jLabel3.setText("Nome");

        jTNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNomeActionPerformed(evt);
            }
        });

        AddAlunno.setText("Aggiungi");
        AddAlunno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddAlunnoActionPerformed(evt);
            }
        });

        jLabel5.setText("N.corso:");

        jLabel6.setText("nessun corso");

        jScrollPane1.setViewportView(tpVisCorsi);

        javax.swing.GroupLayout panCorsi1Layout = new javax.swing.GroupLayout(panCorsi1);
        panCorsi1.setLayout(panCorsi1Layout);
        panCorsi1Layout.setHorizontalGroup(
            panCorsi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCorsi1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(286, 286, 286)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(433, Short.MAX_VALUE))
            .addGroup(panCorsi1Layout.createSequentialGroup()
                .addGroup(panCorsi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panCorsi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTCognome)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTNome, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE))
                    .addComponent(AddAlunno)
                    .addGroup(panCorsi1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(2, 2, 2)
                        .addComponent(jTcorso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panCorsi1Layout.setVerticalGroup(
            panCorsi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCorsi1Layout.createSequentialGroup()
                .addGroup(panCorsi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(panCorsi1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTCognome, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTNome, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panCorsi1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTcorso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddAlunno)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("tab1", panCorsi1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
                .addGap(728, 728, 728))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(374, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void toreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toreActionPerformed

    private void tedizioneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tedizioneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tedizioneActionPerformed

    private void tnomecorsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnomecorsoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnomecorsoActionPerformed

    private void addCorsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCorsoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addCorsoActionPerformed

    private void AddAlunnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddAlunnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddAlunnoActionPerformed

    private void jTNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNomeActionPerformed

    private void jTCognomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCognomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCognomeActionPerformed

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
            java.util.logging.Logger.getLogger(gestioneScuola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gestioneScuola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gestioneScuola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gestioneScuola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gestioneScuola().setVisible(true);
            }
        });
    }
    
    public String refreshElencocorsi(){
        String ris="";
       
        for (int i = 0; i < elencoCorsi.size(); i++) {
            corso c= elencoCorsi.get(i);
            ris += (1+i) + ")" +c.getRowCorso();
        }
        return ris;
    }
    public void azzeracampi(){
        tnomecorso.setText("");
        tedizione.setText("");
        tore.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddAlunno;
    private javax.swing.JButton addCorso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTCognome;
    private javax.swing.JTextField jTNome;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTextField jTcorso;
    private javax.swing.JPanel panCorsi1;
    private javax.swing.JPanel panCorsi2;
    private javax.swing.JTextField tedizione;
    private javax.swing.JTextField tnomecorso;
    private javax.swing.JTextField tore;
    private javax.swing.JTextPane tpVisCorsi;
    private javax.swing.JTextPane tpelencocorsi;
    // End of variables declaration//GEN-END:variables
}
