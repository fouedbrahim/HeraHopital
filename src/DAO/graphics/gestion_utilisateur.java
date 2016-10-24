/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.graphics;

import DAO.implementation.DAO_utlisateur;
import DAO.interfaces.IDAO_utilisateurs;
import entites.Medecin;
import entites.utilisateur;
import javax.swing.JOptionPane;

/**
 *
 * @author Amira
 */
public class gestion_utilisateur extends javax.swing.JFrame {

    /**
     * Creates new form gestion_utilisateur
     */
    public gestion_utilisateur() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nomU = new javax.swing.JTextField();
        prenomU = new javax.swing.JTextField();
        cinU = new javax.swing.JTextField();
        confirmer = new javax.swing.JButton();
        typeU = new javax.swing.JLabel();
        typeUti = new javax.swing.JComboBox();
        email = new javax.swing.JLabel();
        EmailUti = new javax.swing.JTextField();
        mdp = new javax.swing.JLabel();
        mdpU = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        telU = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        photoU = new javax.swing.JTextField();
        dateU = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        specialite = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        ciinU = new javax.swing.JTextField();
        supprimer = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });
        jTabbedPane1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTabbedPane1PropertyChange(evt);
            }
        });

        jPanel4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel4KeyPressed(evt);
            }
        });

        jLabel1.setText("Nom:");

        jLabel2.setText("Prenom:");

        jLabel3.setText("CIN:");

        confirmer.setText("Confirmer");
        confirmer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmerActionPerformed(evt);
            }
        });

        typeU.setText("Type de l'utilisateur:");

        typeUti.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Medecin", "Stagiaire", "Benevole", "Secretaire", "Administrateur" }));
        typeUti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeUtiActionPerformed(evt);
            }
        });

        email.setText("Email:");

        mdp.setText("Mot de passe:");

        jLabel4.setText("Tel:");

        jLabel5.setText("Photo:");

        jLabel6.setText("Date naissance:");

        jLabel9.setText("Specialité:");

        specialite.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cardiologue", "Generaliset", "Pediatre" }));
        specialite.setOpaque(false);
        specialite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                specialiteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(91, 91, 91)
                                .addComponent(jLabel8))
                            .addComponent(typeU)
                            .addComponent(mdp)
                            .addComponent(email)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(prenomU, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nomU, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cinU, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(typeUti, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EmailUti, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(mdpU, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(telU, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(photoU, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dateU, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(specialite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmer, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prenomU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cinU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeU)
                    .addComponent(typeUti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(specialite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(email)
                    .addComponent(EmailUti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(mdp)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(mdpU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(photoU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(dateU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(confirmer)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ajouter Utilisateur", jPanel4);

        jLabel7.setText("CIN :");

        supprimer.setText("Supprimer");
        supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ciinU, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(315, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ciinU, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(221, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Supprimer Utilisateur", jPanel5);

        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Lister les Utilisateur", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmerActionPerformed
        
        String nom_utilisateur = nomU.getText();
        String prenom_utilisateur = prenomU.getText();
        String cin_utilisateur = cinU.getText();
        String type_utilisateur = typeUti.getSelectedItem().toString();
        String email_utilisateur = EmailUti.getText();
        String mdp_utilisateur = mdpU.getText();
        String tel_utilisateur=telU.getText();
        String photo_utilisateur=photoU.getText();
        String date_utilisateur=dateU.getText();
       // String sexe_utilisateur=sexeU.getSelectedItem().toString();
        String specialite_utilisateur=specialite.getSelectedItem().toString();
        
//        if(specialite_utilisateur == "Medecin")
//        {
           // Medecin m = new Medecin(cin_utilisateur, nom_utilisateur, prenom_utilisateur, tel_utilisateur, mdp_utilisateur, tel_utilisateur, photo_utilisateur, photo_utilisateur, date_utilisateur, date_utilisateur, type_utilisateur, date_utilisateur, mdp_utilisateur);
            Medecin m = new Medecin();
            m.setNom(nom_utilisateur);
        m.setPrenom(prenom_utilisateur);
        m.setCin(cin_utilisateur);
        m.setType_user(type_utilisateur);
        m.setEmail(email_utilisateur);
        m.setMotDePasse(mdp_utilisateur);
        m.setTel(tel_utilisateur);
        m.setPhoto(photo_utilisateur);
        m.setDateNaissance(date_utilisateur);
        m.setSpecalite(specialite_utilisateur);
        
      //  m.setSexe(sexe_utilisateur);

        DAO_utlisateur DAO_uti = new DAO_utlisateur();
        DAO_uti.AjouterMedecin(m);
        JOptionPane.showMessageDialog(rootPane, "Medecin ajouté");

//        }
    }//GEN-LAST:event_confirmerActionPerformed

    private void supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerActionPerformed
       String nom_utilisateur = nomU.getText();
        String prenom_utilisateur = prenomU.getText();
        String cin_utilisateur = cinU.getText();
        String type_utilisateur = typeUti.getSelectedItem().toString();
        String email_utilisateur = EmailUti.getText();
        String mdp_utilisateur = mdpU.getText();
        String tel_utilisateur=telU.getText();
        String photo_utilisateur=photoU.getText();
        String date_utilisateur=dateU.getText();
        

        utilisateur m = new utilisateur();
        m.setNom(nom_utilisateur);
        m.setPrenom(prenom_utilisateur);
        m.setCin(cin_utilisateur);
        m.setType_user(type_utilisateur);
        if(typeUti.getSelectedItem().toString() =="Medecin")
       {jLabel9.setVisible(true);
           specialite.setVisible(true); }
        m.setEmail(email_utilisateur);
        m.setMotDePasse(mdp_utilisateur);
        m.setTel(tel_utilisateur);
        m.setPhoto(photo_utilisateur);
        m.setDateNaissance(date_utilisateur);
        
        //IUtilisateurDAO DAO_uti = new UtilisateurDAO();
       // DAO_uti.supprimerUtilisateurs(cin_utilisateur);
    }//GEN-LAST:event_supprimerActionPerformed

    private void specialiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_specialiteActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_specialiteActionPerformed

    private void jTabbedPane1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1PropertyChange
        // TODO add your handling code here:
         specialite.setVisible(false);
         jLabel9.setVisible(false);
    }//GEN-LAST:event_jTabbedPane1PropertyChange

    private void jPanel4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel4KeyPressed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_jPanel4KeyPressed

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        // TODO add your handling code here:
        specialite.setVisible(false);
         jLabel9.setVisible(false);
         
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void typeUtiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeUtiActionPerformed
        // TODO add your handling code here:
        if(typeUti.getSelectedItem().toString().equals("Medecin")){
         specialite.setVisible(true);
         jLabel9.setVisible(true);}
    }//GEN-LAST:event_typeUtiActionPerformed

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
            java.util.logging.Logger.getLogger(gestion_utilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gestion_utilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gestion_utilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gestion_utilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gestion_utilisateur().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EmailUti;
    private javax.swing.JTextField ciinU;
    private javax.swing.JTextField cinU;
    private javax.swing.JButton confirmer;
    private javax.swing.JTextField dateU;
    private javax.swing.JLabel email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel mdp;
    private javax.swing.JTextField mdpU;
    private javax.swing.JTextField nomU;
    private javax.swing.JTextField photoU;
    private javax.swing.JTextField prenomU;
    private javax.swing.JComboBox specialite;
    private javax.swing.JButton supprimer;
    private javax.swing.JTextField telU;
    private javax.swing.JLabel typeU;
    private javax.swing.JComboBox typeUti;
    // End of variables declaration//GEN-END:variables
}
