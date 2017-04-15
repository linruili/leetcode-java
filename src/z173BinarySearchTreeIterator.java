import java.util.Stack;



public class z173BinarySearchTreeIterator
{

	public class BSTIterator
	{
		Stack<TreeNode> s = new Stack(); 

	    public BSTIterator(TreeNode root)
	    {
	    	while(root!=null)
	    	{
	    		s.push(root);
	    		root = root.left;
	    	}
	    }

	    /** @return whether we have a next smallest number */
	    public boolean hasNext() 
	    {
	        if(!s.isEmpty())
	        	return true;
	        else
	        	return false;
	    }

	    /** @return the next smallest number */
	    public int next() 
	    {
	    	TreeNode root = s.pop();
	    	int ans  = root.val;
	    	if(root.right != null)
	    	{
	    		root = root.right;
	    		while(root != null)
	    		{
	    			s.push(root);
	    			root = root.left;
	    		}
	    	}
	    	return ans; 
	    }
	}


}
/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */