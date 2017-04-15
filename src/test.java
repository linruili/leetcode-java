
public class test
{
	public static TreeNode tt(TreeNode root)
	{
		if(root==null)
			return null;
		root = tt(root.left);
		if(root.left==null)
			root = null;
		return root;
		
	}
	public static void main(String[] args)
	{
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root = tt(root);
		System.out.println(root.left.val);
	}

}
