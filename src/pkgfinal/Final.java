/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import java.sql.*;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Valdemar Benitez <jvaldemar87@gmail.com>
 */
public class Final {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
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
            
            ResultSet ds = stm.executeQuery("select * from descripcion");
            ResultSet l1 = stm1.executeQuery("select * from linea1");
            ResultSet l2 = stm2.executeQuery("select * from linea2");
            ResultSet l3 = stm3.executeQuery("select * from linea3");
            ResultSet l4 = stm4.executeQuery("select * from linea4");
            ResultSet l5 = stm5.executeQuery("select * from linea5");
            ResultSet l6 = stm6.executeQuery("select * from linea6");
            
            LinkedList ds1 = new LinkedList();
            LinkedList ln1 = new LinkedList();
            LinkedList ln2 = new LinkedList();
            LinkedList ln3 = new LinkedList();
            LinkedList ln4 = new LinkedList();
            LinkedList ln5 = new LinkedList();
            LinkedList ln6 = new LinkedList();
            
            while(ds.next())
                ds1.addLast(ds.getString(1));
            while(l1.next())
                ln1.addLast(l1.getInt(2));
                //System.out.println("linea 1: " + ln1);
            while(l2.next())
                ln2.addLast(l2.getInt(2));
            while(l3.next())
                ln3.addLast(l3.getInt(2));
            while(l4.next())
                ln4.addLast(l4.getInt(2));
            while(l5.next())
                ln5.addLast(l5.getInt(2));
            while(l6.next())
                ln6.addLast(l6.getInt(2));
            
//            System.out.println(ds1);
            System.out.println("linea1: "+ln1);
            System.out.println("linea2: "+ln2);
            System.out.println("linea3: "+ln3);
            System.out.println("linea4: "+ln4);
            System.out.println("linea5: "+ln5);
            System.out.println("linea6: "+ln6);
            System.out.printf("%-30s%-30s%-30s%-30s%-30s%-30s\n","linea 1:","linea 2:","linea 3:" ,"linea 4:","linea 5:" ,"linea 6:");
            System.out.printf("%-30s%-30s%-30s%-30s%-30s%-30s\n","------------------------------","------------------------------","------------------------------","------------------------------","------------------------------","------------------------------");
            System.out.printf("%-30s%-30s%-30s%-30s%-30s%-30s\n","Mirador","Central Sur","Periférico Norte","Basílica","San Isidro","Tabachines");
            System.out.printf("%-30s%-30s%-30s%-30s%-30s%-30s\n","Huentitán","Concentro","Dermatológico","Sanatorio","CUCEA","Centro Cultural");
            System.out.printf("%-30s%-30s%-30s%-30s%-30s%-30s\n","Zoológico","Jardines de la Paz","Atemajac","Colegio Victoria","Parque","Zoquipan");
            System.out.printf("%-30s%-30s%-30s%-30s%-30s%-30s\n","Independencia Norte","Panamericana","División del Norte","Plaza Patria","Seatle","Patria");
            System.out.printf("%-30s%-30s%-30s%-30s%-30s%-30s\n","San Patricio","Juan Palomar","Ávila Camacho","Country Club","Zoquipan","División del Norte");
            System.out.printf("%-30s%-30s%-30s%-30s%-30s%-30s\n","Igualdad","Seminario","Mezquitán","Colón","Plaza Patria","Lomas");
            System.out.printf("%-30s%-30s%-30s%-30s%-30s%-30s\n","Monumental","Cámara de Comercio","Refugio","Lienzo Charro","Colomos","Plan de San Luis");
            System.out.printf("%-30s%-30s%-30s%-30s%-30s%-30s\n","Monte Olivette","Minerva","Juárez","Mezquitán","Plaza Pabellón","Colón");
            System.out.printf("%-30s%-30s%-30s%-30s%-30s%-30s\n","Circunvalación","Centro Magno","Mexicaltzingo","Panteón de Belén","San Javier","José María Vigil");
            System.out.printf("%-30s%-30s%-30s%-30s%-30s%-30s\n","Fac. Medicina","Fac. Medicina","Washington","Procuraduría","3 de Marzo","Zarco");
            System.out.printf("%-30s%-30s%-30s%-30s%-30s%-30s\n","Juan Álvarez","Américas","Santa Filomena","Fac. de Medicina","Jardines Universidad","Avenida México");
            System.out.printf("%-30s%-30s%-30s%-30s%-30s%-30s\n","Alameda","Chapultepec","Unidad Deportiva","Obrero","Ferroccarril","Ladrón de Guevara");
            System.out.printf("%-30s%-30s%-30s%-30s%-30s%-30s\n","San Juan de Dios","Paraninfo","Urdaneta","Talpita","Seminario","Américas");
            System.out.printf("%-30s%-30s%-30s%-30s%-30s%-30s\n","Bicentenario","Juárez","18 de Marzo","El Jaraz","La Gran Plaza","Lafayette");
            System.out.printf("%-30s%-30s%-30s%-30s%-30s%-30s\n","La Paz","La Paz","La Paz","Plutarco Elías Calles","Plutarco Elías Calles","Monumento");
            System.out.printf("%-30s%-30s%-30s%-30s%-30s%-30s\n","Niños Héroes","Plaza Universidad","Isla Raza","Haciendas","San Ignacio","Santa Eduwiges");
            System.out.printf("%-30s%-30s%-30s%-30s%-30s%-30s\n","Agua Azul","San Juan de Dios","Patria Sur","Oblatos 1","Estampida","Día");
            System.out.printf("%-30s%-30s%-30s%-30s%-30s%-30s\n","Ciprés","Belisario Domínguez","España","Bethel","Chapalita","Abastos");
            System.out.printf("%-30s%-30s%-30s%-30s%-30s%-30s\n","Héroe de Nacozari","Oblatos 2","Tesoro","--","Abastos","Parque de las Estrellas");
            System.out.printf("%-30s%-30s%-30s%-30s%-30s%-30s\n","Lázaro Cárdenas","Cristóbal de Oñate","Periférico Sur","--","Mandarina","Expo");
            System.out.printf("%-30s%-30s%-30s%-30s%-30s%-30s\n","El Dean","San Andrés","San Andrés","--","Ruiseñor","Plaza del Sol");
            System.out.printf("%-30s%-30s%-30s%-30s%-30s%-30s\n","Zona Industrial","San Jacinto","--","--","Unidad Deportiva","--");
            System.out.printf("%-30s%-30s%-30s%-30s%-30s%-30s\n","López de Legazpi","La Aurora","--","--","Plaza las Torres","--");
            System.out.printf("%-30s%-30s%-30s%-30s%-30s%-30s\n","Clemente Orozco","Clemente Orozco","--","--","Cristo Rey","--");
            System.out.printf("%-30s%-30s%-30s%-30s%-30s%-30s\n","Artes Plásticas","Tetlán","--","--","El Dean","--");
            System.out.printf("%-30s%-30s%-30s%-30s%-30s%-30s\n","Escultura","--","--","--","Nogalera","--");
            System.out.printf("%-30s%-30s%-30s%-30s%-30s%-30s\n","Fray Angélico","--","--","--","Álamo","--");
            System.out.printf("%-30s%-30s%-30s%-30s%-30s%-30s\n","--","--","--","--","Textiles","--");
            
            
            

            System.out.println("¿En que LUGAR estas?(DAME EL NOMBREEl dean)");
            Scanner b = new Scanner(System.in);
            String actual_LUGAR = b.nextLine();
            
            System.out.println(actual_LUGAR.toUpperCase());
            
        }
        catch(ClassNotFoundException exc){
            exc.printStackTrace();
        }
        catch (SQLException ex) {
            Logger.getLogger(ConexionMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
