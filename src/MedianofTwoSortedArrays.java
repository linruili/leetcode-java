
public class MedianofTwoSortedArrays
{
	public double findMedianSortedArrays(int[] nums1, int[] nums2)
	{
		int n1 = nums1.length;
		int n2 = nums2.length;
		if(n2>n1) return findMedianSortedArrays(nums2, nums1);
		if(n2==0) return (nums1[(n1-1)/2]+nums1[n1/2])/2.0;
		int lo=0, hi=n2*2;
		while(lo<=hi)
		{
			int mid2 = (lo+hi)/2;
			int mid1 = n1+n2-mid2;
			int l1 = (mid1==0)? Integer.MIN_VALUE: nums1[(mid1-1)/2];
			int r1 = (mid1==2*n1)? Integer.MAX_VALUE: nums1[mid1/2];
			int l2 = (mid2==0)? Integer.MIN_VALUE: nums2[(mid2-1)/2];
			int r2 = (mid2==2*n2)? Integer.MAX_VALUE: nums2[mid2/2];
			if(l1>r2)
				lo = mid2+1;
			else if(l2>r1)
				hi = mid2-1;
			else
				return ((double)Integer.max(l1, l2)+(double)Integer.min(r1, r2))/2;
		}
		return -1;
	}


	public static void main(String[] args)
	{

	}

}
