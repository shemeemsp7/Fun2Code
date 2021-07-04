/* Class containing left and right child of current
node and key value*/
class Node
{
	int key;
	Node left, right;

	public Node(int item)
	{
		key = item;
		left = right = null;
	}
}

// A Java program to introduce Binary Tree
class BinaryTree
{
	// Root of Binary Tree
	Node root;

	// Constructors
	BinaryTree(int key)
	{
		root = new Node(key);
	}

	BinaryTree()
	{
		root = null;
	}

	public static void main(String[] args)
	{
		BinaryTree tree = new BinaryTree();

		

		/* following is the tree after above statement

			1
			/ \
		    2 3	 
			/
		   4  5
			*/
		/*create root*/
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
	
		inorderTraversal(tree.root);
		
	}

	public static void inorderTraversal(Node root){
		//left root right

		if(root == null){
			return;
		}

		inorderTraversal(root.left);

		System.out.println(root.key);

		inorderTraversal(root.right);

	}
}
