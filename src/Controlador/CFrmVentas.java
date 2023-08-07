package Controlador;
//librerías
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.*;
import Vista.*;
import java.util.ArrayList;

public class CFrmVentas implements ActionListener{
    //inicializadores
    FrmVentas vista;
    String codA;
    //clases enlazadas
    CRUD_Ventas crud;
    Cliente cli;
    Producto pro;
    Detalle_venta dv;
    ArrayList<Detalle_venta> L_detalle_venta = new ArrayList();
    //extras
    int codV,codP=0,acuCnt,codT,contVasos=0,contBolsas=0,contEmpaques=0;
    double acuPrecio;
    String codC;
    public CFrmVentas(String cod, FrmVentas frame){
        vista = frame;
        vista.BTNregistrar_venta.addActionListener(this);
        vista.BTNregistrar_cliente.addActionListener(this);
        vista.BTNregistrar_pedido.addActionListener(this);
        codA = cod;
        crud = new CRUD_Ventas();        
        vista.setVisible(true);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vista.BTNregistrar_cliente){
            cli = LeerCliente(vista);
            crud.RegistrarCliente(cli);
            codC = crud.ObtenerUltimoCliente();
            cli.setCod_cliente(codC);
            vista.TXTnombre_cliente.setEnabled(false);
            vista.TXTapell_cliente.setEnabled(false);
            vista.BTNregistrar_cliente.setEnabled(false);
            codV = crud.ObtenerUltimaVenta() + 1;
            switch(vista.CBXtienda_ventas.getSelectedIndex()){
                case 0: codT = 50;break;
                case 1: codT = 51;break;
                case 2: codT = 52;break;
            }
        }
        if(e.getSource() == vista.BTNregistrar_pedido){
            int indicador = 0;
            pro = LeerProducto(vista);
            if(vista.TXTnombre_pro.getText().equals("Cafe con leche")){codP = 200;}
            if(vista.TXTnombre_pro.getText().equals("Chocolate caliente")){codP = 201;}
            if(vista.TXTnombre_pro.getText().equals("Té chamomile")){codP = 202;}
            if(vista.TXTnombre_pro.getText().equals("Toffee nut latte")){codP = 203;}
            if(vista.TXTnombre_pro.getText().equals("Americano")){codP = 204;}
            pro.setCod_pro(codP);
            dv = new Detalle_venta();
            dv.setCod_venta(codV);
            dv.setCod_pro(codP);
            dv.setCant(pro.getCnt());
            dv.setPrecio_parcial(pro.Precio_parcial());
            L_detalle_venta.add(dv);
            acuPrecio +=pro.Precio_parcial();
            acuCnt +=pro.getCnt();
            if(vista.RBTNvaso.isSelected()){
                crud.ActualizarStockTienda("INS001", codT, pro.getCnt());
            }
            if(vista.RBTNbolsa.isSelected()){
                crud.ActualizarStockTienda("INS002", codT, pro.getCnt());
            }
            if(vista.RBTNempaque.isSelected()){
                crud.ActualizarStockTienda("INS003", codT, pro.getCnt());
            }
            indicador = Mensajes.M3("Verificación", "¿Desea ingresar otro producto?");
            LimpiarProducto(vista);
            if(indicador == 1){
                vista.BTNregistrar_pedido.setEnabled(false);
                vista.TXTnombre_pro.setEnabled(false);
                vista.TXTcnt_pro.setEnabled(false);
                vista.TXTprecio_unitario.setEnabled(false);
            }
        }
        if(e.getSource() == vista.BTNregistrar_venta){
            crud.RegistrarVenta(codA,codC,codT,acuPrecio,acuCnt);
            for(int i=0;i<L_detalle_venta.size();i++){
            crud.CrearDetalleVenta(L_detalle_venta.get(i).getCod_venta(),
                                   L_detalle_venta.get(i).getCod_pro(),
                                   L_detalle_venta.get(i).getCant(), 
                                   L_detalle_venta.get(i).getPrecio_parcial());
            }
            acuPrecio = 0;
            acuCnt=0;
            L_detalle_venta.clear();
            vista.BTNregistrar_pedido.setEnabled(true);
            vista.BTNregistrar_cliente.setEnabled(true);
            vista.TXTnombre_cliente.setEnabled(true);
            vista.TXTapell_cliente.setEnabled(true);
            vista.TXTnombre_pro.setEnabled(true);
            vista.TXTcnt_pro.setEnabled(true);
            vista.TXTprecio_unitario.setEnabled(true);
            LimpiarTodo(vista);
            Mensajes.M1("Venta registrada");
        }
    }
    
    public Cliente LeerCliente(FrmVentas vista){
        Cliente cli = new Cliente();
        cli.setNombres(vista.TXTnombre_cliente.getText());
        cli.setApellidos(vista.TXTapell_cliente.getText());        
        return cli;
    }
    
    public Producto LeerProducto(FrmVentas vista){
        Producto pro = new Producto();
        pro.setNombre_pro(vista.TXTnombre_pro.getText());
        pro.setPu(Double.parseDouble(vista.TXTprecio_unitario.getText()));
        pro.setCnt(Integer.parseInt(vista.TXTcnt_pro.getText()));
        return pro;
    }

    public void LimpiarTodo(FrmVentas vista){
        vista.TXTapell_cliente.setText("");
        vista.TXTcnt_pro.setText("");
        vista.TXTnombre_cliente.setText("");
        vista.TXTnombre_pro.setText("");
        vista.TXTprecio_unitario.setText("");
        vista.RBTNvaso.setSelected(false);
        vista.RBTNbolsa.setSelected(false);
        vista.RBTNempaque.setSelected(false);
        vista.TXTnombre_cliente.requestFocus();      
    }
    
    public void LimpiarProducto(FrmVentas vista){
        vista.TXTnombre_pro.setText("");
        vista.TXTcnt_pro.setText("");
        vista.TXTprecio_unitario.setText("");
        vista.RBTNvaso.setSelected(false);
        vista.RBTNbolsa.setSelected(false);
        vista.RBTNempaque.setSelected(false);
        vista.TXTnombre_pro.requestFocus();
    }
    
}

