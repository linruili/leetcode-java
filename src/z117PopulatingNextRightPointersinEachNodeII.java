
public class z117PopulatingNextRightPointersinEachNodeII
{
	 public void connect(TreeLinkNode root)
	 {
		 if(root == null)
			 return;
		 TreeLinkNode cur = null;
		 TreeLinkNode curRoot = root;//上一层的遍历
		 TreeLinkNode head = null;//当层的开始非零点
		 while(curRoot != null)
		 {
			 while(curRoot != null)
			 {
				 if(curRoot.left != null)
				 {
					 if(cur != null)
						 cur.next = curRoot.left;
					 else
						 head = curRoot.left;
					 cur = curRoot.left;
				 }
				 if(curRoot.right != null)
				 {
					 if(cur != null)
						 cur.next = curRoot.right;
					 else
						 head = curRoot.right;
					 cur = curRoot.right;
				 }
				 curRoot = curRoot.next;
			 }
			 curRoot = head;
			 head = null;
			 cur = null;
		 }
	 }

	public static void main(String[] args)
	{

	}

}
