
public class z402RemoveKDigits
{
    public static String removeKdigits(String num, int k)
    {
    	StringBuilder sb = new StringBuilder(num);
    	if (k == 0)
        	return sb.toString();
    	while(sb.length()>0 && sb.charAt(0)=='0')
    		sb.deleteCharAt(0);
        for(int i=0; i<k ; ++i)
	        if(sb.charAt(i) == '0')
	        {
	        	if(i+1>=sb.length())
	        		return "0";
	        	return removeKdigits(sb.substring(i+1), k-i);
	        }
        if(num.length() == k)
        	return "0";
        for(int i=1 ;i<sb.length()&&k>0 ; )
        {
        	if(sb.charAt(i) >= sb.charAt(i-1))
        		++i;
        	else
        	{
        		sb.deleteCharAt(i-1);
        		if(i != 1)
        			--i;
        		--k;
        	}
        }
        while(k>0)
        {
        	sb.deleteCharAt(sb.length()-1);
        	--k;
        }
        while(sb.length()>0 && sb.charAt(0)=='0')
    		sb.deleteCharAt(0);
        if(sb.toString().equals(""))
        	return "0";
        return sb.toString();
    }

	public static void main(String[] args)
	{
		System.out.println(removeKdigits("120", 2));

	}

}
//48100   1230
