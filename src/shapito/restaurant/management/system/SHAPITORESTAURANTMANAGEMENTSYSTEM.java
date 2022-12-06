/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shapito.restaurant.management.system;

import java.sql.*;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Laiq-P
 */
public class SHAPITORESTAURANTMANAGEMENTSYSTEM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      //  jdbc:mysql://jsmartfix.com:3306/jsmartfix_SCD?zeroDateTimeBehavior=CONVERT_TO_NULL [jsmartfix_SCD on Default schema]
          try{
         Connection    con = DriverManager.getConnection(
                        "jdbc:mysql://jsmartfix.com:3306/jsmartfix_SCD","mcseadeals_shapito", "shapitoltd123");
          Statement   st = con.createStatement();
           ResultSet  rs = st.executeQuery("SELECT * FROM `users`;");
        //   rs.next();
           
           System.out.println(rs.getString(0) + "yguy");
           
            
        }catch(Exception e){
             // JOptionPane.showMessageDialog(this , "CHECK INTERNET CONNECTION!!!");
        }
        // TODO code application logic here
//        create TABLE ProductTbl(
//    PNum int primary key auto_increment,
//    Pname varchar(30),
//    Category varchar(40),
//    price FLOAT);
//    
//create TABLE BillTbl(
//    BNum int primary key auto_increment,
//    Seller varchar(30),
//    BDate varchar(30),
//    Amount int
//    
//    
//    
//    );
    }
    
}
