
package unidad1;

import java.util.Scanner;

public class Aplicacion {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        boolean espejos;
        String esp;
        
        System.out.print(" -Posee todos los espejos? (s/n): ");
        esp = entrada.next();
        
        while( !(esp.equals("si")) && !(esp.equals("no")) ){
        System.out.print(" -Posee todos los espejos? (s/n): ");
        esp = entrada.next();
        }
        
        if(esp.equals("si")){
            espejos = true;
        } else {
                espejos = false;}
        
        
        System.out.println("------------- prueba -------------------");
        
        System.out.println("espejos: " + espejos);
    }
    
}
