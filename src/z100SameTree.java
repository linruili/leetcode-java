

public class z100SameTree
{
    public boolean isSameTree(TreeNode p, TreeNode q)
    {
        if(p==null && q==null)
        	return true;
        if( (p==null&&q!=null)||(p!=null)&&(q==null) )
        	return false;
        if(p.val == q.val)
        	return ( isSameTree(p.left,q.left)&&isSameTree(p.right, q.right) );
        else
        	return false;
        
    }

	public static void main(String[] args)
	{

	}

}
