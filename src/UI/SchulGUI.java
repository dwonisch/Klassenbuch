/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UI;

import Collections.PersonenModell;
import Entities.Lehrer;
import Entities.Person;
import Entities.Schueler;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class SchulGUI extends javax.swing.JFrame {

    private final Map<String, PersonenModell> personenListen;
    
    /**
     * Creates new form SchulGUI
     */
    public SchulGUI() {
        this.personenListen = new HashMap<>();
        this.personenListen.put("2AHIF", new PersonenModell());        
        this.personenListen.put("2BHIF", new PersonenModell());
        this.personenListen.put("2CHIF", new PersonenModell());        
        this.personenListen.put("Lehrer", new PersonenModell());

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

        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        schuelerSelection = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        klassenAuswahl = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        personenAnzeige = new javax.swing.JList();
        jPanel2 = new javax.swing.JPanel();
        vorname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nachname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        katalognr = new javax.swing.JTextField();
        katalogLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jLabel4.setText("Vorname:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setDividerLocation(150);

        buttonGroup1.add(schuelerSelection);
        schuelerSelection.setSelected(true);
        schuelerSelection.setText("Schüler");
        schuelerSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onSchueler(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Lehrer");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onLehrer(evt);
            }
        });

        jLabel1.setText("Klasse:");

        klassenAuswahl.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2AHIF", "2BHIF", "2CHIF", "Lehrer" }));
        klassenAuswahl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onSelectKlasse(evt);
            }
        });

        personenAnzeige.setModel(getAktuelleKlasse());
        personenAnzeige.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                onSelectPerson(evt);
            }
        });
        jScrollPane1.setViewportView(personenAnzeige);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(klassenAuswahl, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(schuelerSelection)
                            .addComponent(jRadioButton2)
                            .addComponent(jLabel1))
                        .addGap(0, 68, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(schuelerSelection)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(klassenAuswahl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE))
        );

        schuelerSelection.getAccessibleContext().setAccessibleName("schueler");
        jRadioButton2.getAccessibleContext().setAccessibleName("lehrer");
        klassenAuswahl.getAccessibleContext().setAccessibleName("klasse");

        jSplitPane1.setLeftComponent(jPanel1);

        jLabel2.setText("Vorname:");

        jLabel3.setText("Nachname:");

        katalognr.setEditable(false);

        katalogLabel.setText("Katalognummer:");

        jButton1.setText("Einfügen");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onEinfuegen(evt);
            }
        });

        jButton2.setText("Löschen");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onLoeschen(evt);
            }
        });

        jButton3.setText("Ändern");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onAendern(evt);
            }
        });

        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onClear(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(vorname, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nachname, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(katalogLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(katalognr, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vorname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nachname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(katalognr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(katalogLabel))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onEinfuegen(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onEinfuegen
        String klasse = klassenAuswahl.getSelectedItem().toString();
        PersonenModell liste = personenListen.get(klasse);
        
        Person person;
        
        if(schuelerSelection.isSelected()){
            person = new Schueler(vorname.getText(), nachname.getText(), klasse);
        } else {
            person = new Lehrer(vorname.getText(), nachname.getText(), katalognr.getText());
        }
        
        liste.add(person);
    }//GEN-LAST:event_onEinfuegen

    private void onSchueler(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onSchueler
        // TODO add your handling code here:
        katalognr.setEditable(false);
        katalogLabel.setText("Katalognummer:");
        klassenAuswahl.setEnabled(true);
        klassenAuswahl.setSelectedItem("2AHIF");
        
    }//GEN-LAST:event_onSchueler

    private void onLehrer(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onLehrer
        // TODO add your handling code here:
        katalognr.setEditable(true);
        klassenAuswahl.setEnabled(false);
        klassenAuswahl.setSelectedItem("Lehrer");
        katalogLabel.setText("Kurzzeichen:");
    }//GEN-LAST:event_onLehrer

    private void onSelectKlasse(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onSelectKlasse
        personenAnzeige.setModel(getAktuelleKlasse());
    }//GEN-LAST:event_onSelectKlasse

    private void onClear(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onClear
        vorname.setText(null);
        nachname.setText(null);
        katalognr.setText(null);
    }//GEN-LAST:event_onClear

    private void onLoeschen(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onLoeschen
        Person person = getAktuellePerson();
        if(person == null)
            return;
        
        if(JOptionPane.showConfirmDialog(this, String.format("Möchten Sie '%s' wirklich löschen?", person)) == JOptionPane.OK_OPTION) {
            getAktuelleKlasse().remove(person);
        }
    }//GEN-LAST:event_onLoeschen

    private void onSelectPerson(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_onSelectPerson
        Person person = getAktuellePerson();
        
        vorname.setText(person.getVorname());
        nachname.setText(person.getNachname());
        katalognr.setText(person.getId());
    }//GEN-LAST:event_onSelectPerson

    private void onAendern(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onAendern
        Person person = getAktuellePerson();
        if(person != null){
            person.setVorname(vorname.getText());
            person.setNachname(nachname.getText());
            person.setId(katalognr.getText());
            getAktuelleKlasse().refresh();
        }
    }//GEN-LAST:event_onAendern

    private PersonenModell getAktuelleKlasse(){
        String klasse = klassenAuswahl.getSelectedItem().toString();
        return personenListen.get(klasse);
    }
    
    private Person getAktuellePerson(){
        return (Person)personenAnzeige.getSelectedValue();
    }
    
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
            java.util.logging.Logger.getLogger(SchulGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SchulGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SchulGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SchulGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SchulGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel katalogLabel;
    private javax.swing.JTextField katalognr;
    private javax.swing.JComboBox klassenAuswahl;
    private javax.swing.JTextField nachname;
    private javax.swing.JList personenAnzeige;
    private javax.swing.JRadioButton schuelerSelection;
    private javax.swing.JTextField vorname;
    // End of variables declaration//GEN-END:variables
}
