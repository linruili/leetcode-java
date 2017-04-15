
public class z189RotateArray
{
	public void basicRotate(int[] nums , int l, int r)
	{
		int len = r-l+1;
		int tmp;
        for(int i=0 ; i<len/2 ; ++i)
        {
        	tmp = nums[i+l];
        	nums[i+l] = nums[r-i];
        	nums[r-i] = tmp;
        }
	}
	public void rotate(int[] nums, int k) 
	{
		int len = nums.length;
		k %= len;
		basicRotate(nums, 0, len-k-1);
		basicRotate(nums, len-k, len-1);
		basicRotate(nums, 0, len-1);
    }

	public static void main(String[] args)
	{

	}

}
