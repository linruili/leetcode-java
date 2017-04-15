

public class z110BalancedBinaryTree
{
	public int DFS(TreeNode root)
	{
		if(root==null)
			return 0;
		int l = DFS(root.left);
		int r = DFS(root.right);
		if(l==Integer.MAX_VALUE || r ==Integer.MAX_VALUE || Math.abs(l-r)>1)
			return Integer.MAX_VALUE;
		return Math.max(l, r)+1;
	}
	public boolean isBalanced(TreeNode root)
	{
		if(DFS(root)==Integer.MAX_VALUE)
			return false;
		return true;
	}

}
