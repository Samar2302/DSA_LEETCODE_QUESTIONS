class Solution {
    public int numFactoredBinaryTrees(int[] arr) {
        Arrays.sort(arr);
        HashMap<Integer,Long> map=new HashMap<>();
        long ans=1;
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],ans);
        }
        for(int i=1;i<arr.length;i++){
            long sum=1;
            for(int j=0;j<i;j++){
                if(arr[i]%arr[j]==0 && map.containsKey(arr[i]/arr[j])){
                    sum+=(map.get(arr[i]/arr[j])*map.get(arr[j]));
                }
            }
            ans+=sum;
            map.put(arr[i],sum);
        }
        return (int)(ans%(1000000007));
    }
}