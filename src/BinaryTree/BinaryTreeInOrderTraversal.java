package BinaryTree;

public class BinaryTreeInOrderTraversal
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
	
	//Traversal: Left SubTree - Node - Right SubTree.
	public static TreeNode createBinaryTree()
	{
		TreeNode rootNode = new TreeNode(40);
		
		TreeNode node20 = new TreeNode(20);
		TreeNode node10 = new TreeNode(10);
		TreeNode node30 = new TreeNode(30);
		TreeNode node60 = new TreeNode(60);
		TreeNode node50 = new TreeNode(50);
		TreeNode node70 = new TreeNode(70);
		
		rootNode.left = node20;
		rootNode.right = node60;
		
		node20.left = node10;
		node20.right = node30;
		
		node60.left = node50;
		node60.right = node70;
		
		return rootNode;
	}
	
	//In-Order Recursive Solution.
	public void inOrderTraversal(TreeNode root)
	{
		if(root != null)
		{
			inOrderTraversal(root.left);
			System.out.print(root.data + " ");
			inOrderTraversal(root.right);
		}
	}
	
	public static void main(String args[])
	{
		BinaryTreeInOrderTraversal binaryTree = new BinaryTreeInOrderTraversal();
		TreeNode rootNode = createBinaryTree();
		binaryTree.inOrderTraversal(rootNode);
	}
}
