
public class z134GasStation
{
	public int canCompleteCircuit(int[] gas, int[] cost)
	{
		int i=0 ,j=0, tank=0;
		boolean tag;
		int len = gas.length;
		while(i<len)
		{
			tag = false;
			while(i!=j || tag==false)
			{
				tag = true;
				tank = tank + gas[j] - cost[j];
				j = (j+1)%len;
				if(tank<0)
					break;
			}
			if(tank>=0)
				return i;
			while(tank<0 && i<len)
			{
				tank = tank -gas[i] + cost[i];
				++i;
			}
		}
		return -1;
	}

	public static void main(String[] args)
	{
		//GasStation t = new GasStation();
		//System.out.println(t.canCompleteCircuit(new int[]{6}, new int[]{6}));

	}

}
