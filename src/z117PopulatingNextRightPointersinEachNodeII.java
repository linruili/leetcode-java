
public class z117PopulatingNextRightPointersinEachNodeII
{
	 public void connect(TreeLinkNode root)
	 {
		 if(root == null)
			 return;
		 TreeLinkNode cur = null;
		 TreeLinkNode curRoot = root;//��һ��ı���
		 TreeLinkNode head = null;//����Ŀ�ʼ�����
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
