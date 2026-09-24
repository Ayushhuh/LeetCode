class Solution {
    public int maxArea(int[] height) {
        int l = 0,r = height.length-1,max = 0;
        while(l<r)
        {
            int curr = (r-l) * Math.min(height[l],height[r]);
            max = Math.max(curr,max);
            if(height[l]<height[r]) l++;
            else r--;
        }

        return max;
    }
}