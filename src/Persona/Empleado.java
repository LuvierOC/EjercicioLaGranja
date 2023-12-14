package Persona;

public class Empleado extends Persona{
    
   private int idEmpleado;
   private String profesion;
   private int sueldo;

    public Empleado(int idEmpleado, String profesion, int sueldo, int cedula, String nombre, String sexo, int edad) {
        super(cedula, nombre, sexo, edad);
        this.idEmpleado = idEmpleado;
        this.profesion = profesion;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public String getProfesion() {
        return profesion;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String mostrarDatosPersona() {
        return "Visitante{" + "idEmpleado=" + getIdEmpleado()+ ", Nombre=" +
                getNombre() + ", profesion=" + getProfesion() + 
                ", Sueldo=" + getSueldo()+ '}';
    }
}
