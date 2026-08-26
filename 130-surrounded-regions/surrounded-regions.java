class Solution {
    void dfs(int i,int j,char[][] bd,boolean[][] visited)
    {
        int n = bd.length;
        int m = bd[0].length;
        if(bd[i][j]=='X'||visited[i][j]) return;
        if(bd[i][j]=='O')
        {
            visited[i][j] = true;
        }
        if(i-1>=0) dfs(i-1,j,bd,visited);
        if(i+1<n) dfs(i+1,j,bd,visited);
        if(j-1>=0) dfs(i,j-1,bd,visited);
        if(j+1<m) dfs(i,j+1,bd,visited);

    }
    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        boolean[][] visited = new boolean[n][m];
        for(int i = 0;i<n;i++)
        {
            if(board[i][0]=='O'&&!visited[i][0]) dfs(i,0,board,visited);
        }
        for(int j = 0;j<m;j++)
        {
            if(board[0][j]=='O'&&!visited[0][j]) dfs(0,j,board,visited);
        }
        for(int i = 0;i<n;i++)
        {
            if(board[i][m-1]=='O'&&!visited[i][m-1]) dfs(i,m-1,board,visited);
        }
        for(int j = 0;j<m;j++)
        {
            if(board[n-1][j]=='O'&&!visited[n-1][j]) dfs(n-1,j,board,visited);
        }


        for(int i = 0;i<n;i++)
        {
            for(int j = 0;j<m;j++)
            {
                if(board[i][j]=='O'&&!visited[i][j]) board[i][j] = 'X';
            }
        }
    }
}