
public class z230KthSmallestElementInaBST
{
	int ans = 0;
	int cnt = 0;
	public void count(TreeNode root, int k)
	{
		if(root==null)
			return;
		count(root.left, k);
		cnt += 1;
		if(cnt==k)
		{
			ans = root.val;
			return;
		}
		count(root.right, k);
	}
	public int kthSmallest(TreeNode root, int k)
	{
		if(root==null)
			return 0;
		count(root, k);
		return ans;
	}

	public static void main(String[] args)
	{

	}

}
