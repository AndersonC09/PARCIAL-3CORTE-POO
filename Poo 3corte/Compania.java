public class Compania {
    private String nombre;

    public Compania(String nombre) {
        this.nombre = nombre;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Compania{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
