package Controlador;
//librerías
import Modelo.*;
import java.util.ArrayList;

public class CRUD_ana_tiendas extends Conexion {
    
    ArrayList<Especial2> L_e2 = new ArrayList();
    
    public CRUD_ana_tiendas(){}
    
    public ArrayList<Especial2> ConsultaEspecial2(int cod){
         Especial2 e2=null;
        try{
            rs = st.executeQuery("select tienda.indicador,venta.cod_venta,tienda.cod_tienda," +
                                "tienda.nombre_tienda,venta.cod_emple,empleado.usuario," +
                                "venta.precio_total from encargado_tienda inner join tienda " +
                                "on encargado_tienda.cod_enTien = tienda.cod_enTien " +
                                "inner join venta on tienda.cod_tienda = venta.cod_tienda " +
                                "inner join empleado on venta.cod_emple = empleado.cod_emple " +
                                "where tienda.cod_tienda = "+cod+";");
            while(rs.next()){
            e2 = new Especial2();
            e2.setIndicador(rs.getString(1));
            e2.setCodVenta(rs.getInt(2));
            e2.setCodTien(rs.getString(3));
            e2.setNomTien(rs.getString(4));
            e2.setCodEmple(rs.getString(5));
            e2.setUser(rs.getString(6));
            e2.setGananTotal(rs.getDouble(7));
            L_e2.add(e2);
            }
        }catch(Exception ex){
            Mensajes.M1("ERROR, no se pudo recuperar los datos... "+ex);
        }
        return L_e2;
    }
    
    public void RegistrarIndicador(String ind,int cod){
        try{
            ps = con.prepareStatement("update tienda set indicador = ? where cod_tienda = ?;");
            ps.setString(1, ind);
            ps.setInt(2, cod);
            ps.executeUpdate();
        }catch(Exception ex){
            Mensajes.M1("ERROR, no se pudo registrar el indicador... "+ex);
        }
    }
    
    public int CantStockResta (int cod,String insumo){
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
