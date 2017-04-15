import java.util.HashSet;
import java.util.Set;

public class z421MaximumXORofTwoNumbersinanArray
{
	
	
	public int findMaximumXOR(int[] nums)
	{
		int max=0, mask=0;
		for(int i=31; i>=0; --i)
		{
			mask = mask | (1<<i);
			Set<Integer> s = new HashSet();
			for(int num:nums)
				s.add(num & mask);
			int tmp = max | (1<<i);
			for(Integer prefix:s)
			{
				if(s.contains(prefix^tmp))
				{
					max = tmp;
					break;
				}
			}
		}
		return max;
	}

	public static void main(String[] args)
	{
		int[] a = {1, 4};
		z421MaximumXORofTwoNumbersinanArray s = new z421MaximumXORofTwoNumbersinanArray();
		int max = s.findMaximumXOR(a);
		System.out.println(max);

	}

}
