class Solution {
    public int calc(int act,int exp){
        return act-exp;
    }
    public int findKthPositive(int[] arr, int k) {
        int l=0,r=arr.length-1;
        //int miss=calc(arr[arr.length-1],arr.length);
        while(l<=r){
            int mid=l+(r-l)/2;
            int miss=calc(arr[mid],mid+1);
            if(miss>=k) r=mid-1;
            else l=mid+1;
        }
        if(r<0) return k;
        return arr[r]+(k-calc(arr[r],r+1));
    }
}