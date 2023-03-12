public class Persona {
	public static void main(String[] args) {
		String nombre = "";
		int edad = 0, DNI = 0, sexo = 0, pesoIdeal =0 , peso = 0;
		double altura = 0;
		Variables pedir = new Variables();
		pedir.pedirVariables(nombre, edad, DNI, sexo, peso, altura);
		Person kilos = new Person();
		kilos.calcularMc(nombre, edad, DNI, sexo, peso, altura,pesoIdeal);
}
}
