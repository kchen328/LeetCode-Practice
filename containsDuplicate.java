class Solution {
    public boolean containsDuplicate(int[] nums) {
        //go through the list, if not duplicate add to list, if already exist, return true
        //HashSet for faster runtime
        HashSet<Integer> list = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(list.contains(nums[i])){
                return true;
            }
            else{
                list.add(nums[i]);
            }
        }
        return false;
        
    }
}
