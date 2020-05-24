/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Clasess.Create_Backup;
import Clasess.DB_connection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import javax.swing.Timer;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Asus
 */
public class Invoice extends javax.swing.JFrame {
    
    Date d;
    SimpleDateFormat sdf;
    String stfid;
    String type;
    String oo;

    /**
     * Creates new form suppliers
     */
    public Invoice() {
        initComponents();
        load_time_and_date();
        setExtendedState(MAXIMIZED_BOTH);
        exit.setContentAreaFilled(false);
        Minimize.setContentAreaFilled(false);
        jScrollPane2.setVisible(false);
        jScrollPane4.setVisible(false);
        engno.grabFocus();
    }
    
    Invoice(String s, String t) {
        initComponents();
        load_time_and_date();
        setExtendedState(MAXIMIZED_BOTH);
        exit.setContentAreaFilled(false);
        Minimize.setContentAreaFilled(false);
        
        stfid = s;
        type = t;
        staff.setText(s);
        jScrollPane2.setVisible(false);
        jScrollPane4.setVisible(false);
        engno.grabFocus();
                this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        date = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        time = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        staff = new javax.swing.JLabel();
        staffid = new javax.swing.JLabel();
        Minimize = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        engno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        did = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jLabel12 = new javax.swing.JLabel();
        pri = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        chasno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        zz = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Invoice");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 150, 70, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 1880, 10));

        date.setEditable(false);
        date.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        date.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        date.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(1580, 100, 110, 30));

        jLabel11.setText("Date");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 100, 40, 30));

        jLabel13.setText("Time");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 60, 40, 30));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/rsz_77002-200.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 50, 50));

        time.setEditable(false);
        time.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        time.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        time.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeActionPerformed(evt);
            }
        });
        jPanel1.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(1580, 60, 110, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user-icon.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1740, 80, 30, 30));
        jPanel1.add(staff, new org.netbeans.lib.awtextra.AbsoluteConstraints(1790, 80, 100, 30));

        staffid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        staffid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fields.png"))); // NOI18N
        jPanel1.add(staffid, new org.netbeans.lib.awtextra.AbsoluteConstraints(1780, 80, 110, 30));

        Minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Minimize Window-48.png"))); // NOI18N
        Minimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinimizeActionPerformed(evt);
            }
        });
        jPanel1.add(Minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1820, 10, 30, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dealer-logo.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 180));

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Close Window-48.png"))); // NOI18N
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1860, 10, 30, 30));

        engno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                engnoActionPerformed(evt);
            }
        });
        engno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                engnoKeyReleased(evt);
            }
        });
        jPanel1.add(engno, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 180, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Engine No");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 90, -1));

        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jList1MouseEntered(evt);
            }
        });
        jList1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jList1KeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 180, 80));

        did.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                didActionPerformed(evt);
            }
        });
        did.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                didKeyReleased(evt);
            }
        });
        jPanel1.add(did, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 310, 180, -1));

        jList3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jList3MouseEntered(evt);
            }
        });
        jList3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jList3KeyReleased(evt);
            }
        });
        jScrollPane4.setViewportView(jList3);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 330, 180, 80));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Customer NIC");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 310, 150, -1));

        pri.setEnabled(false);
        pri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priActionPerformed(evt);
            }
        });
        jPanel1.add(pri, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 570, 150, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("True Price");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 570, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Chasis No");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 310, -1, -1));

        chasno.setEnabled(false);
        chasno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chasnoActionPerformed(evt);
            }
        });
        jPanel1.add(chasno, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 310, 150, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Advance");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 570, -1, -1));

        ad.setEnabled(false);
        ad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adActionPerformed(evt);
            }
        });
        jPanel1.add(ad, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 570, 150, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel6.setText("=");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 570, 30, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Price");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 570, -1, -1));

        zz.setEnabled(false);
        zz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zzActionPerformed(evt);
            }
        });
        jPanel1.add(zz, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 570, 150, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel8.setText("-");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 570, 30, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setText("Clear all");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 650, 100, 30));

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton5.setText("Print");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 720, 100, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeActionPerformed

    private void MinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinimizeActionPerformed
        try {
            this.setState(ICONIFIED);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_MinimizeActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        Create_Backup.make_backup();
        try {
            System.exit(0);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_exitActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Menu m = new Menu(stfid, type);
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void engnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_engnoActionPerformed
        // TODO add your handling code here:
        did.grabFocus();
        jScrollPane2.setVisible(false);
    }//GEN-LAST:event_engnoActionPerformed

    private void engnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_engnoKeyReleased
        try {
            if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
                jList1.grabFocus();
                jList1.setSelectedIndex(0);
            } else if (engno.getText().equals("")) {
                jScrollPane2.setVisible(false);
            } else {
                ResultSet rs = DB_connection.search("select * from vehicle where Engine_No like '%" + engno.getText() + "%'");
                Vector v = new Vector();
                while (rs.next()) {
                    v.add(rs.getString("Engine_No"));
                }
                jList1.setListData(v);
                if (v.equals("")) {
                    jScrollPane2.setVisible(false);
                }
                jScrollPane2.setVisible(true);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_engnoKeyReleased

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        engno.setText(jList1.getSelectedValue().toString());
        jScrollPane2.setVisible(false);
        search();
        did.grabFocus();
    }//GEN-LAST:event_jList1MouseClicked

    private void jList1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jList1MouseEntered

    private void jList1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jList1KeyReleased
        if (evt.getKeyCode() == 10) {
            engno.setText(jList1.getSelectedValue().toString());
            jScrollPane2.setVisible(false);
            search();
            did.grabFocus();
        }
    }//GEN-LAST:event_jList1KeyReleased

    private void didActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_didActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_didActionPerformed

    private void didKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_didKeyReleased
        try {
            if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
                jList3.grabFocus();
                jList3.setSelectedIndex(0);
            } else if (did.getText().equals("")) {
                jScrollPane4.setVisible(false);
            } else {
                ResultSet rs = DB_connection.search("select * from customer where NIC like '%" + did.getText() + "%'");
                Vector v = new Vector();
                while (rs.next()) {
                    v.add(rs.getString("NIC"));
                }
                jList3.setListData(v);
                if (v.equals("")) {
                    jScrollPane4.setVisible(false);
                }
                jScrollPane4.setVisible(true);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_didKeyReleased

    private void jList3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList3MouseClicked
        did.setText(jList3.getSelectedValue().toString());
        jScrollPane4.setVisible(false);
        
    }//GEN-LAST:event_jList3MouseClicked

    private void jList3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jList3MouseEntered

    private void jList3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jList3KeyReleased
        if (evt.getKeyCode() == 10) {
            did.setText(jList3.getSelectedValue().toString());
            jScrollPane4.setVisible(false);
            
        }
    }//GEN-LAST:event_jList3KeyReleased

    private void priActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priActionPerformed

    private void chasnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chasnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chasnoActionPerformed

    private void adActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adActionPerformed

    private void zzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zzActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zzActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        clearAll();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            DB_connection.iud("insert into invoice (Customer_NIC, Price, Date, Employee_NIC, Vehicle_Engine_No, Vehicle_Chasis_No) values ('" + did.getText() + "', '" + zz.getText() + "', '" + date.getText() + "', '" + staff.getText() + "', '" + engno.getText() + "', '" + chasno.getText() + "')");
            DB_connection.iud("Update vehicle set Status = '0' where Engine_No = '" + engno.getText() + "'");
            
            if ("2".equals(oo)) {
                DB_connection.iud("delete from reserve where Vehicle_Engine_No = '" + engno.getText() + "'");
            }
            
            JasperReport compilereport=JasperCompileManager.compileReport("C:\\Users\\ASUS\\Desktop\\Reports\\Invoice.jrxml");
            Map m=new HashMap();
            m.put("Engine_No", engno.getText());            
            JasperPrint fillreport=JasperFillManager.fillReport(compilereport, m,DB_connection.getDB());
            
            JasperViewer.viewReport(fillreport,false);
            
            //JasperPrintManager.printReport(fillreport, false);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        clearAll();
    }//GEN-LAST:event_jButton5ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Invoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Minimize;
    private javax.swing.JTextField ad;
    private javax.swing.JTextField chasno;
    private javax.swing.JTextField date;
    private javax.swing.JTextField did;
    private javax.swing.JTextField engno;
    private javax.swing.JButton exit;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField pri;
    private javax.swing.JLabel staff;
    private javax.swing.JLabel staffid;
    private javax.swing.JTextField time;
    private javax.swing.JTextField zz;
    // End of variables declaration//GEN-END:variables

    private void load_time_and_date() {
        Timer t = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                d = new Date();
                sdf = new SimpleDateFormat("HH:mm:ss");
                time.setText(sdf.format(d));
                d = new Date();
                sdf = new SimpleDateFormat("YYYY/MM/dd");
                date.setText(sdf.format(d));
            }
        });
        t.start();
    }
    
    private void search() {
        try {
            ResultSet rs = DB_connection.search("select * from vehicle where Engine_No = '" + engno.getText() + "'");
            while (rs.next()) {                
                chasno.setText(rs.getString("Chasis_No"));
                pri.setText(rs.getString("Selling_Price"));
                oo = rs.getString("Status");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        check(oo);
    }
    
    private void check(String s) {
        String ss = s;
        
        if ("2".equals(ss)) {
            try {
                ResultSet rs = DB_connection.search("select * from reserve where Vehicle_Engine_No = '" + engno.getText() + "'");
                while (rs.next()) {                    
                    ad.setText(rs.getString("Advance"));
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        } else {
            ad.setText("0");
        }
        
        int i = Integer.parseInt(pri.getText());
        int i2 = Integer.parseInt(ad.getText());
        int i3 = i - i2;
        
        zz.setText(Integer.toString(i3));
        
    }
    
    private void clearAll() {
        engno.setText(null);
        chasno.setText(null);
        did.setText(null);
        pri.setText(null);
        ad.setText(null);
        zz.setText(null);
    }
    
}
