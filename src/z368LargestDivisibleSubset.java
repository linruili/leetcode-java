import java.util.*;

public class z368LargestDivisibleSubset
{
	public static List<Integer> largestDivisibleSubset(int[] nums)
	{
		int[] dp = new int[nums.length];
		int[] path = new int[nums.length];
		List<Integer> ans = new ArrayList<>();
		if(nums.length==0)
			return ans;
		Arrays.sort(nums);
		Arrays.fill(dp, 1);
		for(int i=0 ; i<nums.length ; ++i)
			path[i] = i;
		for(int i=0 ; i<nums.length ; ++i)
		{
			for(int j=0 ; j<i ; ++j)
				if(nums[i]%nums[j]==0 && dp[i] < dp[j]+1)
				{
					dp[i] = dp[j]+1;
					path[i] = j;
				}
		}
		int maxlen = dp[0] , maxIndex = 0;
		for(int i=0 ; i<dp.length ; ++i)
			if(dp[i]>maxlen)
			{
				maxlen = dp[i];
				maxIndex = i;
			}
		while(path[maxIndex] != maxIndex)
		{
			ans.add(nums[maxIndex]);
			maxIndex = path[maxIndex];
		}
		ans.add(nums[maxIndex]);
		return ans;
	}

	public static void main(String[] args)
	{
		System.out.println(largestDivisibleSubset(new int[]{}));

	}

}
