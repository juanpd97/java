package gesical_g21;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class GESICAL_G21 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //creo una lista para almacenar todos los solistas,bandas,etc
        List <Solista> lista_solistas = new ArrayList(); 
        List <Banda> lista_bandas = new ArrayList(); 
        List <Cancion> lista_canciones = new ArrayList(); 
        List <Disco> lista_discos = new ArrayList(); 
        
        
        int opcion;
        boolean menu = true;
        
        while(menu){
            menuPirncipal();
            opcion = entrada.nextInt();
            switch(opcion){
                case 1:
                    lista_solistas.add(registrarSolista());
                    break;
                case 2: 
                    lista_bandas.add(registrarBanda(lista_solistas));
                    break;
                case 3:
                    lista_canciones.add(registrarCancion());
                    break;
                case 4:
                    lista_discos.add(registrarDisco(lista_solistas,lista_bandas,lista_canciones));
                    break;
                case 5:
                    registroMasivo(lista_solistas,lista_bandas,lista_canciones,lista_discos);
                    break;
                case 6:
                    //consulta();
                    break;
                //prueba de funciones--------------------------- se puede borrar
                case 0:
                    menuPruebas(lista_solistas,lista_bandas,lista_canciones,lista_discos);
                    break;
                //-----------------------------------------------
                case 9:
                    menu = false;
                    break;
                default:
                    System.out.println("opcion invalida.");
                    break;
            }
        }
        
    }
    
    public static void menuPruebas(List lista_solistas,List lista_bandas,List lista_canciones,List lista_discos){
        Scanner entrada = new Scanner(System.in);
         
        int opcion;
        boolean menu = true;
        
        while(menu){
            
        opcion = entrada.nextInt();
        
        switch(opcion){
            case 1:
                mostrarMusicos(lista_solistas);
                break;
            case 2:
                mostrarBanda(lista_bandas);
                break;
            case 3:
                mostrarCanciones(lista_canciones);
                break;
            case 4:
                mostrarDisco(lista_discos);
                break;
            case 0:
                menu = false;
            default:
                break;
        }
        
        }
        
    }
 
    public static void mostrarDisco(List lista_discos){
        
        if(lista_discos.size() == 0){
            System.out.println("No hay discos registrados.");
        }else {
            for(int i=0;i<lista_discos.size(); i++){
                System.out.println("----- Disco " + (i+1) + " -----");
                System.out.println(lista_discos.get(i).toString());
            }
              }
    }
    
    public static void menuPirncipal(){
        System.out.println("  GESICAL - Sistema de GEStión MusICAL");
        System.out.println("        ==========================================");
        System.out.println("            1) Registrar Solista");
        System.out.println("            2) Registrar Banda");
        System.out.println("            3) Registrar Canción");
        System.out.println("            4) Registrar Disco");
        System.out.println("            5) Registro Masivo - Datos de Prueba");
        System.out.println("            6) Consultas");
        System.out.println("            9) Cerrar la aplicación");
        System.out.println("            Ingrese una opción: */");
    }
    
    public static Solista registrarSolista(){
        Scanner entrada = new Scanner(System.in);
        
        Solista solist;
        String nombre,apellido,nacionalidad,genero,discografia,tocainstr;
        int anio;
        Instrumento instrument = null;
        
        
        System.out.print("-nombre:");
        nombre = entrada.next();
        System.out.print("-apellido:");
        apellido = entrada.next();
        System.out.print("-nacionalidad:");
        nacionalidad = entrada.next();
        System.out.print("-genero:");
        genero = entrada.next();
        System.out.print("-discografia:");
        discografia = entrada.next();
        System.out.print("-Año oficial en que se lanzó en la profesión:");
        anio = entrada.nextInt();
        
        
        boolean ciclo = true;
        while(ciclo){
            
        System.out.print("-toca algun instrumento? (si/no): ");
        tocainstr = entrada.next();
        boolean ciclo2=true;
        String opcionInstrumento;
        
        if(tocainstr.equals("si")){
            while(ciclo2){
            System.out.println("-quie instrumento toca? (guitarra/bateria/teclado/bajo)");
            opcionInstrumento = entrada.next();
            
                if(opcionInstrumento.equals("guitarra")){
                    instrument = new Guitarra();
                    ciclo2 = false;
                } else if(opcionInstrumento.equals("bateria")){
                    instrument = new Bateria();
                    ciclo2 = false;
                } else if(opcionInstrumento.equals("teclado")){
                    instrument = new Teclado();
                    ciclo2 = false;
                } else if (opcionInstrumento.equals("bajo")){
                    instrument = new Bajo();
                    ciclo2 = false;
                }
                        }
            ciclo = false;
            
        } else if(tocainstr.equals("no")){
                                    instrument = new Cantante();
                                    ciclo = false;}
                                    }
        
        
        solist = new Solista(nombre,apellido,nacionalidad, instrument,genero,anio, discografia);
        return solist;
    }
    
    public static void mostrarMusicos(List lista_solistas){
        
        if(lista_solistas.size() == 0){
            System.out.println("No hat solistas registrados.");
        }else {
            for(int i=0;i<lista_solistas.size(); i++){
                System.out.println("----- Artista " + (i+1) + " -----");
                System.out.println(lista_solistas.get(i).toString());
            }
              }
    }
    
    public static Banda registrarBanda(List lista_solistas){
        Scanner entrada = new Scanner(System.in);
        
        //declaro los atributos con los que luego voy a crear el objeto banda
        String titulo;
        String genero;
        int anio;
        String discografia;
        List <Solista> integrantes = new ArrayList();
        
        System.out.print("-Nombre de la banda:");
        titulo = entrada.next();
        System.out.print("-Genero: ");
        genero = entrada.next();
        System.out.print("-Año: ");
        anio = entrada.nextInt();
        System.out.print("-Discografia: ");
        discografia = entrada.next();
        
        
        
        
        boolean bucle=true,bucle2 = true; //bucle lo utilizo para poder seguir agregando integrantes
                                         // y bucle2 lo uso por si escriben mal la opcion
        int opcion;
        
        String otroIntegrante;  //lo utilizo para saber si quieren agregar otro integrante
        while(bucle){
            System.out.println("-Agregar integrante:");
            mostrarMusicos(lista_solistas); //muestra la lista de musicos
            System.out.print("  opcion:");
            opcion = entrada.nextInt();
            opcion--;
            integrantes.add((Solista) lista_solistas.get(opcion));
            
            System.out.println("Agregar otro integrante? (si/no)");
            otroIntegrante = entrada.next();
            bucle2=true; 
            while(bucle2){
            if(otroIntegrante.equals("no")){
                bucle = false;
                bucle2 = false;
            } else if(otroIntegrante.equals("si")){
                bucle = true;
                bucle2 = false;
            } else{
                System.out.println("error. Opcion invalida");
                System.out.println("Agregar otro integrante? (si/no)");
                otroIntegrante = entrada.next();
            }
            }
        }
        
        
        Banda nuevaBanda;
        nuevaBanda = new Banda(titulo, genero, anio, discografia,integrantes);
        
        return nuevaBanda;
    }

    public static void mostrarBanda(List lista_bandas){
        
        if(lista_bandas.size() == 0){
            System.out.println("No hay bandasregistrados.");
        }else {
            for(int i=0;i<lista_bandas.size(); i++){
                System.out.println("----- Banda " + (i+1) + " -----");
                System.out.println(lista_bandas.get(i).toString());
            }
              }
    }

    public static Cancion registrarCancion(){
       Scanner entrada = new Scanner(System.in);
       
       int duracion;
       String nombre;
        
        System.out.println("----- Nueva Cancion -----");
        System.out.print("-Nombre: ");
        nombre = entrada.next();
        System.out.print("-Duracion: ");
        duracion = entrada.nextInt();
        
        Cancion nuevaCancion = new Cancion(nombre,duracion);
        return nuevaCancion;
    }

    public static void mostrarCanciones(List lista_canciones){
        
        if(lista_canciones.size() == 0){
            System.out.println("No hay canciones registradas.");
        }else {
            for(int i=0;i<lista_canciones.size(); i++){
                System.out.println("----- Cancion " + (i+1) + " -----");
                System.out.println(lista_canciones.get(i).toString());
            }
              }
    }

    public static Disco registrarDisco(List lista_solistas,List lista_bandas,List lista_canciones){
        /*
        Se solicitará el ingreso de los datos especificados para un disco y, por ende, de las canciones que lo
        componen. El músico (banda o solista) a quien pertenece el disco debe ser alguno de los cargados por
        las opciones 1 o 2. Se le da la libertad al grupo para implementar la sección como considere más
        adecuado.
        */
        Scanner entrada = new Scanner(System.in);    
        int opcion;
        Disco nuevoDisco;
        String titulo;
        int anio;
        List<Cancion> listaCanciones = new ArrayList();
        
        
        System.out.print("-Titulo del disco:");
        titulo = entrada.next();
        System.out.print("-Anio de lanzamiento: ");
        anio = entrada.nextInt();
        

        boolean bucle = true,bucle2;
        String agregarCancion;
        
        while(bucle){
            System.out.println("-Agregar una cancion");
            mostrarCanciones(lista_canciones);
            opcion = entrada.nextInt();
            opcion--;
            
            if(CancionYaPertenece(listaCanciones, (Cancion) lista_canciones.get(opcion))){
            listaCanciones.add((Cancion)lista_canciones.get(opcion));
            
            System.out.print("agregar otra cancion? (si/no): ");
            
            bucle2 = true;
            while(bucle2){
                agregarCancion = entrada.next();
            if(agregarCancion.equals("no")){
                bucle = false;
                bucle2 = false;
            } else if(agregarCancion.equals("si")){
                bucle2 = false;
            } else {
                System.out.println("error");
                    }
            }
            } else{
                System.out.println("la cancion seleccionada ya se encuentra en la lista.");
            }
            
        }
        
        
                boolean bucleDuenio = true;
        String tipoDuenio;
        while(bucleDuenio){
            System.out.println("tipo de duenio (banda/solista)");
            tipoDuenio = entrada.next();
            if(tipoDuenio.equals("banda")){
                mostrarBanda(lista_bandas);
                System.out.print("  opcion: ");
                opcion = entrada.nextInt();
                opcion--;
                Banda duenio = (Banda)lista_bandas.get(opcion);
                return nuevoDisco = new Disco(anio,titulo,listaCanciones, duenio);
            } else if(tipoDuenio.equals("solista")){
                mostrarMusicos(lista_solistas);
                System.out.print("  opcion: ");
                opcion = entrada.nextInt();
                opcion--;
                Solista duenio = (Solista)lista_solistas.get(opcion);
                return nuevoDisco = new Disco(anio,titulo,listaCanciones, duenio);
            } else{
                System.out.println("Error.");
            }
        }
        
        
        nuevoDisco = new Disco();
        return nuevoDisco;
        
    }
    
    public static boolean CancionYaPertenece(List listaCanciones,Cancion unaCancion){
        
        for(int i=0;i<listaCanciones.size();i++){
            if( ( ((Cancion)listaCanciones.get(i)).getNombre() == unaCancion.getNombre() ) && ( ((Cancion)listaCanciones.get(i)).getDuracion() == unaCancion.getDuracion() ) ){
                return false;
            }
        }
        
            return true;
    }
    
    public static void registroMasivo(List lista_solistas,List lista_bandas,List lista_canciones,List lista_discos){
        Scanner entrada = new Scanner(System.in);    
        
        Solista nuevoSolista;
        String nombre,apellido,nacionalidad,genero,discografia;
        int anio;
        Instrumento instrument = null;
         
        nombre = "Michael Joseph";
        apellido = "Jackson";
        nacionalidad = "Estadounidense";
        genero = "pop";
        discografia = "Sony Music";
        anio = 1964;
        instrument = new Cantante();
    
        nuevoSolista = new Solista(nombre,apellido,nacionalidad,instrument,genero,anio,discografia);
        lista_solistas.add(nuevoSolista);
        
        //solista 2
        
        nombre = "Phillip David Charles";
        apellido = "Collins";
        nacionalidad = "Británica";
        genero = "Rock";
        discografia = "Virgin";
        anio = 1968;
        instrument = new Cantante();
    
        nuevoSolista = new Solista(nombre,apellido,nacionalidad,instrument,genero,anio,discografia);
        lista_solistas.add(nuevoSolista);
        
        
        //solista 3
        
        nombre = "Peter Brian";
        apellido = "Gabriel";
        nacionalidad = "Británica";
        genero = "Rock";
        discografia = "Real World Records";
        anio = 1967;
        instrument = new Guitarra();
    
        nuevoSolista = new Solista(nombre,apellido,nacionalidad,instrument,genero,anio,discografia);
        lista_solistas.add(nuevoSolista);
        
        
        //solista 4
                 
        nombre = "Elton";
        apellido = "John";
        nacionalidad = "Británica";
        genero = "Rock";
        discografia = "Universal Records";
        anio = 1962;
        instrument = new Teclado();
    
        nuevoSolista = new Solista(nombre,apellido,nacionalidad,instrument,genero,anio,discografia);
        lista_solistas.add(nuevoSolista);
        
        
        //solista 5
        
        nombre = "Rodolfo";
        apellido = "Páez";
        nacionalidad = "Argentina";
        genero = "Rock";
        discografia = "Sony Music";
        anio = 1979;
        instrument = new Cantante();
    
        nuevoSolista = new Solista(nombre,apellido,nacionalidad,instrument,genero,anio,discografia);
        lista_solistas.add(nuevoSolista);
        
        
        //solista 6
        
        nombre = "Gustavo Adrián";
        apellido = "Cerati";
        nacionalidad = "Argentina";
        genero = "Rock";
        discografia = "Sony Music";
        anio = 1981;
        instrument = new Teclado();
    
        nuevoSolista = new Solista(nombre,apellido,nacionalidad,instrument,genero,anio,discografia);
        lista_solistas.add(nuevoSolista);
        
        
        //solista 7
        
        nombre = "Valentín";
        apellido = "Oliva";
        nacionalidad = "Argentina";
        genero = "Hip hop";
        discografia = "Doguito records";
        anio = 2012;
        instrument = new Guitarra();
    
        nuevoSolista = new Solista(nombre,apellido,nacionalidad,instrument,genero,anio,discografia);
        lista_solistas.add(nuevoSolista);
        
        
        //solista 8
        nombre = "Edward Christopher";
        apellido = "Sheeran";
        nacionalidad = "Británica";
        genero = "pop";
        discografia = "Real World Records";
        anio = 2005;
        instrument = new Guitarra();
    
        nuevoSolista = new Solista(nombre,apellido,nacionalidad,instrument,genero,anio,discografia);
        lista_solistas.add(nuevoSolista);
        
        //solista 9
       
        nombre = "Dua";
        apellido = "Lipa";
        nacionalidad = "Albania";
        genero = "pop";
        discografia = "Sony Music";
        anio = 2014;
        instrument = new Cantante();
    
        nuevoSolista = new Solista(nombre,apellido,nacionalidad,instrument,genero,anio,discografia);
        lista_solistas.add(nuevoSolista);
        
        
        //solista 10
        
        nombre = "Édgar Ricardo";
        apellido = "Arjona";
        nacionalidad = "Guatemalteca";
        genero = "Rock";
        discografia = "Virgin";
        anio = 1984;
        instrument = new Cantante();
    
        nuevoSolista = new Solista(nombre,apellido,nacionalidad,instrument,genero,anio,discografia);
        lista_solistas.add(nuevoSolista);
        
        //---------------- Bandas ----------------------------
        Banda nuevaBanda;
        String titulo;
        List <Solista> integrantes = new ArrayList();
        
        //banda 1
        titulo = "Genesis";
        genero = "Rock";
        anio = 1967;
        discografia = "Virgin";
        
        integrantes.add((Solista) lista_solistas.get(1));
        integrantes.add((Solista) lista_solistas.get(2));
        
        nuevaBanda = new Banda(titulo,genero,anio,discografia,integrantes);
        lista_bandas.add(nuevaBanda);
        //banda 2
        titulo = "la mezcla";
        genero = "pop";
        anio = 2000;
        discografia = "Sony Music";
        
        integrantes.clear();
        integrantes.add((Solista) lista_solistas.get(0));
        integrantes.add((Solista) lista_solistas.get(5));
        integrantes.add((Solista) lista_solistas.get(9));
        
        nuevaBanda = new Banda(titulo,genero,anio,discografia,integrantes);
        lista_bandas.add(nuevaBanda);
        
        //----------------------- Canciones -----------------------
        
        Cancion nuevaCancion;
        int duracion;
        
        //cancion 1
        nombre = "invisible touch";
        duracion = 246;
        
        nuevaCancion = new Cancion(nombre,duracion);
        lista_canciones.add(nuevaCancion);
        
        //cancion 2
        nombre = "I Can’t Dance";
        duracion = 290;
        
        nuevaCancion = new Cancion(nombre,duracion);
        lista_canciones.add(nuevaCancion);
        
        //cancion 3
        nombre = "That's All";
        duracion = 263;
        
        nuevaCancion = new Cancion(nombre,duracion);
        lista_canciones.add(nuevaCancion);
        
        //cancion 4
        nombre = "Follow You Follow Me";
        duracion = 239;
        
        nuevaCancion = new Cancion(nombre,duracion);
        lista_canciones.add(nuevaCancion);
        
        //cancion 5
        nombre = "Land Of Confusion";
        duracion = 329;
        
        nuevaCancion = new Cancion(nombre,duracion);
        lista_canciones.add(nuevaCancion);
        
        //cancion 6
        nombre = "Perfect";
        duracion = 280;
        
        nuevaCancion = new Cancion(nombre,duracion);
        lista_canciones.add(nuevaCancion);
        
        //cancion 7
        nombre = "Photograph";
        duracion = 275;
        
        nuevaCancion = new Cancion(nombre,duracion);
        lista_canciones.add(nuevaCancion);
        
        //cancion 8
        nombre = "Castle On The Hill";
        duracion = 288;
        
        nuevaCancion = new Cancion(nombre,duracion);
        lista_canciones.add(nuevaCancion);
        
        //cancion 9
        nombre = "Cactus";
        duracion = 235;
        
        nuevaCancion = new Cancion(nombre,duracion);
        lista_canciones.add(nuevaCancion);
        
        //cancion 10
        nombre = "deja vu";
        duracion = 202;
        
        nuevaCancion = new Cancion(nombre,duracion);
        lista_canciones.add(nuevaCancion);
        
        //cancion 11
        nombre = "adios";
        duracion = 236;
        
        nuevaCancion = new Cancion(nombre,duracion);
        lista_canciones.add(nuevaCancion);
        
        //cancion 12
        nombre = "Rocket Man";
        duracion = 283;
        
        nuevaCancion = new Cancion(nombre,duracion);
        lista_canciones.add(nuevaCancion);
        
        //cancion 13
        nombre = "Tiny Dancer";
        duracion = 407;
        
        nuevaCancion = new Cancion(nombre,duracion);
        lista_canciones.add(nuevaCancion);
        
        //cancion 14
        nombre = "Im Still standing";
        duracion = 198;
        
        nuevaCancion = new Cancion(nombre,duracion);
        lista_canciones.add(nuevaCancion);
        
        //cancion 15
        nombre = "billie jean";
        duracion = 296;
        
        nuevaCancion = new Cancion(nombre,duracion);
        lista_canciones.add(nuevaCancion);
        
        //cancion 16
        nombre = "beat it";
        duracion = 299;
        
        nuevaCancion = new Cancion(nombre,duracion);
        lista_canciones.add(nuevaCancion);
        
        //cancion 17
        nombre = "chicago";
        duracion = 248;
        
        nuevaCancion = new Cancion(nombre,duracion);
        lista_canciones.add(nuevaCancion);
        
        //cancion 18
        nombre = "smooth criminal";
        duracion = 566;
        
        nuevaCancion = new Cancion(nombre,duracion);
        lista_canciones.add(nuevaCancion);
        
        //cancion 19
        nombre = "bohemian rhapsody";
        duracion = 360;
        
        nuevaCancion = new Cancion(nombre,duracion);
        lista_canciones.add(nuevaCancion);
        
        //cancion 20
        nombre = "dont stop me now";
        duracion = 211;
        
        nuevaCancion = new Cancion(nombre,duracion);
        lista_canciones.add(nuevaCancion);
        
        //--------------- Discos -------------------
    }
    
}