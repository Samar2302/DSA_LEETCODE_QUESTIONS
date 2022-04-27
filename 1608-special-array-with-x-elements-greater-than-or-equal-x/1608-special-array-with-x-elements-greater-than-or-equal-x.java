class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int ans=-1;
        for(int i=0;i<=nums.length;i++){
            int count=0;
            int l=0,r=nums.length-1;
            while(l<=r){
                int mid=l+(r-l)/2;
                if(nums[mid]>=i){
                    count=nums.length-mid;
                    r=mid-1;
                }else l=mid+1;
            }
            if(count==i){
                ans=i;break;
            }
        }
        return ans;
    }
}