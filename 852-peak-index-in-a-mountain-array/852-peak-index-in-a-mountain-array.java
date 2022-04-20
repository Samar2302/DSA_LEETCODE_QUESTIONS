class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        if(arr[0]>arr[1]) return 0;
        if(arr[arr.length-1]>arr[arr.length-2]) return arr.length;
        int l=1,r=arr.length-2;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1]) return mid;
            else if(arr[mid]<arr[mid+1]) l=mid+1;
            else r=mid-1;
        }
        return 0;
    }
}