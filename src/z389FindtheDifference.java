import java.util.HashMap;

public class z389FindtheDifference
{
	public char findTheDifference(String s, String t)
	{
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0; i<s.length(); ++i)
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
		for(int i=0; i<t.length(); ++i)
		{
			int value = map.getOrDefault(t.charAt(i), 0)-1;
			if(value<0)
				return t.charAt(i);
			map.put(t.charAt(i), value);
		}
		return '-';
	}

	public static void main(String[] args)
	{

	}

}
