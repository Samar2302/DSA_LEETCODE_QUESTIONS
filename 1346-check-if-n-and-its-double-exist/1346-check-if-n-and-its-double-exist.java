class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int l=0,r=arr.length-1;
            while(l<=r){
                int mid=l+(r-l)/2;
                if(2*arr[i]==arr[mid] && mid!=i) return true;
                else if(2*arr[i]<arr[mid]) r=mid-1;
                else l=mid+1;
            }
        }
        return false;
    }
}