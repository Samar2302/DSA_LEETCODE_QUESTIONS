class Solution {
    public void sortColors(int[] nums) {
        int z=0,t=0,o=0;
        for(int x:nums){
            if(x==0) z++;
            if(x==1) o++;
            if(x==2) t++;
        }
        for(int i=0;i<z;i++) nums[i]=0;
        for(int i=z;i<o+z;i++) nums[i]=1;
        for(int i=o+z;i<o+t+z;i++) nums[i]=2;
    }
}