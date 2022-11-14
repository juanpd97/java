
package liconex_g21;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;


public class LICONEX_G21 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       
        //inicializo un arreglo del objeto examen para poder almacenar los examenes de auto/moto
        Examen examenes[] = new Examen[100];
        
        int contador = 0; //utilizo esta variable para saber en que posicion guarde mi ultimo examen y no sobreescribirlo
        
       //----------menu----------
       int opcion;
       boolean bucle = true;
       
       while(bucle){
       imprimirMenuPrincipal();
       opcion = entrada.nextInt();
       
       switch(opcion){
        case 1: //inicializao un examen de moto y lo guardo en la posicion (contador) del arreglo de examenes
        examenes[contador] = examenMoto();
        contador++;
            break;
            
        case 2: //inicializao un examen de auto y lo guardo en la posicion (contador) del arreglo de examenes
        examenes[contador] = examenAuto();
        contador++;
            break;
            
        case 3: //abro el menu de consultas
            menuConsultas(examenes,contador);
            break;
            
        case 9: //cierro el bucle while y termino el programa
            System.out.println("¿desea salir? (s/n)");
            String variable_salida;
            variable_salida = entrada.next();
            if(variable_salida.equals("s")){
            bucle = false;}
            break;
            
        default:
            System.out.println("opcion invalida");
            

       }}
        // ---------------------------
    
    }
    
    public static void imprimirMenuPrincipal(){
        System.out.println("        LICENCIAS DE CONDUCIR");
        System.out.println("        Menu Principal");
        System.out.println("    ===============================");
        System.out.println("        1.- Registrar Examen MOTO");
        System.out.println("        2.- Registrar Examen AUTO");
        System.out.println("        3.- Consultas");
        System.out.println("        9.- Cerrar la aplicación");
        System.out.print("        Ingrese una: ");

    }
   
    public static void imprimirMenuConsulta(){
        System.out.println("        LICENCIAS DE CONDUCIR");
        System.out.println("        Menu Principal");
        System.out.println("    ===============================");
        System.out.println("        1.- Examen por DNI");
        System.out.println("        2.- Exámenes de moto por FECHA");
        System.out.println("        3.- Exámenes de auto por FECHA");
        System.out.println("        4.- <Consulta Opcional>");
        System.out.println("        9.- Volver al menú anterior");
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
        entrada.nextLine();
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
        entrada.nextLine();
        System.out.print("  -Marca: ");
        marca = entrada.next();
        System.out.print("  -Cilindrada: ");
        cilindrada = entrada.nextInt();
        
        System.out.print(" -Posee todos los espejos? (si/no): ");
        esp = entrada.next();
        while( !(esp.equals("si")) && !(esp.equals("no")) ){
        System.out.print(" -Posee todos los espejos? (si/no): ");
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
    
    public static Auto nuevoAuto(){
        
        Scanner entrada = new Scanner(System.in);
        
         Auto auto;
        
        String patente;
        String marca;
        int cilindrada;
        int cantPuertas;
        
        System.out.println("ingresar datos del auto:");
        System.out.print("  -Patente: ");
        patente = entrada.next();
        System.out.print("  -Marca: ");
        marca = entrada.next();
        System.out.print("  -Cilindrada: ");
        cilindrada = entrada.nextInt();
        
        System.out.print("  -Cantidad de puertas: ");
        cantPuertas = entrada.nextInt();
        
        auto = new Auto(cantPuertas ,  patente,  marca,  cilindrada);
        
        return auto;
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
        
        System.out.println("- ingresar fecha de examen:");
        
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
    
    public static ExamenAuto examenAuto(){
    /*Se solicitará el ingreso de los datos de la persona examinada, los datos del vehículo que utilizó y del
    circuito que realizó en la prueba. Para simplificar esta etapa inicial de LICONEX, al registrar un nuevo
    examen de auto, se considera que tanto la persona, como el auto y el circuito, son nuevos y
    específicos para ese examen.examen de auto, se considera que tanto la persona, como el auto y el circuito, son nuevos y
    específicos para ese examen.
    */
            Scanner entrada = new Scanner(System.in);
        
        ExamenAuto examenAuto;
        
        //----- datos de una nueva persona -----
        Persona per;
        per = nuevaPersona();
        //---------------------------------
        
        
        //----- datos del vehículo -----
       Auto auto;
       auto = nuevoAuto();
        //------------------------------
        
        // ----- circuitos -----
        CircuitoDePrueba circuito ;
        
        System.out.println("-ingrese los datos del circuito de prueba:");
        circuito = nuevoCircuito();

        //-------------------------------
        
        // ----- fecha -----
        System.out.println("- ingresar fecha de examen:");
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
        
        examenAuto = new ExamenAuto( fecha, per,  circuito,  auto);
        
        return examenAuto;
    }
        
    public static void menuConsultas(Examen examenes[],int contador){

        
        Scanner entrada = new Scanner(System.in);
        boolean bucle_menu_consulta = true;
        int op;
        
        while(bucle_menu_consulta){
            imprimirMenuConsulta();
            op = entrada.nextInt();
            switch(op){
                case 1: //Examen por DNI
                    examenporDNI(examenes,contador);
                    break;
                case 2: //Examen de moto por FECHA
                    ExamenMotoPorFECHA(examenes,contador);
                    break;
                case 3: //Examen de auto por FECHA
                    ExamenAutoPorFECHA(examenes,contador);
                    break;
                case 4: 
                    System.out.println("error");
                    break;
                case 9:
                    bucle_menu_consulta = false;
                    break;
            }
        }
    }
     
    public static void ExamenMotoPorFECHA(Examen examenes[],int contador){
        Scanner entrada = new Scanner(System.in);
        
        boolean hayExamenes = true;
        int anio,mes,dia;
        System.out.println("ingrese una fecha:");
        System.out.print("    - año:");
        anio = entrada.nextInt();
        System.out.print("    - mes:");
        mes = entrada.nextInt();
        System.out.print("    - dia:");
        dia = entrada.nextInt();
        
        LocalDate fech = LocalDate.of(anio,mes,dia);
        
        
        
        for(int i = 0 ; i<contador ; i++){
            if(examenes[i].getClass() == ExamenMoto.class){
                if(examenes[i].getFecha().compareTo(fech) == 0){
                    //-------
                    String est;
                    int faltasTotal;
                    double tiempoTotal;
                    tiempoTotal = examenes[i].getC().getTiempo() + examenes[i].getC2().getTiempo();
                    faltasTotal = examenes[i].getC2().getNroDeFaltas() + examenes[i].getC().getNroDeFaltas();
                    if( (faltasTotal<5) && ( (tiempoTotal/2)<1200) ){
                    est = "EXAMEN APROBADO";
                    } else{
                            est="EXAMEN DESAPROBADO";
                            }
                    //--------
                    System.out.println("-Dni: "+ examenes[i].getP().getDni() + "--- estado: " + est );
                    hayExamenes = false;
                }
            }
        }
        if(hayExamenes){
            System.out.println("no se registraron examen en el dia");
        }
    }
    
    public static void examenporDNI(Examen examenes[],int contador){
        Scanner entrada = new Scanner(System.in);
        
        int dniBuscar;// dni que tengo que buscar
        boolean rindioExamen = true;
        System.out.println("Ingrese el dni de la persona que desea buscar:");
        dniBuscar = entrada.nextInt();
        
        
        for(int i=0 ; i < contador ; i++){
            if(dniBuscar == examenes[i].getP().getDni()){
                rindioExamen = false;
                imprimirDatos(examenes,i);
            }
        }
        if(rindioExamen){
            System.out.println("Ninguna persona con el DNI ingresado ha rendido examen alguno en Villa Pehuenia");
        }
        
    }

    public static void imprimirDatos(Examen examenes[],int posicion){
        /*
        esta funcion visualizará por pantalla apellido, nombres y
        dni de la persona correspondiente y los datos del examen realizado tiempo y faltas del/los
        circuito/s y resultado (aprobado o no) del examen.
        */

        
        
        int faltasTotal = 0;
        double tiempoTotal = 0;
        if( examenes[posicion].getClass() == ExamenAuto.class ){
            
        System.out.println("--- datos de examen ---");
        System.out.println("-vehiculo: auto");
        System.out.println("-Alumno");
        System.out.println("    -Nombre:" + examenes[posicion].getP().getNombre());
        System.out.println("    -Apellido:" + examenes[posicion].getP().getApellido());
        System.out.println("    -Dni:" + examenes[posicion].getP().getDni());
        System.out.println("");
        System.out.println("-Datos");
        
        
        faltasTotal = examenes[posicion].getC().getNroDeFaltas();
        System.out.println("    -tiempo:" + examenes[posicion].getC().getTiempo());
        System.out.println("    -faltas: " + faltasTotal);
                
        if( (faltasTotal<3) && ( tiempoTotal<1800) ){
                System.out.println("EXAMEN APROBADO");
            } else{
                System.out.println("EXAMEN DESAPROBADO");
                    }
        }
        
        
        
        if( examenes[posicion].getClass() == ExamenMoto.class ){
            
        System.out.println("--- datos de examen ---");
        System.out.println("-vehiculo: moto");
        System.out.println("-Alumno");
        System.out.println("    -Nombre:" + examenes[posicion].getP().getNombre());
        System.out.println("    -Apellido:" + examenes[posicion].getP().getApellido());
        System.out.println("    -Dni:" + examenes[posicion].getP().getDni());
        System.out.println("");
        System.out.println("-Datos");
        
            
            System.out.println("- Circuito 1 -");
            System.out.println("    -tiempo:" + examenes[posicion].getC().getTiempo());
            System.out.println("    -faltas circuito 1: " + examenes[posicion].getC().getNroDeFaltas());
            System.out.println("- Circuito 2 -");
            System.out.println("    -tiempo:" + examenes[posicion].getC2().getTiempo());
            System.out.println("    -faltas circuito 2: " + examenes[posicion].getC2().getNroDeFaltas());
            tiempoTotal = examenes[posicion].getC().getTiempo() + examenes[posicion].getC2().getTiempo();
            faltasTotal = examenes[posicion].getC2().getNroDeFaltas() + examenes[posicion].getC().getNroDeFaltas();
            System.out.println("-faltas totales:" + faltasTotal);
            
            if( (faltasTotal<5) && ( (tiempoTotal/2)<1200) ){
                System.out.println("EXAMEN APROBADO");
            } else{
                System.out.println("EXAMEN DESAPROBADO");
                    }
        }
        
        
    }

    public static void ExamenAutoPorFECHA(Examen examenes[],int contador){
        Scanner entrada = new Scanner(System.in);
        
        boolean hayExamenes = true;
        int anio,mes,dia;
        System.out.println("ingrese una fecha:");
        System.out.print("    - año:");
        anio = entrada.nextInt();
        System.out.print("    - mes:");
        mes = entrada.nextInt();
        System.out.print("    - dia:");
        dia = entrada.nextInt();
        
        LocalDate fech = LocalDate.of(anio,mes,dia);
        
        
        
        for(int i = 0 ; i<contador ; i++){
            if(examenes[i].getClass() == ExamenAuto.class){
                if(examenes[i].getFecha().compareTo(fech) == 0){
                    //-------
                    String est;
                    int faltasTotal;
                    double tiempoTotal;
                    tiempoTotal = examenes[i].getC().getTiempo();
                    faltasTotal = examenes[i].getC().getNroDeFaltas();
                    if( (faltasTotal<3) && ( tiempoTotal<1800) ){
                    est = "EXAMEN APROBADO";
                    } else{
                            est="EXAMEN DESAPROBADO";
                            }
                    //--------
                    System.out.println("-Dni: "+ examenes[i].getP().getDni() + "--- estado: " + est );
                    hayExamenes = false;
                }
            }
        }
        if(hayExamenes){
            System.out.println("no se registraron examen en el dia");
        }
    }
}

