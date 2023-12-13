
package Empleado;

public abstract class Persona {

    private int cedula;
    private String nombre;
    private String sexo;
    private int edad;

    public Persona(int cedula, String nombre, String sexo, int edad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public abstract String mostrarDatosPersona();
    
    
}
