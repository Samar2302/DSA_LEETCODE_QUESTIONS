class Solution {
    public int first(int[] arr,int tar){
        int l=0,r=arr.length-1,ans=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]>=tar){
                if(arr[mid]==tar)ans=mid;
                r=mid-1;
            }else l=mid+1;
        }
        return ans;
    }
    public int last(int[] arr,int tar){
        int l=0,r=arr.length-1,ans=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]<=tar){
                if(arr[mid]==tar)ans=mid;
                l=mid+1;
            }else r=mid-1;
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int tar) {
        int[] ans=new int[2];
        ans[0]=first(nums,tar);
        ans[1]=last(nums,tar);
        return ans;
    }
}