package Controlador;
//librerías
import Modelo.*;
import java.util.ArrayList;

public class CRUD_Ventas extends Conexion{
ArrayList<Integer> cod_ventas = new ArrayList();
ArrayList<String> cod_clientes = new ArrayList();
public CRUD_Ventas(){}


public void RegistrarVenta(String cod_emple,String cod_cliente,int cod_tienda,
                           double precio_total,int cant_total){
    try{
        ps = con.prepareStatement("insert into venta(cod_emple,cod_cliente,"
                                + "cod_tienda,precio_total,cant_total) "
                                + "values(?,?,?,?,?);");
        ps.setString(1,cod_emple);
        ps.setString(2,cod_cliente);
        ps.setInt(3,cod_tienda);
        ps.setDouble(4,precio_total);
        ps.setInt(5,cant_total);
        ps.executeUpdate();
        Mensajes.M1("Venta registrada");
//        con.close();
    }catch(Exception ex){
        Mensajes.M1("ERROR, no se puede insertar venta... "+ex);
    }    
}

public void RegistrarCliente(Cliente c){
    try{
        ps = con.prepareStatement("insert into cliente(nombres,apellidos) "
                                 + "values (?,?);");
        ps.setString(1,c.getNombres());
        ps.setString(2,c.getApellidos());
        ps.executeUpdate();
//        con.close();
        Mensajes.M1("Cliente registrado");
    }catch(Exception ex){
        Mensajes.M1("ERROR, no se puede registrar al cliente... "+ex);
    }
}

public void ActualizarStockTienda(String insumo,int tienda,int cont){
    try{
        ps = con.prepareStatement("update insumo_tienda set Tstock_resta = Tstock_resta - ? where cod_tienda = ? and cod_insumo = ?;");
        ps.setInt(1, cont);
        ps.setInt(2, tienda);
        ps.setString(3, insumo);
        ps.executeUpdate();
//        con.close();        
    }catch(Exception ex){
        Mensajes.M1("ERROR, no se puede actualizar el stock en la tienda..."+ex);
    }
}

public void CrearDetalleVenta(int cod_venta,int cod_pro,int cant,double precio_parcial){
    try{
        ps = con.prepareStatement("insert into detalle_venta(cod_venta,cod_pro,"
                                + "cant,precio_parcial) values(?,?,?,?);");
        ps.setInt(1,cod_venta);
        ps.setInt(2,cod_pro);
        ps.setInt(3,cant);
        ps.setDouble(4,precio_parcial);
        ps.executeUpdate();
//        con.close();
    }catch(Exception ex){
        Mensajes.M1("ERROR, no se puede registrar un detalle de venta... "+ex);
    } 
}

public int ObtenerUltimaVenta(){
    int last=0;
    try{
            rs = st.executeQuery("select cod_venta from venta;");
            while(rs.next()){
                cod_ventas.add(rs.getInt(1));
            }
        }catch(Exception ex){
            Mensajes.M1("ERROR, no se pueden recuperar los códigos de las ventas... "+ex);
        }
    for(int i=0;i<cod_ventas.size();i++){
        last = cod_ventas.get(i);
    }
    return last;
}

public String ObtenerUltimoCliente(){
    String last="";
    try{
            rs = st.executeQuery("select cod_cliente from cliente;");
            while(rs.next()){
                cod_clientes.add(rs.getString(1));
            }
        }catch(Exception ex){
            Mensajes.M1("ERROR, no se pueden recuperar los códigos de los clientes... "+ex);
        }
    for(int i=0;i<cod_clientes.size();i++){
        last = cod_clientes.get(i);
    }
    return last;
}

}//fin clase
