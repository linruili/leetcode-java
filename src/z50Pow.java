
public class z50Pow {
	public static double myPow(double x, int n) 
	{
		boolean tag = false;
		double res = 1;
        double v = x;
        if(n==0)
        	return 1.0;
        while(n!=0 && res!=0)
        {
        	if(n%2==1)
        		res *= v;
        	if(n%2==-1)
        		res /= v;
        	v *= v;
        	n /= 2;
        }
        return res;
        	
    }

	public static void main(String[] args) 
	{
		System.out.println(myPow(2.00000
				,-2147483648));
		

	}

}
