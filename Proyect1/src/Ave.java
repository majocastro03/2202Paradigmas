public class Ave extends Animal {
	private boolean vuela;

	// atributo siguiente de this.
	// argumento siguiente del =
	public Ave(String Nombre, String Piel, String Respiracion, String Reproduccion, String Habitat, boolean Vuela) {
		super(Nombre, Piel, Respiracion, Reproduccion, Habitat);
		this.vuela = Vuela;
	}

	public boolean isVuela() {
		return vuela;
	}

	public void setVuela(boolean vuela) {
		this.vuela = vuela;
	}

	@Override
	public String toString() {
		return super.toString() + vuela;
	}

}
