/*
 *Implementacion de la interfaz iteradora y la interfaz de colección 
   y cree la clase de implementación Iterador<E>*/
package PatronIterator;

import java.util.List;
/**
 * @param <E>
 */
public class IteradorConcreto<E> implements Iterador<E>{
    private List<E> lista;
    private int cursor;
    private E elemento;
    //Constructor
    public IteradorConcreto(List<E> lista) {
        this.lista = lista;
    }

    public E next() {
        System.out.print("posición actual " + cursor + " : ");
        elemento = lista.get(cursor);
        cursor ++;
        return elemento;
    }

    public boolean hasNext() {
        if(cursor > lista.size() - 1){
            return false;
        }
        return true;
    }
}