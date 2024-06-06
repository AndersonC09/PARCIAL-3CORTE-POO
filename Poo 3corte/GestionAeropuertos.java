import java.util.*;

public class GestionAeropuertos {
    private static List<Aeropuerto> aeropuertos = new ArrayList<>();
    private static List<Vuelo> vuelos = new ArrayList<>();
    private static List<Compania> companias = new ArrayList<>();

    public static void main(String[] args) {
        cargarDatos();
        mostrarVuelosSalida();
        mostrarVuelosLlegada();
    }

    private static void cargarDatos() {

        aeropuertos.add(new Aeropuerto("BCN01", "Barcelona - El Prat", "Barcelona", "España", 1));
        aeropuertos.add(new Aeropuerto("MAD01", "Madrid - Barajas", "Madrid", "España", 1));
        aeropuertos.add(new Aeropuerto("PAR01", "Paris - Orly", "Paris", "Francia", 1));
        aeropuertos.add(new Aeropuerto("LON01", "London - Heathrow", "Londres", "Gran Bretaña", 0));
        aeropuertos.add(new Aeropuerto("SPA01", "Sao Paulo - Guarulhos", "Sao Paulo", "Brasil", -3));


        vuelos.add(new Vuelo("R", buscarAeropuerto("BCN01"), buscarAeropuerto("MAD01"), "01:00", buscarOcrearCompania("Iberia"), "Airbus", 150, "L-15:00 X-15:00 V-15:00 D-15:00"));
        vuelos.add(new Vuelo("R", buscarAeropuerto("MAD01"), buscarAeropuerto("BCN01"), "01:00", buscarOcrearCompania("Iberia"), "Airbus", 150, "L-18:00 J-20:00 S-20:00"));
        vuelos.add(new Vuelo("R", buscarAeropuerto("BCN01"), buscarAeropuerto("LON01"), "01:05", buscarOcrearCompania("British Air"), "Boeing", 180, "L-10:00 J-10:00"));
        vuelos.add(new Vuelo("R", buscarAeropuerto("LON01"), buscarAeropuerto("BCN01"), "01:05", buscarOcrearCompania("British Air"), "Boeing", 180, "L-15:00 J-15:00"));
        vuelos.add(new Vuelo("R", buscarAeropuerto("BCN01"), buscarAeropuerto("LON01"), "01:10", buscarOcrearCompania("Ryan Air"), "Airbus", 120, "L-10:00 J-10:00"));
        vuelos.add(new Vuelo("R", buscarAeropuerto("LON01"), buscarAeropuerto("BCN01"), "01:10", buscarOcrearCompania("Ryan Air"), "Airbus", 120, "J-15:10 J-15:10"));
        vuelos.add(new Vuelo("R", buscarAeropuerto("LON01"), buscarAeropuerto("SPA01"), "07:00", buscarOcrearCompania("British Air"), "Boeing", 200, "X-09:45 J-09:45 S-09:45"));
        vuelos.add(new Vuelo("R", buscarAeropuerto("SPA01"), buscarAeropuerto("MAD01"), "07:00", buscarOcrearCompania("British Air"), "Boeing", 200, "X-20:25 J-20:25 S-20:25"));
        vuelos.add(new Vuelo("C", buscarAeropuerto("BCN01"), buscarAeropuerto("MAD01"), "01:00", buscarOcrearCompania("Spanair"), "Airbus", 150, "Viajes Condor;1/2009/15 20:30"));
        vuelos.add(new Vuelo("C", buscarAeropuerto("BCN01"), buscarAeropuerto("MAD01"), "01:00", buscarOcrearCompania("Spanair"), "Airbus", 150, "Viajes Condor;1/2009/15 20:30"));
        vuelos.add(new Vuelo("C", buscarAeropuerto("MAD01"), buscarAeropuerto("BCN01"), "01:00", buscarOcrearCompania("Iberia"), "Airbus", 150, "Viajes Condor;1/2009/22 20:30"));
        vuelos.add(new Vuelo("C", buscarAeropuerto("BCN01"), buscarAeropuerto("LON01"), "01:00", buscarOcrearCompania("British Air"), "Boeing", 180, "Viaje Ilusion;2/2009/22 20:30"));
        vuelos.add(new Vuelo("C", buscarAeropuerto("LON01"), buscarAeropuerto("BCN01"), "01:00", buscarOcrearCompania("British Air"), "Boeing", 180, "Viaje Ilusion;3/2009/05 15:19"));
        vuelos.add(new Vuelo("C", buscarAeropuerto("LON01"), buscarAeropuerto("BCN01"), "01:00", buscarOcrearCompania("British Air"), "Boeing", 180, "Viaje Ilusion;3/2009/05 15:19"));
        vuelos.add(new Vuelo("C", buscarAeropuerto("BCN01"), buscarAeropuerto("LON01"), "01:00", buscarOcrearCompania("Ryan Air"), "Airbus", 120, "TravelPlan;1/2009/25 15:18"));
        vuelos.add(new Vuelo("C", buscarAeropuerto("SPA01"), buscarAeropuerto("SPA01"), "01:00", buscarOcrearCompania("Ryan Air"), "Airbus", 120, "TravelPlan;1/2009/31 22:20"));
        vuelos.add(new Vuelo("C", buscarAeropuerto("SIB01"), buscarAeropuerto("SPA01"), "01:00", buscarOcrearCompania("Ryan Air"), "Airbus", 120, "TravelPlan;1/2009/31 22:20"));
    }

    private static Aeropuerto buscarAeropuerto(String codigo) {
        for (Aeropuerto aeropuerto : aeropuertos) {
            if (aeropuerto.getCodigo().equals(codigo)) {
                return aeropuerto;
            }
        }
        return null;
    }

    private static Compania buscarOcrearCompania(String nombre) {
        for (Compania compania : companias) {
            if (compania.getNombre().equals(nombre)) {
                return compania;
            }
        }
        Compania nuevaCompania = new Compania(nombre);
        companias.add(nuevaCompania);
        return nuevaCompania;
    }

    private static void mostrarVuelosSalida() {
        for (Aeropuerto aeropuerto : aeropuertos) {
            System.out.println("Vuelos de salida desde " + aeropuerto.getNombre() + ":");
            for (Vuelo vuelo : vuelos) {
                if (vuelo.getOrigen() != null && vuelo.getOrigen().equals(aeropuerto)) {
                    System.out.println(vuelo);
                }
            }
        }
    }

    private static void mostrarVuelosLlegada() {
        for (Aeropuerto aeropuerto : aeropuertos) {
            System.out.println("Vuelos de llegada a " + aeropuerto.getNombre() + ":");
            for (Vuelo vuelo : vuelos) {
                if (vuelo.getDestino() != null && vuelo.getDestino().equals(aeropuerto)) {
                    System.out.println(vuelo);
                }
            }
        }
    }
}
