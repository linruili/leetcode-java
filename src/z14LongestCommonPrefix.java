
public class z14LongestCommonPrefix
{
	public String longestCommonPrefix(String[] strs)
	{
		int i,j;
		if(strs.length == 0)
			return "";
		if(strs.length == 1)
			return strs[0];
		for(i=0 ; i<strs[0].length() && i<strs[1].length() ; ++i)
			if(strs[0].charAt(i) != strs[1].charAt(i))
				break;
		String sub = strs[0].substring(0, i);
		for(i=2 ; i<strs.length ; ++i)
		{
			for(j=0 ; j<sub.length() && j<strs[i].length() ; ++j)
				if(strs[i].charAt(j) != sub.charAt(j))
					break;
			sub = sub.substring(0, j);
		}
		return sub;
	}

	public static void main(String[] args)
	{
		//LongestCommonPrefix t = new LongestCommonPrefix();
		//t.longestCommonPrefix([]);

	}

}
