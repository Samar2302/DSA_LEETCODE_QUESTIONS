class Solution {
    int[] arr={1,2,3,4,5,6,7,8,9};
    List<List<Integer>> ans=new ArrayList<>();
    public void helper(int k,int n,int sum,ArrayList<Integer> al,int idx){
        if(idx==arr.length || sum==n){
            if(sum==n && al.size()==k){
                ans.add(new ArrayList<>(al));
            }
            return;
        }
        if(sum+arr[idx]<=n){
            al.add(arr[idx]);
            helper(k,n,sum+arr[idx],al,idx+1);
            al.remove(al.size()-1);
        }
        helper(k,n,sum,al,idx+1);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        helper(k,n,0,new ArrayList<>(),0);
        return ans;
    }
}