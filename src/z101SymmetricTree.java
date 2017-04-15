
public class z101SymmetricTree
{
	public boolean isSymmetricRec(TreeNode left, TreeNode right)
	{
		if(left==null && right==null)
			return true;
		if(left!=null && right!=null)
			if(left.val==right.val)
				return isSymmetricRec(left.left, right.right) && isSymmetricRec(left.right, right.left);
		return false;
	}
	
	public boolean isSymmetric(TreeNode root)
	{
		if(root==null)
			return true;
		return isSymmetricRec(root.left, root.right);
	}

	public static void main(String[] args)
	{
		

	}

}
