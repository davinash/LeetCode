package avdongre.leetcode;

/**************************************************************************************************
 * There are two sorted arrays A and B of size m and n respectively. Find the
 * median of the two sorted arrays. The overall run time complexity should be
 * O(log (m+n)).
 **************************************************************************************************/

public class Solution {
	public double findMedianSortedArrays(int A[], int B[]) {

		int totalLength = A.length + B.length;

		if (totalLength == 0) {
			return 0.0;
		}

		if (totalLength == 1) {
			if (A.length != 0) {
				return (double) A[0];
			}
			if (B.length != 0) {
				return (double) B[0];
			}
		}

		int[] mergedArray = new int[totalLength];
		int i = 0, j = 0, k = 0;

		while (i < A.length && j < B.length) {
			if (A[i] < B[j])
				mergedArray[k++] = A[i++];

			else
				mergedArray[k++] = B[j++];
		}

		while (i < A.length)
			mergedArray[k++] = A[i++];

		while (j < B.length)
			mergedArray[k++] = B[j++];

		if (totalLength % 2 == 0) {
			int mid = totalLength / 2 - 1;
			return ((double) mergedArray[mid] + (double) mergedArray[mid + 1]) / 2;

		} else {
			int mid = totalLength / 2;
			return (double) (mergedArray[mid]);
		}

	}
}
