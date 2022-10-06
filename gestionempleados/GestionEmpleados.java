package unidad1.gestionempleados;

public class GestionEmpleados {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Fernando", "Ureña", 23, 45000);
        Empleado empleado2 = new Empleado("Adrián", "Lopez");
        
        empleado2.setEdad(50);
        empleado2.setSalario(70000);
        
        //Intentamos darle el plus al empleado1
        empleado1.plus(5000);
        
        //Mostramos el valor actual del salario del empleado1
        System.out.println("El salario del empleado1 es: " + empleado1.getSalario());

        //Modificamos la edad del empleado1
        empleado1.setEdad(43);

        empleado1.plus(5000);

        //Mostramos el salario de nuevo, ahora tendra 5000 mas
        System.out.println("El salario actual del empleado1 es: " + empleado1.getSalario());
    }

}
