import java.util.*;

public class z3LongestSubstringWithoutRepeatingCharacters
{
	public int lengthOfLongestSubstring(String s)
	{
		int i,j,k;
		int maxlen = 0;
		ArrayList<Character> ch = new ArrayList<>();
		for(i=0 ; i<s.length() ; ++i)
		{
			char c = s.charAt(i);
			if(ch.contains(c))
			{
				k = ch.indexOf(c);
				for(j=0 ; j<=k ; ++j)
					ch.remove(0);
				ch.add(c);
			}
			else
			{
				ch.add(c);
				if(ch.size()>maxlen)
					maxlen = ch.size();
			}
		}
		return maxlen;
	}

	public static void main(String[] args)
	{
		z3LongestSubstringWithoutRepeatingCharacters t = new z3LongestSubstringWithoutRepeatingCharacters();
		System.out.println(t.lengthOfLongestSubstring("ohomm"));

	}

}
