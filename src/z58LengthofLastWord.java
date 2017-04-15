
public class z58LengthofLastWord
{
	public int lengthOfLastWord(String s)
	{
		s = s.trim();
		int prior = s.indexOf(" ");
		if(prior == -1)
			return s.length();
		int next = s.indexOf(" " , prior+1);
		while(next != -1)
		{
			prior = next;
			next = s.indexOf(" " , prior+1);
		}
		return s.length()-prior-1;
	}

	public static void main(String[] args)
	{

	}

}
