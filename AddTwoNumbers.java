package leetcode;

//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
//
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.

public class AddTwoNumbers {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		// add the current val while any of the node is not null, and add the carry value to the next
		ListNode resultNode = new ListNode(-1);
		ListNode currentNode = resultNode;
		int sum = 0;
		int carry = 0;
		if (l1 == null && l2 == null) {
			return resultNode;
		}
		while (l1!=null || l2!=null) {
			int a = l1!=null ? l1.val:0;
			int b = l2!=null ? l2.val:0;
			sum = carry + a + b;
			currentNode.next = new ListNode(sum%10);
			carry = sum/10;
			currentNode = currentNode.next;
			l1 = l1!=null&&l1.next!=null ? l1.next:null;
			l2 = l2!=null&&l2.next!=null ? l2.next:null;
		}
		
		if (carry>0) {
			currentNode.next = new ListNode(carry);
		}
		
		if (resultNode.next!=null) {
			resultNode = resultNode.next;
		}
		
		return resultNode;
	}
	
	public static void main(String[] args) {
		AddTwoNumbers example = new AddTwoNumbers();
		int [] alist = {2,4,5};
		int [] blist = {1,5,4,4};
		ListNode aListNode = example.new ListNode(0);
		ListNode bListNode = example.new ListNode(0);
		ListNode anode = aListNode;
		ListNode bnode = bListNode;

		for (int i : alist){
			anode.next = example.new ListNode(i);
			anode=anode.next;
		}
		for (int i : blist){
			bnode.next = example.new ListNode(i);
			bnode=bnode.next;
		}
		aListNode = aListNode.next;
		bListNode = bListNode.next;
		
		ListNode resultNode = example.addTwoNumbers(aListNode,bListNode);
		while(resultNode!=null){
			System.out.println(resultNode.val);
			resultNode=resultNode.next;
		}
	}
}
