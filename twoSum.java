class Solution {
    public int[] twoSum(int[] nums, int target) {
        //given: array of integers, two index that add up to target
        //a[i] + a[j] = target
        //i != j
        
        //let's use hashmap, key is integer
        //O(n) for for loop, O(1) for hashmap insertions
        
        // int[] answer = new int[2];
        // for(int i = 0; i< nums.length; i++){
        //     for(int j = 0; j < nums.length; j++){
        //         if( (nums[i]+nums[j] == target) && (i!=j)){
        //             answer[0] = j;
        //             answer[1] = i;
        //         }
        //     }
        // }
        // return answer;
        HashMap<Integer, Integer> result = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(result.containsKey(complement)){
                return new int[]{result.get(complement), i};
            }
            else{
                result.put(nums[i],i);
            }
        }
        return new int[] {-1, -1};
       
    }
}
