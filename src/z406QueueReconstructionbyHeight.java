import java.util.Arrays;
import java.util.Comparator;

public class z406QueueReconstructionbyHeight
{
    public int[][] reconstructQueue(int[][] people)
    {
    	Arrays.sort(people ,new Comparator<int []>()
		{
			@Override
			public int compare(int[] o1, int[] o2)
			{
				if(o1[0] > o2[0])
					return 1;
				if(o1[0] == o2[0])
				{
					if(o1[1] > o2[1])
						return -1;
					if(o1[1] == o2[1])
						return 0;
					else
						return 1;
				}
				else
					return -1;
			}
		});
    	int [][] sortedP = new int [people.length][2];
    	for(int i=0 ; i<people.length ; ++i)
    		sortedP[i][0] = -1;
    	for(int i=0 ; i<people.length ; ++i)
    	{
    		int k = people[i][1];
    		for(int j=0 ; j<people.length ; ++j)
    			if(sortedP[j][0] == -1)
	    		{
	    			if(k == 0)
	    			{
	    				sortedP[j] = people[i];
	    				break;
	    			}
	    			else
	    				--k;
	    		}
    	}
    	return sortedP;
    	
    	
        
    }

	public static void main(String[] args)
	{

	}

}
