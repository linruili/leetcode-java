import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class z491IncreasingSubsequences
{
	public List<List<Integer>> findSubsequences(int[] nums)
	{
		List<Integer> tmp = new ArrayList<>();
		Set<List<Integer>> ans = new HashSet<List<Integer>>();
		combination(nums, 0, ans, tmp);
		return (new ArrayList(ans));
	}
	public void combination(int[] nums, int start,Set<List<Integer>> ans, List<Integer> tmp)
	{
		for(int i=start; i<nums.length; ++i)
		{
			if(tmp.size()==0 || nums[i]>=tmp.get(tmp.size()-1))
			{
				tmp.add(nums[i]);
				if(tmp.size()>=2)
					ans.add(new ArrayList(tmp));
				combination(nums, i+1, ans, tmp);
				tmp.remove(tmp.size()-1);
			}
		}
	}

	public static void main(String[] args)
	{
		long startTime=System.currentTimeMillis(); 
		int[] nums = {4,6,7,7};
		z491IncreasingSubsequences s = new z491IncreasingSubsequences();
		List<List<Integer>> ans = s.findSubsequences(nums);
		for(int i=0; i<ans.size(); ++i)
		{
			List<Integer> list = ans.get(i);
			for(int j=0; j<list.size(); ++j)
				System.out.print(list.get(j));
			System.out.println();
		}
		long endTime=System.currentTimeMillis(); 
		System.out.println(endTime-startTime);

	}

}
