
public class Principal {
	public static void main(String[] args) {
		Inmobiliaria inmobiliaria = new Inmobiliaria();
		inmobiliaria.addApartamento(new Apartamento(50, 3, 2, true, 8, 2));
		inmobiliaria.addApartamento(new Apartamento(60, 4, 3, false, 7, 3));
		inmobiliaria.addCasa(new Casa(50, 3, 2, true, true, true, false, 2));
		inmobiliaria.addCasa(new Casa(70, 4, 3, true, true, false, false, 1));
		inmobiliaria.imprimir();
	}
}
