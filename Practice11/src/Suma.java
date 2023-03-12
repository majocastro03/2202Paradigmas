public class Suma {
	private int v1;
	private int v2;
	private int resultado;
	//constructor
	public Suma(int valor1, int valor2) {
		this.v1 = valor1;
		this.v2 = valor2;
	}
	//metodo
	public void Sumar() {
		resultado = v1 + v2;
	}
	public void Imprimir() {
		Sumar(); //llamar al metodo
		System.out.println("El resultado de la suma es: " + resultado);
	}
}
