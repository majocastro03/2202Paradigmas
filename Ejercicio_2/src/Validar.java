import java.util.*;
public class Validar {
	
	public int Sumar(ArrayList<Integer> numTarjeta) {
		int sumaDigitos = 0;
		for (Integer integer : numTarjeta) {
			sumaDigitos += integer;
		}
		System.out.println("suma digitos" +sumaDigitos);
		return sumaDigitos;
	}
	
	public int Duplicar(ArrayList<Integer> numTarjeta) {
		for (int ii = 0; ii < numTarjeta.size(); ii++) {
			if ((ii % 2) == 0) {
				int digito = numTarjeta.get(ii);
				digito = digito *2;
				numTarjeta.set(ii, digito);
				if (digito >= 10) {
						int resultado = 0;
						int numero = 0;
						resultado = resultado + digito % 10;
						numero = numero + digito / 10;
						int suma = resultado+ numero;
					numTarjeta.set(ii, suma);
				}
			}
		}
		System.out.println("arraylist duplicado");
		for (Integer integer : numTarjeta) {
			System.out.println(integer);
		}
		int sum = Sumar(numTarjeta);
		int residuo = sum % 10;
		int resta = 10-residuo;
		return resta;
	}
	
	public boolean Validador(ArrayList<Integer> numTarjeta) {
		int a = numTarjeta.size(); //longitud del arrayList
		int digitoVerificacion = numTarjeta.get(a-1); 
		/*Se recorre el arrayList*/
		for (Integer integer : numTarjeta) {
			System.out.println(integer);
		}
		numTarjeta.remove(a-1); // se remueve el digito de verificación
		Collections.reverse(numTarjeta);//se invierte el arrayList
		/*Se recorre el arrayList invertido*/
		System.out.println("arraylist invertido");
		for (Integer integer : numTarjeta) {
			System.out.println(integer);
		}
		int digitoResiduo = Duplicar(numTarjeta);
		if (digitoVerificacion == digitoResiduo) {
			System.out.println(true);
			return true;
			
		}
		System.out.println(false);
		return false;
	}
}
