public class TreeApp {
    public static void main(String[] args) {
        MyTree tree = new MyTree();
        int[] nums = new int[] {10,5,12,3,6,11,13,2};

        for (int i = 0; i < 7; i++) {
            tree.insert(nums[i]);
        }
        VisualizeTree.printTree(tree.root, null, false);

        System.out.println("Pre-Order Traversal");
        tree.preOrderTraversal(tree.root);
        System.out.println();

        System.out.println("In-Order Traversal");
        tree.inOrderTraversal(tree.root);
        System.out.println();

        System.out.println("Post-Order Traversal");
        tree.postOrderTraversal(tree.root);
        System.out.println();

        System.out.println("Breadth First Traversal");
        tree.levelOrderTraversal();
        System.out.println();

        System.out.println("tree contains 6 is: " + tree.contains(6));

        System.out.println("Print Leaves of The Tree");
        tree.printLeaves(tree.root);

        System.out.println("Number of leaves: " + tree.countLeaves(tree.root));


        System.out.println(Integer.MAX_VALUE + ", " + Integer.MIN_VALUE);
    }


}
