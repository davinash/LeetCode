package avdongre.leetcode;

/********************************************************************************************************
 * 
 Given an array of integers, find two numbers such that they add up to a
 * specific target number. The function twoSum should return indices of the two
 * numbers such that they add up to the target, where index1 must be less than
 * index2. Please note that your returned answers (both index1 and index2) are
 * not zero-based. You may assume that each input would have exactly one
 * solution.
 * 
 * Input: numbers={2, 7, 11, 15}, target=9 Output: index1=1, index2=2
 ********************************************************************************************************/

public class Solution {
	public int[] twoSum(int[] numbers, int target) {

		java.util.Map<Integer, java.util.List<Integer>> numLocationMap = new java.util.HashMap<Integer, java.util.List<Integer>>();
		for (int i = 0; i < numbers.length; i++) {
			java.util.List<Integer> indexList = numLocationMap.get(numbers[i]);
			if (indexList == null) {
				indexList = new java.util.ArrayList<Integer>();
				numLocationMap.put(numbers[i], indexList);
			}
			indexList.add(i + 1);
			// numLocationMap.put(numbers[i], i + 1);
		}
		java.util.Arrays.sort(numbers);

		int[] result = new int[2];
		int l = 0;
		int r = numbers.length - 1;
		while (l < r) {
			if (numbers[l] + numbers[r] == target) {
				if (numLocationMap.get(numbers[l]).size() == 1) {
					result[0] = numLocationMap.get(numbers[l]).get(0);
					result[1] = numLocationMap.get(numbers[r]).get(0);
				} else {
					result[0] = numLocationMap.get(numbers[l]).get(0);
					result[1] = numLocationMap.get(numbers[r]).get(1);
				}
				break;
			} else if (numbers[l] + numbers[r] < target) {
				l++;
			} else {
				r--;
			}
		}
		java.util.Arrays.sort(result);
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
