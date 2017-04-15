
public class z124BinaryTreeMaximumPathSum
{
	int ans=-99999999;
	
	public static Integer max(Integer... values)
	{
	     Integer maxValue = null;
	     for(Integer value : values)
	         if(maxValue == null || maxValue < value)
	              maxValue = value;
	     return maxValue;
	}

	public int DFS(TreeNode root)
	{
		if(root==null)
			return -99999999;
		int pathSum;
		int l = DFS(root.left);
		int r = DFS(root.right);
		pathSum = max(root.val, max(l, r)+root.val);
		ans = max(pathSum, max(l,r), l+r+root.val, ans);
		return pathSum;
	}
	
	public int maxPathSum(TreeNode root)
	{
		DFS(root);
		return ans;
	}

}
//		System.out.println(root.val +" "+ pathSum+ " "+ ans);
