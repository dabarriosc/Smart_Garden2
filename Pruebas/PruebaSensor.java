
import com.panamahitek.ArduinoException;
import com.panamahitek.PanamaHitek_Arduino;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import jssc.SerialPortException;

public class PruebaSensor {

    
    public static void main(String args[]) {
        PanamaHitek_Arduino ino = new PanamaHitek_Arduino();
        try {
            ino.arduinoTX("COM5", 9600);
        } catch (ArduinoException ex) {
            Logger.getLogger(PruebaSensor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Scanner sc = new Scanner(System.in);
        
        int valor = sc.nextInt();
        
        if (valor == 1){
       
            try {
                ino.sendData("1");
            } catch (ArduinoException | SerialPortException ex) {
                Logger.getLogger(PruebaSensor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
