import java.util.*;

public class Ahorro {
	ArrayList<Integer> arraySemana = new ArrayList<>();
	public void addAhorro(ArrayList<Integer> arraySemana, int valor) {
		arraySemana.add(valor);
	}

	public void calcular(int valorComputador, int ahorroInicial, int primerValor) {
		int valorAhorro = ahorroInicial;
		int valor = 0;
		int suma = 0;
		int suma1 = 0;
		addAhorro(arraySemana, primerValor);
		valor = primerValor;
		while (arraySemana.size() < 7) {
			valor = valor + 1;
			System.out.println("el valor es" +valor);
			addAhorro(arraySemana, valor);
		}
		for (Integer integer : arraySemana) {
			suma += integer;
		}
		valorAhorro += suma;
		System.out.println(valorAhorro);
		
		if (valorAhorro < valorComputador) {
			for (int i = 0; i < 7; i++) {
				int num = arraySemana.get(i) + 1;
				addAhorro(arraySemana, num);
			}
			for (Integer integer : arraySemana) {
				suma1 += integer;
			}
			valorAhorro += suma1;
		}
		System.out.println(valorAhorro);
		int a = arraySemana.size();
		System.out.println(a);
	}
	
}