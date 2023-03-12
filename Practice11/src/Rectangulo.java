public class Rectangulo {
    private int base, altura, h = 0;
    public Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    public void resultado(){
        h = (base*altura);
    }
    public void mostrar(){
        resultado();
        System.out.println("El area es: "+h);
    }
}
