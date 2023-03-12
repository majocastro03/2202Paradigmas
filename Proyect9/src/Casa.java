
public class Casa extends Inmueble{
	protected boolean patio;
	protected boolean jardin;
	protected boolean piscina;
	protected int pisos;
	
	public Casa(double areaConstruida, int habitaciones, int banos, boolean cocina, boolean patio, boolean jardin, boolean piscina,int pisos) {
		super(areaConstruida, habitaciones, banos, cocina);
		this.patio = patio;
		this.jardin = jardin;
		this.piscina = piscina;
		this.pisos = pisos;
	}
	public boolean isPatio() {
		return patio;
	}
	public void setPatio(boolean patio) {
		this.patio = patio;
	}
	public boolean isJardin() {
		return jardin;
	}
	public void setJardin(boolean jardin) {
		this.jardin = jardin;
	}
	public boolean isPiscina() {
		return piscina;
	}
	public void setPiscina(boolean piscina) {
		this.piscina = piscina;
	}
	public int getPisos() {
		return pisos;
	}
	public void setPisos(int pisos) {
		this.pisos = pisos;
	}
	@Override
	public String toString() {
		return super.toString() + String.format("-patio: %b -jardin:%b -piscina%b -pisos: %d", patio, jardin, piscina, pisos);
	}
	
	
	
}
