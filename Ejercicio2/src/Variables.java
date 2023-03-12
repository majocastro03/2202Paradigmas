import java.util.Scanner;
public class Variables extends Persona{
	static final String nombre = "";
	static final int edad = 0, DNI = 0, sexo = 0, peso = 0, altura = 0;
	public void pedirVariables(String nombre, int edad, int DNI, int sexo, int peso,double altura) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Por favor ingrese su nombre: ");
		nombre = leer.nextLine();
		System.out.println("Por favor ingrese su edad ");
		edad = leer.nextInt();
		System.out.println("Por favor ingrese su DNI ");
		DNI = leer.nextInt();
		System.out.println("Por favor ingrese su sexo (1 si femenino. 2 si es masculino ");
		sexo = leer.nextInt();
		System.out.println("Por favor ingrese su peso en kilos ");
		peso = leer.nextInt();
		System.out.println("Por favor ingrese su altura en cm ");
		altura = leer.nextDouble();
		leer.close();
	}
}
