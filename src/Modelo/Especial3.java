package Modelo;

public class Especial3 {
    String indicador,nombreTien,codEnTien,EnTien,codEnDistri,EnDistri;
    int codTien,codVenta;
    double gananTotal;

    public String getIndicador() {
        return indicador;
    }

    public void setIndicador(String indicador) {
        this.indicador = indicador;
    }

    public String getNombreTien() {
        return nombreTien;
    }

    public void setNombreTien(String nombreTien) {
        this.nombreTien = nombreTien;
    }

    public String getCodEnTien() {
        return codEnTien;
    }

    public void setCodEnTien(String codEnTien) {
        this.codEnTien = codEnTien;
    }

    public String getEnTien() {
        return EnTien;
    }

    public void setEnTien(String EnTien) {
        this.EnTien = EnTien;
    }

    public String getCodEnDistri() {
        return codEnDistri;
    }

    public void setCodEnDistri(String codEnDistri) {
        this.codEnDistri = codEnDistri;
    }

    public String getEnDistri() {
        return EnDistri;
    }

    public void setEnDistri(String EnDistri) {
        this.EnDistri = EnDistri;
    }

    public int getCodTien() {
        return codTien;
    }

    public void setCodTien(int codTien) {
        this.codTien = codTien;
    }

    public int getCodVenta() {
        return codVenta;
    }

    public void setCodVenta(int codVenta) {
        this.codVenta = codVenta;
    }

    public double getGananTotal() {
        return gananTotal;
    }

    public void setGananTotal(double gananTotal) {
        this.gananTotal = gananTotal;
    }

    public Object[] Registro(){
        Object[] fila ={indicador,codTien,nombreTien,codVenta,
                        gananTotal,codEnTien,EnTien,codEnDistri,EnDistri};
        return fila;
    }
}
