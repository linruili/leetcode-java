
public class z151ReverseWordsInAString
{
	public String reverseWords(String s)
	{
		int i;
		s = s.trim();
		if(s.length()==0)
			return "";
		StringBuilder sb = new StringBuilder(s);
		for(i=0 ; i<sb.length()-1 ; ++i)
			if(sb.charAt(i)==' ' && sb.charAt(i+1)==' ')
			{
				sb.deleteCharAt(i);
				--i;
			}
		String[] strs = sb.toString().split(" ");
		StringBuilder ans = new StringBuilder();
		ans.append(strs[strs.length-1]);
		for(i=strs.length-2 ; i>=0 ; --i)
		{
			ans.append(' ');
			ans.append(strs[i]);
		}
		return ans.toString();
	}

	public static void main(String[] args)
	{
		//ReverseWordsInAString t = new ReverseWordsInAString();
		//System.out.println(t.reverseWords("the  sky is blue "));

	}

}
