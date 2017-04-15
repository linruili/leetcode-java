
public class z188BestTimetoBuyandSellStockIV188
{
	public static int maxProfit(int k, int[] prices) 
    {
		int len = prices.length;
		if(len == 0 || k==0)
    		return 0;
		if(k>len-1)
			k=len-1;
    	int [][] local = new int [len+1][k+1];
    	int [][] global = new int [len+1][k+1];
    	for(int i=2 ; i<=len ; ++i)
    	{
    		int diff = prices[i-1]-prices[i-2];
    		for(int j=1 ; j<=k ; ++j)
    		{
    			local[i][j] = Math.max
    					(global[i-1][j-1]+Math.max(diff, 0), local[i-1][j]+diff);
    			global[i][j] = Math.max(global[i-1][j], local[i][j]);
    		}
    	}
    	return global[len][k];
    }

	public static void main(String[] args)
	{
		int[] a = {1,2,3,2,5,7,3,5,8,3,5,2,9};
		System.out.println(maxProfit(2,a));

	}

}
