
public class z304NumMatrix
{
	int [][] sum;
    public z304NumMatrix(int[][] matrix) 
    {
        int len1 = matrix.length;
        if(len1 == 0)
        	return;
        int len2 = matrix[0].length;
        if(len2 == 0)
        	return;
        sum = new int[len1+1][len2+1];
        sum[1][1] = matrix[0][0];
    	for(int i=1 ; i<len1 ; ++i)
    		sum[i+1][1] = matrix[i][0]+sum[i][1];
    	for(int i=1 ;i<len2 ; ++i)
    		sum[1][i+1] = matrix[0][i] + sum[1][i];
        for(int i=1 ; i<len1 ; ++i)
        	for(int j=1 ; j<len2 ; ++j)
        		sum[i+1][j+1] = sum[i+1][j] + sum[i][j+1] - sum[i][j] + matrix[i][j];
    }

    public int sumRegion(int row1, int col1, int row2, int col2)
    {
        return sum[row2+1][col2+1]-sum[row1][col2+1]-sum[row2+1][col1]+sum[row1][col1];
    }

	public static void main(String[] args)
	{

	}

}
