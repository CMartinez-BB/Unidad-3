package EstructurasNoLineales;

public class Arbol {
    NodoArbo inicial;
    public Arbol(){
        this.inicial=null;
    }
    public void insertar(int valor){
        if(this.inicial==null){
            this.inicial=new NodoArbo(valor);
        }else{
            this.inicial.insertar(valor); //disparar la recursividad
        }
    }
    public void dspararPreorden(){
            this.Preorden(this.inicial);
    }
    public void Preorden(NodoArbo nodo){
           if(nodo==null){
               return;//detener recursividad
           }else{
               System.out.println(nodo.getValor()+" ,");
               Preorden(nodo.getNodoIzquierdo());
               Preorden(nodo.getNodoDerecho());

           }
    }    public void dspararInorden(){
            this.Inorden(this.inicial);
    }
    public void Inorden(NodoArbo nodo){
           if(nodo==null){
               return;//detener recursividad
           }else{
               Inorden(nodo.getNodoIzquierdo());
               System.out.println(nodo.getValor()+" ,");
               Inorden(nodo.getNodoDerecho());

           }
    }
   public void dspararPosorden(){
    this.Posorden(this.inicial);
}
    public void Posorden(NodoArbo nodo){
        if(nodo==null){
            return;//detener recursividad
        }else{
            Posorden(nodo.getNodoIzquierdo());
            Posorden(nodo.getNodoDerecho());
            System.out.println(nodo.getValor()+" ,");

        }
    }
}
