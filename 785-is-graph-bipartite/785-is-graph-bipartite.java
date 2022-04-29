class Solution {
    public boolean isBipartite(int[][] graph) {
        int[] col=new int[graph.length];
        for(int i=0;i<graph.length;i++){
            if(col[i]==0){
                Queue<Integer> q=new ArrayDeque<>();
                col[i]=1;
                q.add(i);
                while(!q.isEmpty()){
                    int node=q.poll();
                    for(int n:graph[node]){
                        if(col[n]==0) {
                            q.add(n);
                            col[n]=-col[node];
                        }
                        else if(col[n]==col[node]) return false;
                    }
                }
            }
        }
        return true;
    }
}