
public class Inmueble {
	protected double areaConstruida;
	protected int habitaciones;
	protected int banos;
	protected int valorAlquiler;
	protected boolean cocina;
	protected boolean conjuntoCerrado;
	protected boolean alquilado;
	protected String direccion;
	
	
	public Inmueble(double areaConstruida, int habitaciones, int banos, boolean cocina) {
		super();
		this.areaConstruida = areaConstruida;
		this.habitaciones = habitaciones;
		this.banos = banos;
		this.cocina = cocina;
	}

	public void setAlquilado(boolean alquilado) {
		
	}

	public double getAreaConstruida() {
		return areaConstruida;
	}

	public void setAreaConstruida(double areaConstruida) {
		this.areaConstruida = areaConstruida;
	}

	public int getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(int habitaciones) {
		this.habitaciones = habitaciones;
	}

	public int getBanos() {
		return banos;
	}

	public void setBanos(int banos) {
		this.banos = banos;
	}

	public int getValorAlquiler() {
		return valorAlquiler;
	}

	public void setValorAlquiler(int valorAlquiler) {
		this.valorAlquiler = valorAlquiler;
	}

	public boolean isCocina() {
		return cocina;
	}

	public void setCocina(boolean cocina) {
		this.cocina = cocina;
	}

	public boolean isConjuntoCerrado() {
		return conjuntoCerrado;
	}

	public void setConjuntoCerrado(boolean conjuntoCerrado) {
		this.conjuntoCerrado = conjuntoCerrado;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public boolean isAlquilado() {
		return alquilado;
	}

	@Override
	public String toString() {
		return "Inmueble [areaConstruida=" + areaConstruida + ", habitaciones=" + habitaciones + ", banos=" + banos
				+ ", cocina=" + cocina + "]";
	}

	

	
}
