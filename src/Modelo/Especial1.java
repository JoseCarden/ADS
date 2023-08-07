package Modelo;

public class Especial1 {
    String codTien,nomTien,codEmple,user;
    int codVenta;
    double gananTotal;
    
    public Especial1(){}

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

    public int getCodVenta() {
        return codVenta;
    }

    public void setCodVenta(int codVenta) {
        this.codVenta = codVenta;
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

    public double getGananTotal() {
        return gananTotal;
    }

    public void setGananTotal(double gananTotal) {
        this.gananTotal = gananTotal;
    }
    
    public Object[] Registro(){
        Object[] fila ={codVenta,codTien,nomTien,codEmple,user,gananTotal};
        return fila;
    }
    
    
    
}
