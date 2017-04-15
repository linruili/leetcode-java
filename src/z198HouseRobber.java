
public class z198HouseRobber
{
    public int rob(int[] nums) 
    {
    	int len = nums.length;
    	if(len ==0)
    		return 0;
    	int[] money = new int[len];
    	money[0] = nums[0];
    	if(len == 1)
    		return money[0];
    	money[1] = Math.max(nums[0], nums[1]);
    	if(len ==2)
    		return money[1];
    	for(int i=2 ;i<nums.length ; ++i)
    	{
    		money[i] = Math.max(money[i-1], money[i-2]+nums[i]);
    	}
    	return Math.max(money[len-1], money[len-2]);
        
    }

	public static void main(String[] args)
	{

	}

}
