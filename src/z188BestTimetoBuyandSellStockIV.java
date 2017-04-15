//方式可以，但超时
public class z188BestTimetoBuyandSellStockIV
{
	public static int getProfit(int[][] f , int k , int p ,int[] prices)
	{
		int len = f.length;
		int money = 0;
		if(k==1)
			return f[p][len-1];
		if(p == len-1)
			return 0;
		for(int i=p+1 ; i<len ; ++i)
		{
			if(prices[i-1] < prices[i] && i<len-1)
				continue;
			int tmp = f[p][i] + getProfit(f, k-1, i , prices);
			if(tmp > money)
				money = tmp;
		}
		return money;
	}
	
	public static int maxProfit(int k, int[] prices) 
    {
		int len = prices.length;
    	if(len == 0 || k==0)
    		return 0;
    	int[][] f = new int[len][len];
    	for(int i=0 ;i<len-1 ; ++i)
    	{
    		int lowPrice = prices[i];
    		for(int j=i+1 ; j<len ; ++j)
			{
				if(prices[j-1]<prices[j])
					f[i][j] = Math.max(f[i][j-1],prices[j]-lowPrice);
				else
				{
					f[i][j] = f[i][j-1];
					if(prices[j] < lowPrice)
						lowPrice = prices[j];
				}
			}
    	}
    	return getProfit(f, k, 0 , prices);
    }

	public static void main(String[] args)
	{
		int[] a = {1,2,4,2,5,7,2,4,9,0,9};
		System.out.println(maxProfit(4,a));

	}

}
