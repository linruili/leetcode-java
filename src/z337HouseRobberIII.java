
public class z337HouseRobberIII
{
	public int rob(TreeNode root)
	{
		//value[0]是抢该点所得最多钱，value[1]是不抢改点所得最多钱
		int value[] = new int[2];
		value = DFS(root);
		return Math.max(value[0], value[1]);
	}
	
	public int[] DFS(TreeNode root)
	{
		int[] value = new int[2];
		if(root == null)
			return value;
		int[] left = DFS(root.left);
		int[] right = DFS(root.right);
		value[0] = left[1] + right[1] + root.val;
		value[1] = Math.max(left[0],left[1]) + Math.max(right[0], right[1]);
		return value;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
