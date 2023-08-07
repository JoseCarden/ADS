package Modelo;
public class Empleado extends Actor{
    public Empleado(){ }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    public String[] Registro(){
        String[] fila = {getCod(),getUser(),getPass()};
        return fila;
    }
    
}
