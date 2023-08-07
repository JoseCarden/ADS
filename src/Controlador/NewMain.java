package Controlador;
//librerías
import Vista.*;

public class NewMain extends Conexion{
    
    static CLogin login;
    static FrmLogin Flogin;

    public static void main(String[] args) {
        Flogin = new FrmLogin();
        login = new CLogin(Flogin);
        Flogin.setVisible(true);
//          int[] a = new int[2];
//          a[0] = 0;
//          a[1] = 1;
//          for(int i=0;i<a.length;i++){
//              if(i<a.length){
//                 System.out.println(a[i]);                               
//              }else System.out.println("ups");                                
//              
//          }

            


    }
    
}
