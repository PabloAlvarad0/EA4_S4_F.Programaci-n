package exp4_s4_pabloalvarado_005a;

import java.util.Scanner;



/**Desarrollo de funcionalidades de Sistema, para gestion de venta de entradas
 * del teatro moro.
 *
 * @author pablo
 */
public class EXP4_S4_PabloAlvarado_005A {

    
    public static void main(String[] args) {
        // Codigo del Algoritmo
        
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        
        //Inicio del Algoritmo
         //01. Inicio del Programa
         
       System.out.println("TEATRO MORO\n");
       System.out.println("Bienvenido/a a nuestro Sistema de Ventas\n");
        
    while (continuar) {
            // 01. Menu Principal
                //01.1 Opciones de interaccion para el usuario
            
            for (int i = 0; i < 1; i++) {
                System.out.println("Aca podras tener nuestras entradas\n");
                System.out.println("1. Comprar entrada/s");
                System.out.println("2. Salir\n");
                System.out.print("Digite una opcion a continuacion: \n");

                int opcion = scanner.nextInt();
                scanner.nextLine(); // Propiedad para limpiar buffer
         
                //01.2 Propiedad de comprar entradas
            if (opcion == 1) {
                
            

            //02. Compra de Entradas
                
                //02.1 Sectores
                
                System.out.println("Estas son nuestras Zonas Disponibles\n");
                System.out.println("A. Platea Baja");
                System.out.println("B. Platea Alta");
                System.out.println("C. Palcos");
                System.out.println("D. Sector VIP\n");
                
                    System.out.print("Digite la opcion segun corresponda (A/B/C/D): \n");
                    String zona = scanner.nextLine().toUpperCase();

                    int precioBase = 0;
                    boolean zonaValida = true;
                    
                    
                //02.2 Asignación de Valores de Tarifas
                if (zona.equals("A")) precioBase = 15000;
                else if (zona.equals("B")) precioBase = 18000;
                else if (zona.equals("C")) precioBase = 13000;
                else if (zona.equals("D")) precioBase = 30000;
                else zonaValida = false;
                
                
                //02.3 Si el usuario digita por error otro caracter
                if (!zonaValida) {
                    System.out.println("Zona Invalida\n");
                continue;
                }
                
                
                //02.4 Para ratificar Edad
                System.out.println("");
                System.out.println("Digite su edad a continuacion:");
                int edad = scanner.nextInt();
                scanner.nextLine();
                
                double descuento = 0.0;
                boolean edadValida = edad > 0;
                
                if (!edadValida) {
                        System.out.println("Edad invalida.\n");
                        continue;
                    }
                
                
                //02.5 Para ratificar Estudios
                System.out.println("");
                System.out.println("Actualmente esta estudiando SI/NO\n");
                String esEstudiante = scanner.nextLine().toLowerCase();
                
                
                
                //02.6 Para aplicar el Descuento
                double precioFinal;
                    int intentos = 0;
                do {
                        if (esEstudiante.equals("si")) {
                            descuento = 0.10;
                            
                            
                            
                        //02.7 Para actualizar precio si es Estudiante
                        
                        if (zona.equals("A")) precioBase = 10000;
                        else if (zona.equals("B")) precioBase = 9000;
                        else if (zona.equals("C")) precioBase = 6500;
                        else if (zona.equals("D")) precioBase = 20000;
                        
                        } else if (edad >= 60) {
                            descuento = 0.15;
                        } else {
                            descuento = 0.0;                        
                        }
                        
                intentos++;
                    } while (intentos < 1);

                    precioFinal = precioBase - (precioBase * descuento);

                    
                    
            //03. Resumen de la Compra
            
                 //03.1 Muestra de información en pantalla
                System.out.println("Aqui esta el resumen de tu compra");
                System.out.println("Entrada Seleccionada: " +zona);
                System.out.println("Precio Base: " +precioBase);
                System.out.println("Descuento Aplicado: " + (int)(descuento * 100)+"%");
                System.out.println("Precio Final: " + (int)precioFinal+"\n");
                
                } else if (opcion==2) {
                    continuar = false;
                System.out.println("Gracias por comprar tu entrada en nuestro teatro, Nos vemos en la siguiente funcion");
                } else {
                    System.out.println("Opción inválida. Intente nuevamente.\n");
                }
            }
            
            
                //03.2 Para seguir con la compra de entradas
            if (continuar) {
                System.out.print("Desea comprar mas entradas SI/NO");
                String respuesta = scanner.nextLine().toLowerCase();
                if (!respuesta.equals("si")) {
                    continuar = false;
                    System.out.println("Gracias por su compra. Nos Vemos en la Funcion");
                }
            }
        }

        scanner.close();
    }
}
