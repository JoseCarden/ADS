package Controlador;
//librerías
import Vista.FrmAlmacen;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import Modelo.*;
import javax.swing.JTable;
import javax.swing.JTextField;

public class CFrmAlmacen implements ActionListener{
    //inicializadores
    FrmAlmacen vista;
    String codA;
    //clases enlazadas
    CRUD_almacen crud;
    DefaultTableModel modelo=null;
    ArrayList<Especial4> L_especial4=null;
    //extras
    String codAlma="";
    public CFrmAlmacen(String cod,FrmAlmacen forma){
        vista = forma;       
        vista.BTNagregar_alma.addActionListener(this);
        vista.BTNactualizar_almacen.addActionListener(this);
        vista.BTNactivar_alma.addActionListener(this);
        codA = cod;
        crud = new CRUD_almacen();
        L_especial4 = crud.ConsultaEspecial4(codA);
        modelo = PonerCabeceras(vista.TBLprod_brutos);
        for(int i=0;i<L_especial4.size();i++){
            modelo.addRow(L_especial4.get(i).Registro());
        }
        codAlma = L_especial4.get(0).getAlmacen();
        vista.TXTvasos_alma.setText(String.valueOf(crud.StockInsumos("INS001", codAlma)));
        vista.TXTbolsas_alma.setText(String.valueOf(crud.StockInsumos("INS002", codAlma)));
        vista.TXTempaques_alma.setText(String.valueOf(crud.StockInsumos("INS003", codAlma)));
        vista.TXTvasos_alma.setEnabled(false);
        vista.TXTbolsas_alma.setEnabled(false);
        vista.TXTempaques_alma.setEnabled(false);
        vista.BTNactualizar_almacen.setEnabled(false);
        vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista.BTNactivar_alma){
            int ind = Mensajes.M2("¿Que insumo activar?");
            switch(ind){
                case 1: 
                    vista.TXTvasos_alma.setEnabled(true);break;
                case 2:
                    vista.TXTbolsas_alma.setEnabled(true);break;
                case 3:
                    vista.TXTvasos_alma.setEnabled(false);
                    vista.TXTbolsas_alma.setEnabled(false);
            }
            vista.BTNactualizar_almacen.setEnabled(true);
            vista.BTNactivar_alma.setEnabled(false);
        }
        if(e.getSource() == vista.BTNactualizar_almacen){
            int cant=0;
            int ind2= Mensajes.M3("Confirmación", "¿Seguro que quiere actualizar?");
            if(ind2==0){
                if(vista.TXTvasos_alma.isEnabled()){
                    cant = Integer.parseInt(vista.TXTvasos_alma.getText());
                    crud.ActualizarInsumo("INS001", cant);
                }else{
                    if(vista.TXTbolsas_alma.isEnabled()){
                        cant = Integer.parseInt(vista.TXTbolsas_alma.getText());
                        crud.ActualizarInsumo("INS002", cant);
                    }else{
                        cant = Integer.parseInt(vista.TXTempaques_alma.getText());
                        crud.ActualizarInsumo("INS003", cant);                        
                    }
                }
            vista.TXTvasos_alma.setText(String.valueOf(crud.StockInsumos("INS001", codAlma)));
            vista.TXTbolsas_alma.setText(String.valueOf(crud.StockInsumos("INS002", codAlma)));
            vista.TXTempaques_alma.setText(String.valueOf(crud.StockInsumos("INS003", codAlma)));
            vista.TXTvasos_alma.setEnabled(false);
            vista.TXTbolsas_alma.setEnabled(false);
            vista.TXTempaques_alma.setEnabled(false);
            vista.BTNactivar_alma.setEnabled(true);
            vista.BTNactualizar_almacen.setEnabled(false);
            }else{ 
                vista.TXTvasos_alma.setText(String.valueOf(crud.StockInsumos("INS001", codAlma)));
                vista.TXTbolsas_alma.setText(String.valueOf(crud.StockInsumos("INS002", codAlma)));
                vista.TXTempaques_alma.setText(String.valueOf(crud.StockInsumos("INS003", codAlma)));
                vista.TXTvasos_alma.setEnabled(false);
                vista.TXTbolsas_alma.setEnabled(false);
                vista.TXTempaques_alma.setEnabled(false);
                vista.BTNactivar_alma.setEnabled(true);
                vista.BTNactualizar_almacen.setEnabled(false);
                Mensajes.M1("Canceló actualización");}            
        }
    }
    
    public DefaultTableModel PonerCabeceras(JTable tabla){
        String[] titulos={"Almacen","Cod Producto Bruto","Producto Bruto","Cant.","Stock"};
        DefaultTableModel modelo= new DefaultTableModel(null,titulos);
        tabla.setModel(modelo);
        return modelo;
    }
    
    public void DesactivarTXT(JTextField txt){
        txt.setEnabled(false);
    }
    
    
}
