class Solution {
    public char nextGreatestLetter(char[] arr, char tar) {
        char ans='@';
        int l=0,r=arr.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]<=tar) l=mid+1;
            else{
                ans=arr[mid];
                r=mid-1;
            }
        }
        return ans=='@'?arr[0]:ans;
    }
}