package Controlador;
//librerías
import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion implements Mysql{
    Connection con;
    Statement st;
    ResultSet rs;
    PreparedStatement ps;
    ResultSetMetaData mdata;
    
    public Conexion(){
        try{
            Class.forName(driver);
            con = DriverManager.getConnection(ruta, user, clave);
            st = con.createStatement();
            System.out.println("Conexion exitosa");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"ERROR nose puede conectar a la BD..."+e);
        }
    }
}
