class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==1) return nums[0];
        int[] mins = new int[nums.length];
        int[] maxs = new int[nums.length];
        int ans = nums[0];
        mins[0] = nums[0];
        maxs[0] = nums[0];
        for(int i = 1;i<nums.length;i++)
        {
            int k = Math.max(nums[i],Math.max(nums[i]*mins[i-1],nums[i]*maxs[i-1]));
            maxs[i] = k;
            mins[i] = Math.min(nums[i],Math.min(nums[i]*mins[i-1],nums[i]*maxs[i-1]));
            ans = Math.max(ans,k);
        }

        ans = Math.max(ans,maxs[nums.length-1]);

        return ans;
    }
}