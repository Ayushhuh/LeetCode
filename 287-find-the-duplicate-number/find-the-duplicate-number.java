class Solution {
    public int findDuplicate(int[] nums) {
        int[] n = new int[nums.length];
        for(int i = 0;i<nums.length;i++)
        {
            if(n[nums[i]-1]==-1) return nums[i];
            n[nums[i]-1] = -1;
        }

        return 0;
    }
}