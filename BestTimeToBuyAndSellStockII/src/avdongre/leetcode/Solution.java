package avdongre.leetcode;

/**********************************************************************************************
 * Say you have an array for which the ith element is the price of a given stock
 * on day i.
 * 
 * Design an algorithm to find the maximum profit. You may complete as many
 * transactions as you like (ie, buy one and sell one share of the stock
 * multiple times). However, you may not engage in multiple transactions at the
 * same time (ie, you must sell the stock before you buy again).
 **********************************************************************************************/

public class Solution {
	public int maxProfit(int[] prices) {

		int maxProfit = 0;
		if (prices.length == 0) {
			return maxProfit;
		}
		for (int i = 0; i < prices.length - 1; i++) {
			int signleProfit = prices[i + 1] - prices[i];
			if (signleProfit > 0) {
				maxProfit += signleProfit;
			}
		}

		return maxProfit;

	}
}