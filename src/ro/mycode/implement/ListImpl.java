package ro.mycode.implement;

public class ListImpl <T> implements List<T>{


    private Node<T> head = null;


    public Node<T> getLast(){

        Node<T> itr = head;
        Node<T> last = itr;
        while(itr != null){

            last = itr;
            itr = itr.getNext();
        }

        return last;
    }

    @Override
    public void add(T data) {

        if(head == null){

            Node<T> node = new Node<>();
            node.setData(data);
            node.setNext(null);
            head = node;
        }else{

            Node<T>last = getLast();
            Node<T> node = new Node<>();
            node.setData(data);
            last.setNext(node);
        }
    }

    public void traverse(){

        Node<T> itr = head;
        while(itr != null){

            System.out.println(itr.toString());
            itr = itr.getNext();
        }
    }

    @Override
    public void remove(T data) {

        int index = indexOf(data);
        Node<T> toDelete = get(index);
        Node<T> before = get(index-1);
        before.setNext(toDelete.getNext());
    }

    public void removeFirst(){

        head = head.getNext();
    }

    @Override
    public void remove(int index) {

        if(index == 0){

            removeFirst();
        }else{

            Node<T> toDelete = get(index);
            Node<T> before = get(index -1);
            before.setNext(toDelete.getNext());
        }
    }

    @Override
    public boolean contains(T data) {

        Node<T> itr = head;
        while(itr != null){

            if(itr.getData().equals(data)){

                return true;
            }

            itr=itr.getNext();
        }

        return false;
    }

    @Override
    public boolean isEmpty() {

        if(size() == 0){

            return true;
        }
        return false;
    }

    @Override
    public int indexOf(T data) {

        Node<T> itr = head;
        int count = -1;

        while(itr != null){

            count++;
            if(itr.getData().equals(data)){

                return count;
            }
            itr = itr.getNext();
        }

        return -1;
    }

    @Override
    public int size() {

        Node<T> itr = head;
        int count = 0;
        while(itr != null){

            count++;
            itr = itr.getNext();
        }

        return count;
    }

    @Override
    public Node<T> get(int index) {

        Node<T> itr = head;
        int count = -1;
        while(itr != null){

            count++;
            if(count == index){

                return itr;
            }
            itr = itr.getNext();
        }

        return null;
    }
}
