


public class z105ConstructBinaryTreefromPreorderandInorderTraversal
{
	public TreeNode buildTreeRecur(int[] preorder, int l1,int r1, int[] inorder, int l2, int r2)
	{
		if(l1>r1)
			return null;
		TreeNode root = new TreeNode(preorder[l1]);
		if(l1==r1)
			return root;
		int i;
		for(i=l2; i<=r2 ; ++i)
			if(inorder[i]==preorder[l1])
				break;
		root.left = buildTreeRecur(preorder, l1+1, l1+(i-l2), inorder, l2, i-1);
		root.right  = buildTreeRecur(preorder, l1+(i-l2)+1, r1, inorder, i+1, r2);
		return root;
	}
	
    public TreeNode buildTree(int[] preorder, int[] inorder) 
    {
    	return buildTreeRecur(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1);
  
    }

	public static void main(String[] args)
	{

	}

}
