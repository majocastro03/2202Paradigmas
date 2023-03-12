public class SuperAnimals {
	// en el metodo main es donde se crean las instancias, es decir los objetos
	public static void main(String[] args) {
		Anfibio sapo = new Anfibio("Sapo", "Desnuda", "Pulmones", "Oviparo", "Acuatico", "cafe");
		Ave condor = new Ave("Condor", "Plumas", "Pulmones", "Oviparo", "Tierra", false);
		// Animal animalito = new Animal("A","B","C", "D", "E");
		// imprimir los atributos de los animales
		System.out.println(sapo.toString());
		System.out.println(condor.toString());
		// Animal zoologico[] = {new Animal("5","4","3", "2", "1"),
		// new Animal("9","8","7", "6", "5")};
		Animal zoologico[] = { new Anfibio("Triton", "Carrasposa", "Pulmones", "Oviparo", "Bosque", "ksdas"),
				new Ave("Guacamaya", "Plumas", "Pulmones", "Oviparos", "Aire", true),
				new Reptil("Cobra", "Calva", "Pulmones", "Fecundacion interna", "Terreste", true) };
		for (int iii = 0; iii < zoologico.length; iii++) {
			System.out.println(zoologico[iii]);
		}

		// imprimir longitud del arreglo ---> System.out.println(zoologico.length);

	}
}
// crear instancias!!!!
