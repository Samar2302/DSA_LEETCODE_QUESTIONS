// { Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	 
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine()); 

        while(t-- > 0){
            int size = Integer.parseInt(br.readLine());
            String[] arrStr = ((String)br.readLine()).split("\\s+");
            int[] arr= new int[size];
            for(int i = 0;i<size;i++){
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            System.out.println(new Solution().minJumps(arr));
        }
	 }
	 
}
// } Driver Code Ends


class Solution{
    static int findMax(int[] arr,int beg,int end){
        int max=beg;
        for(int i=beg+1;i<=end;i++){
            if(arr[max]+max<arr[i]+i) max=i;
        }
        return max;
    }
    static int minJumps(int[] arr){
        if(arr.length==1) return arr[0];
        int ans=0,i=0;
        for(;i<arr.length;){
            if(arr[i]==0) break;
            if(arr[i]+i>=arr.length-1) {
                ans++;
                return ans;
            }
            int max=findMax(arr,i+1,arr[i]+i);
            i=max;
            ans++;
        }
        return -1;
    }
}