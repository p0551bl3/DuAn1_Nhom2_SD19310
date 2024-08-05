/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTIL;
import java.awt.*;
import java.net.URL;
import javax.swing.*;
/**
 *
 * @author Asus
 */
public class IconLogo {
     public static void setFrameIcon(JFrame frame) {
        // Tải hình ảnh icon từ tài nguyên
        URL iconURL = IconLogo.class.getResource("/ICON/coffee-cup.png");
        if (iconURL != null) {
            Image icon = Toolkit.getDefaultToolkit().getImage(iconURL);
            frame.setIconImage(icon);
        } else {
            System.out.println("Tài nguyên hình ảnh không tìm thấy!");
        }
    }
     public static void setDialogIcon(JDialog dialog) {//ham nay ho tro dialogs de setting up logo icon
        // Tải hình ảnh icon từ tài nguyên
        URL iconURL = IconLogo.class.getResource("/ICON/coffee-cup.png");
        if (iconURL != null) {
            Image icon = Toolkit.getDefaultToolkit().getImage(iconURL);
            dialog.setIconImage(icon);
        } else {
            System.out.println("Tài nguyên hình ảnh không tìm thấy!");
        }
    }
}   
