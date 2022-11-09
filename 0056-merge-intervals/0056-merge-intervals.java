class Solution {
    public int[][] merge(int[][] inter) {
        Arrays.sort(inter,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> al=new ArrayList<>();
        int st=inter[0][0],end=inter[0][1];
        for(int i=1;i<inter.length;i++){
            if(end<inter[i][0]){
                al.add(new int[]{st,end});
                st=inter[i][0];
                end=inter[i][1];
            }
            else{
                if(end<inter[i][1]) end=inter[i][1];
                if(st>inter[i][0]) st=inter[i][0];
            }
        }
        al.add(new int[]{st,end});
        int[][] ans=new int[al.size()][2];
        for(int i=0;i<al.size();i++){
            ans[i][0]=al.get(i)[0];
            ans[i][1]=al.get(i)[1];
        }
        return ans;
    }
}