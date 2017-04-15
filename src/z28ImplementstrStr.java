
public class z28ImplementstrStr
{
	public int strStr(String haystack, String needle)
	{
		int i,j;
		for(i=0 ; i<=haystack.length()-needle.length() ; ++i)
		{
			for(j=0 ; j<needle.length() ; ++j)
				if(needle.charAt(j) != haystack.charAt(i+j))
					break;
			if(j==needle.length())
				return i;
		}
		return -1;
	}

	public static void main(String[] args)
	{
		z28ImplementstrStr t = new z28ImplementstrStr();
		System.out.println(t.strStr("123", "23"));
		

	}

}
