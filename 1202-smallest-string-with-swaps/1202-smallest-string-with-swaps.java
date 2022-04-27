class Solution {
    int[] parent=new int[100000];
    public void makeUnion(int n){
        for(int i=0;i<n;i++) parent[i]=i;
    }
    public int findParent(int u){
        if(u==parent[u]) return u;
        return parent[u]=findParent(parent[u]);
    }
    public void union(int u,int v){
        parent[findParent(u)]=findParent(v);
    }
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        StringBuilder ans=new StringBuilder();
        makeUnion(s.length());
        HashMap<Integer,Queue<Character>> map=new HashMap<>();
        for(List<Integer> p:pairs){
            union(p.get(0),p.get(1));
        }
        for(int i=0;i<s.length();i++)
            map.computeIfAbsent(findParent(i),k->new PriorityQueue<>()).offer(s.charAt(i));
        for(int i=0;i<s.length();i++)
            ans.append(map.get(findParent(i)).poll());
        return ans.toString();
    }
}