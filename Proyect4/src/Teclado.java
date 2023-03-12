import java.util.Scanner;
public class Teclado {
    public static void main(String[] args) {
        System.out.println("Bienvenido");
        Scanner leer = new Scanner(System.in);
        String nombre = "";
        System.out.println("Introduzca su nombre");
        nombre = leer.nextLine();
        System.out.println("Mi nombre es: "+ nombre);
        leer.close();
    }
}
