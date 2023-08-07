package Controlador;
//librerías
import java.util.ArrayList;
import Modelo.*;


public class CRUD_ana_urg extends Conexion{
    
    ArrayList<Especial3> L_e3 = new ArrayList();
    
    public CRUD_ana_urg(){}
    
    public ArrayList<Especial3> ConsultaEspecial3(String ind){
         Especial3 e3=null;
        try{
            rs = st.executeQuery("select tienda.indicador,tienda.cod_tienda," +
                                "tienda.nombre_tienda,venta.cod_venta,venta.precio_total," +
                                "encargado_tienda.cod_enTien,encargado_tienda.usuario," +
                                "encargado_distrito.cod_enDistri,encargado_distrito.usuario "
                              + "from encargado_directiva inner join tienda " +
                                "on encargado_directiva.cod_enDirec = tienda.cod_enDirec " +
                                "inner join encargado_tienda on tienda.cod_enTien = encargado_tienda.cod_enTien " +
                                "inner join encargado_distrito on tienda.cod_enDistri = encargado_distrito.cod_enDistri " +
                                "inner join venta on tienda.cod_tienda = venta.cod_tienda " +
                                "where tienda.indicador = '"+ind+"';");
            while(rs.next()){
            e3 = new Especial3();
            e3.setIndicador(rs.getString(1));
            e3.setCodTien(rs.getInt(2));
            e3.setNombreTien(rs.getString(3));
            e3.setCodVenta(rs.getInt(4));
            e3.setGananTotal(rs.getDouble(5));
            e3.setCodEnTien(rs.getString(6));
            e3.setEnTien(rs.getString(7));
            e3.setCodEnDistri(rs.getString(8));
            e3.setEnDistri(rs.getString(9));
            L_e3.add(e3);
            }
        }catch(Exception ex){
            Mensajes.M1("ERROR, no se pudo recuperar los datos... "+ex);
        }
        return L_e3;
    }
    
    
    
}
