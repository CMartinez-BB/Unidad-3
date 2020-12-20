package EstructurasNoLineales;
//recursividad del codigo
public class NodoArbo {
    private int valor;
    private NodoArbo nodoIzquierdo;
    private NodoArbo nodoDerecho;
    public  NodoArbo(int valor){
        this.valor=valor;
        this.nodoDerecho=null;
        this.nodoIzquierdo=null;
    }

    public int getValor() {
        return valor;
    }
    public NodoArbo getNodoIzquierdo() {
        return nodoIzquierdo;
    }

    public NodoArbo getNodoDerecho() {
        return nodoDerecho;
    }
    public void insertar(int Numero){
        //insertar en el lado izquierdo
        if (valor<this.valor){
            if(this.nodoIzquierdo==null){
                this.nodoIzquierdo=new NodoArbo(valor);
            }else{
                this.nodoIzquierdo.insertar(valor);
            }
        }else{
           //insertar en el lado derecho
            if (this.nodoDerecho==null){
                this.nodoDerecho=new NodoArbo(valor);
            }else{
                this.nodoDerecho.insertar(valor);
            }
        }
    }
}
