import java.util.ArrayList;
import java.util.List;

public class z310MinimumHeightTrees
{
	List<Integer>[] lists;
	public List<Integer> findMinHeightTrees(int n, int[][] edges)
	{
		lists = new ArrayList[n];
		for(int i=0; i<n; ++i)
			lists[i] = new ArrayList<>();
		for(int i=0; i<edges.length; ++i)
		{
			int v1 = edges[i][0];
			int v2 = edges[i][1];
			lists[v1].add(v2);
			lists[v2].add(v1);
		}
		List<Integer> ans = new ArrayList<>();
		List<Integer> maxList = DFS(0, n, -1);
		maxList = DFS(maxList.get(0), n, -1);
		int len = maxList.size();
		if(len%2==1)
			ans.add(maxList.get(len/2));
		else
		{
			ans.add(maxList.get(len/2));
			ans.add(maxList.get(len/2-1));
		}
		return ans;
	}
	public List<Integer> DFS(int k, int n, int pre)
	{
		List<Integer> maxList = new ArrayList<>();
		for(int i=0; i<lists[k].size(); ++i)
		{
			int v = lists[k].get(i);
			if(v!=pre)
			{
				List<Integer> tmp = DFS(v, n, k);
				if(tmp.size()>maxList.size())
					maxList = tmp;
			}
		}
		maxList.add(k);
		return maxList;
	}

	public static void main(String[] args)
	{
		

	}

}
