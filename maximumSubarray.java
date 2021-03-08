class Solution {
    public int maxSubArray(int[] nums) {
        // input: array nums
        // output: largest sum
        // Kadane's algorithm
        
        // initialize sum to 0
        int currMax = nums[0], globalMax = currMax;
        for(int i = 1; i < nums.length; i++) {
            // compare current to previous + current
            currMax = Math.max(nums[i], currMax += nums[i]);
            // keep track of greatest current max
            if (currMax > globalMax) {
                globalMax = currMax;
            }
        }
        return globalMax;
        
    }
}
