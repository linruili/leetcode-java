import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class z210CourseScheduleII
{
	public int[] findOrder(int numCourses, int[][] prerequisites)
	{
		List<Integer> edges[] = new ArrayList[numCourses];
		boolean[] visit = new boolean[numCourses];
		int[] in_degree = new int[numCourses];
		int[] ans = new int[numCourses];
		int n=numCourses;
		for(int i=0; i<numCourses; ++i)
			edges[i] = new ArrayList<>();
		for(int i=0; i<prerequisites.length; ++i)
		{
			int v1 = prerequisites[i][0];
			int v2 = prerequisites[i][1];
			edges[v1].add(v2);
			++in_degree[v2];
		}
		Queue<Integer> q = new LinkedList<>();
		for(int i=0; i<numCourses; ++i)
			if(in_degree[i] == 0)
				q.add(i);
		while(q.isEmpty()!=true)
		{
			int v = q.poll();
			visit[v]=true;
			ans[--n] = v;
			for(int i:edges[v])
			{
				--in_degree[i];
				if(in_degree[i]==0)
					q.add(i);
			}
		}
		for(int i=0; i<numCourses; ++i)
			if(visit[i]==false)
			{
				ans = new int[0];
				return ans;
			}
		return ans;
	}

	public static void main(String[] args)
	{

	}

}
