class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int r = 0;
        int count = 0;
        int min = Integer.MAX_VALUE;

        while (r < nums.length && count < target) {
            count += nums[r];
            r++;
        }

        if (count < target) return 0;

        while (r <= nums.length) {

            if (count >= target) {
                min = Math.min(min, r - l);
                count -= nums[l];
                l++;
            }
            else {
                if (r == nums.length) break;

                count += nums[r];
                r++;
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }
}