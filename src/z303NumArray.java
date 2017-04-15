
public class z303NumArray
{
	int[] sum;
    public z303NumArray(int[] nums)
    {
    	int len = nums.length;
    	sum = new int[len];
    	if(len != 0)
    		sum[0] = nums[0];
    	if(len > 1)
    		for(int i=1 ; i<nums.length ; ++i)
    			sum[i] = sum[i-1] + nums[i];
    }

    public int sumRange(int i, int j)
    {
    	if(i==0)
    		return sum[j];
        return sum[j]-sum[i-1];
    }

	public static void main(String[] args)
	{
		int[] b = {1,2,3,4};
		z303NumArray a = new z303NumArray(b);
		System.out.println(a.sumRange(0, 2));
		

	}

}
