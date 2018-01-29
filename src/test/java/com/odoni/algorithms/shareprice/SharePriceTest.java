package com.odoni.algorithms.shareprice;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SharePriceTest {

	@Test
	public void shouldReturn197() {
		int[] prices = {1,2,100};
		SharePrice sharePrice = new SharePrice();
		int actualProfit = sharePrice.calculateMaxProfit(prices);
		assertEquals(197, actualProfit);
	}

}
