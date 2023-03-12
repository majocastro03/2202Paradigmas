public class Reptil extends Animal {
	private boolean patas;

	public Reptil(String Nombre, String Piel, String Respiracion, String Reproduccion, String Habitat, boolean Patas) {
		super(Nombre, Piel, Respiracion, Reproduccion, Habitat);
		this.patas = Patas;
	}

	public boolean isPatas() {
		return patas;
	}

	public void setPatas(boolean patas) {
		this.patas = patas;
	}
}
