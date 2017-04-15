import java.util.ArrayList;
import java.util.List;



public class z257BinaryTreePaths
{
	public void DFS(TreeNode root, ArrayList path, List ans)
	{
		if(root==null)
			return;
		path.add(root.val);
		if(root.left==null && root.right==null)
		{
			String p ="\"" + path.get(0);
			for(int i=1; i<path.size(); ++i)
				p = p+"->"+path.get(i);
			p = p+"\"";
			ans.add(p);
		}
		else
		{
			DFS(root.left, path, ans);
			DFS(root.right, path, ans);
		}
		path.remove(path.size()-1);
	}
	
    public List<String> binaryTreePaths(TreeNode root)
    {
        ArrayList path = new ArrayList();
        List<String> ans  = new ArrayList();
        DFS(root,path,ans);
        return ans;
    }

	public static void main(String[] args)
	{

	}

}
