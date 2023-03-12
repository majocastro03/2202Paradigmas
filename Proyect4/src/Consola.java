import java.util.Scanner;
public class Consola{
    public static void main(String args[]) {
        Scanner sn = new Scanner(System.in);
        int opcion = 0;

            System.out.println("Opcion 1");
            System.out.println("Opcion 2");
            System.out.println("Opcion 3");

            System.out.println("Escribe una de las opciones: ");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Opcion 1");
                    break;
                case 2:
                    System.out.println("Opcion 2");
                    break;
                case 3:
                    System.out.println("Opcion 3");
                    break;

                default:
                    System.out.println("pulse bien idiota:)");
                    break;
            }
            sn.close();
            }
        }