/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author Ahmed
 */
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Tables {
    public static void main(String[] args) {
        try {
            Connection conn = ConnectionProvider.getConnection();
            Statement st = conn.createStatement();
            //st.executeUpdate("CREATE TABLE appuser (appuser_pk INT AUTO_INCREMENT PRIMARY KEY, userRole VARCHAR(200), name VARCHAR(200), dob VARCHAR(50), mobileNumber VARCHAR(50), email VARCHAR(200), username VARCHAR(200), password VARCHAR(50), address VARCHAR(200))");
            //st.executeUpdate("INSERT INTO appuser (userRole, name, dob, mobileNumber, email, username, password, address) VALUES ('Admin', 'Admin', '1990-01-01', '1234567890', 'admin@gmail.com', 'Admin', '2100401', 'Egypt')");
//            st.executeUpdate("CREATE TABLE medicine (" +
//                                "medicine_pk INT AUTO_INCREMENT PRIMARY KEY, " +
//                                "uniqueId VARCHAR(200), " +
//                                "name VARCHAR(200), " +
//                                "companyName VARCHAR(200), " +
//                                "quantity BIGINT, " +
//                                "price BIGINT" +
//                            ")");
st.executeUpdate("CREATE TABLE bill (" +
                    "bill_bk INT AUTO_INCREMENT PRIMARY KEY," +
                    "billId VARCHAR(200)," +
                    "billDate VARCHAR(50)," +
                    "totalPaid BIGINT," +
                    "`generated` VARCHAR(50)" + // Enclosing "generated" in backticks to avoid conflict with reserved keywords
                    ")");

            JOptionPane.showMessageDialog(null, "Table Created Successfully");
            conn.close(); // Close the connection after use
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}

