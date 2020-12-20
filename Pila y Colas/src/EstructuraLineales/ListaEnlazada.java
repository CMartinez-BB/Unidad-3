package EstructuraLineales;

public class ListaEnlazada {
    Nodo Inicio;
    public ListaEnlazada(){
        Inicio=null;
    }
    public  void insertar(Cancion cancion){
        Nodo nuevoNodo=new Nodo(cancion);
        if(this.Inicio==null){
            this.Inicio=nuevoNodo;
        }else{
            Nodo nodoActual=Inicio.getSigueinte();
            if(nodoActual==null){
                Inicio.setSigueinte(nuevoNodo);
            }else{
                while (nodoActual.getSigueinte()!=null){
                    nodoActual=nodoActual.getSigueinte();
                }
                nodoActual.setSigueinte(nuevoNodo);
            }
        }
    }
    public void mostrarElementos(){
        Nodo nodoActual=Inicio;
        while (nodoActual.getSigueinte()!=null){
            System.out.print(nodoActual.getCancion().getNombre()+" ");
            System.out.print(nodoActual.getCancion().getDuración()+" ");
            System.out.println(nodoActual.getCancion().getRuta()+" ");
            nodoActual=nodoActual.getSigueinte();
        }
    }
}
