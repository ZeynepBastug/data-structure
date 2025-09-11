package tress;

/**
 * Problem: Sum of Node Depths
 * <p>
 * The distance between a node in a Binary Tree and the tree's root is called the node's depth.
 * Write a function that takes in a Binary Tree and returns the sum of its nodes' depths.
 * Each BinaryTree node has an integer value, a left child node, and a right child of node.
 * Children nodes can either be BinaryTree nodes themselves or None/null;
 * Sample Input                          Sample Output
 * Tree           =                                16
 * 1
 * /   \                              The Depth of the node with value 2 is 1
 * 2      3                             The Depth of the node with value 3 in 1
 * /  \    /  \                           The Depth of the node with value 4 is 2
 * 4     5  6    7                          The Depth of the node with value 5 in 2
 * / \                                       Etc...
 * 8   9                                      Summing all of these depths yields 16
 */




public class SumOfNodeDepths {
    public static void main(String[] args) {

    }


    Node root;

    public SumOfNodeDepths(Node root) {
        this.root = root;
    }

    public int nodeDepthSums(Node node, int sums){
        if (root == null) return 0;
        System.out.println(sums);
        return sums + nodeDepthSums(node.leftChild, sums +1) + nodeDepthSums(node.rightChild, sums +1);

    }
}
