class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public void swap(int[] arr,int i,int j){
        int x=arr[i];
        arr[i]=arr[j];
        arr[j]=x;
    }
    public void helper(int[] nums,int idx){
        if(idx==nums.length){
            ArrayList<Integer> al=new ArrayList<>();
            for(int x:nums) al.add(x);
            ans.add(al);
            return;
        }
        for(int i=idx;i<nums.length;i++){
            swap(nums,i,idx);
            helper(nums,idx+1);
            swap(nums,i,idx);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        helper(nums,0);
        return ans;
    }
}