public class QueueTestApp {

    public static void main(String[] args) throws NoSuchFieldException {
        MyQueue<Integer> myQueue= new MyQueue<>();
        System.out.println(myQueue.isEmpty());

        myQueue.enqueue(1);
        myQueue.enqueue(2);

        System.out.println(myQueue.peak());
        System.out.println("Removed item from Queue is " + myQueue.dequeue());
    }
}
