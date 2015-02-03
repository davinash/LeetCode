package avdongre.leetcode;

/*********************************************************************************************
 * You are given two linked lists representing two non-negative numbers. The
 * digits are stored in reverse order and each of their nodes contain a single
 * digit. Add the two numbers and return it as a linked list.
 * 
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) Output: 7 -> 0 -> 8
 *********************************************************************************************/
public class Solution {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		java.util.ArrayList<Integer> l1Array = new java.util.ArrayList<Integer>();
		java.util.ArrayList<Integer> l2Array = new java.util.ArrayList<Integer>();

		while (l1 != null) {
			l1Array.add(l1.val);
			l1 = l1.next;
		}

		while (l2 != null) {
			l2Array.add(l2.val);
			l2 = l2.next;
		}
		java.util.Collections.reverse(l1Array);
		java.util.Collections.reverse(l2Array);

		int pow = l1Array.size() - 1;
		long number1 = 0;
		long number2 = 0;
		for (Integer num : l1Array) {
			number1 += num.intValue() * Math.pow(10, pow--);
		}
		pow = l2Array.size() - 1;
		for (Integer num : l2Array) {
			number2 += num.intValue() * Math.pow(10, pow--);
		}
		long result = (number1 + number2);
		if (result == 0) {
			ListNode result1 = new ListNode(0);
			return result1;
		}
		java.util.ArrayList<Integer> r = new java.util.ArrayList<Integer>();
		while (result > 0) {
			r.add((int) (result % 10));
			result /= 10;
		}

		ListNode result1 = new ListNode(r.get(0));
		ListNode tempHead = result1;
		for (int i = 1; i < r.size(); i++) {
			ListNode tempNode = new ListNode(r.get(i));
			tempHead.next = tempNode;
			tempHead = tempNode;
		}

		return result1;

	}

}
