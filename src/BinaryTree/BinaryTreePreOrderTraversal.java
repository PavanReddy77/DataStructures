package BinaryTree;

public class BinaryTreePreOrderTraversal
{
	//To Create Tree Node.
	public static class TreeNode
	{
		int data;
		TreeNode left;
		TreeNode right;
		public TreeNode(int data)
		{
			this.data = data;
		}
	}
	
	//Traversal: Node - Left SubTree - Right SubTree.
	public static TreeNode createBinaryTree()
	{
		TreeNode rootNode = new TreeNode(50);
		
		TreeNode node10 = new TreeNode(10);
		TreeNode node30 = new TreeNode(30);
		TreeNode node20 = new TreeNode(20);
		TreeNode node40 = new TreeNode(40);
		TreeNode node60 = new TreeNode(60);
		TreeNode node90 = new TreeNode(90);
		TreeNode node80 = new TreeNode(80);
		
		rootNode.left = node10;
		rootNode.right = node30;
		
		node10.left = node20;
		node10.right = node40;
		
		node40.left = node60;
		
		node30.left = node90;
		node30.right = node80;
		
		return rootNode;
	}
	
	//Pre-Order Recursive Solution.
	public void preOrderTraversal(TreeNode root)
	{
		if(root != null)
		{
			System.out.print(root.data + " ");
			
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
		}
	}
	
	public static void main(String args[])
	{
		BinaryTreePreOrderTraversal binaryTree = new BinaryTreePreOrderTraversal();
		TreeNode rootNode = createBinaryTree();
		binaryTree.preOrderTraversal(rootNode);
	}
}
