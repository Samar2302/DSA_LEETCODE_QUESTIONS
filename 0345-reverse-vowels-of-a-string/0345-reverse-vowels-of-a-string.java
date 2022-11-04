class Solution {
    boolean isConst(char ch){
        if(ch=='a'||ch=='e'||ch=='i'|| ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') return true;
        return false;
    }
    void swap(char[] arr,int i,int j){
        char ch=arr[i];
        arr[i]=arr[j];
        arr[j]=ch;
    }
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        int l=0,r=arr.length-1;
        while(l<r){
            while(!isConst(arr[l]) && l<r) l++;
            while(!isConst(arr[r]) && l<r) r--;
            if(l>=r) break;
            swap(arr,l,r);
            l++;r--;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}