class Solution {
    public String getPermutation(int n, int k) {
        int fact=1;
        List<Integer> al=new ArrayList<>();
        for(int i=1;i<n;i++){
            fact*=i;
            al.add(i);
        }
        al.add(n);
        k=k-1;
        StringBuilder sb=new StringBuilder();
        while(true){
            sb.append(Integer.toString(al.get(k/fact)));
            al.remove(k/fact);
            if(al.size()==0) break;
            k=k%fact;
            fact/=al.size();
        }
        return sb.toString();
    }
}