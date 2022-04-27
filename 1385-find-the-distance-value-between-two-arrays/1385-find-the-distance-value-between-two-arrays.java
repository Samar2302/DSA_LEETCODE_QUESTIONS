class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int ans=0;
        for(int i=0;i<arr1.length;i++){
            int l=0,r=arr2.length-1,fl=0;
            while(l<=r){
                int mid=(l+r)/2;
                if(arr2[mid]<=arr1[i]+d && arr2[mid]>=arr1[i]-d){ fl++;break;}
                else if(arr2[mid]<arr1[i]+d) l=mid+1;
                else r=mid-1;
            }
            if(fl==0) ans++;
        }
        return ans;
    }
}