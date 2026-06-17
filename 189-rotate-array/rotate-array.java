class Solution {
    public void rotate(int[] nums, int k) {
        int l = 0,r=nums.length-1,temp=0;
        k = k % nums.length;  
        if (k == 0) return;
        while(l<r)
        {
            temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
        l = 0;
        r = k-1;
        while(l<r)
        {
            temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
        l = k;
        r = nums.length-1;
        while(l<r)
        {
            temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }
}