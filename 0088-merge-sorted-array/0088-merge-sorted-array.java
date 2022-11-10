class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
         int i=0,j=0;
        while(i<m && j<n){
            if(nums1[i]>nums2[j]){
                int t=nums1[i];
                nums1[i]=nums2[j];
                nums2[j]=t;
                Arrays.sort(nums2);
                i++;
            }else{
                i++;
            }
        }
        j=0;
        while(i<nums1.length && j<n){
            nums1[i]=nums2[j];
            i++;j++;
        }
    }
}