class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;
        int testProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            testProfit = prices[i] - min;
            if (profit < testProfit) {
                profit = testProfit;
            }
        }
        return profit;
    }
}