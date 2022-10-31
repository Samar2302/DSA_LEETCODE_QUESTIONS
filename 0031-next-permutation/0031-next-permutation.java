class Solution {
    public void swap(int[] arr,int i,int j){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
    public void nextPermutation(int[] nums) {
        int i=nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1]) i--;
        if(i>=0){
            int j=nums.length-1;
            while(nums[i]>=nums[j]) j--;
            swap(nums,i,j);
        }
        int idx=i+1,j=nums.length-1;
        while(idx<j){
            swap(nums,idx++,j--);
        }
        
    }
}