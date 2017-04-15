
public class z64MinimumPathSum
{
    public int minPathSum(int[][] grid) 
    {
    	int len1 = grid.length;
    	int len2 = grid[0].length;
    	int[][] sum = new int[len1][len2];
    	if(len1==0 || len2==0)
    		return 0;
    	sum[0][0] = grid[0][0];
    	for(int i=1; i<len1 ; ++i)
    		sum[i][0] = sum[i-1][0] + grid[i][0];
    	for(int i=1 ;i<len2 ; ++i)
    		sum[0][i] = sum[0][i-1] + grid[0][i];
    	for(int i=1 ; i<len1 ; ++i)
    		for(int j=1 ; j<len2 ; ++j)
    			sum[i][j] = Math.min(sum[i-1][j],sum[i][j-1])+grid[i][j];
    	return sum[len1-1][len2-1];
    }

	public static void main(String[] args)
	{

	}

}
