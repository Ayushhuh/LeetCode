class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int curr = Integer.MIN_VALUE;
        for(int i = 0;i<prices.length;i++)
        {
            int x = prices[i];
            if(min>x) min = x;
            if((x-min)>curr) curr = x-min;
        }
        return curr;
    }
}