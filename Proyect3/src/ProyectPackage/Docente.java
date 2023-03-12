package ProyectPackage;

public class Docente extends Persona {
    private int id;
    private String cargo;
    private boolean casado;

    public Docente(String Nombres, String Apellidos, String Direccion, String Carrera, String Ciudad, int Edad, int ID, String Cargo, boolean Casado){
        super(Nombres, Apellidos, Direccion, Carrera, Ciudad, Edad);
        this.id = ID;
        this.cargo = Cargo;
        this.casado = Casado;
    }

    public int getId() {
        return id;
    }

    public String getCargo() {
        return cargo;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "id = " + id +  "\n"  +"Cargo = " + cargo + "\n" + "Casado = " + casado;
    }
    
}
