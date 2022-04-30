class Solution {
    int[] col;
    public boolean possibleBipartition(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        ArrayList<Integer>temp=new ArrayList<>();
        for (int i = 0; i<=n; i++) 
            adj.add(new ArrayList<>());
            for(int[] it:edges){
                adj.get(it[0]).add(it[1]);
                adj.get(it[1]).add(it[0]);
            }  
        col=new int[n+1];
        for(int i=1;i<adj.size();i++){
            if(col[i]==0){
                Queue<Integer> q=new ArrayDeque<>();
                q.offer(i);
                col[i]=1;
                while(!q.isEmpty()){
                    int x=q.poll();
                    for(int y:adj.get(x)){
                       if(col[y]==0){
                           q.offer(y);
                           col[y]=-col[x];
                       }else if(col[y]==col[x]) return false;
                    }
                }
            }
        }
        return true;
    }
}