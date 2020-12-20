package EstructuraLineales;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        ListaEnlazada listaEnlazada=new ListaEnlazada();
        listaEnlazada.insertar(new Cancion("Another Life","./navidad.mp3","Motional",12));
        listaEnlazada.insertar(new Cancion("Another Life2","./navidad.mp3","Motional",12));
        listaEnlazada.insertar(new Cancion("Another Life3","./navidad.mp3","Motional",12));
        listaEnlazada.mostrarElementos();
        LinkedList<Cancion> listaJava=new LinkedList<>();
        listaJava.add(new Cancion("asd","sdsadasd","asdsad",12));

        /*Stack <Usuarios>pila = new Stack<>();
        Stack <Integer>pila2 = new Stack<>();
        Queue<Usuarios>cola=new LinkedList<>();
        pila.add(new Usuarios("Carlos","Calleve Benito","6361014015"));
        Usuarios cachar=pila.pop();
        System.out.println(cachar.getNombre());
        if (pila.isEmpty()) System.out.println("Esta vacia crack");
        pila2.add(1);
        pila2.add(2);
        pila2.add(3);
        pila2.add(4);
        cola.add(new Usuarios("Car","Yimbo","636121670"));
        cola.add(new Usuarios("Cr","Yimbo","636121670"));
        cola.add(new Usuarios("C","Yimbo","636121670"));
        cola.add(new Usuarios("Cb","Yimbo","636121670"));
        Usuarios usr=cola.poll();
        System.out.println(usr.getNombre());
        cola.clear();//limpiando la cola o la pila
        Usuarios cachar2=cola.peek();//VER DATO SIN AFECTAR PILA O COLA*/

    }
}
