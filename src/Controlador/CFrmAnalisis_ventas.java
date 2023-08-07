package Controlador;
//librerías
import Vista.*;
import Modelo.*;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CFrmAnalisis_ventas{
    //inicializadores
    FrmAnalisis_ventas vista;
    String codA;
    //clase enlazadas
    CRUD_ana_ventas crud;
    //extras
    DefaultTableModel modelo=null;
    ArrayList<Especial1> L_especial1=null;
    double acuGanan=0;
    public CFrmAnalisis_ventas(String cod, FrmAnalisis_ventas frame){
        vista = frame;
        codA = cod;
        crud = new CRUD_ana_ventas();
        L_especial1 = crud.ConsultaEspecial(codA);
        modelo = PonerCabeceras(vista.TBLtienda_enTien);
        for(int i=0;i<L_especial1.size();i++){
            modelo.addRow(L_especial1.get(i).Registro());
            acuGanan +=L_especial1.get(i).getGananTotal();
        }
        vista.LBLnombre_tienda.setText(L_especial1.get(0).getNomTien()+" - "+L_especial1.get(0).getCodTien());
        vista.LBLganancias.setText("GANANCIAS = S/. "+String.valueOf(acuGanan));
        vista.LBLvasos_enTien.setText("VASOS = "+crud.CantStockResta(L_especial1.get(0).getCodTien(),"INS001"));
        vista.LBLbolsas_enTien.setText("BOLSAS = "+crud.CantStockResta(L_especial1.get(0).getCodTien(),"INS002"));
        vista.LBLempaques_enTien.setText("EMPAQUES = "+crud.CantStockResta(L_especial1.get(0).getCodTien(),"INS003"));        
        vista.setVisible(true);       
    }
    
    public DefaultTableModel PonerCabeceras(JTable tabla){
        String[] titulos={"Cod Venta","Cod Tienda","Tienda","Cod Empleado","Empleado","Ganancia Total"};
        DefaultTableModel modelo= new DefaultTableModel(null,titulos);
        tabla.setModel(modelo);
        return modelo;
    }

}
