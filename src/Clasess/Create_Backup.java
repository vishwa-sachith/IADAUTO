/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clasess;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Create_Backup {
    
        public static void make_backup() {
        try {
            String path = "C:\\Backup\\" + "IAD" + "_Date_" + new SimpleDateFormat("yyyy_MM_dd").format(new Date()) + "_Time_" + new SimpleDateFormat("HH_mm_ss").format(new Date()) + ".sql";
            String path2 = "C:\\Backup\\Stable.sql";
            Runtime.getRuntime().exec("C:\\Program Files\\MySQL\\MySQL Server 5.7\\bin\\mysqldump.exe -uroot -p1234 --add-drop-database -B aaa-motors -r" + path);
            Runtime.getRuntime().exec("C:\\Program Files\\MySQL\\MySQL Server 5.7\\bin\\mysqldump.exe -uroot -p1234 --add-drop-database -B aaa-motors -r" + path2);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Something wrong in database processing unit");
        }
    }
    
    public static void main(String[] args) {
        make_backup();
    }
    
}
