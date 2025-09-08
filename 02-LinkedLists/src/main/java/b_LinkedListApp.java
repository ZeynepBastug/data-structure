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

        list1.removeKthFromlast(15);
        list1.printNode();


        b_MySinglyLinkedList list2 = new b_MySinglyLinkedList();
        int[] nums= {1, 1, 3, 4, 4, 4 ,5 ,6, 7, 7, 7, 7, 8,8,9};
        for (int num : nums) {
            list2.add(num);
        }
        System.out.println("With duplicates");
        list2.printNode();

        System.out.println("Without duplicates");
        list2.removeDuplicatesFromLinkedList();
        list2.printNode();


        list2.reverse();
        list2.printNode();
    }
}
