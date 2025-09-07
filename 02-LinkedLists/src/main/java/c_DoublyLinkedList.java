public class c_DoublyLinkedList {

    public c_Node head;
    public c_Node tail;


    public void setHead(c_Node node){
        if(head == null){
            head = node;
            tail = node;
        }
    }

    public void printNode(){
        c_Node current = head;

        while(current != null){

            if(current.next == null) {
                System.out.print(current.value + " -> null ");
            }else{
                System.out.print(current.value + " -> ");
            }
            current = current.next;
        }

    }

    public void insert(int value){
        c_Node nodeToInsert = new c_Node(value);
        if(head == null){
            head = nodeToInsert;
            tail = nodeToInsert;
            nodeToInsert.prev = null;
            nodeToInsert.next = null;
        } else {
            tail.next = nodeToInsert;
            nodeToInsert.next = null;
            nodeToInsert.prev = tail;
            tail = nodeToInsert;
        }
    }

    public void setTail (c_Node node){
        if(tail == null){
            setHead(node);
        }
    }

    public void insertBefore (c_Node node, c_Node nodeToInsert){

        // 1 2 -  3 4 5

        nodeToInsert.prev = node.prev;
        nodeToInsert.next = node;

        if(node.prev == null){
            nodeToInsert = head;
        } else {
            node.prev.next = nodeToInsert;
        }

        node.prev = nodeToInsert;

    }

    public void insertAfter (c_Node node, c_Node nodeToInsert){

        // 1 2 3 - 4 5

        nodeToInsert.next = node.next;
        nodeToInsert.prev = node;

        if (node.next == null){
            tail = nodeToInsert;
        } else {
            node.next.prev = nodeToInsert;
        }

        node.next = nodeToInsert;

    }





}
