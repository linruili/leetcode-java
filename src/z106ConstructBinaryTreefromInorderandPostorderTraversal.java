


public class z106ConstructBinaryTreefromInorderandPostorderTraversal
{
	public TreeNode buildTreeRecur(int[] inorder, int l1,int r1, int[] postorder, int l2, int r2)
	{
		if(l1>r1)
			return null;
		TreeNode root = new TreeNode(postorder[r2]);
		if(l1==r1)
			return root;
		int i;
		for(i=l1; i<=r1 ; ++i)
			if(postorder[r2]==inorder[i])
				break;
		root.left = buildTreeRecur(inorder, l1, i-1, postorder, l2, r2-(r1-i)-1);
		root.right  = buildTreeRecur(inorder, i+1, r1, postorder, r2-(r1-i), r2-1);
		return root;
	}
	
	public TreeNode buildTree(int[] inorder, int[] postorder) 
    {
    	return buildTreeRecur(inorder, 0, inorder.length-1, postorder, 0, postorder.length-1);
  
    }

	public static void main(String[] args)
	{

	}

}
