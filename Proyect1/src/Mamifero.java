// el constructor de una clase debe siempre invocar primero al de su superclase
public class Mamifero extends Animal {
	private boolean terrestre;

	// los constructores no se heredan
	public Mamifero(String Nombre, String Piel, String Respiracion, String Reproduccion, String Habitat,
			boolean Terrestre) {
		super(Nombre, Piel, Respiracion, Reproduccion, Habitat);
		// super es para llamar el constructor de la super clase
		this.terrestre = Terrestre;
	}

	// con atributos booleanos no se utiliza "get" si no "is"
	public boolean isTerrestre() {
		return terrestre;
	}

	public void setTerrestre(boolean terrestre) {
		this.terrestre = terrestre;
	}

	public String toString() {
		if (terrestre) {
			return "Es un mamifero terrestre " + super.toString();
		} else {
			return "No es un mamifero terrestre " + super.toString();
		}
	}
}
