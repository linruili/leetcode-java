
public class z392IsSubsequence
{
    public static boolean isSubsequence(String s, String t) 
    {
    	if(s.equals(""))
    		return true;
    	int count = 0;
    	int i,j=-1;
        for(i=0 ;i<s.length()&&j<t.length() ; ++i)
        {
        	++j;
        	for( ; j<t.length() ; ++j)
        		if(s.charAt(i) == t.charAt(j))
        		{
        			++count;
        			break;
        		}
        			
        }
        if(s.length() != count)
        	return false;
        else
        	return true;
    }

	public static void main(String[] args)
	{
		System.out.println(isSubsequence("acb","ahbgdc"));

	}

}
