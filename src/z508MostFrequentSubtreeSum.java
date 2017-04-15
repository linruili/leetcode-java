import java.util.HashMap;
import java.util.LinkedList;

public class z508MostFrequentSubtreeSum
{
	int maxCount = 0;
	public int[] findFrequentTreeSum(TreeNode root)
	{
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		treeSum(root, map);
		LinkedList<Integer> ans = new LinkedList<>();
		for(Integer key: map.keySet())
			if(map.get(key) == maxCount)
				ans.add(key);
		int[] result = new int[ans.size()];
		for(int i=0; i<ans.size(); ++i)
			result[i] = ans.get(i);
		return result;
	}
	public int treeSum(TreeNode root, HashMap<Integer,Integer> map)
	{
		if(root==null)
			return 0;
		if(root.left==null && root.right==null)
		{
			int value = map.getOrDefault(root.val, 0)+1;
			map.put(root.val, value);
			if(value > maxCount)
				maxCount = value;
			return root.val;
		}
		int key = root.val + treeSum(root.left, map)+ treeSum(root.right, map);
		int value = map.getOrDefault(key, 0)+1;
		map.put(key, value);
		if(value > maxCount)
			maxCount = value;
		return key;
	}

	public static void main(String[] args)
	{

	}

}
