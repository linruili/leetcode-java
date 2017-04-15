
public class z108ConvertSortedArraytoBinarySearchTree
{
	public TreeNode sortedArrayToBST(int[] nums)
	{
		return divideToBST(nums, 0, nums.length-1);
	}
	public TreeNode divideToBST(int[] nums, int left, int right)
	{
		if(left>right)
			return null;
		int mid = (left+right)/2;
		TreeNode root = new TreeNode(nums[mid]);
		root.left = divideToBST(nums, left, mid-1);
		root.right = divideToBST(nums, mid+1, right);
		return root;
	}

}
