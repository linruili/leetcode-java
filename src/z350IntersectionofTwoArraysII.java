import java.util.ArrayList;

public class z350IntersectionofTwoArraysII
{
	public void quickSort(int[] nums, int l, int r)
	{
		if(l>r)
			return;
		int i=l,j=r;
		int tmp = nums[l];
		while(i<j)
		{
			while(i<j && nums[j]>tmp)
				--j;
			if(i<j)
			{
				nums[i] = nums[j];
				++i;
			}
			while(i<j && nums[i]<tmp)
				++i;
			if(i<j)
			{
				nums[j] = nums[i];
				--j;
			}
		}
		nums[i] = tmp;
		quickSort(nums,l,i-1);
		quickSort(nums,i+1,r);
	}
	public int[] intersect(int[] nums1, int[] nums2)
	{
		ArrayList list = new ArrayList();
		quickSort(nums1,0,nums1.length-1);
		quickSort(nums2,0,nums2.length-1);
		int i=0,j=0;
		while(i<nums1.length && j<nums2.length)
		{
			while(i<nums1.length && j<nums2.length && nums1[i]==nums2[j])
			{
				list.add(nums1[i]);
				++i;
				++j;
			}
			while(i<nums1.length && j<nums2.length && nums1[i]>nums2[j])
				++j;
			while(i<nums1.length && j<nums2.length && nums1[i]<nums2[j])
				++i;
		}
		int[] ans = new int[list.size()];
		for(i=0; i<ans.length; ++i)
			ans[i] = (int) list.get(i);
		return ans;
	}

	public static void main(String[] args)
	{

	}

}
