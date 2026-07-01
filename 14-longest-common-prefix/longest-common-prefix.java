class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1) return strs[0];
        int min = Integer.MAX_VALUE;
        for(int l = 0;l<strs.length;l++)
        {
            int mc = strs[l].length();
            if(mc<min) min = mc;
        }
        int i = 0;
        for(i = 0;i<min;i++)
        {
            char tf = strs[0].charAt(i);
            for(int j = 0;j<strs.length;j++)
            {
                if(tf!=strs[j].charAt(i)) return strs[0].substring(0,i);
            }
        }
        return strs[0].substring(0,min);
    }
}