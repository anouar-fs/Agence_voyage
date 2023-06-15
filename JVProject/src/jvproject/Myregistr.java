package jvproject;

import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.FileChooserUI;

/**
 *
 * @author as
 */
public class Myregistr extends javax.swing.JFrame {

    
    public Myregistr() {
        initComponents();
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Tname = new javax.swing.JTextField();
        Tlastnm = new javax.swing.JTextField();
        Tuser = new javax.swing.JTextField();
        Tpass = new javax.swing.JTextField();
        Tconfpass = new javax.swing.JTextField();
        TPhone = new javax.swing.JTextField();
        Tmail = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        kGradientPanel1.setBackground(new java.awt.Color(153, 204, 255));
        kGradientPanel1.setkEndColor(new java.awt.Color(102, 204, 255));
        kGradientPanel1.setkGradientFocus(550);
        kGradientPanel1.setkStartColor(new java.awt.Color(204, 0, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Roboto Lt", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTER");
        jLabel1.setOpaque(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        Tname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Tname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        Tname.setSelectionColor(new java.awt.Color(102, 102, 255));
        Tname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TnameFocusLost(evt);
            }
        });
        Tname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TnameKeyPressed(evt);
            }
        });

        Tlastnm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Tlastnm.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        Tlastnm.setSelectionColor(new java.awt.Color(102, 102, 255));
        Tlastnm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TlastnmFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TlastnmFocusLost(evt);
            }
        });
        Tlastnm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TlastnmKeyPressed(evt);
            }
        });

        Tuser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Tuser.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        Tuser.setSelectionColor(new java.awt.Color(102, 102, 255));
        Tuser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TuserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TuserFocusLost(evt);
            }
        });

        Tpass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Tpass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        Tpass.setSelectionColor(new java.awt.Color(102, 102, 255));
        Tpass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TpassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TpassFocusLost(evt);
            }
        });

        Tconfpass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Tconfpass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        Tconfpass.setSelectionColor(new java.awt.Color(102, 102, 255));
        Tconfpass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TconfpassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TconfpassFocusLost(evt);
            }
        });

        TPhone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TPhone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        TPhone.setSelectionColor(new java.awt.Color(102, 102, 255));
        TPhone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TPhoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TPhoneFocusLost(evt);
            }
        });
        TPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TPhoneKeyPressed(evt);
            }
        });

        Tmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Tmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        Tmail.setSelectionColor(new java.awt.Color(102, 102, 255));
        Tmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TmailFocusLost(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Male");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Female");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Username");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Password");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Confirm password");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Phone");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Email");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Gender");

        jLabel9.setText("First Name");

        jLabel10.setText("Last Name");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Picture");

        jPanel3.setBackground(new java.awt.Color(102, 204, 255));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Select file");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(9, 9, 9))
        );

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel4MouseExited(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Sign UP");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Tpass)
                                    .addComponent(Tuser)
                                    .addComponent(Tconfpass)
                                    .addComponent(TPhone)
                                    .addComponent(Tmail)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(9, 9, 9))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Tname, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabel9)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(Tlastnm, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(37, 37, 37))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tname, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tlastnm, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(Tuser, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tpass, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tconfpass, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tmail, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jLabel8)
                    .addComponent(jRadioButton2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseEntered
        jPanel4.setBackground(new Color(163,163,255));
    }//GEN-LAST:event_jPanel4MouseEntered

    private void jPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseExited
        jPanel4.setBackground(new Color(153,153,255));
    }//GEN-LAST:event_jPanel4MouseExited

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
        jPanel3.setBackground(new Color(112,214,255));
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
        jPanel3.setBackground(new Color(102,204,255));
    }//GEN-LAST:event_jPanel3MouseExited

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        if(Tname.getText().equals("")||Tlastnm.getText().equals("")||Tuser.getText().equals("")||Tpass.getText().equals("")||Tconfpass.getText().equals("")||TPhone.getText().equals("")||Tmail.getText().equals("")||(jRadioButton1.isSelected()&&jRadioButton2.isSelected())){
            caution cau = new caution("Some of the fields are empty please check !!!!!  ");
            cau.setVisible(true);
        }else if(Tpass.getText().length()<5 || Tpass.getText().length()>20){
                   caution cau = new caution("your password must have min 5 charachters max 20");
                   cau.setVisible(true);
        }else if(TPhone.getText().length()!=10){
                    caution cau = new caution("your phone number must have 10 digits");
                   cau.setVisible(true);
        }
        else{
            if(!(Tpass.getText().equals(Tconfpass.getText()))){
                caution cau = new caution("Passwords doesn't match  ");
                   cau.setVisible(true);
            }else if(!Tmail.getText().contains("@gmail") && !Tmail.getText().contains("@hotmail")){
                caution cau = new caution("your mail must contain '@gmail' or '@hotmail'  ");
                cau.setVisible(true);
            }
            else{
                String name=Tname.getText();
                String lname=Tlastnm.getText();
                String usernm=Tuser.getText();
                String pass=Tpass.getText();
                String phone=TPhone.getText();
                String mail=Tmail.getText();
                String gender;
                if(jRadioButton1.isSelected()){
                    gender="M";
                }else{
                    gender="F";
                }
                
                PreparedStatement ps;
                ResultSet rs;
                String query="INSERT INTO jvproject.project_users(uname,ulastname,username,password,phone,email,gender,picture) VALUES (?,?,?,?,?,?,?,?)";      
            try{
                ps = project_db.getConnectio().prepareStatement(query);
                ps.setString(1, name);
                ps.setString(2, lname);
                ps.setString(3, usernm);
                ps.setString(4, pass);
                ps.setString(5, phone);
                ps.setString(6, mail);
                ps.setString(7, gender);
                try{
                    InputStream image = new FileInputStream(new File(jLabel14.getText()));
                    ps.setBlob(8, image);
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
                if(ps.executeUpdate()!=0){
                    verif vf = new verif(this);
                    vf.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "we cannot create your account  ");
                }
        }catch(Exception e){
            
            err r = new err(e.getMessage());
            r.setVisible(true);
        }
                
            }
        }
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter fx = new FileNameExtensionFilter("image", "jpg","jpeg","png");
        fc.setFileFilter(fx);
        int etat=fc.showDialog(null,"Uploade");
        fc.setDialogTitle("FileChooser");
        if(etat == JFileChooser.APPROVE_OPTION){
            File elm = fc.getSelectedFile();
            String path = elm.getAbsolutePath(); 
            jLabel14.setText(path);
        }else{
            JOptionPane.showMessageDialog(null, "File is not matching!  ");
        }
    }//GEN-LAST:event_jPanel3MousePressed

    private void TnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TnameFocusGained
        Tname.setBackground(new Color(246,246,246));
        Tname.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK));
    }//GEN-LAST:event_TnameFocusGained

    private void TnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TnameFocusLost
        Tname.setBackground(new Color(255,255,255));
        Tname.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
    }//GEN-LAST:event_TnameFocusLost

    private void TlastnmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TlastnmFocusGained
        Tlastnm.setBackground(new Color(246,246,246));
        Tlastnm.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK));
    }//GEN-LAST:event_TlastnmFocusGained

    private void TlastnmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TlastnmFocusLost
        Tlastnm.setBackground(new Color(255,255,255));
        Tlastnm.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
    }//GEN-LAST:event_TlastnmFocusLost

    private void TuserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TuserFocusGained
        Tuser.setBackground(new Color(246,246,246));
        Tuser.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK));
    }//GEN-LAST:event_TuserFocusGained

    private void TuserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TuserFocusLost
        Tuser.setBackground(new Color(255,255,255));
        Tuser.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
    }//GEN-LAST:event_TuserFocusLost

    private void TpassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TpassFocusGained
        Tpass.setBackground(new Color(246,246,246));
        Tpass.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK));
    }//GEN-LAST:event_TpassFocusGained

    private void TpassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TpassFocusLost
        Tpass.setBackground(new Color(255,255,255));
        Tpass.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
    }//GEN-LAST:event_TpassFocusLost

    private void TPhoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TPhoneFocusGained
        TPhone.setBackground(new Color(246,246,246));
        TPhone.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK));
    }//GEN-LAST:event_TPhoneFocusGained

    private void TPhoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TPhoneFocusLost
        TPhone.setBackground(new Color(255,255,255));
        TPhone.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
    }//GEN-LAST:event_TPhoneFocusLost

    private void TconfpassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TconfpassFocusGained
        Tconfpass.setBackground(new Color(246,246,246));
        Tconfpass.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK));
    }//GEN-LAST:event_TconfpassFocusGained

    private void TconfpassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TconfpassFocusLost
        Tconfpass.setBackground(new Color(255,255,255));
        Tconfpass.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
    }//GEN-LAST:event_TconfpassFocusLost

    private void TmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TmailFocusGained
        Tmail.setBackground(new Color(246,246,246));
        Tmail.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK));
    }//GEN-LAST:event_TmailFocusGained

    private void TmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TmailFocusLost
        Tmail.setBackground(new Color(255,255,255));
        Tmail.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
    }//GEN-LAST:event_TmailFocusLost

    private void TPhoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TPhoneKeyPressed
        char c=evt.getKeyChar();
        if(Character.isLetter(c) || Character.isWhitespace(c)){
            TPhone.setEditable(false);
        }else{
            TPhone.setEditable(true);
        }
    }//GEN-LAST:event_TPhoneKeyPressed

    private void TnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TnameKeyPressed
        char c=evt.getKeyChar();
        if(Character.isLetter(c) || Character.isWhitespace(c)){
            Tname.setEditable(true);
        }else{
            if(Character.isDigit(c)){
                Tname.setEditable(false);
            }else{
                Tname.setEditable(true);
            }
        }
    }//GEN-LAST:event_TnameKeyPressed

    private void TlastnmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TlastnmKeyPressed
        char c=evt.getKeyChar();
        if(Character.isLetter(c) || Character.isWhitespace(c)){
            
            Tlastnm.setEditable(true);
        }else{
            if(Character.isDigit(c)){
                Tlastnm.setEditable(false);
            }else{
                Tlastnm.setEditable(true);
            }
            
        }
    }//GEN-LAST:event_TlastnmKeyPressed

    
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
            java.util.logging.Logger.getLogger(Myregistr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Myregistr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Myregistr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Myregistr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Myregistr().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TPhone;
    private javax.swing.JTextField Tconfpass;
    private javax.swing.JTextField Tlastnm;
    private javax.swing.JTextField Tmail;
    private javax.swing.JTextField Tname;
    private javax.swing.JTextField Tpass;
    private javax.swing.JTextField Tuser;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
