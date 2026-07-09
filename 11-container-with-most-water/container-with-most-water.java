class Solution {
    public int maxArea(int[] height) {
       int l = 0,r=height.length-1;
       int area = 0,maxn = 0;
       while(l<r)
       {
        area = Math.min(height[l],height[r]) * (r-l);
        maxn = Math.max(maxn,area);
        if(height[l]<=height[r]) l++;
        else if(height[r]<height[l]) r--;
       }

       return maxn;
    }
}