public class Anfibio extends Animal {
	// cuando se usa el extends se debe crear el constructor y asignar el super
	private String colorPiel; // para que el atributo privado no tenga error es nencesario usar los getters and setters

	public Anfibio(String Nombre, String Piel, String Respiracion, String Reproduccion, String Habitat,
			String colorDePiel) {
		super(Nombre, Piel, Respiracion, Reproduccion, Habitat);
		this.colorPiel = colorDePiel;
	}

	public String getColorPiel() {
		return colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	@Override
	public String toString() {
		return super.toString() + colorPiel;
	}
}
