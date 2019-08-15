public interface Stack<E> extends ICollection {

    void push(E value);

    E pop();

    E peek();

}