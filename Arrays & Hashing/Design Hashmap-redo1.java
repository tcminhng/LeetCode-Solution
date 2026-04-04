class MyHashMap {
    private static final int SIZE = 1000;
    private Node[] buckets;

    class Node{
        int key, value;
        Node next;
        Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }

    public MyHashMap() {
        buckets = new Node[SIZE];
    }
    
    public void put(int key, int value) {
        int index = key % SIZE;
        if(buckets[index] == null){
            buckets[index] = new Node(-1, -1);
        }
        Node prev = find(buckets[index], key);
        if(prev.next == null){
            prev.next = new Node(key, value);
        }
        else{
            prev.next.value = value;
        }
    }
    
    public int get(int key) {
        int index = key % SIZE;
        if(buckets[index] == null) return -1;
        Node prev = find(buckets[index], key);
        return prev.next == null ? -1 : prev.next.value;
    }
    
    public void remove(int key) {
        int index = key % SIZE;
        if(buckets[index] == null) return;
        Node prev = find(buckets[index], key);
        if(prev.next != null){
            prev.next = prev.next.next;
        }
    }

    // Helper
    private Node find(Node bucket, int key){
        Node node = bucket, prev = null;
        while(node != null && node.key != key){
            prev = node;
            node = node.next;
        }
        return prev;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
