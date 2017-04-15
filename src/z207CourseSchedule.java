import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class z207CourseSchedule
{
	public boolean canFinish(int numCourses, int[][] prerequisites)
	{
		List<Integer> edges[] = new ArrayList[numCourses];
		boolean[] visit = new boolean[numCourses];
		int[] in_degree = new int[numCourses];
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
			for(int i:edges[v])
			{
				--in_degree[i];
				if(in_degree[i]==0)
					q.add(i);
			}
		}
		for(int i=0; i<numCourses; ++i)
			if(visit[i]==false)
				return false;
		return true;
	}


	public static void main(String[] args)
	{
		z207CourseSchedule s = new z207CourseSchedule();
		int[][] e = new int[1][2];
		e[0][0] = 1; e[0][1]=0;
		System.out.println(s.canFinish(2, e));

	}

}
