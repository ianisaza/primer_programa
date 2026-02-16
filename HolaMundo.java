import java.util.Scanner; 

public class HolaMundo {
    public static void main(String[] args) {
        // crear el Scanner
        Scanner sc = new Scanner(System.in);

        // mostrar un mensaje de bienvenida personalizado
        System.out.println("====== Bienvenido al programa, HOLA MUNDO ======");

        //  pedir al usuario que ingrese su nombre
        System.out.print("ingresa tu nombre: ");
        String nombreUsuario = sc.nextLine();

        // saludo personalizado
        System.out.println("\nHola " + nombreUsuario + ", como estas?");

        // Mostrar información 
        System.out.println("--- ian isaza bermudez ---");
        System.out.println("--- jeronimo toro ---");
        System.out.println("---  juan jose alzate---");
        System.out.println("--- estudiantes de la clase de logica de programacion ---");

        System.out.println("Proyecto: Mi Primer Programa Java");
        
    }
}
