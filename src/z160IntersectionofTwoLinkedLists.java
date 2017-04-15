

public class z160IntersectionofTwoLinkedLists
{
	public ListNode getIntersectionNode(ListNode headA, ListNode headB)
	{
		int lenA=0 , lenB=0;
		int i;
		ListNode p = headA;
		while(p!=null)
		{
			p = p.next;
			++lenA; 
		}
		p = headB;
		while(p!=null)
		{
			p = p.next;
			++lenB; 
		}
		if(lenA>lenB)
			for(i=1 ; i<=lenA-lenB ; ++i)
				headA = headA.next;
		else
			for(i=1 ; i<=lenB-lenA ; ++i)
				headB = headB.next;
		while(headA != null)
		{
			if(headA == headB)
				return headA;
			headA = headA.next;
			headB = headB.next;
		}
		return null;
	}

	public static void main(String[] args)
	{

	}

}
