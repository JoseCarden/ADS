package Controlador;
//librerías 
import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CEleccion implements ActionListener{
    //inicializadores
    String codA;
    FrmEleccion vista;
    //frames
    FrmAnalisis_urgencia urg;
    FrmAlmacen alma;
    //controladores de frames
    CFrmAlmacen Calmacen;
    CFrm_ana_urgencia Cana_urg;
    public CEleccion(String cod, FrmEleccion forma){
        vista = forma;
        vista.setVisible(true);
        vista.BTNalmacen_elec.addActionListener(this);
        vista.BTNtiendas_elec.addActionListener(this);
        codA = cod;
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista.BTNalmacen_elec){
            alma = new FrmAlmacen();
            Calmacen = new CFrmAlmacen(codA,alma);
            vista.setVisible(false);
        }
        if(e.getSource() == vista.BTNtiendas_elec){
            urg = new FrmAnalisis_urgencia();
            Cana_urg = new CFrm_ana_urgencia(codA,urg);
            vista.setVisible(false);
        }
    }
}
