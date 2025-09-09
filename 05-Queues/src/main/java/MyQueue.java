public class MyQueue<T> {

    private Node<T> front;
    private Node<T> back;
    private int size;

    public boolean isEmpty(){
       return front == null;
    }
    public void enqueue(T item){

        Node<T> newNode = new Node<>(item);

        if(isEmpty()){
            front = back = newNode;
        }else{
            back.setNext(newNode);
            back = newNode;
        }
        size++;
    }

    public T peak(){
        return (T) front.getValue();
    }

    public T dequeue() throws NoSuchFieldException {

        Node frontNode;

        if(isEmpty()){
            throw new NoSuchFieldException();
        } else if (size == 1){
            frontNode = front;
            front = back = null;

        } else{
            frontNode = front;
            front = front.getNext();
        }

        size--;
        return (T)frontNode.getValue();

    }

    public int size(){
        return size;
    }







}
