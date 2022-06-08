
package Speedqueen_laundry;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 @author Lilis Rahmawati
 */
public class Koneksi {
    
 
    private static Connection mysqlconfig;
    static String MyQuery;
    static Object hasil;
    public static Connection configDB()throws SQLException{
        try {
            String url="jdbc:mysql://localhost:3306/mysql"; //url database
            String user="root"; //user database
            String pass=""; //password database
            /* DriverManager.registerDriver(new com.mysql.jdbc.Driver());*/
            mysqlconfig=DriverManager.getConnection(url, user, pass);            
        } catch (Exception e) {
            System.err.println("koneksi gagal "+e.getMessage()); //perintah menampilkan error pada koneksi
        }
        return mysqlconfig;
}

}
