
public class z215KthLargestElementInAnArray
{
	public int findKthLargest(int[] nums, int k) 
	{
		if (nums == null || nums.length == 0)
			return Integer.MAX_VALUE;
		return quickSelect(nums, 0, nums.length-1, nums.length - k);  //是nums.length - k而不是k
	}
	public int quickSelect(int[] nums, int start, int end, int k)
	{
		if (start > end)
			return Integer.MAX_VALUE;
		int pivot = nums[end];
		int left = start;
		for(int i=start; i<end; ++i)
			if(nums[i] < pivot)
				swap(nums, i, left++);
		swap(nums, left, end);
		if(left == k)
			return nums[k];
		else if(left < k)
			return quickSelect(nums, left+1, end, k);
		else
			return quickSelect(nums, start, left-1, k);
	}

	public void swap(int[] nums, int i, int j)
	{
		int tmp = nums[i];
		nums[i] = nums[j];
		nums[j] = tmp;
	}
	public static void main(String[] args)
	{
		int[] a = {1};
		z215KthLargestElementInAnArray s = new z215KthLargestElementInAnArray();
		System.out.println(s.findKthLargest(a, 1));

	}

}
