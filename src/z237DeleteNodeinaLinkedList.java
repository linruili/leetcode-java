

public class z237DeleteNodeinaLinkedList
{
	public void deleteNode(ListNode node)
	{
		if(node==null || node.next==null)
			return;
		ListNode r = node.next;
		node.val = r.val;
		node.next = r.next;
		r.next = null;
	}

	public static void main(String[] args)
	{

	}

}
