
public class z122BestTimetoBuyandSellStockII
{
    public static int  maxProfit(int[] prices)
    {
    	int money = 0;
    	for(int i=0 ; i<prices.length ; ++i)
    	{
    		if(i<prices.length-1 && prices[i]<prices[i+1])
    		{
    			int lowPrice = prices[i];
    			for(i=i+1 ; i<prices.length-1 ; ++i)
	    			if(prices[i+1]<prices[i])
	    			{
	    				money += prices[i]-lowPrice;
	    				break;
	    			}
    			if(i == prices.length-1)
    				money += prices[i]-lowPrice;
    		}
    	}
    	return money;
        
    }

	public static void main(String[] args)
	{
		int a[]={1,5,4,2,3};
		System.out.println(maxProfit(a));

	}

}
