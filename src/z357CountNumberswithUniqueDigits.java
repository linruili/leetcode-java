
public class z357CountNumberswithUniqueDigits 
{
	public static int countNumbersWithUniqueDigits(int n)
	{
		int[] f = new int[20];
		if(n==0)
			return 1;
		f[1] = 10;
		for(int i=2 ; i<=10 ; ++i)
		{
			f[i]=9;
			for(int j=9 ; j>=9-i+2 ; --j)
				f[i] *= j;
		}
		if(n>10)
			n = 10;
		int res = 0;
		for(int i=1; i<=n ; ++i)
			res += f[i];
		return res;
	}

	public static void main(String[] args) 
	{
		

	}

}
