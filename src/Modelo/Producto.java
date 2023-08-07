package Modelo;
public class Producto {
    private int cod_pro,cnt;
    private double pu;
    private String nombre_pro;
    
   
    public Producto(){}

    public int getCod_pro() {return cod_pro;}
    public void setCod_pro(int cod_pro) {this.cod_pro = cod_pro;}

    public double getPu() {return pu;}
    public void setPu(double pu) {this.pu = pu;}
    
    public String getNombre_pro() {return nombre_pro;}
    public void setNombre_pro(String nombre_pro) {this.nombre_pro = nombre_pro;}

    public int getCnt() {return cnt;}
    public void setCnt(int cnt) {this.cnt = cnt;}
    
    public double Precio_parcial(){
        return getCnt()* getPu();
    }

    
    
    
    
}
