public class Pez extends Animal {
	private boolean nadar;
	private int ojos;

	public Pez(String Nombre, String Piel, String Respiracion, String Reproduccion, String Habitat, boolean Nadar,
			int Ojos) {
		super(Nombre, Piel, Respiracion, Reproduccion, Habitat);
		this.nadar = Nadar;
		this.ojos = Ojos;
	}

	public boolean isNadar() {
		return nadar;
	}

	public void setNadar(boolean nadar) {
		this.nadar = nadar;
	}

	public int getOjos() {
		return ojos;
	}

	public void setOjos(int ojos) {
		this.ojos = ojos;
	}

	@Override
	public String toString() {
		return "Este pez tiene la capacidad de nadar =  " + nadar + " La cantidad de ojos del pez es: " + ojos + "]";
	}

}
