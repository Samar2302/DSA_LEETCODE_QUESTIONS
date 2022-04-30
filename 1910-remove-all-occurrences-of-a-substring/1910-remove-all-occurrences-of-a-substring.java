class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb=new StringBuilder(s);
        int i=0;
        while(i<s.length()){
            int j=0,t=i;
            while(t<s.length() && j<part.length() && s.charAt(t)==part.charAt(j)){
                t++;j++;
            }
            if(j==part.length()){ i=0;s=s.substring(0,t-part.length())+s.substring(t);}
            else i++;
        }
        return s;
    }
}