


public class z129SumRoottoLeafNumbers
{
	int ans=0;
	public void pathSum(TreeNode root , int sum)
	{
		if(root==null)
			return;
		if(root.left==null && root.right==null)
		{
			ans += sum*10+root.val;
			return;
		}
		pathSum(root.left, sum*10+root.val);
		pathSum(root.right, sum*10+root.val);
	}
    public int sumNumbers(TreeNode root) 
    {
        pathSum(root, 0);
        return ans;
    }

}
