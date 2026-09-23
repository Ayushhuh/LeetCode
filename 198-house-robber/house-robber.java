class Solution {
    public int rob(int[] nums) {
        int max1 = 0,max2=0,temp=0;
        for(int i=nums.length-1;i>=0;i--)
        {
            temp = max1;
            max1 = nums[i]+max2;
            max2 = Math.max(max2,temp);
        }
        return Math.max(max1,max2);
    }
}