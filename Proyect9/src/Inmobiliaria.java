import java.util.ArrayList;


public class Inmobiliaria {
	protected ArrayList<Apartamento> listaApartamentos = new ArrayList<Apartamento>();
	protected Casa listaCasas[] = new Casa[5];
	protected int contador = 0;
	
	public Inmobiliaria() {
		super();
	}
	public void addApartamento(Apartamento apartamento) {
		listaApartamentos.add(apartamento);
		
	}
	public void addCasa(Casa casa) {
		listaCasas[contador] = casa;
		contador++;
	}
	public void imprimir() {
		System.out.println("Apartamentos");
		for (int i = 0; i < listaApartamentos.size(); i++) {
			System.out.println(listaApartamentos.get(i));
		}
		System.out.println("Casas");
		for (int i = 0; i < contador; i++) {
			System.out.println(listaCasas[i]);
		}
	}

	
}
