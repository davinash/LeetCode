package avdongre.leetcode;

/**********************************************************************************
 * Given two sorted integer arrays A and B, merge B into A as one sorted array.
 * 
 * Note: You may assume that A has enough space (size that is greater or equal
 * to m + n) to hold additional elements from B. The number of elements
 * initialized in A and B are m and n respectively.
 **********************************************************************************/

public class Solution {
	public void merge(int A[], int m, int B[], int n) {

		if (m == 0 && n == 0) {
			return;
		}
		for (int i = 0; i < n; i++) {
			A[m++] = B[i];
		}
		java.util.Arrays.sort(A);

	}
}