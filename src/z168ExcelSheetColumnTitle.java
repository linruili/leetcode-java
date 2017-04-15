
public class z168ExcelSheetColumnTitle
{
	public static String convertToTitle(int n)
	{
		StringBuilder s = new StringBuilder();
		while(n>0)
		{
			n -= 1;
			char c = (char) (65+n%26);
			s.insert(0, c);
			n /= 26;
		}
		return s.toString();
	}

	public static void main(String[] args)
	{
		System.out.println(convertToTitle(28*26));
	}

}
