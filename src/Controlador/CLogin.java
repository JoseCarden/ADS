package Controlador;
//librerías
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.*;
import Vista.*;
import java.util.ArrayList;


public class CLogin implements ActionListener{
    int indicador = 0;
    //agentes
    Actor actor;
    //lista de agentes
    ArrayList<Empleado> L_empleados;
    ArrayList<Encargado_tienda> L_enTien;
    ArrayList<Encargado_distrito> L_enDistri;
    ArrayList<Encargado_directiva> L_enDirec;
    ArrayList<Almacenero> L_almacenero;
    //frames
    FrmLogin login;
    FrmVentas ventas;
    FrmAlmacen almacen;
    FrmAnalisis_tienda tiendas;
    FrmAnalisis_ventas A_ventas;
    FrmEleccion eleccion;
    //controladores de frames
    CFrmVentas Cventas;
    CFrmAnalisis_ventas Cana_ven;
    CFrmAnalisis_tienda Cana_tien;
    CEleccion Celeccion;
    CFrmAlmacen Calmacen;
    //CRUDs
    CRUD_login crud;
    
    public CLogin(FrmLogin vista){
        login = vista;
        vista.BTNlogin.addActionListener(this);
        crud = new CRUD_login();
        L_empleados = crud.ObtenerEmpleados();
        L_enTien = crud.ObtenerEnTienda();
        L_enDistri = crud.ObtenerEnDistrito();
        L_enDirec = crud.ObtenerEnDirectiva();
        L_almacenero = crud.ObtenerAlmacenero();
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == login.BTNlogin){
            //codigo de agente
            String codA = "";
            actor = LeerActor(login);
            //loop para empleado
            for(int i=0;i<L_empleados.size();i++){
                if(L_empleados.get(i).getUser().equals(actor.getUser()) &&
                   L_empleados.get(i).getPass().equals(actor.getPass())){
                    codA = L_empleados.get(i).getCod();
                    indicador = 1;
                    ventas = new FrmVentas();
                    Cventas = new CFrmVentas(codA,ventas);
                    login.setVisible(false);
                }
            }
            //loop para encargados de tiendas
            for(int i=0;i<L_enTien.size();i++){
                if(L_enTien.get(i).getUser().equals(actor.getUser()) &&
                   L_enTien.get(i).getPass().equals(actor.getPass())){
                    codA = L_enTien.get(i).getCod();
                    indicador = 1;
                    A_ventas = new FrmAnalisis_ventas();
                    Cana_ven = new CFrmAnalisis_ventas(codA,A_ventas);
                    login.setVisible(false);
                }
            }
            //loop para encargados de distrito
            for(int i=0;i<L_enDistri.size();i++){
                if(L_enDistri.get(i).getUser().equals(actor.getUser()) &&
                   L_enDistri.get(i).getPass().equals(actor.getPass())){
                    codA = L_enDistri.get(i).getCod();
                    indicador = 1;
                    tiendas = new FrmAnalisis_tienda();
                    Cana_tien = new CFrmAnalisis_tienda(codA,tiendas);
                    login.setVisible(false);
                }
            }
            //loop para encargados de junta directiva
            for(int i=0;i<L_enDirec.size();i++){
                if(L_enDirec.get(i).getUser().equals(actor.getUser()) &&
                   L_enDirec.get(i).getPass().equals(actor.getPass())){
                    codA = L_enDirec.get(i).getCod();
                    indicador = 1;
                    eleccion = new FrmEleccion();
                    Celeccion = new CEleccion(codA,eleccion);
                    login.setVisible(false);
                }
            }
            //loop para almaceneros
            for(int i=0;i<L_almacenero.size();i++){
                if(L_almacenero.get(i).getUser().equals(actor.getUser()) &&
                   L_almacenero.get(i).getPass().equals(actor.getPass())){
                    codA = L_almacenero.get(i).getCod();
                    indicador = 1;
                    almacen = new FrmAlmacen();
                    Calmacen = new CFrmAlmacen(codA,almacen);
                    login.setVisible(false);
                }
            }
            if(indicador == 0){
            Mensajes.M1("Usuario o constraseña incorrectos ");
            LimpiarEntradas(login);
            login.TXTuser_login.requestFocus();
            }
        }
    }
    
    public Actor LeerActor(FrmLogin vista){
        actor = new Actor();
        actor.setUser(vista.TXTuser_login.getText());
        actor.setPass(String.valueOf(vista.TPTpass_login.getPassword()));
        return actor;
    }
    
    public void LimpiarEntradas(FrmLogin vista){
        vista.TXTuser_login.setText("");
        vista.TPTpass_login.setText("");
    }
    
}
