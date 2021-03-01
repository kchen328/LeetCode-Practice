class Solution {
    public int[] productExceptSelf(int[] nums) {
        // input: array nums of n integers
        // output: array output where output[i] is equal to the product of all the elements of nums except nums[i]
        int[] result = new int[nums.length];
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        // initialize left and right product arrays
        left[0] = 1;
        right[nums.length-1] = 1;
        int leftProduct = 1;
        int rightProduct = 1;
        // left product
        for (int i = 1; i < nums.length; i++) {
            // left of current multiplied by rest of left
            left[i] = nums[i - 1] * leftProduct;
            // update left product
            leftProduct *= nums[i - 1];
        }
        // right product
        for (int i = nums.length - 2; i >= 0; i--) {
            // right of current multiplied by rest of right
            right[i] = nums[i + 1] * rightProduct;
            // update right product
            rightProduct *= nums[i + 1];
        }
        // multiply right and left products
        for (int i = 0; i < nums.length; i++) {
            result[i] = left[i] * right[i];
        }
        return result;
    }
}
/***
Resources:
 - https://www.youtube.com/watch?v=khTiTSZ5QZY
***/