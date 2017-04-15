
public class z148SortList
{
	public ListNode sortList(ListNode head)
	{
		if(head==null || head.next==null)
			return head;
		ListNode fast = head;
		ListNode slow = head;
		ListNode pre = null;
		while(fast!=null && fast.next!= null)
		{
			pre = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		if(pre!=null)
			pre.next = null;
		ListNode left = sortList(head);
		ListNode right = sortList(slow);
		return merge(left,right);
	}
	public ListNode merge(ListNode left, ListNode right)
	{
		ListNode head = new ListNode(0);
		ListNode p = head;
		while(left!=null && right!=null)
		{
			if(left.val < right.val)
			{
				p.next = left;
				p = p.next;
				left = left.next;
				p.next = null;
			}
			else
			{
				p.next = right;
				p = p.next;
				right = right.next;
				p.next = null;
			}
		}
		if(left!=null)
			p.next = left;
		if(right!=null)
			p.next = right;
		return head.next;
	}

	public static void main(String[] args)
	{

	}

}
