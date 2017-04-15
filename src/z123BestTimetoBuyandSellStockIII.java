
public class z123BestTimetoBuyandSellStockIII
{
    
    public static int maxProfit(int[] prices)
    {
    	int len = prices.length;
    	if(len == 0)
    		return 0;
    	int[] f1 = new int[len] ;
    	int[] f2 = new int[len] ;
    	int lowPrice = prices[0];
    	for(int i=1 ; i<len ; ++i)
    	{
    		if(prices[i-1]<prices[i])
    			f1[i] = Math.max(prices[i]-lowPrice, f1[i-1]);
    		else
    		{
    			f1[i] = f1[i-1];
    			if(prices[i] < lowPrice)
    				lowPrice = prices[i];
    		}	
    	}
    	int highPrice = prices[len-1];
    	for(int i=len-2 ; i>=0 ; --i)
    	{
    		if(prices[i]<prices[i+1])
    			f2[i] = Math.max(highPrice-prices[i], f2[i+1]);
    		else
    		{
    			f2[i] = f2[i+1];
    			if(prices[i] > highPrice)
    				highPrice = prices[i];
    		}
    	}
    	int money = 0;
    	for(int i=0 ; i<len ; ++i)
    		if(f1[i]+f2[i] > money)
    			money = f1[i]+f2[i];
    	return money;
    }

	public static void main(String[] args)
	{
		int[] a = {1,2,3,2,5,9};
		System.out.println(maxProfit(a));

	}

}
