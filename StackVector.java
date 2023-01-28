import java.util.EmptyStackException;
import java.util.NoSuchElementException;
import java.util.Vector;
/**
 * 
 * @author Jose Anton, Alejandro Ortega, Pedro Pablo Guzmán
 * @version 1.0.0
 * @param <E> representa que el vector tendrá un tipo de dato específico
 */
public class StackVector<E> implements Stack<E> {

    private Vector<E> vector;
    /**
     * Es el método constructor, crea un nuevo vector del tipo especificado por el usuario
     */
    public StackVector() {
        vector = new Vector<E>();
    }

    @Override
    /**
     * Agrega datos al vector
     * @param item, representa el dato que se agregará
     */
    public void push(E item) {
        vector.add(item);
    }

    @Override
    /**
     * Este método elimina y devuelve el último valor agregado al vector
     */
    public E pop() throws EmptyStackException {
        try {
            return vector.remove(vector.size() - 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new EmptyStackException();
        }
    }

    @Override
    /**
     * Devuelve el último valor agregado al vector
     */
    public E peek() throws EmptyStackException {
        try {
            return vector.lastElement();
        } catch (NoSuchElementException e) {
            throw new EmptyStackException();
        }
    }

    @Override
    /*
     * Devuelve true si el vector está vacío, false si no está vacío
     */
    public boolean empty() {
        return vector.isEmpty();
    }

    @Override
    /**
     * Devuelve el tamaño del vector
     */
    public int size() {
        return vector.size();
    }
    
}
