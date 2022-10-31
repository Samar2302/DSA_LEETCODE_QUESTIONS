class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pasc=new ArrayList<>();
        List<Integer> al,prev=null;
        for(int i=0;i<numRows;i++){
            al=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    al.add(1);
                }else{
                    al.add(prev.get(j-1)+prev.get(j));
                }
            }
            prev=al;
            pasc.add(al);
        }
        return pasc;
    }
}