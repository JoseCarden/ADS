package Controlador;
//librerías
import Modelo.*;
import java.util.ArrayList;

public class CRUD_ana_ventas extends Conexion{
    ArrayList<Especial1> L_e1 = new ArrayList();
    
    public CRUD_ana_ventas(){}
    
    public ArrayList<Especial1> ConsultaEspecial(String cod){
         Especial1 e1=null;
        try{
            rs = st.executeQuery("select venta.cod_venta,tienda.cod_tienda," +
                                 "tienda.nombre_tienda,venta.cod_emple,empleado.usuario," +
                                 "venta.precio_total from encargado_tienda inner join tienda " +
                                 "on encargado_tienda.cod_enTien = tienda.cod_enTien " +
                                 "inner join venta on tienda.cod_tienda = venta.cod_tienda " +
                                 "inner join empleado on venta.cod_emple = empleado.cod_emple " +
                                 "where encargado_tienda.cod_enTien = '"+cod+"';");
            while(rs.next()){
            e1 = new Especial1();
            e1.setCodVenta(rs.getInt(1));
            e1.setCodTien(rs.getString(2));
            e1.setNomTien(rs.getString(3));
            e1.setCodEmple(rs.getString(4));
            e1.setUser(rs.getString(5));
            e1.setGananTotal(rs.getDouble(6));
            L_e1.add(e1);
            }
        }catch(Exception ex){
            Mensajes.M1("ERROR, no se pudo recuperar los datos... "+ex);
        }
        return L_e1;
    }
    
    public int CantStockResta (String cod,String insumo){
        int cont=0;
        try{
            rs = st.executeQuery("select Tstock_resta from insumo_tienda where cod_tienda = "
                            +cod+" and cod_insumo = '"+insumo+"';");
            while(rs.next()){
                cont = rs.getInt(1);
            }
        }catch(Exception ex){
            Mensajes.M1("ERROR, no se pudo recuperar la cant. del stock... "+ex);
        }
        return cont;
    }
}
