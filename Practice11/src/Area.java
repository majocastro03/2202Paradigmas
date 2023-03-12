import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Valor de la base: ");
        int base = leer.nextInt();
        System.out.println("Valor de la altura: ");
        int altura = leer.nextInt();
        leer.close();
        Rectangulo mensajero = new Rectangulo(base, altura);
        mensajero.mostrar();
    }
}
