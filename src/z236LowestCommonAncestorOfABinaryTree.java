import java.util.ArrayList;
import java.util.List;


public class z236LowestCommonAncestorOfABinaryTree
{
	List<TreeNode> path = new ArrayList();
	List<TreeNode> pathP = new ArrayList();
	List<TreeNode> pathQ = new ArrayList();
	
	public void DFS(TreeNode root, TreeNode p, TreeNode q)
	{
		if(root == null)
			return;
		path.add(root);
		if(root == p)
			pathP.addAll(path);
		if(root == q)
			pathQ.addAll(path);
		DFS(root.left,p,q);
		DFS(root.right,p,q);
		path.remove(path.size()-1);
	}
	
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q)
	{
		DFS(root,p,q);
		int i;
		for(i=0; i<pathP.size()&&i<pathQ.size(); ++i)
			if(pathQ.get(i)!=pathP.get(i))
				break;
		return pathP.get(i-1);
	}

	public static void main(String[] args)
	{
		TreeNode root = new TreeNode(1);
		TreeNode a = new TreeNode(2);
		root.right = a;
		z236LowestCommonAncestorOfABinaryTree x = new z236LowestCommonAncestorOfABinaryTree();
		TreeNode ans = x.lowestCommonAncestor(root, root,a);
		System.out.println(ans.val);
		


	}

}
