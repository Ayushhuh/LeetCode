class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0;i<tasks.length;i++)
        {
            map.put(tasks[i],map.getOrDefault(tasks[i],0)+1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue()==1) return -1;
            while(entry.getValue()!=0)
            {
                if(entry.getValue()%3==0) {
                    count += entry.getValue()/3;
                    break;
                }
                else if(entry.getValue()%3!=0)
                {
                    count++;
                    map.put(entry.getKey(),map.get(entry.getKey())-2);
                }
            }
        }

       return count;
    
    }
}