/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bjs;

import ausgabe.InhaltAlleKlassen;
import ausgabe.InhaltKlasse;
import ausgabe.PrintPDF;
import helper.Import;
import helper.Speicherung;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.text.MaskFormatter;
import modell.BJS;
import modell.Jahrgang;
import modell.Klasse;
import modell.Schueler;

/**
 *
 * @author behl.claus
 */
public class BJSMainFrame extends javax.swing.JFrame {

    BJS bjs;
    Klasse aktuelleKlasse = new Klasse("05a");

    /**
     * Creates new form BJSMainFrame
     */
    public BJSMainFrame() {
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

        KlasseJComboBox = new javax.swing.JComboBox<>();
        jButtonDrucken = new javax.swing.JButton();
        jButtonSpeichern = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        importjMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        druckeAlleMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bundesjugendspiele v0.1");
        setPreferredSize(new java.awt.Dimension(850, 800));

        KlasseJComboBox.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "" }));
        KlasseJComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                KlasseJComboBoxItemStateChanged(evt);
            }
        });
        KlasseJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KlasseJComboBoxActionPerformed(evt);
            }
        });

        jButtonDrucken.setText("Drucken");
        jButtonDrucken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDruckenActionPerformed(evt);
            }
        });

        jButtonSpeichern.setText("Speichern");
        jButtonSpeichern.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSpeichernActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTable1.setModel(new SchulklasseTablemodell(aktuelleKlasse));
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(300);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(30);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(60);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(60);
        jTable1.setCellSelectionEnabled(true);
        jScrollPane2.setViewportView(jTable1);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Datei");
        fileMenu.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                fileMenuInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Öffnen");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem);

        importjMenuItem.setText("Import Schülerliste");
        importjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importjMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(importjMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Speichern");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Speichern unter");
        fileMenu.add(saveAsMenuItem);

        druckeAlleMenuItem.setText("Drucke alle Klassen");
        druckeAlleMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                druckeAlleMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(druckeAlleMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Hilfe");

        contentsMenuItem.setMnemonic('c');
        contentsMenuItem.setText("Inhalt");
        helpMenu.add(contentsMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(KlasseJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonDrucken)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSpeichern)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDrucken)
                    .addComponent(jButtonSpeichern)
                    .addComponent(KlasseJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        // TODO add your handling code here:
        System.out.println("About angeklickt");
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void KlasseJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KlasseJComboBoxActionPerformed
        String klassenName = String.valueOf(KlasseJComboBox.getSelectedItem());
        System.out.println(klassenName);
        for (Klasse k : bjs.getAlleKlassen()) {
            if (k.getName().equals(klassenName)) {
                aktuelleKlasse = k;
                break;
            }
        }
        this.setTableModell();

    }//GEN-LAST:event_KlasseJComboBoxActionPerformed

    private void importjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importjMenuItemActionPerformed
        // TODO add your handling code here:
        bjs = new Import().gibBJS();

        aktuelleKlasse = bjs.getKlasse(0);

        System.out.println("Textausgabe Import Klassen ");
        for (Klasse k : bjs.getAlleKlassen()) {
            System.out.println(k.getName());
        }
        this.setTableModell();
        this.setComboBoxModel();

    }//GEN-LAST:event_importjMenuItemActionPerformed

    private void fileMenuInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_fileMenuInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_fileMenuInputMethodTextChanged

    private void jButtonDruckenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDruckenActionPerformed

        String nameKlasse = aktuelleKlasse.getName();
        String nameFile = nameKlasse + "_Ergebnis.pdf";

        PrintPDF pdf = new PrintPDF(nameFile);
        pdf.setInhalt(new InhaltKlasse(aktuelleKlasse));
        File pdfFile = pdf.drucken();

        zeigePdf(pdfFile);


    }//GEN-LAST:event_jButtonDruckenActionPerformed

    private void jButtonSpeichernActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSpeichernActionPerformed
        // TODO add your handling code here:
        Speicherung sp = new Speicherung(bjs);
        sp.bjsInDateiSchreiben();
    }//GEN-LAST:event_jButtonSpeichernActionPerformed

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
        // TODO add your handling code here:
        Speicherung sp = new Speicherung(bjs);
        bjs = sp.bjsAusDateiLesen();
        aktuelleKlasse = bjs.getKlasse(0);

        this.setTableModell();
        this.setComboBoxModel();

    }//GEN-LAST:event_openMenuItemActionPerformed

    private void KlasseJComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_KlasseJComboBoxItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_KlasseJComboBoxItemStateChanged

    private void druckeAlleMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_druckeAlleMenuItemActionPerformed
        // TODO add your handling code here:
        String nameFile = "GesamtErgebnis.pdf";

        PrintPDF pdf = new PrintPDF(nameFile);
        pdf.setInhalt(new InhaltAlleKlassen(bjs));
        File pdfFile = pdf.drucken();

        zeigePdf(pdfFile);
    }//GEN-LAST:event_druckeAlleMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(BJSMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BJSMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BJSMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BJSMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BJSMainFrame().setVisible(true);
            }
        });
    }

    public void setTableModell() {
        JTextField tf = new JTextField();
        tf.setBorder(null);
        jTable1.setModel(new SchulklasseTablemodell(aktuelleKlasse));
        jTable1.setShowGrid(true);
        //jTable1.setDefaultRenderer(Object.class, new DateRenderer());
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(300);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(30);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(60);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(60);
        jTable1.getColumnModel().getColumn(3).setCellRenderer(new DateRenderer());
        jTable1.getColumnModel().getColumn(3).setCellEditor(new LeistungEditor(tf));
        jTable1.getColumnModel().getColumn(4).setCellEditor(new LeistungEditor(tf));
        jTable1.getColumnModel().getColumn(4).setCellRenderer(new DateRenderer());
        jTable1.getColumnModel().getColumn(5).setCellEditor(new LeistungEditor(tf));
        jTable1.getColumnModel().getColumn(5).setCellRenderer(new LengthRenderer());
        jTable1.setRowHeight(20);
        //jTable1.updateUI();
    }

    public void setComboBoxModel() {
        String[] klassenliste = new String[bjs.getAlleKlassen().size()];
        for (int i = 0; i < bjs.getAlleKlassen().size(); i++) {
            klassenliste[i] = bjs.getAlleKlassen().get(i).getName();
        }
        DefaultComboBoxModel<String> myComboBoxModel = new DefaultComboBoxModel<>(klassenliste);
        this.KlasseJComboBox.setModel(myComboBoxModel);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> KlasseJComboBox;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenuItem druckeAlleMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem importjMenuItem;
    private javax.swing.JButton jButtonDrucken;
    private javax.swing.JButton jButtonSpeichern;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

    private void zeigePdf(File pdfFile) {
        try {
            Desktop desktop = Desktop.getDesktop();
            if (desktop != null && desktop.isSupported(Desktop.Action.OPEN)) {
                desktop.open(pdfFile);
            } else {
                System.err.println("PDF-Datei kann nicht angezeigt werden!");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
