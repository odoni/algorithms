package com.odoni.algorithms.shareprice;

public class SharePrice {

	public int calculateMaxProfit(int[] prices) {
		int profit = 0;
		int countShare = 0;
		for (int i=0; i < prices.length; i++) {
			if (i<prices.length-1) {
				int todayPrice = prices[i];
				int nextDayPrice = prices[i+1];
				if (nextDayPrice > todayPrice) {
					profit -= todayPrice;
					countShare++;
				} else if (nextDayPrice < todayPrice && countShare > 0) {
					profit += countShare * todayPrice;
					countShare = 0;
				}
			}
		}

		if (countShare > 0) {
			profit += countShare * prices[prices.length -1];
			countShare = 0;
		}

		System.out.println("Profit: " + profit);
		System.out.println("Shares remaining: " + countShare);

		return profit;
	}
}
