class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = m-1;
        int q = n-1;
        int z = (m+n) - 1;

        while(p!=-1&&q!=-1)
        {
            if(nums1[p]>=nums2[q])
            {
                nums1[z] = nums1[p];
                p--;
            }
            else if(nums1[p]<nums2[q])
            {
                nums1[z] = nums2[q];
                q--;
            }
            z--;
        }

        while(q!=-1)
        {
            nums1[z] = nums2[q];
            z--;
            q--;
        }
    }
}