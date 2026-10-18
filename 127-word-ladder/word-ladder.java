class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(!wordList.contains(endWord)) return 0;
        Map<String,Boolean> vmap = new HashMap<>();
        vmap.put(beginWord,false);
        for(String s:wordList) vmap.put(s,false);
        Queue<String> q = new LinkedList<>();
        q.add(beginWord);
        int level = 1;
        while(!q.isEmpty())
        {
            int sz = q.size();
            for(int i = 0;i<sz;i++)
            {
                String current = q.poll();
                vmap.put(current,true);
                if(current.equals(endWord)) return level;
                for(int j = 0; j<current.length(); j++)
                {
                    for(int k = 0;k<26;k++)
                    {
                        char ch = (char)('a'+k);
                        char[] carr = current.toCharArray();
                        carr[j] = ch;
                        String newstring = new String(carr);
                        if(vmap.containsKey(newstring)&&!vmap.get(newstring))
                        {
                            q.add(newstring);
                            vmap.put(newstring,true);
                        }
                    }
                }
            }
            level++;
        }
        return 0;
    }
}