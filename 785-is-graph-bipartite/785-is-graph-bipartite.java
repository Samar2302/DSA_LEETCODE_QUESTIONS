class Solution {
    int[] parent;
    public boolean isBipartite(int[][] graph) {
        parent=new int[graph.length];
        for(int i=0;i<parent.length;i++) parent[i]=i;
        for(int i=0;i<graph.length;i++){
            for(int n:graph[i]){
                if(findParent(n)==findParent(i)) return false;
                union(n,graph[i][0]);
            }
        }
        return true;
    }
    public void union(int u,int v){
        int parU=findParent(u);
        int parV=findParent(v);
        if(parU!=parV) parent[parU]=parV;
    }
    public int findParent(int u){
        if(parent[u]==u) return u;
        return parent[u]=findParent(parent[u]);
    }
}