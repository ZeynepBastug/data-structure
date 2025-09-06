public class b_LinkedListApp {

    public static void main(String[] args) {
        b_MySinglyLinkedList list1 = new b_MySinglyLinkedList();
        for (int i = 0; i < 20; i++) {
            list1.add(i);
        }

        list1.printNode();
        System.out.println(list1.indexOf(4));

        list1.deleteNode(3);
        list1.printNode();

        System.out.println("list1.getKthFromLast(4) = " + list1.getKthFromLast(4));

    }
}
