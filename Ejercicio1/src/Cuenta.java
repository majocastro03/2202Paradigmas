import java.util.Scanner;
public class Cuenta extends CodCuenta{
	Scanner leer = new Scanner(System.in);
	public String getTitular(String titular) {
		return titular;
	}
	public double getCantidad(double cantidad[]) {
		return cantidad[1];
	}
	
	public String control(String titular) {
		System.out.println("Ingrese el nombre del titular de la cuenta: ");
		titular = leer.nextLine();
		return titular;
	}
	
	public boolean ingresar(double cantidad[]) {
		System.out.println("Ingrese la cantidad de dinero que desea ingresar: ");
		cantidad[0] = leer.nextInt();
		if(cantidad[0] < 0){
			System.out.println("No hacer nada");
			return false;
		}
		return true;
	}
	public double retirar(double cantidad[]) {
		System.out.println("Ingrese la cantidad que desea retirar: ");
		cantidad[1] = leer.nextInt();
		if(cantidad[0]>cantidad[1]){
			System.out.println("puedes retirar :)");
		}else {
			if(cantidad[0]==cantidad[1]) {
				cantidad[0] = 0;
				System.out.println("Cuenta en 0 ");
			}
		}
		return cantidad[1];
	}
}
