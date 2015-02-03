package avdongre.leetcode;


/************************************************************************************************
Given a positive integer, return its corresponding column title as appear in an Excel sheet.

For example:

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB
    
************************************************************************************************/     

public class Solution {
	public String convertToTitle(int n) {

		// http://en.wikipedia.org/wiki/Bijective_numeration#The_bijective_base-26_system
		if (n < 27) {
			return (char) ('A' + (n - 1)) + "";
		}

		if (n % 26 == 0) {
			return convertToTitle(n / 26 - 1) + 'Z';
		}

		return convertToTitle(n / 26) + convertToTitle(n % 26);

	}
}