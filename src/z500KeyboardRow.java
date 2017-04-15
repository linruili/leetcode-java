import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class z500KeyboardRow
{
	public String[] findWords(String[] words) 
	{
		ArrayList<String> ans = new ArrayList<>();
		String[] strs = new String[3];
		strs[0] = "qwertyuiop";
		strs[1] = "asdfghjkl";
		strs[2] = "zxcvbnm";
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i=0; i<strs.length; ++i)
			for(char c:strs[i].toCharArray())
				map.put(c, i);
		for(String word:words)
		{
			if(word == "")
				continue;
			String originWord = word;
			word = word.toLowerCase();
			int index = map.get(word.charAt(0));
			int i;
			for(i=1; i<word.length(); ++i)
				if(map.get(word.charAt(i)) != index)
					break;
			if(i==word.length())
				ans.add(originWord);
		}
		return (String[])ans.toArray(new String[ans.size()]);
	}

	public static void main(String[] args)
	{
		

	}

}
