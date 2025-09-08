import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class CollectionsStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();  // it's synchronized

        stack.push(1);
        System.out.println("Top of the stack is " + stack.peek());

        for (int i = 2; i < 6; i++) {
            stack.push(i);
        }

        System.out.println("Stack elements are: ");
        stack.forEach(System.out::println);
        System.out.println("Top of the stack is " + stack.peek());

        stack.pop();
        stack.pop();
        System.out.println("Top of the stack is " + stack.peek());

        Deque<Integer> deque = new LinkedList<>();// it's synchronized

        deque.push(1);
        System.out.println("Top of the deque is " + deque.peek());

        for (int i = 2; i < 6; i++) {
            deque.push(i);
        }

        System.out.println("Deque elements are: ");
        deque.forEach(System.out::println);
        System.out.println("Top of the deque is " + deque.peek());

        deque.pop();
        deque.pop();
        System.out.println("Top of the deque is " + deque.peek());

    }
}
