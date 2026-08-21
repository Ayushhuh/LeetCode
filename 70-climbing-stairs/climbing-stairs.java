class Solution {
    int memo[];
    int dp(int n,int target)
    {
        if(n==target)
            return 1;
        else if(n>target)
            return 0;
        if(memo[n]!=-1)
         return memo[n];
        int ones = dp(n+1,target);
        int twos = dp(n+2,target);
        memo[n] = ones+twos;
        return ones+twos;
    }
    public int climbStairs(int n){
        memo = new int[n+1];
        Arrays.fill(memo,-1);
        return dp(0,n);
    }
}