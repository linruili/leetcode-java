
public class z213HouseRobberII
{
    public int rob(int[] nums) 
    {
    	int len = nums.length;
    	if(len ==0)
    		return 0;
    	int[] money1 = new int[len];
    	int[] money2 = new int[len];
    	if(len == 1)
    		return nums[0];
    	if(len ==2)
    		return Math.max(nums[0], nums[1]);
    	
    	money1[0] = nums[0];
    	money1[1] = Math.max(nums[0], nums[1]);
    	for(int i=2 ;i<len-1 ;++i)
    		money1[i] = Math.max(money1[i-2]+nums[i], money1[i-1]);
    	if(len == 3)
    		return Math.max(money1[1] , nums[2]);
    	money2[1] = nums[1];
    	money2[2] = Math.max(nums[1], nums[2]);
    	for(int i=3 ;i<len ; ++i)
    		money2[i] = Math.max(money2[i-2]+nums[i], money2[i-1]);
    	return Math.max(money2[len-1], money1[len-2]);
    }

	public static void main(String[] args)
	{

	}

}
