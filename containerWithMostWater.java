class Solution {
    public int maxArea(int[] height) {
        int max = 0, start = 0, end = height.length - 1;
        while (start != end) {
            int width = end - start;
            int currArea = Math.min(height[start], height[end]) * width;
            
            max = Math.max(currArea, max);
            
            if (height[start] < height[end])
                start++;
            else
                end--;
        }
        return max;
    }
}
