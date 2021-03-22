class Solution {
    public int maxProduct(int[] nums) {
        // input: array nums
        // output: largest sum
        // Kadane's algorithm
        // case: negative num
        // [-2, 3, -4]
        int max = nums[0], min = nums[0], result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int temp = max;//a temporary hold
            max = Math.max(Math.max(max * nums[i], min * nums[i]), nums[i]);
            min = Math.min(Math.min(temp * nums[i], min * nums[i]), nums[i]);
            if (max > result) {
                result = max;
            }
        }
        return result;
        
    }
}
