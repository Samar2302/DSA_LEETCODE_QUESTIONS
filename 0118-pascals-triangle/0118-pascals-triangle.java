class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pasc=new ArrayList<>();
        
        for(int i=0;i<numRows;i++){
            List<Integer> al=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    al.add(1);
                }else{
                    al.add(pasc.get(i-1).get(j-1)+pasc.get(i-1).get(j));
                }
            }
            pasc.add(al);
        }
        return pasc;
    }
}