class Solution {
    class Node{
        String key;
        double val;
        public Node(String k,double v){
            key=k;
            val=v;
        }
    }
    public Map<String,List<Node>> buildGraph(List<List<String>> eq,double[] val){
        Map<String,List<Node>> g=new HashMap<>();
        for(int i=0;i<eq.size();i++){
            String s=eq.get(i).get(0);
            String d=eq.get(i).get(1);
            g.putIfAbsent(s,new ArrayList<>());
            g.putIfAbsent(d,new ArrayList<>());
            g.get(s).add(new Node(d,val[i]));
            g.get(d).add(new Node(s,1/val[i]));
        }
        return g;
    }
    public double dfs(String s,String d,HashSet<String> vis,Map<String,List<Node>> g){
        if(!g.containsKey(s) || !g.containsKey(d)) return -1.0;
        if(s.equals(d)) return 1.0;
        vis.add(s);
        for(Node n:g.get(s)){
            if(!vis.contains(n.key)){
                double ans=dfs(n.key,d,vis,g);
                if(ans!=-1.0) return ans*n.val;
            }
        }
        return -1.0;
    }
    public double[] calcEquation(List<List<String>> eq, double[] val, List<List<String>> q) {
        Map<String,List<Node>> g=buildGraph(eq,val);
        double[] ans=new double[q.size()];
        for(int i=0;i<q.size();i++)
            ans[i]=dfs(q.get(i).get(0),q.get(i).get(1),new HashSet<>(),g);
        return ans;
    }
}