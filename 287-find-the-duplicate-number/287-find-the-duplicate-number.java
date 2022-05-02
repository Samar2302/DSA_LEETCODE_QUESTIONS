class Solution {
    public int findDuplicate(int[] nums) {
        int sl=nums[0],fa=nums[nums[0]];
        while(sl!=fa){
            sl=nums[sl];
            fa=nums[nums[fa]];
        }
        sl=0;
        while(sl!=fa){
            sl=nums[sl];
            fa=nums[fa];
        }
        return sl;
    }
}