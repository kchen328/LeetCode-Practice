class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        
        Arrays.fill(dp, 1);
                
        int max = dp[0];
        
        for (int j = 1; j < dp.length; j++) {
            for (int i = 0; i < j; i++) {
                if (nums[i] < nums[j] && dp[i] >= dp[j]) {
                    dp[j]++;
                    max = Math.max(max, dp[j]);
                }
            }
        }
        
        return max;
    }
}
