import java.util.Arrays;

public class z179LargestNumber
{
	public String largestNumber(int[] nums)
	{
		String ans="";
		String[] str = new String[nums.length];
		for(int i=0; i<nums.length; ++i)
			str[i] = nums[i]+"";
		Arrays.sort(str, (a,b)->(a+b).compareTo(b+a));
		if(str[str.length-1].equals("0"))
			return "0";
		for(String s : str)
			ans = s + ans;
		return ans;
	}

	public static void main(String[] args)
	{

	}

}
