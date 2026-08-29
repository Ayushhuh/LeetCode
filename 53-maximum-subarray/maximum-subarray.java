class Solution {
    public int maxSubArray(int[] nums) {
        int mins[] = new int[nums.length];
        int maxs[] = new int[nums.length];
        int ans = nums[0];
        mins[0] = nums[0];
        maxs[0] = nums[0];
        for(int i = 1;i<nums.length;i++)
        {
            int k = Math.max(nums[i],Math.max(nums[i]+maxs[i-1],nums[i]+mins[i-1]));
            maxs[i] = k;
            mins[i] = Math.min(nums[i],Math.min(nums[i]+maxs[i-1],nums[i]+mins[i-1]));
            ans = Math.max(k,ans);
            
        }

        return ans;
    }
}