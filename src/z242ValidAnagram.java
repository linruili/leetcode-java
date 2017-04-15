
public class z242ValidAnagram
{
//	¿ìÅÅ
//	public String strQuickSort(String s, int l, int r)
//	{
//		StringBuilder sb = new StringBuilder(s);
//		int i=l, j=r;
//		if(l>r)
//			return "";
//		char c = sb.charAt(i);
//		while(i<j)
//		{
//			while(i<j && sb.charAt(j)>c)
//				--j;
//			if(i<j)
//			{
//				sb.setCharAt(i, sb.charAt(j));
//				++i;
//			}
//			while(i<j && sb.charAt(i)<c)
//				++i;
//			if(i<j)
//			{
//				sb.setCharAt(j, sb.charAt(i));
//				--j;
//			}
//		}
//		sb.setCharAt(i, c);
//		return strQuickSort(sb.toString(), l, i-1)+ c + strQuickSort(sb.toString(), i+1, r);
//	}
	public boolean isAnagram(String s, String t)
	{
		if(s.length() != t.length())
			return false;
		int[] count = new int[26];
		for(int i=0; i<s.length(); ++i)
			count[s.charAt(i)-'a']++;
		for(int i=0; i<t.length(); ++i)
			count[t.charAt(i)-'a']--;
		for(int i=0; i<26; ++i)
			if(count[i] != 0)
				return false;
		return true;
	}

	public static void main(String[] args)
	{

	}

}
