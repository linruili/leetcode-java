


 
public class z234PalindromeLinkedList
{
	public boolean isPalindrome(ListNode head)
	{
		if(head==null || head.next==null)
			return true;
		ListNode fast = head.next;
		ListNode slow = head;
		while(fast!=null && fast.next!=null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		ListNode p = slow.next;
		while(p.next!=null)
		{
			ListNode r = p.next;
			p.next = r.next;
			r.next = slow.next;
			slow.next = r;
		}
		fast = slow.next;
		slow = head;
		while(fast!=null)
		{
			if(slow.val != fast.val)
				break;
			slow = slow.next;
			fast = fast.next;
		}
		if(fast != null)
			return false;
		else
			return true;
		
	}

	public static void main(String[] args)
	{

	}

}
