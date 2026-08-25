class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> que = new LinkedList<>();
        int n = grid.length;
        int count = 0;
        int m = grid[0].length;
        int fresh = 0;
        int t = 0;
        for(int i = 0;i<grid.length;i++)
        {
            for(int j = 0;j<grid[0].length;j++)
            {
                if(grid[i][j]==2) que.add(new int[]{i,j,t});
                if(grid[i][j]==1) fresh++;
            }
        }
        if(fresh==0) return 0;
        if(que.isEmpty()) return -1;
        while(!que.isEmpty())
        {
            boolean rot = false;
            int[] arr = que.poll();
            if(arr[1]+1<m&&grid[arr[0]][arr[1]+1]==1)
            {
                grid[arr[0]][arr[1]+1] = 2;
                que.add(new int[]{arr[0],arr[1]+1,arr[2]+1});
            }
            if(arr[0]+1<n&&grid[arr[0]+1][arr[1]]==1)
            {
                grid[arr[0]+1][arr[1]] = 2;
                que.add(new int[]{arr[0]+1,arr[1],arr[2]+1});
            }
            if(arr[1]-1>=0&&grid[arr[0]][arr[1]-1]==1)
            {
                grid[arr[0]][arr[1]-1] = 2;
                que.add(new int[]{arr[0],arr[1]-1,arr[2]+1});
            }
            if(arr[0]-1>=0&&grid[arr[0]-1][arr[1]]==1)
            {
                grid[arr[0]-1][arr[1]] = 2;
                que.add(new int[]{arr[0]-1,arr[1],arr[2]+1});
            }
            count = arr[2];
        }
        for(int i = 0;i<grid.length;i++)
        {
            for(int j = 0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1) return -1;
            }
        }
        return count;
    }
}