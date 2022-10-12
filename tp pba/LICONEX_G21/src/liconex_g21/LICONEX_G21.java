
package liconex_g21;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;


public class LICONEX_G21 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       
       //-----menu-----
       menu();
       
       
    }
    public static void menu(){
        Scanner entrada = new Scanner(System.in);
        int opcion;
        
        System.out.println("        LICENCIAS DE CONDUCIR");
        System.out.println("        Menu Principal");
        System.out.println("    ===============================");
        System.out.println("        1.- Registrar Examen MOTO");
        System.out.println("        2.- Registrar Examen AUTO");
        System.out.println("        3.- Consultas");
        System.out.println("        9.- Cerrar la aplicación");
        System.out.print("        Ingrese una: ");
        
       opcion = entrada.nextInt();
       
       switch(opcion){
        case 1:
            examenMoto();
            break;
        case 2:
            break;
        case 3:
            break;
        case 9:
            break;
        default:
            System.out.println("error");
    }
    
    }

    public static void examenMoto(){
        /*Se solicitará el ingreso de los datos de la persona examinada, los datos del vehículo que utilizó y de
        los circuitos que realizó en la prueba. Para simplificar esta etapa inicial de LICONEX, al registrar un
        nuevo examen de moto, se considera que tanto la persona, como la moto, como los circuitos, son
        nuevos y específicos para ese examen.*/
        Scanner entrada = new Scanner(System.in);
        
        
        Persona persona;
        int dni;
        String nombre;
        String apellido;
        LocalDate fecha;
        int anio;
        int mes;
        int dia;
        
        System.out.println("ingresar datos de la persona:");
        System.out.print("- dni:");
        dni = entrada.nextInt();
        System.out.print("- Nombre:");
        nombre = entrada.next();
        System.out.print("- Apellido:");
        apellido = entrada.next();
        
        System.out.println("- Fecha de nacimiento:");
        System.out.print("    -año:");
        anio = entrada.nextInt();
        System.out.print("    -mes:");
        mes = entrada.nextInt();
        System.out.print("    -dia:");
        dia = entrada.nextInt();
        fecha = LocalDate.of(anio,mes,dia);
        
    }

}
