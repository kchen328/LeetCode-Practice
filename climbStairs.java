class Solution {
    public int climbStairs(int n) {
        if(n < 3){
            return n; //n=2, return 2, n = 1, return 1
        }
        //4, there are 5, 
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i < n+1; i++){
            dp[i] = dp[i-1] + dp[i-2];//3
        }
        return dp[n];
        

    }
}
