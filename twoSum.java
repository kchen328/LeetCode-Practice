class Solution {
    public int[] twoSum(int[] nums, int target) {
        //given: array of integers, two index that add up to target
        //a[i] + a[j] = target
        //i != j
        //brute force solution: two for loops
        //i > target, instant let's move to next index
        
        //let's use hashmap, key is integer
        //O(n) for for loop, O(1) for hashmap insertions
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        
        //[2,7,11,15]
        //looping through array
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                result[0] = map.get(complement);
                result[1] = i;
                return result;
                   
            }
            map.put(nums[i], i);
        }
        return new int[]{ -1,-1 };
    }
}
