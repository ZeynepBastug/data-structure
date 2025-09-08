public class a_NodeExampleApp {

    public static void main(String[] args) {
        a_MyNode nodeA = new a_MyNode("Node A");
        a_MyNode nodeB = new a_MyNode("Node B");
        a_MyNode nodeC = new a_MyNode("Node C");

        System.out.println(nodeA);  // it will print the address of the node! NOT the NAME!

        nodeA.next = nodeB;
        nodeB.next = nodeC;
        System.out.println(nodeA.name + " " + nodeA.next.next + " " + nodeB.next.name);

        // Iterate over the list i did
        a_MyNode current = nodeA;
        while(current != null){
            System.out.println(current.name);
            current = current.next;
        }


    }

}
