//Desarrollar una aplicacion que me permita ingrsar placas de carros 
//Se asume que las placas ingresadas pertencecen a la region costa del Ecuador
//En base a la placa nuestro programa determinara y presentara la placa con la 
//provincia a la que pertenece


package manejosswitch;
import java.util.Scanner;
/**
 *
 * @author AndresVallejo
 */
public class UsoSwitch5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        String placa;
        System.out.println("Ingrese la placa del automovil");
        placa = sc.nextLine();
        char valor = placa.charAt(0);
        //Casos de las provincias de la costa        
        switch(valor){
            case'O':
            case'E':
            case'G':
            case'M':
            case'Y':
            case'J':       
                System.out.printf("Pertenceciente a la Region Costa %s de %s\n", 
                        valor, placa.toUpperCase());
                break;
            
            
            default:
                System.out.println("No pertence a la region Costa");
                
        }
        
    }
}
