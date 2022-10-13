
package liconex_g21;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;


public class LICONEX_G21 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       
       //-----menu-----
       int opcion;
       menuPrincipal();
       
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
            
            
            
            //prueba
            
            //-----------------------------
    }
       
    }
    public static void menuPrincipal(){
        System.out.println("        LICENCIAS DE CONDUCIR");
        System.out.println("        Menu Principal");
        System.out.println("    ===============================");
        System.out.println("        1.- Registrar Examen MOTO");
        System.out.println("        2.- Registrar Examen AUTO");
        System.out.println("        3.- Consultas");
        System.out.println("        9.- Cerrar la aplicación");
        System.out.print("        Ingrese una: ");

    }

    
    public static Persona nuevaPersona(){
        Scanner entrada = new Scanner(System.in);
        
        Persona per;
        //persona = new Persona();
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
        
        per = new Persona(dni , fecha , nombre , apellido);
        
        return per;
    }

    public static Moto nuevaMoto(){
        
        Scanner entrada = new Scanner(System.in);
        
         Moto moto;
        
        String patente;
        String marca;
        int cilindrada;
        boolean espejos;
        String esp;
        
        System.out.println("ingresar datos de la moto:");
        System.out.print("  -Patente: ");
        patente = entrada.next();
        System.out.print("  -Marca: ");
        marca = entrada.next();
        System.out.print("  -Cilindrada: ");
        cilindrada = entrada.nextInt();
        
        System.out.print(" -Posee todos los espejos? (s/n): ");
        esp = entrada.next();
        while( !(esp.equals("si")) && !(esp.equals("no")) ){
        System.out.print(" -Posee todos los espejos? (s/n): ");
        esp = entrada.next();
        }
        if(esp.equals("si")){
            espejos = true;
        } else {
                espejos = false;
                }
        
        moto = new Moto( espejos,  patente,  marca, cilindrada);
        
        return moto;
    }
    
    public static CircuitoDePrueba nuevoCircuito(){
        
        Scanner entrada = new Scanner(System.in);
        
        double tiempo;
        int nroFaltas;
        
        System.out.print("- ingrese el tiempo: ");
        tiempo = entrada.nextDouble();
        System.out.print("- ingrese numero de faltas:");
        nroFaltas = entrada.nextInt();
        
        CircuitoDePrueba circuito;
        circuito = new CircuitoDePrueba( tiempo,  nroFaltas);
        
        return circuito;
        
    }
    
    public static ExamenMoto examenMoto(){
        /*Se solicitará el ingreso de los datos de la persona examinada, los datos del vehículo que utilizó y de
        los circuitos que realizó en la prueba. Para simplificar esta etapa inicial de LICONEX, al registrar un
        nuevo examen de moto, se considera que tanto la persona, como la moto, como los circuitos, son
        nuevos y específicos para ese examen.*/
        Scanner entrada = new Scanner(System.in);
        
        ExamenMoto examenMoto;
        
        //----- datos de una nueva persona -----
        Persona per;
        per = nuevaPersona();
        //---------------------------------
        
        
        //----- datos del vehículo -----
       Moto moto;
       moto = nuevaMoto();
        //------------------------------
        
        // ----- circuitos -----
        CircuitoDePrueba circuito1 ;
        CircuitoDePrueba circuito2 ;
        
        System.out.println("-ingrese los datos del primer circuito de prueba:");
        circuito1 = nuevoCircuito();
        System.out.println("-ingrese los datos del segundo circuito de prueba:");
        circuito2 = nuevoCircuito();
        //-------------------------------
        
        // ----- fecha -----
        LocalDate fecha;
        int anio;
        int mes;
        int dia;
        
        System.out.print("    -año:");
        anio = entrada.nextInt();
        System.out.print("    -mes:");
        mes = entrada.nextInt();
        System.out.print("    -dia:");
        dia = entrada.nextInt();
        fecha = LocalDate.of(anio,mes,dia);
        
        // ------------------------------
        
        examenMoto = new ExamenMoto( circuito2,  fecha, per ,  circuito1 , moto );
        
        return examenMoto;
    }

}

    public static ExamenAuto examenAuto(){
    /*Se solicitará el ingreso de los datos de la persona examinada, los datos del vehículo que utilizó y del
    circuito que realizó en la prueba. Para simplificar esta etapa inicial de LICONEX, al registrar un nuevo
    examen de auto, se considera que tanto la persona, como el auto y el circuito, son nuevos y
    específicos para ese examen.examen de auto, se considera que tanto la persona, como el auto y el circuito, son nuevos y
    específicos para ese examen.
    */
    
}