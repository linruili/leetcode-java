import java.util.LinkedList;
import java.util.List;

public class z57InsertInterval
{
	// Definition for an interval.
	public class Interval
	{
	     int start;
	     int end;
	     Interval() { start = 0; end = 0; }
	     Interval(int s, int e) { start = s; end = e; }
	}
		
	public List<Interval> insert(List<Interval> intervals, Interval newInterval)
	{
		int len = intervals.size();
		if(newInterval != null)
		{
			if(len == 0)
				intervals.add(newInterval);
			else
			{
				for(int i=0; i<len; ++i)
					if(newInterval.start <= intervals.get(i).start)
					{
						intervals.add(i, newInterval);
						break;
					}
				if(intervals.get(len-1).start < newInterval.start)
					intervals.add(newInterval);
			}
		}
		
		List<Interval> result = new LinkedList<Interval>(); 
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
		z57InsertInterval s = new z57InsertInterval();
		

	}

}
