
public class z449Codec
{
	// Encodes a tree to a single string.
    public String serialize(TreeNode root) 
    {
    	if(root==null)
    		return null;
    	String r = "";
        String left = "";
        String right = "";
        String val = ""+root.val;
        r += val.length()+val;
        if(root.left!=null)
        {
        	left = serialize(root.left);
        	r = r + 'l' + (left.length()+"").length() + left.length() + left;
        }
        if(root.right!=null)
        {
        	right = serialize(root.right);
        	r = r + (right.length()+"").length() + right.length() + right;
        }
        return r;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) 
    {
    	if(data==null)
    		return null;
    	int lenVal = Integer.parseInt(data.charAt(0)+"");
    	int val = Integer.parseInt(data.substring(1,1+lenVal));
    	TreeNode root = new TreeNode(val);
    	int totoalLeft = 0;
    	if(data.length()>lenVal+1 && data.charAt(lenVal+1)=='l')
    	{
    		int lenLenLeft = Integer.parseInt(data.charAt(lenVal+2)+"");
    		int lenLeft = Integer.parseInt(data.substring(lenVal+3, lenVal+3+lenLenLeft));
    		totoalLeft = 2+lenLeft+lenLenLeft;
    		root.left = deserialize(data.substring(lenVal+3+lenLenLeft, lenVal+3+lenLenLeft+lenLeft));
    	}
    	if(data.length()>lenVal+1+totoalLeft)
    	{
    		int lenLenRight = Integer.parseInt(data.charAt(lenVal+1+totoalLeft)+"");
    		int lenRight = Integer.parseInt(data.substring(lenVal+2+totoalLeft, lenVal+2+totoalLeft+lenLenRight));
    		root.right = deserialize(data.substring(lenVal+2+totoalLeft+lenLenRight, data.length()));
    	}
    	return root;
    }

	public static void main(String[] args)
	{

	}

}
