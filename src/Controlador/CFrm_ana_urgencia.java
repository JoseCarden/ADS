package Controlador;
//librerías
import Vista.FrmAnalisis_urgencia;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Modelo.*;
import java.util.ArrayList;

public class CFrm_ana_urgencia implements ActionListener{
    //inicializadores
    FrmAnalisis_urgencia vista;
    String codA;
    //clases enlazadas
    CRUD_ana_urg crud;
    //extras
    DefaultTableModel modelo=null;
    ArrayList<Especial3> L_especial3=null;
    String ind="";
    double acuGanan=0;
    public CFrm_ana_urgencia(String cod, FrmAnalisis_urgencia forma){
        vista = forma;
        vista.BTNconsultar_enDirec.addActionListener(this);
        vista.BTNlimpiar_enDirec.addActionListener(this);
        codA = cod;
        crud = new CRUD_ana_urg();
        modelo = PonerCabeceras(vista.TBLtienda_enDirec);
        vista.BTNlimpiar_enDirec.setEnabled(false);
        vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == vista.BTNconsultar_enDirec){
           if(!vista.BTNlimpiar_enDirec.isEnabled()){
            switch(vista.CBXurgencia_enDirec.getSelectedIndex()){
                case 0: ind = "U";break;
                case 1: ind = "A";break;
                case 2: ind = "N";break;
                case 3: ind = "B";break;
            }
            L_especial3 = crud.ConsultaEspecial3(ind);
            for(int i=0;i<L_especial3.size();i++){
                 modelo.addRow(L_especial3.get(i).Registro());
                 acuGanan +=L_especial3.get(i).getGananTotal();
            }
            vista.LBLganancias_enDirec.setText("GANANCIAS = S/. "+acuGanan);
            vista.BTNlimpiar_enDirec.setEnabled(true);
            vista.BTNconsultar_enDirec.setEnabled(false);
           } else Mensajes.M1("Limpie las anteriores entradas");
       }
       if(e.getSource() == vista.BTNlimpiar_enDirec){
           LimpiarTodo(vista);
       }
    }
    
    public DefaultTableModel PonerCabeceras(JTable tabla){
        String[] titulos={"Indicador","Cod Tienda","Tienda","Cod Venta","Ganancia",
                          "Cod En.Tienda","Encar. Tienda","Cod En.Distrito","Encar. Distrito"};
        DefaultTableModel modelo= new DefaultTableModel(null,titulos);
        tabla.setModel(modelo);
        return modelo;
    }
    
    public void LimpiarTodo(FrmAnalisis_urgencia vista){
        vista.LBLganancias_enDirec.setText("GANANCIAS = S/. ");
        for(int i=vista.TBLtienda_enDirec.getRowCount()-1;i>=0;i--){
            modelo.removeRow(i);
        }
        L_especial3.clear();
        acuGanan = 0;
        vista.BTNconsultar_enDirec.setEnabled(true);
        vista.BTNlimpiar_enDirec.setEnabled(false);
    }
    
}
