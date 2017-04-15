
public class z88MergeSortedArray
{
	public void merge(int[] nums1, int m, int[] nums2, int n)
	{
		int i=0,j=0;
		if(m==0)
		{
			for(i=0; i<n; ++i)
				nums1[i]= nums2[i];
			return;
		}
		if(n==0)
			return;
		
		for(i=m-1; i>=0; --i)
			nums1[i+n] = nums1[i];
		for(i=0,j=0; i<m&&j<n; )
		{
			if(nums1[i+n] < nums2[j])
				nums1[i+j] = nums1[n+i++];
			else
				nums1[i+j] = nums2[j++];
		}
		while(j<n)
			nums1[i+j] = nums2[j++];
	}

	public static void main(String[] args)
	{
		z88MergeSortedArray s = new z88MergeSortedArray();
		int[] a = {0,2,3};
		int[] b = {1};
		s.merge(a,2,b,1);
		for(int i:a)
			System.out.println(i);

	}
}
