
import java.util.ArrayList;

public class z416PartitionEqualSubsetSum
{
	//变形：是否存在两个不同子串，其和相等
    public boolean canPartition2(int[] nums)
    {
        boolean ifNums[] = new boolean[20001];
        ArrayList<Integer> sums  = new ArrayList<Integer>();
        sums.add(0);
        for(int i=0 ; i<nums.length ; ++i)
        	for(int sum:sums)
        		if(ifNums[sum+nums[i]] == true)
        			return true;
        		else
        			ifNums[sum+nums[i]] = true;
        return false;
        
    }
    
    public static boolean canPartition(int[] nums)
    {
        boolean ifNums[] = new boolean[20001];
        ArrayList<Integer> sums  = new ArrayList<Integer>();
        sums.add(0);
        int total = 0;
        for(int i=0 ;i<nums.length ; ++i)
        	total += nums[i];
        if(total%2 ==1)
        	return false;
        for(int i=0 ; i<nums.length ; ++i)
        {
        	int size = sums.size();
        	for(int j=0 ;j<size ; ++j)
        	{
        		int tmp = sums.get(j)+nums[i];
        		if(ifNums[tmp] != true)
        		{
        			ifNums[tmp] = true;
        			if(tmp < total/2)
        				sums.add(tmp);
        		}
        		
        		if(tmp == total/2)
        			return true;
        	}
        }
        	
        return false;
    }

	public static void main(String[] args)
	{
		int[] a = {1, 5, 11, 5};
		System.out.println(canPartition(a));

	}

}
