package avdongre.leetcode;

/********************************************************************************************
 * Given a string, find the length of the longest substring without repeating
 * characters. For example, the longest substring without repeating letters for
 * "abcabcbb" is "abc", which the length is 3. For "bbbbb" the longest substring
 * is "b", with the length of 1.
 ********************************************************************************************/

public class Solution {
	public int lengthOfLongestSubstring(String s) {

		if (s.length() <= 1)
			return s.length();
		int prev = 0;
		boolean[] letter = new boolean[256];
		int max = 0;
		for (int i = 0; i < s.length(); i++) {
			if (!letter[s.charAt(i)])
				letter[s.charAt(i)] = true;
			else {
				while (s.charAt(prev) != s.charAt(i)) {
					letter[s.charAt(prev)] = false;
					prev++;
				}
				prev++;
			}
			max = Math.max(max, i - prev + 1);
		}
		return max;

	}
}