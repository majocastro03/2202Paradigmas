public class CodCuenta {
	public static void main(String[] args) {
		String titular = "";
		double [] cantidad= new double [2];
		Cuenta nombre = new Cuenta();
		nombre.control(titular);
		Cuenta banco = new Cuenta();
		banco.ingresar(cantidad);
		Cuenta cajero = new Cuenta();
		cajero.retirar(cantidad);
	}
}
