class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        List<int[]> res = new ArrayList<>();
        int n =  intervals.length;
        int[] current = intervals[0];

        for(int i = 1;i < n ;i++){
            if(current[1] >= intervals[i][0]){ // merge
                current[1] = Math.max(current[1] , intervals[i][1]);
                
            }
            else{ // no overlap
                res.add(current);
                current = intervals[i];
            }
        }
        res.add(current);
        return res.toArray(new int[res.size()][]);
    }
}