import java.util.LinkedList;
import java.util.List;

public class z56MergeIntervals
{
	// Definition for an interval.
	public class Interval
	{
	     int start;
	     int end;
	     Interval() { start = 0; end = 0; }
	     Interval(int s, int e) { start = s; end = e; }
	}
	
	public List<Interval> merge(List<Interval> intervals)
	{
		if(intervals.size()<=1)
			return intervals;
		List<Interval> result = new LinkedList<Interval>(); 
		intervals.sort((a,b)->Integer.compare(a.start, b.start));
		int start = intervals.get(0).start;
		int end = intervals.get(0).end;
		for(Interval interval: intervals)
		{
			if(interval.start <= end)
				end = Math.max(end, interval.end);
			else
			{
				result.add(new Interval(start,end));
				start = interval.start;
				end = interval.end;
			}
		}
		result.add(new Interval(start,end));
		return result;
		
	}

	public static void main(String[] args)
	{

	}

}
