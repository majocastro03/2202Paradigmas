
public class Apartamento extends Inmueble{
	protected int piso;
	protected int ascensor;
	
	public Apartamento(double areaConstruida, int habitaciones, int banos, boolean cocina, int piso, int ascensor) {
		super(areaConstruida, habitaciones, banos, cocina);
		this.piso = piso;
		this.ascensor = ascensor;
	}
	public int getPiso() {
		return piso;
	}
	public void setPiso(int piso) {
		this.piso = piso;
	}
	public int getAscensor() {
		return ascensor;
	}
	public void setAscensor(int ascensor) {
		this.ascensor = ascensor;
	}
	@Override
	public String toString() {
		return super.toString() + String.format("-piso:%d -ascensor:%d", piso, ascensor);
	}
	
}
