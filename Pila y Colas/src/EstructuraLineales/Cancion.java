package EstructuraLineales;

public class Cancion {
    private String canción;
    private String ruta;
    private String nombre;
    private int duración;

    public Cancion(String canción, String ruta, String nombre, int duración) {
        this.canción = canción;
        this.ruta = ruta;
        this.nombre = nombre;
        this.duración = duración;
    }

    public String getCanción() {
        return canción;
    }

    public void setCanción(String canción) {
        this.canción = canción;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuración() {
        return duración;
    }

    public void setDuración(int duración) {
        this.duración = duración;
    }
}
