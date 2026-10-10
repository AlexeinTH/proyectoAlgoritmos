
package proyectofinal;

import java.util.Scanner;

public class Comandos {
    
    public static void sistemaBasicoVentas(){
    
    Scanner teclado = new Scanner(System.in);

        int opcion;

        do {

            System.out.println("\n======================================");
            System.out.println("       SISTEMA DE VENTAS");
            System.out.println("======================================");
            System.out.println("1. Registrar una venta");
            System.out.println("2. Consultar caja");
            System.out.println("3. Mostrar estadisticas");
            System.out.println("4. Salir");
            System.out.println("======================================");
            System.out.print("Seleccione una opcion: ");

            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("\n--- REGISTRAR UNA VENTA ---");
                    System.out.println("Aquí se registrará la venta.");
                    break;
                case 2:
                    System.out.println("\n--- CONSULTAR CAJA ---");
                    System.out.println("Aquí se consultará la caja.");
                    break;

                case 3:
                    System.out.println("\n--- ESTADÍSTICAS ---");
                    System.out.println("Aquí se mostrarán las estadísticas.");
                    break;

                case 4:
                    System.out.println("\nSaliendo del sistema...");
                    break;

                default:
                    System.out.println("\nOpción no válida. Intente nuevamente.");
                    break;
            }

        } while (opcion != 4);

       
        
    }
    
    
}
    

