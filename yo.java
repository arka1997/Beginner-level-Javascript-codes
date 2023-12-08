// Checking if a binary tree is a perfect binary tree in Java

class PerfectBinaryTree {

  static class Node {
    int key;
    Node left, right;
  }

  // Calculate the depth
  static int depth(Node node) {
    int d = 0;
    while (node != null) {
      d++;
      node = node.left;
    }
    return d;
  }

  // Check if the tree is perfect binary tree
  static boolean is_perfect(Node root, int d, int level) {

    // Check if the tree is empty
    if (root == null)
      return true;

    // If for children
    if (root.left == null && root.right == null)
      return (d == level + 1);

    if (root.left == null || root.right == null)
      return false;

    return is_perfect(root.left, d, level + 1) && is_perfect(root.right, d, level + 1);
  }

  // Wrapper function
  static boolean is_Perfect(Node root) {
    int d = depth(root);
    return is_perfect(root, d, 0);
  }

  // Create a new node
  static Node newNode(int k) {
    Node node = new Node();
    node.key = k;
    node.right = null;
    node.left = null;
    return node;
  }

  public static void main(String args[]) {
    Node root = null;
    root = newNode(1);
    root.left = newNode(2);
    root.right = newNode(3);
    root.left.left = newNode(4);
    root.left.right = newNode(5);

    if (is_Perfect(root) == true)
      System.out.println("The tree is a perfect binary tree");
    else
      System.out.println("The tree is not a perfect binary tree");
  }
}
















// Checking if a binary tree is a full binary tree in Java

class Node {
    int data;
    Node leftChild, rightChild;
  
    Node(int item) {
    data = item;
    leftChild = rightChild = null;
    }
  }
  
  class yo {
    Node root;
  
    // Check for Full Binary Tree
    boolean isFullBinaryTree(Node node) {
  
    // Checking tree emptiness
    if (node == null)
      return true;
  
    // Checking the children
    if (node.leftChild == null && node.rightChild == null)
      return true;
  
    if ((node.leftChild != null) && (node.rightChild != null))
      return (isFullBinaryTree(node.leftChild) && isFullBinaryTree(node.rightChild));
  
    return false;
    }
  
    public static void main(String args[]) {
      yo tree = new yo();
      tree.root = new Node(1);
      tree.root.leftChild = new Node(2);
      tree.root.rightChild = new Node(3);
      tree.root.leftChild.leftChild = new Node(4);
      tree.root.leftChild.rightChild = new Node(5);
      tree.root.rightChild.leftChild = new Node(6);
      tree.root.rightChild.rightChild = new Node(7);
  
      if (tree.isFullBinaryTree(tree.root))
        System.out.print("The tree is a full binary tree");
      else
        System.out.print("The tree is not a full binary tree");
    }
  }


















// Binary Tree in Java

// Node creation
// class Node {
//     int key;
//     Node left, right;
  
//     public Node(int item) {
//     key = item;
//     left = right = null;
//     }
//   }
  
//   class yo {
//     Node root;
  
//     yo(int key) {
//     root = new Node(key);
//     }
  
//     yo() {
//     root = null;
//     }
  
//     // Traverse Inorder
//     public void traverseInOrder(Node node) {
//     if (node != null) {
//       traverseInOrder(node.left);
//       System.out.print(" " + node.key);
//       traverseInOrder(node.right);
//     }
//     }
  
//     // Traverse Postorder
//     public void traversePostOrder(Node node) {
//     if (node != null) {
//       traversePostOrder(node.left);
//       traversePostOrder(node.right);
//       System.out.print(" " + node.key);
//     }
//     }
  
//     // Traverse Preorder
//     public void traversePreOrder(Node node) {
//     if (node != null) {
//       System.out.print(" " + node.key);
//       traversePreOrder(node.left);
//       traversePreOrder(node.right);
//     }
//     }
  
//     public static void main(String[] args) {
//     yo tree = new yo();
  
//     tree.root = new Node(1);
//     tree.root.left = new Node(2);
//     tree.root.right = new Node(3);
//     tree.root.left.left = new Node(4);
  
//     System.out.print("Pre order Traversal: ");
//     tree.traversePreOrder(tree.root);
//     System.out.print("\nIn order Traversal: ");
//     tree.traverseInOrder(tree.root);
//     System.out.print("\nPost order Traversal: ");
//     tree.traversePostOrder(tree.root);
//     }
//   }










// // Tree traversal in Java

// class Node {
//     int item;
//     Node left, right;
  
//     public Node(int key) {
//     item = key;
//     left = right = null;
//     }
//   }
  
//   class yo {
//     // Root of Binary Tree
//     Node root;
  
//     yo() {
//     root = null;
//     }
  
//     void postorder(Node node) {
//     if (node == null)
//       return;
  
//     // Traverse left
//     postorder(node.left);
//     // Traverse right
//     postorder(node.right);
//     // Traverse root
//     System.out.print(node.item + "->");
//     }
  
//     void inorder(Node node) {
//     if (node == null)
//       return;
  
//     // Traverse left
//     inorder(node.left);
//     // Traverse root
//     System.out.print(node.item + "->");
//     // Traverse right
//     inorder(node.right);
//     }
  
//     void preorder(Node node) {
//     if (node == null)
//       return;
  
//     // Traverse root
//     System.out.print(node.item + "->");
//     // Traverse left
//     preorder(node.left);
//     // Traverse right
//     preorder(node.right);
//     }
  
//     public static void main(String[] args) {
//     yo tree = new yo();
//     tree.root = new Node(1);
//     tree.root.left = new Node(12);
//     tree.root.right = new Node(9);
//     tree.root.left.left = new Node(5);
//     tree.root.left.right = new Node(6);
  
//     System.out.println("Inorder traversal");
//     tree.inorder(tree.root);
  
//     System.out.println("\nPreorder traversal ");
//     tree.preorder(tree.root);
  
//     System.out.println("\nPostorder traversal");
//     tree.postorder(tree.root);
//     }
//   }