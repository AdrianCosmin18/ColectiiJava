package ro.mycode.implement;

public interface List <T>{

    void add(T data);
    void remove(T data);
    void remove(int index);
    boolean contains(T data);
    boolean isEmpty();
    int indexOf(T data);
    int size();
    Node<T> get(int index);
}
