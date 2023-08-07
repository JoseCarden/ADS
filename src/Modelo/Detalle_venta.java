package Modelo;
public class Detalle_venta {
    
    int cod_venta,cod_pro,cant;
    double precio_parcial;
    
    public Detalle_venta(){}

    public int getCod_venta() {
        return cod_venta;
    }

    public void setCod_venta(int cod_venta) {
        this.cod_venta = cod_venta;
    }

    public int getCod_pro() {
        return cod_pro;
    }

    public void setCod_pro(int cod_pro) {
        this.cod_pro = cod_pro;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public double getPrecio_parcial() {
        return precio_parcial;
    }

    public void setPrecio_parcial(double precio_parcial) {
        this.precio_parcial = precio_parcial;
    }
    
}
