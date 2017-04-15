import java.util.ArrayList;
import java.util.List;



public class z199BinaryTreeRightSideView
{
	List<Integer> ans = new ArrayList();
	int level = 0;
	public void findRightView(TreeNode root, int nowLevel)
	{
		if(root==null)
			return;
		if(nowLevel>level)
		{
			++level;
			ans.add(root.val);
		}
		findRightView(root.right,  nowLevel+1);
		findRightView(root.left, nowLevel+1);
	}
	
	public List<Integer> rightSideView(TreeNode root)
	{
		findRightView(root, 1);
		return ans;
	}

	public static void main(String[] args)
	{

	}

}
