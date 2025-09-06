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

    void deleteNode(int value){

        if(isEmpty()) System.out.println("No Values with the value send!");

        // first one
        b_Node current = head;
        b_Node prev = head;

        while (current != null){  //if you find a match
            if(current.value == value){ //if the item to be deleted is the head
                if(current == head) {
                    head = current.next;
                    current.next = null; // will be available for garbage collection
                } else if (current == tail) { // if the item to be deleted  in the tail
                    tail = prev;
                    prev.next = null;
                }else{ // if the item to be deleted is in the middle
                    prev.next = current.next;
                    current.next = null;
                }

                size--; //decrease the size once
            }
            prev = current;
            current = current.next;

        }

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

    public int getKthFromLast(int k){
        b_Node ptr1 = head;
        b_Node ptr2 = head;
        for (int i = 0; i < k-1; i++) {
            ptr2 = ptr2.next;
            if(ptr2 == null)
                return -1;
        }

        while(ptr2.next != null){
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return ptr1.value;
    }

    public void removeKthFromlast(int k){
        b_Node prevDelete = null;
        b_Node ptr1 = head;
        b_Node ptr2 = head;

        for (int i = 0; i < k-1; i++) {
            ptr2 = ptr2.next;
            if (ptr2 == null) System.out.println("ptr2 is null");
        }
        while (ptr2.next != null){
            prevDelete = ptr1;
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        if(ptr1 == head){
            head = ptr1.next;
            ptr1.next = null;
            size--;
        } else {
            prevDelete.next = ptr1.next;
            ptr1.next = null;
            size--;
        }





    }
}
