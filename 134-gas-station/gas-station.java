class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int[] diff = new int[gas.length];
        int sum = 0;
        for(int i = 0;i<gas.length;i++)
        {
            diff[i] = cost[i] - gas[i];
            sum = sum + diff[i];
        }

        if(sum>0) return -1;
        if(gas.length==1) return 0;
        int mini = gas.length-1;
        int min = diff[gas.length-1];
        for(int j = gas.length-2;j>=0;j--)
        {
            diff[j] = diff[j] + diff[j+1];
            if(diff[j]<min) 
            {
                min = diff[j];
                mini = j;
            }
               
        }

        return mini;
    }
}

