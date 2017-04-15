import java.util.Arrays;

public class z377CombinationSumIV
{
    public static int combinationSum4(int[] nums, int target) 
    {
    	Arrays.sort(nums);
    	int[] dp = new int[target+1];
    	dp[0] = 1;
    	for(int i=1; i<=target ; ++i)
    	{
    		for(int j=0 ;j <nums.length ; ++j)
    			if(i - nums[j] < 0)
    				break;
    			else
	    			dp[i] += dp[i-nums[j]];
    	}
    	return dp[target];
    }

	public static void main(String[] args)
	{
		int[] a = {1,2,3};
		System.out.println(combinationSum4(a,4));

	}

}
