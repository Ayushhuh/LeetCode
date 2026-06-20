class RandomizedSet {

    HashSet<Integer> hs = new HashSet<>();

    public RandomizedSet() {
        
    }
    
    public boolean insert(int val) {
        if(hs.contains(val)) return false;
        hs.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!hs.contains(val)) return false;
        hs.remove(val);
        return true;
    }
    
    public int getRandom() {
        int ranum = (int) (Math.random() * hs.size());
        Integer[] array = hs.toArray(new Integer[0]);
        return array[ranum];
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */