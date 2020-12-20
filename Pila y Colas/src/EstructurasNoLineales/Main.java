package EstructurasNoLineales;

public class Main {
    public static void main(String[] args) {
        Arbol arbol=new Arbol();
        arbol.insertar(43);
        arbol.insertar(10);
        arbol.insertar(8);
        arbol.insertar(54);
        arbol.insertar(15);
        arbol.insertar(53);
        System.out.println("Inorden: ");
        arbol.dspararInorden();
        System.out.println("Pos Orden: ");
        arbol.dspararPosorden();
        System.out.println("Pre Orde: ");
        arbol.dspararPreorden();
    }
}
