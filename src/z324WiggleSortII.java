
public class z324WiggleSortII
{
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
	
	public void wiggleSort(int[] nums) 
	{
		int len = nums.length;
		int mid = quickSelect(nums, 0, len-1, (len-1)/2); 
		int index[] = new int[len];
		for(int i=0; i<len; ++i)
			index[i] = (1+2*i)%(len|1);
		int i=0, j=0, k=len-1;
		while(j<=k)
		{
			if(nums[index[j]] > mid)
				swap(nums, index[i++], index[j++]);
			else if(nums[index[j]] < mid)
				swap(nums, index[j], index[k--]);
			else
				++j;
		}
    }

	public static void main(String[] args)
	{
		int a[] = {4,5,5,6};
		z324WiggleSortII s = new z324WiggleSortII();
		s.wiggleSort(a);
		for(int i=0; i<a.length; ++i)
			System.out.println(a[i]);

	}

}
