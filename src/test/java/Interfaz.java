
import java.awt.*;
import javax.swing.*;


public class Interfaz {
    public static void main(String[] args){
       
        String v = JOptionPane.showInputDialog(null, "Ingrese 1 si es aministrador, ingrese 2 si es usuario", JOptionPane.INFORMATION_MESSAGE);
        int valor = Integer.valueOf(v);
        Ventana PR1 = new Ventana();
        Boton b1 = new Boton(250,250,250,250,"Boton");
        int adm = 1;
        
        if (valor == adm){
            System.out.println("admin");
            Admin admin = new Admin();
            admin.add(b1);
            PR1.add(admin);
            admin.setVisible(true);
        }else{
        
            System.out.println("user");
        
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
    
    
    }

}

class Admin extends JPanel{

    public Admin(){
        setLayout(null);
        setSize(100,100);
        add(new JLabel("Bienvenido aministrador"));
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
    setLabel(nombre);
    }
}