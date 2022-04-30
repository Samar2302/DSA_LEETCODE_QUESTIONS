class Solution {
    public int findMin(int[] nums) {
        int ans=Integer.MAX_VALUE;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]<nums[i-1] && nums[i]<nums[i+1]){
                ans=nums[i];
                break;
            }
        }
        return ans==Integer.MAX_VALUE?nums[0]<nums[nums.length-1]?nums[0]:nums[nums.length-1]:ans;
    }
}