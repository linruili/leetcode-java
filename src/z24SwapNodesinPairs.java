

public class z24SwapNodesinPairs
{
	public ListNode swapPairs(ListNode head)
	{
		ListNode dummy = new ListNode(0);
		ListNode r = null;
		dummy.next = head;
		head = dummy;
		while(head.next!=null && head.next.next!=null)
		{
			r = head.next;
			head.next = r.next;
			r.next = head.next.next;
			head.next.next = r;
			head = head.next.next;
		}
		return dummy.next;
	}

	public static void main(String[] args)
	{

	}

}
