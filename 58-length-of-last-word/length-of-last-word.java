class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length()==1 && s.charAt(0)!=' ') return 1;
        int flag = 0;
        int r = s.length() - 1;
        while(flag == 0&&r>=0)
        {
            char sc = s.charAt(r);
            if(sc!=' ') flag = 1;
            else r--;
        }

        int count = 0;
        while(flag == 1&&r>=0)
        {
            char sc = s.charAt(r);
            if(sc==' ') flag = 0;
            else{ r--;
            count++;}
        }
        return count;
    }
}