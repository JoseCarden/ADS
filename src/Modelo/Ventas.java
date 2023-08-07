package Modelo;
public class Ventas {
    private String cod_emple;
    Cliente c;
    Producto p;
    
    Ventas(Cliente c, Producto p){
        this.c = c;
        this.p = p;
    }

    public String getCod_emple() {return cod_emple;}
    public void setCod_emple(String cod_emple) {this.cod_emple = cod_emple;}
    
    public double total(){
        return p.getCnt()*p.getPu();
    }
    
}//fin de clase
