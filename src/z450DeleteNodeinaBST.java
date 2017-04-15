
public class z450DeleteNodeinaBST
{
	public TreeNode deleteNode(TreeNode root, int key)
	{
		if(root == null)
			return root;
		if(key>root.val)
			root.right = deleteNode(root.right, key);
		else if(key<root.val)
			root.left = deleteNode(root.left, key);
		else if(key == root.val)
		{
			if(root.left == null)
				return root.right;
			else if(root.right == null)
				return root.left;
			else
			{
				TreeNode delete = root.right;
				while(delete.left != null)
					delete = delete.left;
				root.val = delete.val;
				delete.val = key;
				root.right = deleteNode(root.right, key);
			}
		}
		return root;
	}
	
	
	public static void main(String[] args)
	{
		
	}

}
