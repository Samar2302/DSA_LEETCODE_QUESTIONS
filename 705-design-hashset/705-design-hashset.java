class MyHashSet {
    private ArrayList<Integer> al;
    public MyHashSet() {
        al=new ArrayList<>();
    }
    
    public void add(int key) {
        if(!al.contains(key))
        al.add(key);
    }
    
    public void remove(int key) {
        int idx=-1;
        if(al.contains(key)) idx=al.indexOf(key);
        if(idx!=-1) al.remove(idx);
    }
    
    public boolean contains(int key) {
        return al.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */