package Controlador;
//librerías
import java.util.ArrayList;
import Modelo.*;

public class CRUD_almacen extends Conexion{
    
    ArrayList<Especial4> L_e4 = new ArrayList();
    
    public CRUD_almacen(){}
    
    public ArrayList<Especial4> ConsultaEspecial4(String cod){
        Especial4 e4;
        try{
            rs = st.executeQuery("select almacen.cod_almacen,producto_bruto.cod_proB," +
                                "producto_bruto.nombre_prodb,producto_bruto.cant,producto_bruto.stock " +
                                "from producto_bruto inner join almacen_productob " +
                                "on producto_bruto.cod_proB = almacen_productob.cod_proB " +
                                "inner join almacen on almacen_productob.cod_almacen = almacen.cod_almacen " +
                                "inner join almacenero on almacen.cod_alma = almacenero.cod_alma " +
                                "inner join encargado_directiva on almacen.cod_enDirec = encargado_directiva.cod_enDirec " +
                                "where almacenero.cod_alma = '"+cod+"' or encargado_directiva.cod_enDirec = '"+cod+"';");
            while(rs.next()){
                e4 = new Especial4();
                e4.setAlmacen(rs.getString(1));
                e4.setCodProB(rs.getInt(2));
                e4.setNombreProB(rs.getString(3));
                e4.setCant(rs.getString(4));
                e4.setStock(rs.getInt(5));
                L_e4.add(e4);
            }
        }catch(Exception ex){
            Mensajes.M1("ERROR, no se pudieron recoger los datos... "+ex);
        }
        return L_e4;
    }
    
    public int StockInsumos(String insumo,String cod){
        int cont=0;
        try{
            rs = st.executeQuery("select insumo.stock_resta from insumo inner join almacen_insumo " +
                                "on insumo.cod_insumo = almacen_insumo.cod_insumo " +
                                "inner join almacen on almacen_insumo.cod_almacen = almacen.cod_almacen " +
                                "where insumo.cod_insumo = '"+insumo+"' and almacen.cod_almacen = '"+cod+"';");
            while(rs.next()){
                cont = rs.getInt(1);
            }
        }catch(Exception ex){
            Mensajes.M1("ERROR, no se pudo recuperar la cant. del stock... "+ex);
        }
        return cont;
    }
    
    public void ActualizarInsumo(String insumo,int cant){
        try{
        ps = con.prepareStatement("update insumo set stock_resta = ? where cod_insumo = ?;");
        ps.setInt(1, cant);
        ps.setString(2, insumo);
        ps.executeUpdate();
//        con.close();        
    }catch(Exception ex){
        Mensajes.M1("ERROR, no se puede actualizar el insumo..."+ex);
    }
    }
}
