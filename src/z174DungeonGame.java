
public class z174DungeonGame
{
    public static int calculateMinimumHP(int[][] dungeon) 
    {
    	int len1 = dungeon.length;
    	int len2 = dungeon[0].length;
    	int[][] health = new int[len1][len2];
    	for(int i=len1-1 ; i>=0 ;--i)
    		for(int j=len2-1 ; j>=0 ; --j)
    		{
    			if(i==len1-1 && j==len2-1)
    				health[i][j] = Math.max(1,1-dungeon[i][j]);
    			else if(j==len2-1)
    				health[i][j] = Math.max(1, health[i+1][j]-dungeon[i][j]);
    			else if(i==len1-1)
    				health[i][j] = Math.max(1, health[i][j+1]-dungeon[i][j]);
    			else
    				health[i][j] = Math.max(1, 
    						Math.min(health[i+1][j]-dungeon[i][j],health[i][j+1]-dungeon[i][j]));
    		}
    	return health[0][0];
        
    }

	public static void main(String[] args)
	{
		int[][] a = {{0,0}};
		System.out.println(calculateMinimumHP(a));

	}

}
