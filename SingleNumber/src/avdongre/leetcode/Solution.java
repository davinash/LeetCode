package avdongre.leetcode;

/**
 * Given an array of integers, every element appears twice except for one. Find
 * that single one.
 * 
 * Note: Your algorithm should have a linear runtime complexity. Could you
 * implement it without using extra memory?
 * 
 * @author adongre
 *
 */
public class Solution {
	public int singleNumber(int[] A) {
		int x = 0;
		for (int i = 0; i < A.length; i++) {
			x ^= A[i];
		}
		return x;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		{
			int[] A = new int[] {};
			System.out.println(s.singleNumber(A));
		}
		{
			int[] A = new int[] { 1,1,2,2,3,3,4,5,5,6,6,7,7 };
			System.out.println(s.singleNumber(A));
		}
		{
			int[] A = new int[] { 1, 2, 3, 4, 5, 6, 7 };
			System.out.println(s.singleNumber(A));
		}		
	}

}
