import java.util.LinkedList;
import java.util.Queue;

public class MyTree {
    public Node root;

    public MyTree() {
    }

    public MyTree(Node root) {
        this.root = root;
    }

    public void insert(int value){
        Node newNode= new Node(value);
        if(root == null){
            root = newNode;
            return;
        }
        Node current = root;
        while (true){
            if(value <= current.value){
                if(current.leftChild == null){
                    current.leftChild = newNode;
                    break;
                }
                current = current.leftChild;
            }else{
                if(current.rightChild == null){
                    current.rightChild = newNode;
                    break;
                }
                current = current.rightChild;
            }
        }
    }


    // PreOrder Traversal of Tree Root-Left-Right
    public void preOrderTraversal(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.value + ", ");
        preOrderTraversal(root.leftChild);
        preOrderTraversal(root.rightChild);
    }

    // InOrder Traversal of Tree Left-Root-Right
    public void inOrderTraversal(Node root){
        if(root == null){
            return;
        }

        inOrderTraversal(root.leftChild);
        System.out.println(root.value + ", ");
        inOrderTraversal(root.rightChild);
    }

    // PostOrder Traversal of Tree left-Right-Root
    public void postOrderTraversal(Node root){
        if(root == null){
            return;
        }
        postOrderTraversal(root.leftChild);
        postOrderTraversal(root.rightChild);
        System.out.print(root.value + ", ");
    }

    // BreadthFirst Traversal
    public void levelOrderTraversal(){
        if(root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            Node toVisit = queue.poll();
            System.out.print(toVisit.value + ", ");
            if(toVisit.leftChild != null) queue.add(toVisit.leftChild);
            if(toVisit.rightChild != null) queue.add(toVisit.rightChild);
        }



    }

    public boolean contains(int value){
        if(root == null ) return false;

        Node current = root;
        while(current != null){
            if(value < current.value){
                current = current.leftChild;
            } else if (value > current.value){
                current = current.rightChild;
            }else{
                return true;
            }
        }
        return false;
    }

    public boolean isLeaf(Node node){
        return node.leftChild == null && node.rightChild == null;
    }

    public void printLeaves(Node root){
        if(root == null) return;

        if(isLeaf(root)) System.out.println(root.value + ", ");
        printLeaves(root.leftChild);
        printLeaves(root.rightChild);
    }

    public int countLeaves(Node root){
        if(root == null) return 0;
        if(isLeaf(root)) return 1;

        return countLeaves(root.leftChild) + countLeaves(root.rightChild);
    }

    public int findSumOfLeaves(Node root){
        if(root== null) return 0;
        if(isLeaf(root)) return root.value;

        return findSumOfLeaves(root.leftChild) + findSumOfLeaves(root.rightChild);

    }

    public int height(Node root){
        if(root==null)  return -1;
        if(isLeaf(root)) return 0;

        return 1+ Math.max(height(root.leftChild), height(root.rightChild));
    }

}
