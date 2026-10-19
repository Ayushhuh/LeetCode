class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for(int i = 1;i<nums.length;i++) prefix[i] = nums[i] * prefix[i-1];
        long suffix = 1;
        for(int i = nums.length-1;i>0;i--)
        {
            prefix[i] = prefix[i-1] * (int)suffix;
            suffix *= nums[i];
        }
        prefix[0] = (int)suffix;
        return prefix;
    }
}