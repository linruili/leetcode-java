
public class z121BestTimetoBuyandSellStock
{
	public int maxProfit(int[] prices) {
        int money = 0;
    	for(int i=0 ; i<prices.length ; ++i)
    	{
    		if(i<prices.length-1 && prices[i]<prices[i+1])
    		{
    			int lowPrice = prices[i];
    			int maxPrice = prices[i+1];
    			for(int j=i+1 ; j<prices.length ; ++j)
    				if(prices[j]>maxPrice)
    					maxPrice = prices[j];
    			if(money < maxPrice-lowPrice)
    				money = maxPrice-lowPrice;
    		}
    	}
    	return money;
    }

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
