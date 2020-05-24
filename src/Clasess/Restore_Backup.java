/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clasess;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Restore_Backup {
     public static void restore_backup() {
        try {
            String path = "C:\\Backup\\Stable.sql";
            String dbUserName = "root";
            String dbPassword = "1234";
            String[] restoreCmd = new String[]{"C:\\Program Files\\MySQL\\MySQL Server 5.7\\bin\\mysql.exe ", "--user=" + dbUserName, "--password=" + dbPassword, "-e", "source " + path};
            Runtime.getRuntime().exec(restoreCmd);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Something wrong in database processing unit");
        }
    }
}
