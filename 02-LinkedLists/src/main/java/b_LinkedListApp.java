public class b_LinkedListApp {

    public static void main(String[] args) {
        b_MySinglyLinkedList list1 = new b_MySinglyLinkedList();
        for (int i = 0; i < 5; i++) {
            list1.add(i);
        }

        list1.printNode();
        System.out.println(list1.indexOf(4));
    }
}
