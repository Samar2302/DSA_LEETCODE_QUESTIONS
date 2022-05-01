class Solution {
    public int findMax(int[] arr,int beg,int end){
        int max=beg;
        for(int i=beg+1;i<=end;i++){
            if(arr[max]+max<arr[i]+i) max=i;
        }
        return max;
    }
    public int jump(int[] nums) {
        if(nums.length==1) return 0;
        int ans=0,i=0;
        for(;i<nums.length;){
            if(nums[i]==0) break;
            if(nums[i]+i>=nums.length-1){
                ans++;
                return ans;
            }
            int max=findMax(nums,i+1,nums[i]+i);
            i=max;
            ans++;
        }
        return -1;
    }
}