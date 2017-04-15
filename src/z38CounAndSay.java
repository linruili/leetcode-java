
public class z38CounAndSay
{
	public String countAndSay(int n)
	{
		String s = "1";
		for (int i=1 ; i<n ; ++i)
			s = convert(s);
		return s;
	}
	
	public String convert(String s)
	{
		StringBuilder next = new StringBuilder();
		int i=0 , len;
		char temp;
		while(i<s.length())
		{
			len = 1;
			temp = s.charAt(i);
			++i;
			while(i<s.length() && temp==s.charAt(i))
			{
				++len;
				++i;
			}
			next.append(String.valueOf(len));
			next.append(temp);
		}
		return next.toString();
	}

	public static void main(String[] args)
	{
		z38CounAndSay t = new z38CounAndSay();
		System.out.println(t.countAndSay(4));

	}

}
