class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 0;
        int r = 1;
        int count = 0;
        while(r<nums.length)
        {
            if(nums[l]==nums[r]&& count == 0)
            {
                l++;
                nums[l] = nums[r];
                r++;
                count++;
            }
            else if(count==1&&nums[l]==nums[r])
            {
                r++;
            }
            else if(nums[l]!=nums[r])
            {
                l++;
                nums[l] = nums[r];
                count = 0;
                r++;
            }
        }
        return l+1;
    }
}