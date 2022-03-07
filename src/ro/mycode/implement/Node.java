package ro.mycode.implement;

public class Node <T> implements Comparable<T>{

    private T data;
    private Node<T>next;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    @Override
    public int compareTo(T t){

        return 0;
    }

    @Override
    public String toString(){

        return data.toString();
    }

    @Override
    public boolean equals(Object o){
        return this.data.equals(o);
    }
}
