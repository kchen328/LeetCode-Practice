class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        // first house
        dp[0] = nums[0];
        // one house always robbed
        int max = dp[0];
            
        for (int j = 1; j < dp.length; j++) {
            // current max robbed before house j
            int curr = 0;
            // add value of current house
            dp[j] += nums[j];
            // iterate through all houses before house j, aside from house j - 1 (bc no adjacent)
            for (int i = 0; i < j - 1; i++) {
                // find max robbed house before house j that's not adjacent
                curr = Math.max(curr, dp[i]);
            }
            // add previous max robbed to the current total
            dp[j] += curr;
            // max robbed
            max = Math.max(max, dp[j]);
        }
        
        return max;
    }
}
