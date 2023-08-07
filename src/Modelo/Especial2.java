package Modelo;

public class Especial2 {
    String codTien,nomTien,codEmple,user,indicador;
    int codVenta;
    double gananTotal;

    public String getCodTien() {
        return codTien;
    }

    public void setCodTien(String codTien) {
        this.codTien = codTien;
    }

    public String getNomTien() {
        return nomTien;
    }

    public void setNomTien(String nomTien) {
        this.nomTien = nomTien;
    }

    public String getCodEmple() {
        return codEmple;
    }

    public void setCodEmple(String codEmple) {
        this.codEmple = codEmple;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getIndicador() {
        return indicador;
    }

    public void setIndicador(String indicador) {
        this.indicador = indicador;
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
        Object[] fila ={indicador,codVenta,codTien,nomTien,codEmple,user,gananTotal};
        return fila;
    }
}
