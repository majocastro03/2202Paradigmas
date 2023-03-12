package ProyectPackage;

//import java.util.Scanner;
public class Persona {
    private String nombres;
    private String apellidos;
    private String direccion;
    private String carrera;
    private String ciudad;
    private int edad;

    public Persona(String Nombres, String Apellidos, String Direccion, String Carrera, String Ciudad, int Edad) {
        this.nombres = Nombres;
        this.apellidos = Apellidos;
        this.direccion = Direccion;
        this.carrera = Carrera;
        this.ciudad = Ciudad;
        this.edad = Edad;
    }

    public String getnombres() {
        return nombres;
    }

    public String getapellidos() {
        return apellidos;
    }

    public String getdireccion() {
        return direccion;
    }

    public String getcarrera() {
        return carrera;
    }

    public String getciudad() {
        return ciudad;
    }

    public int getedad() {
        return edad;
    }
    
    @Override
    public String toString() {
        return "Nombre = " + nombres + "\n" + "Apellidos = " + apellidos + "\n" + "Carrera = " + carrera + "\n" +  "Ciudad = " + ciudad + "\n" + "Direccion = "
                + direccion +"\n" + "edad = " + edad;
    }

    public static void main(String[] args) {
        Docente planta = new Docente("Rubiela", "Romero", "San Gil", "Sistemas", "Ciudad", 40, 486989, "Profesora", false);
        System.out.println(planta.toString());
        Estudiante primiparo = new Estudiante("Arnold", "Gomez", "Santa Ana", "Deportes", "Cali", 22, 1100950, 6);
        System.out.println(primiparo.toString());
        // Curso curso = new Curso();
        // Docente docente = new Docente();
        // docente.setNombres("Fabiola");
        // docente.setApellidos("Castro");
        // curso.setDocenteCurso(docente);
        // Docente docenteCurso = curso.getDocenteCurso();
        // System.out.println(docenteCursoCreado.getNombres());
    }

}
