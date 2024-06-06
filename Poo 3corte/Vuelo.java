public class Vuelo {
    private String tipo;
    private Aeropuerto origen;
    private Aeropuerto destino;
    private String duracion;
    private Compania compania;
    private String tipoAvion;
    private int capacidad;
    private String horario;

    public Vuelo(String tipo, Aeropuerto origen, Aeropuerto destino, String duracion, Compania compania, String tipoAvion, int capacidad, String horario) {
        this.tipo = tipo;
        this.origen = origen;
        this.destino = destino;
        this.duracion = duracion;
        this.compania = compania;
        this.tipoAvion = tipoAvion;
        this.capacidad = capacidad;
        this.horario = horario;
    }


    public String getTipo() {
        return tipo;
    }

    public Aeropuerto getOrigen() {
        return origen;
    }

    public Aeropuerto getDestino() {
        return destino;
    }

    public String getDuracion() {
        return duracion;
    }

    public Compania getCompania() {
        return compania;
    }

    public String getTipoAvion() {
        return tipoAvion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getHorario() {
        return horario;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setOrigen(Aeropuerto origen) {
        this.origen = origen;
    }

    public void setDestino(Aeropuerto destino) {
        this.destino = destino;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public void setCompania(Compania compania) {
        this.compania = compania;
    }

    public void setTipoAvion(String tipoAvion) {
        this.tipoAvion = tipoAvion;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Vuelo{" +
                "tipo='" + tipo + '\'' +
                ", origen=" + origen +
                ", destino=" + destino +
                ", duracion='" + duracion + '\'' +
                ", compania=" + compania +
                ", tipoAvion='" + tipoAvion + '\'' +
                ", capacidad=" + capacidad +
                ", horario='" + horario + '\'' +
                '}';
    }
}
