
package password;

import java.util.Scanner;

public class GestionPassword {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese cantidad de contrasenias");
        int N = entrada.nextInt();
        entrada.nextLine();
        
        Password array[] = new Password[N];
        String contrasenia;

        System.out.println("Ingrese longitud mínima de contrasenias");
        int longitudValida = entrada.nextInt();
        entrada.nextLine();

        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese su contrasenia: ");
            contrasenia = entrada.nextLine();
            while (contrasenia.length() < longitudValida) {
                System.out.println("[ Longitud de contrasenia no válida, vuelva a ingresar ]");
                contrasenia = entrada.nextLine();
            }
            array[i] = new Password(contrasenia);
            if (array[i].esFuerte()) {
                System.out.println("La password es fuerte.");
            } else {
                System.out.println("La password NO es fuerte.");
            }
        }
    }
    
}
