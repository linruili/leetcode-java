class TreeLinkNode {
     int val;
     TreeLinkNode left, right, next;
     TreeLinkNode(int x) { val = x; }
 }

public class z116PopulatingNextRightPointersinEachNode
{
	public void connect(TreeLinkNode root)
	{
		TreeLinkNode levelStart = root;
		while(levelStart != null)
		{
			TreeLinkNode cur = levelStart;
			while(cur != null)
			{
				if(cur.left != null)
					cur.left.next = cur.right;
				if(cur.next!=null && cur.right!=null)
					cur.right.next = cur.next.left;
				cur = cur.next;
			}
			levelStart = levelStart.left;
		}
	}
}
