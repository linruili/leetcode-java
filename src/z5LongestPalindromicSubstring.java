
public class z5LongestPalindromicSubstring
{
	public String longestPalindrome(String s)
	{
		int i;
		String temp ,res="";
		int maxlen = 0;
		for(i=0 ; i<s.length() ; ++i)
		{
			temp = maxlenPalindrome(s, i ,i);
			if(temp.length() > maxlen)
			{
				maxlen = temp.length();
				res = temp;
			}
			temp = maxlenPalindrome(s, i ,i+1);
			if(temp.length() > maxlen)
			{
				maxlen = temp.length();
				res = temp;
			}
		}
		return res;
	
	}
	
	public String maxlenPalindrome(String s , int l, int r)
	{
		while(l>=0 && r<s.length() &&s.charAt(l)==s.charAt(r))
		{
			--l;++r;
		}
		if(l==r-1)
			return "";
		return s.substring(l+1, r);
	}
	
	

	public static void main(String[] args)
	{
		z5LongestPalindromicSubstring t = new z5LongestPalindromicSubstring();
		System.out.println(t.longestPalindrome("abaa"));

	}

}
