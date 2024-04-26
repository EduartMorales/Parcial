
package Software;

import java.util.Scanner;
import RegistroVendidos.Automovil;
import RegistroVendidos.Sedan;
import RegistroVendidos.Moto;
import RegistroVendidos.Sport;

public class SoftwareFinal {
    
    public void registroAutomoviles(){
        
    }
    public void nombresApellidos(){
        System.out.println("Eduart Francisco Morales Ussa");
    }
    
    Scanner entrada = new Scanner(System.in);
    
    public static void main(String [] agrs){

        int opcion=0;
        do { 
            Scanner entrada = new Scanner(System.in);
        System.out.print(" CONCESIONARIO CAUCANA DE VEHÍCULOS S.A.\n" +
                " REGISTRO DE VEHÍCULOS VENDIDOS********\n" +
                "  1. Registro de automóviles\n" +
                "  2. Registro de motos\n" +
                "  3. Vendedor\n" +
                "  4. Salir\n");
        
        System.out.print("Por favor elija una opcion");
            
            opcion = entrada.nextInt();
            
        switch (opcion) {
            case 1:
                    registroAutomoviles();
                break;
            case 2:
                System.out.print("Registro de motos: registra y muestra los datos de clases bases y derivadas\n" +
                        "junto con sus campos y métodos.");
                break;
            case 3:
                System.out.println("" + SoftwareFinal.nombresApellidos());
                break;
            case 4:
                break;
                default:
                    System.out.println("Opcion invalida");
        }
        } while (opcion!=4);
        System.out.print("Finalizo el programa");
    }
}
