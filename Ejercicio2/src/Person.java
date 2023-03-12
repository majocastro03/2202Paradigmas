public class Person extends Persona{
	int pesoIdeal = 0;
	public int calcularMc(String nombre, int edad, int DNI, int sexo, int peso,double altura, int pesoIdeal) {
		//convertir double en int
		int altura1 = (int)altura;
		pesoIdeal = peso / altura1 * altura1;
		if(pesoIdeal <40) {
			return -1;
		}else {
			if(pesoIdeal>= 40 && pesoIdeal<=50) {
				return 0;
			}else{
				if(pesoIdeal>50) {
					return 1;
				}
			}
		}
		return pesoIdeal;
	}
	public int esMayorDeEdad() {
		return 0;
	}
	public int comprobarSexo() {
		return 0;
	}
	public int generaDNI() {
		return 0;
	}
	@Override
	public String toString() {
		return "Person [esMayorDeEdad()=" + esMayorDeEdad() + ", comprobarSexo()=" + comprobarSexo() + ", generaDNI()="
				+ generaDNI() + "]";
	}
}
