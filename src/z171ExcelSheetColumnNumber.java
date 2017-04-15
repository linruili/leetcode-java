
public class z171ExcelSheetColumnNumber
{
	public static int titleToNumber(String s)
	{
		int n = 0;
		for(int i=0 ; i<s.length() ; ++i)
		{
			n += (s.charAt(i)-'A'+1) * Math.pow(26, s.length()-i-1);
		}
		return n;
	}

	public static void main(String[] args)
	{
		System.out.println(titleToNumber("A"));

	}

}
