class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int ans=0;
        for(int i=0;i<nums1.length;i++){
            int l=0,r=nums2.length-1;
            while(l<=r){
                int mid=l+(r-l)/2;
                if(nums1[i]>nums2[mid]) r=mid-1;
                else if(i<=mid){
                    l=mid+1;
                    ans=Math.max(ans,Math.abs(mid-i));
                }else l=mid+1;
            }
        }
        return ans;
    }
}