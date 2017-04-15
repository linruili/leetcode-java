

public class z222CountCompleteTreeNodes
{
	public int reallyCountNodes(TreeNode root, int l, int r)
	{
		if(l==r)
			return (1<<l)-1;
		if(r==1)
			return 2;
		int lR = 0 , rL = 0;
		TreeNode p = root.left;
		while(p != null)
		{
			lR += 1;
			p = p.right;
		}
		p = root.right;
		while(p != null)
		{
			rL += 1;
			p = p.left;
		}
		if(l-1 == lR)
			return (1<<(l-1)) + reallyCountNodes(root.right, rL, r-1);
		else
			return (1<<(r-1)) + reallyCountNodes(root.left, l-1, lR);
	}
    public int countNodes(TreeNode root) 
    {
    	TreeNode p = root;
    	int lLevel = 0, rLevel = 0;
    	while(p!=null)
    	{
    		lLevel += 1;
    		p = p.left;
    	}
    	p = root;
    	while(p!=null)
    	{
    		rLevel += 1;
    		p = p.right;
    	}
    	return reallyCountNodes(root, lLevel, rLevel);
    }

	public static void main(String[] args)
	{

	}

}
