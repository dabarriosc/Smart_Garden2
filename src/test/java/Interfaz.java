
import java.awt.*;
import javax.swing.*;


public class Interfaz {
    public static void main(String[] args){
       
        String v = JOptionPane.showInputDialog(null, "Ingrese 1 si es aministrador, ingrese 2 si es usuario", JOptionPane.INFORMATION_MESSAGE);
        int valor = Integer.valueOf(v);
        Ventana PR1 = new Ventana();
        
        int adm = 1;
        
        if (valor == adm){
            Boton ingreso = new Boton(325,250,150,50,"Ingresar");
            Texto Bienv = new Texto(325,0,250,250,"Bienvenido admin");
            System.out.println("admin");
            Admin admin = new Admin();
            admin.add(ingreso);
            PR1.add(admin);
            admin.add(Bienv);
            admin.setVisible(true);
        }else{
        
            System.out.println("user");
            Boton ingreso = new Boton(300,215,175,30,"Ingresar");
            Boton registro = new Boton(300,250,175,30,"Registrate");
            Texto Bienv = new Texto(300,0,195,100,"Bienvenido");
            Texto Bienv2 = new Texto(300,50,195,100,"Ingresa o registrate");
            User usua = new User();
            usua.add(Bienv);
            usua.add(Bienv2);
            usua.add(ingreso);
            usua.add(registro);
            PR1.add(usua);
        
        }
    }
    

}
class Ventana extends JFrame{

    public Ventana(){
        setDefaultCloseOperation(3);
        setSize(500,500);
        setResizable(false);
        setVisible(true);
    }

}

class User extends JPanel{

    public User(){
    
        setLayout(null);
        setSize(100,100);
        JTextField Nombre_user = new JTextField();
        add(Nombre_user);
        Nombre_user.setBounds(new Rectangle(300,150,175,25));
        JTextField Contraseña_user = new JTextField();
        add(Contraseña_user);
        Contraseña_user.setBounds(new Rectangle(300,180,175,25));
    
    }

}

class Admin extends JPanel{

    public Admin(){
        setLayout(null);
        setSize(100,100);
        JTextField Nombre_adm = new JTextField();
        add(Nombre_adm);
        Nombre_adm.setBounds(new Rectangle(325,150,150,25));
        JTextField Credencial_adm = new JTextField();
        add(Credencial_adm);
        Credencial_adm.setBounds(new Rectangle(325,180,150,25));
        
        
    }

}
class Boton extends JButton{

    public Boton(int x,int y, int ancho,int alto,String nombre){
    
    setBounds(new Rectangle(x,y,ancho,alto));
    setText(nombre);
    }
}
class Texto extends JLabel{

    public Texto(int x,int y, int ancho,int alto,String nombre){
    
    setBounds(new Rectangle(x,y,ancho,alto));
    setText(nombre); 
    
    }

}