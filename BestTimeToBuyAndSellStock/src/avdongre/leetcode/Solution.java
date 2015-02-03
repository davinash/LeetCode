package avdongre.leetcode;

/*********************************************************************************
 * Say you have an array for which the ith element is the price of a given stock
 * on day i.
 * 
 * If you were only permitted to complete at most one transaction (ie, buy one
 * and sell one share of the stock), design an algorithm to find the maximum
 * profit.
 *********************************************************************************/

public class Solution {
	public int maxProfit(int[] prices) {
		int maxProfit = 0;
		if (prices.length == 0) {
			return maxProfit;
		}
		int buyPrice = prices[0];
		int sellPrice = 0;
		for (int i = 1; i < prices.length; i++) {
			sellPrice = prices[i];
			if (buyPrice < sellPrice) {
				maxProfit = java.lang.Math.max(maxProfit, sellPrice - buyPrice);
			} else {
				buyPrice = sellPrice;
			}
		}

		return maxProfit;

	}
}
