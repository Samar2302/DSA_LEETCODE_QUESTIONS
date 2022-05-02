class Solution {
    public void swap(int[] arr,int i,int j){
        int x=arr[i];
        arr[i]=arr[j];
        arr[j]=x;
    }
    public int[] sortArrayByParity(int[] nums) {
        if(nums.length==1) return nums;
        int o=nums.length-1,e=0;
        while(e<o){
            if(nums[e]%2!=0 && nums[o]%2==0){
                swap(nums,o,e);
                o--;e++;
            }else if(nums[e]%2==0) e++;
            else o--;
        }
        return nums;
    }
}