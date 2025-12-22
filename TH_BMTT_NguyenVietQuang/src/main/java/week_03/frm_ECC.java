/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package week_03;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;
import java.util.logging.Logger;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import java.security.Security;
import java.util.logging.Level;

public class frm_ECC extends javax.swing.JFrame {

    private ECCCipher ecc;
    private PublicKey publicKey;
    private PrivateKey privateKey;
    
    public frm_ECC() {
        initComponents();
        ecc = new ECCCipher();
        Security.addProvider(new BouncyCastleProvider());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_plaintext = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        txt_publickey = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_privatekey = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_ciphertext = new javax.swing.JTextArea();
        btn_generatekeys = new javax.swing.JButton();
        btn_loadkeys = new javax.swing.JButton();
        btn_encrypt = new javax.swing.JButton();
        btn_decrypt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Elliptic Curve Cryptography Demo");

        jLabel2.setText("Plaintext:");

        txt_plaintext.setColumns(20);
        txt_plaintext.setRows(5);
        jScrollPane1.setViewportView(txt_plaintext);

        jLabel3.setText("Public Key:");

        jLabel4.setText("Private Key:");

        jLabel5.setText("Ciphertext:");

        txt_ciphertext.setColumns(20);
        txt_ciphertext.setRows(5);
        jScrollPane2.setViewportView(txt_ciphertext);

        btn_generatekeys.setText("Generate Keys");
        btn_generatekeys.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generatekeysActionPerformed(evt);
            }
        });

        btn_loadkeys.setText("Load Keys");
        btn_loadkeys.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loadkeysActionPerformed(evt);
            }
        });

        btn_encrypt.setText("Encrypt");
        btn_encrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_encryptActionPerformed(evt);
            }
        });

        btn_decrypt.setText("Decrypt");
        btn_decrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_decryptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_privatekey)
                            .addComponent(jScrollPane1)
                            .addComponent(txt_publickey)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_generatekeys)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_loadkeys)
                                .addGap(18, 18, 18)
                                .addComponent(btn_encrypt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                                .addComponent(btn_decrypt))
                            .addComponent(jScrollPane2))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_publickey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_privatekey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_generatekeys)
                    .addComponent(btn_loadkeys)
                    .addComponent(btn_encrypt)
                    .addComponent(btn_decrypt))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_generatekeysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generatekeysActionPerformed
        try{
            KeyPair keyPair = ecc.generateKeyPair();
            publicKey = keyPair.getPublic();
            privateKey = keyPair.getPrivate();
            
            txt_publickey.setText(Base64.getEncoder().encodeToString(publicKey.getEncoded()));
            txt_privatekey.setText(Base64.getEncoder().encodeToString(privateKey.getEncoded()));
            JFileChooser publicKeyChooser = new JFileChooser();
            publicKeyChooser.setDialogTitle("Save Public Key File");
            int publicKeyChooserResult = publicKeyChooser.showSaveDialog(this);
            if(publicKeyChooserResult == JFileChooser.APPROVE_OPTION)
            {
                File publicKeyFile = publicKeyChooser.getSelectedFile();
                try(FileWriter writer = new FileWriter(publicKeyFile.getAbsolutePath()))
                {
                    writer.write(Base64.getEncoder().encodeToString(publicKey.getEncoded()));
                    JOptionPane.showMessageDialog(this,
                            "Public Key saved to file successfully.",
                            "Success",JOptionPane.INFORMATION_MESSAGE);
                }catch(IOException ex)
                {
                    JOptionPane.showMessageDialog(this,
                            "Error saving Public Key file:"+ ex.getMessage(),
                            "Error",JOptionPane.ERROR_MESSAGE);
                }
            }
            JFileChooser privateKeyChooser = new JFileChooser();
            privateKeyChooser.setDialogTitle("Save Private Key File");
            int privateKeyChooserResult = privateKeyChooser.showSaveDialog(this);
            if(privateKeyChooserResult == JFileChooser.APPROVE_OPTION)
            {
                File privateKeyFile = privateKeyChooser.getSelectedFile();
                try(FileWriter writer = new FileWriter(privateKeyFile.getAbsolutePath()))
                {
                    writer.write(Base64.getEncoder().encodeToString(privateKey.getEncoded()));
                    JOptionPane.showMessageDialog(this, 
                            "Private Key saved to file successfully.",
                            "Success",JOptionPane.INFORMATION_MESSAGE);
                }catch(IOException ex){
                    JOptionPane.showMessageDialog(this, 
                            "Error saving Private Key file:"+ex.getMessage(),
                            "Error",JOptionPane.ERROR_MESSAGE);
                }
            } 
        }catch(Exception ex)
        {
            Logger.getLogger(frm_ECC.class.getName()).log(Level.SEVERE,null,ex);
            JOptionPane.showMessageDialog(this,
                    "Error generating ECC key pair: "+ ex.getMessage(),
                    "Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_generatekeysActionPerformed

    private void btn_loadkeysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loadkeysActionPerformed
        try{
            JFileChooser publicKeyChooser = new JFileChooser();
            publicKeyChooser.setDialogTitle("Load Public Key File");
            int publicKeyChooserResult = publicKeyChooser.showOpenDialog(this);
            if(publicKeyChooserResult == JFileChooser.APPROVE_OPTION)
            {
                File publicKeyFile = publicKeyChooser.getSelectedFile();
                byte[] publicKeyBytes = Base64.getDecoder().decode(
                    new String(java.nio.file.Files.readAllBytes(publicKeyFile.toPath())));
                publicKey = ECCCipher.loadPublicKey(publicKeyBytes);
                txt_publickey.setText(Base64.getEncoder().encodeToString(publicKey.getEncoded()));
            }
            JFileChooser privateKeyChooser = new JFileChooser();
            privateKeyChooser.setDialogTitle("Load Private Key File");
            int privateKeyChooserResult = privateKeyChooser.showOpenDialog(this);
            if(privateKeyChooserResult == JFileChooser.APPROVE_OPTION)
            {
                File privateKeyFile = privateKeyChooser.getSelectedFile();
                byte[] privateKeyBytes = Base64.getDecoder().decode(
                    new String(java.nio.file.Files.readAllBytes(privateKeyFile.toPath())));
                privateKey = ECCCipher.loadPrivateKey(privateKeyBytes);
                txt_privatekey.setText(Base64.getEncoder()
                .encodeToString(privateKey.getEncoded()));
            }
        }catch(Exception ex)
        {
            Logger.getLogger(frm_ECC.class.getName()).log(Level.SEVERE,null,ex);
            JOptionPane.showMessageDialog(this,
                    "Error loading keys: " + ex.getMessage(),
                    "Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_loadkeysActionPerformed

    private void btn_encryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_encryptActionPerformed
        try{
            String plaintext = txt_plaintext.getText();
            byte[] ciphertext = ecc.encrypt(plaintext, publicKey);
            txt_ciphertext.setText(Base64.getEncoder().encodeToString(ciphertext));
        }catch(Exception ex){
            Logger.getLogger(frm_ECC.class.getName()).log(Level.SEVERE , null,ex);
            JOptionPane.showMessageDialog(this,
                    "Error encrypting: "+ ex.getMessage(),
                    "Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_encryptActionPerformed

    private void btn_decryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_decryptActionPerformed
        try{
            byte[] ciphertext = Base64.getDecoder().decode(txt_ciphertext.getText());
            String decryptedText = ecc.decrypt(ciphertext,privateKey);
            txt_plaintext.setText(decryptedText);
        }catch(Exception ex){
            Logger.getLogger(frm_ECC.class.getName()).log(Level.SEVERE, null , ex);
            JOptionPane.showMessageDialog(this,
                    "Error decrypting: " + ex.getMessage(),
                    "Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_decryptActionPerformed

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
            java.util.logging.Logger.getLogger(frm_ECC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_ECC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_ECC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_ECC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_ECC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_decrypt;
    private javax.swing.JButton btn_encrypt;
    private javax.swing.JButton btn_generatekeys;
    private javax.swing.JButton btn_loadkeys;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txt_ciphertext;
    private javax.swing.JTextArea txt_plaintext;
    private javax.swing.JTextField txt_privatekey;
    private javax.swing.JTextField txt_publickey;
    // End of variables declaration//GEN-END:variables
}
