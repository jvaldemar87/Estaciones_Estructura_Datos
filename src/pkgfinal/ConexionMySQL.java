/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkgfinal;
import java.sql.*;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author Valdemar Benitez <jvaldemar87@gmail.com>
 */
public class ConexionMySQL {
    Connection co;
    Statement stm;
    
    public ConexionMySQL(){

        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost/estaciones?user=admin&password=123";
            Connection co = DriverManager.getConnection(url);
            Statement stm = co.createStatement();
            Statement stm1 = co.createStatement();
            Statement stm2 = co.createStatement();
            Statement stm3 = co.createStatement();
            Statement stm4 = co.createStatement();
            Statement stm5 = co.createStatement();
            Statement stm6 = co.createStatement();
            
            ResultSet rs = stm.executeQuery("select * from test");
            ResultSet l1 = stm1.executeQuery("select * from linea1");
            ResultSet l2 = stm2.executeQuery("select * from linea2");
            ResultSet l3 = stm3.executeQuery("select * from linea3");
            ResultSet l4 = stm4.executeQuery("select * from linea4");
            ResultSet l5 = stm5.executeQuery("select * from linea5");
            ResultSet l6 = stm6.executeQuery("select * from linea6");
            
            LinkedList ln1 = new LinkedList();
            LinkedList ln2 = new LinkedList();
            LinkedList ln3 = new LinkedList();
            LinkedList ln4 = new LinkedList();
            LinkedList ln5 = new LinkedList();
            LinkedList ln6 = new LinkedList();
            
            /*while(rs.next()){
                System.out.println(rs.getString("nombre"));
                System.out.println(rs.getString(4));
            }*/
            while(l1.next())
                ln1.addLast(l1.getString(3));
                //System.out.println("linea 1: " + ln1);
            while(l2.next())
                ln2.addLast(l2.getString(3));
            while(l3.next())
                ln3.addLast(l3.getString(3));
            while(l4.next())
                ln4.addLast(l4.getString(3));
            while(l5.next())
                ln5.addLast(l5.getString(3));
            while(l6.next())
                ln6.addLast(l6.getString(3));
            
            System.out.println("linea1: "+ln1);
            System.out.println("linea2: "+ln2);
            System.out.println("linea3: "+ln3);
            System.out.println("linea4: "+ln4);
            System.out.println("linea5: "+ln5);
            System.out.println("linea6: "+ln6);
            //return ln1;
            
        }
        catch(ClassNotFoundException exc){
            exc.printStackTrace();
        }
        catch (SQLException ex) {
            Logger.getLogger(ConexionMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
//    public static LinkedList linea(String linea){
//        String ln;
//        return ln;
//    }
    
}
