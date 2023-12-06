package Zoologico;

public class Leon extends AnimalCarnivoro {
    
    private float velocidad;

    public Leon(float velocidad, int codigo, String nombre, float peso, int edad) {
        super(codigo, nombre, peso, edad);
        this.velocidad = velocidad;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }
    
    @Override
    public String mostrarDatos() {
        return "Puma{" + "codigo=" + getCodigo() + ", nombre=" + getNombre() + 
                ", peso=" + getPeso() + ", edad=" + getEdad()+ ", velocidad=" + velocidad+'}';
    }   
}
