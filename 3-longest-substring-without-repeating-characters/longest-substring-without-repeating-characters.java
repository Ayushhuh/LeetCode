class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int sum = 0;
        int l = 0;
        HashSet<Character> set = new HashSet<>();
        for(int i = 0;i<s.length();i++)
        {
            char cr = s.charAt(i);
           
            if(!set.add(cr))
            {
                while(set.contains(cr))
                {
                    char cl = s.charAt(l);
                    set.remove(cl);
                    l++;
                }
                set.add(cr);
            }

            int winsize = (i-l) + 1;
            if(winsize>max) max = winsize;
        }
        return max;
    }
}