public class Animal {
	private String nombre;
	private String piel;
	private String respiracion;
	private String reproduccion;
	private String habitat;

	// los constructores deben tener el mismo nombre de la clase
	public Animal(String Nombre, String Piel, String Respiracion, String Reproduccion, String Habitat) {
		// los parametros se nombran igual que los atributos de la clase

		this.nombre = Nombre;
		this.piel = Piel;
		this.respiracion = Respiracion;
		this.reproduccion = Reproduccion;
		this.habitat = Habitat;
		// el this es un método constructor para crear objetos de la clase
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPiel() {
		return piel;
	}

	public void setPiel(String piel) {
		this.piel = piel;
	}

	public String getRespiracion() {
		return respiracion;
	}

	public void setRespiracion(String respiracion) {
		this.respiracion = respiracion;
	}

	public String getReproduccion() {
		return reproduccion;
	}

	public void setReproduccion(String reproduccion) {
		this.reproduccion = reproduccion;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	// getters = obtener (retorna algo) ---- setters (necesita parametros y puede
	// darle un nuevo valor)= establecer
	// usados en atributos privados para acceder a ellos

	public String toString() {
		return nombre + "\n" + piel + "\n" + respiracion + "\n" + reproduccion + "\n" + habitat + "\n";
	}
	// toString viene del metodo Object y permite imprimir de manera mas rapida
	// override = sobre escritura de métodos
}