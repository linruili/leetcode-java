
public class z43MultiplyStrings
{
	public static String multiply(String num1, String num2)
	{
		num1 = new StringBuilder(num1).reverse().toString();
		num2 = new StringBuilder(num2).reverse().toString();
		int[] num3 = new int[num1.length()+num2.length()];
		for(int i=0 ; i<num2.length() ; ++i)
		{
			int k1 = num2.charAt(i)-'0';
			for(int j=0 ; j<num1.length() ; ++j)
			{
				int k2 = num1.charAt(j)-'0';
				num3[i+j] += k1*k2;
			}
		}
		StringBuilder sum = new StringBuilder();
		for(int i=0 ; i<num3.length ; ++i)
		{
			int k1 = num3[i]%10;
			int k2 = num3[i]/10;
			sum.insert(0, k1);
			if(k2>0)
				num3[i+1] += k2;
		}
		while(sum.length()>0 && sum.charAt(0)=='0')
			sum.deleteCharAt(0);
		return sum.length()==0 ? "0" : sum.toString();
	}

	public static void main(String[] args)
	{
		System.out.println(multiply("11","11"));

	}

}
