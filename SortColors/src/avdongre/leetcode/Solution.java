package avdongre.leetcode;

/***************************************************************************************************
 * Given an array with n objects colored red, white or blue, sort them so that
 * objects of the same color are adjacent, with the colors in the order red,
 * white and blue.
 * 
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white,
 * and blue respectively.
 * 
 * Note: You are not suppose to use the library's sort function for this
 * problem.
 ***************************************************************************************************/

public class Solution {
	public void sortColors(int[] A) {

		int red = 0;
		int white = 0;
		int blue = 0;

		for (int i = 0; i < A.length; i++) {
			if (A[i] == 0) {
				red++;
			} else if (A[i] == 1) {
				white++;
			} else {
				blue++;
			}
		}
		int index = 0;
		while (red > 0) {
			A[index++] = 0;
			red--;
		}
		while (white > 0) {
			A[index++] = 1;
			white--;
		}
		while (blue > 0) {
			A[index++] = 2;
			blue--;
		}
	}
}
