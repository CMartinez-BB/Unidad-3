package EstructuraLineales;

public class Usuarios {
    private String nombre;
    private String direciión;
    private String telefono;

    public Usuarios(String nombre, String direciión, String telefono) {
        this.nombre = nombre;
        this.direciión = direciión;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireciión() {
        return direciión;
    }

    public void setDireciión(String direciión) {
        this.direciión = direciión;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
