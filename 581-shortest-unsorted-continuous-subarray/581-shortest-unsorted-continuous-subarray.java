class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] aux=Arrays.copyOfRange(nums,0,nums.length);
        Arrays.sort(aux);
        int max=0,len=Integer.MIN_VALUE,st=0,en=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=aux[i]){
                if(st>en){
                    st=i;en=i;
                }else en=i;
            }
        }
        return en-st+1;
    }
}