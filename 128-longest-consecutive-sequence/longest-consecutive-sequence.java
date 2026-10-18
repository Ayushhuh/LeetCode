class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        if(nums.length==0) return 0;
        int longest = 1;
        for(int i = 0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }

        for(int n : set)
        {
            if(set.contains(n-1)) continue;
            int count = 1;
            while(set.contains(n+1)) 
            {
                n++;
                count++;
            }
            longest = Math.max(longest,count);
        }

        return longest;

    }
}