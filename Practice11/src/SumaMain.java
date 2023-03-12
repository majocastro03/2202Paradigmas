//solicitar datos e imprimir
import java.util.Scanner;
public class SumaMain {
	public static void main(String args[]){
		Scanner leer = new Scanner(System.in);
		System.out.println("Primer valor: ");
		int valor1 = leer.nextInt();
		System.out.println("Segundo valor: ");
		int valor2 = leer.nextInt();
		
		Suma valores = new Suma(valor1, valor2);
		//objeto que se va a comunicar con la clase Suma
		
		valores.Imprimir();
		leer.close();
	}
}
//private es para solo ser utilizada la variable en la clase que pertenece
//la instancia de clases es cuando dos clases interactuan entre si
