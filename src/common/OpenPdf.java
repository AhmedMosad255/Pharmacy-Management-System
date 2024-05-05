/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import dao.PharmacyUtils;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author Ahmed
 */
public class OpenPdf {
    public static void openById(String id){
        try {
            if((new File(PharmacyUtils.billPath+id+".pdf")).exists()){
                Process p = Runtime.getRuntime().exec("cmd /c start " + PharmacyUtils.billPath + id + ".pdf");
            }else{
                JOptionPane.showMessageDialog(null, "file is not exist");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
