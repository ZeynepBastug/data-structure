import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class ReverseFirstKElementsQueue {
    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<>();
       // queue.push(1);  act like a stack
        for (int i = 0; i < 5 ; i++) {
            queue.add(i);
        }

        reverseFirstK((ArrayDeque<Integer>) queue, 3);
    }

    public static void reverseFirstK(ArrayDeque<Integer> queue, int k){
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k; i++) {
            stack.push(queue.remove());
        }

        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }

        for (int i = 0; i < queue.size()- k ; i++) {
           int item =  queue.remove();
            queue.add(item);
        }
        queue.forEach(System.out::println);
    }
}
