import java.util.EmptyStackException;
import java.util.NoSuchElementException;
import java.util.Vector;

public class StackVector<E> implements Stack<E> {

    private Vector<E> vector;

    public StackVector() {
        vector = new Vector<E>();
    }

    @Override
    public void push(E item) {
        vector.add(item);
    }

    @Override
    public E pop() throws EmptyStackException {
        try {
            return vector.remove(vector.size() - 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new EmptyStackException();
        }
    }

    @Override
    public E peek() throws EmptyStackException {
        try {
            return vector.lastElement();
        } catch (NoSuchElementException e) {
            throw new EmptyStackException();
        }
    }

    @Override
    public boolean empty() {
        return vector.isEmpty();
    }

    @Override
    public int size() {
        return vector.size();
    }
    
}
