class Solution {
    public int hIndex(int[] citations) {
        for(int i = citations.length;i>0;i--)
        {
            int val = 0;
            for(int j=0;j<citations.length;j++)
            {
                if(citations[j]>=i) val++;
            }
            if(val>=i) return i;
        }
        return 0;
    }
}