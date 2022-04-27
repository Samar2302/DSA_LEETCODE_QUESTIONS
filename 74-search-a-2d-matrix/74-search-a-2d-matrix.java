class Solution {
    public boolean binarySearch(int[] arr,int tar,int l,int r){
        if(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==tar){return true;}
            else if(arr[mid]>tar) return binarySearch(arr,tar,l,mid-1);
            else return binarySearch(arr,tar,mid+1,r);
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            if(binarySearch(matrix[i],target,0,matrix[i].length-1)==true) return true;
        }
        return false;
    }
}