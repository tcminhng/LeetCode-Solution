class MyHashSet {
    private boolean[] hashset;

    public MyHashSet() {
        hashset = new boolean[1_000_001];
    }
    
    public void add(int key) {
        hashset[key] = true;
    }
    
    public void remove(int key) {
        hashset[key] = false;
    }
    
    public boolean contains(int key) {
        return hashset[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
