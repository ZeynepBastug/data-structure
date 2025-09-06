public class b_MySinglyLinkedList {
    b_Node head;
    b_Node tail;
    int size;

    public b_MySinglyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    boolean isEmpty(){
        return head == null;
    }

    void add (int data){
        // create a new node with data value
        b_Node node = new b_Node(data);

        // check if the list is empty
        if (isEmpty()){head = tail = node;}
        else {
            tail.next = node;
            tail = node;
        }
        // Add element into last position in the linked list
        size++;

    }

    void printNode(){
        b_Node current = head;

        while(current != null){
            if(current.next == null) System.out.print(current.value + " -> null");
            else System.out.print(current.value +  " -> ");
            current = current.next;
        }

        System.out.println();
    }

    void deleteNode(){

    }

    int indexOf(int value){
        int pos=0;
        b_Node current = head;
        if(isEmpty()) return -1;

        while (current != null){
            if (current.value == value) return pos;
            pos++;
            current = current.next;
        }
        return -1;
    }
}
