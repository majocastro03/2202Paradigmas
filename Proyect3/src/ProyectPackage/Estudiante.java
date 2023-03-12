package ProyectPackage;

public class Estudiante extends Persona {
    private int id;
    private int semestre;

    public Estudiante(String Nombres, String Apellidos, String Direccion, String Carrera, String Ciudad, int Edad,
            int ID, int Semestre) {
        super(Nombres, Apellidos, Direccion, Carrera, Ciudad, Edad);
        this.id = ID;
        this.semestre = Semestre;
    }

    public int getId() {
        return id;
    }

    public int getSemestre() {
        return semestre;
    }

    @Override
    public String toString() {
        return super.toString()+ "\n" + "id = " + id + "\n" + "Semestre = " + semestre;
    }

}
