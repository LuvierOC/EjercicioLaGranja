
package Persona;

public class Visitante extends Persona{

    private int idVoleta;
    private int dineroGastado;

    public Visitante(int idVoleta, int dineroGastado, int cedula,
            String nombre, String sexo, int edad) {
        super(cedula, nombre, sexo, edad);
        this.idVoleta = idVoleta;
        this.dineroGastado = dineroGastado;
    }

    public int getIdVoleta() {
        return idVoleta;
    }

    public void setIdVoleta(int idVoleta) {
        this.idVoleta = idVoleta;
    }

    public int getDineroGastado() {
        return dineroGastado;
    }

    public void setDineroGastado(int dineroGastado) {
        this.dineroGastado = dineroGastado;
    }

    @Override
    public String mostrarDatosPersona() {
        return "Visitante{" + "idVoleta=" + getIdVoleta() + ", Nombre="
                + getNombre() + ", dineroGastado=" + getDineroGastado() + '}';
    }
}
