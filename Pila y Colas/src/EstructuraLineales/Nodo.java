package EstructuraLineales;

public class Nodo {
    private  Cancion cancion;
    private Nodo sigueinte;

    public Nodo(Cancion cancion) {
        this.cancion = cancion;
        sigueinte=null;
    }

    public Cancion getCancion() {
        return cancion;
    }

    public void setCancion(Cancion cancion) {
        this.cancion = cancion;
    }

    public Nodo getSigueinte() {
        return sigueinte;
    }

    public void setSigueinte(Nodo sigueinte) {
        this.sigueinte = sigueinte;
    }

}
