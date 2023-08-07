package Modelo;

public class Especial4 {
    String almacen,nombreProB,cant;
    int codProB,stock;
    
    public Especial4(){}

    public String getAlmacen() {
        return almacen;
    }

    public void setAlmacen(String almacen) {
        this.almacen = almacen;
    }

    public String getNombreProB() {
        return nombreProB;
    }

    public void setNombreProB(String nombreProB) {
        this.nombreProB = nombreProB;
    }

    public String getCant() {
        return cant;
    }

    public void setCant(String cant) {
        this.cant = cant;
    }

    public int getCodProB() {
        return codProB;
    }

    public void setCodProB(int codProB) {
        this.codProB = codProB;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public Object[] Registro(){
        Object[] fila={almacen,codProB,nombreProB,cant,stock};
        return fila;
    }
}
