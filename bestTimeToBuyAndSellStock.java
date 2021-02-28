class Solution {
    public int maxProfit(int[] prices) {
        // input: array prices
        // output: max profit
        // We can use Kadane's algorithm to solve this problem (similar to max subarray)
        
        // initialize profit to 0
        int maxCurrent = 0, maxGlobal = 0;
        for(int i = 1; i < prices.length; i++) {
            // compare current max to previous max + current max
            // can also do max(0, current + prev) for a more efficient solution
            maxCurrent = Math.max(prices[i] - prices[i-1], maxCurrent += prices[i] - prices[i-1]);
            // keep track of greatest current max
            if (maxCurrent > maxGlobal) {
                maxGlobal = maxCurrent;
            }
        }
        return maxGlobal;
    }
}
/***
Sources:
 - https://leetcode.com/problems/best-time-to-buy-and-sell-stock/discuss/39038/Kadane's-Algorithm-Since-no-one-has-mentioned-about-this-so-far-%3A)-(In-case-if-interviewer-twists-the-input)
 - https://www.youtube.com/watch?v=86CQq3pKSUw
***/