package avdongre.leetcode;

/*********************************************************************************
 * Given an array of size n, find the majority element. The majority element is
 * the element that appears more than ⌊ n/2 ⌋ times.
 * 
 * You may assume that the array is non-empty and the majority element always
 * exist in the array.
 *********************************************************************************/

public class Solution {
	public int majorityElement(int[] num) {

		int count = 0, i, result = 0;
		for (i = 0; i < num.length; i++) {
			if (count == 0)
				result = num[i];
			if (num[i] == result)
				count++;
			else
				count--;
		}
		count = 0;
		for (i = 0; i < num.length; i++)
			if (num[i] == result)
				count++;
		if (count > num.length / 2)
			return result;

		return result;

	}
}
