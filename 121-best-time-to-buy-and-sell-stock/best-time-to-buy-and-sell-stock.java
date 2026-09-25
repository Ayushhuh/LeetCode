class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int curr = 0;
        for(int i = 0;i<prices.length;i++)
        {
            int x = prices[i];
            if(min>x) min = x;
            if((x-min)>curr) curr = x-min;
        }
        return curr;
    }
}