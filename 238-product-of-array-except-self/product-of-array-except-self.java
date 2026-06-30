class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] out = new int[nums.length];
        int l = 1;
        int pre = 1;
        out[0] = 1;
        while(l<nums.length)
        {
            out[l] = pre * nums[l-1];
            pre = pre * nums[l-1];
            l++;
        }

        l = nums.length-2;
        pre = 1;
        while(l>=0)
        {
            pre = pre*nums[l+1];
            out[l] = out[l]*pre;
            l--;
        }
        return out;
    }
}