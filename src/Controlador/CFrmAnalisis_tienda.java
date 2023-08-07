package Controlador;
//librerías
import Modelo.*;
import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CFrmAnalisis_tienda implements ActionListener{
    //inicializadores
    String codA;
    FrmAnalisis_tienda vista;
    //clases enlazadas
    CRUD_ana_tiendas crud;
    //extras
    DefaultTableModel modelo=null;
    ArrayList<Especial2> L_especial2=null;
    double acuGanan=0;
    int codT=0;
    String indicador="";
    public CFrmAnalisis_tienda(String cod,FrmAnalisis_tienda forma){
        vista = forma;
        vista.BTNconsultar_enDistri.addActionListener(this);
        vista.BTNclasificar_enDistri.addActionListener(this);
        vista.BTNlimpiar_enDistri.addActionListener(this);
        modelo = PonerCabeceras(vista.TBLtienda_enDistri);
        codA = cod;
        crud = new CRUD_ana_tiendas();
        vista.BTNlimpiar_enDistri.setEnabled(false);
        vista.BTNclasificar_enDistri.setEnabled(false);
        vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == vista.BTNconsultar_enDistri){
            if(!vista.BTNlimpiar_enDistri.isEnabled()){
                switch(vista.CBXtienda_enDistri.getSelectedIndex()){
                    case 0: codT = 50;break;
                    case 1: codT = 51;break;
                    case 2: codT = 52;break;
                }
            L_especial2 = crud.ConsultaEspecial2(codT);
            for(int i=0;i<L_especial2.size();i++){
                modelo.addRow(L_especial2.get(i).Registro());
                acuGanan +=L_especial2.get(i).getGananTotal();
            }
            vista.LBLganancias_enDistri.setText("GANANCIAS = S/. "+String.valueOf(acuGanan));
            vista.LBLvasos_enDistri.setText("VASOS = "+crud.CantStockResta(codT,"INS001"));
            vista.LBLbolsas_enDistri.setText("BOLSAS = "+crud.CantStockResta(codT,"INS002"));
            vista.LBLempaques_enDistri.setText("EMPAQUES = "+crud.CantStockResta(codT,"INS002"));
            vista.BTNlimpiar_enDistri.setEnabled(true);
            vista.BTNclasificar_enDistri.setEnabled(true);
            vista.BTNconsultar_enDistri.setEnabled(false);
            } else Mensajes.M1("Limpie las anteriores entradas");
        }
        if(e.getSource() == vista.BTNclasificar_enDistri){
            switch(vista.CBXurgencia_enDistri.getSelectedIndex()){
                case 0: indicador = "B";break;
                case 1: indicador = "N";break;
                case 2: indicador = "A";break;
                case 3: indicador = "U";break;
            }
            crud.RegistrarIndicador(indicador, codT);
            L_especial2.clear();
            for(int i=vista.TBLtienda_enDistri.getRowCount()-1;i>=0;i--){
            modelo.removeRow(i);
            }
            L_especial2 = crud.ConsultaEspecial2(codT);
            for(int i=0;i<L_especial2.size();i++){
                modelo.addRow(L_especial2.get(i).Registro());
            }
            vista.BTNclasificar_enDistri.setEnabled(false);
        }
        if(e.getSource() == vista.BTNlimpiar_enDistri){
            LimpiarTodo(vista);
        }
        
    }
    
    public DefaultTableModel PonerCabeceras(JTable tabla){
        String[] titulos={"Urgencia","Cod Venta","Cod Tienda","Tienda","Cod Empleado","Empleado","Ganancia Total"};
        DefaultTableModel modelo= new DefaultTableModel(null,titulos);
        tabla.setModel(modelo);
        return modelo;
    }
    
    public void LimpiarTodo(FrmAnalisis_tienda vista){
        vista.LBLganancias_enDistri.setText("GANANCIAS = S/. ");
        vista.LBLvasos_enDistri.setText("VASOS = ");
        vista.LBLbolsas_enDistri.setText("BOLSAS = ");
        vista.LBLempaques_enDistri.setText("EMPAQUES = ");
        for(int i=vista.TBLtienda_enDistri.getRowCount()-1;i>=0;i--){
            modelo.removeRow(i);
        }
        L_especial2.clear();
        acuGanan = 0;
        vista.BTNconsultar_enDistri.setEnabled(true);
        vista.BTNlimpiar_enDistri.setEnabled(false);
    }
}
