
import java.awt.*;
import javax.swing.*;


public class Interfaz {
    public static void main(String[] args){
       
        String v = JOptionPane.showInputDialog(null, "Ingrese 1 si es aministrador, ingrese 2 si es usuario", JOptionPane.INFORMATION_MESSAGE);
        int valor = Integer.valueOf(v);
        Ventana PR1 = new Ventana();
        
        int adm = 1;
        
        if (valor == adm){
            System.out.println("admin");
            
            Admin admin = new Admin();
            PR1.add(admin,BorderLayout.WEST);
            admin.setVisible(true);
        }else{
        
            System.out.println("user");
        
        }
    }
    

}
class Ventana extends JFrame{

    public Ventana(){
        setLayout(new BorderLayout());
        setDefaultCloseOperation(3);
        setSize(500,500);
        setResizable(true);
        setVisible(true);
    }

}

class User extends JPanel{

    public User(){
    
    
    }

}

class Admin extends JPanel{

    public Admin(){
        setSize(100,100);
        setLayout(new GridLayout(4,1,20,50));
        add(new JLabel("Bienvenido aministrador"));
        JTextField Nombre_adm = new JTextField();
        add(Nombre_adm);
        JTextField Credencial_adm = new JTextField();
        add(Credencial_adm);
        add(new JButton("Ingresar"));
        
    }

}