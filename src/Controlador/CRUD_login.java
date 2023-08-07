package Controlador;
//librerías
import java.util.ArrayList;
import Modelo.*;

public class CRUD_login extends Conexion{
    ArrayList<Empleado> L_empleados = new ArrayList();
    ArrayList<Encargado_tienda> L_enTien = new ArrayList();
    ArrayList<Encargado_distrito> L_enDistri = new ArrayList();
    ArrayList<Encargado_directiva> L_enDirec = new ArrayList();
    ArrayList<Almacenero> L_almacenero = new ArrayList();    
    public CRUD_login(){}
    
    public ArrayList<Empleado> ObtenerEmpleados(){
        try{
            rs = st.executeQuery("select * from empleado;");
            while(rs.next()){
                Empleado emp = new Empleado();
                emp.setCod(rs.getString(1));
                emp.setUser(rs.getString(2));
                emp.setPass(rs.getString(3));
                L_empleados.add(emp);
            }
        }catch(Exception ex){
            Mensajes.M1("ERROR, no se pueden recuperar los empleados... "+ex);
        }
        return L_empleados;
    }
    
    public ArrayList<Encargado_tienda> ObtenerEnTienda(){
        try{
            rs = st.executeQuery("select * from encargado_tienda;");
            while(rs.next()){
                Encargado_tienda enTien= new Encargado_tienda();
                enTien.setCod(rs.getString(1));
                enTien.setUser(rs.getString(2));
                enTien.setPass(rs.getString(3));
                L_enTien.add(enTien);
            }
        }catch(Exception ex){
            Mensajes.M1("ERROR, no se pueden recuperar los encargados de tiendas... "+ex);
        }
        return L_enTien;
    }
    
    public ArrayList<Encargado_distrito> ObtenerEnDistrito(){
        try{
            rs = st.executeQuery("select * from encargado_distrito;");
            while(rs.next()){
                Encargado_distrito enDistri = new Encargado_distrito();
                enDistri.setCod(rs.getString(1));
                enDistri.setUser(rs.getString(2));
                enDistri.setPass(rs.getString(3));
                L_enDistri.add(enDistri);
            }
        }catch(Exception ex){
            Mensajes.M1("ERROR, no se pueden recuperar los encargados de distritos... "+ex);
        }
        return L_enDistri;
    }
    
    public ArrayList<Encargado_directiva> ObtenerEnDirectiva(){
        try{
            rs = st.executeQuery("select * from encargado_directiva;");
            while(rs.next()){
                Encargado_directiva enDirec = new Encargado_directiva();
                enDirec.setCod(rs.getString(1));
                enDirec.setUser(rs.getString(2));
                enDirec.setPass(rs.getString(3));
                L_enDirec.add(enDirec);
            }
        }catch(Exception ex){
            Mensajes.M1("ERROR, no se puede recuperar el(la) encargado(a) de directiva.. "+ex);
        }
        return L_enDirec;
    }
    
    public ArrayList<Almacenero> ObtenerAlmacenero(){
        try{
            rs = st.executeQuery("select * from almacenero;");
            while(rs.next()){
                Almacenero alma = new Almacenero();
                alma.setCod(rs.getString(1));
                alma.setUser(rs.getString(2));
                alma.setPass(rs.getString(3));
                L_almacenero.add(alma);
            }
        }catch(Exception ex){
            Mensajes.M1("ERROR, no se pueden recuperar los almaceneros... "+ex);
        }
        return L_almacenero;
    }
    
    
}
